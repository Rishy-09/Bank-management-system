# 🌟 Bank Management System

## 📋 Table of Contents
- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Resources](#resources)
- [Acknowledgements](#acknowledgements)
- [Documentation](#documentation)
- [Contributing](#contributing)
- [Authors](#authors)

## 📖 Introduction
The Bank Management System is a Java-based project designed to handle various banking operations such as balance enquiry, deposits, withdrawals, fast cash, and more. This project provides a simple and effective way to manage bank accounts and transactions.

## 🛠 Prerequisites
To successfully run and develop the Bank Management System project, ensure you have the following installed:
- **JDK 21**: Java Development Kit version 21. [Download JDK 21](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
- **JCalendar TZ 1.3.3**: A library for handling time zones. [Download JCalendar TZ 1.3.3](https://mvnrepository.com/artifact/com.toedter/jcalendar-tz/1.3.3)
- **MySQL Connector/J 8.0.2**: JDBC driver for MySQL. [Download MySQL Connector/J 8.0.2](https://dev.mysql.com/downloads/connector/j/8.0.html)
- **IntelliJ IDEA** (Recommended): A powerful Integrated Development Environment (IDE) for Java development. [Download IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

## 💻 Installation

### Set Up the Environment

#### Install JDK 21 or AdoptOpenJDK:
- Download and install [JDK 21](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html) or [AdoptOpenJDK](https://adoptopenjdk.net/).

#### Install IntelliJ IDEA or another IDE of your choice:
- Download and install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) or another preferred IDE.

### Configure Database

#### Import the databasefile.txt into your MySQL database:
- Use your MySQL client or command-line tool to import the `databasefile.txt` file into your MySQL database.

#### Update the database connection details in Conn.java to match your setup:
- Open `Conn.java` and modify the database URL, username, and password according to your MySQL setup.

### Add Dependencies

#### Ensure that mysql-connector.jar, jcalendar.jar, and rs2xml.jar are added to your project’s classpath:
- Download the required JAR files.
- Add `mysql-connector.jar` and `jcalendar.jar` to your project's classpath in your IDE.

### Configuration

#### Database Configuration:
- Configure the database URL, username, and password in `Conn.java` to ensure proper connection to your MySQL database.

#### Application Configuration:
- No additional application configuration is required beyond setting up the database connection.

## 📂 Project Structure

The project consists of the following folders and files:

- **hotel.management.system**: Contains all the Java class files for the project.
    - `BalanceEnquiry.java`: Manages the amount you have as balance.
    - `Conn.java`: Helps in connecting to the MySQL connector database.
    - `Deposit.java`: Manages the money you deposit in the account.
    - `Fastcash.java`: Manages the withdrawal of fixed amounts of money immediately.
    - `Login.java`: Manages the login functionality for your account.
    - `Ministatement.java`: Generates the receipt you get after using the ATM.
    - `PinChange.java`: Allows changing the PIN of your account.
    - `SignupOne.java`: Handles the first step of the signup process.
    - `SignupTwo.java`: Handles the second step of the signup process.
    - `SignupThree.java`: Handles the third step of the signup process.
    - `Transactions.java`: Manages all transactions within the account.
    - `Withdrawal.java`: Manages the money withdrawal process.

- **icons**: Contains the .jpg image files used in the project.

## 🚀 Usage

### Starting the Application:
- Open the project in your IDE.
- Run the `Login.java` file to start the application.

### Basic Features:
- **Add Customer**: Navigate to the "Add Customer" section to input new customer details.

### Navigating the Interface:
- **Reception**: Handles check-ins, check-outs, and room management.

## 📦 Resources

The following resources are provided for the Bank Management System project:

- **Icons**: A folder containing JPEG images to be used in the project. [Download Icons](https://drive.google.com/drive/folders/1XgW-Y6Nzg-6-o9T_bsqN5UKSha_wEvs7)
- **Project File**: The main project file detailing the entire project for better understanding. [Download Project File](https://drive.google.com/drive/folders/1XgW-Y6Nzg-6-o9T_bsqN5UKSha_wEvs7)
- **Database File**: Contains the necessary database structure and initial data. [Download Database File](https://drive.google.com/drive/folders/1XgW-Y6Nzg-6-o9T_bsqN5UKSha_wEvs7)
- **JCalendar TZ JAR**: A library for handling time zones. [Download JCalendar TZ JAR](https://drive.google.com/drive/folders/1XgW-Y6Nzg-6-o9T_bsqN5UKSha_wEvs7)
- **MySQL Connector JAR**: JDBC driver for MySQL. [Download MySQL Connector JAR](https://drive.google.com/drive/folders/1XgW-Y6Nzg-6-o9T_bsqN5UKSha_wEvs7)

Ensure you download and include these resources in your project setup for a smooth development experience.

## 🙏 Acknowledgements

I would like to express my gratitude to the creators of the following YouTube playlist, which was instrumental in guiding me through the development of this project:

- [Bank Management System Project Playlist](https://www.youtube.com/watch?v=pMR_48AF-A0&list=PL_6klLfS1WqG8mRCW5a-bIViq1DbzQkp9&index=1&t=0s)

Thank you for providing such comprehensive and helpful tutorials!

## 📑 Documentation

### Set Up the Environment

#### Install JDK 21 or AdoptOpenJDK:
- Download and install [JDK 21](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html) or [AdoptOpenJDK](https://adoptopenjdk.net/).

#### Install IntelliJ IDEA or another IDE of your choice:
- Download and install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) or another preferred IDE.

### Code Structure

- **AddCustomer.java**: Handles customer additions.
- **Conn.java**: Manages database connections.

### Troubleshooting

#### Issue: Unable to connect to the MySQL database.
- **Solution**: Check `Conn.java` for correct database settings and ensure MySQL is running.

#### Issue: JAR files not found.
- **Solution**: Verify that all required JAR files (`mysql-connector.jar`, `jcalendar.jar`, `rs2xml.jar`) are in your classpath.

## 🤝 Contributing

- **Submitting Issues**: Report bugs or request features via [GitHub Issues](https://github.com/Rishy-09/Bank-management-system/issues).

## 👥 Authors

- [@Rishy-09](https://github.com/Rishy-09) - Main developer of the project inspired by [@kunaltyagi9](https://github.com/kunaltyagi9)

Special thanks to the open-source community for their support and inspiration.
