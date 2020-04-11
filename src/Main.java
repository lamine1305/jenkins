import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        List couleurs= new ArrayList();
        couleurs=Arrays.asList("rouge", "bleu", "verte","noires","orange","marron","gris");

        Stream st = couleurs.parallelStream();
         Collection <String> newList= (Collection<String>) st.sorted((p1, p2)->p1.toString().length()-p2.toString().length())
                 .limit(4)
                 .filter(p->p.toString().contains("r"))
                 .collect(Collectors.toList());

         newList.forEach(x->System.out.println(x));
        System.out.println("GESTION DES STREAM D'ENTIERS");
         Stream<Integer> ss= Arrays.asList(1,2,3,4,5,6).stream();
         ss.filter(x->x>3)
                 .sorted((b,a)->a.compareTo(b))
                 .forEach(a->System.out.println(a));
        System.out.println("GESTION DES STREAM A PARTIR D'UN TABLEAU");

        Integer[] table={1,2,3,4,5,6,7,8};
        Arrays.stream(table).
                filter(x->x%2==0).sorted((t,u)->u.compareTo(t)).
                forEach(System.out::println);
        
        System.out.println("fin du programme lamine1305");
	System.out.println(" - -  - Validation de la part de lamine1306");	
cfdnvjkkfhvbfgj
        System.out.println("fin du programme lamine1305 . . .1305");
	

    }
}
