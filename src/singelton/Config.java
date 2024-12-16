package singelton;

public class Config {
    private String name;
    private static Config instance;

    private Config() {
        // read application properties
    }

    public static Config getInstance(){   // остается проблема с многопоточностью
        if (instance == null){
            instance = new Config();
        }
        return instance;
    }
}
