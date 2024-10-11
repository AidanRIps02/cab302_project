package qut.group83.cab302_project;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherFetcher {
    private HttpClient client = HttpClient.newHttpClient();

    /**
     * Fetches a user from the dummyJSON API.
     * GET: https://api.weather.bom.gov.au/v1/locations/[geohash]/forecasts/daily
     *
     * @param geohash the GeoHash of the location to fetch
     * @return the DummyUser object
     */
    public DummyUser fetchDummyUser(String geohash) {
        String url = "https://api.weather.bom.gov.au/v1/locations/" + geohash + "/forecasts/daily";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return DummyUser.fromJson(response.body());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("working");
            return null;
        }
    }

    /**
     * Fetches multiple users from the dummyJSON API.
     * GET: https://dummyjson.com/users
     *
     * @return the DummyUser[] object
     */

    //https://sws-data.sws.bom.gov.au/api/v1/
//    public DummyUser[] fetchDummyUsers() {
//        String url = "https://dummyjson.com/users";
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(url))
//                .build();
//        try {
//            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            return DummyUsers.fromJson(response.body()).getDummyUsers();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public DummyUser[] searchDummyUsers(String name) {
//        String url = "https://dummyjson.com/users" + name;
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(url))
//                .build();
//        try {
//            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            return DummyUsers.fromJson(response.body()).getDummyUsers();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    /**
     * Fetches a user's todo-list from the dummyJSON API.
     * GET: https://dummyjson.com/users/{id}/todos
     *
     * @param id the ID of the user to fetch the todo-list for
     * @return the DummyTodo[] object
     */
//    public DummyTodo[] fetchDummyTodos(int id) {
//        String url = "https://dummyjson.com/users" + id + "/todos";
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(url))
//                .build();
//        try {
//            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            return DummyTodos.fromJson(response.body()).getDummyTodos();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}