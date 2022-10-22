package Java09;

class Data {
	private String name;
	private Test score;

	class Test {
		private int english;
		private int math;

		Test(int eng, int m) {
			english = eng;
			math = m;
		}

		double avg() {
			return (english + math) / 2.0;
		}
	}

	void show() {
		System.out.println("�ǥͩm�W:" + name);
		System.out.println("�^�妨�Z:" + score.english);
		System.out.println("�ƾǦ��Z:" + score.math);
		System.out.println("�������Z:" + score.avg());
	}

	Data(String n, int eng, int m) {
		name = n;
		score = new Test(eng, m);
	}
}
	public class Class19 {

		public static void main(String[] args) {
			Data stu = new Data("Annie", 85, 92);
			stu.show();


		}

}
