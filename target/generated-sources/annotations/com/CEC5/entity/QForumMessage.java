package com.CEC5.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QForumMessage is a Querydsl query type for ForumMessage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QForumMessage extends EntityPathBase<ForumMessage> {

    private static final long serialVersionUID = -151801084L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QForumMessage forumMessage = new QForumMessage("forumMessage");

    public final QEvent event;

    public final StringPath imageUrl = createString("imageUrl");

    public final StringPath message = createString("message");

    public final QUser messageCreator;

    public final NumberPath<Long> messageId = createNumber("messageId", Long.class);

    public QForumMessage(String variable) {
        this(ForumMessage.class, forVariable(variable), INITS);
    }

    public QForumMessage(Path<? extends ForumMessage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QForumMessage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QForumMessage(PathMetadata metadata, PathInits inits) {
        this(ForumMessage.class, metadata, inits);
    }

    public QForumMessage(Class<? extends ForumMessage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.event = inits.isInitialized("event") ? new QEvent(forProperty("event"), inits.get("event")) : null;
        this.messageCreator = inits.isInitialized("messageCreator") ? new QUser(forProperty("messageCreator"), inits.get("messageCreator")) : null;
    }

}

