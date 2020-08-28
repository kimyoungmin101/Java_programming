package java_project;
// 삼각형 별 만들기
public class page_123 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int num1 = 1;
		int num2 = 4;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 7; j++) {
				if(j == num2) {
					for(int k = 0; k < num1; k++) {
						System.out.print("*");
					}
					num2 -= 1;
					num1 += 2;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
