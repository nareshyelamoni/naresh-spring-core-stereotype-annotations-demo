# Spring Core Stereotype Annotations Demo

## Overview

This project demonstrates the use of Spring Framework stereotype annotations and Java-based configuration. It shows how Spring automatically detects and manages beans using component scanning and annotation-based configuration.

## Features

* Component Scanning
* @Component Annotation
* @Service Annotation
* @Repository Annotation
* @Controller Annotation
* @Configuration Annotation
* @Bean Annotation
* Java-Based Configuration
* Spring IoC Container

## Technologies Used

* Java 25
* Spring Framework
* Maven
* Eclipse IDE

## Annotations Covered

### @Component

Used to mark a class as a Spring-managed bean.

### @Service

Represents the service layer and business logic.

### @Repository

Represents the data access layer.

### @Controller

Represents the presentation/web layer.

### @Configuration

Indicates a configuration class containing bean definitions.

### @Bean

Used to create and register beans programmatically.

## Project Structure

```text
src/main/java
├── com.telusko.main
├── com.telusko.main.service
└── com.telusko.main.controller

src/main/resources
└── applicationconfig.xml
```

## Configuration Example

```xml
<context:component-scan base-package="com.telusko"/>
```

## Learning Outcomes

* Understanding Spring Stereotype Annotations
* Working with Component Scanning
* Creating Beans using @Bean
* Using Java-Based Configuration
* Managing Objects with the Spring IoC Container

## How to Run

1. Clone the repository.
2. Import the project into Eclipse.
3. Update Maven dependencies.
4. Run the main class.
5. Observe Spring bean creation and dependency management.

## Author

Naresh Yelamoni

## Repository Purpose

This project was created as part of Spring Framework learning and demonstrates annotation-based bean configuration and stereotype annotations.

