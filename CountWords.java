import java.util.*;
public class CountWords{
public static void count(String str){
  String[] stringSplit=str.split(" ");
  int len=stringSplit.length;
  System.out.println(Number of words in a given line+" "+len);
}
public static void main(String[] args){
  count("hai hello welcome to guvi");
}
