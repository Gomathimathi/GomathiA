package guvi;


public class ProLeastNumberDelete {
	private static void function(int input, int key) {
		int len=String.valueOf(input).length();
		if(key>len){
			System.out.println("Invalid key");
		}else{
		String inp=input+"";
		String[] in=inp.split("");
		int[] arr=new int[len];
		for(int i=0;i<len;i++){
			arr[i]=Integer.parseInt(in[i]);
		}
		for(int i=0;i<len-1;i++){
			if(arr[i]>arr[i+1]){
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
		}
		int finalKey=len-key;
		String least="";
		for(int i=0;i<finalKey;i++){
			least+=""+arr[i];
		}
		int output=Integer.valueOf(least);
		System.out.println(output);
		}
		
	}
	public static void main(String[] args){
		function(24356,3);
	}

	
}
