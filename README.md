# Project 2

## Description

Your next project will build upon the concepts from project 0 & 1, adding the following topics:
 - Angular 4
 - CI/CD
 - Spring Boot
 - Spring Data

You will be building a client/server application with a frontend and backend. Your application will use a third party API to get data useful to the service you provide. What service that is, is up to you. Your team should consider your options and come up with an idea for a client/server application that can utilize a third party API to grab data. Your application should meet the minimum requirements set forth below. Your team will work with your trainer to create a series of user stories for your application's MVP.
  
You will be expected to complete the minimum viable product by the deadline and give a brief presentation demonstrating your project and answering questions from the audience.

This project will be done in teams of 5-6 members that will be assigned when we begin.

### Minimum Requirements
1. Proper use of OOP principles and a well layered application structure
2. Users are interfacing with an advanced UI built with Angular running in a browser
4. CRUD operations are supported for one or more domain objects via the web application's API endpoints
5. Client/Server communication is done with JSON in HTTP request and response bodies.
6. All low-level persistence logic is abstracted away with Hibernate/Spring Data
7. Documentation (all classes and methods have adequate Javadoc comments)
8. All Exceptions are caught and logged to a file
9. Data useful to the application is retrieved from a third party API
10. Adequate test coverage for the service-layer
11. DevOps CI/CD pipeline is used to build and deploy project to a publicly available remote location


## CineFile
CineFile is a social web service which allows movie lovers to find and rate their favorite films. CineFile displays a list of available films, which users can filter to quickly locate the movie they would like to rate. If the user doesn’t see the movie they are looking for, they can utilize the built-in option for requesting additions to our list.

## Features
Rate a movie 1-5 points; Filter movies (search?); Request, add, or remove movies in the list; Display list of movies users can rate

## User Stories
- [x] As a user, I can login and sign up

- [x] As a user, I can rate movies


- [x] As a user, I can request that a movie be added to the list

- [x] As a user, I can view the list of movies

- [x] As a user, I can filter the list of movies

- [x] As an administrator, I can add movies

- [x] As an administrator, I can remove movies

## Bonus Stories
- [ ] As a user, I can view a synopsis for each movie

- [ ] As a user, I can view upcoming movies

- [ ] As an administrator, I can elevate users to admin

## Tech Stack
You should be employing the following technologies in your project.
 - Java 8
 - JavaScript/TypeScript
 - HTML & CSS
 - Angular 4
 - Apache Maven for dependencies and project management
 - Git & Github for version control
 - MariaDB deployed on AWS RDS for data persistence
 - Hibernate/Spring Data to abstract away JDBC code
 - AWS EC2, ElasticBeanstalk, S3, CodeBuild, CodePipeline for CI/CD pipeline
 - Spring Boot

## Deadline & Presentation
 - Finalized version of your project must be pushed to your team's p2 repository within the training originzation by 9:00 AM Central time on the date of the presentation showcase. Commits after that time will not be considered. The most recent commit submitted before that time will be the version of the project that is graded.
   - Presentation Showcase (Due Date): Wednesday, November 17th 2021, 9:00 AM CDT.
 - You will give a brief (15 minute) presentation of your project. Be prepared to answer questions about your work from the QC team. Everyone involved should be part of the presentation and speak about some part of the project.
 - Your work **MUST BELONG TO YOUR TEAM**. Collaboration is allowed and encouraged, but at the end of the project you must have an excellent understanding of every line of code in your project and be able to answer questions about any part of it.
