package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	private Integer PhysicianID;
//	private String role ;
	
	
	
	// TO DO: Constructor that takes an IDcopy
    public	Physician  (Integer ID) {   	
    	this.setPhysicianID(ID);

    }
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin) {
    	if (String.valueOf(pin).length() >= 4) {
    		this.pin = pin;
    		return true;
    	}
    	else {
		return false;
    	}
    }
    
    	
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	public Integer getPhysicianID() {
		return PhysicianID;
	}

	public void setPhysicianID(Integer physicianID) {
		PhysicianID = physicianID;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
			if(confirmedAuthID.equals(PhysicianID) ) {
				return true;	
			}
			else {
			return false;
			}
		}
		
	}
	

	

