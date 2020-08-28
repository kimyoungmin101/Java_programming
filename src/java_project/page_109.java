package java_project;
// 1부터 10까지 합 for, while 이용
public class page_109 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int fornum = 0;
		int whilenum = 0;
		int n = 1;
		
		for(int i = 0; i <= 10; i++) {
			fornum += i;
		}
		System.out.println(fornum);
		
		while(n <= 10) {
			whilenum += n;
			n++;
		}

		System.out.println(whilenum);
	}

}
