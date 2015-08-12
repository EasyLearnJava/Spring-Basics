# Spring-Basics
This eclipse project explains some basic concepts related to spring framework 
***

* Starting with the package com.easylearnjava.tightcoupling
This package has three classes 
```
Travel.java
Car.java
Bike.java
```
Creating an object for Car and Bike in Travel class creates a tight coupling between the Travel class and classes in it, making it difficult for maintainance in future
***

* Next look for the package com.easylearnjava.codetointerfaces
This package has three classes and an interface
```
Travel.java
Car.java
Bike.java
Vehicle.java
```
Instead of directly creating Car and Bike objects directly in Travel class, use the coding to interfaces which improves code maintainability, but still this cannot completely eliminate the dependencies between the classes
***
<b>Spring way of coding</b>
* Next look for the package com.easylearnjava.usingspring
This package has three classes and an interface and an xml file
```
Travel.java
Car.java
Bike.java
Vehicle.java
spring-beans.xml
```
Instead of directly creating Car and Bike objects directly in Travel class, get the required object from the spring container
Notice an interface used in Travel class "<b>ApplicationContext</b>"

* Spring ApplicationContext is a <b>Container</b>. The Application Context is spring's more advanced container. Similar to BeanFactory it can load bean definitions, wire beans together and dispense beans upon request.


* <b>Spring </b> 
