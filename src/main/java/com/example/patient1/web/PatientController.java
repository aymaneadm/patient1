package com.example.patient1.web;


import com.example.patient1.entities.Patient;
import com.example.patient1.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor  //por genere rautomatiquememnt les controleurs
public class PatientController {
    private PatientRepository patientRepository;


    @GetMapping(path ="/index")
    public String patients(Model model ,
                           @RequestParam(name="page",defaultValue = "0") int page ,
                           @RequestParam(name="size",defaultValue  = "5") int size ){
        Page<Patient> pagePatients=patientRepository.findAll(PageRequest.of(page,size));
        model.addAttribute("listPatients",pagePatients.getContent());
        model.addAttribute("pages",new int[pagePatients. getTotalPages()]);

        model.addAttribute("currentPage",page);
        return  "patients";  //une vue
    }


}
