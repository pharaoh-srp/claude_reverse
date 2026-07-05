package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dpk {
    public static final ta4 a = new ta4(-1034193347, false, new sb4(25));
    public static final ta4 b = new ta4(-1783924876, false, new sb4(26));

    public static final void a(final ml3 ml3Var, final q2i q2iVar, final boolean z, final int i, final boolean z2, final by2 by2Var, final bz7 bz7Var, final zy7 zy7Var, final zy7 zy7Var2, final zy7 zy7Var3, final zy7 zy7Var4, final boolean z3, final iqb iqbVar, m2i m2iVar, ld4 ld4Var, final int i2) {
        e18 e18Var;
        final m2i m2iVar2;
        m2i m2iVarN;
        q2iVar.getClass();
        by2Var.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1256496538);
        int i3 = i2 | (e18Var2.f(ml3Var) ? 4 : 2) | (e18Var2.f(q2iVar) ? 32 : 16) | (e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.d(i) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.d(by2Var.ordinal()) ? 131072 : 65536) | (e18Var2.h(bz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.h(zy7Var) ? 8388608 : 4194304) | (e18Var2.h(zy7Var2) ? 67108864 : 33554432) | (e18Var2.h(zy7Var3) ? 536870912 : 268435456);
        if (e18Var2.Q(i3 & 1, ((306783379 & i3) == 306783378 && (((e18Var2.g(z3) ? ' ' : (char) 16) | 1414) & 1171) == 1170) ? false : true)) {
            e18Var2.V();
            if ((i2 & 1) == 0 || e18Var2.A()) {
                m2iVarN = zh4.n(0L, e18Var2, 1);
            } else {
                e18Var2.T();
                m2iVarN = m2iVar;
            }
            e18Var2.q();
            iqb iqbVarW = zni.w(fqb.E, m2iVarN.a, null, 6);
            o5b o5bVarD = dw1.d(lja.G, false);
            m2i m2iVar3 = m2iVarN;
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarW);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            long j = d54.g;
            int i4 = 0;
            cok.f(fd9.q0(-366742246, new hv(z, i, i4), e18Var2), q2iVar, iqbVar, m2iVar3.a(j, (60 & 2) != 0 ? m2iVar3.b : j, (60 & 4) != 0 ? m2iVar3.c : 0L, (60 & 8) != 0 ? m2iVar3.d : 0L, (60 & 16) != 0 ? m2iVar3.e : 0L, m2iVar3.f), fd9.q0(-1643508586, new iv(z, zy7Var2, ml3Var, i4), e18Var2), fd9.q0(8245709, new jv(z, zy7Var3, z3, zy7Var4, by2Var, bz7Var, z2, zy7Var), e18Var2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, (i3 & 112) | 221574, 192);
            e18Var = e18Var2;
            e18Var.p(true);
            m2iVar2 = m2iVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            m2iVar2 = m2iVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(q2iVar, z, i, z2, by2Var, bz7Var, zy7Var, zy7Var2, zy7Var3, zy7Var4, z3, iqbVar, m2iVar2, i2) { // from class: kv
                public final /* synthetic */ q2i F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ int H;
                public final /* synthetic */ boolean I;
                public final /* synthetic */ by2 J;
                public final /* synthetic */ bz7 K;
                public final /* synthetic */ zy7 L;
                public final /* synthetic */ zy7 M;
                public final /* synthetic */ zy7 N;
                public final /* synthetic */ zy7 O;
                public final /* synthetic */ boolean P;
                public final /* synthetic */ iqb Q;
                public final /* synthetic */ m2i R;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    dpk.a(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, ld4 ld4Var, int i) {
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1659811357);
        int i2 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.h(zy7Var2) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 112) == 32;
            Object objN = e18Var.N();
            int i3 = 6;
            if (z || objN == jd4.a) {
                objN = new es0(zy7Var2, null, i3);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, iei.a);
            xuk.c(d4c.j0(R.string.completion_notification_upsell_description, e18Var), d4c.j0(R.string.completion_notification_upsell_confirm_button, e18Var), zy7Var, zy7Var3, iqbVar, jik.a, d4c.j0(R.string.completion_notification_upsell_title, e18Var), e18Var, ((i2 << 6) & 896) | 224256, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new h94(zy7Var, zy7Var2, zy7Var3, iqbVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01db A[LOOP:1: B:133:0x01d5->B:135:0x01db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final com.anthropic.claude.api.mcp.McpServer r32, final defpackage.zy7 r33, final defpackage.bz7 r34, final defpackage.pz7 r35, final defpackage.bz7 r36, final defpackage.iqb r37, final defpackage.bz7 r38, final defpackage.zy7 r39, final defpackage.mnc r40, final defpackage.qnc r41, final defpackage.oxf r42, final defpackage.iqb r43, final defpackage.rz7 r44, final defpackage.bz7 r45, final defpackage.ta4 r46, defpackage.ld4 r47, final int r48) {
        /*
            Method dump skipped, instruction units count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpk.c(com.anthropic.claude.api.mcp.McpServer, zy7, bz7, pz7, bz7, iqb, bz7, zy7, mnc, qnc, oxf, iqb, rz7, bz7, ta4, ld4, int):void");
    }

    public static final void d(z4b z4bVar, boolean z, zy7 zy7Var, mnc mncVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        String strN;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1366483711);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(z4bVar == null ? -1 : z4bVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(mncVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2;
            nxf nxfVarG = c0l.g(0L, 0L, 0L, 0L, 0L, e18Var, 63);
            String strJ0 = d4c.j0(R.string.mcp_tools_set_all_action, e18Var);
            if (z4bVar != null) {
                e18Var.a0(-1069133909);
                strN = jpk.m(z4bVar, e18Var);
                e18Var.p(false);
            } else if (z) {
                strN = vb7.n(e18Var, -1069132842, R.string.mcp_tools_set_all_value_custom, e18Var, false);
            } else {
                e18Var.a0(1216690047);
                e18Var.p(false);
                strN = "";
            }
            String str = strN;
            long jA = nxfVarG.a(z);
            iqb iqbVarC = b.c(iqbVar, z, strJ0, new vue(0), null, zy7Var, 8);
            boolean zF = e18Var.f(str) | ((i3 & 112) == 32);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new xj4(str, z, 4);
                e18Var.k0(objN);
            }
            ybi.b(null, fpk.b, tjf.b(iqbVarC, false, (bz7) objN), null, fd9.q0(1139018362, new m21(str, nxfVarG, z, 1), e18Var), jA, mncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var, ((i3 << 9) & 3670016) | 24630, 0, 16264);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new k04(z4bVar, z, zy7Var, mncVar, iqbVar, i);
        }
    }

    public static void e(saa saaVar, s08 s08Var, Executor executor) {
        saaVar.a(new t08(saaVar, 0, s08Var), executor);
    }

    public static loe f(qh9 qh9Var) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                Object key = p7aVarA.getKey();
                key.getClass();
                linkedHashMap.put(key, p7aVarA.getValue());
            }
            return new loe(linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Context", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Context", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Context", e3);
            return null;
        }
    }

    public static final zb0 g(cjh cjhVar) {
        zb0 zb0Var = cjhVar.a;
        long j = cjhVar.b;
        zb0Var.getClass();
        return zb0Var.subSequence(kkh.g(j), kkh.f(j));
    }

    public static final zb0 h(cjh cjhVar, int i) {
        zb0 zb0Var = cjhVar.a;
        zb0 zb0Var2 = cjhVar.a;
        long j = cjhVar.b;
        int iF = kkh.f(j);
        int iF2 = kkh.f(j);
        int length = iF2 + i;
        if (((i ^ length) & (iF2 ^ length)) < 0) {
            length = zb0Var2.F.length();
        }
        return zb0Var.subSequence(iF, Math.min(length, zb0Var2.F.length()));
    }

    public static final zb0 i(cjh cjhVar, int i) {
        zb0 zb0Var = cjhVar.a;
        long j = cjhVar.b;
        int iG = kkh.g(j);
        int i2 = iG - i;
        if (((iG ^ i2) & (i ^ iG)) < 0) {
            i2 = 0;
        }
        return zb0Var.subSequence(Math.max(0, i2), kkh.g(j));
    }

    public static String j(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strL;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strL = "null";
            } else {
                try {
                    strL = obj.toString();
                } catch (Exception e) {
                    String strC = ij0.C(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strC), (Throwable) e);
                    strL = ij0.l("<", strC, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strL;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
