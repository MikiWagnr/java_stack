package java_stack.oop.caresoft;

import java.util.ArrayList;
import java.util.Date;


public class Physician extends User implements HIPPAACompliantUser {
        //... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID

    public Physician(int id) {
        super(id);
    }

    // TO DO: Implement HIPAACompliantUser!
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    @Override
    public boolean assignPin(int pin) {
        if(pin > 1000 && pin < 9999){
            return true;
        } else {
            return false;
        }
        
    
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        System.out.println(confirmedAuthID);
        System.out.println(this.id);
        return (this.id == confirmedAuthID);
        

    }


    public ArrayList<String> getPatientNotes() {
        return this.patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }

}
