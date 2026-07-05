package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class sgj {
    public final String a;
    public final zfj b;
    public final pf5 c;
    public final long d;
    public final long e;
    public final long f;
    public final ql4 g;
    public final int h;
    public final jc1 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public sgj(String str, zfj zfjVar, pf5 pf5Var, long j, long j2, long j3, ql4 ql4Var, int i, jc1 jc1Var, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        pf5Var.getClass();
        this.a = str;
        this.b = zfjVar;
        this.c = pf5Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = ql4Var;
        this.h = i;
        this.i = jc1Var;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final agj a() {
        int i;
        long j;
        long jB;
        int i2;
        boolean z;
        List list = this.q;
        pf5 pf5Var = !list.isEmpty() ? (pf5) list.get(0) : pf5.b;
        UUID uuidFromString = UUID.fromString(this.a);
        uuidFromString.getClass();
        HashSet hashSet = new HashSet(this.p);
        long j2 = this.e;
        int i3 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        yfj yfjVar = i3 != 0 ? new yfj(j2, this.f) : null;
        zfj zfjVar = this.b;
        int i4 = this.h;
        long j3 = this.d;
        zfj zfjVar2 = zfj.E;
        if (zfjVar == zfjVar2) {
            String str = tgj.z;
            if (zfjVar != zfjVar2 || i4 <= 0) {
                i2 = i3;
                z = false;
            } else {
                i2 = i3;
                z = true;
            }
            j = j3;
            jB = vlk.b(z, i4, this.i, this.j, this.k, this.l, i2 != 0, j, this.f, j2, this.n);
            i = i4;
        } else {
            i = i4;
            j = j3;
            jB = Long.MAX_VALUE;
        }
        return new agj(uuidFromString, zfjVar, hashSet, this.c, pf5Var, i, this.m, this.g, j, yfjVar, jB, this.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgj)) {
            return false;
        }
        sgj sgjVar = (sgj) obj;
        return x44.r(this.a, sgjVar.a) && this.b == sgjVar.b && x44.r(this.c, sgjVar.c) && this.d == sgjVar.d && this.e == sgjVar.e && this.f == sgjVar.f && this.g.equals(sgjVar.g) && this.h == sgjVar.h && this.i == sgjVar.i && this.j == sgjVar.j && this.k == sgjVar.k && this.l == sgjVar.l && this.m == sgjVar.m && this.n == sgjVar.n && this.o == sgjVar.o && this.p.equals(sgjVar.p) && this.q.equals(sgjVar.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + kgh.m(vb7.c(this.o, vb7.e(vb7.c(this.m, vb7.c(this.l, vb7.e(vb7.e((this.i.hashCode() + vb7.c(this.h, (this.g.hashCode() + vb7.e(vb7.e(vb7.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31)) * 31, 31, this.j), 31, this.k), 31), 31), 31, this.n), 31), 31, this.p);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
    }
}
