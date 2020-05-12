import java.util.List;
import java.util.Scanner;

public class GrammarExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一串单词串：");
        String firstWordList = scanner.next();
        System.out.print("请输入第二串单词串：");
        String secondWordList = scanner.next();

        List<String> result = findCommonWordsWithSpace(firstWordList,secondWordList);

    }

    public static List<String> findCommonWordsWithSpace(String firstWordList, String secondWordList) {
        return null;
    }
}
