# Higher Order Functions & Generics kata

## Kata steps

### Step 1:
Write the followi ng functions

* add (x,y) -> x + y , x,y as integers
* multiply ( x,y) -> x*y , x,y as integers
* substract (x,y) -> x -y , x,y as integers


Now using a list (VAVR or plain Java) use them with a list using the filter & map  functions.
Write a short main() function to try it out!!
Try to obtain a display close from this one.
[Step 1 output](pics/step1-console.png)




### Step 2 :
Now the list contains double instead of integers.
Consequences on your code base.
You should obtain running the problem an output close to

[step 2 ouput](pics/step2-console-ints-doubles.png)


### Step 3 :
Comments about the code ...
How to refactor the code 
Write a function taking a list as a parameter and 2 functions doing:
* mapping the input to another list with the mappingFunction provided as parameter
* filtering the list with the filteredFunction parameter
* display the 3 lists

Try to have  a weak complexity score.

#### Step 3.1

What is the signature of the mapping function  ?
How to translate this with VAVR functions

#### Step 3.2
What is the signature of the filtering function?

#### Step 3.3
You can now write the mapFilterAndDisplay() function...
What is the complexity of the method ?

#### Step 3.4
One last refactor to have a weak complexity score

## Kata solutions

Please checkout the git tag with the name of the step.


## Conclusion
You have seen :
* how to create an HoF function
* this HoF uses Java generics so very open
* how powerful it is
* how your code complexity is raised down


## What about about a generic version of add ?

We may try to write  something like

static <T> T add (T x,T y){
  return x+y;
}

This function would admit only numbers.
Java provides an abstraction for numbers as objects with Number.
Unfortunately this abstraction is useless and just offers ways to unwrap 
primitive types. So coding this generic function would be awful & akward.

We may try somethinbg like this but it does not compile

static <T extends Number> add (T x,T y){
   return x+y; // does not compile because + is defined as an operator in Java not a function
}



