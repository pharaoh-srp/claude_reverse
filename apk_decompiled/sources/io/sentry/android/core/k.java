package io.sentry.android.core;

import io.sentry.t5;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[t5.values().length];
        a = iArr;
        try {
            iArr[t5.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[t5.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[t5.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[t5.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[t5.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
