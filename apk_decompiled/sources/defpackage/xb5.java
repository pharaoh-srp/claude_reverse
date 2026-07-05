package defpackage;

import android.os.Trace;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class xb5 {
    public static final ta4 b = new ta4(520015364, false, new ic4(3));
    public final /* synthetic */ int a;

    public /* synthetic */ xb5(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static final void a(String str, hdc hdcVar, String str2, Set set, o3f o3fVar, iqb iqbVar, Long l, zy7 zy7Var, bz7 bz7Var, ld4 ld4Var, int i) {
        bz7 bz7Var2;
        e18 e18Var;
        bz7 bz7Var3;
        Object obj;
        nw1 nw1Var;
        nwb nwbVar;
        ?? r12;
        bz7 bz7Var4;
        str.getClass();
        hdcVar.getClass();
        o3fVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1294565847);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (e18Var2.f(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= e18Var2.h(hdcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var2.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(set) : e18Var2.h(set) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= (i & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var2.f(o3fVar) : e18Var2.h(o3fVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i3 |= e18Var2.f(iqbVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= e18Var2.f(l) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= e18Var2.h(zy7Var) ? 8388608 : 4194304;
        }
        int i4 = i3 | 100663296;
        if (e18Var2.Q(i4 & 1, (i4 & 38347923) != 38347922)) {
            Object objN = e18Var2.N();
            Object obj2 = jd4.a;
            Object obj3 = objN;
            if (objN == obj2) {
                Object kacVar = new kac(i2);
                e18Var2.k0(kacVar);
                obj3 = kacVar;
            }
            bz7 bz7Var5 = (bz7) obj3;
            Object objZ = mpk.Z(zy7Var, e18Var2);
            nwb nwbVarZ = mpk.Z(bz7Var5, e18Var2);
            jl3 jl3VarA = gm3.a(e18Var2);
            boolean zF = e18Var2.f(jl3VarA);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == obj2) {
                bz7Var3 = bz7Var5;
                List<cpc> listX = x44.X(new cpc("--bg", e(jl3VarA.o)), new cpc("--fg", e(jl3VarA.M)), new cpc("--fg-muted", e(jl3VarA.N)), new cpc("--border", e(jl3VarA.v)), new cpc("--header-bg", e(jl3VarA.q)));
                StringBuilder sb = new StringBuilder("(function(){var s=document.documentElement.style;");
                for (cpc cpcVar : listX) {
                    sb.append(ij0.l("s.setProperty('", (String) cpcVar.E, "','", (String) cpcVar.F, "');"));
                }
                sb.append("})();");
                Object string = sb.toString();
                e18Var2.k0(string);
                obj = string;
            } else {
                bz7Var3 = bz7Var5;
                obj = objN2;
            }
            String str3 = (String) obj;
            Object objN3 = e18Var2.N();
            Object obj4 = objN3;
            if (objN3 == obj2) {
                Object objP = mpk.P(Boolean.FALSE);
                e18Var2.k0(objP);
                obj4 = objP;
            }
            nwb nwbVar2 = (nwb) obj4;
            Object objN4 = e18Var2.N();
            Object obj5 = objN4;
            if (objN4 == obj2) {
                Object objP2 = mpk.P(Boolean.FALSE);
                e18Var2.k0(objP2);
                obj5 = objP2;
            }
            nwb nwbVar3 = (nwb) obj5;
            wlg wlgVarB = n80.b(((Boolean) nwbVar3.getValue()).booleanValue() ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, null, "Office Preview Fade", e18Var2, 3072, 22);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVar);
            dd4.e.getClass();
            zy7 zy7Var2 = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(zy7Var2);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            nw1 nw1Var2 = nw1.a;
            iqb iqbVarB = nw1Var2.b();
            boolean zF2 = e18Var2.f(wlgVarB);
            Object objN5 = e18Var2.N();
            Object obj6 = objN5;
            if (zF2 || objN5 == obj2) {
                Object ek1Var = new ek1(wlgVarB, 2);
                e18Var2.k0(ek1Var);
                obj6 = ek1Var;
            }
            iqb iqbVarH = xkk.h(e18Var2, xn5.i0(iqbVarB, (bz7) obj6));
            boolean zF3 = e18Var2.f(objZ) | ((57344 & i4) == 16384 || ((i4 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && e18Var2.h(o3fVar))) | ((i4 & 7168) == 2048 || ((i4 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 && e18Var2.h(set))) | e18Var2.f(nwbVarZ) | e18Var2.h(hdcVar) | ((i4 & 14) == 4) | ((3670016 & i4) == 1048576) | ((i4 & 896) == 256);
            Object objN6 = e18Var2.N();
            if (zF3 || objN6 == obj2) {
                nw1Var = nw1Var2;
                nwbVar = nwbVar2;
                r12 = 1;
                bz7Var4 = bz7Var3;
                Object ad2Var = new ad2(str2, nwbVar3, objZ, o3fVar, set, nwbVarZ, hdcVar, str, l, nwbVar, 1);
                e18Var2.k0(ad2Var);
                objN6 = ad2Var;
            } else {
                nw1Var = nw1Var2;
                nwbVar = nwbVar2;
                r12 = 1;
                bz7Var4 = bz7Var3;
            }
            bz7 bz7Var6 = (bz7) objN6;
            Object objN7 = e18Var2.N();
            int i5 = 3;
            Object obj7 = objN7;
            if (objN7 == obj2) {
                Object kacVar2 = new kac(i5);
                e18Var2.k0(kacVar2);
                obj7 = kacVar2;
            }
            bz7 bz7Var7 = (bz7) obj7;
            boolean zF4 = e18Var2.f(str3);
            Object objN8 = e18Var2.N();
            Object obj8 = objN8;
            if (zF4 || objN8 == obj2) {
                Object zg4Var = new zg4(str3, nwbVar, r12);
                e18Var2.k0(zg4Var);
                obj8 = zg4Var;
            }
            uj5.b(bz7Var6, iqbVarH, null, bz7Var7, (bz7) obj8, e18Var2, 3072, 4);
            wd6.M((((Boolean) nwbVar3.getValue()).booleanValue() ? 1 : 0) ^ r12, nw1Var.a(fqb.E, lja.K), null, gp6.f(null, 3), null, mqk.E, e18Var2, 199680, 20);
            e18 e18Var3 = e18Var2;
            e18Var3.p(r12);
            bz7Var2 = bz7Var4;
            e18Var = e18Var3;
        } else {
            e18 e18Var4 = e18Var2;
            e18Var4.T();
            bz7Var2 = bz7Var;
            e18Var = e18Var4;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tbc(str, hdcVar, str2, set, o3fVar, iqbVar, l, zy7Var, bz7Var2, i);
        }
    }

    public static final void b(String str, iqb iqbVar, tkh tkhVar, ld4 ld4Var, int i, int i2) {
        int i3;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2049784412);
        if ((i & 6) == 0) {
            i3 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && e18Var.f(tkhVar)) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                if (i4 != 0) {
                    iqbVar = fqb.E;
                }
                if ((i2 & 4) != 0) {
                    tkhVar = (tkh) e18Var.j(tjh.a);
                    i3 &= -897;
                }
                e18Var.q();
                tjh.a(tkhVar, fd9.q0(-650277171, new ip(iqbVar, str), e18Var), e18Var, ((i3 >> 6) & 14) | 48);
            } else {
                e18Var.T();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                e18Var.q();
                tjh.a(tkhVar, fd9.q0(-650277171, new ip(iqbVar, str), e18Var), e18Var, ((i3 >> 6) & 14) | 48);
            }
        } else {
            e18Var.T();
        }
        iqb iqbVar2 = iqbVar;
        tkh tkhVar2 = tkhVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zh(str, iqbVar2, tkhVar2, i, i2, 10);
        }
    }

    public static final void c(fnf fnfVar, m19 m19Var, ukc ukcVar, l19 l19Var, at atVar, long j) {
        float fIntBitsToFloat;
        qvb qvbVar = (qvb) atVar.G;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (m19Var.c >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (m19Var.c & 4294967295L));
        if (f(m19Var)) {
            atVar.F = 0;
            qvbVar.d();
        }
        if (!d(m19Var) && !f(m19Var)) {
            if (qvbVar.b == 3) {
                int i = atVar.F;
                atVar.F = i + 1;
                qvbVar.n(i, m19Var);
            } else {
                qvbVar.a(m19Var);
            }
            if (atVar.F == 3) {
                atVar.F = 0;
            }
            Object[] objArr = qvbVar.a;
            int i2 = qvbVar.b;
            float fIntBitsToFloat4 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((m19) objArr[i3]).c >> 32));
            }
            int i4 = qvbVar.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = qvbVar.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((m19) objArr2[i5]).c & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / qvbVar.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (ukcVar != null) {
            int i6 = l19Var.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = ukcVar == ukc.F ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L) : (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((qv5) fnfVar.F).a(m19Var.b, fcc.i(jFloatToRawIntBits, j));
    }

    public static final boolean d(m19 m19Var) {
        return m19Var.h && !m19Var.d;
    }

    public static final String e(long j) {
        int iN0 = d4c.n0(j);
        return String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf((iN0 >>> 24) | (iN0 << 8))}, 1));
    }

    public static final boolean f(m19 m19Var) {
        return !m19Var.h && m19Var.d;
    }

    public static final ymf g(jz0 jz0Var, boolean z) {
        jz0Var.getClass();
        lz0 lz0Var = jz0Var.b;
        if (z) {
            return bnf.Z(new r2i(3), lz0Var.c);
        }
        return bnf.Z(new r2i(2), lz0Var.b);
    }

    public static bl7 h(jz0 jz0Var, bz7 bz7Var) {
        jz0Var.getClass();
        return bnf.V(g(jz0Var, false), bz7Var);
    }

    public static final boolean i(String str) {
        String strL = l(str);
        if (strL != null && isg.q0(strL, "image/", false)) {
            j31.a.getClass();
            if (!d31.b.contains(strL)) {
                return true;
            }
        }
        return false;
    }

    private final void k(tb5 tb5Var) {
    }

    public static final String l(String str) {
        String string;
        if (str == null || (string = bsg.k1(bsg.g1(str, ';')).toString()) == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        String strN = ij0.n(locale, string, locale);
        if (strN.length() > 0) {
            return strN;
        }
        return null;
    }

    public static final String m() {
        return q7j.a("WEB_MESSAGE_LISTENER") ? "_claude_bridge".concat(".postMessage(JSON.stringify(m))") : ij0.j("window.", "_claude_bridge", ".postMessage(JSON.stringify(m))");
    }

    public static final long n(m19 m19Var, ukc ukcVar, l19 l19Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = m19Var.g;
        if (ukcVar != null) {
            int i = l19Var.a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (ukcVar == ukc.F) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jH = fcc.h(o(m19Var, ukcVar, l19Var), j2);
        if (z || !m19Var.i) {
            return jH;
        }
        return 0L;
    }

    public static final long o(m19 m19Var, ukc ukcVar, l19 l19Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (ukcVar == null) {
            return m19Var.c;
        }
        int i = l19Var.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (m19Var.c >> 32));
        } else {
            if (i != 2) {
                return m19Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (m19Var.c & 4294967295L));
        }
        if (ukcVar == ukc.F) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (defpackage.d31.b.contains(r2) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r5 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.j31 p(java.lang.String r2, java.lang.Long r3, boolean r4, boolean r5, long r6) {
        /*
            java.lang.String r2 = l(r2)
            if (r3 == 0) goto L16
            long r0 = r3.longValue()
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L16
            g31 r2 = new g31
            h21 r3 = defpackage.h21.H
            r2.<init>(r3)
            return r2
        L16:
            boolean r3 = i(r2)
            if (r3 == 0) goto L1f
            i31 r2 = defpackage.i31.b
            return r2
        L1f:
            if (r4 == 0) goto L22
            goto L47
        L22:
            if (r2 == 0) goto L3d
            java.lang.String r3 = "text/"
            r4 = 0
            boolean r3 = defpackage.isg.q0(r2, r3, r4)
            if (r3 != 0) goto L3a
            d31 r3 = defpackage.j31.a
            r3.getClass()
            java.util.Set r3 = defpackage.d31.b
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L3d
        L3a:
            e31 r2 = defpackage.e31.b
            return r2
        L3d:
            java.lang.String r3 = "application/pdf"
            boolean r3 = defpackage.x44.r(r2, r3)
            if (r3 == 0) goto L4a
            if (r5 == 0) goto L59
        L47:
            h31 r2 = defpackage.h31.b
            return r2
        L4a:
            d31 r3 = defpackage.j31.a
            r3.getClass()
            java.util.Set r3 = defpackage.d31.c
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r2 = defpackage.w44.G0(r3, r2)
            if (r2 == 0) goto L5c
        L59:
            f31 r2 = defpackage.f31.b
            return r2
        L5c:
            g31 r2 = new g31
            h21 r3 = defpackage.h21.E
            r2.<init>(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb5.p(java.lang.String, java.lang.Long, boolean, boolean, long):j31");
    }

    public final void j(tb5 tb5Var) {
        long j;
        int i;
        switch (this.a) {
            case 0:
                swc.e("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
                try {
                    long j2 = tb5Var.a;
                    int iF = sq6.F(tb5Var.b);
                    int i2 = 2;
                    int i3 = 0;
                    if (iF == 0) {
                        j = j2;
                        i = 1;
                    } else if (iF != 1) {
                        j = j2;
                        i = 0;
                    } else {
                        j = j2;
                        i = 2;
                    }
                    int i4 = tb5Var.c;
                    int iOrdinal = tb5Var.d.ordinal();
                    if (iOrdinal == 1) {
                        i3 = 1;
                    } else if (iOrdinal == 2) {
                        i3 = 2;
                    } else if (iOrdinal == 3) {
                        i3 = 3;
                    } else if (iOrdinal == 4) {
                        i3 = 4;
                    }
                    Boolean bool = tb5Var.e;
                    if (bool == null) {
                        i2 = 1;
                    } else if (!bool.booleanValue()) {
                        i2 = 3;
                    }
                    int iF2 = sq6.F(i2);
                    vb5 vb5Var = tb5Var.f;
                    long j3 = j;
                    int i5 = vb5Var.a;
                    int i6 = vb5Var.b;
                    int i7 = vb5Var.c;
                    int i8 = vb5Var.d;
                    vb5 vb5Var2 = tb5Var.g;
                    int i9 = -1;
                    int i10 = vb5Var2 == null ? -1 : vb5Var2.a;
                    int i11 = vb5Var2 == null ? -1 : vb5Var2.b;
                    int i12 = vb5Var2 == null ? -1 : vb5Var2.c;
                    if (vb5Var2 != null) {
                        i9 = vb5Var2.d;
                    }
                    dc5.a(j3, i, i4, i3, iF2, i5, i6, i7, i8, i10, i11, i12, i9, tb5Var.h);
                    Trace.endSection();
                    return;
                } finally {
                }
            default:
                return;
        }
    }
}
