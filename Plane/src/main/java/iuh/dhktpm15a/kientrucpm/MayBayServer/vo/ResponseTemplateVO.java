package iuh.dhktpm15a.kientrucpm.MayBayServer.vo;

import iuh.dhktpm15a.kientrucpm.MayBayServer.entity.MayBay;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private MayBay mayBay;
    private ChuyenBay chuyenBay;


}
