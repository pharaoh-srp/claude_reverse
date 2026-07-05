package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class a1a {
    public static final p0a a = new p0a(null, 0, false, MTTypesetterKt.kLineSkipLimitMultiplier, new z0a(), MTTypesetterKt.kLineSkipLimitMultiplier, false, fd9.c(im6.E), dch.h(), sl4.b(0, 0, 0, 0, 15), lm6.E, 0, 0, 0, false, ukc.E, 0, 0);

    public static final x0a a(final int i, int i2, ld4 ld4Var) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        y5f y5fVar = x0a.y;
        boolean zD = ((e18) ld4Var).d(i) | ((e18) ld4Var).d(0);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (zD || objN == jd4.a) {
            objN = new zy7() { // from class: y0a
                @Override // defpackage.zy7
                public final Object a() {
                    return new x0a(i, 0);
                }
            };
            e18Var.k0(objN);
        }
        return (x0a) iuj.K(objArr, y5fVar, (zy7) objN, e18Var, 0);
    }
}
