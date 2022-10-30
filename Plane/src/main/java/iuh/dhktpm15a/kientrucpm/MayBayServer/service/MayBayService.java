package iuh.dhktpm15a.kientrucpm.MayBayServer.service;

import iuh.dhktpm15a.kientrucpm.MayBayServer.entity.MayBay;
import iuh.dhktpm15a.kientrucpm.MayBayServer.repository.MayBayRepository;
import iuh.dhktpm15a.kientrucpm.MayBayServer.vo.ChuyenBay;
import iuh.dhktpm15a.kientrucpm.MayBayServer.vo.ResponseTemplateVO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MayBayService {
    private MayBayRepository mayBayRepository;
    private RestTemplate restTemplate;

    public MayBayService(MayBayRepository mayBayRepository, RestTemplate restTemplate){
        this.mayBayRepository = mayBayRepository;
        this.restTemplate = restTemplate;
    }
    public MayBay findByMa(int ma){
        return mayBayRepository.findByMa(ma);
    }

    public ResponseTemplateVO getChuyenBayWithMayBay(String macb, int mamb) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        MayBay mayBay = mayBayRepository.findByMa(mamb);

        ChuyenBay chuyenBay = restTemplate.getForObject(
                "http://localhost:9091/chuyenbay/findById?ma="+macb, ChuyenBay.class
        );
        responseTemplateVO.setMayBay(mayBay);
        responseTemplateVO.setChuyenBay(chuyenBay);

        return responseTemplateVO;

    }
}
