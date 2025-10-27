package whisky.whisky_journal.domain.whisky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import whisky.whisky_journal.domain.whisky.entity.Whisky;
import whisky.whisky_journal.domain.whisky.repository.custom.WhiskyCustomRepository;

public interface WhiskyRepository extends JpaRepository<Whisky,Long>, WhiskyCustomRepository {
}
