la structure  à jour du Client et du Serveur:

ServeurRMI
└── src
    ├── dbcon
    │   ├── DBConnection.java
    │   └── javacontrol.sql
    ├── inventdoa
    │   ├── Produits.java
    │   ├── ProduitsDAO.java
    │   ├── User.java
    │   └── UserDAO.java
    ├── lib
    └── service
        ├── RMIInterface.java
        └── Server.java
    └── module-info.java
└── Referenced Libraries
    └── mysql-connector-j-9.1.0.jar






    
ClientRMI
└── src
    └── Client
        ├── CrudAppFrame.java
        ├── Login.java
        └── SignUp.java
    ├── icon
    ├── lib
    ├── module-info.java
    └── App
└── Referenced Libraries
    ├── mysql-connector-j-9.1.0.jar
    └── AplicationnJAvA.jar #

AplicationnJAvA.jar est réalisé par les fichiers intermédiaires qui servent à la communication entre le client et le serveur

Fichiers Intermédiaires
├── DBConnection.java
├── javacontrol.sql
├── Produits.java
├── RMIInterface.java
└── User.java
