# Esempio di Abstract Factory con Java Generics
* The JVM level is '17', 
* review the [JDK Version Range](https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Versions#jdk-version-range) on the wiki for more details.

# Getting Started
* build: ./mvnw[.cmd] clean install [-DskipTests]
* run:   ./mvnw[.cmd] clean install spring-boot:run [-DskipTests]
* debug with Eclipse: use 'SimpleMainApp.java', Debug As: Java Application

### Documentation
Please consider the following:
* org.springframework.boot: 3.1.5
* project uses: lombok 

# abstract layer
* 'AbstractFactoryInterface', il metodo 'createGenericObject' servira ad istanziare i builders concreti, nella classe 'GenericFactory'
* 'GenericInterface', il metodo 'getResult' viene implementato dai builder concreti. Prende in input un tipo 'Serializable' e ritorna un 'Number'
* 'GenericInterfaceAbstractImpl' e' l'implementazione astratta dell'interfaccia precedente, nonche superclasse dei builders concreti

# concrete layer
* 'PlayWithDoubles', builder che implenenta 'GenericInterfaceAbstractImpl'; il metodo 'getResult' prende in input un 'Serializable', 
                     e ritorna un 'Number' di tipo 'Double', ovvero uno zero, in caso di tipo input non-Double

* 'PlayWithIntegers', builder che implenenta 'GenericInterfaceAbstractImpl'; il metodo 'getResult' prende in input un 'Serializable', 
                     e ritorna un 'Number' di tipo 'Integer', ovvero uno zero, in caso di tipo input non-Integer

* 'PlayWithShort', builder che implenenta 'GenericInterfaceAbstractImpl'; il metodo 'getResult' prende in input un 'Serializable', 
                     e ritorna un 'Number' di tipo 'Short', ovvero uno zero, in caso di tipo input non-Short

* 'PlayWithLong', builder che implenenta 'GenericInterfaceAbstractImpl'; il metodo 'getResult' prende in input un 'Serializable', 
                     e ritorna un 'Number' di tipo 'Long', ovvero uno zero, in caso di tipo input non-Long

# factory layer
* 'GenericFactory', implementa il metodo 'createGenericObject' della 'AbstractFactoryInterface'. All'interno del metodo, valuta
                    per mezzo della enum 'NumberType' la classe del 'Number' ricevuto in input dalla 'Application' e crea l'istanza 
                    del relativo builder, che viene ritornato alla 'Application'

# application layer
* 'Application'[SpringBoot App], 'SimpleMainApp' [Java Main App]
  entrambe costruiscono una istanza di 'GenericFactory', sulla quale invocare il metodo factory 'createGenericObject' con diversi tipi
  di input class: 'Number'. Provano anche a passare al metodo factory un typo non-gestito; l'eccezione Throwable e' gestita


### Further references:
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.5/maven-plugin/reference/html/#build-image)
