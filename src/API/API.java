/*
        {
        "info": {
        "_postman_id": "0e751922-28b6-4527-9606-6e6a71e55995",
        "name": "Simple Book API",
        "schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
        "_exporter_id": "28663713"
        },
        "item": [
        {
        "name": "Status",
        "request": {
        "method": "GET",
        "header": [],
        "url": {
        "raw": "{{BaseUrl}}/status",
        "host": [
        "{{BaseUrl}}"
        ],
        "path": [
        "status"
        ]
        }
        },
        "response": []
        },
        {
        "name": "List of books",
        "request": {
        "method": "GET",
        "header": [],
        "url": {
        "raw": "{{BaseUrl}}/books",
        "host": [
        "{{BaseUrl}}"
        ],
        "path": [
        "books"
        ]
        }
        },
        "response": []
        },
        {
        "name": "Get a single book",
        "request": {
        "method": "GET",
        "header": [],
        "url": {
        "raw": "{{BaseUrl}}/books/:bookId",
        "host": [
        "{{BaseUrl}}"
        ],
        "path": [
        "books",
        ":bookId"
        ],
        "variable": [
        {
        "key": "bookId",
        "value": "2"
        }
        ]
        }
        },
        "response": []
        },
        {
        "name": "Submit an order",
        "request": {
        "auth": {
        "type": "bearer",
        "bearer": [
        {
        "key": "token",
        "value": "5181e044ba29b6805ad159cd04fcea364a85330b92c7c369a40946fe6f67f847",
        "type": "string"
        }
        ]
        },
        "method": "POST",
        "header": [],
        "body": {
        "mode": "raw",
        "raw": "{\r\n  \"bookId\": 5,\r\n  \"customerName\": \"Singh\"\r\n}",
        "options": {
        "raw": {
        "language": "json"
        }
        }
        },
        "url": {
        "raw": "{{BaseUrl}}/orders",
        "host": [
        "{{BaseUrl}}"
        ],
        "path": [
        "orders"
        ]
        }
        },
        "response": []
        },
        {
        "name": "API Authentication",
        "request": {
        "method": "POST",
        "header": [],
        "body": {
        "mode": "raw",
        "raw": "{\r\n   \"clientName\": \"Gurpreet\",\r\n   \"clientEmail\": \"gursahota1995@gmail.com\"\r\n}",
        "options": {
        "raw": {
        "language": "json"
        }
        }
        },
        "url": {
        "raw": "{{BaseUrl}}/api-clients/",
        "host": [
        "{{BaseUrl}}"
        ],
        "path": [
        "api-clients",
        ""
        ]
        }
        },
        "response": []
        },
        {
        "name": "Get all orders",
        "request": {
        "auth": {
        "type": "bearer",
        "bearer": [
        {
        "key": "token",
        "value": "5181e044ba29b6805ad159cd04fcea364a85330b92c7c369a40946fe6f67f847",
        "type": "string"
        }
        ]
        },
        "method": "GET",
        "header": [],
        "url": {
        "raw": "{{BaseUrl}}/orders",
        "host": [
        "{{BaseUrl}}"
        ],
        "path": [
        "orders"
        ]
        }
        },
        "response": []
        },
        {
        "name": "Get an order",
        "request": {
        "auth": {
        "type": "bearer",
        "bearer": [
        {
        "key": "token",
        "value": "5181e044ba29b6805ad159cd04fcea364a85330b92c7c369a40946fe6f67f847",
        "type": "string"
        }
        ]
        },
        "method": "GET",
        "header": [],
        "url": {
        "raw": "{{BaseUrl}}/orders/:orderId",
        "host": [
        "{{BaseUrl}}"
        ],
        "path": [
        "orders",
        ":orderId"
        ],
        "variable": [
        {
        "key": "orderId",
        "value": "BCh1skeSjQztFhz9gkep_"
        }
        ]
        }
        },
        "response": []
        },
        {
        "name": "Update an order",
        "request": {
        "auth": {
        "type": "bearer",
        "bearer": [
        {
        "key": "token",
        "value": "5181e044ba29b6805ad159cd04fcea364a85330b92c7c369a40946fe6f67f847",
        "type": "string"
        }
        ]
        },
        "method": "PATCH",
        "header": [],
        "body": {
        "mode": "raw",
        "raw": "{\r\n  \"customerName\": \"Singh\"\r\n}",
        "options": {
        "raw": {
        "language": "json"
        }
        }
        },
        "url": {
        "raw": "{{BaseUrl}}/orders/:orderId",
        "host": [
        "{{BaseUrl}}"
        ],
        "path": [
        "orders",
        ":orderId"
        ],
        "variable": [
        {
        "key": "orderId",
        "value": "BCh1skeSjQztFhz9gkep_"
        }
        ]
        }
        },
        "response": []
        },
        {
        "name": "Delete an order",
        "request": {
        "auth": {
        "type": "bearer",
        "bearer": [
        {
        "key": "token",
        "value": "5181e044ba29b6805ad159cd04fcea364a85330b92c7c369a40946fe6f67f847",
        "type": "string"
        }
        ]
        },
        "method": "DELETE",
        "header": [],
        "url": {
        "raw": "{{BaseUrl}}orders/:orderId",
        "host": [
        "{{BaseUrl}}orders"
        ],
        "path": [
        ":orderId"
        ],
        "variable": [
        {
        "key": "orderId",
        "value": "BCh1skeSjQztFhz9gkep_"
        }
        ]
        }
        },
        "response": []
        }
        ],
        "event": [
        {
        "listen": "prerequest",
        "script": {
        "type": "text/javascript",
        "exec": [
        ""
        ]
        }
        },
        {
        "listen": "test",
        "script": {
        "type": "text/javascript",
        "exec": [
        ""
        ]
        }
        }
        ],
        "variable": [
        {
        "key": "BaseUrl",
        "value": "https://simple-books-api.glitch.me",
        "type": "string"
        }
        ]
        }

 */