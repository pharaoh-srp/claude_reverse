package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.experience.Experience;
import com.anthropic.claude.api.experience.ExperienceConfig;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class akk {
    public static final ta4 a = new ta4(-2039040721, false, new ob4(23));
    public static final ta4 b = new ta4(2088839704, false, new ob4(24));

    public static final void a(int i, String str, String str2, iqb iqbVar, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1827274638);
        int i3 = i2 | (e18Var.d(i) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            t tVarI = hkk.i(i, str2, str, e18Var, ((i3 << 3) & 896) | (i3 & 14) | ((i3 >> 3) & 112));
            q64 q64VarA = p64.a(new ho0(24.0f, true, new sz6(1)), lja.T, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            tjh.b(k7e.d(tVarI.a), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkh.b(((jm3) gm3.c(e18Var).e.E).e, 0L, eve.B(64), null, null, null, 0L, null, 0, 0L, null, 0, 16777213), e18Var, 0, 0, 131066);
            e18Var = e18Var;
            xo1 xo1Var = lja.K;
            iqb iqbVarO = b.o(fqbVar, 56.0f);
            long j = gm3.a(e18Var).M;
            vve vveVar = xve.a;
            iqb iqbVarC = androidx.compose.foundation.b.c(xn5.V(yfd.p(iqbVarO, j, vveVar), vveVar), false, null, null, null, (zy7) tVarI.c, 15);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarC);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            boolean z = tVarI.b;
            iv1.b(z ? ud0.t1 : ud0.Y0, d4c.j0(z ? R.string.recipe_stop_timer : R.string.recipe_start_timer, e18Var), null, null, gm3.a(e18Var).n, e18Var, 0, 12);
            e18Var.p(true);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t6e(i, str, str2, iqbVar2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final com.anthropic.claude.tool.model.RecipeDisplayV0Input r18, final float r19, final defpackage.v5b r20, final defpackage.bz7 r21, final defpackage.zy7 r22, defpackage.iqb r23, java.lang.String r24, defpackage.ld4 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akk.b(com.anthropic.claude.tool.model.RecipeDisplayV0Input, float, v5b, bz7, zy7, iqb, java.lang.String, ld4, int, int):void");
    }

    public static final void c(String str, String str2, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-234142663);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var = e18Var2;
            pzg.a(b.v(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 370.0f, 1), gm3.b(e18Var2).g, gm3.a(e18Var2).n, gm3.a(e18Var2).M, MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f, sf5.a(0.5f, gm3.a(e18Var2).u), fd9.q0(-62982082, new q1j(str2, zy7Var, str, zy7Var2), e18Var2), e18Var, 12779520, 16);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new w4d(str, str2, zy7Var, zy7Var2, iqbVar, i);
        }
    }

    public static ce3 d(long j, long j2, long j3, ld4 ld4Var, int i) {
        long j4 = (i & 4) != 0 ? d54.h : j3;
        long j5 = d54.h;
        ce3 ce3VarI = i(((gwa) ((e18) ld4Var).j(jwa.a)).a);
        long j6 = d54.g;
        return ce3VarI.b(j4, j6, j, j6, j5, j6, j5, j, j2, j5, j5, j5, j4);
    }

    public static final boolean e(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return x44.r(bsg.k1(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final String f(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? csg.I(w44.S0(collection, ",\n", "\n", "\n", null, 56), "    ").concat("},") : " }";
    }

    public static xla g(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("id");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("email");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("anonymous_id");
            String strM4 = bh9VarS4 != null ? bh9VarS4.m() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), xla.f)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            return new xla(strM, strM2, strM3, strM4, linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Usr", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Usr", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Usr", e3);
            return null;
        }
    }

    public static final boolean h(Experience experience) {
        experience.getClass();
        ExperienceConfig config = experience.getConfig();
        if (config != null) {
            return x44.r(config.getBypass_global_rules(), Boolean.TRUE);
        }
        return false;
    }

    public static ce3 i(n54 n54Var) {
        ce3 ce3Var = n54Var.d0;
        if (ce3Var != null) {
            return ce3Var;
        }
        long jC = p54.c(n54Var, ge3.e);
        long j = d54.g;
        long jC2 = p54.c(n54Var, ge3.d);
        o54 o54Var = ge3.a;
        long jC3 = p54.c(n54Var, o54Var);
        o54 o54Var2 = ge3.b;
        long jC4 = p54.c(n54Var, o54Var2);
        float f = ge3.c;
        ce3 ce3Var2 = new ce3(jC, j, jC3, j, d54.b(f, jC4), j, d54.b(f, p54.c(n54Var, o54Var2)), p54.c(n54Var, o54Var), p54.c(n54Var, ge3.i), d54.b(f, p54.c(n54Var, o54Var2)), d54.b(ge3.g, p54.c(n54Var, ge3.h)), d54.b(f, p54.c(n54Var, o54Var2)), jC2);
        n54Var.d0 = ce3Var2;
        return ce3Var2;
    }

    public static l5 j() {
        if (l5.g == null) {
            l5.g = new l5(2);
        }
        l5 l5Var = l5.g;
        l5Var.getClass();
        return l5Var;
    }

    public static final String k(Collection collection) {
        return csg.I(w44.S0(collection, ",", null, null, null, 62), "    ").concat(csg.I(" }", "    "));
    }

    public static final String l(Collection collection) {
        return csg.I(w44.S0(collection, ",", null, null, null, 62), "    ").concat(csg.I("},", "    "));
    }
}
