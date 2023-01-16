package com.CEC5.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReviews is a Querydsl query type for Reviews
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReviews extends EntityPathBase<Reviews> {

    private static final long serialVersionUID = 22401533L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReviews reviews = new QReviews("reviews");

    public final StringPath description = createString("description");

    public final QEvent event;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Float> rating = createNumber("rating", Float.class);

    public final QUser reviewedBy;

    public final QUser reviewedUser;

    public QReviews(String variable) {
        this(Reviews.class, forVariable(variable), INITS);
    }

    public QReviews(Path<? extends Reviews> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReviews(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReviews(PathMetadata metadata, PathInits inits) {
        this(Reviews.class, metadata, inits);
    }

    public QReviews(Class<? extends Reviews> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.event = inits.isInitialized("event") ? new QEvent(forProperty("event"), inits.get("event")) : null;
        this.reviewedBy = inits.isInitialized("reviewedBy") ? new QUser(forProperty("reviewedBy"), inits.get("reviewedBy")) : null;
        this.reviewedUser = inits.isInitialized("reviewedUser") ? new QUser(forProperty("reviewedUser"), inits.get("reviewedUser")) : null;
    }

}

