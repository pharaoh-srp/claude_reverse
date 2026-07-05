package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class htf {
    public final gtf a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final Set e;

    public /* synthetic */ htf(gtf gtfVar, int i, Set set, int i2) {
        this((i2 & 1) != 0 ? null : gtfVar, false, false, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? um6.E : set);
    }

    public static htf a(htf htfVar, gtf gtfVar, boolean z, boolean z2, int i, LinkedHashSet linkedHashSet, int i2) {
        if ((i2 & 1) != 0) {
            gtfVar = htfVar.a;
        }
        gtf gtfVar2 = gtfVar;
        if ((i2 & 2) != 0) {
            z = htfVar.b;
        }
        boolean z3 = z;
        if ((i2 & 4) != 0) {
            z2 = htfVar.c;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            i = htfVar.d;
        }
        int i3 = i;
        Set set = linkedHashSet;
        if ((i2 & 16) != 0) {
            set = htfVar.e;
        }
        Set set2 = set;
        htfVar.getClass();
        set2.getClass();
        return new htf(gtfVar2, z3, z4, i3, set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htf)) {
            return false;
        }
        htf htfVar = (htf) obj;
        return x44.r(this.a, htfVar.a) && this.b == htfVar.b && this.c == htfVar.c && this.d == htfVar.d && x44.r(this.e, htfVar.e);
    }

    public final int hashCode() {
        gtf gtfVar = this.a;
        return this.e.hashCode() + vb7.c(this.d, fsh.p(fsh.p((gtfVar == null ? 0 : gtfVar.hashCode()) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return "SessionPaginationState(cursor=" + this.a + ", isLoadingMore=" + this.b + ", lastPageFailed=" + this.c + ", autoChainedPages=" + this.d + ", deletedSessionIds=" + this.e + ")";
    }

    public htf(gtf gtfVar, boolean z, boolean z2, int i, Set set) {
        set.getClass();
        this.a = gtfVar;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = set;
    }
}
