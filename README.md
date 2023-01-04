# restassured-gherkin-bdd-allure
This is a sample template for, 
_Cucumber 7 + Junit 4 (main)_
_Cucumber 7 + Junit 5 (junit5)_

  <p align="left">
    <a href="https://github.com/ParthibanRajasekaran/restassured-gherkin-bdd-allure/actions">
      <img alt="Tests Passing" src="https://github.com/ParthibanRajasekaran/restassured-gherkin-bdd-allure/workflows/backend-tests/badge.svg" />
    </a>
    <br />
  </p>

### Connect with me
[<img align="middle" alt="Parthiban Rajasekaran | LinkedIn" width="115px" src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" />][linkedin]

<br />

### Prerequisites
<table> 
<tr>
<td>
<img style="vertical-align:bottom" alt="Java" width="35px" src="https://cdn-icons-png.flaticon.com/512/226/226777.png" /> 
</td>
<td>
Open JDK 11 or higher
</td>
</tr>
<tr>

<tr>
<td>
<img align="left" style="vertical-align:bottom" alt="Maven" width="50px" src="https://unixcop.com/wp-content/uploads/2021/04/Apache-maven.jpg" /></td>
<td>
Apache Maven 3.8.2 or higher
</td>
</tr>
<tr>

<tr>
<td>
<img align="left" style="vertical-align:bottom" alt="IntelliJ" width="35px" src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/IntelliJ_IDEA_Icon.svg/2048px-IntelliJ_IDEA_Icon.svg.png" /></td>
<td>
Community edition
</td>
</tr>
</table>

  
### Languages and Tools used

[<img align="middle" alt="Git" width="46px" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/git/git.png" />][git]
[<img align="middle" alt="GitHub" width="26px" src="https://raw.githubusercontent.com/github/explore/78df643247d429f6cc873026c0622819ad797942/topics/github/github.png" />][github]
[<img align="middle" alt="Java" width="25px" src="https://cdn-icons-png.flaticon.com/512/226/226777.png" />][java]
[<img align="middle" alt="Maven" width="55px" src="https://unixcop.com/wp-content/uploads/2021/04/Apache-maven.jpg" />][maven]
[<img align="middle" alt="Maven" width="25px" src="https://avatars.githubusercontent.com/u/874086?s=280&v=4" />][junit]
[<img align="middle" alt="Maven" width="25px" src="https://avatars.githubusercontent.com/u/19369327?s=280&v=4" />][rest-assured]
[<img align="middle" alt="Maven" width="25px" src="https://604223-1956433-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2017/10/allure-logo-150x150.png" />][allure-report]
<br />

### Getting Started: ⚡

- Clone the project <br />
  ```git clone https://github.com/ParthibanRajasekaran/restassured-gherkin-testng-allure.git```
- Launch and open the project 'restassured-gherkin-testng-allure' in IntelliJ editor
- Based on your preference for the JUnit preference pick a branch <br />
**_main_ - JUnit 4** <br />
**_junit5_ - JUnit 5** <br />
- Trigger the test run via the below maven goal:
     ```sh
        mvn clean test -D"cucumber.filter.tags=@Customer and not @Creation"
    ```
 
[linkedin]: https://www.linkedin.com/in/parthiban-rajasekaran/
[java]: https://adoptopenjdk.net/
[maven]: https://maven.apache.org/download.cgi
[intelliJ]: https://www.jetbrains.com/idea/download/
[git]: https://git-scm.com/
[github]: https://github.com/
[junit]: https://junit.org/junit4/
[allure-report]: https://docs.qameta.io/allure/
[rest-assured]: https://rest-assured.io/
