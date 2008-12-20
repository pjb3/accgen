/*
Java Implementation of the Accumulator Generator problem
see http://www.paulgraham.com/accgen.html for details

To run this from the command line:

  javac accgen.java && java accgen

Note that Paul Graham would probably say that this isn't a valid solution
because it doesn't use a closure and an anonymous function, instead it uses an object.
But in everyway, this does solve the problem.  This has a methhod 
(which is basically thing as function) that returns an object that has a call method
(ok, not technically a function) that takes a number n and returns it incremented by i.
I think this is an interesting solution, because depending on your point of view,
closures are a poor man's objects, or objects are a poor man's clojures.

*/
class accgen {

  public static void main(String... args) {
    accgen acc = foo(1);
    for(int i = 2; i <= 5; i++) {
      System.out.println(i+": "+acc.call(i));
    }
  }
  
  public static accgen foo(int n) {
    return new accgen(n);
  }
  
  private int n;
  
  public accgen(int n) {
    this.n = n;
  }

  public int call(int i) {
    n += i;
    return n;
  }
  
}