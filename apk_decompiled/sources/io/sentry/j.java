package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[l4.values().length];
        a = iArr;
        try {
            iArr[l4.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[l4.ISOLATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[l4.GLOBAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
