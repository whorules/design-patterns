**Abstract factory** - is a creational pattern which solves the problem of creating entire families of related products without specifying concrete classes of these products

#### Advantages:
* Ensures the compatibility of the created products
* Eliminates client code from binding to specific product classes
* Highlights production code of products in one place, making it easier to maintain the code
* Makes easier adding new products to the program
* Implements open-closed principle

#### Disadvantages:
* Makes code more complex because of creating a lot of additional classes
* Requires all types of products in each variation