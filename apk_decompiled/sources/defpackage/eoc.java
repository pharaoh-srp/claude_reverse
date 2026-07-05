package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eoc implements ee1 {
    public boolean E;
    public final Object F;
    public final Object G;
    public Object H;
    public Object I;
    public final Object J;

    public eoc(int i, float f, koc kocVar) {
        this.F = kocVar;
        this.G = new isc(i);
        this.H = new hsc(f);
        this.J = new pz9(i, 30, 100);
    }

    public void a(hh4 hh4Var) {
        kmj kmjVar = (kmj) ((j88) this.J).N.get((gf0) this.G);
        if (kmjVar != null) {
            kmjVar.p(hh4Var);
        }
    }

    public void b(int i) {
        kmj kmjVar = (kmj) ((j88) this.J).N.get((gf0) this.G);
        if (kmjVar != null) {
            if (kmjVar.q) {
                kmjVar.p(new hh4(17, null, null));
            } else {
                kmjVar.c(i);
            }
        }
    }

    @Override // defpackage.ee1
    public void h(hh4 hh4Var) {
        ((j88) this.J).Q.post(new s2k(this, hh4Var, false, 8));
    }

    public eoc(j88 j88Var, ge0 ge0Var, gf0 gf0Var) {
        this.J = j88Var;
        this.H = null;
        this.I = null;
        this.E = false;
        this.F = ge0Var;
        this.G = gf0Var;
    }
}
