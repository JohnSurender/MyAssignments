package week3.assignments.overloading;

public class APIClient {
    public void sendRequest(String endPoint){
        System.out.println("EndPoint: "+endPoint);
    }
    public void sendRequest(String endPoint, String requestBody, boolean requestStatus){

        System.out.println(" EndPoint: "+endPoint+ " RequestBody: " +requestBody+ " RequestStatus: "+requestStatus);
    }

    public static void main(String[] args) {
        APIClient apiClient = new APIClient();
        apiClient.sendRequest("exit");
        apiClient.sendRequest("Exit","Sucess", true);


    }
}
/*
public class APIClient {
    // Method with one String parameter
    public void sendRequest(String endPoint) {
        System.out.println("Endpoint: " + endPoint);
    }

    // Overloaded method with String, String, and boolean parameters
    public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
        System.out.println("Endpoint: " + endPoint + ", Request Body: " + requestBody + ", Request Status: " + requestStatus);
    }

    public static void main(String[] args) {
        APIClient apiClient = new APIClient();
        apiClient.sendRequest("exit");  // Calls sendRequest(String)
        apiClient.sendRequest("Exit", "Success", true); // Calls sendRequest(String, String, boolean)
    }
}

*/