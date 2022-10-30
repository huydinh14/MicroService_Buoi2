package iuh.dhktpm15a.kientrucpm.MayBayServer.controller;


import iuh.dhktpm15a.kientrucpm.MayBayServer.service.MayBayService;
import iuh.dhktpm15a.kientrucpm.MayBayServer.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maybay")
public class MayBayController {
    @Autowired
    MayBayService mayBayService;

    @GetMapping("/find-by-ma")
    public ResponseEntity findByMa(@RequestParam("ma") int ma){
        return new ResponseEntity<>(mayBayService.findByMa(ma), HttpStatus.OK);
    }

    @GetMapping("/find-chuyenbay-with-maybay")
    public ResponseTemplateVO getChuyenBayWithMayBay(
            @RequestParam("macb") String macb,
            @RequestParam("mamb") int mamb
    ){
        return mayBayService.getChuyenBayWithMayBay(macb, mamb);
    }
}
