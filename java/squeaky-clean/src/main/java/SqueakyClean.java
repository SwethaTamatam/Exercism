class SqueakyClean {
    static String clean(String identifier) {
        int len = identifier.length();
        StringBuilder s = new StringBuilder();
        for(int i=0;i<len;i++){
            if(identifier.charAt(i) == ' '){
                s.append('_');
            }
            if(Character.isISOControl(identifier.charAt(i))){
                s.append("CTRL");
            }
            if(identifier.charAt(i) == '-' && 
                Character.isLetter(identifier.charAt(i+1))){
                    s.append(Character.toUpperCase(identifier.charAt(i+1)));
                    i+=2;
            }
            int unicode = (int) identifier.charAt(i);
            if(unicode>=945 && unicode<=969){
                continue;
            }
            if(Character.isLetter(identifier.charAt(i))){
                s.append(identifier.charAt(i));
            }

        }
        String result = s.toString();
        return result;
    }
}
