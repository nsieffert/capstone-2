Object Oriented Programming Concept Questions

As you should know by now, there are 4 pillars of Object Oriented Programming.

********************
1. Encapsulation
Encapsulation is all about wrapping data together into units that perform the same basic functions. Also, make these
units private and implement getters and setters (if needed) for outside use.
	-- this controls who can change or implement code and how it can be changed or implemented.
	-- it also keeps similar code together and makes it easier to read and understand.

Small code example: (NOTE: all code examples are abbreviated and not intended to be run)

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;
 

    public BankAccount(String firstName, String lastName, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

public String getFirstName(){
return firstName;
}
public String getLastName(){
return lastName;
   
public double getBalance(){
return balance;
}

//methods use the getter functions 
 
********************
2. Inheritance
This is the concept of building one class in such a way that other classes can "inherit" features and functions of that class (usually known as the parent).
These child classes can implement or override the basic parent functionality and then 
implement more specific functions of their own. For example,a parent class might be mammals. All mammals breathe, so the parent class could 
contain a breathe function. Then child classes, such as bear, or dog or whale, could inherit the parent along with implementing more specific 
functionality of their own.

Example: 

abstract class Mammals{
public String breathes;
public String eats;

public void breathing(breathes){
System.out.println("This mammal breathes " + breathes);
}

public void eating(eats){
System.out.println("This mammal eats " + eats);
}

//create a subclass that inherits Mammals:

public class Bear() extends Mammals{
public String hibernates;

//constructor
super(breathes, eats)

//etc...


********************
3. Abstraction
The point of abstraction is to "hide away" functionality that a user does not need to see. 
This is done for ease of use on the user's end, and also for protecting data or functions from inadvertently being changed. 
The functionality is used in the background but the user is prevented from calling it or changing it.

Example of Abstraction:

public class Cars{
private int engine;
private int gasoline;

public int speed(engine){
System.out.println("This " + engine + " is really fast"). // user can select engine from the main class and run it. 

private int engineSpeed(int mph){
mph = engine * gasoline;		// user can not choose this from the main class.
}
// etc...


********************
4. Polymorphism
   The concept of polymorphism is to take a function and be able to implement it in multiple ways. 
   For example, a printing function can be called by many different methods and classes and can be used to print different things. 
   Methods can be overloaded so that a user can implement the same method with different parameters,
   
   Example:
   class Overload(){
   public class methodOverload(int x, int y){
	return x + y;
	}
   public class methodOverload(int x, int y, int z) {
   return x + y + z;
   }

   public class methodOverload(int w, int x, int y, int z) {
   return w + x + y + z;
   }   
   
   
another way to use polymorphism is to override a function and implement something else:

example: 

class Execute implements Runnable{

@Override
run(){
//implement your own run method here	




Please write a 1-3 paragraphs explaining these 4 concepts further.  Please provide a sufficient enough explanation about these pillars, 
as well as some examples to illustrate the practical use cases of these principles.  



