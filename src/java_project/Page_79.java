package java_project;

public class Page_79 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int num = 5;
		int i = 10;
		
		boolean value = ((num = num * 10) > 45) || ((i = i - 5) < 10);
		System.out.println(value); // True
		System.out.println(num); // 50
		System.out.println(i); // 10 여기서 10인이유는 논리항에 의해 앞이 true인것이 확인 된경우 뒤항은 실행 안될 수 있기 때문 !!
	}

}
