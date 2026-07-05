package defpackage;

import android.view.MotionEvent;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pvj implements dn6 {
    public static final ta4 E = new ta4(-17498441, false, new ua4(12));
    public static final ta4 F = new ta4(1935373848, false, new xa4(3));
    public static final ta4 G = new ta4(-2056539377, false, new ua4(13));
    public static final ta4 H = new ta4(-2125533734, false, new ua4(14));
    public static final yud I = new yud(1);

    public static final void a(o82 o82Var, iqb iqbVar, ld4 ld4Var, int i) {
        o82Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-981847419);
        int i2 = (e18Var.h(o82Var) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16);
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 & 14;
            boolean z = i4 == 4 || e18Var.h(o82Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new n82(o82Var, i);
                e18Var.k0(objN);
            }
            fd9.d(o82Var, (bz7) objN, e18Var);
            qnc qncVarB = gb9.b(8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            i = (i4 == 4 || e18Var.h(o82Var)) ? 1 : 0;
            Object objN2 = e18Var.N();
            if (i != 0 || objN2 == lz1Var) {
                objN2 = new n82(o82Var, i3);
                e18Var.k0(objN2);
            }
            knk.h(iqbVar, null, qncVarB, false, null, null, null, false, null, (bz7) objN2, e18Var, ((i2 >> 3) & 14) | 384, 506);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kn(o82Var, iqbVar, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.bpc r30, java.lang.String r31, defpackage.iqb r32, defpackage.tkh r33, defpackage.ld4 r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvj.b(bpc, java.lang.String, iqb, tkh, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.ta4 r14, defpackage.ta4 r15, defpackage.iqb r16, long r17, float r19, defpackage.ld4 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvj.c(ta4, ta4, iqb, long, float, ld4, int, int):void");
    }

    public static final void d(String str, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-379400420);
        int i2 = (e18Var2.f(str) ? 4 : 2) | i;
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            String strJ0 = d4c.j0(R.string.verification_flow_phone_code_enter_code_prefix, e18Var2);
            egg eggVar = ((jm3) gm3.c(e18Var2).e.E).g.a;
            egg eggVar2 = ((jm3) gm3.c(e18Var2).e.E).h.a;
            boolean zF = e18Var2.f(strJ0) | ((i2 & 14) == 4) | e18Var2.f(eggVar) | e18Var2.f(eggVar2);
            Object objN = e18Var2.N();
            if (zF || objN == jd4.a) {
                xb0 xb0Var = new xb0();
                int iM = xb0Var.m(eggVar);
                try {
                    xb0Var.h(strJ0);
                    xb0Var.j(iM);
                    iM = xb0Var.m(eggVar2);
                    try {
                        xb0Var.h(str);
                        xb0Var.j(iM);
                        objN = xb0Var.n();
                        e18Var2.k0(objN);
                    } finally {
                    }
                } finally {
                }
            }
            e18Var = e18Var2;
            tjh.c((zb0) objN, null, 0L, 0L, 0L, new fdh(3), 0L, 0, false, 0, 0, null, null, null, e18Var, 0, 0, 523262);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ngf(str, i, 15);
        }
    }

    public static final void f(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(164271539);
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            int i3 = zb0.I;
            e18Var = e18Var2;
            tjh.c(mwa.z(d4c.j0(R.string.verification_flow_phone_code_not_seeing_code_try_again, e18Var2), null, 6), b.c(fqb.E, false, null, null, null, zy7Var, 15), gm3.a(e18Var2).N, 0L, 0L, new fdh(3), 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var, 0, 0, 261112);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new np1(i, 10, zy7Var);
        }
    }

    public static final void g(boolean z, iqb iqbVar, long j, ta4 ta4Var, ld4 ld4Var, int i) {
        long j2;
        long j3;
        int i2;
        Object fj2Var;
        long j4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(696191967);
        int i3 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.f(iqbVar) ? 32 : 16) | FreeTypeConstants.FT_LOAD_PEDANTIC;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                j3 = gm3.a(e18Var).q;
                i2 = i3 & (-897);
            } else {
                e18Var.T();
                i2 = i3 & (-897);
                j3 = j;
            }
            e18Var.q();
            if (z) {
                e18Var.a0(-141979350);
                ta4Var.invoke(e18Var, 6);
                e18Var.p(false);
                j4 = j3;
            } else {
                e18Var.a0(-141927270);
                boolean zE = ((i2 & 112) == 32) | e18Var.e(j3);
                Object objN = e18Var.N();
                if (zE || objN == jd4.a) {
                    j4 = j3;
                    fj2Var = new fj2(iqbVar, j4, ta4Var, 6);
                    e18Var.k0(fj2Var);
                } else {
                    fj2Var = objN;
                    j4 = j3;
                }
                bvg.a(0, 1, e18Var, (pz7) fj2Var, null);
                e18Var.p(false);
            }
            j2 = j4;
        } else {
            e18Var.T();
            j2 = j;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p50(z, iqbVar, j2, ta4Var, i);
        }
    }

    public static final void h(String str, zy7 zy7Var, zy7 zy7Var2, ybg ybgVar, iqb iqbVar, fti ftiVar, q1d q1dVar, mnc mncVar, ld4 ld4Var, int i) {
        fti ftiVar2;
        q1d q1dVar2;
        int i2;
        q1d q1dVar3;
        fti ftiVar3;
        Object w1dVar;
        tp4 tp4Var;
        bt7 bt7Var;
        lz1 lz1Var;
        q1d q1dVar4;
        String str2;
        str.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        ybgVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-293145877);
        int i3 = 4;
        int i4 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 589824 | (e18Var.f(mncVar) ? 8388608 : 4194304);
        if (e18Var.Q(i4 & 1, (4793491 & i4) != 4793490)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var2 = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                fti ftiVarH = ovj.h(str, e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var2) {
                    objN = m7fVarN.a(jce.a.b(q1d.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i4 & (-4128769);
                q1dVar3 = (q1d) objN;
                ftiVar3 = ftiVarH;
            } else {
                e18Var.T();
                i2 = i4 & (-4128769);
                ftiVar3 = ftiVar;
                q1dVar3 = q1dVar;
            }
            int i6 = i2;
            e18Var.q();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var2) {
                objN2 = ij0.d(e18Var);
            }
            bt7 bt7Var2 = (bt7) objN2;
            boolean zH = e18Var.h(q1dVar3) | ((i6 & 14) == 4) | e18Var.f(ftiVar3);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var2) {
                tp4Var = null;
                bt7Var = bt7Var2;
                lz1Var = lz1Var2;
                w1dVar = new w1d(q1dVar3, str, ftiVar3, tp4Var, 1);
                fti ftiVar4 = ftiVar3;
                q1dVar4 = q1dVar3;
                str2 = str;
                ftiVar2 = ftiVar4;
                e18Var.k0(w1dVar);
            } else {
                w1dVar = objN3;
                ftiVar2 = ftiVar3;
                bt7Var = bt7Var2;
                q1dVar4 = q1dVar3;
                lz1Var = lz1Var2;
                tp4Var = null;
                str2 = str;
            }
            fd9.i(e18Var, (pz7) w1dVar, str2);
            zy1 zy1Var = ftiVar2.h;
            boolean z = (i6 & 112) == 32;
            Object objN4 = e18Var.N();
            if (z || objN4 == lz1Var) {
                objN4 = new zg2(zy7Var, tp4Var, i3);
                e18Var.k0(objN4);
            }
            x44.b(zy1Var, (pz7) objN4, e18Var, 0);
            int i7 = i6 >> 6;
            zni.g(ftiVar2.j, ybgVar, e18Var, 48);
            vo1 vo1Var = lja.T;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            iqb iqbVarL = gb9.L(gb9.I(mpk.b0(iqbVar, mpk.Y(e18Var), true), mncVar), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            String strJ0 = d4c.j0(R.string.verification_flow_title_a11y, e18Var);
            String strJ02 = d4c.j0(R.string.verification_flow_title, e18Var);
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).b;
            boolean zF2 = e18Var.f(strJ0);
            Object objN5 = e18Var.N();
            if (zF2 || objN5 == lz1Var) {
                objN5 = new hti(strJ0, 0);
                e18Var.k0(objN5);
            }
            fqb fqbVar = fqb.E;
            lz1 lz1Var3 = lz1Var;
            int i8 = 0;
            bt7 bt7Var3 = bt7Var;
            q1d q1dVar5 = q1dVar4;
            tjh.b(strJ02, gb9.L(tjf.a(fqbVar, (bz7) objN5), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1), 0L, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 130044);
            d((String) ftiVar2.i.getValue(), e18Var, 0);
            String str3 = (String) ftiVar2.k.getValue();
            boolean zF3 = e18Var.f(ftiVar2);
            Object objN6 = e18Var.N();
            if (zF3 || objN6 == lz1Var3) {
                objN6 = new b2g(1, ftiVar2, fti.class, "updateCodeInput", "updateCodeInput(Ljava/lang/String;)V", 0, 14);
                e18Var.k0(objN6);
            }
            zh4.e(str3, (bz7) ((jm9) objN6), d4c.j0(R.string.verification_flow_phone_code_verify_placeholder, e18Var), iv1.s(fqbVar, bt7Var3), false, null, null, null, new mp9(i8, 3, i8, 123), null, 0L, null, 0, e18Var, 805306368, 15856);
            String strJ03 = d4c.j0(R.string.verification_flow_phone_code_verify_button, e18Var);
            boolean zBooleanValue = ((Boolean) ftiVar2.l.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) ftiVar2.m.getValue()).booleanValue();
            boolean zF4 = e18Var.f(ftiVar2);
            Object objN7 = e18Var.N();
            if (zF4 || objN7 == lz1Var3) {
                objN7 = new ogf(0, ftiVar2, fti.class, "submitCode", "submitCode()V", 0, 10);
                e18Var.k0(objN7);
            }
            dxj.a(strJ03, zBooleanValue, androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), zBooleanValue2, null, null, null, 0L, (zy7) ((jm9) objN7), e18Var, 384, 240);
            tjh.b(d4c.j0(R.string.verification_flow_phone_explanation, e18Var), gb9.K(fqbVar, 8.0f, 4.0f), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 130040);
            e18Var = e18Var;
            f(zy7Var2, e18Var, i7 & 14);
            e18Var.p(true);
            nwb nwbVarH0 = x44.h0(e18Var);
            boolean zF5 = e18Var.f(nwbVarH0);
            Object objN8 = e18Var.N();
            if (zF5 || objN8 == lz1Var3) {
                objN8 = new xoa(bt7Var3, nwbVarH0, null, 4);
                e18Var.k0(objN8);
            }
            fd9.i(e18Var, (pz7) objN8, iei.a);
            q1dVar2 = q1dVar5;
        } else {
            e18Var.T();
            ftiVar2 = ftiVar;
            q1dVar2 = q1dVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mq0(str, zy7Var, zy7Var2, ybgVar, iqbVar, ftiVar2, q1dVar2, mncVar, i);
        }
    }

    public static final yr5 i(int i) {
        return new yr5(i);
    }

    public static final void j(t7d t7dVar, long j, bz7 bz7Var, boolean z) {
        MotionEvent motionEventA = t7dVar.a();
        if (motionEventA == null) {
            sz6.p("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        bz7Var.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventA.setAction(action);
    }
}
