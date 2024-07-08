package bt1;

import java.awt.print.Book;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//        long count = arr.stream().filter(el -> el %2 == 0).count();
//        System.out.println(count);

//        Stream<String> stream = Stream.of("blue", "red", "green");
//        System.out.println(stream.map(s -> {return s.toUpperCase();}).collect(Collectors.toList()));

        int max = arr.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);
        for (int i = 0; i < arr.size(); i++) {
            int number = inoutNumber(scanner)
        }
    }
    public static int inoutNumber(Scanner scanner) {
        System.out.println("nhap so luong can them");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            Book book = new Book();
            book.
        }
    }
}
