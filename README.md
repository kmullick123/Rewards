# Rewards

Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the org.springframework.boot.SpringApplication.RewardsApplication class from your IDE.

    clone the Git repository.
    Open Command Prompt and Change directory (cd) to folder containing pom.xml
    Open Eclipse
        File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
        Select the project
    Choose the Spring Boot Application file (search for @SpringBootApplication)
    Right Click on the file and Run as Java Application

Access h2-console -> http://localhost:8080/h2-console and execute the inserts in data.sql file in the resources folder of the application.

NOTE : In case of any port conflict change port in application.properties in resources folder and restart and reexecute the insert queries . 

The backend is up and running .

Use PostMan/ browser to test the API

1. http://localhost:8080/api/rewards/total-rewards

2. http://localhost:8080/api/rewards

Next configure the React UI
