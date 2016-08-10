import java.util.*;
public class Alphabet{
public void function(char input){
  char[] al={'a','e','i','o','u','A',E','I','O','U'};
  int flag=0;
  for(int i=0;i<al.length;i++){
    if(input==al[i]){
      flag=1;
    }else{
      flag=0;
      }
  }
  if(flag==1){
    System.ou.println("given character is vowels");
  }else{
    System.out.println("given character is consonants");
    }
}
public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  char input=scan.next();
  Alphabet alph=new Alphabet();
  alph.function(input);
}
}
