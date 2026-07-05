package io.sentry.android.core;

import io.sentry.x3;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[x3.values().length];
        a = iArr;
        try {
            iArr[x3.TRACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[x3.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
