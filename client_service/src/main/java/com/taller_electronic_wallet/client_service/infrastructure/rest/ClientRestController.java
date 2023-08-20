package com.taller_electronic_wallet.client_service.infrastructure.rest;

import com.taller_electronic_wallet.client_service.domain.dto.ClientDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientRestController {

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody ClientDTO requestDto){
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> editClient(@PathVariable Long id, @RequestBody ClientDTO requestDto){
        return ResponseEntity.ok().build();
    }

        @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteClientById(@PathVariable Long id){
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> getClientById(@PathVariable Long id){
        return ResponseEntity.ok().body(ClientDTO.builder().build());
    }

    @PostMapping("/transfer")
    public ResponseEntity<?> transfer(){
        return ResponseEntity.ok().build();
    }

    @GetMapping("/record/{id}")
    public ResponseEntity<?> getRecord(Long id){
        return ResponseEntity.ok().build();
    }
}
