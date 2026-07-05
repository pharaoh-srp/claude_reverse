package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ld6 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld6(f36 f36Var, zy7 zy7Var, c36 c36Var, fu9 fu9Var) {
        super(0);
        this.F = 2;
        this.H = f36Var;
        this.G = zy7Var;
        this.J = c36Var;
        this.I = fu9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        tp4 tp4Var = null;
        int i2 = 3;
        iei ieiVar = iei.a;
        Object obj = this.I;
        Object obj2 = this.J;
        zy7 zy7Var = this.G;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                nwb nwbVar = (nwb) obj2;
                ad6 ad6Var = (ad6) ((nwb) obj3).getValue();
                if (ad6Var != null) {
                    gb9.D((l45) obj, null, null, new jd6(ad6Var, tp4Var, 2), 3);
                }
                if (((Boolean) nwbVar.getValue()).booleanValue()) {
                    zy7Var.a();
                }
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 1:
                nwb nwbVar2 = (nwb) obj2;
                ad6 ad6Var2 = (ad6) ((nwb) obj3).getValue();
                if (ad6Var2 != null) {
                    gb9.D((l45) obj, null, null, new jd6(ad6Var2, tp4Var, i2), 3);
                }
                if (((Boolean) nwbVar2.getValue()).booleanValue()) {
                    zy7Var.a();
                }
                nwbVar2.setValue(Boolean.FALSE);
                break;
            default:
                ((f36) obj3).i(zy7Var, (c36) obj2, (fu9) obj);
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld6(zy7 zy7Var, nwb nwbVar, l45 l45Var, nwb nwbVar2, int i) {
        super(0);
        this.F = i;
        this.G = zy7Var;
        this.H = nwbVar;
        this.I = l45Var;
        this.J = nwbVar2;
    }
}
