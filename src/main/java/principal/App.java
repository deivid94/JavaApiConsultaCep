package principal;

import ConectaApi.ConectApi;
import solicitaCep.SolicitaCep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    public static  void main(String[] args) throws IOException, InterruptedException {

        ConectApi urlConexao = new ConectApi();
        SolicitaCep novaSolicitacaoCep = new SolicitaCep();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlConexao.getApiUrl()+novaSolicitacaoCep.getGuardaCep()+urlConexao.getApiUrltTail()))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

}
