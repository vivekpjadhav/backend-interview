package ai.brace;

import ai.brace.domain.BookRecord;
import ai.brace.domain.Text;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hello, world.");
            Gson gson = new Gson();
            JsonParser parser = new JsonParser();

//            Reader reader = Files.newBufferedReader(Paths.get("/Users/vivekpjadhav/Documents/GitHub/backend-interview/json-manipulation/src/main/resources/a1.json"));
//            Reader reader2 = Files.newBufferedReader(Paths.get("/Users/vivekpjadhav/Documents/GitHub/backend-interview/json-manipulation/src/main/resources/a2.json"));

            // BookRecord record = gson.fromJson(reader, BookRecord.class);
            BookRecord record1 = gson.fromJson(new FileReader("/Users/vivekpjadhav/Documents/GitHub/backend-interview/json-manipulation/src/main/resources/a1.json"), BookRecord.class);
            BookRecord record2 = gson.fromJson(new FileReader("/Users/vivekpjadhav/Documents/GitHub/backend-interview/json-manipulation/src/main/resources/a2.json"), BookRecord.class);


            /**
             * # Task 1
             * ### Goal: "Load, parse, and sort"
             *  This is task one where i can use comparator on collections sort.
             *  Collections.sort(record.getTextArray(),(t1, t2) -> t1.getId()-t2.getId() );
             *   Task one to sort the first json text array record
             *   better way to write is the create static comparator
             */
            record1.getTextArray().sort(new Text.TextComparator());
            record1.getTextArray().stream().map(n->n.getTextdata()).forEach(System.out::println);


            /**
             * # Task 2
             * ### Goal: "Merging data"
             * - Load both the `a1.json` and `a2.json` files from `resources`.
             * - Merge, sort, and print `textdata` in both `textArray` arrays by ID, in ascending order.
             * This is simply combining the 2 list and sorting in natural order
             */


            List<Text> combineList = record1.getTextArray();
            combineList.addAll(record2.getTextArray());
            combineList.stream().map(n -> n.getTextdata()).sorted().forEach(System.out::println);

            // Task 3
            combineList.stream().map(n -> n.getTextdata())
                    .map(Main::wordCount).forEach((stringIntegerMap -> stringIntegerMap.forEach((K, V) -> System.out.printf("%s  : %d\n", K, V))));

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    /**
     * word count function to return a map of word and its count
     * @param text
     * @return
     */
    static Map<String, Integer> wordCount(String text) {
        String[] words = text.split("\\P{L}+");
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            int count = map.getOrDefault(s, 0);
            map.put(s, ++count);
        }

        return map;
    }

}
