# 🚀 **Job Portal Microservices Application**

A **Job Portal** built with **Spring Boot** and **Microservices Architecture** for seamless job management and user registration. This application includes multiple microservices for handling job listings and user management, with future enhancements for authentication and frontend integration.

---

## 📌 **Key Features:**

- **Job Service**: 🎯 Manages job listings (CRUD operations) via a dedicated microservice.
- **User Service**: 👤 Handles user registration and profile retrieval.
- **API Gateway**: 🚪 Routes requests between Job and User services.
- **Simple User Authentication**: 🔑 User registration functionality, JWT authentication planned for future.
- **H2 Database**: 💾 In-memory database for rapid development and testing.

---

## 🛠️ **Technologies Used:**

- **Backend**:
  - 💻 **Spring Boot** - Core framework for building microservices
  - 🌐 **Spring Cloud Gateway** - Routes API calls between services
  - 🗄️ **Spring Data JPA** - For database interaction and persistence
  - 🗃️ **H2 Database** - In-memory database used for testing and development

- **API**:
  - 📡 **REST APIs** - Communicate between services and the frontend

---

## 🏗️ **Architecture Overview:**
                    +---------------------+
                    |    **API Gateway**   |
                    +---------------------+
                            |  
        +-------------------+-------------------+
        |                                       |


---

## 🌟 **How It Works:**

1. **Job Service**:
   - Manages job listings (Create, Read, Update, Delete)
   - Users can view all available jobs and apply for positions.
   
2. **User Service**:
   - Handles user registration and allows users to manage their profiles.
   - Future plans for adding JWT-based authentication.

3. **API Gateway**:
   - Routes incoming requests to the appropriate service (Job or User).
   - Simplifies interactions between microservices.



## 📌 **Key Features:**

- **Job Service**: 🎯 Manages job listings (CRUD operations) via a dedicated microservice.
- **User Service**: 👤 Handles user registration and profile retrieval.
- **API Gateway**: 🚪 Routes requests between Job and User services.
- **Simple User Authentication**: 🔑 User registration functionality, JWT authentication planned for future.
- **H2 Database**: 💾 In-memory database for rapid development and testing.

---

## 🛠️ **Technologies Used:**

- **Backend**:
  - 💻 **Spring Boot** - Core framework for building microservices
  - 🌐 **Spring Cloud Gateway** - Routes API calls between services
  - 🗄️ **Spring Data JPA** - For database interaction and persistence
  - 🗃️ **H2 Database** - In-memory database used for testing and development

- **API**:
  - 📡 **REST APIs** - Communicate between services and the frontend

---

## 🏗️ **Architecture Overview:**

                    +---------------------+
                    |    **API Gateway**   |
                    +---------------------+
                            |  
        +-------------------+-------------------+
        |                                       |
+-------------------+ +-------------------+ | Job Service | | User Service | +-------------------+ +-------------------+ | +--------------------+ | Database | +--------------------+


---

## 🌟 **How It Works:**

1. **Job Service**:
   - Manages job listings (Create, Read, Update, Delete)
   - Users can view all available jobs and apply for positions.
   
2. **User Service**:
   - Handles user registration and allows users to manage their profiles.
   - Future plans for adding JWT-based authentication.

3. **API Gateway**:
   - Routes incoming requests to the appropriate service (Job or User).
   - Simplifies interactions between microservices.


📝 API Endpoints:

Job Service API:
GET /api/jobs: Retrieve all jobs
POST /api/jobs: Create a new job listing
User Service API:
POST /api/users/register: Register a new user
GET /api/users/{username}: Get user details by username
Access via API Gateway:
GET /api/jobs: Access Job Service via Gateway
POST /api/users/register: Register a user via Gateway


🔜 Future Improvements:

JWT Authentication: 🔒 Add security for user authentication.
Frontend Integration: 🌍 Build a user-friendly interface with React/Angular.
Advanced Features: 📑 Job applications, notifications, resume uploads.
Cloud Deployment: ☁️ Deploy services to the cloud for scalability.


