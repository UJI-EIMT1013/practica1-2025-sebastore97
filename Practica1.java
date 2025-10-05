package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
        public static Set<Integer> multiplos (Iterator<Integer> it) {
            List<Integer> lista_base = new ArrayList<>();
            Set<Integer> setMultiplos = new HashSet<>();

            while (it.hasNext()) {
                int val = it.next();
                if (val != 0)
                    lista_base.add(val);
            }

            for (int i = 0; i < lista_base.size(); i++) {
                int val_A = lista_base.get(i);
                for (int j = i + 1; j < lista_base.size(); j++) {
                    int val_B = lista_base.get(j);
                    if ((val_A % val_B) == 0) {
                        setMultiplos.add(val_A);
                        break;
                    }
                }
            }

            return setMultiplos;
        }


    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {
        //TODO

    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
