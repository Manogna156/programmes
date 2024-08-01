 class duplicateArray {

	public static void main(String[] args) {
		//intialization
		int[] arr= {10,20,30,20,50,30};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				//checking the numbers
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					//increasing count if number is found
					count++;
			}
				
		}

	}
		System.out.println(count);

}
}
