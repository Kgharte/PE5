import java.util.HashMap;
import java.util.Map;

public class CharacterCount
{
    public HashMap<String, Boolean> countCharacterOccurance(String[] string)
    {
        HashMap<String,Boolean> map = new HashMap<>();
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
       // String str1 = string.toString();
        for(String str : string)
        {
            if(str.contains("a"))
            {
                count1 = count1 +1;
                if(count1>=2){
                    map.put(str,true);

                }
                else
                    {
                        map.put(str,false);
                    }
            }
            else if(str.contains("b"))
            {
                count2 = count2 +1;
                if(count2>=2){
                    map.put(str,true);
                }
                else
                {
                    map.put(str,false);
                }
            }
            else if(str.contains("c"))
            {
                count3 = count3 +1;
                if(count3>=2){
                    map.put(str,true);
                }
                else
                {
                    map.put(str,false);
                }
            }
            else if(str.contains("d"))
            {
                count4 = count4 +1;
                if(count4>=2){
                    map.put(str,true);
                }
                else
                {
                    map.put(str,false);
                }
            }


        }

        
        return map;
    }
}
