package java8.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsUsingStream {
    public static void main(String[] args){
        List<String> languages = List.of(
                "english",
                "chinese",
                "french",
                "spanish",
                "hindi",
                "english",
                "french"
        );
        Set<String> uniqueLanguages = new HashSet<>();
        Set<String> duplicateLanguages = languages.stream()
                .filter(language -> {
                   boolean t= !uniqueLanguages.add(language);
                   System.out.println("**********t***"+t);
                return t;}
                )
                .collect(Collectors.toSet());

        duplicateLanguages.forEach(System.out::println);
        System.out.println("**********Dupt***");
        Set<String> dup = languages.stream().filter(language -> !uniqueLanguages.add(language)).collect(Collectors.toSet());
        dup.forEach(System.out::println);
    }
}
