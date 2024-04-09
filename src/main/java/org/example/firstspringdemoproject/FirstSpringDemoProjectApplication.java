package org.example.firstspringdemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringDemoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringDemoProjectApplication.class, args);

        MySQLDB mySQLDB = new MySQLDB();
        mySQLDB.greet();

        MongoDB mongoDB = new MongoDB();
        mongoDB.greet();

        Company company = new Company(mySQLDB);
        company.dbUsing();
    }

}
