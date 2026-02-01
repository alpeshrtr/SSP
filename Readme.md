# Scholarship Management System (Java, File-Based)

A console-based Scholarship Management System built in Java that simulates real-world backend workflows such as **One Time Registration (OTR)**, **user registration**, **bank account linking**, and **fund allocation**, using a structured file-based storage approach.

This project focuses on **system design, data integrity, and clean separation of responsibilities**, rather than UI.

---

## 🚀 Features

- One Time Registration (OTR) generation and validation
- Unique Registration Number generation
- Structured file-based data persistence
- Bank account details storage and verification
- Secure linking of registration to bank account
- Fund allocation and transaction tracking
---

## 🧠 Design Philosophy

This project intentionally avoids databases to strengthen understanding of:

- Data modeling
- Identity vs transactions
- Immutable records (transactions)
- File-system based persistence
- Read → Modify → Write lifecycle
- Separation of concerns

The architecture mirrors how real backend systems are designed, making future migration to databases straightforward.

---

## 📂 Project Structure
PS C:\Projects\SSP> Tree /F
Folder PATH listing for volume Windows-SSD
Volume serial number is 1AEE-2527
C:.
│   Readme.md
│   
├───Data
│   ├───BankDetails
│   ├───OTR
│   │       ALP2020468.txt
│   │       
│   └───Registrations
│            2026629650468.txt
│
└───src
        BankDetails.java
        Home.java
        Input.java
        Main.java
        OTR.java
        OTRValidation.java
        Registration.java
        SaveData.java
        SaveRegistration.java
        Student.java
        UserBankDetailInput.java

PS C:\Projects\SSP> 