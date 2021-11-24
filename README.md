# [Guardería - BE-Products-CRUD](https://mintic-p5-g4-dw-be-projects.herokuapp.com/swagger-ui/)

**BE-Products-CRUD** Microservicio para realizar las operaciones de create, modify, get, getAll a la base de datos no relacional ProductsDB.

**Vista de documentación con swagger en [https://mintic-p5-g4-dw-be-projects.herokuapp.com/swagger-ui/](https://mintic-p5-g4-dw-be-projects.herokuapp.com/swagger-ui/)**

#### Resumen
| Servicio | funcionalidad| funcionalidad | funcionalidad | funcionalidad |
| --------- | --------- | --------- | --------- | --------- |
| CRUD Products| Create| Get <br/> getAll| Update| Delete|


## CRUD Products
A contiuación se describen los servicios disponibles para el crud de User

### Create:
Link del servicio
```bash
https://mintic-p5-g4-dw-be-projects.herokuapp.com/product
```

Ejemplo entrada body JSON:
```bash
{
    "id": 1,
    "name": "vacunación",
    "price": 100000,
    "description": "aplica vacunas",
    "city": "Bogotá"
}
```
Ejemplo respuesta OK JSON:
```bash
{
  "city": "string",
  "description": "string",
  "id": 0,
  "name": "string",
  "price": 0
}
```

### Get
Link del servicio
```bash
https://mintic-p5-g4-dw-be-projects.herokuapp.com/product/1
```
Ejemplo respuesta OK JSON:
```bash
{
  "id": 1,
  "name": "vacunación",
  "price": 100000,
  "description": "aplica vacunas",
  "city": "Bogotá"
}
```

### GetAll:
Link del servicio
```bash
https://mintic-p5-g4-dw-be-projects.herokuapp.com/products/
```

Ejemplo respuesta JSON:
```bash
[
  {
    "city": "string",
    "description": "string",
    "id": 0,
    "name": "string",
    "price": 0
  }
]
```

### Update:
Link del servicio
```bash
https://mintic-p5-g4-dw-be-projects.herokuapp.com/product/3
```
Ejemplo entrada body JSON:
```bash
{
    "name": "1111111111",
    "price": 100000,
    "description": "aplica vacunas",
    "city": "Bogotá"
}
```
Ejemplo respuesta OK JSON:
```bash
{
  "city": "string",
  "description": "string",
  "id": 0,
  "name": "string",
  "price": 0
}
```

### Delete
Link del servicio
```bash
https://mintic2022-p5-g4-dw-be-auth.herokuapp.com/user/6/delete/
```
Respuesta ok:
```bash
string
```


## Créditos por base del readme
[AdminLTE](https://github.com/ColorlibHQ/AdminLTE/blob/master/README.md)
