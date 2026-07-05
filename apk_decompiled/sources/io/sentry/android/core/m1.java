package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;

    public final void a(long j, long j2, boolean z, boolean z2) {
        this.e += j;
        if (z2) {
            this.d += j2;
            this.b++;
        } else if (z) {
            this.c += j2;
            this.a++;
        }
    }

    public final int b() {
        return this.b;
    }

    public final long c() {
        return this.d;
    }

    public final int d() {
        return this.a;
    }

    public final long e() {
        return this.c;
    }

    public final int f() {
        return this.a + this.b;
    }

    public final long g() {
        return this.e;
    }
}
