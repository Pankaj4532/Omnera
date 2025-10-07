# Omnera Blog App

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.0-green)](https://spring.io/projects/spring-boot)
[![H2 Database](https://img.shields.io/badge/H2-Database-blue)](https://www.h2database.com/html/main.html)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1.1-orange)](https://www.thymeleaf.org/)
[![Bootstrap](https://img.shields.io/badge/Bootstrap-5.3-purple)](https://getbootstrap.com/)
[![CKEditor](https://img.shields.io/badge/CKEditor-5-red)](https://ckeditor.com/)

Omnera is a full-stack blog application built with **Java Spring Boot** and **Thymeleaf**, featuring role-based access control, user authentication, and a responsive UI.

---

## Features

### User
- Register, login, and logout
- Reset and change password
- Update profile and profile photo
- Add, edit, and delete posts
- View posts with pagination and sorting

### Admin
- Access admin panel
- Manage all users and posts

### Editor
- Access editor panel
- Edit and manage posts

---

## Tech Stack
- **Backend:** Java, Spring Boot, Spring Security, Spring Data JPA  
- **Frontend:** Thymeleaf, Bootstrap 5, jQuery  
- **Database:** H2 (local development)  
- **Email:** Gmail SMTP  
- **Other:** CKEditor 5 for rich text editing

---

## File Uploads
- Profile photos and post images stored in `/static/uploads`
- Fonts, images, and JS stored in `/static` folder

---

## UI Pages
- **Home Page:** Lists all posts with pagination  
- **Login & Register:** User authentication  
- **Forgot Password / Change Password:** Email-based password reset  
- **Profile:** Update account details and upload photo  
- **Add/Edit Post:** Create or modify posts  
- **Admin & Editor Pages:** Role-based content management  
- **404 Page:** Displayed when page not found

---

## Author
**Pankaj Sapkal**  
- Email: sapkal.pankaj@gmail.com  
- GitHub: [https://github.com/psapkal474](https://github.com/psapkal474)  

---

## License
MIT License