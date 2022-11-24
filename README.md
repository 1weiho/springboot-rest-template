# Spring Boot Rest API Template
Rest API template for Spring Boot

## API Document

### `GET` Get all users
```
api/users/all
```

### `GET` Get user info by user ID
```
api/users/{userID}
```

### `POST` Add user
```
api/users/add
```
- Request Headers
```
Content-Type application/json
```
- Request Body
```json
{
  "userID": 1,
  "name": "User",
  "email": "user@mail.com"
}
```