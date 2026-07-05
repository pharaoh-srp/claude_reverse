package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z7d {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final List m;
    public final long n;
    public boolean o;
    public boolean p;
    public z7d q;

    public z7d(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public static z7d b(z7d z7dVar, long j, long j2, ArrayList arrayList) {
        z7d z7dVar2 = z7dVar;
        z7d z7dVar3 = new z7d(z7dVar2.a, z7dVar2.b, j, z7dVar2.d, z7dVar2.e, z7dVar2.f, j2, z7dVar2.h, z7dVar2.i, arrayList, z7dVar2.j, z7dVar2.k, z7dVar2.l, z7dVar2.n);
        z7d z7dVar4 = z7dVar2.q;
        if (z7dVar4 == null) {
            z7dVar4 = z7dVar2;
        }
        z7dVar3.q = z7dVar4;
        z7d z7dVar5 = z7dVar2.q;
        if (z7dVar5 != null) {
            z7dVar2 = z7dVar5;
        }
        z7dVar3.q = z7dVar2;
        return z7dVar3;
    }

    public final void a() {
        z7d z7dVar = this.q;
        if (z7dVar == null) {
            this.o = true;
            this.p = true;
        } else if (z7dVar != null) {
            z7dVar.a();
        }
    }

    public final List c() {
        List list = this.m;
        return list == null ? lm6.E : list;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.c;
    }

    public final boolean f() {
        return this.d;
    }

    public final float g() {
        return this.e;
    }

    public final long h() {
        return this.g;
    }

    public final boolean i() {
        return this.h;
    }

    public final int j() {
        return this.i;
    }

    public final long k() {
        return this.b;
    }

    public final boolean l() {
        z7d z7dVar = this.q;
        return z7dVar != null ? z7dVar.l() : this.o || this.p;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) csg.U(this.a)) + ", uptimeMillis=" + this.b + ", position=" + ((Object) fcc.k(this.c)) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + ((Object) fcc.k(this.g)) + ", previousPressed=" + this.h + ", isConsumed=" + l() + ", type=" + ((Object) j8d.c(this.i)) + ", historical=" + c() + ", scrollDelta=" + ((Object) fcc.k(this.j)) + ", scaleFactor=" + this.k + ", panOffset=" + ((Object) fcc.k(this.l)) + ')';
    }

    public /* synthetic */ z7d(long j, long j2, long j3, float f, long j4, long j5, boolean z, boolean z2, int i) {
        this(j, j2, j3, false, f, j4, j5, z, z2, i, 0L, 1.0f, 0L);
    }

    public z7d(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = list;
        this.n = j8;
    }
}
