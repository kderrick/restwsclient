package com.kyle.restwsclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.kyle.restwsclient.model.Patient;

public class PatientWSClient {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/restws/services/patientservice/patients/123");
		
		Builder request = target.request();
		
		Patient patient = request.get(Patient.class);
		
		System.out.println(patient.getName());
		System.out.println(patient.getId());
	}

}