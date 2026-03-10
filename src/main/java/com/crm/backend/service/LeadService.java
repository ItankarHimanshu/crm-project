package com.crm.backend.service;

import com.crm.backend.model.Lead;
import com.crm.backend.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadService {

    @Autowired
    private LeadRepository leadRepository;

    public List<Lead> getAllLeads() {
        return leadRepository.findAll();
    }

    public Lead createLead(Lead lead) {
        return leadRepository.save(lead);
    }

    public Lead getLeadById(Long id) {
        return leadRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lead not found"));
    }

    public Lead updateLead(Long id, Lead updatedLead) {

        Lead lead = leadRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lead not found"));

        lead.setName(updatedLead.getName());
        lead.setContactInfo(updatedLead.getContactInfo());
        lead.setSource(updatedLead.getSource());
        lead.setStatus(updatedLead.getStatus());

        return leadRepository.save(lead);
    }

    public void deleteLead(Long id) {
        leadRepository.deleteById(id);
    }
}