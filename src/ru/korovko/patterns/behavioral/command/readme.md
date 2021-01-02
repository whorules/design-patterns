**Command** - is a behavioral design pattern which turns requests into objects, allowing them to be passed as arguments while calling methods.

#### Advantages:
* Allows you to collect complex commands from simple ones
* Implements open-closed principle
* Removes the direct relationship between objects, operations that call them, and the objects that directly execute them

#### Disadvantages:
* Makes code more complex because of many additional classes