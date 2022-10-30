package iuh.dhktpm15a.kientrucpm.chuyenbayservice.repository;

import iuh.dhktpm15a.kientrucpm.chuyenbayservice.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    @Query(nativeQuery = true, value = "select * from chuyenbay where macb = :machuyenbay")
    public ChuyenBay findByMa(@Param("machuyenbay") String machuyenbay);
}
