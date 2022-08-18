import java.util.*;
class translate {
    public int romanToInt(String s) {
        int returned = 0;
        
        Hashtable<String, Integer> roman = new Hashtable<String, Integer>();
        roman.put("I",1);
        roman.put("V",5);
        roman.put("X",10);
        roman.put("L",50);
        roman.put("C",100);
        roman.put("D",500);
        roman.put("M",1000);
        
        ArrayList<String> letters = new ArrayList<String>(Arrays.asList(s.split("")));

            
        for(int i = s.length()-1; i >= 0; i--)
        {
            int temp;
            if (i>0 && (roman.get(letters.get(i-1)) < roman.get(letters.get(i))))
            {   
                temp = roman.get(letters.get(i)) - roman.get(letters.get(i-1));
                i--;
            }
            else{
                temp = roman.get(letters.get(i));
            }
            
            returned += temp;
        }
        return(returned);
    }
}