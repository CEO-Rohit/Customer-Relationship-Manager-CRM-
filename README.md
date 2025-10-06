# 🏢 Customer Relationship Management (CRM) Web Application

A fully functional **Spring Boot CRM Web Application** built using **Spring Boot 3.x**, **Thymeleaf**, **Spring MVC**, **SpringData JPA**, **Bootstrap 5**, and **MySQL Database**.  
This project allows users to **add, view, update, and delete customer records** through a clean, responsive web interface.

---

## Features

✅ Add new customers  
✅ Update existing customers  
✅ Delete customers with confirmation  
✅ View all customers in a tabular format  
✅ Modern, responsive UI using Bootstrap 5  
✅ Professional light-blue theme via custom CSS  
✅ Follows MVC architecture and Spring Boot conventions  

---

## Technologies & Tools Used

| Layer | Technology / Library |
|-------|----------------------|
| **Backend** | Spring Boot 3.x, Spring MVC | SpringData JPA
| **Frontend** | Thymeleaf, Bootstrap 5, HTML5, CSS3 |
| **Database** | MySQL (with Spring Data JPA / Hibernate) |
| **Build Tool** | Maven |
| **IDE Used** | Eclipse |
| **Language** | Java 17+ |
| **Version Control** | Git & GitHub |

---

## 📂 Project Structure
src/
├─ main/
│ ├─ java/com/yourcompany/crm/
│ │ ├─ controller/
│ │ │ └─ CustomerController.java
│ │ ├─ entity/
│ │ │ └─ Customer.java
│ │ ├─ service/
│ │ │ ├─ CustomerService.java
│ │ │ └─ CustomerServiceImpl.java
│ │ ├─ dao/
│ │ │ └─ CustomerRepository.java
│ │ └─ CrmApplication.java
│ │
│ ├─ resources/
│ │ ├─ templates/
│ │ │ ├─ list-customers.html
│ │ │ └─ customer-form.html
│ │ ├─ static/
│ │ │ └─ css/
│ │ │ └─ style.css
│ │ └─ application.properties
│ │
│ └─ test/
│ └─ (Unit Tests)
└─ pom.xml

