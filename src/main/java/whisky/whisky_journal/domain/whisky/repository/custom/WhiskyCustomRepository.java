package whisky.whisky_journal.domain.whisky.repository.custom;

import whisky.whisky_journal.domain.whisky.entity.Whisky;

import java.util.List;

public interface WhiskyCustomRepository {
    List<Whisky> findByNameOrAliasContaining(String keyword);
}
