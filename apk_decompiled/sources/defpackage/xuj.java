package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xuj {
    public static final ta4 a = new ta4(651585328, false, new ua4(1));
    public static final float[] b = {0.35f, 0.7f, 0.45f, 1.0f, 0.45f, 0.7f, 0.35f};
    public static final float[] c = {8.0f, 12.0f, 7.0f, 14.0f, 9.0f, 11.0f, 6.0f};

    /* JADX WARN: Removed duplicated region for block: B:100:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.x48 r24, defpackage.iqb r25, defpackage.x0a r26, defpackage.mnc r27, boolean r28, defpackage.uz7 r29, defpackage.bz7 r30, defpackage.zy7 r31, defpackage.ld4 r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xuj.a(x48, iqb, x0a, mnc, boolean, uz7, bz7, zy7, ld4, int, int):void");
    }

    public static final void b(final y49 y49Var, final long j, iqb iqbVar, float f, float f2, float f3, ld4 ld4Var, final int i) {
        final iqb iqbVar2;
        final float f4;
        final float f5;
        e18 e18Var;
        final float f6;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(110670677);
        int i2 = i | (e18Var2.h(y49Var) ? 4 : 2) | 224640;
        if (e18Var2.Q(i2 & 1, (74899 & i2) != 74898)) {
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            Object obj = objN;
            if (objN == lz1Var) {
                ArrayList arrayList = new ArrayList(7);
                for (int i3 = 0; i3 < 7; i3++) {
                    arrayList.add(new hsc(MTTypesetterKt.kLineSkipLimitMultiplier));
                }
                e18Var2.k0(arrayList);
                obj = arrayList;
            }
            final List list = (List) obj;
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = new float[7];
                e18Var2.k0(objN2);
            }
            float[] fArr = (float[]) objN2;
            boolean zH = e18Var2.h(fArr) | ((i2 & 14) == 4 || e18Var2.h(y49Var)) | e18Var2.h(list);
            Object objN3 = e18Var2.N();
            if (zH || objN3 == lz1Var) {
                lza lzaVar = new lza(y49Var, fArr, list, (tp4) null, 5);
                e18Var2.k0(lzaVar);
                objN3 = lzaVar;
            }
            fd9.i(e18Var2, (pz7) objN3, y49Var);
            fqb fqbVar = fqb.E;
            iqb iqbVarQ = b.q(fqbVar, 68.25f, 41.25f);
            boolean zH2 = e18Var2.h(list);
            Object objN4 = e18Var2.N();
            final float f7 = 5.25f;
            final float f8 = 5.25f;
            final float f9 = 36.0f;
            if (zH2 || objN4 == lz1Var) {
                bz7 bz7Var = new bz7() { // from class: u2d
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj2) {
                        b52 b52Var = (b52) obj2;
                        b52Var.getClass();
                        final float density = b52Var.getDensity() * f7;
                        final float density2 = (b52Var.getDensity() * f8) + density;
                        final float density3 = b52Var.getDensity() * f9;
                        final float fIntBitsToFloat = Float.intBitsToFloat((int) (b52Var.E.g() & 4294967295L)) / 2.0f;
                        final List list2 = list;
                        final long j2 = j;
                        return b52Var.a(new bz7() { // from class: w2d
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj3) {
                                xd6 xd6Var = (xd6) obj3;
                                xd6Var.getClass();
                                for (int i4 = 0; i4 < 7; i4++) {
                                    float f10 = density;
                                    float f11 = (i4 * density2) + (f10 / 2.0f);
                                    float fH = ((((((hsc) list2.get(i4)).h() * 0.85f) + 0.15f) * xuj.b[i4]) * density3) / 2.0f;
                                    float f12 = fIntBitsToFloat;
                                    xd6Var.M(j2, (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12 - fH)) & 4294967295L), (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12 + fH)) & 4294967295L), (504 & 8) != 0 ? 0.0f : f10, (504 & 16) != 0 ? 0 : 1);
                                }
                                return iei.a;
                            }
                        });
                    }
                };
                e18Var2.k0(bz7Var);
                objN4 = bz7Var;
            }
            kxk.g(e18Var2, zni.t(iqbVarQ, (bz7) objN4));
            iqbVar2 = fqbVar;
            e18Var = e18Var2;
            f4 = 5.25f;
            f6 = 5.25f;
            f5 = 36.0f;
        } else {
            e18Var2.T();
            iqbVar2 = iqbVar;
            f4 = f;
            f5 = f3;
            e18Var = e18Var2;
            f6 = f2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(j, iqbVar2, f4, f6, f5, i) { // from class: v2d
                public final /* synthetic */ long F;
                public final /* synthetic */ iqb G;
                public final /* synthetic */ float H;
                public final /* synthetic */ float I;
                public final /* synthetic */ float J;

                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP0 = x44.p0(57);
                    xuj.b(this.E, this.F, this.G, this.H, this.I, this.J, (ld4) obj2, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void c(iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        ta4 ta4Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(790527681);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        int i3 = 6;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                lsc lscVar = new lsc(null, ql8.J);
                e18Var.k0(lscVar);
                objN = lscVar;
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new k3c(10, nwbVar);
                e18Var.k0(objN2);
            }
            zy7 zy7Var = (zy7) objN2;
            v9d v9dVar = ou5.a;
            hf1 hf1VarB = bwk.b(kkk.b, e18Var, 6);
            iqbVar2 = iqbVar;
            ta4Var2 = ta4Var;
            j8.d(new hvd[]{keh.b.a(grk.h(zy7Var, e18Var, 2)), keh.a.a(hf1VarB)}, fd9.q0(1070596993, new w4d(iqbVar2, nwbVar, ta4Var2, hf1VarB, zy7Var), e18Var), e18Var, 56);
        } else {
            iqbVar2 = iqbVar;
            ta4Var2 = ta4Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new h60(iqbVar2, ta4Var2, i, i3);
        }
    }

    public static final void d(iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(155925518);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = e18Var.j(keh.a) != null;
            boolean z2 = e18Var.j(keh.b) != null;
            if (z && z2) {
                e18Var.a0(-1977187922);
                o5b o5bVarD = dw1.d(lja.G, true);
                int iHashCode = Long.hashCode(e18Var.T);
                hyc hycVarL = e18Var.l();
                iqb iqbVarE = kxk.E(e18Var, iqbVar);
                dd4.e.getClass();
                re4 re4Var = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, o5bVarD);
                d4c.i0(e18Var, cd4.e, hycVarL);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE);
                ta4Var.invoke(e18Var, Integer.valueOf((i2 >> 3) & 14));
                e18Var.p(true);
                e18Var.p(false);
            } else if (z) {
                e18Var.a0(-1976997706);
                grk.c(iqbVar, ta4Var, e18Var, i2 & 126);
                e18Var.p(false);
            } else if (z2) {
                e18Var.a0(-1976846922);
                ou5.d(iqbVar, ta4Var, e18Var, i2 & 126);
                e18Var.p(false);
            } else {
                e18Var.a0(-1976716505);
                c(iqbVar, ta4Var, e18Var, i2 & 126);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new h60(iqbVar, ta4Var, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(com.anthropic.claude.artifact.model.ArtifactMetadata r23, defpackage.zy7 r24, defpackage.iqb r25, boolean r26, defpackage.ld4 r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xuj.e(com.anthropic.claude.artifact.model.ArtifactMetadata, zy7, iqb, boolean, ld4, int, int):void");
    }

    public static wg8 f(wg8 wg8Var, wg8 wg8Var2) {
        gmf gmfVar = new gmf(16);
        int size = wg8Var.size();
        for (int i = 0; i < size; i++) {
            String strE = wg8Var.e(i);
            String strK = wg8Var.k(i);
            if ((!"Warning".equalsIgnoreCase(strE) || !isg.q0(strK, "1", false)) && ("Content-Length".equalsIgnoreCase(strE) || "Content-Encoding".equalsIgnoreCase(strE) || "Content-Type".equalsIgnoreCase(strE) || !h(strE) || wg8Var2.a(strE) == null)) {
                gmfVar.u(strE, strK);
            }
        }
        int size2 = wg8Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String strE2 = wg8Var2.e(i2);
            if (!"Content-Length".equalsIgnoreCase(strE2) && !"Content-Encoding".equalsIgnoreCase(strE2) && !"Content-Type".equalsIgnoreCase(strE2) && h(strE2)) {
                gmfVar.u(strE2, wg8Var2.k(i2));
            }
        }
        return gmfVar.v();
    }

    public static final void g(yr9 yr9Var) {
        yr9Var.getClass();
        yr9Var.k0();
    }

    public static boolean h(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean i(Context context) {
        return x44.x(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
    }

    public static final x48 j(v48 v48Var, List list, pz7 pz7Var, ld4 ld4Var, int i) {
        v48Var.getClass();
        pz7Var.getClass();
        if ((i & 2) != 0) {
            list = lm6.E;
        }
        List list2 = list;
        e18 e18Var = (e18) ld4Var;
        m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
        boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            objN = m7fVarN.a(jce.a.b(xm8.class), null, null);
            e18Var.k0(objN);
        }
        e18Var.p(false);
        e18Var.p(false);
        xm8 xm8Var = (xm8) objN;
        om8 om8Var = v40.F(ld4Var) ? q54.b : q54.c;
        e18 e18Var2 = (e18) ld4Var;
        Object objN2 = e18Var2.N();
        if (objN2 == lz1Var) {
            objN2 = fd9.O(im6.E, e18Var2);
            e18Var2.k0(objN2);
        }
        l45 l45Var = (l45) objN2;
        boolean zF2 = e18Var2.f(v48Var);
        Object objN3 = e18Var2.N();
        if (zF2 || objN3 == lz1Var) {
            objN3 = new x48(v48Var, list2, xm8Var, om8Var, l45Var, pz7Var);
            e18Var2.k0(objN3);
        }
        return (x48) objN3;
    }
}
