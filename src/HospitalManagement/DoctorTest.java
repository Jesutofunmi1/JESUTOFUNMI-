package HospitalManagement;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class DoctorTest {
    DoctorStranger doctor = new DoctorStranger("Jesutofunmi");

    @Test
    void DoctorNameCanBeSet() {
        DoctorStranger doctor = new DoctorStranger("Jesutofunmi");
        assertEquals("Jesutofunmi", doctor.getDoctorName());
    }
//    @Test
//    void patientArrayListExits(){
//        assertNotNull(doctor.patient);
//}
//    @Test
//    void patientCanBeAddedToArrayListTest(){
//        doctor.selectPatient("David");
//        doctor.selectPatient("Joseph");
//        doctor.selectPatient("Samuel");
//        doctor.selectPatient("Tunde");
//        assertFalse(doctor.patient.isEmpty());
//        System.out.println(doctor.patient);
//
//    }
//
//    @Test
//    void patientsCanBeRemovedTest(){
//        doctor.selectPatient("Joseph");
//        doctor.selectPatient("Tunde");
//        doctor.selectPatient("Samuel");
//        doctor.selectPatient("David");
//        doctor.removePatient("Joseph");
//        System.out.println(doctor.patient);
//    }
//    @Test
//    void getDoctorSpecialty(){
//        doctor.setDoctorSpecialty("Optician");
//        assertTrue(doctor.getDoctorSpecialty().equals("Optician"));
//    }
}
