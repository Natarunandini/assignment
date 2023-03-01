package week3.ss.day2;

public class Automation extends MultipleLangauge  implements Language ,TestTool {

	public static void main(String[] args) {
		
		Automation obj=new Automation();
		obj.Python();
		obj.java();
		obj.Selenium();
		obj.ruby();

	}

	@Override
	public void java() {
		System.out.println("the langauge is java");
		
	}

	@Override
	public void Selenium() {
		System.out.println("the tool is selenium");
	
		
		}

	@Override
	public void ruby() {
		System.out.println("ruby is also used");
		
	}
}
