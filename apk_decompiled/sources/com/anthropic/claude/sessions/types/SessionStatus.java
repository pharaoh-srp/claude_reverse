package com.anthropic.claude.sessions.types;

import defpackage.auf;
import defpackage.cuf;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.ztf;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "auf", "UNKNOWN", "PENDING", "REQUIRES_ACTION", "RUNNING", "IDLE", "ARCHIVED", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = cuf.class)
public final class SessionStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ SessionStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final auf Companion;
    public static final SessionStatus UNKNOWN = new SessionStatus("UNKNOWN", 0);
    public static final SessionStatus PENDING = new SessionStatus("PENDING", 1);
    public static final SessionStatus REQUIRES_ACTION = new SessionStatus("REQUIRES_ACTION", 2);
    public static final SessionStatus RUNNING = new SessionStatus("RUNNING", 3);
    public static final SessionStatus IDLE = new SessionStatus("IDLE", 4);
    public static final SessionStatus ARCHIVED = new SessionStatus("ARCHIVED", 5);

    private static final /* synthetic */ SessionStatus[] $values() {
        return new SessionStatus[]{UNKNOWN, PENDING, REQUIRES_ACTION, RUNNING, IDLE, ARCHIVED};
    }

    static {
        SessionStatus[] sessionStatusArr$values = $values();
        $VALUES = sessionStatusArr$values;
        $ENTRIES = wd6.n0(sessionStatusArr$values);
        Companion = new auf();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ztf(0));
    }

    private SessionStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.SessionStatus", values(), new String[]{"unknown", "pending", "requires_action", "running", "idle", "archived"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static SessionStatus valueOf(String str) {
        return (SessionStatus) Enum.valueOf(SessionStatus.class, str);
    }

    public static SessionStatus[] values() {
        return (SessionStatus[]) $VALUES.clone();
    }
}
