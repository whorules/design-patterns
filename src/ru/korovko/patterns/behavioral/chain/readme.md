**Chain of responsibility** - is a behavioral design pattern which allows you to pass requests sequentially through a chain of handlers. Each subsequent handler decides whether it can process the request itself and whether it is worth passing the request further down the chain.

#### Advantages:
* Decreases dependency between clients and handlers
* Implements single responsibility principe
* Implements open-closed principe

#### Disadvantages:
* Request may not be processed by anyone - handling is not guaranteed
* In case of long chain performance can be degraded