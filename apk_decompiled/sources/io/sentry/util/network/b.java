package io.sentry.util.network;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
        a = iArr;
        try {
            iArr[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
