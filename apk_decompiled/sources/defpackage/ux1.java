package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ux1 extends hqb implements lx1, yt9 {
    public wn4 S;
    public boolean T;

    public static final l9e p1(ux1 ux1Var, m5c m5cVar, mx1 mx1Var) {
        l9e l9eVar;
        if (ux1Var.R && ux1Var.T) {
            m5c m5cVarV = yfd.V(ux1Var);
            if (!m5cVar.h1().R) {
                m5cVar = null;
            }
            if (m5cVar != null && (l9eVar = (l9e) mx1Var.a()) != null) {
                return l9eVar.m(m5cVarV.J(m5cVar, false).h());
            }
        }
        return null;
    }

    @Override // defpackage.lx1
    public final Object a0(m5c m5cVar, mx1 mx1Var, vp4 vp4Var) {
        Object objN = fd9.N(new tx1(this, m5cVar, mx1Var, new ka1(this, m5cVar, mx1Var, 1), null), vp4Var);
        return objN == m45.E ? objN : iei.a;
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.yt9
    public final void n(cu9 cu9Var) {
        this.T = true;
    }
}
