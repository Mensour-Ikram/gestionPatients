package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;

import com.example.demo.Repositories.PatientRepository;
import com.example.demo.entities.Patient;
import java.util.Date;
//import java.util.List;
@SpringBootApplication
public class TpJpa1Application implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(TpJpa1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null,"Ikram",new Date(),false,8));
		patientRepository.save(new Patient(null,"Hassan",new Date(),true,9));
		patientRepository.save(new Patient(null,"Hajar",new Date(),false,12));
		patientRepository.save(new Patient(null,"Imane",new Date(),false,13));
		System.out.println("*****************************");
		patientRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});
		/*
		System.out.println("*****************************");
		Patient  patient = patientRepository.findById(4L).get();
		System.out.println(patient.getNom());
		System.out.println("*****************************");
		Page<Patient> patients = patientRepository.findByNomContains("i",PageRequest.of(0, 2));
		patients.getContent().forEach(p->{
			System.out.println(p.toString());
		});
		System.out.println("*****************************");
		List<Patient> patientsM = patientRepository.findByMalade(true);
		patientsM.forEach(p->{
			System.out.println(p.toString());
		});
		System.out.println("*****************************");
		List<Patient> patients2 = patientRepository.findByNomContainsAndMalade("a", false);
		patients2.forEach(p->{
			System.out.println(p.toString());
		});
		patientRepository.deleteById(4L);
		
		System.out.println("*****************************");
		List<Patient> patients3 = patientRepository.findAll();
		patients3.forEach(p->{
			System.out.println(p.toString());
		});
		System.out.println("*****************************");
		Page<Patient> pagePatients = patientRepository.findAll(PageRequest.of(0, 2));
		System.out.println("Nombre de pages : "+pagePatients.getTotalPages());
		List<Patient> listPatients = pagePatients.getContent();
		listPatients.forEach(p->{
			System.out.println(p.toString());
		});*/
	}

}
 