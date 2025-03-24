# Blood Donation Portal

## Overview
The **Blood Donation Portal** is a web-based application designed to connect blood donors with those in need. This platform provides an easy-to-use interface for donors to register, find blood donation camps, and access essential information about blood donation.

## Features
- **Donor Registration:** Users can register as blood donors.
- **Find Blood Donors:** Search for donors based on blood group and location.
- **Blood Donation Facts:** Learn important information about blood donation benefits and processes.
- **Upcoming Blood Camps:** View and register for blood donation events.
- **Secure Authentication:** Implements security configurations for user authentication.

## Tech Stack
- **Backend:** Java (Spring Boot)
- **Frontend:** HTML, CSS, JavaScript (Thymeleaf for templating)
- **Database:** MySQL
- **Security:** Spring Security

## Project Structure
```
BloodDonationPortal/
│── src/
│   ├── main/java/com/blooddonation/blood_donation/
│   │   ├── config/                # Security Configuration
│   │   ├── controller/            # Controllers (Auth, Donor, BloodCamp)
│   │   ├── model/                 # Entity Models (Donor, BloodCamp)
│   │   ├── repository/            # Repository Interfaces (JPA)
│   │   ├── service/               # Business Logic Layer
│   │   ├── BloodDonationApplication.java
│   ├── resources/
│   │   ├── static/                # Static files (CSS, JS, images)
│   │   ├── templates/             # Thymeleaf Templates
│   │   ├── application.properties # Database and application config
│── test/                          # Unit and Integration Tests
│── pom.xml                        # Maven Dependencies
```

## Database Schema
The application uses a MySQL database with tables for:
- **Donors** (id, name, blood group, contact, location, last donation date)
- **Blood Camps** (id, name, location, organizer, contact, date)
- **Users** (for authentication and role-based access control)

## Installation & Setup
### Prerequisites:
- Java 11+
- Maven
- MySQL Server

### Steps:
1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/blood-donation-portal.git
   cd blood-donation-portal
   ```
2. **Configure Database:**
   - Update `src/main/resources/application.properties` with MySQL credentials.
3. **Build and Run the Application:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
4. **Access the Application:**
   Open `http://localhost:8080` in your browser.

## Future Enhancements
- Implement REST API for better scalability.
- Enable email notifications for registered donors.
- Improve UI with modern frontend frameworks.

## License
This project is open-source and available under the MIT License.

## Contributors
- [Yashashree S Bedmutha] - Developer

## Contact
For any issues or suggestions, reach out to **yashashree.bedmutha@gmail.com**.

