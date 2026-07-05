package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ib0 {
    public final ie3 a;
    public final d56 b;
    public final rok c;
    public final rjg d;

    public ib0(ie3 ie3Var, d56 d56Var, rok rokVar, rjg rjgVar) {
        ie3Var.getClass();
        rokVar.getClass();
        this.a = ie3Var;
        this.b = d56Var;
        this.c = rokVar;
        this.d = rjgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib0)) {
            return false;
        }
        ib0 ib0Var = (ib0) obj;
        return x44.r(this.a, ib0Var.a) && this.b == ib0Var.b && x44.r(this.c, ib0Var.c) && x44.r(this.d, ib0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        rjg rjgVar = this.d;
        return iHashCode + (rjgVar == null ? 0 : rjgVar.hashCode());
    }

    public final String toString() {
        return "AnimationItem(child=" + this.a + ", direction=" + this.b + ", transitionState=" + this.c + ", animator=" + this.d + ')';
    }
}
