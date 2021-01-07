**Factory method** - is a creational design pattern which defines a general interface for creating objects in a superclass, allowing subclasses to change tge type of objects they create

#### Advantages:
* Stops a class from binding to specific product classes
* Highlights production code of products in one place, making it easier to maintain the code
* Simplifies the addition of new products to the program
* Implements open-closed principle

#### Disadvantages:
* Can lead to the creation of large parallel class hierarchies, since for each product you need to create  its own creator subclass