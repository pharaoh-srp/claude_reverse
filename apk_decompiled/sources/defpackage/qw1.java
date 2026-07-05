package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qw1 implements mw1 {
    public final cz5 a;
    public final long b;

    public qw1(gvg gvgVar, long j) {
        this.a = gvgVar;
        this.b = j;
    }

    @Override // defpackage.mw1
    public final iqb a(iqb iqbVar, tt ttVar) {
        return new xv1(ttVar, false);
    }

    public final float b() {
        long j = this.b;
        if (!rl4.c(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.c0(rl4.g(j));
    }

    public final float c() {
        long j = this.b;
        if (!rl4.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.c0(rl4.h(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw1)) {
            return false;
        }
        qw1 qw1Var = (qw1) obj;
        return x44.r(this.a, qw1Var.a) && rl4.b(this.b, qw1Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) rl4.l(this.b)) + ')';
    }
}
