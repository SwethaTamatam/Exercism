import java.util.HashMap;
import java.util.Map;
class RnaTranscription {
    private static Map<Character,Character> charMap = new HashMap<Character,Character>();
    String transcribe(String dnaStrand) {
    charMap.put('G','C');
    charMap.put('C','G');
    charMap.put('T','A');
    charMap.put('A','U');
      String result="";
      for(int i=0;i<dnaStrand.length();i++){
             if(charMap.containsKey(dnaStrand.charAt(i))){
                 result+=charMap.get(dnaStrand.charAt(i));
             }else{
                 result+=dnaStrand.charAt(i);
             }
        }
        return result;
    }
    
}
