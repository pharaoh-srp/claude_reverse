package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vhh implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zhh F;

    public /* synthetic */ vhh(zhh zhhVar, int i) {
        this.E = i;
        this.F = zhhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        o45 o45Var = o45.H;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        int i2 = 1;
        iei ieiVar = iei.a;
        zhh zhhVar = this.F;
        switch (i) {
            case 0:
                l45 l45Var = zhhVar.i;
                if (l45Var != null) {
                    gb9.D(l45Var, null, o45Var, new whh(zhhVar, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0), 1);
                }
                zhhVar.u();
                break;
            case 1:
                l45 l45Var2 = zhhVar.i;
                if (l45Var2 != null) {
                    gb9.D(l45Var2, null, o45Var, new whh(zhhVar, objArr3 == true ? 1 : 0, i2), 1);
                }
                zhhVar.u();
                break;
            case 2:
                l45 l45Var3 = zhhVar.i;
                if (l45Var3 != null) {
                    gb9.D(l45Var3, null, o45Var, new whh(zhhVar, objArr4 == true ? 1 : 0, 2), 1);
                }
                zhhVar.u();
                break;
            case 3:
                zhhVar.w();
                break;
            case 4:
                zy7 zy7Var = zhhVar.g;
                if (zy7Var != null) {
                    zy7Var.a();
                }
                break;
            case 5:
                zhhVar.k();
                break;
            case 6:
                zhhVar.i(false);
                break;
            case 7:
                zhhVar.v();
                break;
            case 8:
                zhhVar.w();
                break;
            case 9:
                zy7 zy7Var2 = zhhVar.g;
                if (zy7Var2 != null) {
                    zy7Var2.a();
                }
                break;
            case 10:
                if (knk.j) {
                    z = zhhVar.C;
                } else {
                    wkh wkhVar = zhhVar.k;
                    if ((wkhVar != null ? wkhVar.e() : null) == zkh.E) {
                        z = true;
                    }
                }
                break;
            case 11:
                zhhVar.w();
                break;
            default:
                zy7 zy7Var3 = zhhVar.g;
                if (zy7Var3 != null) {
                    zy7Var3.a();
                }
                break;
        }
        return ieiVar;
    }
}
