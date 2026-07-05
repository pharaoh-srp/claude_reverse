package defpackage;

import androidx.compose.runtime.tooling.DiagnosticComposeException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.tool.model.AnalysisToolInvocation;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kpk {
    public static final ta4 a = new ta4(827741828, false, new ub4(4));
    public static final ta4 b = new ta4(858011010, false, new tb4(10));
    public static final ta4 c = new ta4(-387466523, false, new ub4(5));
    public static final ta4 d = new ta4(1209629316, false, new tb4(11));
    public static final ta4 e = new ta4(-6635030, false, new tb4(12));
    public static final ta4 f = new ta4(2055600242, false, new ub4(6));

    public static final void a(final AnalysisToolInvocation analysisToolInvocation, final boolean z, final zy7 zy7Var, final zy7 zy7Var2, iqb iqbVar, float f2, qi3 qi3Var, ld4 ld4Var, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        final iqb iqbVar2;
        final qi3 qi3Var2;
        final float f4;
        qi3 qi3Var3;
        int i5;
        iqb iqbVar3;
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1292444650);
        int i6 = 2;
        if ((i & 6) == 0) {
            i3 = (e18Var.f(analysisToolInvocation) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i7 = i3 | 24576;
        int i8 = i2 & 32;
        if (i8 != 0) {
            i4 = i3 | 221184;
            f3 = f2;
        } else {
            f3 = f2;
            i4 = i7 | (e18Var.c(f3) ? 131072 : 65536);
        }
        int i9 = i4 | 524288;
        if (e18Var.Q(i9 & 1, (599187 & i9) != 599186)) {
            e18Var.V();
            int i10 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i10 == 0 || e18Var.A()) {
                if (i8 != 0) {
                    f3 = MTTypesetterKt.kLineSkipLimitMultiplier;
                }
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
                i5 = i9 & (-3670017);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i5 = i9 & (-3670017);
                iqbVar3 = iqbVar;
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            boolean zH = e18Var.h(qi3Var3);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new gw(qi3Var3, tp4Var, i6);
                e18Var.k0(objN2);
            }
            csg.g((bz7) objN2, e18Var, 0, 1);
            String strO = euk.o(false, e18Var);
            float f5 = f3;
            iqb iqbVar4 = iqbVar3;
            rqk.a(strO, zy7Var, iqbVar4, f5, fd9.q0(-1643399432, new kn(analysisToolInvocation, 3, strO), e18Var), fd9.q0(1961933641, new tw(analysisToolInvocation, z, zy7Var2, 0), e18Var), e18Var, ((i5 >> 3) & 112) | 221568 | ((i5 >> 6) & 7168), 0);
            qi3Var2 = qi3Var3;
            iqbVar2 = iqbVar4;
            f4 = f5;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            qi3Var2 = qi3Var;
            f4 = f3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: uw
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kpk.a(analysisToolInvocation, z, zy7Var, zy7Var2, iqbVar2, f4, qi3Var2, (ld4) obj, x44.p0(i | 1), i2);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(String str, z4b z4bVar, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        str.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(405456036);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= e18Var.d(z4bVar == null ? -1 : z4bVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i4 = i2 | 24576;
        if (e18Var.Q(i4 & 1, (i4 & 9363) != 9362)) {
            r4g r4gVarS = gb9.S(u4g.G, null, null, zy7Var, e18Var, (i4 & 7168) | 6, 6);
            String strJ0 = d4c.j0(R.string.mcp_tools_set_all, e18Var);
            k4g k4gVar = k4g.a;
            fqb fqbVar = fqb.E;
            vkc.a(r4gVarS, strJ0, fqbVar, k4g.d(gm3.a(e18Var).n, e18Var, 14), false, false, null, null, null, fd9.q0(952980299, new yi7(str, i3), e18Var), null, null, fd9.q0(-2030284983, new wd((Object) z4bVar, bz7Var, (Object) r4gVarS, 8), e18Var), e18Var, 805306376 | ((i4 >> 6) & 896), 3072, 7664);
            e18Var = e18Var;
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk((Object) str, (Object) z4bVar, bz7Var, zy7Var, (Object) iqbVar2, i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8 A[PHI: r2
      0x00c8: PHI (r2v11 java.lang.String) = (r2v10 java.lang.String), (r2v12 java.lang.String) binds: [B:52:0x0104, B:42:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.anthropic.claude.api.mcp.McpTool r32, defpackage.z4b r33, defpackage.bz7 r34, defpackage.iqb r35, defpackage.ld4 r36, int r37) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpk.c(com.anthropic.claude.api.mcp.McpTool, z4b, bz7, iqb, ld4, int):void");
    }

    public static final void d(McpTool mcpTool, String str, String str2, z4b z4bVar, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        str2.getClass();
        z4bVar.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1777785542);
        int i2 = i | (e18Var.f(mcpTool) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.d(z4bVar.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var) ? 131072 : 65536) | 1572864;
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            r4g r4gVarS = gb9.S(u4g.G, null, null, zy7Var, e18Var, ((i2 >> 6) & 7168) | 6, 6);
            String strE = qok.e(mcpTool);
            k4g k4gVar = k4g.a;
            z3g z3gVarD = k4g.d(gm3.a(e18Var).n, e18Var, 14);
            ta4 ta4VarQ0 = fd9.q0(798326688, new ra7(str, str2, mcpTool, 15), e18Var);
            ta4 ta4VarQ02 = fd9.q0(2036892737, new kw(mcpTool, z4bVar, bz7Var, r4gVarS, 7), e18Var);
            iqbVar2 = fqb.E;
            vkc.a(r4gVarS, strE, iqbVar2, z3gVarD, false, false, null, null, ta4VarQ0, null, null, null, ta4VarQ02, e18Var, 100663688, 3072, 7920);
            e18Var = e18Var;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw(mcpTool, str, str2, z4bVar, bz7Var, zy7Var, iqbVar2, i);
        }
    }

    public static final void e(String str, String str2, String str3, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        str2.getClass();
        str3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1022741099);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.f(str3) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        int i3 = 1;
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            int i4 = i2 & 112;
            boolean z = ((i2 & 896) == 256) | (i4 == 32);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                xb0 xb0Var = new xb0();
                qvk.b(xb0Var, "serverIcon", str2.concat(" "));
                xb0Var.h(str3);
                objN = xb0Var.n();
                e18Var2.k0(objN);
            }
            zb0 zb0Var = (zb0) objN;
            cz5 cz5Var = (cz5) e18Var2.j(ve4.h);
            boolean zF = ((i2 & 14) == 4) | e18Var2.f(cz5Var) | (i4 == 32);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                objN2 = Collections.singletonMap("serverIcon", new t39(new f3d(cz5Var.r(32.0f), 7, cz5Var.r(24.0f)), new ta4(-847606224, true, new yr4(str, str2, i3))));
                objN2.getClass();
                e18Var2.k0(objN2);
            }
            Map map = (Map) objN2;
            int i5 = k4g.m;
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            tjh.c(zb0Var, fqbVar, 0L, 0L, 0L, null, 0L, i5, false, 2, 0, map, null, null, e18Var, 48, 24576, 438268);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(str, str2, str3, iqbVar2, i, 20);
        }
    }

    public static final void f(Throwable th, zy7 zy7Var) {
        j(th, zy7Var);
    }

    public static String g(h22 h22Var) {
        StringBuilder sb = new StringBuilder(h22Var.size());
        for (int i = 0; i < h22Var.size(); i++) {
            byte bA = h22Var.a(i);
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

    public static ooe h(qh9 qh9Var) {
        ArrayList arrayList;
        String strM;
        try {
            bh9 bh9VarS = qh9Var.s("type");
            int i = 0;
            if (bh9VarS != null && (strM = bh9VarS.m()) != null) {
                int[] iArrH = sq6.H(7);
                int length = iArrH.length;
                while (i < length) {
                    int i2 = iArrH[i];
                    if (grc.e(i2).equals(strM)) {
                        i = i2;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("model");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("brand");
            String strM4 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("architecture");
            String strM5 = bh9VarS5 != null ? bh9VarS5.m() : null;
            bh9 bh9VarS6 = qh9Var.s("locale");
            String strM6 = bh9VarS6 != null ? bh9VarS6.m() : null;
            bh9 bh9VarS7 = qh9Var.s("locales");
            if (bh9VarS7 != null) {
                ArrayList arrayList2 = bh9VarS7.e().E;
                arrayList = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((bh9) it.next()).m());
                }
            } else {
                arrayList = null;
            }
            bh9 bh9VarS8 = qh9Var.s("time_zone");
            String strM7 = bh9VarS8 != null ? bh9VarS8.m() : null;
            bh9 bh9VarS9 = qh9Var.s("battery_level");
            Number numberL = bh9VarS9 != null ? bh9VarS9.l() : null;
            bh9 bh9VarS10 = qh9Var.s("power_saving_mode");
            Boolean boolValueOf = bh9VarS10 != null ? Boolean.valueOf(bh9VarS10.a()) : null;
            bh9 bh9VarS11 = qh9Var.s("brightness_level");
            Number numberL2 = bh9VarS11 != null ? bh9VarS11.l() : null;
            bh9 bh9VarS12 = qh9Var.s("logical_cpu_count");
            Number numberL3 = bh9VarS12 != null ? bh9VarS12.l() : null;
            bh9 bh9VarS13 = qh9Var.s("total_ram");
            Number numberL4 = bh9VarS13 != null ? bh9VarS13.l() : null;
            bh9 bh9VarS14 = qh9Var.s("is_low_ram");
            return new ooe(i, strM2, strM3, strM4, strM5, strM6, arrayList, strM7, numberL, boolValueOf, numberL2, numberL3, numberL4, bh9VarS14 != null ? Boolean.valueOf(bh9VarS14.a()) : null);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Device", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Device", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Device", e4);
            return null;
        }
    }

    public static final String i(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < MTTypesetterKt.kLineSkipLimitMultiplier ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f3 = f2 * fPow;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        float f4 = i / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final boolean j(Throwable th, zy7 zy7Var) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = tc9.a;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = a5d.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = lm6.E;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            ad4 ad4Var = (ad4) zy7Var.a();
            if (ad4Var != null) {
                boolean z2 = ad4Var.b;
                List list = ad4Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((bd4) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                ad4Var.getClass();
                diagnosticComposeException = new DiagnosticComposeException(ad4Var);
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            mwa.p(th, diagnosticComposeException);
        }
        return z;
    }

    public static void k(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                mr9.h(grc.p(i2, "at index "));
                return;
            }
        }
    }
}
