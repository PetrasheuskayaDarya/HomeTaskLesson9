package by.htp;

public class Task3 {

	public static void main(String[] args) {
		// 4.� ������ ����� k-�� ������� �������� �������� ���������
//		String[] auto = {"�����", "�����", "������"}; //����� ������ �����
//		String result = "� ������ ����� ������: "; //������ ������
//
//		//���������� � ������ �������� �������
//		for(int i = 0; i < auto.length; i++){
//		   //���� ������� �� ���������, ��������� �������
//		   if(i != auto.length-1 )
//		      result += auto[i] + ", ";
//		   //���� ���������, ������ ����� ���� �����
//		   else
//		      result += auto[i] + ".";
//		}
//		//������� ���������
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
//System.out.println("������� �����:"); //������: ����! ���, ���??? ������! ����!!! �����... ����, ������!
//String text = read.nextLine();
//System.out.print("������� ���������: ");
//String sub = read.nextLine();
//System.out.print("������� ������: ");
//int k = read.nextInt();
//System.out.printf("���������:%s%s", System.lineSeparator(),putSub(text, sub, k));
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