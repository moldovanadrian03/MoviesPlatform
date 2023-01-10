package MovieRecommandationPlatform;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        ConnectToDB db = new ConnectToDB();
        db.connect_to_db("MoviePlatform", "postgres", "postgres");
    }
}

