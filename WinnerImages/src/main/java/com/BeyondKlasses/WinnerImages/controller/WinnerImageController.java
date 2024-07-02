package com.BeyondKlasses.WinnerImages.controller;

import com.BeyondKlasses.WinnerImages.model.WinnerImages;
import com.BeyondKlasses.WinnerImages.service.WinnerImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/WinnerImages")
public class WinnerImageController {

    @Autowired
    private WinnerImageService winnerImageService;

    @GetMapping
    private List<WinnerImages> getAllWinnerImages(){
        return winnerImageService.findAll();
    }
    @GetMapping("/{id}")
    private ResponseEntity<WinnerImages> getALlWinnersById(@PathVariable Long id){
        Optional<WinnerImages> winnerImages= winnerImageService.findById(id);
        if (winnerImages.isPresent()) {
            return ResponseEntity.ok(winnerImages.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    private WinnerImages createWinnerImages(@RequestBody WinnerImages winnerImages){
        return winnerImageService.createWinnerImages(winnerImages);
    }
    @PutMapping("/{id}")
    private WinnerImages updateWinnerImages(@PathVariable Long id, @RequestBody WinnerImages winnerImages){
        return winnerImageService.updateWinnerImages(winnerImages);
    }
    @DeleteMapping("/{id}")
    private String deleteWinnerImagesById(@PathVariable Long id ){
    winnerImageService.deleteWinnerImagesById( id);
    return "Deleted succesfully";
    }

    @GetMapping("/sorted")
    public List<WinnerImages> getAllWinnerImagesSorted(@RequestParam String sortBy, @RequestParam String order) {
        Sort.Direction direction = Sort.Direction.fromString(order);
        Sort sort = Sort.by(direction, sortBy);
        return winnerImageService.findAll(sort);
    }




}
