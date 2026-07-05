package defpackage;

import android.os.WorkSource;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class qea {
    public final int a;
    public final long b;
    public long c = -1;
    public long d = 0;
    public long e = Long.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public float g = MTTypesetterKt.kLineSkipLimitMultiplier;
    public boolean h = true;
    public long i = -1;
    public int j = 0;
    public int k = 0;
    public boolean l = false;
    public WorkSource m = null;
    public j7k n = null;

    public qea(int i, long j) {
        this.a = 102;
        dgj.n("intervalMillis must be greater than or equal to 0", j >= 0);
        this.b = j;
        bsj.b(i);
        this.a = i;
    }

    public final LocationRequest a() {
        long jMin = this.c;
        int i = this.a;
        long j = this.b;
        if (jMin == -1) {
            jMin = j;
        } else if (i != 105) {
            jMin = Math.min(jMin, j);
        }
        long jMax = Math.max(this.d, this.b);
        long j2 = this.e;
        int i2 = this.f;
        float f = this.g;
        boolean z = this.h;
        long j3 = this.i;
        if (j3 == -1) {
            j3 = this.b;
        }
        return new LocationRequest(i, j, jMin, jMax, Long.MAX_VALUE, j2, i2, f, z, j3, this.j, this.k, this.l, new WorkSource(this.m), this.n);
    }

    public final void b(long j) {
        dgj.n("durationMillis must be greater than 0", j > 0);
        this.e = j;
    }

    public final void c(int i) {
        int i2;
        boolean z = true;
        if (i == 0 || i == 1) {
            i2 = i;
        } else {
            i2 = 2;
            if (i != 2) {
                z = false;
                i2 = i;
            }
        }
        dgj.p(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i2));
        this.j = i;
    }

    public final void d(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        dgj.n("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z);
        this.i = j;
    }

    public final void e(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        dgj.n("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", z);
        this.c = j;
    }

    public final void f(int i) {
        int i2;
        boolean z = true;
        if (i == 0 || i == 1) {
            i2 = i;
        } else {
            i2 = 2;
            if (i != 2) {
                z = false;
                i2 = i;
            }
        }
        dgj.p(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i2));
        this.k = i;
    }
}
