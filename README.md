

# 📌 Monthly Challenges - Full Stack Web Application  

## 🚀 Overview  
The **Monthly Challenges App** is a full-stack web application that allows users to add, view, update, and delete monthly challenges. Built using **React** for the frontend and **Spring Boot** for the backend, the project follows a modern microservices approach with **RESTful APIs** and database integration.

This project is designed to enhance CRUD (Create, Read, Update, Delete) operations while demonstrating a clean and scalable architecture.

Built using React (frontend) and Spring Boot (backend), with a PostgreSQL database. The project follows a RESTful API architecture and has been tested on AWS using S3 (frontend hosting), Elastic Beanstalk (backend), and RDS (PostgreSQL database). 🚀

---

## 🛠️ Tech Stack  

### 🧑‍💻 Backend (Spring Boot)  
- **Spring Boot 3.4.3** - For building the RESTful API.  
- **Spring Data JPA** - For database interactions.  
- **H2 Database** - Used for local development (can be switched to PostgreSQL).  
- **Maven** - For dependency management and build automation.  
- **Lombok** - Reduces boilerplate code.
- **Tested on AWS Elastic Beanstalk**

### 🌐 Frontend (React.js)  
- **React 18** - For building the interactive UI.  
- **Axios** - For making API requests.  
- **Bootstrap 5** - For styling and responsiveness.
- **Tested on AWS S3**
---

## 🎯 Features  
✅ Users can **add new challenges** with a month and description.  
✅ **Fetch and display** challenges in a clean UI.  
✅ **Edit and update** existing challenges and **Delete challenges** if no longer needed.  
✅ **RESTful APIs** for communication between frontend and backend.
✅ **Database Management** with PostgreSQL and **State management** with React hooks (`useState`, `useEffect`).   

---

## 📂 Project Structure  

```
MonthlyChallenges/
|
│── backend/ (Spring Boot App)
│   ├── src/main/java/com/cw/ChallengeApplication/
│   │   ├── controllers/  # API Controllers
│   │   ├── services/  # Business Logic
│   │   ├── models/  # Entity Models
│   │   ├── repositories/  # Database Interactions
│   │   ├── ChallengeApplication.java  # Main Application
│   ├── src/main/resources/application.properties
│   ├── pom.xml
|
│── frontend/ (React App)
│   ├── src/
│   │   ├── components/
│   │   │   ├── AddChallenges.js
│   │   │   ├── ChallengeList.js
│   │   │   ├── Challenge.js
│   │   ├── App.js
│   │   ├── index.js
│   ├── package.json
|
│── README.md
|
│── .gitignore
```

---

## ⚙️ Setup Instructions  

### 💻 Backend Setup (Spring Boot)  

1️⃣ Clone the repository:  
```bash
git clone https://github.com/chinmaywali/MonthlyChallenges_App-FullStack.git
```
2️⃣ Navigate to the backend folder:  
```bash
cd backend
```
3️⃣ Build and run the Spring Boot app:  
```bash
mvn spring-boot:run
```
4️⃣ The backend will be available at:  
```
http://localhost:8080
```

### 🎨 Frontend Setup (React)  

1️⃣ Open another terminal and navigate to the frontend folder:  
```bash
cd frontend
```
2️⃣ Install dependencies:  
```bash
npm install
```
3️⃣ Start the React app:  
```bash
npm start
```
4️⃣ The frontend will be available at:  
```
http://localhost:3000
```

---

## 🔗 API Endpoints  

### 📌 **Challenge API**  

| Method | Endpoint                   | Description                     | Request Body |
|--------|----------------------------|---------------------------------|--------------|
| **GET**    | `/challenges`             | Fetch all challenges            | N/A          |
| **POST**   | `/challenges`             | Add a new challenge             | `{ "month": "January", "description": "Read books" }` |
| **PUT**    | `/challenges/{id}`        | Update a challenge              | `{ "month": "February", "description": "Workout daily" }` |
| **DELETE** | `/challenges/{id}`        | Delete a challenge by ID        | N/A          |

**Example JSON Request for POST & PUT:**  
```json
{
  "month": "March",
  "description": "Learn a new programming language"
}
```
---

## 🤝 Contributing  
Contributions are welcome! Feel free to fork this repo and submit a pull request.  
 
