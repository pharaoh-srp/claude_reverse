package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lic extends ln7 {
    public static final lic e;
    public static final lic f;
    public static final lic g;
    public static final lic h;
    public final /* synthetic */ int d;

    static {
        int i = 1;
        e = new lic(i, 2, 0);
        int i2 = 1;
        f = new lic(i2, i2, 1);
        g = new lic(i, 2, 2);
        int i3 = 1;
        h = new lic(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lic(int i, int i2, int i3) {
        super(i, i2, 1, (byte) 0);
        this.d = i3;
    }

    @Override // defpackage.ln7
    public final void c(gjc gjcVar, hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar) {
        switch (this.d) {
            case 0:
                Object objA = ((zy7) gjcVar.b(0)).a();
                y08 y08Var = (y08) gjcVar.b(1);
                int iA = gjcVar.a(0);
                y08Var.getClass();
                vagVar.U(vagVar.c(y08Var), objA);
                hn0Var.h(iA, objA);
                hn0Var.b(objA);
                break;
            case 1:
                y08 y08Var2 = (y08) gjcVar.b(0);
                int iA2 = gjcVar.a(0);
                hn0Var.g();
                y08Var2.getClass();
                hn0Var.a(iA2, vagVar.D(vagVar.c(y08Var2)));
                break;
            case 2:
                Object objB = gjcVar.b(0);
                y08 y08Var3 = (y08) gjcVar.b(1);
                int iA3 = gjcVar.a(0);
                if (objB instanceof i18) {
                    i18 i18Var = (i18) objB;
                    ((wwb) p60Var.I).b(i18Var);
                    ((fwb) p60Var.H).a(i18Var);
                }
                Object objK = vagVar.K(vagVar.c(y08Var3), objB, iA3);
                if (objK instanceof i18) {
                    p60Var.n((i18) objK);
                } else if (objK instanceof r7e) {
                    ((r7e) objK).c();
                }
                break;
            default:
                Object objB2 = gjcVar.b(0);
                int iA4 = gjcVar.a(0);
                if (objB2 instanceof i18) {
                    i18 i18Var2 = (i18) objB2;
                    ((wwb) p60Var.I).b(i18Var2);
                    ((fwb) p60Var.H).a(i18Var2);
                }
                Object objK2 = vagVar.K(vagVar.t, objB2, iA4);
                if (objK2 instanceof i18) {
                    p60Var.n((i18) objK2);
                } else if (objK2 instanceof r7e) {
                    ((r7e) objK2).c();
                }
                break;
        }
    }

    @Override // defpackage.ln7
    public y08 d(gjc gjcVar) {
        switch (this.d) {
            case 0:
                return (y08) gjcVar.b(1);
            case 1:
                return (y08) gjcVar.b(0);
            default:
                return super.d(gjcVar);
        }
    }
}
