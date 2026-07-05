package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xi0 {
    public final boolean a;
    public final Long b;
    public final Long c;
    public final long d;
    public final Long e;
    public final long f;

    public xi0(boolean z, Long l, Long l2, long j, Long l3, long j2) {
        this.a = z;
        this.b = l;
        this.c = l2;
        this.d = j;
        this.e = l3;
        this.f = j2;
    }

    public static xi0 a(xi0 xi0Var, boolean z, Long l, Long l2, long j, Long l3, long j2, int i) {
        if ((i & 2) != 0) {
            l = xi0Var.b;
        }
        Long l4 = l;
        if ((i & 4) != 0) {
            l2 = xi0Var.c;
        }
        Long l5 = l2;
        if ((i & 8) != 0) {
            j = xi0Var.d;
        }
        long j3 = j;
        Long l6 = (i & 16) != 0 ? xi0Var.e : l3;
        long j4 = (i & 32) != 0 ? xi0Var.f : j2;
        xi0Var.getClass();
        return new xi0(z, l4, l5, j3, l6, j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi0)) {
            return false;
        }
        xi0 xi0Var = (xi0) obj;
        return this.a == xi0Var.a && x44.r(this.b, xi0Var.b) && x44.r(this.c, xi0Var.c) && this.d == xi0Var.d && x44.r(this.e, xi0Var.e) && this.f == xi0Var.f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iE = vb7.e((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d);
        Long l3 = this.e;
        return Long.hashCode(this.f) + ((iE + (l3 != null ? l3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForegroundState(inForeground=");
        sb.append(this.a);
        sb.append(", lastBackgroundTimestamp=");
        sb.append(this.b);
        sb.append(", lastForegroundTimestamp=");
        sb.append(this.c);
        sb.append(", completedBackgroundMs=");
        sb.append(this.d);
        sb.append(", lastBackgroundElapsedMs=");
        sb.append(this.e);
        sb.append(", completedBackgroundElapsedMs=");
        return grc.r(this.f, ")", sb);
    }

    public /* synthetic */ xi0() {
        this(false, null, null, 0L, null, 0L);
    }
}
