package com.feurle.tiergesund.customers.web;

import com.feurle.tiergesund.customers.model.Owner;
import com.feurle.tiergesund.customers.model.OwnerRepository;
import io.micrometer.core.annotation.Timed;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/owners")
@RestController
@Timed("tiergesund.owner")
@RequiredArgsConstructor
@Slf4j
class OwnerResource {

    private final OwnerRepository ownerRepository;

    /**
     * Create Owner
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Owner createOwner(@Valid @RequestBody Owner owner) {
        log.info("Saving owner {}", owner);
        return ownerRepository.save(owner);
    }

    /**
     * Read single Owner
     */
    @GetMapping(value = "/{ownerId}")
    public Optional<Owner> findOwner(@PathVariable("ownerId") @Min(1) int ownerId) {
        final Optional<Owner> owner = ownerRepository.findById(ownerId);
        log.info("Find owner {}", owner);
        return owner;
    }

    /**
     * Read List of Owners
     */
    @GetMapping
    public List<Owner> findAll() {
        List<Owner> owners = ownerRepository.findAll();
        log.info("Getting owners {}", owners);
        return owners;
    }

    /**
     * Update Owner
     */
    @PutMapping(value = "/{ownerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateOwner(@PathVariable("ownerId") @Min(1) int ownerId, @Valid @RequestBody Owner ownerRequest) {
        final Optional<Owner> owner = ownerRepository.findById(ownerId);
        final Owner ownerModel = owner.orElseThrow(() -> new ResourceNotFoundException("Owner "+ownerId+" not found"));

        // This is done by hand for simplicity purpose. In a real life use-case we should consider using MapStruct.
        ownerModel.setFirstName(ownerRequest.getFirstName());
        ownerModel.setLastName(ownerRequest.getLastName());
        ownerModel.setCity(ownerRequest.getCity());
        ownerModel.setAddress(ownerRequest.getAddress());
        ownerModel.setTelephone(ownerRequest.getTelephone());
        log.info("Saving owner {}", ownerModel);
        ownerRepository.save(ownerModel);
    }
}
