import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapCount
{

    public HashMap<String, Integer> countWordOccurance(String string) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String str: string.split("[^a-zA-Z0-9]+"))
        {
            if(map.containsKey(str))
            {
                int count=map.get(str);
                map.put(str,count+1);
            }
            else
            {
                map.put(str,1);
            }
        }
        return map;
    }
}
