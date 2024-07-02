package com.BeyondKlasses.WinnerImages.service;

import com.BeyondKlasses.WinnerImages.model.WinnerImages;
import com.BeyondKlasses.WinnerImages.repository.WinnerImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class WinnerImageService {
    @Autowired
    private WinnerImageRepository winnerImageRepository;

    public List<WinnerImages> findAll() {
        return winnerImageRepository.findAll();
    }

    public Optional<WinnerImages> findById(Long id) {
        return winnerImageRepository.findById(id);
    }

    public WinnerImages createWinnerImages(WinnerImages winnerImages) {
        return winnerImageRepository.save(winnerImages);
    }


    public WinnerImages updateWinnerImages(WinnerImages winnerImages) {
        return winnerImageRepository.save(winnerImages);
    }


    public void deleteWinnerImagesById(Long id) {
         winnerImageRepository.deleteById(id);
    }

    public List<WinnerImages> findAll(Sort sort) {
        return winnerImageRepository.findAll(sort);
    }
}
