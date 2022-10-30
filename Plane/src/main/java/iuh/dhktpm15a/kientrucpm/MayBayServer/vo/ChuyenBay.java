package iuh.dhktpm15a.kientrucpm.MayBayServer.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chuyenbay")
public class ChuyenBay {
    @Id
    @Column(name = "macb")
    private String maCB;

    @Column(name = "gadi")
    private String gaDi;

    @Column(name = "gaden")
    private String gaDen;

    @Column(name = "dodai")
    private int doDai;

    @Column(name = "giodi")
    private LocalDateTime gioDi;

    @Column(name = "gioden")
    private LocalDateTime gioDen;

    @Column(name = "chiphi")
    private int chiPhi;
}
