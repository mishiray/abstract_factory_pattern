# abstract_factory_pattern
Abstract Factory Pattern: 
Abstract Factory Pattern is a subset of creational design pattern. Creational design patterns are design patterns that basically deal with object creation mechanisms, trying to create objects in a manner that suites the situation. These design patterns are necessary so as to reduce design complexity especially when dealing with various forms of development.
Abstract Factory Pattern in itself is a design pattern that allows you create closely related objects or families of objects without specifying their base concrete class. Abstract factory allows you to explicitly create interfaces for the distinct objects in the family of objects then allow those interface variants implement/follow a base interface. Then you declare the Abstract Factory which holds the creation methods for all the related objects in the family of objects. 
A good example will be an application that allows users with multiple ISP on their device easily recharge and buy data on a single application.
1.	A family of related products, say: Airtime bundles + Data bundles
2.	Several variants of this family. For example, products Airtime bundles + Data bundles are available for: MTN, GLO, AIRTEL.
Abstract Factory Pattern will allow us create interfaces for Airtime bundles and Data bundles Then each of the variants can follow the created interfaces. 
For example, all Airtime Bundles variants can implement the Airtime Bundles interface, all Data bundle variants can implement the Data bundles interface.

Below is the structure of the application design with abstract factory pattern.
