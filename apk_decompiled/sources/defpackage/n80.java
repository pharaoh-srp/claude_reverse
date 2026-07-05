package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class n80 {
    public static final yig a = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7);
    public static final yig b;
    public static final yig c;

    static {
        l9e l9eVar = nzi.a;
        b = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, new va6(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        c = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, new y69(4294967297L), 3);
    }

    public static final wlg a(float f, yig yigVar, String str, ld4 ld4Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            yigVar = b;
        }
        yig yigVar2 = yigVar;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        return c(new va6(f), dgj.h, yigVar2, null, str, ld4Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }

    public static final wlg b(float f, kl7 kl7Var, String str, ld4 ld4Var, int i, int i2) {
        kl7 kl7Var2;
        int i3 = i2 & 2;
        yig yigVar = a;
        if (i3 != 0) {
            kl7Var = yigVar;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (kl7Var == yigVar) {
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(1144115775);
            boolean zC = e18Var.c(0.01f);
            Object objN = e18Var.N();
            if (zC || objN == jd4.a) {
                objN = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, Float.valueOf(0.01f), 3);
                e18Var.k0(objN);
            }
            e18Var.p(false);
            kl7Var2 = (yig) objN;
        } else {
            e18 e18Var2 = (e18) ld4Var;
            e18Var2.a0(1144225701);
            e18Var2.p(false);
            kl7Var2 = kl7Var;
        }
        return c(Float.valueOf(f), dgj.f, kl7Var2, null, str2, ld4Var, (i << 3) & 57344, 0);
    }

    public static final wlg c(Object obj, c9i c9iVar, mb0 mb0Var, Float f, String str, ld4 ld4Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = mpk.P(null);
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) objN;
        Object objN2 = e18Var.N();
        if (objN2 == lz1Var) {
            objN2 = new a80(obj, c9iVar, f);
            e18Var.k0(objN2);
        }
        a80 a80Var = (a80) objN2;
        nwb nwbVarZ = mpk.Z(null, e18Var);
        if (f != null && (mb0Var instanceof yig)) {
            yig yigVar = (yig) mb0Var;
            if (!x44.r(yigVar.c, f)) {
                mb0Var = new yig(yigVar.a, yigVar.b, f);
            }
        }
        nwb nwbVarZ2 = mpk.Z(mb0Var, e18Var);
        Object objN3 = e18Var.N();
        if (objN3 == lz1Var) {
            objN3 = wd6.P(-1, 6, null);
            e18Var.k0(objN3);
        }
        gh2 gh2Var = (gh2) objN3;
        boolean zH = e18Var.h(gh2Var) | e18Var.h(obj);
        Object objN4 = e18Var.N();
        if (zH || objN4 == lz1Var) {
            objN4 = new l80(gh2Var, 0, obj);
            e18Var.k0(objN4);
        }
        fd9.s((zy7) objN4, e18Var);
        boolean zH2 = e18Var.h(gh2Var) | e18Var.h(a80Var) | e18Var.f(nwbVarZ2) | e18Var.f(nwbVarZ);
        Object objN5 = e18Var.N();
        if (zH2 || objN5 == lz1Var) {
            m80 m80Var = new m80(gh2Var, a80Var, nwbVarZ2, nwbVarZ, null, 0);
            e18Var.k0(m80Var);
            objN5 = m80Var;
        }
        fd9.i(e18Var, (pz7) objN5, gh2Var);
        wlg wlgVar = (wlg) nwbVar.getValue();
        return wlgVar == null ? a80Var.c : wlgVar;
    }
}
