package by.htp;

public class Task3 {

	public static void main(String[] args) {
		// 4.В тексте после k-го символа вставить заданную подстроку
//		String[] auto = {"Волга", "Чайка", "Жигули"}; //задан массив строк
//		String result = "В гараже стоят машины: "; //задана строка
//
//		//прибавляем к строке элементы массива
//		for(int i = 0; i < auto.length; i++){
//		   //если элемент не последний, разделяем запятой
//		   if(i != auto.length-1 )
//		      result += auto[i] + ", ";
//		   //если последний, ставим после него точку
//		   else
//		      result += auto[i] + ".";
//		}
//		//выводим результат
//		System.out.print(result);
		
		
		String[] text = {"Hello", " Bye"};
		String text2 = "Kate";
		char[] result;
		//int k = 4;
		String sub = text2.substring(0, 4);
        //System.out.println("Substring :" + sub);
        
        //System.out.println(text.concat(sub));
		
        for (int i = 0; i < text.length; i++) {
        	   // if (text[i].length() >= k) {
        	    	System.out.print(text[i] + " " + sub);
        }
	}
	}
	




//Scanner read = new Scanner(System.in);
//System.out.println("Введите текст:"); //Пример: Один! Два, три??? Четыре! Пять!!! Шесть... Семь, восемь!
//String text = read.nextLine();
//System.out.print("Введите подстроку: ");
//String sub = read.nextLine();
//System.out.print("Введите символ: ");
//int k = read.nextInt();
//System.out.printf("Результат:%s%s", System.lineSeparator(),putSub(text, sub, k));
//}
//
//public static String putSub(String text, String sub, int k) {
//StringBuilder sb = new StringBuilder();
//if (text != null && sub != null && k > 0) {
//    int count = 1;
//    for (int i = 0; i < text.length(); i++) {
//        sb.append(text.charAt(i));
//        if (count == k) {
//            sb.append(sub);
//        }
//        if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') {
//            count = 0;
//        }
//        count++;
//    }
//}
//return sb.toString();
//}
//}