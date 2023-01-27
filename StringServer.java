//code from week 2 wavelet repository
import java.io.IOException;
import java.net.URI;
import java.util.*;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String currentString;

    public String handleRequest(URI url) {

        if (url.getPath().equals("/")) {
            return String.format("Use the path \"add-message\" to add your request");
        }

        else if(url.getPath().contains("/add-message")){
            String[] concatParameters = url.getQuery().split("=");
            if (concatParameters[0].equals("s")){

                String toConcat = concatParameters[1];

                if(currentString == null){
                    currentString = toConcat;
                }
                else{
                    currentString = String.format(currentString + "\n" + toConcat);
                }

                return currentString;
            } 
        }

        return "404 Not Found!";
    }
        
}

class StringServer {
        public static void main(String[] args) throws IOException {
            if(args.length == 0){
                System.out.println("Missing port number! Try any number between 1024 to 49151");
                return;
            }

            int port = Integer.parseInt(args[0]);

            Server.start(port, new Handler());
        }
}
