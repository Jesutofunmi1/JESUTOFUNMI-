//import PhoneBook.UserInfo;
//import PhoneBook.UserInfoException;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class PhoneBookTest {
//
//    Phonebook phonebook;
//
//    UserInfo contactInfo;
//
//    UserInfo contactInfo2;
//    private String fullName;
//
//    @BeforeEach
//    @DisplayName
//
//            ("To create contacts to use for unit testing")
//
//    void setUp() {
//        phonebook = new Phonebook();
//        contactInfo = new UserInfo("Samuel", "+2347088189321");
//        contactInfo2 = new UserInfo("Daddy", "+2348037151516");
//    }
//
//
//    @Test
//    @DisplayName("To test we can set user contact details for unit tests")
//    void testThatUserDetailIsDefined() {
//        assertEquals("Samuel Daddy", contactInfo.getFullName());
//        contactInfo.setAddress("Emily Akinola");
//        assertEquals("Emily Akinola", contactInfo.getAddress());
//        assertEquals("+2347088189321", contactInfo.getPhone_Number());
//        contactInfo.setSecurityNumber("456789987654");
//        assertEquals("456789987654", contactInfo.getSecurityNumber());
//        contactInfo.setEmail("xiamie.africa");
//        assertEquals("xiamie.africa", contactInfo.getEmail());
//        System.out.println(contactInfo);
//    }
//    @Test
//    @DisplayName
//            ("To test that phonebook is empty and available to add contacts")
//    void testThatWeCanHaveEmptyArrayOfPhoneBook() {
//        assertTrue(phonebook.isEmpty());
//
//    }
//    @Test
//    @DisplayName("To test that we can add contacts to phonebook")
//    void testThatWeCanAddUserInfo() {
//        phonebook.addUserInfo(contactInfo);
//        assertEquals(0, phonebook.getSize());
//
//    }
//    @Test
//    @DisplayName("To check that phonebook increments when more contacts are added")
//    void testThatWeCanAddMoreUserInfo_sizeIncrements() {
//        phonebook.addUserInfo(contactInfo);
//        phonebook.addUserInfo(contactInfo2);
//        assertEquals(0, phonebook.getSize());
//        System.out.println(contactInfo);
//    }
//    @Test
//    @DisplayName("To test that we can delete from the phonebook and that size decrements")
//    void testThatWeCanRemoveContactFromPhoneBook() {
//        phonebook.addUserInfo(contactInfo);
//        phonebook.addUserInfo(contactInfo2);
//        phonebook.removeUserInfo(contactInfo);
//        assertEquals(0, phonebook.getSize());
//    }
//    @Test
//    @DisplayName("This is to test we can get contact"+
//    "information by index and return the name")
//    void testThatWeCanGetContactByIndex_getName() {
//        phonebook.addUserInfo(contactInfo);
//        phonebook.addUserInfo(contactInfo2);
//        assertEquals("+2347088189321", phonebook.getContactInfo(0).getPhone_Number());
//    }
//    @Test
//    @DisplayName("Test to search for contacts by the name and return telephone number")
//    void testThatWeCanGetContactBYName()throws UserInfoException {
//    phonebook.addUserInfo(contactInfo);
//    phonebook.addUserInfo(contactInfo2);
//    phonebook.editUserInfo("Samuel", "Jesutofunmi");
//    assertEquals("Daddy", phonebook.getContact("Jesutofunmi").getFullName());
//
//
//    }
//}
