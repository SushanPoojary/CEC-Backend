package com.CEC5.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEvent is a Querydsl query type for Event
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEvent extends EntityPathBase<Event> {

    private static final long serialVersionUID = 667836668L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEvent event = new QEvent("event");

    public final QAddress address;

    public final SetPath<User, QUser> approvedParticipants = this.<User, QUser>createSet("approvedParticipants", User.class, QUser.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> creationDateTime = createDateTime("creationDateTime", java.time.LocalDateTime.class);

    public final StringPath description = createString("description");

    public final DateTimePath<java.time.LocalDateTime> endDateTime = createDateTime("endDateTime", java.time.LocalDateTime.class);

    public final NumberPath<Long> event_id = createNumber("event_id", Long.class);

    public final NumberPath<Integer> fee = createNumber("fee", Integer.class);

    public final BooleanPath isCancelledAndEmailSent = createBoolean("isCancelledAndEmailSent");

    public final BooleanPath isFirstComeFirstServe = createBoolean("isFirstComeFirstServe");

    public final NumberPath<Integer> maxParticipants = createNumber("maxParticipants", Integer.class);

    public final NumberPath<Integer> minParticipants = createNumber("minParticipants", Integer.class);

    public final QUser organizer;

    public final BooleanPath participantForumClosedByOrganizer = createBoolean("participantForumClosedByOrganizer");

    public final ListPath<ForumMessage, QForumMessage> participantForumMessageList = this.<ForumMessage, QForumMessage>createList("participantForumMessageList", ForumMessage.class, QForumMessage.class, PathInits.DIRECT2);

    public final SetPath<User, QUser> participantsRequiringApproval = this.<User, QUser>createSet("participantsRequiringApproval", User.class, QUser.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> signUpDeadline = createDateTime("signUpDeadline", java.time.LocalDateTime.class);

    public final ListPath<ForumMessage, QForumMessage> signUpMessageList = this.<ForumMessage, QForumMessage>createList("signUpMessageList", ForumMessage.class, QForumMessage.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> startDateTime = createDateTime("startDateTime", java.time.LocalDateTime.class);

    public final StringPath title = createString("title");

    public QEvent(String variable) {
        this(Event.class, forVariable(variable), INITS);
    }

    public QEvent(Path<? extends Event> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEvent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEvent(PathMetadata metadata, PathInits inits) {
        this(Event.class, metadata, inits);
    }

    public QEvent(Class<? extends Event> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QAddress(forProperty("address")) : null;
        this.organizer = inits.isInitialized("organizer") ? new QUser(forProperty("organizer"), inits.get("organizer")) : null;
    }

}

