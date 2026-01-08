# Student Record System

## Project Overview

The **Student Record System** is a console-based Java application that allows users to manage student records.  
It supports adding, updating, deleting, searching, and saving/loading student data from a file.

---

## Features

1. Add new students with ID, name, and date of birth  
2. Update student information  
3. Delete student records  
4. Find student by ID  
5. Find student by Name  
6. List all students  
7. Save student records to a file  
8. Load student records from a file  

---

# 🎓 Student Record System (Console Application)

A lightweight Java SE application designed to manage student records efficiently using File I/O for data persistence.

---

## 🏗 Project Structure (Flat Package)

All source files are located directly in the `src` directory for simplicity and fast development.


STUDENT RECORD SYSTEM/
├── src/
│   ├── App.java            # Entry point: Handles Main Menu and User Input
│   ├── Student.java        # Model: Defines Student object (ID, Name, Grade, etc.)
│   ├── StudentManager.java # Service: Core logic for Add, View, and Delete operations
│   ├── FileHandler.java    # Data: Handles saving/loading records to students.txt
│   ├── Helper.java         # Utilities: UI formatting, banners, and input validation
│   └── students.txt        # Database: Text-based storage for student data
├── bin/                    # Compiled .class files
├── README.md               # Project documentation
        


---

## Menu Options in App.java

When you run the application, you will see the following options:

1. Add Students  
2. Update Student  
3. Delete Student  
4. Find Student By ID  
5. Find Student By Name  
6. List All Students  
7. Save To File  
8. Load From File  
9. Exit  

---

## Usage

1. Compile Java classes:

```bash
cd src
javac *.java
