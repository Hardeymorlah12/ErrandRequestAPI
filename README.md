# Errand Request API

A simple REST API built with **Java Spring Boot** that allows users to **create and view errands**. The API uses an **H2 in-memory database** and includes validation, error handling, and a generic response wrapper for consistency.

---

## Technologies Used

- Java 24 
- Spring Boot  
- H2 Database (in-memory)  
- Lombok  
- Spring Validation (`@Valid`, `@NotBlank`)  
- Global Exception Handling (`@RestControllerAdvice`)  
- Postman for API testing  

---

##  Features

- Create a new errand with **title** and **description**  
- Retrieve all errands  
- **Validation**: ensures title is not blank  
- **Duplicate check**: prevents duplicate titles  
- **User-friendly error handling**: all responses follow a consistent `ApiResponse` wrapper  

---

##  API Endpoints

###  Create Errand

- **URL:** `/errands`  
- **Method:** `POST`  
- **Body (JSON):**

```json
{
  "title": "Buy groceries",
  "description": "Milk and bread"

{
  "success": true,
  "message": "Errand created successfully",
  "data": {
    "id": 1,
    "title": "Buy groceries",
    "description": "Milk and bread"
  }
}

Error Responses:

Blank title → 400 Bad Request

Null body → 400 Bad Request

Duplicate title → 400 Bad Request

Get All Errands

URL: /errands

Method: GET

Success Response (200 OK):

{
  "success": true,
  "message": "Errands retrieved successfully",
  "data": [
    {
      "id": 1,
      "title": "Buy groceries",
      "description": "Milk and bread"
    },
    {
      "id": 2,
      "title": "Pick up package",
      "description": "From post office"
    }
  ]
}

How to Run Locally

Clone the repository:

git clone <your-repo-url>


Navigate to the project directory:

cd Errand-Request-API


Build and run the application:

mvn spring-boot:run


Access H2 console (optional, for database inspection):

http://localhost:8080/h2-console


JDBC URL: jdbc:h2:mem:erranddb

Username: sa

Password: leave empty

 Testing with Postman

Create a Postman Workspace named Errand API Internship.

Add a Collection Errand API with requests:

POST /errands → create errands

GET /errands → list errands

All responses follow the ApiResponse wrapper for consistency.

# Notes

H2 is an in-memory database → data resets on application restart

All endpoints are RESTful, use proper HTTP status codes, and return consistent JSON

}

## Testing with Postman

- Postman Workspace: `Errand API Internship`  
- Collection: `Errand API`  
- Import the workspace or use the published docs link to view requests and responses:  
[View Postman Workspace](https://technologies-5361.postman.co/workspace/My-Personal-Workspace~d0a387a8-0142-49ed-9073-50624486a40c/collection/38177792-74d9dd2a-12a1-4fa5-8f88-e8b8d98ad1c2?action=share&creator=38177792&active-environment=38177792-b1dcea9b-e77b-4a5f-b9b2-391610222801)
