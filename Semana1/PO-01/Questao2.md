# Atividade 2

### 2. Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++

#### Resposta

##### Em Java, você declara uma variável indicando o tipo de dado seguido pelo nome da variável.

##### Os tipos de dados primitivos mais comuns em Java são:

- int: Representa números inteiros.
- double: Representa números de ponto flutuante (números decimais).
- float: Também representa números de ponto flutuante, mas com menos precisão que o double.
- boolean: Representa valores booleanos, ou seja, true ou false.
- char: Representa um único caractere Unicode.

##### Exemplo:

~~~java

    int i = 0;
    double d = 5.553115153525;
    float f = 5.55
    boolean b = true;
    char c = 'C';

    System.out.println("Inteiro : " + i);
    System.out.println("Double : " + d);
    System.out.println("Float : " + f);
    System.out.println("Boolean : " + b);
    System.out.println("Char : " + c);

~~~

##### Em C++,a declaração de variáveis é semelhante, mas os tipos de dados são especificados de forma um pouco diferente.

##### Os tipos de dados primitivos mais comuns em C++ são:

- int: Representa números inteiros.
- double: Representa números de ponto flutuante.
- float: Semelhante ao double, mas com menos precisão.
- bool: Representa valores booleanos (true ou false).
- char: Representa um único caractere.

##### Exemplo:

~~~c++

    int i = 0;
    double d = 5.553115153525;
    float f = 5.55;
    bool b = true;
    char c = 'C';

    std::cout<<"Inteiro : "<<i<<std::endl;
    std::cout<<"Double : "<<d<<std::endl;
    std::cout<<"Float : "<<f<<std::endl;
    std::cout<<"Boolean : "<<b<<std::endl;
    std::cout<<"Char : "<<c<<std::endl;

~~~
