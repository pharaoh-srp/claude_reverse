package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum jq8 extends hr8 {
    public jq8() {
        super("InTableText", 9);
    }

    @Override // defpackage.hr8
    public final boolean d(hsh hshVar, iq8 iq8Var) {
        if (hshVar.a == 5) {
            iq8Var.t.add(new yrh((yrh) hshVar));
            return true;
        }
        if (iq8Var.t.size() > 0) {
            hsh hshVar2 = iq8Var.g;
            for (yrh yrhVar : iq8Var.t) {
                iq8Var.g = yrhVar;
                if (hr8.a(yrhVar)) {
                    iq8Var.u(yrhVar, false);
                } else {
                    iq8Var.k(this);
                    boolean zD = xrg.d(iq8Var.h().H.G, kud.z);
                    er8 er8Var = hr8.K;
                    if (zD) {
                        iq8Var.w = true;
                        er8Var.d(yrhVar, iq8Var);
                        iq8Var.w = false;
                    } else {
                        er8Var.d(yrhVar, iq8Var);
                    }
                }
            }
            iq8Var.g = hshVar2;
            iq8Var.t.clear();
        }
        iq8Var.l = iq8Var.m;
        return iq8Var.I(hshVar);
    }
}
