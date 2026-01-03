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

## Project Structure

StudentRecordSystem/
├─ src/
│ ├─ App.java (Main application with menu)
│ ├─ Student.java (Defines Student object)
│ ├─ StudentManager.java (Manages all student operations)
│ ├─ FileHandler.java (Handles saving/loading data to/from file)
│ ├─ Helper.java (Utility functions, banner, formatting)
├─ students.txt (Data file for saving student records)
├─ README.md (Project description)
├─ .gitignore (Optional, ignore compiled files/IDE files)


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
