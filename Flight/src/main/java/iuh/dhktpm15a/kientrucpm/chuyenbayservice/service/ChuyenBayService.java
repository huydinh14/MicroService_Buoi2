package iuh.dhktpm15a.kientrucpm.chuyenbayservice.service;

import iuh.dhktpm15a.kientrucpm.chuyenbayservice.entity.ChuyenBay;
import iuh.dhktpm15a.kientrucpm.chuyenbayservice.repository.ChuyenBayRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ChuyenBayService {
    private ChuyenBayRepository chuyenBayRepository;

    public ChuyenBayService(ChuyenBayRepository chuyenBayRepository){
        this.chuyenBayRepository = chuyenBayRepository;
    }

   public List<ChuyenBay> getAllChuyenBay(){
        return chuyenBayRepository.findAll();
   }

   public ChuyenBay findById(@RequestParam String ma){
        return chuyenBayRepository.findByMa(ma);
   }
}
