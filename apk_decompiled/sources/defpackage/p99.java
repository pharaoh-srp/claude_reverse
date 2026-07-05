package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class p99 implements PointerInputEventHandler {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ nwb F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public p99(a80 a80Var, a80 a80Var2, zy7 zy7Var, nwb nwbVar, nwb nwbVar2) {
        this.G = a80Var;
        this.I = zy7Var;
        this.H = a80Var2;
        this.F = nwbVar;
        this.J = nwbVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        Object obj = this.J;
        Object obj2 = this.I;
        Object obj3 = this.H;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                Object objN = fd9.N(new ky0(e8dVar, (a80) obj4, (zy7) obj2, (a80) obj3, this.F, (nwb) obj, (tp4) null), tp4Var);
                return objN == m45Var ? objN : ieiVar;
            default:
                Object objN2 = fd9.N(new tm(e8dVar, (bz7) obj4, pf4.a, new wvc(this.F, (bz7) obj3, (lo3) obj2, (bz7) obj), (tp4) null, 26), tp4Var);
                return objN2 == m45Var ? objN2 : ieiVar;
        }
    }

    public p99(bz7 bz7Var, nwb nwbVar, bz7 bz7Var2, lo3 lo3Var, bz7 bz7Var3) {
        this.G = bz7Var;
        this.F = nwbVar;
        this.H = bz7Var2;
        this.I = lo3Var;
        this.J = bz7Var3;
    }
}
