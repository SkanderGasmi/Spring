# Secure Quiz Application – Spring Boot

![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?logo=springboot&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?logo=thymeleaf&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?logo=springsecurity&logoColor=white)

---

## Table of Contents

- [Overview](#overview)  
- [Learning Objectives](#learning-objectives)  
- [Project Description](#project-description)  
- [Features](#features)  
- [Application Structure](#application-structure)  
- [Tech Stack](#tech-stack)  
- [Setup Instructions](#setup-instructions)  
- [Security Configuration](#security-configuration)  
- [Why I Built This](#why-i-built-this)  
- [Future Improvements](#future-improvements)  
- [License](#license)

---

## Overview

This project is a **secure Quiz Web Application** built using **Spring Boot, Spring MVC, Thymeleaf, and Spring Security**.  
It demonstrates how to create a structured, secure, and functional web application with in-memory management of users and questions.

---

## Learning Objectives

Through this project, I was able to:

- Build Spring Boot applications using **Spring Initializr**  
- Create **Maven-based** Spring projects from scratch  
- Apply essential **Spring annotations**  
- Design **controllers, models, getters, and setters**  
- Implement **logging with SLF4J**  
- Build **Spring MVC forms** using Thymeleaf  
- Secure endpoints using **Spring Security**  

---

## Project Description

The application allows authenticated users to access a **quiz interface** where questions are served from an in-memory data structure.  

It follows a **layered architecture** with clear separation between:

- Models  
- Services  
- Controllers  
- Security configuration  

Endpoints are protected using **role-based authentication and authorization**.

---

## Features

- Spring Boot MVC application  
- REST-style controllers with mapped endpoints  
- Thymeleaf-based UI templates  
- In-memory user and question management  
- Role-based access control using Spring Security  
- Logging with SLF4J  
- Runnable JAR packaging  

---

## Application Structure

```

src/main/java/com/example/quiz
│
├── controller
│   └── QuizController.java
│
├── model
│   ├── User.java
│   └── Question.java
│
├── service
│   ├── QuizUserDetailsService.java
│   └── QuestionsService.java
│
├── config
│   └── WebSecurityConfig.java
│
└── QuizApplication.java

```
```

src/main/resources
├── templates
│   ├── login.html
│   ├── quiz.html
│   └── result.html
└── application.properties

````

---

## Tech Stack

- **Java**  
- **Spring Boot**  
- **Spring MVC**  
- **Spring Security**  
- **Thymeleaf**  
- **Maven**  
- **SLF4J**  

---

## Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/SkanderGasmi/spring-quiz-application.git
cd spring-quiz-application
````

### 2. Build the project

```bash
mvn clean package
```

### 3. Run the application

```bash
java -jar target/quiz-application.jar
```

### 4. Access the application

```text
http://localhost:8080
```

---

## Security Configuration

* Authentication is handled using **Spring Security**
* User credentials and roles are stored **in memory**
* Endpoints are protected based on user roles
* Custom login page implemented with Thymeleaf

---

## Why I Built This

I built this project to **apply Spring Framework concepts in a complete, functional application**.

It demonstrates my understanding of:

* Spring MVC request handling
* Application layering
* Security configuration
* Template-based UI rendering
* Building and packaging runnable Spring Boot applications

This project reflects **core Spring concepts used in real-world Java web applications**.

---

## Future Improvements

* Persist users and questions using a database (JPA/Hibernate)
* Add quiz scoring and history tracking
* Improve UI styling
* Add unit and integration tests
* Implement JWT-based authentication

---

```
