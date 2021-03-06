package ThinkInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> collection) {
        super(collection);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() -1;
                    public boolean hasNext() {
                        return current >-1;
                    }

                    @Override
                    public T next() {
                        return get(current --);
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("hello wayne zhong my friend".split(" ")));
        for (String s : ral){
            System.out.print(s+" ");
        }
        System.out.println("\n"+"reversed version:");
        for (String s: ral.reversed()){
            System.out.print(s+" ");
        }
    }
}
