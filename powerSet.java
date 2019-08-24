import java.util.Vector;

public class powerSet {

    public static void main(String[] args) {
        Vector arr = new Vector(3);
        arr.add("Vikas");
        arr.add("Amit");
        arr.add("Prashant");
        Vector v = new Vector(arr.size());
        powerset(v, arr);
    }

    static void powerset(Vector v, Vector s) {
        if (s.size() == 0)
            System.out.println(v);

        else {
            String first = new String();
            first = s.firstElement().toString();
            v.add(first);
            s.remove(first);
            powerset(v, s);

            v.remove(first);
            powerset(v, s);
            s.insertElementAt(first, 0);
        }
    }
}