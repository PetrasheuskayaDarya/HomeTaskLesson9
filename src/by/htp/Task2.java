package by.htp;

public class Task2 {

	public static void main(String[] args) {
		//3.� ������ ����� ����� �, ���� ��� �� ��������� � �����, �������� ��������-
		//�� ����� � ������ �. ������ ����������� � �����.
		String s = "�� ���������� �� �����";
        System.out.println(s.replaceAll("��", "��"));
}
}


//public void replace() {
//    for (int i = 0; i < wrongText.length(); i++) {
//        if (wrongText.charAt(i) == '�') {
//            if (wrongText.lastIndexOf("�") == wrongText.length()-1) {
//                break;
//            } else {
//                rep(i);
//            }
//        } else if (wrongText.charAt(i) == '�') {
//            if (wrongText.lastIndexOf("�") == wrongText.length()-1) {
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
//    if (wrongText.charAt(i + 1) != ' ' && wrongText.charAt(i + 1) == '�') {
//        wrongText = replaceCharAt(wrongText, i + 1, '�');
//    } else if (wrongText.charAt(i + 1) != ' ' && wrongText.charAt(i + 1) == '�') {
//        wrongText = replaceCharAt(wrongText, i + 1, '�');
//    }
//}
//
//
//public String replaceCharAt(String s, int pos, char c) {
//
//    return s.substring(0, pos) + c + s.substring(pos + 1);