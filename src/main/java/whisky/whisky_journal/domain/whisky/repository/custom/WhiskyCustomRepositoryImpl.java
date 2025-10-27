package whisky.whisky_journal.domain.whisky.repository.custom;

import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import whisky.whisky_journal.domain.whisky.entity.Whisky;
import whisky.whisky_journal.domain.whisky.entity.QWhisky;
import whisky.whisky_journal.domain.whisky.entity.QWhiskyAlias;
import java.util.List;

@RequiredArgsConstructor
public class WhiskyCustomRepositoryImpl implements WhiskyCustomRepository{

    private final QWhisky qWhisky = QWhisky.whisky;
    private final QWhiskyAlias qWhiskyAlias = QWhiskyAlias.whiskyAlias;
    private final JPAQueryFactory factory;

    @Override
    public List<Whisky> findByNameOrAliasContaining(String keyword) {
        return factory
                .selectFrom(qWhisky)
                .where(
                        qWhisky.name.containsIgnoreCase(keyword)
                                .or(
                                        qWhisky.id.in(
                                                JPAExpressions
                                                        .select(qWhiskyAlias.whisky.id)
                                                        .from(qWhiskyAlias)
                                                        .where(qWhiskyAlias.aliasName.containsIgnoreCase(keyword))
                                        )
                                )
                )
                .distinct()
                .fetch();

    }
}
