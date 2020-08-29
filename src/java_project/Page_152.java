package java_project;

public class Page_152 {
	int age;
	String name;
	boolean isMarried;
	int childCount;
	
	public int getAge(int age) {
		return age;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public boolean getisMarried(boolean isMarried) {
		return isMarried;
	}
	
	public int getChild(int childCount) {
		return childCount;
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Page_152 person = new Page_152();
		
		
		System.out.print("나이가 " + person.getAge(40) + " 살, 이름이 " + person.getName("James") + "라는 남자가 있습니다. " + 
		"이 남자는 결혼 유무는 : " + person.getisMarried(true) + ". 자식이 " + person.getChild(3) + "명이 있습니다.");
	}

}
