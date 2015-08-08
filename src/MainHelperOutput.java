import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by robot stuff on 8/8/15.
 * Done for fun!
 */
public class MainHelperOutput {

    private final Map<String, ColorGroup> groupMap;




    public MainHelperOutput() {

        Deed pacific = new Deed("Pacific Ave.", 200, 300, new int[]{26,130,390,900,1100,1275});
        Deed northC = new Deed("North Carolina Ave.", 200, 300, new int[]{26,130,390,900,1100,1275});
        Deed PA = new Deed("Pennsylvania Ave.", 200, 320, new int[]{28,150,450,1000,1200,1400});

        Set<Deed> greenDeeds = new HashSet<Deed>();
        greenDeeds.add(pacific);
        greenDeeds.add(northC);
        greenDeeds.add(PA);

        ColorGroup green = new ColorGroup(greenDeeds,"green");




        groupMap = new HashMap<String, ColorGroup>();
        groupMap.put("green", green);

        System.out.println(groupMap);
    }



    public static void main(String[] args) {


        new MainHelperOutput();


    }

}
