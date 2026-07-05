package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.api.mcp.McpPrompt;
import com.anthropic.claude.api.mcp.McpPromptArgument;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.core.telemetry.SilentException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zok {
    public static final ta4 a = new ta4(1552953923, false, new tb4(7));

    public static final void a(List list, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, float f, ld4 ld4Var, int i) {
        iqb iqbVar2;
        float f2;
        list.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-280814541);
        int i2 = i | (e18Var.f(list) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | 27648;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 14) == 4;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (hashSet.add(((ArtifactMetadata) obj).getUuid().getValue())) {
                        arrayList.add(obj);
                    }
                }
                e18Var.k0(arrayList);
                objN = arrayList;
            }
            List list2 = (List) objN;
            float f3 = 12.0f;
            if (list2.size() != list.size()) {
                SilentException.a(new SilentException(vb7.q("Duplicate artifacts found in AllArtifactsBottomSheet: ", " total, ", list.size(), list2.size(), " distinct")), null, true, 1);
                r7e r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    r7eVarS.d = new du(list, bz7Var, zy7Var, f3, i);
                    return;
                }
                return;
            }
            r4g r4gVarS = gb9.S(null, null, null, zy7Var, e18Var, (i2 << 3) & 7168, 7);
            String strJ0 = d4c.j0(R.string.artifact_dialog_title, e18Var);
            boolean zH = e18Var.h(list2) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new du(list2, bz7Var, zy7Var, f3);
                e18Var.k0(objN2);
            }
            fqb fqbVar = fqb.E;
            e18Var = e18Var;
            ovj.a(r4gVarS, strJ0, fqbVar, null, false, false, null, null, null, null, null, null, null, (pz7) objN2, e18Var, 392, 0, 32760);
            iqbVar2 = fqbVar;
            f2 = 12.0f;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            f2 = f;
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            r7eVarS2.d = new eu(list, bz7Var, zy7Var, iqbVar2, f2, i, 0);
        }
    }

    public static final void b(y2b y2bVar, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(1944022372);
        int i2 = i | (e18Var3.f(y2bVar) ? 4 : 2) | (e18Var3.h(bz7Var) ? 32 : 16);
        if (e18Var3.Q(i2 & 1, (i2 & 147) != 146)) {
            q64 q64VarA = p64.a(new ho0(6.0f, true, new sz6(1)), lja.S, e18Var3, 6);
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, cd4.f, q64VarA);
            d4c.i0(e18Var3, cd4.e, hycVarL);
            d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var3, cd4.h);
            d4c.i0(e18Var3, cd4.d, iqbVarE);
            String strK0 = y2bVar.e;
            if (y2bVar.c) {
                e18Var3.a0(1354551839);
                strK0 = d4c.k0(R.string.mcp_prompt_template_argument_required, new Object[]{strK0}, e18Var3);
                e18Var3.p(false);
            } else {
                e18Var3.a0(1354655999);
                e18Var3.p(false);
            }
            String str = y2bVar.e;
            tkh tkhVar = ((jm3) gm3.c(e18Var3).e.E).g;
            boolean zF = e18Var3.f(strK0);
            Object objN = e18Var3.N();
            if (zF || objN == jd4.a) {
                objN = new cm5(strK0, 12);
                e18Var3.k0(objN);
            }
            fqb fqbVar = fqb.E;
            String str2 = strK0;
            tjh.b(str, tjf.a(fqbVar, (bz7) objN), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var3, 0, 0, 131068);
            if (y2bVar.b != null) {
                e18Var3.a0(821301949);
                e18Var2 = e18Var3;
                tjh.b(y2bVar.f, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 5, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 24960, 110586);
                e18Var2.p(false);
            } else {
                e18Var3.a0(821568456);
                e18Var3.p(false);
                e18Var2 = e18Var3;
            }
            e18 e18Var4 = e18Var2;
            mwa.b(y2bVar.d, bz7Var, str2, b.c(fqbVar, 1.0f), false, false, null, ((jm3) gm3.c(e18Var2).e.E).g, null, null, null, null, null, null, true, 0, 0, 0L, null, e18Var4, (i2 & 112) | 100666368, 1572864, 2031216);
            e18Var = e18Var4;
            e18Var.p(true);
        } else {
            e18Var = e18Var3;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ra7(y2bVar, i, bz7Var, iqbVar, 14);
        }
    }

    public static final void c(final f03 f03Var, final t4g t4gVar, final McpPrompt mcpPrompt, final i4g i4gVar, ld4 ld4Var, final int i) {
        int i2;
        List<McpPromptArgument> list;
        Object c3bVar;
        Boolean bool;
        final f03 f03Var2 = f03Var;
        i4gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1734232548);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(f03Var2) : e18Var.h(f03Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(t4gVar) : e18Var.h(t4gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(mcpPrompt) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(i4gVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            tp4 tp4Var = null;
            List<McpPromptArgument> arguments = mcpPrompt != null ? mcpPrompt.getArguments() : null;
            int i4 = 3;
            lz1 lz1Var = jd4.a;
            if (mcpPrompt == null || (list = arguments) == null || list.isEmpty()) {
                e18Var.a0(360539856);
                boolean z = (i3 & 112) == 32 || ((i3 & 64) != 0 && e18Var.h(t4gVar));
                Object objN = e18Var.N();
                if (z || objN == lz1Var) {
                    objN = new zd(t4gVar, tp4Var, i4);
                    e18Var.k0(objN);
                }
                fd9.i(e18Var, (pz7) objN, iei.a);
                e18Var.p(false);
                r7e r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i5 = 0;
                    r7eVarS.d = new pz7() { // from class: b3b
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            iei ieiVar = iei.a;
                            int i7 = i;
                            switch (i6) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(i7 | 1);
                                    zok.c(f03Var2, t4gVar, mcpPrompt, i4gVar, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(i7 | 1);
                                    zok.c(f03Var2, t4gVar, mcpPrompt, i4gVar, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    return;
                }
                return;
            }
            e18Var.a0(360707070);
            e18Var.p(false);
            boolean zR = x44.r((McpPrompt) f03Var2.w.getValue(), mcpPrompt);
            Boolean boolValueOf = Boolean.valueOf(zR);
            int i6 = i3 & 14;
            boolean zG = e18Var.g(zR) | e18Var.h(arguments) | (i6 == 4 || ((i3 & 8) != 0 && e18Var.h(f03Var2))) | ((i3 & 896) == 256);
            Object objN2 = e18Var.N();
            if (zG || objN2 == lz1Var) {
                bool = boolValueOf;
                c3bVar = new c3b(zR, arguments, f03Var, mcpPrompt, null);
                f03Var2 = f03Var;
                e18Var.k0(c3bVar);
            } else {
                c3bVar = objN2;
                bool = boolValueOf;
            }
            fd9.i(e18Var, (pz7) c3bVar, bool);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = arguments.iterator();
            while (it.hasNext()) {
                y2b y2bVar = (y2b) f03Var2.x.get(((McpPromptArgument) it.next()).getName());
                if (y2bVar != null) {
                    arrayList.add(y2bVar);
                }
            }
            boolean z2 = i6 == 4 || ((i3 & 8) != 0 && e18Var.h(f03Var2));
            Object objN3 = e18Var.N();
            if (z2 || objN3 == lz1Var) {
                objN3 = new ska(5, f03Var2);
                e18Var.k0(objN3);
            }
            d(arrayList, (pz7) objN3, i4gVar, e18Var, (i3 >> 3) & 896);
        } else {
            e18Var.T();
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            final int i7 = 1;
            r7eVarS2.d = new pz7() { // from class: b3b
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i7;
                    iei ieiVar = iei.a;
                    int i72 = i;
                    switch (i62) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(i72 | 1);
                            zok.c(f03Var, t4gVar, mcpPrompt, i4gVar, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(i72 | 1);
                            zok.c(f03Var, t4gVar, mcpPrompt, i4gVar, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
        }
    }

    public static final void d(ArrayList arrayList, pz7 pz7Var, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1253109066);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(arrayList) : e18Var.h(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(pz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(i4gVar) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && e18Var.h(arrayList))) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new ny4(arrayList, i4gVar, pz7Var, 23);
                e18Var.k0(objN);
            }
            knk.h(null, null, null, false, null, null, null, false, null, (bz7) objN, e18Var, 0, 511);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(arrayList, i, pz7Var, i4gVar, 14);
        }
    }

    public static final iqb e(iqb iqbVar, sih sihVar, l45 l45Var) {
        return uwj.b(iqbVar, new ufe(sihVar, 25, l45Var));
    }

    public static k08 f(c08 c08Var, boolean z) {
        String lowerCase;
        c08Var.getClass();
        List list = c08Var.O;
        k08 k08Var = new k08(c08Var, null, 1, z);
        l6e l6eVarJ0 = c08Var.j0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((qai) obj).z() != 2) {
                break;
            }
            arrayList.add(obj);
        }
        c19 c19VarU1 = w44.u1(arrayList);
        ArrayList arrayList2 = new ArrayList(x44.y(c19VarU1, 10));
        Iterator it = c19VarU1.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!((Iterator) f2Var.G).hasNext()) {
                j7g j7gVarW = ((qai) w44.U0(list)).W();
                p06 p06Var = q06.e;
                lm6 lm6Var = lm6.E;
                k08Var.S0(null, l6eVarJ0, lm6Var, lm6Var, arrayList2, j7gVarW, 4, p06Var);
                k08 k08Var2 = k08Var;
                k08Var2.a0 = true;
                return k08Var2;
            }
            b19 b19Var = (b19) f2Var.next();
            int i = b19Var.a;
            qai qaiVar = (qai) b19Var.b;
            String strB = qaiVar.getName().b();
            strB.getClass();
            if (strB.equals("T")) {
                lowerCase = "instance";
            } else if (strB.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            k08 k08Var3 = k08Var;
            vc0 vc0Var = dd8.F;
            sxb sxbVarE = sxb.e(lowerCase);
            j7g j7gVarW2 = qaiVar.W();
            j7gVarW2.getClass();
            arrayList2.add(new eri(k08Var3, null, i, vc0Var, sxbVarE, j7gVarW2, false, false, false, null, neg.n));
            k08Var = k08Var3;
        }
    }

    public static joe g(qh9 qh9Var) {
        try {
            koe koeVarJ = cpk.j(qh9Var.s("view").g());
            String strM = qh9Var.s("source").m();
            strM.getClass();
            for (int i : sq6.H(11)) {
                if (grc.h(i).equals(strM)) {
                    return new joe(koeVarJ, i);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Container", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Container", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Container", e3);
            return null;
        }
    }

    public static void h(int i, int i2) {
        String strJ;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strJ = dpk.j("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    sz6.p(grc.p(i2, "negative size: "));
                    return;
                }
                strJ = dpk.j("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static void i(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? j(i, i3, "start index") : (i2 < 0 || i2 > i3) ? j(i2, i3, "end index") : dpk.j("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String j(int i, int i2, String str) {
        if (i < 0) {
            return dpk.j("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return dpk.j("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        sz6.p(grc.p(i2, "negative size: "));
        return null;
    }
}
