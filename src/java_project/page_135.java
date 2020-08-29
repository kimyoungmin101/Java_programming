package java_project;

public class page_135 {
	public static int addResult(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁	
		int n1 = 30;
		int n2 = 200;
		
		int sum = addResult(n1, n2);
		System.out.println(sum);
	}
	
	
}

// 메서드는 크게 get 과 set으로 나누는대 get은 리턴값이 있다. public int 메서드명()으로 get해주고 
// set같은경우는 public void 경우로 해준다. return 값은 존재하지 않는다. set경우는 매개변수를 받아준