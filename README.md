# Apex-Bank: Core Java Transaction Engine

A simplified banking backend developed to demonstrate **Core Java** fundamentals including Object-Oriented Programming, File Handling, and Concurrency.

## Key Features
- **HashMap Data Management**: Efficient O(1) account retrieval.
- **Persistence**: Manual file handling using FileInputStream and FileOutputStream.
- **Multithreading**: Independent transaction processing via the Thread class.

## How to Run
1. Ensure you have **JDK 8 or higher** installed.
2. Clone the repository: 
   `git clone https://github.com/MdSahil001/apex-bank-java.git`
3. Compile the code:
   `javac *.java`
4. Run the application:
   `java Main`

## Project Structure
- `BankAccount.java`: The data model (Encapsulation).
- `BankEngine.java`: The logic controller (HashMap and File Streams).
- `Main.java`: The interactive console menu.