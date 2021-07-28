package MyInterfaces;

class IUseInterfaces implements First, Second, Third {
	
	public int myMethod(int a, int b) {
	   int answer = a + b;
	   System.out.println(answer);
	   return answer;
	  }
	public void myOtherMethod(int answer) {
	    System.out.println("Some more practice here..." + answer);
	  }
	public int myThirdMethod(int answer, int multi) {
		int thirdAnswer = answer * multi;
	    System.out.println("Some more practice here even more so..." + thirdAnswer);
	    return thirdAnswer;
	  }
}

