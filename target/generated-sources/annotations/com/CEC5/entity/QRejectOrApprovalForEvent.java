package com.CEC5.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRejectOrApprovalForEvent is a Querydsl query type for RejectOrApprovalForEvent
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRejectOrApprovalForEvent extends EntityPathBase<RejectOrApprovalForEvent> {

    private static final long serialVersionUID = -288942316L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRejectOrApprovalForEvent rejectOrApprovalForEvent = new QRejectOrApprovalForEvent("rejectOrApprovalForEvent");

    public final QEvent event;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isReject = createBoolean("isReject");

    public final DateTimePath<java.time.LocalDateTime> timeOfRequest = createDateTime("timeOfRequest", java.time.LocalDateTime.class);

    public final QUser userOnWhoActionIsApplied;

    public QRejectOrApprovalForEvent(String variable) {
        this(RejectOrApprovalForEvent.class, forVariable(variable), INITS);
    }

    public QRejectOrApprovalForEvent(Path<? extends RejectOrApprovalForEvent> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRejectOrApprovalForEvent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRejectOrApprovalForEvent(PathMetadata metadata, PathInits inits) {
        this(RejectOrApprovalForEvent.class, metadata, inits);
    }

    public QRejectOrApprovalForEvent(Class<? extends RejectOrApprovalForEvent> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.event = inits.isInitialized("event") ? new QEvent(forProperty("event"), inits.get("event")) : null;
        this.userOnWhoActionIsApplied = inits.isInitialized("userOnWhoActionIsApplied") ? new QUser(forProperty("userOnWhoActionIsApplied"), inits.get("userOnWhoActionIsApplied")) : null;
    }

}

