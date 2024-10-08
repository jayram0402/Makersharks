# Makersharks Manufacturer Search API

This is a RESTful API built with Spring Boot that allows buyers to search for manufacturers based on customized requirements such as location, nature of business, and manufacturing processes. The API supports pagination, input validation, and is structured for easy extension with additional features like security.

## Table of Contents

- [Requirements](#requirements)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Future Improvements](#future-improvements)

## Requirements

- Java 17 or higher
- Maven
- Git

## Project Structure

```plaintext
makersharks
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── makersharks
│   │   │               ├── Supplier.java
│   │   │               ├── SupplierRepository.java
│   │   │               ├── SupplierService.java
│   │   │               ├── SupplierServiceImpl.java
│   │   │               ├── SupplierQueryDTO.java
│   │   │               ├── SupplierController.java
│   │   │               └── MakersharksApplication.java
│   │   └── resources
│   │       └── application.properties
└── pom.xml'''

## Setup Instructions

# Clone the Repository:

Clone the project repository to your local machine using the following command:

[git clone https://github.com/jayram0402/makersharks.git]
[cd makersharks]

## Build the Project:

# Ensure you have Maven installed on your system. Use the following command to build the project:

# bash
mvn clean install

## Run the Application:

You can run the application either through Maven or directly from your IDE.

## Using Maven:

Run the following command to start the application:

# bash
mvn spring-boot:run

## Using an IDE:

Open the project in your IDE and run the MakersharksApplication.java class.

## Running the Application

After starting the application, the API will be available at http://localhost:8080.

** H2 Database Console: Access the H2 in-memory database console at http://localhost:8080/h2-console
(JDBC URL: jdbc:h2:mem:testdb, username: jayram, password: jayram0402).

## API Endpoints
1. Search Suppliers
Endpoint: /api/supplier/query
Method: POST
Description: Retrieve a list of manufacturers based on location, nature of business, and manufacturing processes.

## Request Body Example:

# json
{
  "location": "India",
  "natureOfBusiness": "small_scale",
  "manufacturingProcess": "3d_printing"
}

## CURL Example:

bash
curl -X POST http://localhost:8080/api/supplier/query \
-H "Content-Type: application/json" \
-d '{"location": "India", "natureOfBusiness": "small_scale", "manufacturingProcess": "3d_printing"}'

## Response Example:

# json
{
  "content": [
    {
      "supplierId": 1,
      "companyName": "ABC Manufacturing",
      "website": "http://abc.com",
      "location": "India",
      "natureOfBusiness": "small_scale",
      "manufacturingProcesses": [
        "3d_printing"
      ]
    }
  ],
  "pageable": {
    "sort": {
      "sorted": false,
      "unsorted": true,
      "empty": true
    },
    "offset": 0,
    "pageNumber": 0,
    "pageSize": 10,
    "unpaged": false,
    "paged": true
  },
  "last": true,
  "totalElements": 1,
  "totalPages": 1,
  "size": 10,
  "number": 0,
  "sort": {
    "sorted": false,
    "unsorted": true,
    "empty": true
  },
  "first": true,
  "numberOfElements": 1,
  "empty": false
}

##Testing
You can test the API using tools like Postman or by using CURL commands as provided above. The project also includes a basic unit test setup (if implemented) for the service layer.

## Future Improvements
Security: Implement security best practices to protect sensitive data and prevent vulnerabilities.
Extended Validation: Add more detailed validation for inputs.
Additional Features: Support for more complex queries and filters.
Improved Documentation: Generate and include Swagger documentation.

