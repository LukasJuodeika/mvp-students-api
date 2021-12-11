# Restful API
RESTful API for CRUD operations, developed with Spring Boot in Java.

# Function
Six RESTful APIs for the Game Store web application.

API                       | Description         | URL
--------------------------|---------------------|--------------
GET /api/students         | Get all students    | GET [http://localhost:8080/api/students](http://localhost:8080/api/students)
GET /api/students/{id}    | Get a student by ID | GET [http://localhost:8080/api/students/1](http://localhost:8080/api/students/1)
POST /api/students        | Add a new student   | POST [http://localhost:8080/api/students](http://localhost:8080/api/students)
PUT /api/students/{id}    | Update a student    | PUT [http://localhost:8080/api/students/1](http://localhost:8080/api/students/1)
DELETE /api/students/{id} | Delete a student    | DELETE [http://localhost:8080/api/students/1](http://localhost:8080/api/students/1)
POST /api/upload          | Upload an image     | POST [http://localhost:8080/api/upload](http://localhost:8080/api/upload)

# Setup Locally
```bash
git clone https://github.com/jojozhuang/restful-api-springboot.git
mvn spring-boot:run
```
Access http://localhost:8080/api/students in web browser or PostMan, you should get the following JSON as response.
```json
[  
   {  
      "id":3,
      "productName":"Wireless Controller",
      "price":19.99,
      "image":"http://localhost:5000/images/controller.jpg"
   },
   {  
      "id":2,
      "productName":"Wii",
      "price":269.0,
      "image":"http://localhost:5000/images/wii.jpg"
   },
   {  
      "id":1,
      "productName":"Xbox 360",
      "price":299.0,
      "image":"http://localhost:5000/images/xbox360.jpg"
   }
]
```

# Deploy to Heroku
Follow tutorial [Deploying Spring Boot RESTful API to Heroku](https://jojozhuang.github.io/tutorial/deploying-spring-boot-restful-api-to-heroku) to deploy this Spring Boot app to [Heroku](https://www.heroku.com/).

Follow tutorial [Continuously Deploy Spring Boot App to Heroku with Travis-CI](https://jojozhuang.github.io/tutorial/continuously-deploy-spring-boot-app-to-heroku-with-travis-ci) to continuously deploy this Spring Boot app to [Heroku](https://www.heroku.com/) with [Travis-CI](https://travis-ci.com/).

The available RESTful API on Heroku is
* baseURL: https://gamestore-api.herokuapp.com/

For example, request https://gamestore-api.herokuapp.com/api/students to get all students.

# Portfolio
Read portfolio [Game Store(Angular)](https://jojozhuang.github.io/project/game-store-angular) or [Game Store(React)](http://jojozhuang.github.io/project/game-store-react) to learn how these RESTful APIs are consumed by Angular and React applications.

# Tutorial
Read tutorial [Building RESTful API with Spring Boot](https://jojozhuang.github.io/tutorial/building-restful-api-with-spring-boot) to learn how this RESTful API is built.
