package control;

import java.util.HashMap;

public class MapCommand {
    
    HashMap<String,Command>setcommand;

    public MapCommand(HashMap<String, Command> setcommand) {
        this.setcommand = setcommand;
    }

    public MapCommand() {
        setcommand=new HashMap<>();
    }

    public Command get(String key) {
        return setcommand.get(key);
    }

    public Command put(String key, Command value) {
        return setcommand.put(key, value);
    }
}
