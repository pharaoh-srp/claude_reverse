package io.sentry.android.core.anr;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final int a;
    public final float b;
    public final StackTraceElement[] c;
    public final int d;
    public final int e;
    public int f = 1;
    public long g;
    public long h;

    public a(StackTraceElement[] stackTraceElementArr, int i, int i2, long j, float f) {
        this.c = stackTraceElementArr;
        this.d = i;
        this.e = i2;
        this.a = (i2 - i) + 1;
        this.g = j;
        this.h = j;
        this.b = f;
    }

    public final StackTraceElement[] a() {
        return (StackTraceElement[]) Arrays.copyOfRange(this.c, this.d, this.e + 1);
    }
}
