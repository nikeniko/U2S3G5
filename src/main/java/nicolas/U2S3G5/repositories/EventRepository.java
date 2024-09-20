package nicolas.U2S3G5.repositories;


import nicolas.U2S3G5.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
