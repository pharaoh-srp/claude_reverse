package defpackage;

import io.sentry.android.core.performance.g;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ak0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.COLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.WARM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
