package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.mcp.McpTool;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jpk {
    public static final ta4 a = new ta4(2009450300, false, new ub4(0));

    static {
        new ta4(-302376101, false, new ub4(1));
        new ta4(406453705, false, new ub4(2));
        new ta4(-854033660, false, new ub4(3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, m7f] */
    /* JADX WARN: Type inference failed for: r9v10, types: [tp4] */
    /* JADX WARN: Type inference failed for: r9v11, types: [sz7] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, rzd, zy7] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void a(List list, String str, bz7 bz7Var, zy7 zy7Var, jw jwVar, qi3 qi3Var, ybg ybgVar, ld4 ld4Var, int i) {
        jw jwVar2;
        qi3 qi3Var2;
        ybg ybgVar2;
        int i2;
        int i3;
        lz1 lz1Var;
        ?? r9;
        int i4;
        jw jwVar3;
        qi3 qi3Var3;
        ybg ybgVar3;
        ?? r92;
        int i5;
        Object obj;
        jw jwVar4;
        l45 l45Var;
        ybg ybgVar4;
        int i6;
        ?? r93;
        r4g r4gVar;
        jw jwVar5;
        list.getClass();
        str.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        ?? r14 = (e18) ld4Var;
        r14.c0(-1060017694);
        int i7 = i | (r14.f(list) ? 4 : 2) | (r14.f(str) ? 32 : 16) | (r14.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (r14.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 1646592;
        if (r14.Q(i7 & 1, (599187 & i7) != 599186)) {
            r14.V();
            int i8 = i & 1;
            lz1 lz1Var2 = jd4.a;
            if (i8 == 0 || r14.A()) {
                int i9 = i7 >> 3;
                m7f m7fVarN = sq6.n(r14, -1168520582, r14, -1633490746);
                boolean zF = r14.f(null) | r14.f(m7fVarN);
                Object objN = r14.N();
                if (zF || objN == lz1Var2) {
                    objN = m7fVarN.a(jce.a.b(koi.class), null, null);
                    r14.k0(objN);
                }
                r14.p(false);
                r14.p(false);
                koi koiVar = (koi) objN;
                m7f m7fVarN2 = sq6.n(r14, -1168520582, r14, -1633490746);
                boolean zF2 = r14.f(null) | r14.f(m7fVarN2);
                Object objN2 = r14.N();
                if (zF2 || objN2 == lz1Var2) {
                    objN2 = m7fVarN2.a(jce.a.b(lgb.class), null, null);
                    r14.k0(objN2);
                }
                r14.p(false);
                r14.p(false);
                lgb lgbVar = (lgb) objN2;
                m7f m7fVarN3 = sq6.n(r14, -1168520582, r14, -1633490746);
                boolean zF3 = r14.f(null) | r14.f(m7fVarN3);
                Object objN3 = r14.N();
                if (zF3 || objN3 == lz1Var2) {
                    objN3 = m7fVarN3.a(jce.a.b(sa6.class), null, null);
                    r14.k0(objN3);
                }
                r14.p(false);
                r14.p(false);
                sa6 sa6Var = (sa6) objN3;
                m7f m7fVarN4 = sq6.n(r14, -1168520582, r14, -1633490746);
                boolean zF4 = r14.f(null) | r14.f(m7fVarN4);
                Object objN4 = r14.N();
                if (zF4 || objN4 == lz1Var2) {
                    objN4 = m7fVarN4.a(jce.a.b(qi3.class), null, null);
                    r14.k0(objN4);
                }
                r14.p(false);
                r14.p(false);
                qi3 qi3Var4 = (qi3) objN4;
                Context applicationContext = ((Context) r14.j(w00.b)).getApplicationContext();
                boolean zF5 = ((((i9 & 14) ^ 6) > 4 && r14.f(str)) || (i9 & 6) == 4) | r14.f(koiVar) | r14.f(lgbVar) | r14.f(sa6Var) | r14.f(qi3Var4);
                Object objN5 = r14.N();
                if (zF5 || objN5 == lz1Var2) {
                    applicationContext.getClass();
                    i2 = -1168520582;
                    i3 = -1633490746;
                    lz1Var = lz1Var2;
                    r9 = 0;
                    jw jwVar6 = new jw(applicationContext, lgbVar, sa6Var, qi3Var4, str);
                    r14.k0(jwVar6);
                    objN5 = jwVar6;
                } else {
                    lz1Var = lz1Var2;
                    r9 = 0;
                    i2 = -1168520582;
                    i3 = -1633490746;
                }
                jw jwVar7 = (jw) objN5;
                ?? N = sq6.n(r14, i2, r14, i3);
                boolean zF6 = r14.f(r9) | r14.f(N);
                Object objN6 = r14.N();
                if (zF6 || objN6 == lz1Var) {
                    objN6 = N.a(jce.a.b(qi3.class), r9, r9);
                    r14.k0(objN6);
                }
                r14.p(false);
                r14.p(false);
                qi3 qi3Var5 = (qi3) objN6;
                int i10 = i7 & (-516097);
                Object objN7 = r14.N();
                Object objP = objN7;
                if (objN7 == lz1Var) {
                    objP = sq6.p(r14);
                }
                i4 = i10;
                jwVar3 = jwVar7;
                qi3Var3 = qi3Var5;
                ybgVar3 = (ybg) objP;
                r92 = r9;
            } else {
                r14.T();
                qi3Var3 = qi3Var;
                ybgVar3 = ybgVar;
                i4 = i7 & (-516097);
                r92 = 0;
                lz1Var = lz1Var2;
                jwVar3 = jwVar;
            }
            r14.q();
            boolean zH = r14.h(qi3Var3);
            Object objN8 = r14.N();
            if (zH || objN8 == lz1Var) {
                i5 = 1;
                gw gwVar = new gw(qi3Var3, r92, i5);
                r14.k0(gwVar);
                obj = gwVar;
            } else {
                i5 = 1;
                obj = objN8;
            }
            csg.g((bz7) obj, r14, 0, i5);
            int i11 = i5;
            r4g r4gVarS = gb9.S(null, null, null, zy7Var, r14, i4 & 7168, 7);
            Object objN9 = r14.N();
            Object obj2 = objN9;
            if (objN9 == lz1Var) {
                l45 l45VarO = fd9.O(im6.E, r14);
                r14.k0(l45VarO);
                obj2 = l45VarO;
            }
            l45 l45Var2 = (l45) obj2;
            String strJ0 = d4c.j0(R.string.product_name_artifacts, r14);
            if (list.isEmpty()) {
                jwVar4 = jwVar3;
                l45Var = l45Var2;
                ybgVar4 = ybgVar3;
                i6 = 0;
                r14.a0(1908908292);
                r14.p(false);
                r93 = r92;
            } else {
                r14.a0(1908239343);
                jwVar4 = jwVar3;
                l45Var = l45Var2;
                ybgVar4 = ybgVar3;
                ta4 ta4VarQ0 = fd9.q0(565319500, new kw(l45Var, jwVar4, list, ybgVar4, 0), r14);
                i6 = 0;
                r14.p(false);
                r93 = ta4VarQ0;
            }
            int i12 = ((i4 & 14) != 4 ? i6 : i11) | (r14.h(r4gVarS) ? 1 : 0) | ((i4 & 896) == 256 ? i11 : i6) | (r14.h(l45Var) ? 1 : 0) | (r14.h(jwVar4) ? 1 : 0);
            Object objN10 = r14.N();
            if (i12 != 0 || objN10 == lz1Var) {
                jw jwVar8 = jwVar4;
                r4gVar = r4gVarS;
                ybg ybgVar5 = ybgVar4;
                ne neVar = new ne(list, r4gVar, bz7Var, l45Var, jwVar8, ybgVar5, 3);
                jwVar5 = jwVar8;
                ybgVar4 = ybgVar5;
                r14.k0(neVar);
                objN10 = neVar;
            } else {
                jwVar5 = jwVar4;
                r4gVar = r4gVarS;
            }
            ybg ybgVar6 = ybgVar4;
            ovj.a(r4gVar, strJ0, null, null, false, false, null, null, null, r93, ybgVar6, null, null, (pz7) objN10, r14, 8, 384, 26620);
            ybgVar2 = ybgVar6;
            jwVar2 = jwVar5;
            qi3Var2 = qi3Var3;
        } else {
            r14.T();
            jwVar2 = jwVar;
            qi3Var2 = qi3Var;
            ybgVar2 = ybgVar;
        }
        r7e r7eVarS = r14.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw(list, str, bz7Var, zy7Var, jwVar2, qi3Var2, ybgVar2, i, 0);
        }
    }

    public static final void b(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1187488173);
        if (e18Var.Q(i & 1, i != 0)) {
            iqb iqbVarJ = gb9.J(b.c(fqb.E, 1.0f), 32.0f);
            o5b o5bVarD = dw1.d(lja.K, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
            tjh.b(d4c.j0(R.string.chat_no_files_yet, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 0, 0, 130042);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new te(i, 2);
        }
    }

    public static final void c(McpTool mcpTool, String str, String str2, z4b z4bVar, zy7 zy7Var, iqb iqbVar, mnc mncVar, ld4 ld4Var, int i) {
        String strN;
        mcpTool.getClass();
        str2.getClass();
        z4bVar.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(48817074);
        int i2 = i | (e18Var.f(mcpTool) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.d(z4bVar.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(iqbVar) ? 131072 : 65536) | (e18Var.f(mncVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            boolean zK = qok.k(mcpTool);
            boolean z = (mcpTool.m352getEnabled_keyA4OzCrU() == null || zK) ? false : true;
            String strK = gpk.k(z4bVar, e18Var);
            String strJ0 = d4c.j0(R.string.mcp_tool_permission_change_action, e18Var);
            boolean z2 = z;
            nxf nxfVarG = c0l.g(0L, 0L, 0L, 0L, 0L, e18Var, 63);
            ta4 ta4VarQ0 = null;
            if (zK) {
                strN = vb7.n(e18Var, -331413684, R.string.mcp_tool_disabled_by_organization, e18Var, false);
            } else {
                e18Var.a0(-1683827797);
                e18Var.p(false);
                strN = null;
            }
            if (strN == null) {
                e18Var.a0(-1683357217);
                e18Var.p(false);
            } else {
                e18Var.a0(-1683357216);
                ta4VarQ0 = fd9.q0(1386501425, new m21(nxfVarG, z2, strN), e18Var);
                e18Var.p(false);
            }
            ta4 ta4Var = ta4VarQ0;
            long jA = nxfVarG.a(z2);
            iqb iqbVarC = androidx.compose.foundation.b.c(iqbVar, z2, strJ0, new vue(0), null, zy7Var, 8);
            boolean zF = e18Var.f(strK) | e18Var.g(z2);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new xj4(strK, z2, 5);
                e18Var.k0(objN);
            }
            ybi.b(fd9.q0(691145947, new ny3(str, str2, 4), e18Var), fd9.q0(934682810, new ska(7, mcpTool), e18Var), tjf.b(iqbVarC, false, (bz7) objN), ta4Var, fd9.q0(1665293399, new iv(z2, z4bVar, nxfVarG, 21), e18Var), jA, mncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var, (i2 & 3670016) | 24630, 0, 16256);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw(mcpTool, str, str2, z4bVar, zy7Var, iqbVar, mncVar, i);
        }
    }

    public static final List d(rag ragVar) {
        boolean z = ragVar.f;
        int[] iArr = ragVar.b;
        if (z || ragVar.c == 0) {
            return lm6.E;
        }
        x3e x3eVar = new x3e(ragVar);
        int iQ = ragVar.i;
        Object objValueOf = Integer.valueOf(ragVar.l - uag.b(iQ, iArr));
        while (iQ >= 0) {
            x3eVar.n(ragVar.i(iQ), ragVar.k(iQ) ? ragVar.p(iQ, iArr) : jd4.a, ragVar.a.l(iQ), objValueOf);
            objValueOf = ragVar.a(iQ);
            iQ = ragVar.q(iQ);
        }
        return (ArrayList) x3eVar.F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [t3, x3e] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [y08] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List e(vag vagVar, Integer num, int i, Integer num2) {
        int iE;
        int iS;
        qvb qvbVar;
        if (vagVar.w || vagVar.p() == 0) {
            return lm6.E;
        }
        ?? x3eVar = new x3e(vagVar);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = vagVar.v;
            if (iE < 0) {
                iE = vagVar.E(i, vagVar.b);
            }
        }
        if (num == 0) {
            int iN = vagVar.i - vagVar.N(vagVar.r(i), vagVar.b);
            xub xubVar = vagVar.s;
            num = Integer.valueOf(iN + ((xubVar == null || (qvbVar = (qvb) xubVar.b(i)) == null) ? 0 : qvbVar.b));
        }
        int iR = vagVar.r(i) * 5;
        int[] iArr = vagVar.b;
        if (iR < iArr.length) {
            iS = vagVar.s(i);
        } else {
            int iE2 = iE >= 0 ? vagVar.E(iE, iArr) : iE;
            iS = vagVar.s(iE);
            int i2 = iE;
            iE = iE2;
            i = i2;
        }
        while (i >= 0) {
            x3eVar.n(iS, (vagVar.b[(vagVar.r(i) * 5) + 1] & 536870912) != 0 ? vagVar.t(i) : jd4.a, vagVar.O(i), num);
            num = vagVar.b(i);
            if (iE >= 0) {
                int iE3 = vagVar.E(iE, vagVar.b);
                iS = vagVar.s(iE);
                int i3 = iE;
                iE = iE3;
                i = i3;
            } else {
                i = iE;
            }
        }
        return (ArrayList) x3eVar.F;
    }

    public static List f(vag vagVar) {
        return e(vagVar, null, vagVar.t, null);
    }

    public static String g(k22 k22Var) {
        StringBuilder sb = new StringBuilder(k22Var.size());
        for (int i = 0; i < k22Var.size(); i++) {
            byte bA = k22Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final Integer h(sag sagVar, ge4 ge4Var) {
        rag ragVarG = sagVar.g();
        try {
            return i(ragVarG, ge4Var, 0, ragVarG.c);
        } finally {
            ragVarG.c();
        }
    }

    public static final Integer i(rag ragVar, ge4 ge4Var, int i, int i2) {
        Integer numI;
        int[] iArr = ragVar.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (ragVar.j(i) && ragVar.i(i) == 206 && x44.r(ragVar.p(i, iArr), pd4.f)) {
                Object objH = ragVar.h(i, 0);
                i18 i18Var = objH instanceof i18 ? (i18) objH : null;
                mee meeVar = i18Var != null ? i18Var.a : null;
                b18 b18Var = meeVar instanceof b18 ? (b18) meeVar : null;
                if (b18Var != null && b18Var.E == ge4Var) {
                    return Integer.valueOf(i);
                }
            }
            if (ragVar.d(i) && (numI = i(ragVar, ge4Var, i + 1, i3)) != null) {
                return Integer.valueOf(numI.intValue());
            }
            i = i3;
        }
    }

    public static int j(String str) {
        for (int i : sq6.H(3)) {
            if (gid.h(i).equals(str)) {
                return i;
            }
        }
        pmf.h("Array contains no element matching the predicate.");
        return 0;
    }

    public static final void k(String str, char[] cArr, int i, int i2, int i3) {
        str.getClass();
        str.getChars(i2, i3, cArr, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [t3, x3e] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList l(rag ragVar, int i, Integer num) {
        ?? x3eVar = new x3e(ragVar);
        int iQ = ragVar.q(i);
        y08 y08VarA = ragVar.a(i);
        while (i >= 0) {
            x3eVar.n(ragVar.i(i), ragVar.k(i) ? ragVar.p(i, ragVar.b) : jd4.a, ragVar.a.l(i), num);
            if (iQ >= 0) {
                y08 y08Var = y08VarA;
                y08VarA = ragVar.a(iQ);
                i = iQ;
                iQ = ragVar.q(iQ);
                num = y08Var;
            } else {
                i = iQ;
                num = y08VarA;
            }
        }
        return (ArrayList) x3eVar.F;
    }

    public static final String m(z4b z4bVar, ld4 ld4Var) {
        e18 e18Var;
        int i;
        int i2;
        z4bVar.getClass();
        int iOrdinal = z4bVar.ordinal();
        if (iOrdinal == 0) {
            e18Var = (e18) ld4Var;
            i = R.string.mcp_tool_permission_value_allow;
            i2 = -920027249;
        } else if (iOrdinal == 1) {
            e18Var = (e18) ld4Var;
            i = R.string.mcp_tool_permission_value_ask;
            i2 = -920024371;
        } else {
            if (iOrdinal != 2) {
                throw ebh.u((e18) ld4Var, -920028584, false);
            }
            e18Var = (e18) ld4Var;
            i = R.string.mcp_tool_permission_value_never;
            i2 = -920021425;
        }
        return vb7.n(e18Var, i2, i, e18Var, false);
    }

    public static Object n(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
