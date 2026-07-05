package io.sentry.android.replay;

import io.sentry.o4;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class w {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[o4.values().length];
        try {
            iArr[o4.CANVAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o4.PIXEL_COPY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
