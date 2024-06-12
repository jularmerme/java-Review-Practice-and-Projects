
package singleton_threadsafe_example;

public class PrintSpooler {
    
    private static final PrintSpooler spooler = new PrintSpooler();
    
    private static boolean initialized = false;
    
    private PrintSpooler(){}
    
    private void init() {
        // Code to initialize our printer spooler goes here
    }
    
    public static synchronized PrintSpooler getInstance() {
        
        if(initialized) return spooler;
        spooler.init();
        initialized = true;
        return spooler;
                
    }            
    
}
