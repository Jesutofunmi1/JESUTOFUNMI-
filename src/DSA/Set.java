package DSA;

public class Set {
    private ArrayList mySet = new ArrayList();
    public boolean IsEmpty() {

        return mySet.isEmpty();
    }

    public void add(String course) {
        mySet.addItem(course);

    }

    public int size() {
        return mySet.size();
    }
}
