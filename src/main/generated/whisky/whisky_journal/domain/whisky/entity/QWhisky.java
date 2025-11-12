package whisky.whisky_journal.domain.whisky.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWhisky is a Querydsl query type for Whisky
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWhisky extends EntityPathBase<Whisky> {

    private static final long serialVersionUID = -223731023L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWhisky whisky = new QWhisky("whisky");

    public final whisky.whisky_journal.common.base.QBaseTime _super = new whisky.whisky_journal.common.base.QBaseTime(this);

    public final QWhiskyAlias alias;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath imageUrl = createString("imageUrl");

    public final QWhiskyMetaData metadata;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final StringPath name = createString("name");

    public QWhisky(String variable) {
        this(Whisky.class, forVariable(variable), INITS);
    }

    public QWhisky(Path<? extends Whisky> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWhisky(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWhisky(PathMetadata metadata, PathInits inits) {
        this(Whisky.class, metadata, inits);
    }

    public QWhisky(Class<? extends Whisky> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.alias = inits.isInitialized("alias") ? new QWhiskyAlias(forProperty("alias"), inits.get("alias")) : null;
        this.metadata = inits.isInitialized("metadata") ? new QWhiskyMetaData(forProperty("metadata")) : null;
    }

}

