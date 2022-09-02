package DSA;


import PhoneBook.UserInfo;

public class ArrayList implements List {


private final String [] arraylist = new String[5];
 boolean isEmpty = true;

int size;
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addItem(String item) {
        arraylist[size++] = item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void removeItem(String item) {
    arraylist[size--] = item;
    }

    @Override
    public String getIndex(int index) {
        return arraylist[index];
    }

    @Override
    public void add(UserInfo contactInfo) {

    }

    @Override
    public void remove(UserInfo contactInfo) {

    }

    @Override
    public UserInfo get(int index) {
        return null;
    }


}
