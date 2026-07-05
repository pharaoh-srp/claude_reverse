package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qw5 extends hqb {
    public final int S = s5c.e(this);
    public hqb T;

    @Override // defpackage.hqb
    public final void f1() {
        super.f1();
        for (hqb hqbVar = this.T; hqbVar != null; hqbVar = hqbVar.J) {
            hqbVar.o1(this.L);
            if (!hqbVar.R) {
                hqbVar.f1();
            }
        }
    }

    @Override // defpackage.hqb
    public final void g1() {
        for (hqb hqbVar = this.T; hqbVar != null; hqbVar = hqbVar.J) {
            hqbVar.g1();
        }
        super.g1();
    }

    @Override // defpackage.hqb
    public final void k1() {
        super.k1();
        for (hqb hqbVar = this.T; hqbVar != null; hqbVar = hqbVar.J) {
            hqbVar.k1();
        }
    }

    @Override // defpackage.hqb
    public final void l1() {
        for (hqb hqbVar = this.T; hqbVar != null; hqbVar = hqbVar.J) {
            hqbVar.l1();
        }
        super.l1();
    }

    @Override // defpackage.hqb
    public final void m1() {
        super.m1();
        for (hqb hqbVar = this.T; hqbVar != null; hqbVar = hqbVar.J) {
            hqbVar.m1();
        }
    }

    @Override // defpackage.hqb
    public final void n1(hqb hqbVar) {
        this.E = hqbVar;
        for (hqb hqbVar2 = this.T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
            hqbVar2.n1(hqbVar);
        }
    }

    @Override // defpackage.hqb
    public final void o1(m5c m5cVar) {
        this.L = m5cVar;
        for (hqb hqbVar = this.T; hqbVar != null; hqbVar = hqbVar.J) {
            hqbVar.o1(m5cVar);
        }
    }

    public final nw5 p1(nw5 nw5Var) {
        hqb hqbVarX0 = nw5Var.x0();
        if (hqbVarX0 != nw5Var) {
            hqb hqbVar = nw5Var instanceof hqb ? (hqb) nw5Var : null;
            hqb hqbVar2 = hqbVar != null ? hqbVar.I : null;
            if (hqbVarX0 != this.E || !x44.r(hqbVar2, this)) {
                sz6.j("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (hqbVarX0.R) {
                b39.c("Cannot delegate to an already attached node");
            }
            hqbVarX0.n1(this.E);
            int i = this.G;
            int iF = s5c.f(hqbVarX0);
            hqbVarX0.G = iF;
            int i2 = this.G;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof pu9)) {
                b39.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + hqbVarX0);
            }
            hqbVarX0.J = this.T;
            this.T = hqbVarX0;
            hqbVarX0.I = this;
            r1(iF | this.G, false);
            if (this.R) {
                if (i3 == 0 || (i & 2) != 0) {
                    o1(this.L);
                } else {
                    g5c g5cVar = yfd.W(this).k0;
                    this.E.o1(null);
                    g5cVar.l();
                }
                hqbVarX0.f1();
                hqbVarX0.l1();
                if (!hqbVarX0.R) {
                    b39.c("autoInvalidateInsertedNode called on unattached node");
                }
                s5c.a(hqbVarX0, -1, 1);
            }
        }
        return nw5Var;
    }

    public final void q1(nw5 nw5Var) {
        hqb hqbVar = null;
        for (hqb hqbVar2 = this.T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
            if (hqbVar2 == nw5Var) {
                boolean z = hqbVar2.R;
                if (z) {
                    mvb mvbVar = s5c.a;
                    if (!z) {
                        b39.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    s5c.a(hqbVar2, -1, 2);
                    hqbVar2.m1();
                    hqbVar2.g1();
                }
                hqbVar2.n1(hqbVar2);
                hqbVar2.H = 0;
                hqb hqbVar3 = hqbVar2.J;
                if (hqbVar == null) {
                    this.T = hqbVar3;
                } else {
                    hqbVar.J = hqbVar3;
                }
                hqbVar2.J = null;
                hqbVar2.I = null;
                int i = this.G;
                int iF = s5c.f(this);
                r1(iF, true);
                if (this.R && (i & 2) != 0 && (iF & 2) == 0) {
                    g5c g5cVar = yfd.W(this).k0;
                    this.E.o1(null);
                    g5cVar.l();
                    return;
                }
                return;
            }
            hqbVar = hqbVar2;
        }
        xh6.d("Could not find delegate: ", nw5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [hqb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hqb] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void r1(int i, boolean z) {
        hqb hqbVar;
        int i2 = this.G;
        this.G = i;
        if (i2 != i) {
            hqb hqbVar2 = this.E;
            if (hqbVar2 == this) {
                this.H = i;
            }
            boolean z2 = this.R;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.G;
                    r2.G = i;
                    if (r2 == hqbVar2) {
                        break;
                    } else {
                        r2 = r2.I;
                    }
                }
                if (z && r2 == hqbVar2) {
                    i = s5c.f(hqbVar2);
                    hqbVar2.G = i;
                }
                int i3 = i | ((r2 == 0 || (hqbVar = r2.J) == null) ? 0 : hqbVar.H);
                for (?? r22 = r2; r22 != 0; r22 = r22.I) {
                    i3 |= r22.G;
                    r22.H = i3;
                }
            }
        }
    }
}
