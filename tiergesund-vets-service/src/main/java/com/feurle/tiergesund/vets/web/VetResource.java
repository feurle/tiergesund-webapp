package com.feurle.tiergesund.vets.web;

import com.feurle.tiergesund.vets.model.Vet;
import com.feurle.tiergesund.vets.model.VetRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/vets")
@RestController
@RequiredArgsConstructor
class VetResource {

    private final Logger log = LoggerFactory.getLogger(VetResource.class);
    private final VetRepository vetRepository;

    @GetMapping
    @Cacheable("vets")
    public List<Vet> showResourcesVetList() {
        List<Vet> vets = vetRepository.findAll();
        log.info("showResourcesVetList called: {}", vets);
        return vets;
    }
}
