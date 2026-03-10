package com.crm.backend.controller;

import com.crm.backend.model.Lead;
import com.crm.backend.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leads")
@CrossOrigin("*")
public class LeadController {

    @Autowired
    private LeadService leadService;

    @GetMapping
    public List<Lead> getAllLeads() {
        return leadService.getAllLeads();
    }

    @PostMapping
    public Lead createLead(@RequestBody Lead lead) {
        return leadService.createLead(lead);
    }

    @GetMapping("/{id}")
    public Lead getLeadById(@PathVariable Long id) {
        return leadService.getLeadById(id);
    }

    @PutMapping("/{id}")
    public Lead updateLead(@PathVariable Long id, @RequestBody Lead lead) {
        return leadService.updateLead(id, lead);
    }

    @DeleteMapping("/{id}")
    public String deleteLead(@PathVariable Long id) {
        leadService.deleteLead(id);
        return "Lead deleted successfully";
    }
}