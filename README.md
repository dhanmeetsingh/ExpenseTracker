## Expense Tracker Web Application
A simple expense tracking application built with Angular 9 and Spring Boot that connects to a MySQL database. The application allows users to track their expenses, add new expenses, update existing ones, filter expenses by name and amount, and delete expenses.

Features
Register and login functionality
List of expenses
Add a new expense
Update an existing expense
Delete an expense
Filter expenses by name and amount
Technologies Used
The following technologies were used to build this application:

Angular 9
Spring Boot
MySQL
HTML5 and CSS3
Requirements
To run this application on your local machine, you will need the following:

Java - 1.8.x
Maven - 3.x.x
MySQL - 5.x.x
Angular - 9.x.x
Node - 12.x.x
Npm - 6.x.x
Getting Started
To get started with this application, follow these steps:

Clone the repository to your local machine:
bash
Copy code
git clone https://github.com/<your_username>/ExpenseTracker.git
Create a MySQL database:
lua
Copy code
create database expensetracker
Change the MySQL username and password to match your installation:

Open src/main/resources/application.properties
Change spring.datasource.username and spring.datasource.password as per your MySQL installation
Build and run the application using Maven (expensetracker):

```mvn package```

java -jar target/expensetracker-v1.jar
Alternatively, you can run the application without packaging it using:


```mvn spring-boot:run```
Install Node modules for the Angular application (expense-tracker-frontend):

```npm install```
Run the Angular application:

```ng serve```
Alternatively, you can run the below command to open the application in the default web browser:

```ng serve --open```
The application will start running at http://localhost:8080.

REST APIs
The application defines the following CRUD APIs:

GET /api/v1/expenses
POST /api/v1/expenses
GET /api/v1/expenses/{expenseId}
DELETE /api/v1/expenses/{expenseId}
You can test these APIs using Postman or any other REST client.

## Conclusion
This expense tracker application is a simple yet powerful tool to help you manage your finances. Whether you want to keep track of your daily expenses or monitor your spending habits, this application can help you stay on top of your finances.

![Login](https://user-images.githubusercontent.com/42151190/233075115-e8d74553-1af3-47d2-b26d-afc441949a5f.png)

![MainPage](https://user-images.githubusercontent.com/42151190/233074223-c33d4d04-1304-4ccc-a07b-6a0401ffa548.png)

![Add Expense](https://user-images.githubusercontent.com/42151190/233074230-fae9cfc0-a8f5-4fc4-9ec2-d5324ab7b300.png)

![UpdateExpene](https://user-images.githubusercontent.com/42151190/233074954-e08fd18d-427c-4ba8-a26f-f23189fb095f.png)
