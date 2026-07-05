package com.anthropic.claude.api.account;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rpa;
import defpackage.vbb;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.xbb;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/account/MemoryMode;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "vbb", "MELANGE", "CLASSIC", "OFF", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = xbb.class)
public final class MemoryMode {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MemoryMode[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final vbb Companion;
    public static final MemoryMode MELANGE = new MemoryMode("MELANGE", 0);
    public static final MemoryMode CLASSIC = new MemoryMode("CLASSIC", 1);
    public static final MemoryMode OFF = new MemoryMode("OFF", 2);
    public static final MemoryMode UNKNOWN = new MemoryMode("UNKNOWN", 3);

    private static final /* synthetic */ MemoryMode[] $values() {
        return new MemoryMode[]{MELANGE, CLASSIC, OFF, UNKNOWN};
    }

    static {
        MemoryMode[] memoryModeArr$values = $values();
        $VALUES = memoryModeArr$values;
        $ENTRIES = wd6.n0(memoryModeArr$values);
        Companion = new vbb();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new rpa(18));
    }

    private MemoryMode(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.account.MemoryMode", values(), new String[]{"melange", "classic", "off", "unknown"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MemoryMode valueOf(String str) {
        return (MemoryMode) Enum.valueOf(MemoryMode.class, str);
    }

    public static MemoryMode[] values() {
        return (MemoryMode[]) $VALUES.clone();
    }
}
