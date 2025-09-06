# ECommerceBackend
Backend Project created on Spring boot, Spring JPA, Hibernate and MySQL

## Tech Stack

- Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL

## Features

- Customer and Seller authentication managed via session tokens, each valid for 1 hour to ensure security.  

- Seller Capabilities:  
  - Acts as the administrator for the entire platform.  
  - Only authenticated sellers with valid session tokens can create, update, or delete products in the main database.  
  - Sellers can view customer details and order information.  

- Customer Capabilities:  
  - Ability to register on the platform and log in to receive a valid session token.  
  - Browse products, add them to the cart, and place orders.  
  - Access to orders, cart, and related features is restricted to logged-in customers only.  


## Modules

- Login, Logout Module
- Customer Module
- Seller Module
- Product Module
- Cart Module
- Order Module

## Installation & Run

- Before running the API server, you should update the database config inside the [application.properties](\src\main\resources\application.properties) file. 
- Update the port number, username and password as per your local database config.

```
server.port=8080

spring.datasource.url=jdbc:mysql://localhost:3306/ecommercedb
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=root
```

## API Endpoints

`https://localhost:8080/`

`http://localhost:8080/swagger-ui/index.html#/`

## API Module Endpoints

### Customer Module

- `GET /customer/current` : Getting currently logged in customer
- `GET /customer/orders` : Getting order history of logged in customer
- `GET /customers` : Getting All customers
- `PUT /customer` : Updates logged in customer
- `PUT /customer/update/password` : Updates customer password
- `PUT /customer/update/card` : Updates credit card details
- `PUT /customer/update/address?type=home` : Updates customer's home address
- `PUT /customer/update/credentials` : Updates email address and mobile number
- `DELETE /customer` : Deletes logged in user with valid session token
- `DELETE /customer/delete/address?type=home` : Deletes customer's home address

### Seller Module

- `GET /seller/{sellerid}` : Gets seller with passed seller Id
- `GET /seller/current` : Gets seller details for currently logged in seller
- `GET /sellers` : Gets all sellers
- `POST /addseller` : Adding new seller
- `PUT /seller` : Updates seller details
- `PUT /seller/update/password` : Updates seller password
- `PUT /seller/update/mobile` : Updates seller mobile number
- `DELETE /seller/{sellerid}` : Deletes seller with passed id

### Product Module

- `GET /product/{id}` : Gets product with given product id
- `GET /products` : Gets all products
- `GET /products/{category}` : Gets product with given category
- `GET /products/seller/{id}` : Gets product of given seller id
- `POST /products` : Adds a new product to database
- `PUT /products` : Updates the product with given product id
- `PUT /products/{id}` : Updates product quantity
- `DELETE /product/{id}` : Deletes product with given id

### Cart Module

- `GET /cart` : Get all items in Customer Cart
- `POST /cart/add` : Add item to Cart
- `DELETE /cart` : Remove item from Cart
- `DELETE /cart/clear` : Clear entire cart

### Order Module

- `GET /orders/{id}` : Gets order details with given order id
- `GET /orders` : Gets all orders
- `GET /orders/by/date` : Gets orders placed on given date (DD-MM-YYYY)
- `POST /order/place` : Places a new order based on cart items
- `PUT /orders/{id}` : Updates a pending order
- `DELETE /orders/{id}` : Cancels an order

### Login & Logout Module

- `POST /register/customer` : Register a new customer
- `POST /login/customer` : Logging in customer with valid mobile number & password
- `POST /logout/customer` : Logging out customer based on session token
- `POST /register/seller` : Register a new seller
- `POST /login/seller` : Logging in Seller
- `POST /logout/seller` : Logging out Seller based on session token

## Sample API Responses

### Customer Login

- `POST   localhost:8009/login/customer`

```
Request Body

{
  "mobileId": "9814563818",
  "password": "hello@123"
}

Response

{
  "sessionId": 45,
  "token": "customer_a82f0931",
  "userId": 12,
  "userType": "customer",
  "sessionStartTime": "2025-09-07T09:15:30.123456",
  "sessionEndTime": "2025-09-07T10:15:30.123456"
}
```

