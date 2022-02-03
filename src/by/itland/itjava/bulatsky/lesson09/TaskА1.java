package by.itland.itjava.bulatsky.lesson09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskА1 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            int position = matcher.start();
            text.setCharAt(position + 3, '#');
            if (matcher.group().length() >=7)
                text.setCharAt(position + 6, '#');
        }
        System.out.println(text);
    }

}
