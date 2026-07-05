package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gk1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ gk1(pz7 pz7Var, pf6 pf6Var, boolean z) {
        this.E = 2;
        this.G = pz7Var;
        this.H = pf6Var;
        this.F = z;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.H;
        Object obj2 = this.G;
        boolean z = this.F;
        switch (i) {
            case 0:
                (z ? (zy7) ((nwb) obj2).getValue() : (zy7) ((nwb) obj).getValue()).a();
                break;
            case 1:
                zy7 zy7Var = (zy7) obj;
                nwb nwbVar = (nwb) obj2;
                if (!z) {
                    zy7Var.a();
                } else {
                    nwbVar.setValue(Boolean.TRUE);
                }
                break;
            case 2:
                ((pz7) obj2).invoke((pf6) obj, Boolean.valueOf(z));
                break;
            default:
                pz7 pz7Var = (pz7) obj2;
                zy7 zy7Var2 = (zy7) obj;
                if (z) {
                    pz7Var.invoke(Boolean.FALSE, "not_now");
                }
                zy7Var2.a();
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ gk1(boolean z, zy7 zy7Var, nwb nwbVar) {
        this.E = 1;
        this.F = z;
        this.H = zy7Var;
        this.G = nwbVar;
    }

    public /* synthetic */ gk1(boolean z, Object obj, Object obj2, int i) {
        this.E = i;
        this.F = z;
        this.G = obj;
        this.H = obj2;
    }
}
