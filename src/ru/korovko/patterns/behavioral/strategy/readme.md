**Strategy** - is a behavioral pattern which defines a family of similar algorithms and puts each of them in its own class, after which the algorithms can be interchanged right at runtime.

#### Advantages:
* Makes possible to change algorithms ar runtime
* Isolates code and data of algorithms from other classes
* Using delegation instead of inheritance 
* Implements open-closed principle

####
* Makes program more complex because of additional classes
* Client must know difference between strategies to choose the right one