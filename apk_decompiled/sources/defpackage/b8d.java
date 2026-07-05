package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b8d {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public b8d(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean a() {
        return this.h;
    }

    public final boolean b() {
        return this.e;
    }

    public final List c() {
        return this.i;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8d)) {
            return false;
        }
        b8d b8dVar = (b8d) obj;
        return csg.u(this.a, b8dVar.a) && this.b == b8dVar.b && fcc.c(this.c, b8dVar.c) && fcc.c(this.d, b8dVar.d) && this.e == b8dVar.e && Float.compare(this.f, b8dVar.f) == 0 && this.g == b8dVar.g && this.h == b8dVar.h && this.i.equals(b8dVar.i) && fcc.c(this.j, b8dVar.j) && Float.compare(this.k, b8dVar.k) == 0 && fcc.c(this.l, b8dVar.l) && fcc.c(this.m, b8dVar.m);
    }

    public final long f() {
        return this.l;
    }

    public final long g() {
        return this.d;
    }

    public final long h() {
        return this.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + vb7.e(vb7.b(this.k, vb7.e((this.i.hashCode() + fsh.p(vb7.c(this.g, vb7.b(this.f, fsh.p(vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j), 31), 31, this.l);
    }

    public final float i() {
        return this.f;
    }

    public final float j() {
        return this.k;
    }

    public final long k() {
        return this.j;
    }

    public final int l() {
        return this.g;
    }

    public final long m() {
        return this.b;
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) csg.U(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) fcc.k(this.c)) + ", position=" + ((Object) fcc.k(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) j8d.c(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) fcc.k(this.j)) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + ((Object) fcc.k(this.l)) + ", originalEventPosition=" + ((Object) fcc.k(this.m)) + ')';
    }
}
