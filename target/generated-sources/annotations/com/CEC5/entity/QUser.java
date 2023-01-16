package com.CEC5.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 1546037545L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUser user = new QUser("user");

    public final QAddress address;

    public final ListPath<Event, QEvent> createdEvents = this.<Event, QEvent>createList("createdEvents", Event.class, QEvent.class, PathInits.DIRECT2);

    public final StringPath description = createString("description");

    public final StringPath email = createString("email");

    public final StringPath fullName = createString("fullName");

    public final StringPath gender = createString("gender");

    public final BooleanPath organization = createBoolean("organization");

    public final StringPath password = createString("password");

    public final NumberPath<Float> reviewsReceivedAsOrganizerAverage = createNumber("reviewsReceivedAsOrganizerAverage", Float.class);

    public final ListPath<Reviews, QReviews> reviewsReceivedAsOrganizerList = this.<Reviews, QReviews>createList("reviewsReceivedAsOrganizerList", Reviews.class, QReviews.class, PathInits.DIRECT2);

    public final NumberPath<Float> reviewsReceivedAsParticipantAverage = createNumber("reviewsReceivedAsParticipantAverage", Float.class);

    public final ListPath<Reviews, QReviews> reviewsReceivedAsParticipantList = this.<Reviews, QReviews>createList("reviewsReceivedAsParticipantList", Reviews.class, QReviews.class, PathInits.DIRECT2);

    public final StringPath screenName = createString("screenName");

    public QUser(String variable) {
        this(User.class, forVariable(variable), INITS);
    }

    public QUser(Path<? extends User> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUser(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUser(PathMetadata metadata, PathInits inits) {
        this(User.class, metadata, inits);
    }

    public QUser(Class<? extends User> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QAddress(forProperty("address")) : null;
    }

}

