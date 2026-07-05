package com.anthropic.claude.sessions.types;

import defpackage.dsf;
import defpackage.esf;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ucf;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionGroupingVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "dsf", "UNKNOWN", "PUBLIC", "PRIVATE", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = esf.class)
public final class SessionGroupingVisibility {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ SessionGroupingVisibility[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final dsf Companion;
    public static final SessionGroupingVisibility UNKNOWN = new SessionGroupingVisibility("UNKNOWN", 0);
    public static final SessionGroupingVisibility PUBLIC = new SessionGroupingVisibility("PUBLIC", 1);
    public static final SessionGroupingVisibility PRIVATE = new SessionGroupingVisibility("PRIVATE", 2);

    private static final /* synthetic */ SessionGroupingVisibility[] $values() {
        return new SessionGroupingVisibility[]{UNKNOWN, PUBLIC, PRIVATE};
    }

    static {
        SessionGroupingVisibility[] sessionGroupingVisibilityArr$values = $values();
        $VALUES = sessionGroupingVisibilityArr$values;
        $ENTRIES = wd6.n0(sessionGroupingVisibilityArr$values);
        Companion = new dsf();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ucf(23));
    }

    private SessionGroupingVisibility(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.SessionGroupingVisibility", values(), new String[]{"unknown", "public", "private"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static SessionGroupingVisibility valueOf(String str) {
        return (SessionGroupingVisibility) Enum.valueOf(SessionGroupingVisibility.class, str);
    }

    public static SessionGroupingVisibility[] values() {
        return (SessionGroupingVisibility[]) $VALUES.clone();
    }
}
