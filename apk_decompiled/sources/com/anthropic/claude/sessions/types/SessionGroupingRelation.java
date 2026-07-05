package com.anthropic.claude.sessions.types;

import defpackage.bsf;
import defpackage.csf;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionGroupingRelation;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "bsf", "UNKNOWN", "OWNER", "MEMBER", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = csf.class)
public final class SessionGroupingRelation {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ SessionGroupingRelation[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final bsf Companion;
    public static final SessionGroupingRelation UNKNOWN = new SessionGroupingRelation("UNKNOWN", 0);
    public static final SessionGroupingRelation OWNER = new SessionGroupingRelation("OWNER", 1);
    public static final SessionGroupingRelation MEMBER = new SessionGroupingRelation("MEMBER", 2);

    private static final /* synthetic */ SessionGroupingRelation[] $values() {
        return new SessionGroupingRelation[]{UNKNOWN, OWNER, MEMBER};
    }

    static {
        SessionGroupingRelation[] sessionGroupingRelationArr$values = $values();
        $VALUES = sessionGroupingRelationArr$values;
        $ENTRIES = wd6.n0(sessionGroupingRelationArr$values);
        Companion = new bsf();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ucf(22));
    }

    private SessionGroupingRelation(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.SessionGroupingRelation", values(), new String[]{"unknown", "owner", "member"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static SessionGroupingRelation valueOf(String str) {
        return (SessionGroupingRelation) Enum.valueOf(SessionGroupingRelation.class, str);
    }

    public static SessionGroupingRelation[] values() {
        return (SessionGroupingRelation[]) $VALUES.clone();
    }
}
