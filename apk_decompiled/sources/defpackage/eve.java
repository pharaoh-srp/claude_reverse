package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.UserManager;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.types.strings.Capability;
import com.arkivanov.decompose.router.children.b;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class eve {
    public static final pb6 a = new pb6();
    public static final v9j b = new v9j(0.31006f, 0.31616f);
    public static final v9j c = new v9j(0.34567f, 0.3585f);
    public static final v9j d = new v9j(0.32168f, 0.33767f);
    public static final v9j e = new v9j(0.31271f, 0.32902f);
    public static final float[] f = {0.964212f, 1.0f, 0.825188f};
    public static final KSerializer[] g = new KSerializer[0];
    public static final ab6 h = new ab6();

    public static final long A(double d2) {
        return L((float) d2, 4294967296L);
    }

    public static final long B(int i) {
        return L(i, 4294967296L);
    }

    public static final pvg C(Organization organization) {
        organization.getClass();
        dc2 dc2Var = Capability.Companion;
        dc2Var.getClass();
        if (D(organization, Capability.RAVEN)) {
            return pvg.RAVEN;
        }
        dc2Var.getClass();
        if (D(organization, Capability.CLAUDE_MAX)) {
            return pvg.MAX;
        }
        dc2Var.getClass();
        return D(organization, Capability.CLAUDE_PRO) ? pvg.PRO : pvg.FREE;
    }

    public static final boolean D(Organization organization, String str) {
        organization.getClass();
        str.getClass();
        return organization.getCapabilities().contains(Capability.m971boximpl(str));
    }

    public static final String E(String str, String str2) throws IOException {
        if (str != null) {
            List listY0 = bsg.Y0(str, new String[]{" "}, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listY0) {
                if (((String) obj).length() > 1) {
                    arrayList.add(obj);
                }
            }
            String strS0 = w44.S0(w44.j1(arrayList, 2), "", null, null, new xg5(24), 30);
            if (strS0.length() != 0) {
                return strS0;
            }
        }
        return str2;
    }

    public static final float[] F(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static boolean G(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final long H(float f2, long j, long j2) {
        dlh[] dlhVarArr = clh.b;
        long j3 = j & 1095216660480L;
        if (j3 == 0 || (1095216660480L & j2) == 0) {
            d39.a("Cannot perform operation for Unspecified type.");
        }
        if (!dlh.a(clh.b(j), clh.b(j2))) {
            d39.a("Cannot perform operation for " + ((Object) dlh.b(clh.b(j))) + " and " + ((Object) dlh.b(clh.b(j2))));
        }
        return L(d4c.W(clh.c(j), clh.c(j2), f2), j3);
    }

    public static final float[] I(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] J(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static String K(String str) {
        if (str.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (Character.isWhitespace(cCharAt)) {
                sb.append('_');
            } else {
                if (i == -1) {
                    i = i3;
                }
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_' || cCharAt == '-' || cCharAt == '/') {
                    sb.append(Character.toLowerCase(cCharAt));
                } else {
                    sb.append('_');
                }
                i2 = i3;
            }
        }
        return i == -1 ? "" : sb.substring(i, i2 + 1);
    }

    public static final long L(float f2, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        dlh[] dlhVarArr = clh.b;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List M(defpackage.vs8 r37, defpackage.wg8 r38) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eve.M(vs8, wg8):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long N(int r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eve.N(int, java.lang.String):long");
    }

    public static iqb O(iqb iqbVar, l40 l40Var) {
        return iqbVar.B(new v7d(l40Var));
    }

    public static final rwe P(pl9 pl9Var, String str, boolean z, KSerializer kSerializer, zy7 zy7Var, ld4 ld4Var) {
        pl9Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        swe sweVar = (swe) e18Var.j(twe.a);
        String str2 = ((Object) str) + ".router";
        boolean zF = e18Var.f(str2) | e18Var.f(sweVar);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            rwe rweVar = (rwe) sweVar.b.get(str2);
            if (rweVar == null) {
                gmf gmfVar = new gmf(12);
                byte b2 = 0;
                int i = 1;
                rwe rweVar2 = new rwe(gmfVar, ez1.q(b.a(sweVar, gmfVar, str2, new px2(5, zy7Var), new a2(11, new cf3(kSerializer, b2)), new a2(12, new cf3(kSerializer, i)), new s03(6), new s03(7), new s03(8), new xe3(i), new s8(z, 2), new k8d(b2, 10)), sweVar.a.a()));
                sweVar.b.put(str2, rweVar2);
                objN = rweVar2;
            } else {
                objN = rweVar;
            }
            e18Var.k0(objN);
        }
        return (rwe) objN;
    }

    public static final View Q(nw5 nw5Var) {
        if (!nw5Var.x0().R) {
            b39.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) dv9.a(yfd.W(nw5Var));
    }

    public static final c79 R(l9e l9eVar) {
        return new c79(Math.round(l9eVar.a), Math.round(l9eVar.b), Math.round(l9eVar.c), Math.round(l9eVar.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(defpackage.aaf r4, float r5, defpackage.tp4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.y8f
            if (r0 == 0) goto L13
            r0 = r6
            y8f r0 = (defpackage.y8f) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            y8f r0 = new y8f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            aae r4 = r0.E
            defpackage.sf5.h0(r6)
            goto L4b
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2e:
            defpackage.sf5.h0(r6)
            aae r6 = new aae
            r6.<init>()
            z8f r1 = new z8f
            r1.<init>(r6, r5, r2)
            r0.E = r6
            r0.G = r3
            zwb r5 = defpackage.zwb.E
            java.lang.Object r4 = r4.c(r5, r1, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L4a
            return r5
        L4a:
            r4 = r6
        L4b:
            float r4 = r4.E
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eve.S(aaf, float, tp4):java.lang.Object");
    }

    public static final iqb T(iqb iqbVar, boolean z, boolean z2, zy7 zy7Var) {
        if (!z || !tug.a) {
            return iqbVar;
        }
        if (z2) {
            iqbVar = iqbVar.B(new uug(h));
        }
        return iqbVar.B(new rug(zy7Var));
    }

    public static String U(String str) {
        return str == null ? "" : str.trim();
    }

    public static final void a(wni wniVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2015914403);
        int i2 = i | 2;
        int i3 = 2;
        int i4 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(wni.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                wniVar = (wni) objN;
            } else {
                e18Var.T();
            }
            e18Var.q();
            boolean zH = e18Var.h(wniVar);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new a2(i3, wniVar);
                e18Var.k0(objN2);
            }
            oqb oqbVar = wni.h;
            fd9.d(wniVar, (bz7) objN2, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new a21(wniVar, i, i4);
        }
    }

    public static final void b(String str, String str2, zy7 zy7Var, iqb iqbVar, boolean z, String str3, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-2050454497);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str2) ? 32 : 16;
        }
        int i3 = i2 | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072 | (e18Var2.g(z) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.f(str3) ? 131072 : 65536);
        int i4 = 1;
        if (e18Var2.Q(i3 & 1, (i3 & 74899) != 74898)) {
            xo1 xo1Var = lja.K;
            float f2 = z ? 1.0f : 0.4f;
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(androidx.compose.foundation.layout.b.b(androidx.compose.foundation.b.c(yfd.p(xn5.V(androidx.compose.foundation.layout.b.v(xn5.S(fqbVar, f2), MTTypesetterKt.kLineSkipLimitMultiplier, 220.0f, 1), xve.a), gm3.a(e18Var2).q, zni.b), z, str3, new vue(0), null, zy7Var, 8), MTTypesetterKt.kLineSkipLimitMultiplier, 36.0f, 1), 16.0f, 4.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            cxe cxeVarA = axe.a(new ho0(4.0f, true, new sz6(i4)), lja.Q, e18Var2, 54);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, fqbVar);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, cxeVarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            tjh.b(str, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, i3 & 14, 24960, 110586);
            e18Var = e18Var2;
            if (str2 == null || str2.length() == 0) {
                e18Var.a0(-1464945939);
                e18Var.p(false);
            } else {
                e18Var.a0(-1465364408);
                tjh.b(str2, new hw9(1.0f, false), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, (i3 >> 3) & 14, 24960, 110584);
                e18Var = e18Var;
                e18Var.p(false);
            }
            e18Var.p(true);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new cx2(str, str2, zy7Var, iqbVar2, z, str3, i);
        }
    }

    public static final void c(final boolean z, final bz7 bz7Var, final pz7 pz7Var, final bz7 bz7Var2, final pz7 pz7Var2, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, final int i) {
        int i2;
        ta4 ta4Var2;
        final iqb iqbVar2;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2062375241);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if ((i & 3072) == 0) {
            i4 |= e18Var.h(bz7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i5 = i4 | (e18Var.h(pz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 196608;
        if (e18Var.Q(i5 & 1, (599187 & i5) != 599186)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(null);
                e18Var.k0(objN2);
            }
            nwb nwbVar2 = (nwb) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new ig1(i3, nwbVar);
                e18Var.k0(objN3);
            }
            bz7 bz7Var3 = (bz7) objN3;
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = new ig1(5, nwbVar2);
                e18Var.k0(objN4);
            }
            Context context = (Context) e18Var.j(w00.b);
            nwb nwbVarZ = mpk.Z(bz7Var3, e18Var);
            nwb nwbVarZ2 = mpk.Z((bz7) objN4, e18Var);
            nwb nwbVarZ3 = mpk.Z(pz7Var, e18Var);
            nwb nwbVarZ4 = mpk.Z(pz7Var2, e18Var);
            nwb nwbVarZ5 = mpk.Z(bz7Var2, e18Var);
            nwb nwbVarZ6 = mpk.Z(bz7Var, e18Var);
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new rb6(nwbVarZ, nwbVarZ2, context, nwbVarZ6, nwbVarZ3, nwbVarZ5, nwbVarZ4);
                e18Var.k0(objN5);
            }
            rb6 rb6Var = (rb6) objN5;
            boolean z2 = (i5 & 112) == 32;
            Object objN6 = e18Var.N();
            if (z2 || objN6 == lz1Var) {
                objN6 = new vk3(bz7Var, i3, nwbVar2);
                e18Var.k0(objN6);
            }
            iqbVar2 = fqb.E;
            iqb iqbVarB = csg.s(iqbVar2, (bz7) objN6).B(new g6e(rb6Var));
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
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
            ta4Var2 = ta4Var;
            ta4Var2.invoke(e18Var, 6);
            ec6 ec6Var = (ec6) nwbVar2.getValue();
            if (((Boolean) nwbVar.getValue()).booleanValue() && z && ec6Var != null) {
                e18Var.a0(936209139);
                d(ec6Var.b > 0, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(936349445);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            ta4Var2 = ta4Var;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final ta4 ta4Var3 = ta4Var2;
            r7eVarS.d = new pz7() { // from class: ob6
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eve.c(z, bz7Var, pz7Var, bz7Var2, pz7Var2, iqbVar2, ta4Var3, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void d(boolean z, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-744292527);
        int i2 = (e18Var.g(z) ? 32 : 16) | i;
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            iqb iqbVarP = yfd.p(nw1.a.b(), d54.b(0.9f, gm3.a(e18Var).o), zni.b);
            o5b o5bVarD = dw1.d(lja.K, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP);
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
            q64 q64VarA = p64.a(new ho0(8.0f, true, new sz6(i3)), lja.T, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, fqb.E);
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
            iv1.b(ud0.m0, null, null, null, gm3.a(e18Var).M, e18Var, 48, 12);
            tjh.b(d4c.j0(R.string.drop_to_attach, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkh.b(((jm3) gm3.c(e18Var).e.E).g, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), e18Var, 0, 0, 131070);
            e18Var = e18Var;
            if (z) {
                e18Var.a0(1577208813);
                prk.k(d4c.j0(R.string.drop_to_attach_warning, e18Var), null, tkh.b(((jm3) gm3.c(e18Var).e.E).i, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), a.a(ud0.C0, e18Var), dv8.E, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).M, 0, 0, e18Var, 28672, 1890);
                e18Var.p(false);
            } else {
                e18Var.a0(1577599413);
                e18Var.p(false);
            }
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tp(z, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(int r20, int r21, defpackage.ld4 r22, defpackage.zy7 r23, defpackage.iqb r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eve.e(int, int, ld4, zy7, iqb, boolean, boolean):void");
    }

    public static final c79 f(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new c79(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static final void g(oke okeVar, qi3 qi3Var, rc8 rc8Var, ld4 ld4Var, int i) {
        oke okeVar2;
        qi3 qi3Var2;
        rc8 rc8Var2;
        rc8 rc8Var3;
        oke okeVar3;
        qi3 qi3Var3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(848605432);
        int i2 = i | 146;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            int i3 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(oke.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                oke okeVar4 = (oke) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3 qi3Var4 = (qi3) objN2;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN3 = e18Var.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(rc8.class), null, null);
                    e18Var.k0(objN3);
                }
                e18Var.p(false);
                e18Var.p(false);
                rc8Var3 = (rc8) objN3;
                okeVar3 = okeVar4;
                qi3Var3 = qi3Var4;
            } else {
                e18Var.T();
                okeVar3 = okeVar;
                qi3Var3 = qi3Var;
                rc8Var3 = rc8Var;
            }
            e18Var.q();
            nwb nwbVarU = mpk.u(okeVar3.l, e18Var);
            boolean zH = e18Var.h(rc8Var3) | e18Var.h(okeVar3);
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new mk0(rc8Var3, okeVar3, tp4Var, 6);
                e18Var.k0(objN4);
            }
            csg.g((bz7) objN4, e18Var, 0, 1);
            vc vcVar = new vc(3);
            boolean zH2 = e18Var.h(qi3Var3) | e18Var.h(okeVar3);
            Object objN5 = e18Var.N();
            if (zH2 || objN5 == lz1Var) {
                objN5 = new vk3(qi3Var3, 9, okeVar3);
                e18Var.k0(objN5);
            }
            xpa xpaVarD0 = sf5.d0(vcVar, (bz7) objN5, e18Var, 0);
            do7 do7Var = (do7) nwbVarU.getValue();
            boolean zF4 = e18Var.f(nwbVarU) | e18Var.h(qi3Var3) | e18Var.h(okeVar3) | e18Var.h(xpaVarD0);
            Object objN6 = e18Var.N();
            if (zF4 || objN6 == lz1Var) {
                qt9 qt9Var = new qt9(qi3Var3, okeVar3, xpaVarD0, nwbVarU, null);
                e18Var.k0(qt9Var);
                objN6 = qt9Var;
            }
            fd9.i(e18Var, (pz7) objN6, do7Var);
            rc8Var2 = rc8Var3;
            qi3Var2 = qi3Var3;
            okeVar2 = okeVar3;
        } else {
            e18Var.T();
            okeVar2 = okeVar;
            qi3Var2 = qi3Var;
            rc8Var2 = rc8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m63(okeVar2, i, qi3Var2, rc8Var2, 14);
        }
    }

    public static final void h(final boolean z, final t53 t53Var, final hw2 hw2Var, final rwe rweVar, final rwe rweVar2, final kg3 kg3Var, final bl2 bl2Var, final lvh lvhVar, final zy7 zy7Var, final float f2, final iqb iqbVar, ld4 ld4Var, final int i) {
        kg3Var.getClass();
        bl2Var.getClass();
        lvhVar.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2014845583);
        int i2 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.f(t53Var) ? 32 : 16) | (e18Var.h(hw2Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(rweVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(rweVar2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(kg3Var) ? 131072 : 65536) | (e18Var.f(bl2Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.f(lvhVar) ? 8388608 : 4194304) | (e18Var.h(zy7Var) ? 67108864 : 33554432) | (e18Var.c(f2) ? 536870912 : 268435456);
        int i3 = e18Var.f(iqbVar) ? 4 : 2;
        if (e18Var.Q(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            int i4 = i2 & 14;
            yb5.d(((i2 >> 18) & 896) | i4, 2, e18Var, zy7Var, null, z);
            yb5.c(((i2 >> 21) & 112) | i4, 0, e18Var, zy7Var, z);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new x0a();
                e18Var.k0(objN);
            }
            final x0a x0aVar = (x0a) objN;
            boolean zC = e18Var.c(1.0f);
            Object objN2 = e18Var.N();
            if (zC || objN2 == lz1Var) {
                objN2 = new y4g();
                e18Var.k0(objN2);
            }
            final y4g y4gVar = (y4g) objN2;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zF = (i4 == 4) | e18Var.f(y4gVar);
            Object objN3 = e18Var.N();
            if (zF || objN3 == lz1Var) {
                objN3 = new ax(z, y4gVar, (tp4) null);
                e18Var.k0(objN3);
            }
            fd9.i(e18Var, (pz7) objN3, boolValueOf);
            z8i z8iVarN = kxk.N(300, 0, null, 6);
            Object objN4 = e18Var.N();
            int i5 = 8;
            if (objN4 == lz1Var) {
                objN4 = new xga(i5);
                e18Var.k0(objN4);
            }
            wp6 wp6VarM = gp6.m(z8iVarN, (bz7) objN4);
            z8i z8iVarN2 = kxk.N(250, 0, null, 6);
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new xga(8);
                e18Var.k0(objN5);
            }
            e18Var = e18Var;
            wd6.M(z, iqbVar, wp6VarM, gp6.o(z8iVarN2, (bz7) objN5), null, fd9.q0(1000817225, new rz7() { // from class: uxa
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ia0) obj).getClass();
                    byte b2 = 0;
                    int i6 = 1;
                    e18 e18Var2 = (e18) ld4Var2;
                    boolean zQ = e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16);
                    iei ieiVar = iei.a;
                    if (!zQ) {
                        e18Var2.T();
                        return ieiVar;
                    }
                    Object objN6 = e18Var2.N();
                    lz1 lz1Var2 = jd4.a;
                    final x0a x0aVar2 = x0aVar;
                    if (objN6 == lz1Var2) {
                        objN6 = new nt4(x0aVar2, (tp4) null, 5);
                        e18Var2.k0(objN6);
                    }
                    fd9.i(e18Var2, (pz7) objN6, ieiVar);
                    e18Var2.a0(-287301105);
                    cz5 cz5Var = (cz5) e18Var2.j(ve4.h);
                    WeakHashMap weakHashMap = gdj.x;
                    float fC0 = cz5Var.c0(s4i.d(e18Var2).c.e().d);
                    e18Var2.p(false);
                    float f3 = f2 - fC0;
                    final float f4 = f3 < MTTypesetterKt.kLineSkipLimitMultiplier ? 0.0f : f3;
                    iqb iqbVarK0 = mpk.k0(knk.M(fqb.E, new a5a(s4i.d(e18Var2).m, 16)), mpk.n);
                    ta4 ta4VarQ0 = fd9.q0(247389415, new sxa(zy7Var, i6, b2), e18Var2);
                    final t53 t53Var2 = t53Var;
                    final hw2 hw2Var2 = hw2Var;
                    final rwe rweVar3 = rweVar;
                    final rwe rweVar4 = rweVar2;
                    final kg3 kg3Var2 = kg3Var;
                    final bl2 bl2Var2 = bl2Var;
                    final lvh lvhVar2 = lvhVar;
                    puj.c(y4gVar, iqbVarK0, null, ta4VarQ0, fd9.q0(-1239468680, new rz7() { // from class: wxa
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            final s64 s64Var = (s64) obj4;
                            ld4 ld4Var3 = (ld4) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            s64Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= ((e18) ld4Var3).f(s64Var) ? 4 : 2;
                            }
                            e18 e18Var3 = (e18) ld4Var3;
                            if (e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                Object objN7 = e18Var3.N();
                                if (objN7 == jd4.a) {
                                    objN7 = new lc3();
                                    e18Var3.k0(objN7);
                                }
                                final lc3 lc3Var = (lc3) objN7;
                                hvd hvdVarA = vm2.a.a(um2.e);
                                final float f5 = f4;
                                final t53 t53Var3 = t53Var2;
                                final hw2 hw2Var3 = hw2Var2;
                                final x0a x0aVar3 = x0aVar2;
                                final rwe rweVar5 = rweVar3;
                                final rwe rweVar6 = rweVar4;
                                final kg3 kg3Var3 = kg3Var2;
                                final bl2 bl2Var3 = bl2Var2;
                                final lvh lvhVar3 = lvhVar2;
                                j8.c(hvdVarA, fd9.q0(-1289709000, new pz7() { // from class: xxa
                                    @Override // defpackage.pz7
                                    public final Object invoke(Object obj7, Object obj8) {
                                        ld4 ld4Var4 = (ld4) obj7;
                                        int iIntValue3 = ((Integer) obj8).intValue();
                                        e18 e18Var4 = (e18) ld4Var4;
                                        if (e18Var4.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            qnc qncVarD = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f5, 7);
                                            iqb iqbVarB = s64Var.b(fqb.E, 1.0f, true);
                                            Object objN8 = e18Var4.N();
                                            if (objN8 == jd4.a) {
                                                objN8 = new jua(6);
                                                e18Var4.k0(objN8);
                                            }
                                            z23.a(lc3Var, t53Var3, hw2Var3, x0aVar3, yok.a, rweVar5, rweVar6, kg3Var3, bl2Var3, lvhVar3, (bz7) objN8, iqbVarB, false, null, true, qncVarD, e18Var4, 16805376, 24966, FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
                                        } else {
                                            e18Var4.T();
                                        }
                                        return iei.a;
                                    }
                                }, e18Var3), e18Var3, 56);
                            } else {
                                e18Var3.T();
                            }
                            return iei.a;
                        }
                    }, e18Var2), e18Var2, 27648);
                    return ieiVar;
                }
            }, e18Var), e18Var, i4 | 200064 | ((i3 << 3) & 112), 16);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(z, t53Var, hw2Var, rweVar, rweVar2, kg3Var, bl2Var, lvhVar, zy7Var, f2, iqbVar, i) { // from class: vxa
                public final /* synthetic */ boolean E;
                public final /* synthetic */ t53 F;
                public final /* synthetic */ hw2 G;
                public final /* synthetic */ rwe H;
                public final /* synthetic */ rwe I;
                public final /* synthetic */ kg3 J;
                public final /* synthetic */ bl2 K;
                public final /* synthetic */ lvh L;
                public final /* synthetic */ zy7 M;
                public final /* synthetic */ float N;
                public final /* synthetic */ iqb O;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(262657);
                    eve.h(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final long i(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static r54 j(r54 r54Var) {
        tk5 tk5Var = tk5.G;
        if (yfd.y(r54Var.b, 12884901888L)) {
            rse rseVar = (rse) r54Var;
            v9j v9jVar = rseVar.d;
            v9j v9jVar2 = c;
            if (!q(v9jVar, v9jVar2)) {
                return new rse(rseVar.a, rseVar.h, v9jVar2, I(p((float[]) tk5Var.F, v9jVar.a(), v9jVar2.a()), rseVar.i), rseVar.k, rseVar.n, rseVar.e, rseVar.f, rseVar.g, -1);
            }
        }
        return r54Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.aaf r4, float r5, defpackage.mb0 r6, defpackage.vp4 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.x8f
            if (r0 == 0) goto L13
            r0 = r7
            x8f r0 = (defpackage.x8f) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            x8f r0 = new x8f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            aae r4 = r0.E
            defpackage.sf5.h0(r7)
            goto L4b
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2e:
            defpackage.sf5.h0(r7)
            aae r7 = new aae
            r7.<init>()
            md2 r1 = new md2
            r1.<init>(r5, r6, r7, r2)
            r0.E = r7
            r0.G = r3
            zwb r5 = defpackage.zwb.E
            java.lang.Object r4 = r4.c(r5, r1, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L4a
            return r5
        L4a:
            r4 = r7
        L4b:
            float r4 = r4.E
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eve.k(aaf, float, mb0, vp4):java.lang.Object");
    }

    public static final iqb l(iqb iqbVar, qx1 qx1Var) {
        return iqbVar.B(new ox1(qx1Var));
    }

    public static final Bundle m(cpc... cpcVarArr) {
        Bundle bundle = new Bundle(cpcVarArr.length);
        for (cpc cpcVar : cpcVarArr) {
            String str = (String) cpcVar.E;
            Object obj = cpcVar.F;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        mr9.m("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    mr9.m("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final void n(long j) {
        dlh[] dlhVarArr = clh.b;
        if ((j & 1095216660480L) == 0) {
            d39.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void o(int i) {
        if (i >= 1) {
            return;
        }
        mr9.q(grc.p(i, "Expected positive parallelism level, but got "));
    }

    public static final float[] p(float[] fArr, float[] fArr2, float[] fArr3) {
        J(fArr, fArr2);
        J(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrF = F(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return I(fArrF, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final boolean q(v9j v9jVar, v9j v9jVar2) {
        if (v9jVar == v9jVar2) {
            return true;
        }
        return Math.abs(v9jVar.a - v9jVar2.a) < 0.001f && Math.abs(v9jVar.b - v9jVar2.b) < 0.001f;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bce r(java.lang.Class r14) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eve.r(java.lang.Class):bce");
    }

    public static final ei4 s(r54 r54Var, r54 r54Var2) {
        return r54Var == r54Var2 ? new ai4(r54Var, r54Var, 1) : (yfd.y(r54Var.b, 12884901888L) && yfd.y(r54Var2.b, 12884901888L)) ? new ci4((rse) r54Var, (rse) r54Var2) : new ei4(r54Var, r54Var2, 0);
    }

    public static int t(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean u(String str, String str2) {
        return x44.r(str, str2) || (isg.h0(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.' && !tkj.a.f(str));
    }

    public static final t0c v(zy7 zy7Var) {
        return new t0c(new px2(10, zy7Var));
    }

    public static ba w(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("referrer");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            String strM3 = qh9Var.s("url").m();
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM4 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("in_foreground");
            Boolean boolValueOf = bh9VarS3 != null ? Boolean.valueOf(bh9VarS3.a()) : null;
            strM.getClass();
            strM3.getClass();
            return new ba(strM, strM2, strM3, strM4, boolValueOf);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type ActionEventView", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type ActionEventView", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type ActionEventView", e4);
            return null;
        }
    }

    public static final long x(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long y(double d2) {
        return L((float) d2, 8589934592L);
    }

    public static final m7f z(ComponentCallbacks componentCallbacks) {
        componentCallbacks.getClass();
        if (componentCallbacks instanceof hr9) {
            return (m7f) ((hr9) componentCallbacks).e().c.I;
        }
        er9 er9Var = zp3.J;
        if (er9Var != null) {
            return (m7f) er9Var.c.I;
        }
        sz6.j("KoinApplication has not been started");
        return null;
    }
}
