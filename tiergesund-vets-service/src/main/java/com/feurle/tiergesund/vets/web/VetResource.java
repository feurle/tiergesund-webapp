package com.feurle.tiergesund.vets.web;

import com.feurle.tiergesund.vets.model.Vet;
import com.feurle.tiergesund.vets.model.VetRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/vets")
@RestController
@RequiredArgsConstructor
@Slf4j
class VetResource {

    private final VetRepository vetRepository;

    @GetMapping
    @Cacheable("vets")
    public List<Vet> showResourcesVetList() {
        List<Vet> vets = vetRepository.findAll();
        log.info("Get all vets: {}", vets);
        return vets;
    }
}
