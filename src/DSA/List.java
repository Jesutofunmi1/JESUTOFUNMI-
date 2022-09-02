package DSA;

import PhoneBook.UserInfo;

public interface List {

    boolean isEmpty();

    void addItem(String item);

    int size();

    void removeItem(String item);


    String getIndex(int index);

    void add(UserInfo contactInfo);

    void remove(UserInfo contactInfo);

    UserInfo get(int index);
}
