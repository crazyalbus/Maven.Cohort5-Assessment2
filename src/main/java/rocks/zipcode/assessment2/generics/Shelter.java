package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> implements Iterable {

    private T t;
    private List<T> occupants;

    public Shelter() {
        occupants = new ArrayList<>();

//        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {

        return occupants.size();
    }

    public void add(T t) {
        occupants.add(t);
    }

    public Boolean contains(T t) {
        return occupants.contains(t);
    }

    public void remove(T t) {
        occupants.remove(t);
    }

    public Object get(Integer index) {
        return occupants.get(index);
    }

    public Integer getIndexOf(T ageable) {

        Integer index = -1;

        for (int i = 0; i < occupants.size() ; i++) {
            if(occupants.get(i) == ageable) {
                index = i;
            }
        }
        return index;
    }

    public Iterator iterator() {
        return null;
    }
}