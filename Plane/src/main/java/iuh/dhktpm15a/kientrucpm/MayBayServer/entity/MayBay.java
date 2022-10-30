package iuh.dhktpm15a.kientrucpm.MayBayServer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "maybay")
public class MayBay {
    @Id
    @Column(name = "mamb")
    private int maMB;

    @Column(name = "loai")
    private String loai;

    @Column(name = "tambay")
    private int tamBay;
}
