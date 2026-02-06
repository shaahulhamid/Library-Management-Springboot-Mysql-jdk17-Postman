# 📚 Library Management System - Spring Boot + MySQL

A backend-based **Library Management System** developed using **Spring Boot**, **MySQL**, and **Java JDK 17**.  
This project provides REST APIs for managing library operations such as adding books, issuing books, returning books, and maintaining member records.

The APIs are tested using **Postman**, making it a complete backend project suitable for real-world applications.

---

## 🚀 Features

- 📖 Book Management (Add, Update, Delete, View)
- 👤 Member Management (Register and Manage Library Members)
- 📌 Issue Book to Members
- 🔄 Return Issued Books
- 🔍 Search Books by Title/Author/Category
- 🗄️ MySQL Database Integration
- 📬 RESTful APIs tested with Postman

---

## 🛠️ Tech Stack

| Technology | Used For |
|----------|----------|
| Java 17 | Backend Programming |
| Spring Boot 3 | REST API Development |
| Spring Data JPA (Hibernate) | ORM and Database Access |
| MySQL | Database |
| Maven | Build Tool |
| Postman | API Testing |

---

## 📂 Project Modules (Planned)

- Book Module
- Member Module
- Issue/Return Module
- Transaction History Module

---

## 📌 API Endpoints (Initial Plan)

### Book APIs
- `POST /api/books` → Add a new book  
- `GET /api/books` → Get all books  
- `GET /api/books/{id}` → Get book by ID  
- `PUT /api/books/{id}` → Update book  
- `DELETE /api/books/{id}` → Delete book  

### Member APIs
- `POST /api/members` → Register member  
- `GET /api/members` → Get all members  

### Issue/Return APIs
- `POST /api/issue` → Issue book  
- `POST /api/return` → Return book  

---

## ⚙️ Setup Instructions

### 1️⃣ Clone Repository

```bash
git clone https://github.com/shaahulhamid/Library-Management-Springboot-Mysql-jdk17-Postman.git
