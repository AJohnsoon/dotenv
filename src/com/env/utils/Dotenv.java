package src.com.env.utils;

public class Dotenv {
    public String LocalEnvironment(String dotEnvironment, String path){
        String systemEnv = String.valueOf(System.getenv());
        String environment = String.valueOf(systemEnv.contains(dotEnvironment))
                .replace("true", path);

        if(systemEnv.contains(dotEnvironment) == false){
            return " - *Error: property not found in '.env' file\n";
        }
        return environment;
    }
}
