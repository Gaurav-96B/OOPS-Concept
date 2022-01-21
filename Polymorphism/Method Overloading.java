Method Overloading-Changing no. of arguments:
-------------------------------------------------------
class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
}}  

Method Overloading-Changing data type of arguments:
--------------------------------------------------------
class Adder{  
static int add(int a, int b){return a+b;}  
static double add(double a, double b){return a+b;}  
}  
class TestOverloading2{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(12.3,12.6));  
}}  

Method Overloading-Changing the sequence of arguments:
----------------------------------------------------------
class Adder{  
static int add(int a, float b){return a+b;}  
static double add(float a, int b){return a+b;}  
}  
class TestOverloading2{  
public static void main(String[] args){  
System.out.println(Adder.add(11,12.6));  
System.out.println(Adder.add(12.6,11));  
}}  

Method Overloading-Changing the return type of method:Is not possible
-------------------------------------------------------------------------------------

