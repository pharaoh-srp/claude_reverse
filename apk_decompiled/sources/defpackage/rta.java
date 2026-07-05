package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rta {
    public static boolean a = false;
    public static int b = 1;
    public static final float[] c = new float[91];
    public static final lc4 d = new lc4(27);

    /* JADX WARN: Removed duplicated region for block: B:164:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.iqb r29, final defpackage.v48 r30, final float r31, final int r32, java.lang.String r33, defpackage.iqb r34, defpackage.xm8 r35, defpackage.ld4 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rta.a(iqb, v48, float, int, java.lang.String, iqb, xm8, ld4, int, int):void");
    }

    public static final void b(final iqb iqbVar, final String str, final String str2, final float f, final int i, String str3, iqb iqbVar2, xm8 xm8Var, ld4 ld4Var, final int i2) {
        final String str4;
        final iqb iqbVar3;
        final xm8 xm8Var2;
        int i3;
        String str5;
        xm8 xm8Var3;
        boolean z;
        iqb iqbVar4;
        boolean z2;
        iqbVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1426059892);
        int i4 = i2 | (e18Var.f(iqbVar) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.f(str2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | 5963776;
        if (e18Var.Q(i4 & 1, (4793491 & i4) != 4793490)) {
            e18Var.V();
            int i5 = i2 & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(xm8.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i3 = i4 & (-29360129);
                str5 = "kotlin";
                xm8Var3 = (xm8) objN;
                z = true;
                iqbVar4 = fqb.E;
                z2 = false;
            } else {
                e18Var.T();
                i3 = i4 & (-29360129);
                str5 = str3;
                z = true;
                z2 = false;
                iqbVar4 = iqbVar2;
                xm8Var3 = xm8Var;
            }
            e18Var.q();
            boolean z3 = (i3 & 112) == 32 ? z : z2;
            if ((i3 & 896) == 256) {
                z2 = z;
            }
            boolean z4 = z3 | z2;
            Object objN2 = e18Var.N();
            if (z4 || objN2 == lz1Var) {
                objN2 = w48.a(str, str2);
                e18Var.k0(objN2);
            }
            String str6 = str5;
            a(iqbVar, (v48) objN2, f, i, str6, iqbVar4, xm8Var3, e18Var, (i3 & 14) | 2321792, 0);
            str4 = str6;
            iqbVar3 = iqbVar4;
            xm8Var2 = xm8Var3;
        } else {
            e18Var.T();
            str4 = str3;
            iqbVar3 = iqbVar2;
            xm8Var2 = xm8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(str, str2, f, i, str4, iqbVar3, xm8Var2, i2) { // from class: j36
                public final /* synthetic */ String F;
                public final /* synthetic */ String G;
                public final /* synthetic */ float H;
                public final /* synthetic */ int I;
                public final /* synthetic */ String J;
                public final /* synthetic */ iqb K;
                public final /* synthetic */ xm8 L;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(27649);
                    rta.b(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void c(cte cteVar, int i, ta4 ta4Var, ld4 ld4Var, int i2) {
        int i3;
        cteVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2012414922);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(cteVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = 1;
        if (!e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.T();
        } else {
            if (i < 0) {
                sz6.p("Level must be at least 0");
                return;
            }
            e18Var.a0(1195462900);
            tkh tkhVarE = bte.e(cteVar, e18Var);
            e18Var.a0(1195463980);
            long jD = tkhVarE.d();
            if (jD == 16) {
                jD = bte.d(cteVar, e18Var);
            }
            long j = jD;
            e18Var.p(false);
            tkh tkhVarB = tkh.b(tkhVarE, j, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214);
            e18Var.p(false);
            pz7 pz7Var = pte.c(pte.b(cteVar, e18Var)).b;
            pz7Var.getClass();
            ((rte) e18Var.j(ste.a)).b.i(tkhVarB.f((tkh) pz7Var.invoke(Integer.valueOf(i), tkhVarB)), fd9.q0(-969692624, new wq3(ta4Var, cteVar, i4), e18Var), e18Var, 48);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ve2(i, i2, ta4Var, cteVar);
        }
    }

    public static final void d(final bpc bpcVar, final String str, final boolean z, iqb iqbVar, tkh tkhVar, tkh tkhVar2, float f, long j, final zy7 zy7Var, ld4 ld4Var, final int i) {
        final iqb iqbVar2;
        final tkh tkhVar3;
        final tkh tkhVar4;
        final float f2;
        final long j2;
        int i2;
        iqb iqbVar3;
        long j3;
        float f3;
        tkh tkhVar5;
        tkh tkhVar6;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-683525704);
        int i3 = i | (e18Var.h(bpcVar) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 38366208 | (e18Var.h(zy7Var) ? 536870912 : 268435456);
        if (e18Var.Q(i3 & 1, (306783379 & i3) != 306783378)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                tkh tkhVar7 = ((jm3) gm3.c(e18Var).e.E).e;
                tkh tkhVar8 = ((jm3) gm3.c(e18Var).e.E).g;
                long jD = mpk.d(csg.z(24.0f, e18Var), csg.z(24.0f, e18Var));
                i2 = i3 & (-268369921);
                iqbVar3 = fqb.E;
                j3 = jD;
                f3 = 56.0f;
                tkhVar5 = tkhVar7;
                tkhVar6 = tkhVar8;
            } else {
                e18Var.T();
                i2 = i3 & (-268369921);
                iqbVar3 = iqbVar;
                tkhVar5 = tkhVar;
                tkhVar6 = tkhVar2;
                f3 = f;
                j3 = j;
            }
            e18Var.q();
            e(fd9.q0(-203875397, new me(bpcVar, j3, 3), e18Var), str, z, iqbVar3, null, tkhVar5, tkhVar6, null, f3, null, zy7Var, e18Var, (i2 & 112) | 6 | (i2 & 896) | 27648, (i2 >> 27) & 14, 640);
            iqbVar2 = iqbVar3;
            tkhVar3 = tkhVar5;
            tkhVar4 = tkhVar6;
            f2 = f3;
            j2 = j3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            tkhVar3 = tkhVar;
            tkhVar4 = tkhVar2;
            f2 = f;
            j2 = j;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(str, z, iqbVar2, tkhVar3, tkhVar4, f2, j2, zy7Var, i) { // from class: gxf
                public final /* synthetic */ String F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ iqb H;
                public final /* synthetic */ tkh I;
                public final /* synthetic */ tkh J;
                public final /* synthetic */ float K;
                public final /* synthetic */ long L;
                public final /* synthetic */ zy7 M;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(9);
                    rta.d(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.pz7 r34, final java.lang.String r35, final boolean r36, defpackage.iqb r37, java.lang.String r38, defpackage.tkh r39, defpackage.tkh r40, defpackage.mnc r41, float r42, defpackage.oxf r43, final defpackage.zy7 r44, defpackage.ld4 r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rta.e(pz7, java.lang.String, boolean, iqb, java.lang.String, tkh, tkh, mnc, float, oxf, zy7, ld4, int, int, int):void");
    }

    public static final void f(final zy7 zy7Var, iqb iqbVar, final String str, boolean z, float f, n02 n02Var, ld4 ld4Var, final int i, final int i2) {
        iqb iqbVar2;
        int i3;
        final boolean z2;
        final n02 n02Var2;
        final iqb iqbVar3;
        final float f2;
        n02 n02VarA;
        float f3;
        boolean z3;
        int i4;
        iqb iqbVar4;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1584692290);
        int i5 = i | (e18Var.h(zy7Var) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i3 = i5 | (e18Var.f(iqbVar2) ? 32 : 16);
        }
        int i7 = i3 | (e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 93184;
        if (e18Var.Q(i7 & 1, (74899 & i7) != 74898)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                iqb iqbVar5 = i6 != 0 ? fqb.E : iqbVar2;
                qnc qncVar = q02.a;
                n02VarA = q02.a(gm3.a(e18Var).M, gm3.a(e18Var).o, 0L, 0L, e18Var, 12);
                f3 = 36.0f;
                z3 = true;
                i4 = i7 & (-458753);
                iqbVar4 = iqbVar5;
            } else {
                e18Var.T();
                iqb iqbVar6 = iqbVar2;
                i4 = i7 & (-458753);
                iqbVar4 = iqbVar6;
                z3 = z;
                f3 = f;
                n02VarA = n02Var;
            }
            e18Var.q();
            e0g e0gVar = gm3.b(e18Var).o;
            s02 s02VarB = q02.b(31);
            qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v);
            qnc qncVar2 = new qnc(14.0f, 3.0f, 14.0f, 3.0f);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = vb7.f(e18Var);
            }
            csg.a(zy7Var, b.g(iqbVar4, f3, MTTypesetterKt.kLineSkipLimitMultiplier, 2), z3, e0gVar, n02VarA, s02VarB, qu1VarA, qncVar2, (zub) objN, fd9.q0(1064891310, new pp(str, 19), e18Var), e18Var, 918552960 | (i4 & 14), 0);
            e18Var = e18Var;
            iqbVar3 = iqbVar4;
            f2 = f3;
            z2 = z3;
            n02Var2 = n02VarA;
        } else {
            e18Var.T();
            z2 = z;
            n02Var2 = n02Var;
            iqbVar3 = iqbVar2;
            f2 = f;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(iqbVar3, str, z2, f2, n02Var2, i, i2) { // from class: gji
                public final /* synthetic */ iqb F;
                public final /* synthetic */ String G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ float I;
                public final /* synthetic */ n02 J;
                public final /* synthetic */ int K;

                {
                    this.K = i2;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    rta.f(this.E, this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0, this.K);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.q92 g(defpackage.xn9 r8, boolean r9) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rta.g(xn9, boolean):q92");
    }

    public static final String h(String str, List list) {
        return w44.S0(list, "\n", str.concat("\n"), null, new kac(23), 28);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.fa2 i(defpackage.xn9 r6, boolean r7, java.lang.reflect.Field r8) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rta.i(xn9, boolean, java.lang.reflect.Field):fa2");
    }

    public static final boolean j(xn9 xn9Var) {
        return !fbi.e(xn9Var.x().t().getType());
    }

    public static final sve k(float f, sve sveVar) {
        return new sve(f, f, sveVar.b() - f, sveVar.a() - f, m(f, sveVar.e), m(f, sveVar.f), m(f, sveVar.g), m(f, sveVar.h));
    }

    public static synchronized int l(Context context) {
        try {
            dgj.w("Context is null", context);
            "preferredRenderer: ".concat("null");
            if (!a) {
                try {
                    b7k b7kVarI = npk.i(context);
                    try {
                        fuj fujVarO = b7kVarI.O();
                        dgj.v(fujVarO);
                        wvj.c = fujVarO;
                        kuk kukVarQ = b7kVarI.Q();
                        if (nv1.h == null) {
                            dgj.w("delegate must not be null", kukVarQ);
                            nv1.h = kukVarQ;
                        }
                        a = true;
                        try {
                            Parcel parcelF = b7kVarI.F(b7kVarI.H(), 9);
                            int i = parcelF.readInt();
                            parcelF.recycle();
                            if (i == 2) {
                                b = 2;
                            }
                            cbc cbcVar = new cbc(context);
                            Parcel parcelH = b7kVarI.H();
                            gyj.d(parcelH, cbcVar);
                            parcelH.writeInt(0);
                            b7kVarI.L(parcelH, 10);
                        } catch (RemoteException e) {
                            Log.e("rta", "Failed to retrieve renderer type or log initialization.", e);
                        }
                        int i2 = b;
                        "loadedRenderer: ".concat(i2 != 1 ? i2 != 2 ? "null" : "LATEST" : "LEGACY");
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                } catch (GooglePlayServicesNotAvailableException e3) {
                    return e3.E;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return 0;
    }

    public static final long m(float f, long j) {
        float fMax = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }
}
