package bt.gov.rsta.onlinepayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bt.gov.rsta.onlinepayment.entity.WorkFlowDetailEntity;

@Repository
public interface WorkFlowDetailRepository extends JpaRepository<WorkFlowDetailEntity, Integer> {

}
