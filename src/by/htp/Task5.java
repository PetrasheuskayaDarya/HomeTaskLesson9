package by.htp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

	public static void main(String[] args) {
//		12. � ������������� ����� ���������� ����, ������������ � ���������������
//		������� ������
		String text = "������������ �������� ����������, ��� ���������� �������������� ���� � ����� ����� ���������� ������������ �������� ����� ������������ ������� � ������������ ��������������� �������. ������ ������� ���������� �������������� ���� � ����� ����� ���������� ���������������� �������� �������, ���������� ����������� � ��������� ������������ �����.";
				        String[] wordArray = text.split("[\\s,.:!?]+");
				        Pattern pattern = Pattern.compile("^[���������].*[���������]$");
				        for (String word : wordArray) {
				            Matcher matcher = pattern.matcher(word);
				            if (matcher.find()) {
				                System.out.println(word);
				            }
				        }
				    }
				}


