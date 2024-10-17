### Springboot-Sonarcloud-Demo
#### App Functionality
1. When user hits `http://localhost:8080/message` this application returns "Hello World" message.

##### Steps to run the application

1. Run the springboot application through GUI or commnad :- `./mvnw spring-boot:run`
2. Check App functionality <br>
   Access the url :- http://localhost:8080/message

##### Steps to setup the application for Sonarcloud code analysis 

1. Login to sonarcloud and create a project 
2. Connect the created project to this github repo by setting up github actions
3. Create a github secret with name "SONAR_TOKEN"
4. Update your pom.xml file with the following properties:
    ```
   <properties>
    <sonar.organization>sambitcodes</sonar.organization>
    <sonar.host.url>https://sonarcloud.io</sonar.host.url>
   </properties>
    ```
5. Create or update .github/workflows/build.yml (refer sonarcloud website)
6. Code quality analysis report will be available upon next push 

![Sonarcloud_Dashboard](/sonarcloud.png) 


