# 📚 Personal Library Service – Spring Boot Project
This is a project about Spring Boot Personal Library Service that lets users catalog, browse, and manage their favorite books. You’ll start with “Hello Spring Boot,” then layer in dependency injection, profiles/configuration, component scanning, and advanced DI.

# ⚙️ Technologies Used
- Java 17+
- Spring Boot
- Spring Web
- Maven
- IntelliJ Idea

# 🛠️ How to Set Up

1. Clone the repository
1- open git bash
2- git clone https://github.com/Eng-AmanyMohamed/springboot-library-app-BanqueMisr.git
3- Open in IntelliJ
4- Choose File > New > Project from Existing Sources
5- Select the cloned folder and choose "Maven" as the import type
6- Run the application

# 💬Implemention
## 💉 Dependency Injection
Implemented basic and advanced dependency injection using interfaces, @Autowired, @Qualifier, and @Primary. The application supports multiple implementations of services, demonstrating different injection types across controllers.

## ⚙️ Configuration and Profiles
Used application.properties, application-dev.yml, and application-prod.yml to separate environment configurations. A LibraryConfig class was created using @ConfigurationProperties to load config values.

## 🧠 Component Scanning
Component scanning was customized using @ComponentScan filters to control bean registration. Specific packages were included/excluded, and this was verified via integration tests.


