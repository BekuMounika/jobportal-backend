# 🚀 AI Job Portal - Backend

Backend REST API for an AI-powered Job Portal built using Spring Boot, MySQL, Docker, and deployed on Render.

## 🌐 Live API

Backend API

https://jobportal-backend-r02c.onrender.com

Frontend Application

https://jobportal-frontend-nfza.vercel.app

## ✨ Features

### User Management

* User Registration
* User Login
* Profile Management

### Job Management

* Create Job
* Update Job
* Delete Job
* View Jobs

### Applications

* Apply for Jobs
* View Applications
* Track Application Status

### AI Integration

* AI Career Assistant Support
* AI Resume Analyzer Support

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* REST APIs
* Docker
* Render Cloud Hosting

## 🗄️ Database

MySQL

Tables:

* users
* jobs
* applications

## 🐳 Docker

Build Docker Image

```bash
docker build -t jobportal-backend .
```

Run Container

```bash
docker run -p 8080:8080 jobportal-backend
```

## 🚀 Local Setup

Configure MySQL in application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/jobportal
spring.datasource.username=root
spring.datasource.password=yourpassword
```

Run Project

```bash
mvn spring-boot:run
```

Runs on:

```text
http://localhost:8080
```

## 🔌 API Modules

* Authentication API
* Jobs API
* Applications API
* Profile API

## 📦 Deployment

* Backend Hosted on Render
* Dockerized Application
* Connected to MySQL Database
* Integrated with React Frontend

## 🔗 Repositories

Frontend Repository

https://github.com/BekuMounika/jobportal-frontend

Backend Repository

https://github.com/BekuMounika/jobportal-backend

## 👩‍💻 Developer

Beku Mounika

Java Full Stack Developer

## 📌 Highlights

* RESTful APIs
* MySQL Integration
* Docker Support
* Cloud Deployment
* Full Stack Architecture
* AI Feature Integration
