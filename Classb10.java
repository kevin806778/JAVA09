package Java09;

class CRationalb // 分數類別
{
	public static int n;
	public static int d;

	public void setND(int num, int den) {
		n = num;
		d = den;
	}

	public void setN(int num) // 設定分子
	{
		n = num;
	}

	public void setD(int num) // 設定分母
	{
		d = num;
	}

}

public class Classb10 {
	public static void main(String args[]) {
		CRationalb aaa = new CRationalb();
		aaa.setND(3, 5);
		show(aaa); // 內部函數(物件)
	}

	public static void show(CRationalb obj) // 引數 類別and物件
	{

		System.out.println(obj.n + "/" + obj.d); // 顯示分數
	}
}
