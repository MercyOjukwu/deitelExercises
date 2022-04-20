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
        patientProfile.setFirstName("Shi-buzo");
        assertEquals("Shi-buzo", patientProfile.getFirstName());
    }

    @Test
    public void set_and_GetPatientLastName(){
        patientProfile.setLastName("Wayana");
        assertEquals("Wayana", patientProfile.getLastName());
    }



    @Test
    public void set_and_GetPatientDateOfBirth(){
        patientProfile.setDateOfBirth("26/09/2000");
        assertEquals("26/09/2000", patientProfile.GetDateOfBirth());
    }
















}
