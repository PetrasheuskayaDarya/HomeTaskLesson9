package by.htp;

public class Task4 {

	public static void main(String[] args) {
//		7.»з текста удалить все символы, кроме пробелов, не €вл€ющиес€ буквами. ћежду
//		последовательност€ми подр€д идущих букв оставить хот€ бы один пробел
		MyExample ("Hello$ this) beautiful< world");
			
		}
		public static void MyExample(String s) {
			System.out.println(s.replaceAll("[^A-z, ]",""));

	}

}
