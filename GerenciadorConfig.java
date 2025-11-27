public class GerenciadorConfig {

    
    private static GerenciadorConfig instance;

    
    private GerenciadorConfig() {
        
    }

    public static GerenciadorConfig getInstance() {
        if (instance == null) {
            instance = new GerenciadorConfig();
        }
        return instance;
    }
}
