package defpackage;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class qig {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final zn5 a(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        cz5 cz5Var = (cz5) e18Var.j(ve4.h);
        boolean zC = e18Var.c(cz5Var.getDensity());
        Object objN = e18Var.N();
        if (zC || objN == jd4.a) {
            objN = new zn5(new gmf(cz5Var));
            e18Var.k0(objN);
        }
        return (zn5) objN;
    }
}
