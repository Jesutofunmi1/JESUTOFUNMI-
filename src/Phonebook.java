//import DSA.ArrayList;
//import DSA.List;
//import PhoneBook.UserInfo;
//import PhoneBook.UserInfoException;
//
//public class Phonebook {
//
//
//    private final List phoneBookArray = new ArrayList();
//
//    public boolean isEmpty() {
//        return phoneBookArray.size() == 0;
//    }
//
//
//    public void addUserInfo(UserInfo contactInfo) {
//        phoneBookArray.add(contactInfo);
//    }
//
//
//    public int getSize() {
//        return phoneBookArray.size();
//    }
//
//
//    public void removeUserInfo(UserInfo contactInfo) {
//        phoneBookArray.remove(contactInfo);
//    }
//
//    public UserInfo getContactInfo(int index) {
//        return phoneBookArray.get(index);
//    }
//
//    public void editUserInfo(String oldInfo, String newInfo) throws UserInfoException {
//        getContact(oldInfo);
//    }
//
//    public Object getContact(String name) throws UserInfoException {
//        UserInfo phoneNumber = null;
//        for (UserInfo check : phoneBookArray) {
//            if (check.getFullName().equals(name)) {
//                phoneNumber = check;
//            }
//        }
//        return null;
//    }
//
//    private String getFullName() {
//        return null;
//    }
//}
//
