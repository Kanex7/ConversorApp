package controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionAPI {
    public String conectarAPI(String monedaOrigen, String monedaDestino, double valorAConvertir){
        String url = "https://v6.exchangerate-api.com/v6/6aa39d6e745a6e0394689e19/pair/%s/%s/%f"
                .formatted(monedaOrigen,monedaDestino, valorAConvertir);

        try {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
