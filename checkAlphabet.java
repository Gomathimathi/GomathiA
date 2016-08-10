import java.util.Scanner;
public class checkAlphabet{
public void checkFunction(char input){
  if((input>=65 && input<=90) || (input>=97 && input<=122)){
    System.out.println("given character is alphabet");
    }else{
    System.out.println("given character is not alphabet");
    }
}
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
char input=scan.next().charAt(0);
checkAlphabet che=new checkAlphabet();
che.checkFunction(input);
}
}

