import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Map;
import java.util.List;

public class App {

    public static void main (String[] args) throws Exception {
//         fazer uma conexão HTTP e buscar os top 250 filmes

        String url = "https://imdb-api.com/en/API/Top250Movies/k0ojt0yvm";
        URI: endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

//        extrair so os dados que interessam (titulo, poster, clissificacao)

        List<Map<String, String>> listaDeFilmes
    }

}