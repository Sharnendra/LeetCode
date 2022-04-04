import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class CollectionUtilsClass {

    private static Function<Integer, Map<Integer, List<String>>> createMap = (value) -> {
        if(value>0) {
            Map<Integer, List<String>> output;
            List<String> data;
            switch(value){
                case 1: data = new ArrayList(){{
                            add("Primary");
                            add("Phillipines");
                        }};
                        output = new LinkedHashMap(){{
                            put(1, data);
                        }};
                        return output;
                case 2: data = new ArrayList(){{
                            add("Secondary");
                            add("Source");
                        }};
                        output = new LinkedHashMap(){{
                            put(2, data);
                        }};
                        return output;
                case 3: data = new ArrayList(){{
                            add("Thirdary");
                        }};
                        output = new LinkedHashMap(){{
                            put(3, data);
                        }};
                        return output;
                case 4: data = new ArrayList(){{
                            add("Fourth");
                            add("Facionist");
                        }};
                        output = new LinkedHashMap(){{
                            put(4, data);
                        }};
                        return output;
                case 5: data = new ArrayList(){{
                            add("Fifth");
                            add("Force");
                        }};
                        output = new LinkedHashMap(){{
                            put(5, data);
                        }};
                        return output;
                case 6: data = new ArrayList(){{
                            add("Six");
                        }};
                        output = new LinkedHashMap(){{
                            put(6, data);
                        }};
                        return output;
                case 7: data = new ArrayList(){{
                            add("Seven");
                            add("Steve");
                        }};
                        output = new LinkedHashMap(){{
                            put(7, data);
                        }};
                        return output;
                case 8: data = new ArrayList(){{
                            add("Eight");
                            add("Elegant");
                        }};
                        output = new LinkedHashMap(){{
                            put(8, data);
                        }};
                        return output;
                case 9: data = new ArrayList(){{
                            add("Ninth");
                        }};
                        output = new LinkedHashMap(){{
                            put(9, data);
                        }};
                        return output;
                case 0: data = new ArrayList(){{
                            add("Tenth");
                            add("torture");
                        }};
                        output = new LinkedHashMap(){{
                            put(10, data);
                        }};
                        return output;
            }
        }
        return null;
    };

    public static Map<Integer, Map<Integer, List<String>>> getMapLink(){
        Map<Integer, Map<Integer, List<String>>> ins = new LinkedHashMap<>();
        ins.put(1, createMap.apply(1));
        ins.put(2, createMap.apply(2));
        ins.put(3, createMap.apply(3));
        ins.put(4, createMap.apply(4));
        ins.put(5, createMap.apply(5));
        ins.put(6, createMap.apply(6));
        ins.put(7, createMap.apply(7));
        ins.put(8, createMap.apply(8));
        ins.put(9, createMap.apply(9));
        return ins;
    }


}
