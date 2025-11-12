package whisky.whisky_journal.domain.whisky.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QWhiskyMetaData is a Querydsl query type for WhiskyMetaData
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QWhiskyMetaData extends BeanPath<WhiskyMetaData> {

    private static final long serialVersionUID = 733099296L;

    public static final QWhiskyMetaData whiskyMetaData = new QWhiskyMetaData("whiskyMetaData");

    public final NumberPath<Double> abv = createNumber("abv", Double.class);

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final StringPath bottler = createString("bottler");

    public final StringPath country = createString("country");

    public final StringPath type = createString("type");

    public QWhiskyMetaData(String variable) {
        super(WhiskyMetaData.class, forVariable(variable));
    }

    public QWhiskyMetaData(Path<? extends WhiskyMetaData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWhiskyMetaData(PathMetadata metadata) {
        super(WhiskyMetaData.class, metadata);
    }

}

