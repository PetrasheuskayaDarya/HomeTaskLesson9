package by.htp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

	public static void main(String[] args) {
//		12. В стихотворении найти количество слов, начинающихся и заканчивающихся
//		гласной буквой
		String text = "Повседневная практика показывает, что постоянный количественный рост и сфера нашей активности обеспечивает широкому кругу специалистов участие в формировании системмассового участия. Равным образом постоянный количественный рост и сфера нашей активности позволяетоценить значение позиций, занимаемых участниками в отношении поставленных задач.";
				        String[] wordArray = text.split("[\\s,.:!?]+");
				        Pattern pattern = Pattern.compile("^[аоэиуыеёюя].*[аоэиуыеёюя]$");
				        for (String word : wordArray) {
				            Matcher matcher = pattern.matcher(word);
				            if (matcher.find()) {
				                System.out.println(word);
				            }
				        }
				    }
				}


