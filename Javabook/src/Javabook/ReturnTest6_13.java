package Javabook;

class ReturnTest6_13 {
	public static void main(String[] args) {
		ReturnTest6_13 r = new ReturnTest6_13();

		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3, 5,result2);
		System.out.println(result2[0]);

	}
	private void add(int a , int b ,int[] result) {
		result [0] = a+b;
		
	}
	private int add(int a, int b) {
		return a+b;
	}

}
