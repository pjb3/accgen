/*
Java Implementation of the Accumulator Generator problem
see http://www.paulgraham.com/accgen.html for details

To run this from the command line:

  javac accgen.java && java accgen

Note that I think this kind of violates the spirit of the problem,
because Graham's intent is for you to use a closure and a lambda (a.k.a anonymous function),
which Java of course has neither of, so we do it with an object.
Nevertheless, I think this is worth having to compare Object-Oriented vs. Functional styles.

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