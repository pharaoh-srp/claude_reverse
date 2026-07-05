package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ox9 {
    public static final dx9 a = new dx9(null, 0, false, MTTypesetterKt.kLineSkipLimitMultiplier, new nx9(0), MTTypesetterKt.kLineSkipLimitMultiplier, false, fd9.c(im6.E), dch.h(), 0, new e69(8), new e69(9), lm6.E, 0, 0, 0, ukc.E, 0, 0);

    public static final lx9 a(int i, int i2, ld4 ld4Var) {
        int i3 = 0;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        y5f y5fVar = lx9.w;
        boolean zD = ((e18) ld4Var).d(i) | ((e18) ld4Var).d(0);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (zD || objN == jd4.a) {
            objN = new mx9(i, i3);
            e18Var.k0(objN);
        }
        return (lx9) iuj.K(objArr, y5fVar, (zy7) objN, e18Var, 0);
    }
}
