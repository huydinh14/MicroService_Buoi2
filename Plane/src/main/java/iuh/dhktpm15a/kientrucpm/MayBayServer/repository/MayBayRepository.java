package iuh.dhktpm15a.kientrucpm.MayBayServer.repository;

import iuh.dhktpm15a.kientrucpm.MayBayServer.entity.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay,Integer> {
    @Query(nativeQuery = true, value = "select * from maybay where mamb = :mamb")
    public MayBay findByMa(@Param("mamb") Integer ma);
}
