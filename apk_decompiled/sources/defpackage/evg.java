package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class evg extends ts9 implements pz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ fvg G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ evg(fvg fvgVar, int i) {
        super(2);
        this.F = i;
        this.G = fvgVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        fvg fvgVar = this.G;
        switch (i) {
            case 0:
                fvgVar.a().F = (ge4) obj2;
                break;
            case 1:
                nv9 nv9VarA = fvgVar.a();
                ((av9) obj).C0(new kv9(nv9VarA, (pz7) obj2, nv9VarA.T));
                break;
            default:
                av9 av9Var = (av9) obj;
                ivg ivgVar = fvgVar.a;
                nv9 nv9Var = av9Var.l0;
                if (nv9Var == null) {
                    nv9Var = new nv9(av9Var, ivgVar);
                    av9Var.l0 = nv9Var;
                }
                fvgVar.b = nv9Var;
                fvgVar.a().h();
                nv9 nv9VarA2 = fvgVar.a();
                if (nv9VarA2.G != ivgVar) {
                    nv9VarA2.G = ivgVar;
                    nv9VarA2.j(false);
                    av9.v0(nv9VarA2.E, false, 7);
                }
                break;
        }
        return ieiVar;
    }
}
