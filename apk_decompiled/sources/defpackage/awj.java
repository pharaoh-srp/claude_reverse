package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class awj {
    public static final ta4 a = new ta4(600008097, false, new xa4(17));
    public static final xb b = new xb(8);

    public static final void a(String str, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        int i3;
        tkh tkhVar;
        long j;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(643429252);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            String strJ0 = d4c.j0(R.string.verification_flow_phone_email_verified_as_prefix, e18Var2);
            long j2 = gm3.a(e18Var2).N;
            tkh tkhVar2 = ((jm3) gm3.c(e18Var2).e.E).i;
            tkh tkhVar3 = ((jm3) gm3.c(e18Var2).e.E).j;
            boolean zF = e18Var2.f(strJ0) | e18Var2.e(j2) | e18Var2.f(tkhVar2) | e18Var2.f(tkhVar3);
            Object objN = e18Var2.N();
            if (zF || objN == jd4.a) {
                tkhVar = tkhVar2;
                egg eggVar = tkh.b(tkhVar2, j2, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214).a;
                j = j2;
                egg eggVar2 = tkh.b(tkhVar3, j2, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214).a;
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
            } else {
                tkhVar = tkhVar2;
                j = j2;
            }
            zb0 zb0Var = (zb0) objN;
            q64 q64VarA = p64.a(ko0.c, lja.T, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var2, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            tkh tkhVar4 = tkhVar;
            tjh.c(zb0Var, null, 0L, 0L, 0L, new fdh(3), 0L, 0, false, 0, 0, null, null, tkhVar4, e18Var2, 0, 0, 261118);
            i3 = 1;
            tjh.b(gid.p(2.0f, R.string.verification_flow_phone_use_different_email, e18Var2, e18Var2, fqbVar), b.c(fqbVar, false, null, null, null, zy7Var, 15), j, 0L, null, null, null, 0L, qeh.c, new fdh(3), 0L, 0, false, 0, 0, null, tkhVar4, e18Var2, 805306368, 0, 129528);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            i3 = 1;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fv0(str, zy7Var, i, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(bz7 bz7Var, zy7 zy7Var, ybg ybgVar, iqb iqbVar, rp6 rp6Var, mnc mncVar, qi3 qi3Var, ld4 ld4Var, int i) {
        rp6 rp6Var2;
        qi3 qi3Var2;
        e18 e18Var;
        int i2;
        final rp6 rp6Var3;
        qi3 qi3Var3;
        final int i3;
        e18 e18Var2;
        boolean z;
        rp6 rp6Var4;
        e18 e18Var3;
        e18 e18Var4;
        bz7Var.getClass();
        zy7Var.getClass();
        ybgVar.getClass();
        e18 e18Var5 = (e18) ld4Var;
        e18Var5.c0(-218717462);
        int i4 = i | (e18Var5.h(bz7Var) ? 4 : 2) | (e18Var5.h(zy7Var) ? 32 : 16) | (e18Var5.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN | (e18Var5.f(mncVar) ? 131072 : 65536) | 524288;
        int i5 = 0;
        if (e18Var5.Q(i4 & 1, (599187 & i4) != 599186)) {
            e18Var5.V();
            int i6 = i & 1;
            Object obj = jd4.a;
            tp4 tp4Var = null;
            if (i6 == 0 || e18Var5.A()) {
                rp6 rp6VarL = xvj.l(e18Var5);
                m7f m7fVarN = sq6.n(e18Var5, -1168520582, e18Var5, -1633490746);
                boolean zF = e18Var5.f(null) | e18Var5.f(m7fVarN);
                Object objN = e18Var5.N();
                if (zF || objN == obj) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var5.k0(objN);
                }
                e18Var5.p(false);
                e18Var5.p(false);
                i2 = i4 & (-3727361);
                rp6Var3 = rp6VarL;
                qi3Var3 = (qi3) objN;
            } else {
                e18Var5.T();
                qi3Var3 = qi3Var;
                i2 = i4 & (-3727361);
                rp6Var3 = rp6Var;
            }
            e18Var5.q();
            boolean zH = e18Var5.h(qi3Var3);
            Object objN2 = e18Var5.N();
            if (zH || objN2 == obj) {
                objN2 = new gw(qi3Var3, tp4Var, 15);
                e18Var5.k0(objN2);
            }
            csg.g((bz7) objN2, e18Var5, 0, 1);
            Object objN3 = e18Var5.N();
            if (objN3 == obj) {
                objN3 = ij0.d(e18Var5);
            }
            bt7 bt7Var = (bt7) objN3;
            zy1 zy1Var = rp6Var3.k;
            u2a u2aVar = rp6Var3.h;
            boolean z2 = (i2 & 14) == 4;
            Object objN4 = e18Var5.N();
            if (z2 || objN4 == obj) {
                objN4 = new vp6(i5, tp4Var, bz7Var);
                e18Var5.k0(objN4);
            }
            x44.b(zy1Var, (pz7) objN4, e18Var5, 0);
            zni.g(rp6Var3.l, ybgVar, e18Var5, 48);
            vo1 vo1Var = lja.T;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            iqb iqbVarL = gb9.L(gb9.I(mpk.b0(iqbVar, mpk.Y(e18Var5), true), mncVar), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var5, 54);
            int iHashCode = Long.hashCode(e18Var5.T);
            hyc hycVarL = e18Var5.l();
            iqb iqbVarE = kxk.E(e18Var5, iqbVarL);
            dd4.e.getClass();
            zy7 zy7Var2 = cd4.b;
            e18Var5.e0();
            if (e18Var5.S) {
                e18Var5.k(zy7Var2);
            } else {
                e18Var5.n0();
            }
            d4c.i0(e18Var5, cd4.f, q64VarA);
            d4c.i0(e18Var5, cd4.e, hycVarL);
            d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var5, cd4.h);
            d4c.i0(e18Var5, cd4.d, iqbVarE);
            String strJ0 = d4c.j0(R.string.verification_flow_title, e18Var5);
            tkh tkhVar = ((jm3) gm3.c(e18Var5).e.E).b;
            fqb fqbVar = fqb.E;
            int i7 = 3;
            qi3 qi3Var4 = qi3Var3;
            tjh.b(strJ0, gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1), 0L, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, tkhVar, e18Var5, 48, 0, 130044);
            tjh.b(d4c.j0(R.string.verification_flow_phone_subtitle, e18Var5), null, 0L, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).g, e18Var5, 0, 0, 130046);
            cjh cjhVarS = rp6Var3.S();
            boolean zF2 = e18Var5.f(rp6Var3);
            Object objN5 = e18Var5.N();
            if (zF2 || objN5 == obj) {
                Object ty4Var = new ty4(1, rp6Var3, rp6.class, "updatePhoneNumberFieldValue", "updatePhoneNumberFieldValue(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0, 11);
                e18Var5.k0(ty4Var);
                objN5 = ty4Var;
            }
            jm9 jm9Var = (jm9) objN5;
            String str = (String) rp6Var3.r.getValue();
            String strJ02 = d4c.j0(R.string.verification_flow_phone_field_label, e18Var5);
            pzi pziVar = (pzi) rp6Var3.q.getValue();
            if (pziVar == null) {
                pziVar = dd8.O;
            }
            int i8 = 0;
            final int i9 = 0;
            zh4.d(cjhVarS, (bz7) jm9Var, strJ02, iv1.s(fqbVar, bt7Var), false, fd9.q0(-1848231426, new tp6(rp6Var3, qi3Var4, i8), e18Var5), str, pziVar, new mp9(i8, i7, i8, 123), null, 0L, null, 5, e18Var5, 100859904, 3600);
            e18 e18Var6 = e18Var5;
            xrk.a(0, 4, e18Var6, null, d4c.j0(R.string.verification_flow_phone_number_validation_error, e18Var6), rp6Var3.T());
            if (rp6Var3.U() == hng.F) {
                e18Var6.a0(550770352);
                hi hiVar = (hi) rp6Var3.t.getValue();
                boolean zF3 = e18Var6.f(rp6Var3);
                Object objN6 = e18Var6.N();
                if (zF3 || objN6 == obj) {
                    objN6 = new bz7() { // from class: up6
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj2) {
                            int i10 = i9;
                            iei ieiVar = iei.a;
                            rp6 rp6Var5 = rp6Var3;
                            switch (i10) {
                                case 0:
                                    hi hiVar2 = (hi) obj2;
                                    hiVar2.getClass();
                                    rp6Var5.t.setValue(hiVar2);
                                    break;
                                case 1:
                                    Boolean bool = (Boolean) obj2;
                                    bool.getClass();
                                    rp6Var5.z.setValue(bool);
                                    break;
                                default:
                                    Boolean bool2 = (Boolean) obj2;
                                    bool2.getClass();
                                    rp6Var5.A.setValue(bool2);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var6.k0(objN6);
                }
                tnk.a(hiVar, (bz7) objN6, null, e18Var6, 0, 12);
                e18 e18Var7 = e18Var6;
                if (((Boolean) rp6Var3.x.getValue()).booleanValue()) {
                    e18Var7.a0(550989801);
                    String strA = u2aVar.a(t2a.J);
                    String strA2 = u2aVar.a(t2a.H);
                    boolean zBooleanValue = ((Boolean) rp6Var3.z.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) rp6Var3.C.getValue()).booleanValue();
                    boolean zF4 = e18Var7.f(rp6Var3);
                    Object objN7 = e18Var7.N();
                    if (zF4 || objN7 == obj) {
                        i3 = 1;
                        objN7 = new bz7() { // from class: up6
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj2) {
                                int i10 = i3;
                                iei ieiVar = iei.a;
                                rp6 rp6Var5 = rp6Var3;
                                switch (i10) {
                                    case 0:
                                        hi hiVar2 = (hi) obj2;
                                        hiVar2.getClass();
                                        rp6Var5.t.setValue(hiVar2);
                                        break;
                                    case 1:
                                        Boolean bool = (Boolean) obj2;
                                        bool.getClass();
                                        rp6Var5.z.setValue(bool);
                                        break;
                                    default:
                                        Boolean bool2 = (Boolean) obj2;
                                        bool2.getClass();
                                        rp6Var5.A.setValue(bool2);
                                        break;
                                }
                                return ieiVar;
                            }
                        };
                        e18Var7.k0(objN7);
                    } else {
                        i3 = 1;
                    }
                    gmk.c(strA, strA2, zBooleanValue, zBooleanValue2, (bz7) objN7, false, e18Var7, 0);
                    e18 e18Var8 = e18Var7;
                    e18Var8.p(false);
                    e18Var3 = e18Var8;
                } else {
                    i3 = 1;
                    e18Var7.a0(551531278);
                    e18Var7.p(false);
                    e18Var3 = e18Var7;
                }
                if (((Boolean) rp6Var3.y.getValue()).booleanValue()) {
                    e18Var3.a0(551605151);
                    String strA3 = u2aVar.a(t2a.I);
                    boolean zBooleanValue3 = ((Boolean) rp6Var3.A.getValue()).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) rp6Var3.D.getValue()).booleanValue();
                    boolean zF5 = e18Var3.f(rp6Var3);
                    Object objN8 = e18Var3.N();
                    if (zF5 || objN8 == obj) {
                        final int i10 = 2;
                        objN8 = new bz7() { // from class: up6
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj2) {
                                int i102 = i10;
                                iei ieiVar = iei.a;
                                rp6 rp6Var5 = rp6Var3;
                                switch (i102) {
                                    case 0:
                                        hi hiVar2 = (hi) obj2;
                                        hiVar2.getClass();
                                        rp6Var5.t.setValue(hiVar2);
                                        break;
                                    case 1:
                                        Boolean bool = (Boolean) obj2;
                                        bool.getClass();
                                        rp6Var5.z.setValue(bool);
                                        break;
                                    default:
                                        Boolean bool2 = (Boolean) obj2;
                                        bool2.getClass();
                                        rp6Var5.A.setValue(bool2);
                                        break;
                                }
                                return ieiVar;
                            }
                        };
                        e18Var3.k0(objN8);
                    }
                    e18 e18Var9 = e18Var3;
                    uwj.a(strA3, zBooleanValue3, zBooleanValue4, (bz7) objN8, false, e18Var9, 0);
                    e18 e18Var10 = e18Var9;
                    e18Var10.p(false);
                    e18Var4 = e18Var10;
                } else {
                    e18Var3.a0(552050094);
                    e18Var3.p(false);
                    e18Var4 = e18Var3;
                }
                e18Var4.p(false);
                e18Var2 = e18Var4;
            } else {
                i3 = 1;
                e18Var6.a0(552060014);
                e18Var6.p(false);
                e18Var2 = e18Var6;
            }
            String strJ03 = d4c.j0(R.string.verification_flow_phone_send_button, e18Var2);
            boolean zBooleanValue5 = ((Boolean) rp6Var3.w.getValue()).booleanValue();
            boolean zF6 = e18Var2.f(rp6Var3);
            Object objN9 = e18Var2.N();
            if (zF6 || objN9 == obj) {
                rp6 rp6Var5 = rp6Var3;
                z = i3;
                Object mx5Var = new mx5(0, rp6Var5, rp6.class, "submitPhoneNumberAndAcceptDocuments", "submitPhoneNumberAndAcceptDocuments()V", 0, 5);
                rp6Var4 = rp6Var5;
                e18Var2.k0(mx5Var);
                objN9 = mx5Var;
            } else {
                rp6Var4 = rp6Var3;
                z = i3;
            }
            e18 e18Var11 = e18Var2;
            dxj.a(strJ03, zBooleanValue5, androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), false, null, null, null, 0L, (zy7) ((jm9) objN9), e18Var11, 384, 248);
            tjh.b(d4c.j0(R.string.verification_flow_phone_explanation, e18Var11), gb9.K(fqbVar, 8.0f, 4.0f), gm3.a(e18Var11).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var11).e.E).i, e18Var11, 0, 0, 130040);
            e18 e18Var12 = e18Var11;
            a(rp6Var4.b.a().m105getEmail_addressZiuLfiY(), zy7Var, e18Var12, i2 & 112);
            e18Var12.p(z);
            Object objN10 = e18Var12.N();
            if (objN10 == obj) {
                objN10 = new fz3(bt7Var, null, 7);
                e18Var12.k0(objN10);
            }
            fd9.i(e18Var12, (pz7) objN10, iei.a);
            qi3Var2 = qi3Var4;
            rp6Var2 = rp6Var4;
            e18Var = e18Var12;
        } else {
            e18Var5.T();
            rp6Var2 = rp6Var;
            qi3Var2 = qi3Var;
            e18Var = e18Var5;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw(bz7Var, zy7Var, ybgVar, iqbVar, rp6Var2, mncVar, qi3Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(float r19, float r20, final float r21, final int r22, final int r23, long r24, defpackage.ld4 r26, defpackage.iqb r27, final java.util.List r28) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awj.c(float, float, float, int, int, long, ld4, iqb, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.c4a r5, defpackage.vp4 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.x4a
            if (r0 == 0) goto L13
            r0 = r6
            x4a r0 = (defpackage.x4a) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            x4a r0 = new x4a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.G
            int r1 = r0.H
            iei r2 = defpackage.iei.a
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            dae r5 = r0.F
            c4a r0 = r0.E
            defpackage.sf5.h0(r6)     // Catch: java.lang.Throwable -> L2b
            goto L70
        L2b:
            r6 = move-exception
            goto L7f
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L34:
            defpackage.sf5.h0(r6)
            a4a r6 = r5.b()
            a4a r1 = defpackage.a4a.H
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L44
            return r2
        L44:
            dae r6 = new dae
            r6.<init>()
            r0.E = r5     // Catch: java.lang.Throwable -> L7a
            r0.F = r6     // Catch: java.lang.Throwable -> L7a
            r0.H = r3     // Catch: java.lang.Throwable -> L7a
            ua2 r1 = new ua2     // Catch: java.lang.Throwable -> L7a
            tp4 r0 = defpackage.zni.I(r0)     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7a
            r1.t()     // Catch: java.lang.Throwable -> L7a
            i r0 = new i     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L7a
            r6.E = r0     // Catch: java.lang.Throwable -> L7a
            r5.a(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r1.r()     // Catch: java.lang.Throwable -> L7a
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L6e
            return r1
        L6e:
            r0 = r5
            r5 = r6
        L70:
            java.lang.Object r5 = r5.E
            l4a r5 = (defpackage.l4a) r5
            if (r5 == 0) goto L79
            r0.c(r5)
        L79:
            return r2
        L7a:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L7f:
            java.lang.Object r5 = r5.E
            l4a r5 = (defpackage.l4a) r5
            if (r5 == 0) goto L88
            r0.c(r5)
        L88:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awj.d(c4a, vp4):java.lang.Object");
    }

    public static boolean e(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static boolean f(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static boolean g(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public static boolean h(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public static boolean i(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static final nwb j(zub zubVar, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = mpk.P(Boolean.FALSE);
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) objN;
        Object objN2 = e18Var.N();
        if (objN2 == lz1Var) {
            objN2 = new kza(zubVar, nwbVar, null, 18);
            e18Var.k0(objN2);
        }
        fd9.i(e18Var, (pz7) objN2, zubVar);
        return nwbVar;
    }

    public static pvi k(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("text_size");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("screen_reader_enabled");
            Boolean boolValueOf = bh9VarS2 != null ? Boolean.valueOf(bh9VarS2.a()) : null;
            bh9 bh9VarS3 = qh9Var.s("bold_text_enabled");
            Boolean boolValueOf2 = bh9VarS3 != null ? Boolean.valueOf(bh9VarS3.a()) : null;
            bh9 bh9VarS4 = qh9Var.s("reduce_transparency_enabled");
            Boolean boolValueOf3 = bh9VarS4 != null ? Boolean.valueOf(bh9VarS4.a()) : null;
            bh9 bh9VarS5 = qh9Var.s("reduce_motion_enabled");
            Boolean boolValueOf4 = bh9VarS5 != null ? Boolean.valueOf(bh9VarS5.a()) : null;
            bh9 bh9VarS6 = qh9Var.s("button_shapes_enabled");
            Boolean boolValueOf5 = bh9VarS6 != null ? Boolean.valueOf(bh9VarS6.a()) : null;
            bh9 bh9VarS7 = qh9Var.s("invert_colors_enabled");
            Boolean boolValueOf6 = bh9VarS7 != null ? Boolean.valueOf(bh9VarS7.a()) : null;
            bh9 bh9VarS8 = qh9Var.s("increase_contrast_enabled");
            Boolean boolValueOf7 = bh9VarS8 != null ? Boolean.valueOf(bh9VarS8.a()) : null;
            bh9 bh9VarS9 = qh9Var.s("assistive_switch_enabled");
            Boolean boolValueOf8 = bh9VarS9 != null ? Boolean.valueOf(bh9VarS9.a()) : null;
            bh9 bh9VarS10 = qh9Var.s("assistive_touch_enabled");
            Boolean boolValueOf9 = bh9VarS10 != null ? Boolean.valueOf(bh9VarS10.a()) : null;
            bh9 bh9VarS11 = qh9Var.s("video_autoplay_enabled");
            Boolean boolValueOf10 = bh9VarS11 != null ? Boolean.valueOf(bh9VarS11.a()) : null;
            bh9 bh9VarS12 = qh9Var.s("closed_captioning_enabled");
            Boolean boolValueOf11 = bh9VarS12 != null ? Boolean.valueOf(bh9VarS12.a()) : null;
            bh9 bh9VarS13 = qh9Var.s("mono_audio_enabled");
            Boolean boolValueOf12 = bh9VarS13 != null ? Boolean.valueOf(bh9VarS13.a()) : null;
            bh9 bh9VarS14 = qh9Var.s("shake_to_undo_enabled");
            Boolean boolValueOf13 = bh9VarS14 != null ? Boolean.valueOf(bh9VarS14.a()) : null;
            bh9 bh9VarS15 = qh9Var.s("reduced_animations_enabled");
            Boolean boolValueOf14 = bh9VarS15 != null ? Boolean.valueOf(bh9VarS15.a()) : null;
            bh9 bh9VarS16 = qh9Var.s("should_differentiate_without_color");
            Boolean boolValueOf15 = bh9VarS16 != null ? Boolean.valueOf(bh9VarS16.a()) : null;
            bh9 bh9VarS17 = qh9Var.s("grayscale_enabled");
            Boolean boolValueOf16 = bh9VarS17 != null ? Boolean.valueOf(bh9VarS17.a()) : null;
            bh9 bh9VarS18 = qh9Var.s("single_app_mode_enabled");
            Boolean boolValueOf17 = bh9VarS18 != null ? Boolean.valueOf(bh9VarS18.a()) : null;
            bh9 bh9VarS19 = qh9Var.s("on_off_switch_labels_enabled");
            Boolean boolValueOf18 = bh9VarS19 != null ? Boolean.valueOf(bh9VarS19.a()) : null;
            bh9 bh9VarS20 = qh9Var.s("speak_screen_enabled");
            Boolean boolValueOf19 = bh9VarS20 != null ? Boolean.valueOf(bh9VarS20.a()) : null;
            bh9 bh9VarS21 = qh9Var.s("speak_selection_enabled");
            Boolean boolValueOf20 = bh9VarS21 != null ? Boolean.valueOf(bh9VarS21.a()) : null;
            bh9 bh9VarS22 = qh9Var.s("rtl_enabled");
            return new pvi(strM, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, boolValueOf10, boolValueOf11, boolValueOf12, boolValueOf13, boolValueOf14, boolValueOf15, boolValueOf16, boolValueOf17, boolValueOf18, boolValueOf19, boolValueOf20, bh9VarS22 != null ? Boolean.valueOf(bh9VarS22.a()) : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Accessibility", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Accessibility", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Accessibility", e3);
            return null;
        }
    }
}
