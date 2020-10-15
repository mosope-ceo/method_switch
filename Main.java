import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int num;
    long result;
    System.out.println("This program is to detect if a number is a prime number, odd number, and to calculate the factorial or summation of a number.");
    System.out.println("Input p to detect prime number, Input o to detect odd number, input s to calculate summation and input f to caluclate factorial ");
    
    Scanner sc = new Scanner(System.in);
    char opt = sc.next().charAt(0);
    switch (opt){
      case 'p':
        System.out.println("Input the number in which you want to detect if it's a prime");
        num = sc.nextInt();
        if(detectPrime(num))
          System.out.printf("%d is a prime number", num);
        else
          System.out.printf("%d is not a prime number", num);
          break;
      case 'o':
        System.out.println("Input the number in which you want to detect if it's an odd number");
        num = sc.nextInt();
        if(detectOdd(num))
          System.out.printf("%d is an odd number", num);
        else
          System.out.printf("%d is not an odd number", num);
          break;
      case 'f':
        System.out.println("Input the number in which you want to calculate its factorial");
        num = sc.nextInt();
        result = factorial(num);
        System.out.printf("The factorial of %d is %d", num, result);
        break;
      case 's':
        System.out.println("Input the number in which you want to calculate its summation");
        num = sc.nextInt();
        result = summation(num);
        System.out.printf("The summation of %d is %d", num, result);
        break;
      default:
        System.out.println("Wrong Input!!! Why do you want to crash my program???!!!");
        break;
    }
  }

  static boolean detectPrime(int n){
    boolean flag = true;
    for (int i = 2; i <=n/2; i++){
      
      if (n % i == 0){
          flag = false;
          break;
      }
    }
    return flag;
  }
  
  static boolean detectOdd(int n){
    boolean flag = true;
    
      if (n % 2 == 0)
          flag = false;
    return flag;
  }

  static long factorial(int n){
    long f = 1;
    for (int i = 1; i <=n; i++){
      f *= i;
    }
    return f;
  }

  static long summation(int n){
    long s = 0;
    for (int i = 1; i <=n; i++){
      s += i;
    }
    return s;
  }
}