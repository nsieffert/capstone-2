Object Oriented Programming Concept Questions

As you should know by now, there are 4 pillars of Object Oriented Programming.

********************
1. Encapsulation
Encapsulation is all about wrapping data together into units that perform the same basic functions. 
It assumes that you will move related but non-similar functions to their own classes and methods as well, 
and then allow each of the encapsulated functions to operate in conjunction with each other.
The goal is to avoid code bloat and to keep code as simple as possible. 
Why? Because if changes need to be made, it is much easier to change small snippets of code rather than some large pile of non-similar pieces, 
and then find everything else that you broke in the meantime.
An example would be to move all printing functions to their own class, and move all calculating functions to their own class, etc...







********************
2. Inheritance
This is the concept of building a parent class that contains specific but general functionality. This functionality can then be "inherited" 
by subclasses (or some people call them child classes). These child classes can implement or override the basic parent functionality and then 
implement more specific function of their own. For example,a parent class might be mammels. All mammels breathe, so the parent class could 
contain a breathe function. Then child classes, such as bear, or dog or whale, could inherit the parent along with implementing more specific 
functionality of their own.







********************
3. Abstraction
The point of abstraction is to "hide away" functionality that a user does not need to see. 
This is done for ease of use on the users ends, and also for protecting data or functions from inadvertently being changed. 
The functionality is used in the background but the user is prevented from calling it or changing it. They must settle for implementing it as is.
An example would be having an input function that kicks in automatically when the user starts a program, rather than allowing the user to call it themselves.







********************
4. Polymorphism
   The concept of polymorphism is to take a fairly generic function and be able to implement it in multiple ways. 
   For example, a printing function can be called by many different methods and classes and can be used to print different things. 
   It helps prevent redundant code, and could also prevent some syntax errors (because the code is already written and works if called correctly).






Please write a 1-3 paragraphs explaining these 4 concepts further.  Please provide a sufficient enough explanation about these pillars, as well as some examples to illustrate the practical use cases of these principles.  



