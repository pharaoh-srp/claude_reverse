package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oc5 implements s5i {
    public final int b;

    public oc5(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        sz6.p("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.s5i
    public final y5i a(a11 a11Var, tx8 tx8Var) {
        if ((tx8Var instanceof ixg) && ((ixg) tx8Var).c != rg5.E) {
            return new qc5(a11Var, tx8Var, this.b);
        }
        return new o6c(a11Var, tx8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oc5) {
            return this.b == ((oc5) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b * 31);
    }
}
