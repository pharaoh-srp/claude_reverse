package io.sentry.android.replay;

import defpackage.fq6;
import defpackage.wd6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s INITIAL = new s("INITIAL", 0);
    public static final s STARTED = new s("STARTED", 1);
    public static final s RESUMED = new s("RESUMED", 2);
    public static final s PAUSED = new s("PAUSED", 3);
    public static final s STOPPED = new s("STOPPED", 4);
    public static final s CLOSED = new s("CLOSED", 5);

    private static final /* synthetic */ s[] $values() {
        return new s[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        s[] sVarArr$values = $values();
        $VALUES = sVarArr$values;
        $ENTRIES = wd6.n0(sVarArr$values);
    }

    private s(String str, int i) {
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
