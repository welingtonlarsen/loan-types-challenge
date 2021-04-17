<div align="center">

![](https://img.shields.io/badge/Status-Under%20Development-orange)

</div>

<div align="center">

# Code Challenge

The proposal of this Challenge is provide a person with the loan types suitable for her, given some variables:

We must provide the following loan types:
Personal Loan. Interest Rate: 4%
Collateralized Loan. Interest Rate: 3%
Payroll Loan. Interest Rate: 2%

Listed below are the business rules for conceding a loan based on the person's profile:

|                          | Personal Loan | Collateralized Loan | Payroll |
| ------------------------ | ------------- | :-----------------: | ------- |
| Income <= 3000           | Yes           |       Yes\*\*\*     | No      |
| Income > 3000 & < 5000   | Yes           |        Yes\*\*      | No      |
| Income => 5000           | Yes           |         Yes\*       | Yes     |

- \* Clients under 30 y.o.
- \*\* Clients residing in SP (São Paulo state code in Brazil)
- \*\*\* Clients under 30 y.o. residing in SP

![](https://img.shields.io/badge/Autor-Welington%20Larsen-brightgreen)
![](https://img.shields.io/badge/Language-Java-brightgreen)
![](https://img.shields.io/badge/Framework-Spring-brightgreen)

</div>

## App usage:

The application must receive the following data as input:

##### input

```json
{
  "customer": {
    "name": "Erikaya",
    "cpf": "123.456.789-10",
    "age": 29,
    "location": "SP",
    "income": 3000
  }
}
```

And must respond the following data:

##### output

```json
{
  "customer": "Erikaya",
  "loans": [
    {
      "type": "personal",
      "taxes": 1
    }
  ]
}
```

## Setup

- Install dependencies

## Rode os testes

You may execute the following command via CLI:

```bash
$ ./gradlew test
```
