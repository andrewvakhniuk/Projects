
import java.util.*;

public class Cars {
   public List getTypes(String type) {

     List types = new ArrayList();

     if (type.equals("sportCars")) {
       types.add("viper");
       types.add("camaro ss");
     }
     else if (type.equals("driftCars")) {
       types.add("supra");
       types.add("subaru");
       types.add("mitsubishi");
     }
     else if (type.equals("safeCars")) {
       types.add("volvo");
     }
     else if (type.equals("speedCars")) {
       types.add("indian2000");
       types.add("aaa");
     }
     else {
       types.add("Vending Machine");
     }
     return(types);
   }
}