
package full_factory_method_pattern;

import java.util.ArrayList;

public class HardCandy_Peppermint extends Candy {
    
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for(int i = 1; i <= quantity; i++) {
            HardCandy_Peppermint hardCandy_Peppermint = new HardCandy_Peppermint(); 
            hardCandyPackage.add(hardCandy_Peppermint);
        }
        
        System.out.println("One package of " + quantity + " peppermints has been made!");
        return hardCandyPackage;
        
    }    
}
