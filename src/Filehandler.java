import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filehandler {

    public ArrayList<City> postIndexToList(){
        File postFil = new File("data/postnumre.csv");
        ArrayList<City> postIndex = new ArrayList<>();
        String[] data = new String[0];
        
        try{
            Scanner scan = new Scanner(postFil);
            scan.nextLine();
            while(scan.hasNext()){
                String line = scan.nextLine();
                data = line.split(";");

                int zipCode = Integer.parseInt(data[0]);
                String cityName = data[1];
                City city = new City(zipCode, cityName);

                postIndex.add(city);
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("No no, bad move.");
        }

        return postIndex;
    }

}
