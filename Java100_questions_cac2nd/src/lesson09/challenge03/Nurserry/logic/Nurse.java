package lesson09.challenge03.Nurserry.logic;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void divide(int cakes, int childs) {

		try {
			int cakesPerChild = cakes / childs;
			System.out.println("1人" + cakesPerChild + "個になります。");
		} catch (ArithmeticException e) {
			// : handle exception
			System.out.println("ケーキを食べる園児がいません。");
		} finally {
			System.out.println("ケーキの分配が終わりました。");
		}

	}
}
