package pl.coderslab.week6;

import com.jayway.jsonpath.JsonPath;
import org.apache.commons.io.IOUtils;

import java.util.List;

public class ProductsJsonExample {
    public static void main(String[] args) throws Exception {
        String json = IOUtils.toString(JsonPathExample.class.getResourceAsStream("/data/products.json"));

        List<String> allElectronicProducts = JsonPath.read(json,"$..[?(@.category == 'Electronics')].name");

        System.out.println("Wyświetl wszystkie produkty z kategorii elektronika:");

        for (String product : allElectronicProducts){
            System.out.println(product);
        }
    }
}
