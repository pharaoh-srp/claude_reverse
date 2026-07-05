package com.anthropic.claude.sessions.types;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.tsf;
import defpackage.ucf;
import defpackage.usf;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionLifecycleStatusV2;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "tsf", "UNKNOWN", "ACTIVE", "ARCHIVED", "PAUSED", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = usf.class)
public final class SessionLifecycleStatusV2 {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ SessionLifecycleStatusV2[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final tsf Companion;
    public static final SessionLifecycleStatusV2 UNKNOWN = new SessionLifecycleStatusV2("UNKNOWN", 0);
    public static final SessionLifecycleStatusV2 ACTIVE = new SessionLifecycleStatusV2("ACTIVE", 1);
    public static final SessionLifecycleStatusV2 ARCHIVED = new SessionLifecycleStatusV2("ARCHIVED", 2);
    public static final SessionLifecycleStatusV2 PAUSED = new SessionLifecycleStatusV2("PAUSED", 3);

    private static final /* synthetic */ SessionLifecycleStatusV2[] $values() {
        return new SessionLifecycleStatusV2[]{UNKNOWN, ACTIVE, ARCHIVED, PAUSED};
    }

    static {
        SessionLifecycleStatusV2[] sessionLifecycleStatusV2Arr$values = $values();
        $VALUES = sessionLifecycleStatusV2Arr$values;
        $ENTRIES = wd6.n0(sessionLifecycleStatusV2Arr$values);
        Companion = new tsf();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ucf(26));
    }

    private SessionLifecycleStatusV2(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.SessionLifecycleStatusV2", values(), new String[]{"unknown", "active", "archived", "paused"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static SessionLifecycleStatusV2 valueOf(String str) {
        return (SessionLifecycleStatusV2) Enum.valueOf(SessionLifecycleStatusV2.class, str);
    }

    public static SessionLifecycleStatusV2[] values() {
        return (SessionLifecycleStatusV2[]) $VALUES.clone();
    }
}
