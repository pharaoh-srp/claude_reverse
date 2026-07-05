package com.anthropic.claude.sessions.types;

import defpackage.er6;
import defpackage.fc6;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/anthropic/claude/sessions/types/EnvironmentState;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "er6", "ACTIVE", "ARCHIVED", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class EnvironmentState {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EnvironmentState[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final EnvironmentState ACTIVE = new EnvironmentState("ACTIVE", 0);
    public static final EnvironmentState ARCHIVED = new EnvironmentState("ARCHIVED", 1);
    public static final er6 Companion;

    private static final /* synthetic */ EnvironmentState[] $values() {
        return new EnvironmentState[]{ACTIVE, ARCHIVED};
    }

    static {
        EnvironmentState[] environmentStateArr$values = $values();
        $VALUES = environmentStateArr$values;
        $ENTRIES = wd6.n0(environmentStateArr$values);
        Companion = new er6();
        $cachedSerializer$delegate = yb5.w(w1a.F, new fc6(26));
    }

    private EnvironmentState(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.EnvironmentState", values(), new String[]{"active", "archived"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EnvironmentState valueOf(String str) {
        return (EnvironmentState) Enum.valueOf(EnvironmentState.class, str);
    }

    public static EnvironmentState[] values() {
        return (EnvironmentState[]) $VALUES.clone();
    }
}
