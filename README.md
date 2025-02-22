# KaraBank APIs (Application de Test)

## Description
KaraBank est une application backend développée avec Java Spring Boot. Cette API est conçue dans le cadre de mon apprentissage de Java Spring Boot et servira à être connectée avec un frontend. L'objectif est de tester les différentes fonctionnalités de gestion de comptes bancaires, sans prise en compte d'aspects liés à la sécurité.

## Fonctionnalités
L'API propose plusieurs fonctionnalités de base pour la gestion de comptes clients :
- **Créer un compte** : Permet d'ajouter un nouvel utilisateur avec un numéro de compte unique.
- **Consulter le solde** : Récupérer le solde actuel d'un compte.
- **Rechercher un titulaire de compte** : Retourner le nom associé à un numéro de compte.
- **Créditer un compte** : Ajouter des fonds à un compte bancaire.
- **Débiter un compte** : Retirer des fonds d'un compte bancaire.
- **Effectuer un virement** : Transférer des fonds d'un compte à un autre.

### Notifications par email
Chaque opération effectuée (création de compte, crédit, débit, virement) est notifiée au client par email afin de garantir un suivi en temps réel des transactions.

## Technologies utilisées
- Java 17
- Spring Boot 3.4.3
- Spring Data JPA
- PostgreSQL
- Lombok
- Springdoc OpenAPI (Swagger)

## Installation et exécution
1. Cloner le projet :
   ```sh
   git clone https://github.com/loyikalaprod/Bank-App-Backend-APIs.git
   ```
2. Accéder au répertoire du projet :
   ```sh
   cd banking-secure
   ```
3. Construire et exécuter l'application :
   ```sh
   mvn spring-boot:run
   ```
4. Accéder à la documentation Swagger :
   [http://localhost:8080/swagger-ui/index.html#/](http://localhost:8080/swagger-ui/index.html#/)

## Auteur
Hossain NGARI - hossainprogrammer@gmail.com

## Remarque
Ce projet est uniquement destiné à des fins d'apprentissage et ne prend pas en compte les aspects de sécurité liés aux applications bancaires.

