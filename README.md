# Documentation folkatech-test 


## Technology and libraries
- Spring boot (2.7.1)
- Spring security
- MySQL
- JPA
- Lombok
- JJWT


## About prokect 
This project was designed with the goal of maintaining access to the product APIs allowed by users based on their roles.

## APIs
- POST `http://localhost:8080/auth/login` - > Login user
- Request & Response :

  <img width="350" alt="Screen Shot 2023-06-24 at 13 22 25" src="https://github.com/apekking28/folkatech-test/assets/106460262/a6c6bf38-ff4c-4080-b007-2eae710c6ae4">


- POST `http://localhost:8080/auth/register` - > Login user
- Request & Response :

  <img width="350" alt="Screen Shot 2023-06-24 at 13 29 35" src="https://github.com/apekking28/folkatech-test/assets/106460262/c636d7eb-8e31-45a9-9826-83be1157a70c">


- POST `http://localhost:8080/api/products` - > Add new product
- Request & Response :

  <img width="350" alt="Screen Shot 2023-06-24 at 13 31 11" src="https://github.com/apekking28/folkatech-test/assets/106460262/709a8861-73cc-453b-a637-393c34b9a032">


- GET `http://localhost:8080/api/products/{id}` - > Get detail product
- Request & Response :
  
  <img width="350" alt="Screen Shot 2023-06-24 at 13 31 25" src="https://github.com/apekking28/folkatech-test/assets/106460262/375e2609-d6bc-447f-ac60-a42d2fc6a9e4">



- GET `http://localhost:8080/api/products` - > Get all products
- Request & Response :

  <img width="350" alt="Screen Shot 2023-06-24 at 13 31 33" src="https://github.com/apekking28/folkatech-test/assets/106460262/12cef1ad-2dd7-461a-aa88-818a6629c8c1">



### NOTE : 
- Make sure in headers for key is `Authorization` & for value is `Bearer + token` input the token obtained from login.
- `Authorization` is used for other than login and register APIs
- example :

  <img width="350" alt="Screen Shot 2023-06-24 at 13 39 52" src="https://github.com/apekking28/folkatech-test/assets/106460262/34517df3-c4ea-4ae1-8fe2-e66e15c11ed7">








