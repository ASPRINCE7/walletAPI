# WalletAPI GitHub Certificate Project 

## 📌 Project Overview
This repository demonstrates the implementation of a **Git Flow branching strategy** in a Java-based wallet API application. The project simulates real-world development workflows, including feature development, logging enhancements, and structured branching, aligning with industry best practices.

## 🛠 Branching Strategy
The project utilizes the **Git Flow model**, encompassing the following branches:

- **`master`**: Stable, production-ready branch.
- **`release`**: Integration branch for completed features, ready for deployment.
- **`feature/payment-method`**: Isolated development branch for implementing wallet operations.
- **`logging/prince`**: Dedicated branch for adding logging functionality.

## 📂 Project Structure
walletAPI/
├── src/
│ ├── main/
│ │ ├── java/com/edureka/wallet/
│ │ │ ├── api/ → Interfaces
│ │ │ ├── Impl/ → Implementations
│ │ │ ├── model/ → Data models
│ │ │ └── WalletApiApplication.java
│ ├── resources/ → Configuration files
│ └── test/ → Unit tests
└── pom.xml


## 🛠 Features Implemented
### Lead Developer Role
- Created the `WalletOperations.java` interface within the `api/` folder.
- Developed the `WalletServiceImpl.java` class in the `Impl/` folder to implement wallet operations.
- Established and merged the `feature/payment-method` branch into `release`, followed by merging `release` into `master`.

### Junior Developer Role
- Initiated the `logging/prince` branch to implement logging functionality.
- Integrated logging into `WalletServiceImpl.java` to track wallet operations.
- Merged the `logging/prince` branch into `release`, and subsequently merged `release` into `master`.


