package by.htp;

public class Task1 {

	public static void main(String[] args) {
		//1.� ������ ����� ������ k-� ����� �������� �������� ��������. ���� k
		//������ ����� �����, ������������� �� ���������.
		 String[] text = {"It", "so", "interesting", "to", "learn", "Java", "course"}; 
	        int k = 4; 
	        char newChar = 'w'; 
	        char[] word;
	        for (int i = 0; i < text.length; i++) {
	            if (text[i].length() >= k) {
	                word = text[i].toCharArray();
	                word[k-1] = newChar;
	                text[i] = String.copyValueOf(word);
	            }
	        }
	 
	        for (String s : text) {
	            System.out.println(s);
	        }
	 
	    }
	}