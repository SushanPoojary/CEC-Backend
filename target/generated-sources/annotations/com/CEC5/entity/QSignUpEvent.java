package com.CEC5.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSignUpEvent is a Querydsl query type for SignUpEvent
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSignUpEvent extends EntityPathBase<SignUpEvent> {

    private static final long serialVersionUID = 1052357924L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSignUpEvent signUpEvent = new QSignUpEvent("signUpEvent");

    public final QEvent event;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> signingUpTime = createDateTime("signingUpTime", java.time.LocalDateTime.class);

    public final QUser signingUpUser;

    public QSignUpEvent(String variable) {
        this(SignUpEvent.class, forVariable(variable), INITS);
    }

    public QSignUpEvent(Path<? extends SignUpEvent> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSignUpEvent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSignUpEvent(PathMetadata metadata, PathInits inits) {
        this(SignUpEvent.class, metadata, inits);
    }

    public QSignUpEvent(Class<? extends SignUpEvent> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.event = inits.isInitialized("event") ? new QEvent(forProperty("event"), inits.get("event")) : null;
        this.signingUpUser = inits.isInitialized("signingUpUser") ? new QUser(forProperty("signingUpUser"), inits.get("signingUpUser")) : null;
    }

}

