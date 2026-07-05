package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class t0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[io.sentry.s0.values().length];
        a = iArr;
        try {
            iArr[io.sentry.s0.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[io.sentry.s0.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
