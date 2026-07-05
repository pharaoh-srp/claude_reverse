package com.anthropic.claude.sessions.types;

import defpackage.fc6;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.tq6;
import defpackage.uq6;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "tq6", "ANTHROPIC_CLOUD", "BYOC", "BRIDGE", "UNKNOWN", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = uq6.class)
public final class EnvironmentKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EnvironmentKind[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final tq6 Companion;
    public static final EnvironmentKind ANTHROPIC_CLOUD = new EnvironmentKind("ANTHROPIC_CLOUD", 0);
    public static final EnvironmentKind BYOC = new EnvironmentKind("BYOC", 1);
    public static final EnvironmentKind BRIDGE = new EnvironmentKind("BRIDGE", 2);
    public static final EnvironmentKind UNKNOWN = new EnvironmentKind("UNKNOWN", 3);

    private static final /* synthetic */ EnvironmentKind[] $values() {
        return new EnvironmentKind[]{ANTHROPIC_CLOUD, BYOC, BRIDGE, UNKNOWN};
    }

    static {
        EnvironmentKind[] environmentKindArr$values = $values();
        $VALUES = environmentKindArr$values;
        $ENTRIES = wd6.n0(environmentKindArr$values);
        Companion = new tq6();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new fc6(22));
    }

    private EnvironmentKind(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.EnvironmentKind", values(), new String[]{"anthropic_cloud", "byoc", "bridge", "unknown"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EnvironmentKind valueOf(String str) {
        return (EnvironmentKind) Enum.valueOf(EnvironmentKind.class, str);
    }

    public static EnvironmentKind[] values() {
        return (EnvironmentKind[]) $VALUES.clone();
    }
}
