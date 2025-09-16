package pl.coderslab.week6;

import com.jayway.jsonpath.JsonPath;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.List;

public class JsonPathExample {
    public static void main(String[] args) throws IOException {
        // Odczytanie zawartości pliku JSON
        String json = IOUtils.toString(JsonPathExample.class.getResourceAsStream("/data/books.json"));

        // Użycie JsonPath do wyodrębnienia tytułów książek, które kosztują mniej niż 15 jednostek waluty
        List<String> titles = JsonPath.read(json, "$.books[?(@.price < 15)].title");

        // Wyświetlenie tytułów
        System.out.println("Tytuły książek, które kosztują mniej niż 15 jednostek waluty:");

        for (String title : titles) {
            System.out.println(title);
        }
    }
}
