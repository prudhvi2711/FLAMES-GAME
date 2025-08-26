# FLAMES Game   

The **FLAMES Game** is a fun Java-based application that computes relationship compatibility between two individuals based on their names. It implements the classic **FLAMES algorithm** and provides an interactive **Swing-based GUI** for easy use.  

---

## Features  
- **FLAMES Algorithm** → Determines relationship outcomes:  
  - F → Friends  
  - L → Lovers  
  - A → Affectionate  
  - M → Marriage  
  - E → Enemies  
  - S → Siblings  
- **Interactive GUI** → Clean and simple interface built with Java Swing  
- **Input Validation** → Ensures names are non-empty before processing  
- **Modular Design** → Clear separation of logic, validation, and GUI  

---

## 📂 Project Structure  
- **Game.java** → Abstract base class for games  
- **FLAMESGame.java** → Implements the FLAMES logic  
- **RelationshipCalculator.java** → Computes unique character counts between names  
- **Validator.java** → Interface for validation rules  
- **NameValidator.java** → Implements input validation  
- **GUIManager.java** → Manages the Swing GUI and user interactions  
- **Main.java** → Entry point of the program  
