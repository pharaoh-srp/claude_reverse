package io.sentry.android.replay.util;

import defpackage.fq6;
import defpackage.wd6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f SOC_MODEL = new f("SOC_MODEL", 0);
    public static final f SOC_MANUFACTURER = new f("SOC_MANUFACTURER", 1);

    private static final /* synthetic */ f[] $values() {
        return new f[]{SOC_MODEL, SOC_MANUFACTURER};
    }

    static {
        f[] fVarArr$values = $values();
        $VALUES = fVarArr$values;
        $ENTRIES = wd6.n0(fVarArr$values);
    }

    private f(String str, int i) {
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
