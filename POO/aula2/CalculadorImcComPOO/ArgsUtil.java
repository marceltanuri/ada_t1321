class ArgsUtil{
    static String getString(String param, String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals(param) && i + 1 < args.length) {
                return args[i + 1];
            }
        }
        return null;
    }

    static Double getDouble(String param, String[] args) {
        String value = getString(param, args);
        if(value!=null){
            return Double.parseDouble(value);
        }
        return null;
    }

    static Double getDouble(String param, String[] args, double defaultValue) {
        Double value = getDouble(param, args);
        return value!=null?value:defaultValue;
        
    }

    static String getString(String param, String[] args, String defaultValue) {
        String string = getString(param, args);
        return string!=null?string:defaultValue;
        
    }

}