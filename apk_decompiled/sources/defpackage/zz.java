package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zz extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ dae G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz(int i, dae daeVar) {
        super(1);
        this.F = i;
        this.G = daeVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.F;
        dae daeVar = this.G;
        switch (i) {
            case 0:
                daeVar.E = (jt7) obj;
                return Boolean.TRUE;
            case 1:
                kp8 kp8Var = (kp8) obj;
                Object obj2 = daeVar.E;
                if (obj2 == null && kp8Var.U) {
                    daeVar.E = kp8Var;
                } else if (obj2 != null) {
                    kp8Var.getClass();
                }
                return Boolean.TRUE;
            default:
                Object obj3 = (p6i) obj;
                if (((hqb) obj3).E.R) {
                    daeVar.E = obj3;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
