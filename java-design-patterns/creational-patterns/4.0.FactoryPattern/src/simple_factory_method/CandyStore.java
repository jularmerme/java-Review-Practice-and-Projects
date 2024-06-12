package simple_factory_method;

public class CandyStore {

    public static void main(String[] args) {

        CandyFactory candyFactory = new CandyFactory();
        candyFactory.getCandyPackage(12, "chocolate");
        candyFactory.getCandyPackage(7, "hard candy");
        
    }
    
}
