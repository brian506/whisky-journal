package whisky.whisky_journal.domain.whisky.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWhiskyAlias is a Querydsl query type for WhiskyAlias
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWhiskyAlias extends EntityPathBase<WhiskyAlias> {

    private static final long serialVersionUID = 1579911711L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWhiskyAlias whiskyAlias = new QWhiskyAlias("whiskyAlias");

    public final StringPath aliasName = createString("aliasName");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QWhisky whisky;

    public QWhiskyAlias(String variable) {
        this(WhiskyAlias.class, forVariable(variable), INITS);
    }

    public QWhiskyAlias(Path<? extends WhiskyAlias> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWhiskyAlias(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWhiskyAlias(PathMetadata metadata, PathInits inits) {
        this(WhiskyAlias.class, metadata, inits);
    }

    public QWhiskyAlias(Class<? extends WhiskyAlias> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.whisky = inits.isInitialized("whisky") ? new QWhisky(forProperty("whisky"), inits.get("whisky")) : null;
    }

}

