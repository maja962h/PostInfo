public class Controller {

    Filehandler fh = new Filehandler();

    public String findCityFromZip(int zip){
        for (City c : fh.postIndexToList()){
            if (c.getZipCode() == zip){
                return c.getCityName();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        String result = controller.findCityFromZip(2720);
        System.out.println(result);



    }


}
