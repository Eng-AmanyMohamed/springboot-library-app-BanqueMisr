# 📚 Personal Library Service – Spring Boot Project
This is a project about Spring Boot Personal Library Service that lets users catalog, browse, and manage their favorite books. You’ll start with “Hello Spring Boot,” then layer in dependency injection, profiles/configuration, component scanning, and advanced DI.

# ⚙️ Technologies Used
- Java 17+
- Spring Boot
- Spring Web
- Maven
- IntelliJ Idea

# 🛠️ How to Set Up

1- Clone the repository.

2- open git bash.

3- git clone https://github.com/Eng-AmanyMohamed/springboot-library-app-BanqueMisr.git.

4- Open in IntelliJ.

5- Choose File > New > Project from Existing Sources.

6- Select the cloned folder and choose "Maven" as the import type.

7- Run the application.

# ✅ Implemention

## 1. Core Setup & Anatomy

- Spring Boot initialized with Web and JPA dependencies

- @SpringBootApplication main class created

- /health endpoint returning "OK"

 --- 
 
## 2. Dependency Injection

- GreetingService interface with two implementations: MorningGreetingService and EveningGreetingService

- Demonstrated:

  -  Constructor Injection

  -  Setter Injection

  -  Field Injection

  ---
  

## 3. Configuration & Profiles

- Externalized values:

  - library.name

  - library.mode

- Profiles:

- application.properties (default)

   - application-dev.yml

   - application-prod.yml

- Bound config to LibraryConfig class using @ConfigurationProperties

- Profile switching via spring.profiles.active

  ---
  

## 4. Component Scanning & Stereotypes

- Package structure under com.yourorg.library

- Custom @ComponentScan with include/exclude filters

- Verified exclusion via integration tests

---
## 5. Advanced Dependency Injection

- Two implementations of NotificationService:

    - EmailNotificationService (@Primary)

    - SmsNotificationService (@Qualifier("sms"))

- Both injected into NotificationController

- Exposed endpoints:

  - /notify/email

  - /notify/sms
  
---

## ⚙️ Configuration Files

application.properties
```bash
library.name=default library
library.mode=default

spring.profiles.active=dev
```
application-dev.yml
```
library:
  name: dev Library
  mode: development
```
application-prod.yml
```
library:
   name: prod library
  mode: production
```
## Team Members
This project was a collaborative effort with an outstanding team:
- Amany Mohamed
- Mohamed Mostafa
- Youssef Ahmed
- Mariam Ayman
- Touka Mohamed
- Leena Hesham
- Esraa Tarek
- Ayten Aaser


