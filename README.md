# Spring Boot DTO Mapping Lite 🚀

A **lightweight starter kit for clean DTO and Entity mapping** in **Spring Boot**.  
This version is focused on demonstrating **different mapping strategies** for converting between **Entities** and **DTOs**, using:

- ✅ **MapStruct** for `Product` mapping (automatic code generation)
- ✅ **Manual mapping with Utility Class** for `Category` mapping (full control without extra dependencies)

Perfect for developers who want to understand when to use an automatic mapper versus a manual approach.

---

## ✨ Features

- ✅ Layered architecture: **Controller → Service → Repository**
- ✅ DTO pattern for cleaner APIs
- ✅ **Two mapping strategies:**
  - **Product** → uses **MapStruct** (`ProductMapper`)
  - **Category** → uses **manual mapping utility** (`CategoryMapper`)
- ✅ RESTful CRUD endpoints for **Products** and **Categories**
- ✅ Interactive API documentation with **Swagger/OpenAPI**
- ✅ In-memory **H2 database** for quick testing

---

## ⚠️ Important Note on Best Practices

This **Lite version** is for educational purposes.  
It focuses on **mapping strategies** and minimal clean architecture.  

For production-ready solutions with:
- ✅ Advanced DTO mapping patterns
- ✅ Layered validation
- ✅ Centralized error handling & response wrappers
- ✅ JWT authentication & authorization

👉 Check out:
- 🔗 My detailed article on **[Dev.to](https://dev.to/gianfcop)**
- 💼 The **Pro Starter Kit on Gumroad**:
  - DTOs & MapStruct mappers for all entities
  - JWT Security
  - Advanced error handling
  - Logging, Profiles, Tests
  - [👉 Get it on Gumroad](https://gianfcop.gumroad.com/)

---

## ⚙️ Requirements

- **Java** 17+
- **Maven** 3.8+
- IDE: IntelliJ IDEA or VS Code

---

## 🚀 Quick Start

1. Clone the repo:
   ```bash
   git clone https://github.com/gianfcop/springboot-dto-mapping-lite.git
   ```
2. Run the application:
   ```bash
   mvn spring-boot:run
   ```
3. Open Swagger UI:
   ```
   http://localhost:8080/swagger-ui/index.html
   ```

## 🏗️ Project Structure
   ```
      src/main/java/com/starterkit/api
   ├── config/          → Swagger configuration
   ├── controller/      → REST Controllers
   ├── dto/             → DTO classes (ProductRequest, ProductResponse, etc.)
   ├── entity/          → JPA Entities (Product, Category)
   ├── mapper/          → Mappers
   │   ├── ProductMapper.java       (MapStruct)
   │   └── CategoryMapperUtil.java  (Manual)
   ├── repository/      → Spring Data JPA Repositories
   ├── service/         → Business logic
   └── SpringBootDtoMappingDemoApplication.java
   ```

## 📑 API Documentation

Interactive Swagger UI available at:
   ```
   http://localhost:8080/swagger-ui/index.html
   ```

Endpoints included:
- POST /api/products → Create a product
- GET /api/products → Get all products
- PUT /api/products/{id} → Update product
- DELETE /api/products/{id} → Delete product
- POST /api/categories → Create category
- GET /api/categories → Get all categories

## 🧪 Testing

This version is minimal and does not include automated tests, but you can easily test the API using Swagger UI or tools like Postman.

## ✅ Want More Features?

Check out **Full Pro Starter Kit** (available on [Gumroad](https://gianfcop.gumroad.com/)) with:
- JWT Security
- DTOs and Mappers
- Error Handling and Response Wrappers
- Logging, Profiles, and CI/CD ready structure
- Test Suite (MockMvc, Validation)
- Available on Gumroad

Also read the full tutorials on [Dev.to](https://dev.to/gianfcop).


## 📜 License

This project is licensed for educational and personal use only.
Do not redistribute or resell.