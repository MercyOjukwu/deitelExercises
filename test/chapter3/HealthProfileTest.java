package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthProfileTest {

    HealthProfile patientProfile;
    @BeforeEach
    public void beginEachTestWith(){
        patientProfile = new HealthProfile();
    }


    @Test
    public void classCanBeCreated(){
        HealthProfile patientProfile = new HealthProfile();
    }

    @Test
    public void set_and_GetPatientFirstName(){
        HealthProfile.setFirstName("Shi-buzo");
        assertEquals("Shi-buzo", patientProfile.getFirstName());
    }

    @Test
    public void set_and_GetPatientLastName(){
        patientProfile.setLastName("Wayana");
        assertEquals("Wayana", patientProfile.getLastName());
    }


    @Test
    public void set_and_GetPatientDateOfBirth(){
        patientProfile.setDateOfBirth(26,9,2000);
        assertEquals("26/9/2000", patientProfile.GetDateOfBirth());
    }

    @Test
    public void calculateAge(){
        patientProfile.setDateOfBirth(26,9,2000);
        assertEquals(22, patientProfile.calculateAge());
    }

    @Test
    public void calculateTargetHeartRange(){
        patientProfile.setDateOfBirth(26,9,2000);
        patientProfile.calculateAge();
        assertEquals(198, patientProfile.calculateTargetHeartRange());
    }

    @Test
    public void calculateBodyHeight(){
        patientProfile.calculatePatientHeight(0.0254,100);
        assertEquals(2.54, patientProfile.getPatientHeight());
    }

    @Test
    public void calculateBodyWeight(){
        patientProfile.calculatePatientWeight(0.453592,100);
        assertEquals(45.3592, patientProfile.getPatientWeight());
    }








}
