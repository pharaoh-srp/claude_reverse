package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class oai {
    public static final zbi a = new zbi();

    public static final km3 a(boolean z, ld4 ld4Var, int i) {
        yt7 yt7Var;
        yt7 yt7VarA;
        yt7 yt7Var2;
        if ((i & 1) != 0) {
            z = false;
        }
        e18 e18Var = (e18) ld4Var;
        if (z) {
            e18Var.a0(-994381826);
            e18Var.p(false);
            yt7Var = hv7.a;
        } else {
            e18Var.a0(-994381024);
            fv7 fv7Var = hv7.a;
            yt7 yt7VarA2 = hv7.a((ou7) st7.a.getValue(), (ou7) st7.b.getValue(), e18Var, 3072, 4);
            e18Var.p(false);
            yt7Var = yt7VarA2;
        }
        if (z) {
            e18 e18Var2 = (e18) ld4Var;
            e18Var2.a0(-994378754);
            e18Var2.p(false);
            yt7VarA = hv7.a;
        } else {
            e18 e18Var3 = (e18) ld4Var;
            e18Var3.a0(-994377951);
            yt7VarA = hv7.a((ou7) st7.c.getValue(), (ou7) st7.d.getValue(), e18Var3, 3072, 0);
            e18Var3.p(false);
        }
        lz1 lz1Var = jd4.a;
        if (z) {
            e18 e18Var4 = (e18) ld4Var;
            e18Var4.a0(-994375685);
            e18Var4.p(false);
            yt7Var2 = hv7.b;
        } else {
            e18 e18Var5 = (e18) ld4Var;
            e18Var5.a0(-994374976);
            ou7 ou7Var = (ou7) st7.e.getValue();
            e18Var5.a0(1339450100);
            boolean zF = e18Var5.f(aoe.b(e18Var5)) | e18Var5.f(ou7Var) | e18Var5.f(null);
            Object objN = e18Var5.N();
            if (zF || objN == lz1Var) {
                objN = new yt7[1];
                e18Var5.k0(objN);
            }
            yt7[] yt7VarArr = (yt7[]) objN;
            yt7 yt7Var3 = yt7VarArr[0];
            if (yt7Var3 == null) {
                ArrayList arrayList = new ArrayList();
                e18Var5.a0(-1278628344);
                for (dv7 dv7Var : hv7.d) {
                    int i2 = dv7Var.E;
                    if (1 > i2 || i2 >= 1001) {
                        c39.a("'wght' value must be in [1, 1000]. Actual: " + i2);
                    }
                    arrayList.add(oq5.e(ou7Var, dv7Var, new bv7(new av7(i2)), e18Var5, 0, 4));
                    e18Var5.a0(-982087154);
                    e18Var5.p(false);
                }
                e18Var5.p(false);
                cu7 cu7Var = new cu7(arrayList);
                boolean zF2 = e18Var5.f(cu7Var);
                Object objN2 = e18Var5.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = new gv7(0, cu7Var);
                    e18Var5.k0(objN2);
                }
                yt7Var3 = (yt7) objN2;
                yt7VarArr[0] = yt7Var3;
            }
            e18Var5.p(false);
            yt7Var2 = yt7Var3;
            e18Var5.p(false);
        }
        e18 e18Var6 = (e18) ld4Var;
        boolean zF3 = e18Var6.f(yt7Var) | e18Var6.f(yt7VarA) | e18Var6.f(yt7Var2);
        Object objN3 = e18Var6.N();
        if (zF3 || objN3 == lz1Var) {
            objN3 = new km3(yt7Var, yt7VarA, yt7Var2);
            e18Var6.k0(objN3);
        }
        return (km3) objN3;
    }
}
