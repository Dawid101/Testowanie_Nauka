package pl.coderslab.week6;

import com.jayway.jsonpath.JsonPath;
import org.apache.commons.io.IOUtils;

import java.util.List;

public class ClientsJsonExample {
    public static void main(String[] args) throws Exception {
        String json = IOUtils.toString(JsonPathExample.class.getResourceAsStream("/data/clients.json"));
        List<String> allClients = JsonPath.read(json,"$..[?(@.country == 'USA')].name");


        System.out.println("Klienci z USA");
        for(String client : allClients){
            System.out.println(client);
        }
    }
}
