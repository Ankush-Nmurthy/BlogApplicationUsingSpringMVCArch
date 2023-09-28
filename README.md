# BLOG APPLICATION

Welcome to the Blogging Platform project! This web application allows users to create, manage, and share their blog posts. It is built using the Spring MVC architecture and includes user authentication, blog post creation, management, and various security measures.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Security](#security)
- [Folder Structure](#folder-structure)

## Features

- **User Authentication:** Users can register, log in, and manage their profiles securely.

- **Blog Post Creation:** Create and publish new blog posts with fields for title, content, category, and access type.

- **Blog Post Management:** Users can view, update, and delete their own blog posts.

- **Security Enhancements:** The application includes security measures such as input validation, secure communication, and password hashing.

## Getting Started

To run the Blogging Platform on your local machine, follow these steps:

1. Clone the repository to your local machine using `git clone`.

2. Set up your development environment with Java and Spring MVC dependencies.

3. Configure the application properties, including the database connection details, in `src/main/resources/application.properties`.

4. Build and run the application using your preferred IDE or Maven commands.

5. Access the application at `http://localhost:8080` in your web browser.

## Usage

- **Registration:** Sign up for a new account by providing your name, email, and password.

- **Login:** Log in with your registered email and password.

- **Create a Blog Post:** Once logged in, you can create new blog posts by providing a title, content, category, and access type.

- **Manage Blog Posts:** View, edit, and delete your blog posts from the dashboard.

- **Security:** The application ensures secure communication (HTTP), password hashing, and input validation to protect user data.

## Security

The Blogging Platform includes the following security measures:

- Passwords are securely hashed before storage.

- Secure communication is established using HTTPS.

For additional security enhancements, consider further measures based on your specific requirements and deployment environment.

## Folder Structure

The project's folder structure is organized as follows:

- `src/main/java`: Contains Java source code and Spring MVC controllers, services, and models.

- `src/main/resources`: Contains application configuration files, templates, and static resources.

- `src/test`: Contains unit and integration tests.

- `pom.xml`: The Maven project configuration file.

server.port = 5050

spring.datasource.driver=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/growgarden
spring.datasource.username= Your Username
spring.datasource.password= Your Password

spring.jpa.hibernate.ddl-auto=update

```
