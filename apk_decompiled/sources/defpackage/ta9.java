package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ta9 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ua9 F;

    public /* synthetic */ ta9(ua9 ua9Var, int i) {
        this.E = i;
        this.F = ua9Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue;
        int i = this.E;
        nm6 nm6Var = nm6.E;
        ua9 ua9Var = this.F;
        q5b q5bVar = (q5b) obj;
        h5b h5bVar = (h5b) obj2;
        rl4 rl4Var = (rl4) obj3;
        switch (i) {
            case 0:
                q5bVar.getClass();
                h5bVar.getClass();
                c3d c3dVarU = h5bVar.u(rl4Var.a);
                a80 a80Var = ua9Var.a;
                if (((Number) a80Var.e()).intValue() != -1) {
                    iIntValue = ((Number) a80Var.e()).intValue();
                } else {
                    iIntValue = ua9Var.c;
                    if (iIntValue == -1) {
                        iIntValue = c3dVarU.F;
                    }
                }
                return q5bVar.U(c3dVarU.E, iIntValue, nm6Var, new b1(c3dVarU, 14));
            default:
                q5bVar.getClass();
                h5bVar.getClass();
                c3d c3dVarU2 = h5bVar.u(rl4Var.a);
                int i2 = c3dVarU2.F;
                ua9Var.c = i2;
                return q5bVar.U(c3dVarU2.E, i2, nm6Var, new b1(c3dVarU2, 15));
        }
    }
}
