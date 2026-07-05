package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j6d {
    public static final z7b u = new z7b(new Object());
    public final mqh a;
    public final z7b b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final w3i h;
    public final f4i i;
    public final List j;
    public final z7b k;
    public final boolean l;
    public final int m;
    public final int n;
    public final l6d o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public j6d(mqh mqhVar, z7b z7bVar, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, w3i w3iVar, f4i f4iVar, List list, z7b z7bVar2, boolean z2, int i2, int i3, l6d l6dVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = mqhVar;
        this.b = z7bVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = w3iVar;
        this.i = f4iVar;
        this.j = list;
        this.k = z7bVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = l6dVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static j6d j(f4i f4iVar) {
        iqh iqhVar = mqh.a;
        w3i w3iVar = w3i.d;
        vde vdeVar = vde.I;
        l6d l6dVar = l6d.d;
        z7b z7bVar = u;
        return new j6d(iqhVar, z7bVar, -9223372036854775807L, 0L, 1, null, false, w3iVar, f4iVar, vdeVar, z7bVar, false, 1, 0, l6dVar, 0L, 0L, 0L, 0L, false);
    }

    public final j6d a() {
        return new j6d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, k(), SystemClock.elapsedRealtime(), this.p);
    }

    public final j6d b(boolean z) {
        return new j6d(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final j6d c(z7b z7bVar) {
        return new j6d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, z7bVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final j6d d(z7b z7bVar, long j, long j2, long j3, long j4, w3i w3iVar, f4i f4iVar, List list) {
        return new j6d(this.a, z7bVar, j2, j3, this.e, this.f, this.g, w3iVar, f4iVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final j6d e(int i, int i2, boolean z) {
        return new j6d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final j6d f(ExoPlaybackException exoPlaybackException) {
        return new j6d(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final j6d g(int i) {
        return new j6d(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final j6d h(boolean z) {
        return new j6d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final j6d i(mqh mqhVar) {
        return new j6d(mqhVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long k() {
        long j;
        long j2;
        if (!l()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return tpi.C(tpi.M(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean l() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
