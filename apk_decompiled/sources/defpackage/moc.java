package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class moc {
    public static final loc a;
    public static final coc b;

    static {
        loc locVar = new loc();
        a = locVar;
        b = new coc(0, 0, 0, 0, 0, 0, tqh.U, new nx9(1), fd9.c(im6.E), locVar, sl4.b(0, 0, 0, 0, 15));
    }

    public static final long a(coc cocVar, int i) {
        int i2 = cocVar.c;
        int i3 = cocVar.b;
        long j = ((long) i) * ((long) (i2 + i3));
        int i4 = -cocVar.f;
        int i5 = cocVar.d;
        long j2 = ((j + ((long) i4)) + ((long) i5)) - ((long) i2);
        int iG = (int) (cocVar.e == ukc.F ? cocVar.g() >> 32 : cocVar.g() & 4294967295L);
        long jE0 = j2 - ((long) (iG - wd6.e0(cocVar.n.e(iG, i3, i4, i5), 0, iG)));
        if (jE0 < 0) {
            return 0L;
        }
        return jE0;
    }

    public static final xs5 b(int i, int i2, ld4 ld4Var, zy7 zy7Var) {
        Object[] objArr = new Object[0];
        y5f y5fVar = xs5.I;
        boolean zD = ((((i2 & 896) ^ 384) > 256 && ((e18) ld4Var).f(zy7Var)) || (i2 & 384) == 256) | ((e18) ld4Var).d(i) | ((e18) ld4Var).c(MTTypesetterKt.kLineSkipLimitMultiplier);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (zD || objN == jd4.a) {
            objN = new t51(i, zy7Var);
            e18Var.k0(objN);
        }
        xs5 xs5Var = (xs5) iuj.K(objArr, y5fVar, (zy7) objN, e18Var, 0);
        xs5Var.H.setValue(zy7Var);
        return xs5Var;
    }
}
