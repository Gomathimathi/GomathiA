package guvi;

public class LargestAmongThreeNumbers {
	static int output1;
	public static int largestNumber(int input1,int input2, int input3){
		if((input1>input2) && (input1>input3) ){
			return output1=input1;
		}else if(input2>input3){
			return output1=input2;
		}else{
			return output1=input3;
		}
	}
	public static void main(String[] args) {
		System.out.println(largestNumber(98, 97, 34));

	}

}
