package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams;
import com.anthropic.claude.conway.f;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ysk {
    public static final ta4 a = new ta4(-928529939, false, new wb4(14));
    public static final ta4 b = new ta4(-1468959445, false, new wb4(15));
    public static final ta4 c = new ta4(-1104242490, false, new xb4(5));
    public static final ta4 d = new ta4(2113451477, false, new xb4(6));
    public static final ta4 e = new ta4(1112395606, false, new xb4(7));

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.ls4 r29, java.lang.String r30, defpackage.zy7 r31, defpackage.iqb r32, defpackage.ld4 r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysk.a(ls4, java.lang.String, zy7, iqb, ld4, int, int):void");
    }

    public static final void b(f fVar, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        String str;
        hsf hsfVar;
        int i2;
        lz1 lz1Var;
        nwb nwbVar;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(709232081);
        int i3 = i | (e18Var2.f(fVar) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | (e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        int i4 = 1;
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            nwb nwbVarF = lnk.f(fVar.z, e18Var2);
            nwb nwbVarF2 = lnk.f(fVar.f0, e18Var2);
            nwb nwbVarF3 = lnk.f(fVar.H, e18Var2);
            String str2 = fVar.f.e;
            hsf hsfVar2 = (hsf) nwbVarF.getValue();
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            Object objN = e18Var2.N();
            lz1 lz1Var2 = jd4.a;
            if (z || objN == lz1Var2) {
                str = str2;
                hsfVar = hsfVar2;
                i2 = i5;
                lz1Var = lz1Var2;
                y14 y14Var = new y14(0, fVar, f.class, "refreshExtensionAppScreens", "refreshExtensionAppScreens()V", 0, 25);
                e18Var2.k0(y14Var);
                objN = y14Var;
            } else {
                i2 = i5;
                str = str2;
                hsfVar = hsfVar2;
                lz1Var = lz1Var2;
            }
            zy7 zy7Var4 = (zy7) ((jm9) objN);
            str.getClass();
            m7f m7fVarB = gr9.b(e18Var2);
            Context applicationContext = ((Context) e18Var2.j(w00.b)).getApplicationContext();
            String str3 = str;
            boolean zH = e18Var2.h(applicationContext) | e18Var2.h(m7fVarB) | e18Var2.f(str3);
            Object objN2 = e18Var2.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new ny4(applicationContext, m7fVarB, str3, i4);
                e18Var2.k0(objN2);
            }
            kce kceVar = jce.a;
            p05 p05Var = (p05) fd9.r0(kceVar.b(p05.class), oq5.B(kceVar.b(p05.class)), (bz7) objN2, e18Var2);
            p05Var.g.setValue(hsfVar);
            zy7Var4.getClass();
            p05Var.h = zy7Var4;
            boolean zF = e18Var2.f(p05Var);
            Object objN3 = e18Var2.N();
            tp4 tp4Var = null;
            if (zF || objN3 == lz1Var) {
                objN3 = new kk0(p05Var, tp4Var, 21);
                e18Var2.k0(objN3);
            }
            fd9.i(e18Var2, (pz7) objN3, iei.a);
            hsf hsfVar3 = (hsf) nwbVarF.getValue();
            boolean zF2 = e18Var2.f(nwbVarF) | e18Var2.f(p05Var) | (i2 == 4);
            Object objN4 = e18Var2.N();
            if (zF2 || objN4 == lz1Var) {
                nwbVar = nwbVarF;
                zn znVar = new zn(p05Var, fVar, nwbVar, tp4Var, 13);
                e18Var2.k0(znVar);
                objN4 = znVar;
            } else {
                nwbVar = nwbVarF;
            }
            fd9.i(e18Var2, (pz7) objN4, hsfVar3);
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = mpk.P(null);
                e18Var2.k0(objN5);
            }
            nwb nwbVar2 = (nwb) objN5;
            long j = gm3.a(e18Var2).o;
            WeakHashMap weakHashMap = gdj.x;
            fei feiVar = s4i.d(e18Var2).l;
            ta4 ta4VarQ0 = fd9.q0(204928212, new wh(15, zy7Var), e18Var2);
            ta4 ta4VarQ02 = fd9.q0(-1491650297, new yc2(p05Var, fVar, zy7Var3, zy7Var2, nwbVarF3, nwbVar2, nwbVarF2, nwbVar, 3), e18Var2);
            e18Var = e18Var2;
            fqb fqbVar = fqb.E;
            v40.b(fqbVar, null, ta4VarQ0, wjk.b, null, null, 0, j, 0L, feiVar, MTTypesetterKt.kLineSkipLimitMultiplier, ta4VarQ02, e18Var, 3462, 1394);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo((Object) fVar, zy7Var, zy7Var2, zy7Var3, (Object) iqbVar2, i, 14);
        }
    }

    public static final void c(cte cteVar, String str, ld4 ld4Var, int i) {
        cte cteVar2;
        cteVar.getClass();
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-166034923);
        int i2 = (e18Var.f(cteVar) ? 4 : 2) | i | (e18Var.f(str) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                xb0 xb0Var = new xb0(16);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                new cm5(str, 9).invoke(xb0Var);
                mte mteVar = new mte(xb0Var.n(), sta.q0(linkedHashMap));
                e18Var.k0(mteVar);
                objN = mteVar;
            }
            cteVar2 = cteVar;
            tpk.a(cteVar2, (mte) objN, null, null, false, 0, 0, e18Var, i2 & 14, 62);
        } else {
            cteVar2 = cteVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(i, 23, cteVar2, str);
        }
    }

    public static p0h d(long j, long j2, ld4 ld4Var, int i) {
        long j3 = (i & 1) != 0 ? d54.d : j;
        long j4 = (i & 2) != 0 ? gm3.a(ld4Var).k : j2;
        long j5 = d54.d;
        long j6 = gm3.a(ld4Var).r;
        long jB = d54.b(0.3f, j5);
        long jB2 = d54.b(0.4f, j4);
        long jB3 = d54.b(0.2f, gm3.a(ld4Var).M);
        long jB4 = d54.b(0.5f, j6);
        long j7 = d54.g;
        long jD = p54.d(me7.v, ld4Var);
        long jD2 = p54.d(me7.C, ld4Var);
        long jD3 = p54.d(me7.F, ld4Var);
        long jB5 = d54.b(me7.i, p54.d(me7.h, ld4Var));
        umg umgVar = jwa.a;
        long j8 = j3;
        e18 e18Var = (e18) ld4Var;
        return new p0h(j8, j4, j7, jD, j5, j6, jD2, jD3, jB, jB2, j7, d4c.I(jB5, ((gwa) e18Var.j(umgVar)).a.p), jB3, jB4, d4c.I(d54.b(me7.k, p54.d(me7.q, ld4Var)), ((gwa) e18Var.j(umgVar)).a.p), d4c.I(d54.b(me7.o, p54.d(me7.n, ld4Var)), ((gwa) e18Var.j(umgVar)).a.p));
    }

    public static final xp0 e(ArtifactBottomSheetParams artifactBottomSheetParams, String str, yp0 yp0Var, e18 e18Var) {
        artifactBottomSheetParams.getClass();
        str.getClass();
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean zF = e18Var.f(artifactBottomSheetParams) | e18Var.f(str) | e18Var.h(yp0Var) | e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new fe(artifactBottomSheetParams, str, yp0Var, m7fVar, 1);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        String strB = oq5.B(kceVar.b(xp0.class));
        return (xp0) fd9.r0(kceVar.b(xp0.class), strB, (bz7) objN, e18Var);
    }

    public static final iqb f(iqb iqbVar, float f) {
        return f == MTTypesetterKt.kLineSkipLimitMultiplier ? iqbVar : xn5.j0(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f, null, false, 524031);
    }

    public static long g(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        return (((long) Float.floatToRawIntBits(motionEvent.getRawY(i))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }
}
