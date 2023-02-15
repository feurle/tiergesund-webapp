package com.feurle.tiergesund.vets.web;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import com.feurle.tiergesund.vets.model.Vet;
import com.feurle.tiergesund.vets.model.VetRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/vets")
@RestController
@RequiredArgsConstructor
class VetResource {

    private final VetRepository vetRepository;

    @GetMapping
    @Cacheable("vets")
    public List<Vet> showResourcesVetList() {
        return vetRepository.findAll();
    }
}
