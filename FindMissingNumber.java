package in.practice;

public class MissingNumber {

public static void main(String[] args) {
	int []arr= {145,146,147,148,149,150,151,152,154,155}; //Can use any series
	
	int first=arr[0]; //Take the First Digit
	int last=arr[arr.length-1]; //Take the Last digit
	
	int sum=((last*(last+1)/2)-(first*(first+1)/2)+first);
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		temp +=arr[i];
	}
	
	int reasult=sum-temp;
	
	if(reasult==0) {
		System.out.println("No Number is Missing in the Series !!");
	}else {
		System.out.println("The Missing Number is : "+(reasult));
	}

}
}

// OutPut : The Missing Number is : 153
