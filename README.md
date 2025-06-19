# 🏡 CasaConnect

**CasaConnect** is a backend application inspired by Airbnb's booking system. It provides RESTful APIs for property listings, bookings, users, and authentication. Built with **Spring Boot**, it’s designed to connect easily with a frontend (React, Angular, etc.) and a relational database like **MySQL** or **PostgreSQL**.

---

## 🚀 Features

- 🔐 User registration & authentication
- 🏘 Property listing management
- 📅 Booking creation and cancellation
- 🧾 Payment simulation (optional/extendable)
- 📡 RESTful API endpoints with JSON responses

---

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL** (or PostgreSQL)
- **Maven**

---

## ⚙️ Getting Started

### 🔧 Prerequisites

Make sure you have the following installed:

- [Java 17+](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- A tool like Postman or a frontend client

---

## 📁 Project Structure

casa-connect/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/casaconnect/...
│ │ └── resources/
│ │ ├── application.properties
│ │ └── ...
├── pom.xml
└── README.md

---

## 🔗 Connecting to Database

Edit the `src/main/resources/application.properties` file:


spring.datasource.url=jdbc:mysql://localhost:3306/casa_connect_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

To create the DB:

sql
Copy
Edit
CREATE DATABASE casa_connect_db;
▶️ Running the Application
Open terminal inside the project folder

Run the app using Maven:

bash
Copy
Edit
mvn spring-boot:run
Once started, backend APIs will be available at:

bash
Copy
Edit
http://localhost:8080/api/...
🖥️ Connecting with Frontend
Any frontend (React, Angular, etc.) can interact with this backend by calling its REST APIs.

Make sure to handle CORS in Spring if you're calling from a different port (e.g., React on 3000):

In your config class:

java
Copy
Edit
@CrossOrigin(origins = "http://localhost:3000")
🧪 API Testing
You can test endpoints using:

Postman

curl

Frontend UI (if connected)

Sample POST to register a user:

json
Copy
Edit
POST /api/users/register
{
  "name": "John Doe",
  "email": "john@example.com",
  "password": "secret123"
}
📦 Building for Production
bash
Copy
Edit
mvn clean install
The JAR file will be in target/ folder:

bash
Copy
Edit
java -jar target/casa-connect-0.0.1-SNAPSHOT.jar
