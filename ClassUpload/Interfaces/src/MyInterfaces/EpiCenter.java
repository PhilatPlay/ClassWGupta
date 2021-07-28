package MyInterfaces;

public class EpiCenter {
	public static void main(String[] args) {
		IUseInterfaces me = new IUseInterfaces();
		int answer = me.myMethod(8, 9);
		me.myOtherMethod(answer);
		me.myThirdMethod(5, 3);

	}
}


