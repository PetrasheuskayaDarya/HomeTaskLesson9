package by.htp;

public class Task2 {

	public static void main(String[] args) {
		//3.В тексте после буквы Р, если она не последняя в слове, ошибочно напечата-
		//на буква А вместо О. Внести исправления в текст.
		String s = "Он корабкался по горам";
        System.out.println(s.replaceAll("ра", "ро"));
}
}


//public void replace() {
//    for (int i = 0; i < wrongText.length(); i++) {
//        if (wrongText.charAt(i) == 'р') {
//            if (wrongText.lastIndexOf("р") == wrongText.length()-1) {
//                break;
//            } else {
//                rep(i);
//            }
//        } else if (wrongText.charAt(i) == 'Р') {
//            if (wrongText.lastIndexOf("р") == wrongText.length()-1) {
//                break;
//            } else {
//                rep(i);
//            }
//        }
//
//    }
//    System.out.println(wrongText);
//}

//private void rep(int i) {
//    if (wrongText.charAt(i + 1) != ' ' && wrongText.charAt(i + 1) == 'а') {
//        wrongText = replaceCharAt(wrongText, i + 1, 'о');
//    } else if (wrongText.charAt(i + 1) != ' ' && wrongText.charAt(i + 1) == 'А') {
//        wrongText = replaceCharAt(wrongText, i + 1, 'О');
//    }
//}
//
//
//public String replaceCharAt(String s, int pos, char c) {
//
//    return s.substring(0, pos) + c + s.substring(pos + 1);