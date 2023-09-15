import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем количество пришедших sms-сообщений
        int N = scanner.nextInt();

        // Создаем словарь для хранения количества голосов для каждой пары
        Map<Integer, Integer> votes = new HashMap<>();

        // Считываем номера пар и увеличиваем счетчик голосов для соответствующих пар
        for (int i = 0; i < N; i++) {
            int pairNumber = scanner.nextInt();
            votes.put(pairNumber, votes.getOrDefault(pairNumber, 0) + 1);
        }

        // Сортируем пары по количеству голосов в порядке убывания
        List<Map.Entry<Integer, Integer>> sortedVotes = new ArrayList<>(votes.entrySet());
        sortedVotes.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Выводим результаты голосования
        for (Map.Entry<Integer, Integer> entry : sortedVotes) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}