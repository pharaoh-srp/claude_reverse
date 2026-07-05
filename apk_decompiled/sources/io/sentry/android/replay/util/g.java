package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.SOC_MODEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.SOC_MANUFACTURER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
