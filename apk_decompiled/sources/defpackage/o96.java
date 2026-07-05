package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o96 extends yj6 {
    public n96 N;
    public xtc O;
    public int P;

    public o96(String str, String str2, xtc xtcVar) {
        super(new z3h("#root", ouk.h("#root"), str), str2, null);
        this.N = new n96();
        this.P = 1;
        this.O = xtcVar;
    }

    @Override // defpackage.yj6, defpackage.c5c
    public final String A() {
        return "#document";
    }

    @Override // defpackage.c5c
    public final String D() {
        return e0();
    }

    public final yj6 m0() {
        yj6 yj6VarC0 = c0();
        while (true) {
            if (yj6VarC0 == null) {
                yj6VarC0 = Q("html");
                break;
            }
            if (yj6VarC0.w("html")) {
                break;
            }
            yj6VarC0 = yj6VarC0.y();
        }
        for (yj6 yj6VarC02 = yj6VarC0.c0(); yj6VarC02 != null; yj6VarC02 = yj6VarC02.y()) {
            if (yj6VarC02.w("body") || yj6VarC02.w("frameset")) {
                return yj6VarC02;
            }
        }
        return yj6VarC0.Q("body");
    }

    @Override // defpackage.yj6, defpackage.c5c
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final o96 clone() {
        o96 o96Var = (o96) super.clone();
        n31 n31Var = this.J;
        if (n31Var != null) {
            o96Var.J = n31Var.clone();
        }
        o96Var.N = this.N.clone();
        return o96Var;
    }

    @Override // defpackage.yj6
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final o96 j0() {
        o96 o96Var = new o96(this.H.E, l(), this.O);
        n31 n31Var = this.J;
        if (n31Var != null) {
            o96Var.J = n31Var.clone();
        }
        o96Var.N = this.N.clone();
        return o96Var;
    }

    public o96(String str, int i) {
        this("http://www.w3.org/1999/xhtml", str, new xtc(new iq8()));
    }
}
