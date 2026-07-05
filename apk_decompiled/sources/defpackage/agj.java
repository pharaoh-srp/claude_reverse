package defpackage;

import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class agj {
    public final UUID a;
    public final zfj b;
    public final HashSet c;
    public final pf5 d;
    public final pf5 e;
    public final int f;
    public final int g;
    public final ql4 h;
    public final long i;
    public final yfj j;
    public final long k;
    public final int l;

    public agj(UUID uuid, zfj zfjVar, HashSet hashSet, pf5 pf5Var, pf5 pf5Var2, int i, int i2, ql4 ql4Var, long j, yfj yfjVar, long j2, int i3) {
        pf5Var.getClass();
        pf5Var2.getClass();
        this.a = uuid;
        this.b = zfjVar;
        this.c = hashSet;
        this.d = pf5Var;
        this.e = pf5Var2;
        this.f = i;
        this.g = i2;
        this.h = ql4Var;
        this.i = j;
        this.j = yfjVar;
        this.k = j2;
        this.l = i3;
    }

    public final pf5 a() {
        return this.d;
    }

    public final zfj b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !agj.class.equals(obj.getClass())) {
            return false;
        }
        agj agjVar = (agj) obj;
        if (this.f == agjVar.f && this.g == agjVar.g && this.a.equals(agjVar.a) && this.b == agjVar.b && x44.r(this.d, agjVar.d) && this.h.equals(agjVar.h) && this.i == agjVar.i && x44.r(this.j, agjVar.j) && this.k == agjVar.k && this.l == agjVar.l && this.c.equals(agjVar.c)) {
            return x44.r(this.e, agjVar.e);
        }
        return false;
    }

    public final int hashCode() {
        int iE = vb7.e((this.h.hashCode() + ((((((this.e.hashCode() + ((this.c.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, 31, this.i);
        yfj yfjVar = this.j;
        return Integer.hashCode(this.l) + vb7.e((iE + (yfjVar != null ? yfjVar.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
