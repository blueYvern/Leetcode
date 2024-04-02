import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic{

    public static boolean isIsomorphic(String s, String t) {       
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> isoMap = new HashMap<Character,Character>();
        HashSet<Character> mapSet = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            Character sc = s.charAt(i);
            Character tc = t.charAt(i);
            if(isoMap.containsKey(sc)){
                if(isoMap.get(sc)!=tc){
                    return false;
                }
            }
            else{
                if(mapSet.contains(tc)){
                    return false;
                }
            }
            isoMap.put(sc, tc);
            mapSet.add(tc);                    
        }
    return true;
    }

    public static boolean isIsomorphicNew(String s, String t){
        if(s.length() != t.length())
            return false;
        char[] map = new char[256];
        boolean[] mapped = new boolean[256];
        for(int i =0; i<s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
        
            if (map[sc] == 0) {
                if (mapped[tc]) {
                    return false;
                }
                map[sc] = tc;
                mapped[tc] = true;
            } else {
                if (map[sc] != tc) {
                    return false;
                }
            }
        }
        return true;
    }
}
