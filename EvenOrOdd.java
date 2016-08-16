public class EvenOrOdd{
  public static void evenOrOdd(int number){
  if(number==0){
    System.out.println("neither odd nor even");
  } else if(number/2==0){
    System.out.println("Even");
    }else if(number/2!=0){
    System.out.println("odd");
  }
  }
  public static void main(String[]args){
  evenOrOdd(10);
  }
  }
    
