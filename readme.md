# Automação de Teste de API

> Projeto realizado no curso Programa de Teste e Qualidade de Software do professor Júlio de Lima.

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" height=60 width=60/>

<hr>

#### Tecnologias utilizadas

-   Java
[https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html](https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html)


-   Maven
[https://maven.apache.org/](https://maven.apache.org/)

    O Apache Maven é uma ferramenta de gestão de projetos amplamente utilizada em desenvolvimento de software. Ela ajuda na construção, compilação, testes e gestão de dependências de projetos Java (e também de outros tipos de projetos) de maneira eficiente e padronizada.



- JUnit Jupiter API
[https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api)
    
    O JUnit Jupiter API é um framework que permite escrever e executar testes em Java. O JUnit é uma das bibliotecas de teste mais populares para Java e é amplamente utilizado para testar diferentes partes de código, desde unidades individuais até funcionalidades mais abrangentes.


- REST Assured
[https://mvnrepository.com/artifact/io.rest-assured/rest-assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured)
 
    O REST Assured é uma biblioteca de teste de API em Java que simplifica e facilita a automação de testes para APIs RESTful. Ele oferece uma maneira simples e expressiva de escrever testes automatizados para suas APIs, verificando as solicitações e respostas HTTP, validando os dados retornados e verificando o comportamento correto da API.


- Jackson
[https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind)
  
    Jackson é uma biblioteca popular para manipulação de JSON em Java.
<hr>

### Notas Gerais
Neste projeto testamos casos de testes de uma loja web, por meio da sua API.
Testes para validar partições de equivalência vinculadas as regras de negócios, validando que o produto tenham valores entre R$ 0,01 e R$ 7.000,00.


 - [ ] CT01 - Validar que o valor do produto igual a 7000.01 não é permitido;
 - [ ] CT02 - Validar que o valor do produto igual a 0.00 não é permitido.