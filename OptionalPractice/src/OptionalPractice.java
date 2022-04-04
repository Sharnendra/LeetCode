import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalPractice {

    public static void main(String[] args) {
        Map<Integer, Map<Integer, List<String>>> data = CollectionUtilsClass.getMapLink();
        Map<Integer, Map<Integer, List<String>>> data2 = null;

        data.put(4, null);

        Stream<String> lst = Optional.ofNullable(data)
                .map(x-> x.entrySet()
                        .stream()
                        .filter(y ->y.getKey() != 5 && y.getValue()!=null)
                        .flatMap(z -> z.getValue().entrySet().stream())
                        .filter(k -> k.getKey()!=3)
                        .flatMap(val -> val.getValue().stream())
                        .collect(Collectors.toList())
                        .stream())
                .orElse(null);

                lst.forEach(System.out::println);


                /*.flatMap(n -> n.collect(Collectors.toMap()))
                .filter(y ->y.getKey() != 5 && y.getValue()!=null
                        .flatMap(z -> z.getValue().entrySet().stream())
                        .filter(k -> k.getKey()!=3)
                        .flatMap(val -> val.getValue().stream())
                        .forEach(System.out::println));*/

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        Optional.ofNullable(data2)
                .ifPresent(x-> x.entrySet().stream().filter(y ->y.getKey() != 5 && y.getValue()!=null)
                        .flatMap(z -> z.getValue().entrySet().stream())
                        .filter(k -> k.getKey()!=3)
                        .flatMap(val -> val.getValue().stream())
                        .collect(Collectors.toList()));
    }
}