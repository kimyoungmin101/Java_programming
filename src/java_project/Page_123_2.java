package java_project;
// 다이아몬드 별 만들기
public class Page_123_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int count = 1;
		int num = 4;
		
		
		for(int i = 0 ; i < 7; i++) {
			for(int j = 0; j <= num; j++) {
				if(j == num) {
					for(int k = 0; k < count; k++) {
						System.out.print("*");}
				}
				else {
					System.out.print(" ");
				}
			}
			if(i <= 2) {
			count += 2;
			num -= 1;
			}
			else {
				count -= 2;
				num += 1;
			}
			System.out.println();
		}
	}
}