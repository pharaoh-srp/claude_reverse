package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class stj {
    public static final ta4 a = new ta4(-1049342156, false, new m14(23));
    public static final byte[] b = {0, 0, 0, 1};
    public static final float[] c = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object d = new Object();
    public static int[] e = new int[10];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c61 A(byte[] r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 2079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stj.A(byte[], int, int):c61");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.rxb B(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stj.B(byte[], int, int):rxb");
    }

    public static final long C(long j, long j2) {
        return yfd.e(((int) (j >> 32)) + ((int) (j2 >> 32)), ((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)));
    }

    public static final long D(long j, long j2) {
        return hvk.b(k8g.e(j2) + fcc.f(j), k8g.c(j2) + fcc.g(j));
    }

    public static final long E(long j, ukc ukcVar) {
        ukcVar.getClass();
        int iOrdinal = ukcVar.ordinal();
        if (iOrdinal == 0) {
            return hvk.b(fcc.f(j), -fcc.g(j));
        }
        if (iOrdinal == 1) {
            return hvk.b(-fcc.f(j), fcc.g(j));
        }
        wg6.i();
        return 0L;
    }

    public static void F(tsc tscVar) {
        int iF = tscVar.f() + 1;
        tscVar.j(8);
        for (int i = 0; i < iF; i++) {
            tscVar.f();
            tscVar.f();
            tscVar.i();
        }
        tscVar.j(20);
    }

    public static int G(byte[] bArr, int i) {
        int i2;
        synchronized (d) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = e;
                    if (iArr.length <= i4) {
                        e = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    e[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = e[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static final void a(String str, String str2, zy7 zy7Var, hdc hdcVar, h86 h86Var, n3f n3fVar, ld4 ld4Var, int i) {
        hdc hdcVar2;
        h86 h86Var2;
        n3f n3fVar2;
        int i2;
        n3f n3fVar3;
        h86 h86Var3;
        hdc hdcVar3;
        nwb nwbVar;
        h86 h86Var4;
        nwb nwbVar2;
        hdc hdcVar4;
        String str3;
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1432648313);
        int i3 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 74752;
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(hdc.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                hdc hdcVar5 = (hdc) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(h86.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                h86 h86Var5 = (h86) objN2;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN3 = e18Var.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(n3f.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i3 & (-523265);
                n3fVar3 = (n3f) objN3;
                h86Var3 = h86Var5;
                hdcVar3 = hdcVar5;
            } else {
                e18Var.T();
                i2 = i3 & (-523265);
                hdcVar3 = hdcVar;
                h86Var3 = h86Var;
                n3fVar3 = n3fVar;
            }
            int i6 = i2;
            e18Var.q();
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = mpk.P(cq8.a);
                e18Var.k0(objN4);
            }
            nwb nwbVar3 = (nwb) objN4;
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = vb7.g(0, e18Var);
            }
            isc iscVar = (isc) objN5;
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = mpk.P(null);
                e18Var.k0(objN6);
            }
            nwb nwbVar4 = (nwb) objN6;
            Integer numValueOf = Integer.valueOf(iscVar.h());
            boolean zH = e18Var.h(h86Var3) | e18Var.h(hdcVar3) | ((i6 & 112) == 32);
            Object objN7 = e18Var.N();
            if (zH || objN7 == lz1Var) {
                nwbVar = nwbVar4;
                w22 w22Var = new w22(h86Var3, nwbVar, nwbVar3, hdcVar3, str2, (tp4) null);
                h86Var4 = h86Var3;
                nwbVar2 = nwbVar3;
                hdcVar4 = hdcVar3;
                str3 = str2;
                e18Var.k0(w22Var);
                objN7 = w22Var;
            } else {
                h86Var4 = h86Var3;
                str3 = str2;
                hdcVar4 = hdcVar3;
                nwbVar2 = nwbVar3;
                nwbVar = nwbVar4;
            }
            fd9.j(str3, numValueOf, (pz7) objN7, e18Var);
            Object objN8 = e18Var.N();
            if (objN8 == lz1Var) {
                objN8 = n3fVar3.a(WebViewEvents$WebViewKind.CONTENT);
                e18Var.k0(objN8);
            }
            o3f o3fVar = (o3f) objN8;
            boolean zF4 = e18Var.f(o3fVar);
            Object objN9 = e18Var.N();
            Object obj = objN9;
            if (zF4 || objN9 == lz1Var) {
                x22 x22Var = new x22(o3fVar);
                x22Var.b = new t22(nwbVar, nwbVar2, i4);
                e18Var.k0(x22Var);
                obj = x22Var;
            }
            int i7 = i6 << 3;
            r4g r4gVarS = gb9.S(u4g.G, null, null, zy7Var, e18Var, (i7 & 7168) | 6, 6);
            auj.b(r4gVarS, str, null, null, false, null, null, null, null, fd9.q0(-216391790, new u22(r4gVarS, i4), e18Var), null, null, fd9.q0(-1429023423, new xe(o3fVar, (x22) obj, nwbVar2, nwbVar, iscVar, 9), e18Var), e18Var, 805306376 | (i7 & 112), 384, 3580);
            n3fVar2 = n3fVar3;
            h86Var2 = h86Var4;
            hdcVar2 = hdcVar4;
        } else {
            e18Var.T();
            hdcVar2 = hdcVar;
            h86Var2 = h86Var;
            n3fVar2 = n3fVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ne(str, str2, zy7Var, hdcVar2, h86Var2, n3fVar2, i, 5);
        }
    }

    public static final void b(dq8 dq8Var, m3f m3fVar, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1845613369);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(dq8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(m3fVar) : e18Var.h(m3fVar) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            o5b o5bVarD = dw1.d(lja.K, false);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            if (x44.r(dq8Var, cq8.a)) {
                e18Var.a0(-212164544);
                ez1.a(null, null, 0L, e18Var, 0, 7);
                e18Var.p(false);
                z = true;
            } else {
                boolean zR = x44.r(dq8Var, aq8.a);
                fqb fqbVar = fqb.E;
                if (zR) {
                    e18Var.a0(2012908812);
                    vo1 vo1Var = lja.T;
                    iqb iqbVarJ = gb9.J(fqbVar, 24.0f);
                    q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 48);
                    int iHashCode2 = Long.hashCode(e18Var.T);
                    hyc hycVarL2 = e18Var.l();
                    iqb iqbVarE2 = kxk.E(e18Var, iqbVarJ);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, q64VarA);
                    d4c.i0(e18Var, z80Var2, hycVarL2);
                    ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
                    d4c.i0(e18Var, z80Var4, iqbVarE2);
                    tjh.b(d4c.j0(R.string.ccr_html_preview_load_failed, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 130042);
                    lnk.d(zy7Var, null, false, null, null, null, null, awj.a, e18Var, 805306374, 510);
                    e18Var.p(true);
                    e18Var.p(false);
                    z = true;
                } else {
                    if (!(dq8Var instanceof bq8)) {
                        throw ebh.u(e18Var, -212164923, false);
                    }
                    e18Var.a0(2013533772);
                    if (m3fVar != null) {
                        e18Var.a0(2013597167);
                        String str = ((bq8) dq8Var).a;
                        iqb iqbVarC = b.c(fqbVar, 1.0f);
                        int i3 = m3f.c;
                        z2 = false;
                        z = true;
                        grk.a(str, iqbVarC, null, null, null, m3fVar, true, true, e18Var, 14417968 | ((i2 << 12) & 458752), 28);
                        e18Var.p(false);
                    } else {
                        z = true;
                        z2 = false;
                        e18Var.a0(2014143573);
                        e18Var.p(false);
                    }
                    e18Var.p(z2);
                }
            }
            e18Var.p(z);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(dq8Var, m3fVar, zy7Var, iqbVar, i, 10);
        }
    }

    public static final void c(final v4g v4gVar, final long j, final i4g i4gVar, final a5g a5gVar, pz7 pz7Var, rz7 rz7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        pz7 pz7Var2;
        rz7 rz7Var2;
        ta4 ta4Var2;
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1389245043);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(v4gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(i4gVar) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.d(a5gVar.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            pz7Var2 = pz7Var;
            i2 |= e18Var.h(pz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            pz7Var2 = pz7Var;
        }
        if ((196608 & i) == 0) {
            rz7Var2 = rz7Var;
            i2 |= e18Var.h(rz7Var2) ? 131072 : 65536;
        } else {
            rz7Var2 = rz7Var;
        }
        if ((1572864 & i) == 0) {
            ta4Var2 = ta4Var;
            i2 |= e18Var.h(ta4Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            ta4Var2 = ta4Var;
        }
        if (e18Var.Q(i2 & 1, (i2 & 599187) != 599186)) {
            final cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            boolean zF = ((i2 & 112) == 32) | ((458752 & i2) == 131072) | ((i2 & 896) == 256) | e18Var.f(cz5Var) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((3670016 & i2) == 1048576) | ((i2 & 14) == 4);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                i3 = 0;
                final pz7 pz7Var3 = pz7Var2;
                final rz7 rz7Var3 = rz7Var2;
                final ta4 ta4Var3 = ta4Var2;
                pz7 pz7Var4 = new pz7() { // from class: g4g
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj, Object obj2) {
                        float f;
                        v4g v4gVar2 = v4gVar;
                        gvg gvgVar = (gvg) obj;
                        rl4 rl4Var = (rl4) obj2;
                        gvgVar.getClass();
                        rz7 rz7Var4 = rz7Var3;
                        i4g i4gVar2 = i4gVar;
                        c3d c3dVarU = ((h5b) w44.e1(gvgVar.p(new ta4(-1723142950, true, new d4g(rz7Var4, i4gVar2, 0)), "fixed"))).u(rl4Var.a);
                        int i4 = c3dVarU.F;
                        cz5 cz5Var2 = cz5Var;
                        h5b h5bVar = (h5b) w44.e1(gvgVar.p(new ta4(1906682059, true, new e4g(a5gVar, pz7Var3, ta4Var3, i4g.a(i4gVar2, cz5Var2.c0(i4)), 0)), "main"));
                        long j2 = rl4Var.a;
                        c3d c3dVarU2 = h5bVar.u(j2);
                        float fQ0 = cz5Var2.q0(k4g.h);
                        float fG = (((rl4.g(j2) + fQ0) / 2.0f) - fQ0) - c3dVarU.F;
                        try {
                            f = ((ry) v4gVar2.d.F).f();
                        } catch (IllegalStateException unused) {
                            f = MTTypesetterKt.kLineSkipLimitMultiplier;
                        }
                        float fG2 = (rl4.g(j2) - f) - c3dVarU.F;
                        if (fG2 >= fG) {
                            fG = fG2;
                        }
                        int iL = mwa.L(fG);
                        return gvgVar.U(rl4.h(j2), rl4.g(j2), nm6.E, new eb3(c3dVarU2, ((h5b) w44.e1(gvgVar.p(new ta4(2090001920, true, new wc9(cz5Var2.c0(rl4.g(j2) - iL), j)), "background"))).u(j2), iL, c3dVarU, 3));
                    }
                };
                e18Var.k0(pz7Var4);
                objN = pz7Var4;
            } else {
                i3 = 0;
            }
            bvg.a(i3, 1, e18Var, (pz7) objN, null);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds1(v4gVar, j, i4gVar, a5gVar, pz7Var, rz7Var, ta4Var, i);
        }
    }

    public static final void d(i4g i4gVar, a5g a5gVar, pz7 pz7Var, rz7 rz7Var, cb9 cb9Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1931969322);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var.f(i4gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.d(a5gVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(rz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var.f(cb9Var) : e18Var.h(cb9Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(ta4Var) ? 131072 : 65536;
        }
        int i4 = 1;
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            List listX = x44.X(fd9.q0(-1961073159, new d4g(rz7Var, i4gVar, i4), e18Var), fd9.q0(1766982104, new e4g(a5gVar, pz7Var, ta4Var, rz7Var != null ? i4g.a(i4gVar, MTTypesetterKt.kLineSkipLimitMultiplier) : i4gVar, 1), e18Var));
            boolean z = (57344 & i2) == 16384 || ((i2 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && e18Var.h(cb9Var));
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new h4g(cb9Var);
                e18Var.k0(objN);
            }
            ltb ltbVar = (ltb) objN;
            ta4 ta4Var2 = new ta4(1271844412, true, new z0(i3, listX));
            boolean zF = e18Var.f(ltbVar);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new mtb(ltbVar);
                e18Var.k0(objN2);
            }
            o5b o5bVar = (o5b) objN2;
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVar);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            vb7.y(0, ta4Var2, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(i4gVar, a5gVar, pz7Var, rz7Var, cb9Var, ta4Var, i, 14);
        }
    }

    public static final void e(zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, iqb iqbVar, dyc dycVar, qi3 qi3Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        dyc dycVar2;
        qi3 qi3Var2;
        dyc dycVarL;
        qi3 qi3Var3;
        int i2;
        iqb iqbVar3;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-605208215);
        int i3 = 16;
        int i4 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.h(zy7Var2) ? 32 : 16) | (e18Var.h(zy7Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 614400;
        if (e18Var.Q(i4 & 1, (599187 & i4) != 599186)) {
            e18Var.V();
            int i5 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                dycVarL = otj.l(e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var3 = (qi3) objN;
                i2 = i4 & (-4128769);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                dycVarL = dycVar;
                qi3Var3 = qi3Var;
                i2 = i4 & (-4128769);
                iqbVar3 = iqbVar;
            }
            e18Var.q();
            boolean zH = e18Var.h(qi3Var3);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new gw(qi3Var3, tp4Var, 20);
                e18Var.k0(objN2);
            }
            csg.g((bz7) objN2, e18Var, 0, 1);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN3;
            m4a m4aVar = (m4a) e18Var.j(tda.a);
            boolean zH2 = e18Var.h(m4aVar) | e18Var.h(dycVarL);
            Object objN4 = e18Var.N();
            if (zH2 || objN4 == lz1Var) {
                objN4 = new kza(m4aVar, dycVarL, tp4Var, 14);
                e18Var.k0(objN4);
            }
            fd9.i(e18Var, (pz7) objN4, m4aVar);
            String strJ0 = d4c.j0(R.string.permissions_setting_title, e18Var);
            ta4 ta4VarQ0 = fd9.q0(-1377447245, new rn(ybgVar, i3), e18Var);
            dyc dycVar3 = dycVarL;
            iqb iqbVar4 = iqbVar3;
            ssj.c(strJ0, zy7Var, iqbVar4, null, ta4VarQ0, 0L, fd9.q0(-29149832, new xe(dycVar3, ybgVar, zy7Var3, zy7Var2, zy7Var4, 27), e18Var), e18Var, ((i2 << 3) & 112) | 1597824, 40);
            dycVar2 = dycVar3;
            qi3Var2 = qi3Var3;
            iqbVar2 = iqbVar4;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            dycVar2 = dycVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw(zy7Var, zy7Var2, zy7Var3, zy7Var4, iqbVar2, dycVar2, qi3Var2, i);
        }
    }

    public static final void f(r4g r4gVar, long j, z4g z4gVar, a5g a5gVar, pz7 pz7Var, pz7 pz7Var2, pz7 pz7Var3, pz7 pz7Var4, rz7 rz7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        r4gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-982615981);
        int i2 = i | (e18Var.h(r4gVar) ? 4 : 2) | (e18Var.e(j) ? 32 : 16) | (e18Var.d(z4gVar == null ? -1 : z4gVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.d(a5gVar != null ? a5gVar.ordinal() : -1) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(pz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(pz7Var2) ? 131072 : 65536) | (e18Var.h(pz7Var3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.h(pz7Var4) ? 8388608 : 4194304) | (e18Var.h(rz7Var) ? 67108864 : 33554432) | (e18Var.h(ta4Var) ? 536870912 : 268435456);
        if (e18Var.Q(i2 & 1, (306783379 & i2) != 306783378)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            int i3 = i2 << 6;
            g(r4gVar.a, r4gVar.b, r4gVar.d, j, z4gVar, a5gVar, pz7Var, pz7Var2, pz7Var3, pz7Var4, rz7Var, ta4Var, e18Var, 512 | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), (i2 >> 24) & 126);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new em5(r4gVar, j, z4gVar, a5gVar, pz7Var, pz7Var2, pz7Var3, pz7Var4, rz7Var, ta4Var, i);
        }
    }

    public static final void g(final v4g v4gVar, u4g u4gVar, final cb9 cb9Var, final long j, final z4g z4gVar, final a5g a5gVar, final pz7 pz7Var, final pz7 pz7Var2, final pz7 pz7Var3, final pz7 pz7Var4, final rz7 rz7Var, final ta4 ta4Var, ld4 ld4Var, final int i, final int i2) {
        int i3;
        int i4;
        u4g u4gVar2;
        e18 e18Var;
        ta4 ta4VarQ0;
        boolean z;
        z4gVar.getClass();
        a5gVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(379415773);
        if ((i & 6) == 0) {
            i3 = (e18Var2.f(v4gVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.d(u4gVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? e18Var2.f(cb9Var) : e18Var2.h(cb9Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var2.e(j) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var2.d(z4gVar.ordinal()) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i3 |= e18Var2.d(a5gVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= e18Var2.h(pz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= e18Var2.h(pz7Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= e18Var2.h(pz7Var3) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= e18Var2.h(pz7Var4) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var2.h(rz7Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var2.h(ta4Var) ? 32 : 16;
        }
        if (e18Var2.Q(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            boolean zD = v4gVar.d();
            boolean z2 = !zD;
            if (pz7Var == null && pz7Var2 == null && pz7Var3 == null && pz7Var4 == null) {
                e18Var2.a0(-1177340399);
                e18Var2.p(false);
                ta4VarQ0 = null;
            } else {
                e18Var2.a0(-1177894741);
                ta4VarQ0 = fd9.q0(275974135, new ht0(z2, z4gVar, pz7Var, pz7Var2, pz7Var3, pz7Var4), e18Var2);
                e18Var2.p(false);
            }
            qnc qncVar = k4g.e;
            WeakHashMap weakHashMap = gdj.x;
            w70 w70Var = s4i.d(e18Var2).g;
            cz5 cz5Var = (cz5) e18Var2.j(ve4.h);
            i4g i4gVar = new i4g(qncVar, cz5Var.c0((32 & 32) != 0 ? w70Var.c(cz5Var) : 0));
            u4gVar2 = u4gVar;
            if (u4gVar2 == u4g.H) {
                e18Var2.a0(-453607825);
                z = !x44.V(e18Var2);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-1176939450);
                e18Var2.p(false);
                z = false;
            }
            if (z) {
                e18Var2.a0(-453606850);
                d(i4gVar, a5gVar, ta4VarQ0, rz7Var, cb9Var, ta4Var, e18Var2, ((i3 << 6) & 57344) | ((i3 >> 12) & 112) | ((i4 << 9) & 7168) | FreeTypeConstants.FT_LOAD_NO_AUTOHINT | ((i4 << 12) & 458752));
                e18Var = e18Var2;
                e18Var.p(false);
            } else {
                ta4 ta4Var2 = ta4VarQ0;
                e18Var = e18Var2;
                if (!zD || rz7Var == null) {
                    e18Var.a0(-453595825);
                    int i5 = i4 << 9;
                    h(i4gVar, a5gVar, ta4Var2, rz7Var, ta4Var, e18Var, ((i3 >> 12) & 112) | (i5 & 7168) | (i5 & 57344));
                    e18Var.p(false);
                } else {
                    e18Var.a0(-453587422);
                    int i6 = i3 & 14;
                    int i7 = i3 >> 6;
                    int i8 = i4 << 15;
                    c(v4gVar, j, i4gVar, a5gVar, ta4Var2, rz7Var, ta4Var, e18Var, (i7 & 7168) | i6 | (i7 & 112) | (i8 & 458752) | (i8 & 3670016));
                    e18Var = e18Var;
                    e18Var.p(false);
                }
            }
        } else {
            u4gVar2 = u4gVar;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final u4g u4gVar3 = u4gVar2;
            r7eVarS.d = new pz7() { // from class: f4g
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    int iP02 = x44.p0(i2);
                    stj.g(v4gVar, u4gVar3, cb9Var, j, z4gVar, a5gVar, pz7Var, pz7Var2, pz7Var3, pz7Var4, rz7Var, ta4Var, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    public static final void h(i4g i4gVar, a5g a5gVar, pz7 pz7Var, rz7 rz7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-24656577);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(i4gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.d(a5gVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(rz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(ta4Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 >> 3;
            i(a5gVar, pz7Var, fd9.q0(254582379, new tfe(rz7Var, i4gVar, ta4Var, 13), e18Var), e18Var, (i3 & 112) | (i3 & 14) | 384);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(i4gVar, a5gVar, pz7Var, rz7Var, ta4Var, i, 29);
        }
    }

    public static final void i(a5g a5gVar, pz7 pz7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1510693204);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(a5gVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(pz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            j8.c(imc.a.a(null), fd9.q0(-252596716, new tfe(pz7Var, ta4Var, a5gVar, 12), e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new c3g(a5gVar, i, pz7Var, ta4Var, 2);
        }
    }

    public static final void j(Class cls, StringBuilder sb) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
            return;
        }
        if (cls.equals(Double.TYPE)) {
            sb.append("D");
            return;
        }
        sb.append("L");
        String strReplace = cls.getName().replace('.', '/');
        strReplace.getClass();
        sb.append((CharSequence) strReplace);
        sb.append(";");
    }

    public static void k(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static final void l(nw5 nw5Var, gb6 gb6Var) {
        Activity activity;
        ClipData clipData = gb6Var.a.getClipData();
        int itemCount = clipData.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            Uri uri = clipData.getItemAt(i).getUri();
            if (uri != null && x44.r(uri.getScheme(), "content")) {
                if (nw5Var.x0().R) {
                    Context context = eve.Q(nw5Var).getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity == null) {
                        return;
                    }
                    activity.requestDragAndDropPermissions(gb6Var.a);
                    return;
                }
                return;
            }
        }
    }

    public static final Method m(fm9 fm9Var, String str) {
        str.getClass();
        if (!(fm9Var instanceof sg3)) {
            return null;
        }
        String strG1 = bsg.g1(str, '(');
        if (strG1.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + fm9Var + '/' + str);
        }
        Method[] declaredMethods = ((sg3) fm9Var).a().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (x44.r(method.getName(), strG1)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    j(cls, sb);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                j(returnType, sb);
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }

    public static int n(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        fd9.M(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            k(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            k(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            k(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    k(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static final float o(long j, ukc ukcVar) {
        ukcVar.getClass();
        int iOrdinal = ukcVar.ordinal();
        if (iOrdinal == 0) {
            return fcc.g(j);
        }
        if (iOrdinal == 1) {
            return fcc.f(j);
        }
        wg6.i();
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public static final int p(long j, ukc ukcVar) {
        ukcVar.getClass();
        int iOrdinal = ukcVar.ordinal();
        if (iOrdinal == 0) {
            return (int) (j & 4294967295L);
        }
        if (iOrdinal == 1) {
            return (int) (j >> 32);
        }
        wg6.i();
        return 0;
    }

    public static String q(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                hz8 hz8VarO = nz8.o();
                int i2 = 0;
                while (i2 < bArr.length) {
                    int iN = n(bArr, i2, bArr.length, zArr);
                    if (iN != bArr.length) {
                        hz8VarO.b(Integer.valueOf(iN));
                    }
                    i2 = iN + 3;
                }
                vde vdeVarG = hz8VarO.g();
                for (int i3 = 0; i3 < vdeVarG.H; i3++) {
                    if (((Integer) vdeVarG.get(i3)).intValue() + 3 < length) {
                        tsc tscVar = new tsc(bArr, ((Integer) vdeVarG.get(i3)).intValue() + 3, length);
                        z4 z4VarW = w(tscVar);
                        if (z4VarW.a == 33 && z4VarW.b == 0) {
                            tscVar.j(4);
                            int iE = tscVar.e(3);
                            tscVar.i();
                            mxb mxbVarX = x(tscVar, true, iE, null);
                            return q34.a(mxbVarX.a, mxbVarX.b, mxbVarX.c, mxbVarX.d, mxbVarX.e, mxbVarX.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String r(jw7 jw7Var) {
        String str = jw7Var.o;
        String str2 = jw7Var.k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return jw7Var.o;
    }

    public static final ukc s(ukc ukcVar) {
        ukcVar.getClass();
        int iOrdinal = ukcVar.ordinal();
        if (iOrdinal == 0) {
            return ukc.F;
        }
        if (iOrdinal == 1) {
            return ukc.E;
        }
        wg6.i();
        return null;
    }

    public static boolean t(byte[] bArr, int i, jw7 jw7Var) {
        int i2;
        if (Objects.equals(jw7Var.o, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(jw7Var.o, "video/hevc")) {
            z4 z4VarW = w(new tsc(bArr, 4, i + 4));
            int i3 = z4VarW.a;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && z4VarW.c == jw7Var.F - 1) {
                return false;
            }
        }
        return true;
    }

    public static final long u(long j, long j2) {
        return yfd.e(((int) (j >> 32)) - ((int) (j2 >> 32)), ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)));
    }

    public static int v(jw7 jw7Var) {
        String strR = r(jw7Var);
        if (Objects.equals(strR, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strR, "video/hevc") || Objects.equals(strR, "video/vvc")) ? 2 : 0;
    }

    public static z4 w(tsc tscVar) {
        tscVar.i();
        return new z4(tscVar.e(6), tscVar.e(6), tscVar.e(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mxb x(defpackage.tsc r19, boolean r20, int r21, defpackage.mxb r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.e(r5)
            boolean r8 = r0.d()
            r9 = 5
            int r9 = r0.e(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.d()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.e(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.a
            boolean r8 = r2.b
            int r9 = r2.c
            int r11 = r2.d
            int[] r4 = r2.e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.e(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.d()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.d()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.j(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.j(r6)
        L7b:
            mxb r12 = new mxb
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stj.x(tsc, boolean, int, mxb):mxb");
    }

    public static x9c y(byte[] bArr, int i, int i2) {
        byte b2;
        int i3 = i + 2;
        do {
            i2--;
            b2 = bArr[i2];
            if (b2 != 0) {
                break;
            }
        } while (i2 > i3);
        if (b2 == 0 || i2 <= i3) {
            return null;
        }
        tsc tscVar = new tsc(bArr, i3, i2 + 1);
        while (tscVar.b(16)) {
            int iE = tscVar.e(8);
            int i4 = 0;
            while (iE == 255) {
                i4 += 255;
                iE = tscVar.e(8);
            }
            int i5 = i4 + iE;
            int iE2 = tscVar.e(8);
            int i6 = 0;
            while (iE2 == 255) {
                i6 += 255;
                iE2 = tscVar.e(8);
            }
            int i7 = i6 + iE2;
            if (i7 == 0 || !tscVar.b(i7)) {
                return null;
            }
            if (i5 == 176) {
                int iF = tscVar.f();
                boolean zD = tscVar.d();
                int iF2 = zD ? tscVar.f() : 0;
                int iF3 = tscVar.f();
                int iF4 = -1;
                for (int i8 = 0; i8 <= iF3; i8++) {
                    iF4 = tscVar.f();
                    tscVar.f();
                    int iE3 = tscVar.e(6);
                    if (iE3 == 63) {
                        return null;
                    }
                    tscVar.e(iE3 == 0 ? Math.max(0, iF - 30) : Math.max(0, (iE3 + iF) - 31));
                    if (zD) {
                        int iE4 = tscVar.e(6);
                        if (iE4 == 63) {
                            return null;
                        }
                        tscVar.e(iE4 == 0 ? Math.max(0, iF2 - 30) : Math.max(0, (iE4 + iF2) - 31));
                    }
                    if (tscVar.d()) {
                        tscVar.j(10);
                    }
                }
                return new x9c(iF4, 4);
            }
            tscVar.j(i7 * 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.oxb z(byte[] r32, int r33, int r34, defpackage.c61 r35) {
        /*
            Method dump skipped, instruction units count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stj.z(byte[], int, int, c61):oxb");
    }
}
