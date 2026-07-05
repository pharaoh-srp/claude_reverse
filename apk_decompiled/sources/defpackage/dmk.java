package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.design.icon.a;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dmk {
    public static final ta4 a = new ta4(2122376532, false, new rb4(20));
    public static final ta4 b = new ta4(-1445724633, false, new sb4(3));
    public static final ta4 c = new ta4(2031011030, false, new rb4(21));
    public static final ta4 d = new ta4(-1919128104, false, new rb4(22));
    public static final ta4 e = new ta4(719732957, false, new sb4(4));

    public static final void a(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-757717359);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            vo1 vo1Var = lja.T;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            iqb iqbVarL = gb9.L(iqbVar, 72.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            bpc bpcVarA = a.a(ud0.H, e18Var);
            long j = gm3.a(e18Var).O;
            fqb fqbVar = fqb.E;
            cv8.b(bpcVarA, null, gb9.N(b.o(fqbVar, 40.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), j, e18Var, 440, 0);
            tjh.b(d4c.j0(R.string.code_project_empty_title, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 0, 0, 130042);
            tjh.b(d4c.j0(R.string.code_project_empty_subtitle, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 130042);
            dtj.a(gid.p(8.0f, R.string.code_project_new_thread, e18Var, e18Var, fqbVar), null, false, null, f12.a, y02.a, 0L, zy7Var, e18Var, ((i3 << 21) & 29360128) | 221184, 78);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(zy7Var, iqbVar, i, 6);
        }
    }

    public static final void b(dc1 dc1Var, i4g i4gVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        Object obj;
        i4gVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1081312899);
        int i3 = e18Var2.S ? -e18Var2.I.v : e18Var2.G.i;
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(dc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(i4gVar) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(ttj.m(b.c(fqbVar, 1.0f), i4gVar), 20.0f, 12.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
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
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            e18Var2.a0(-364587455);
            if (dc1Var == null) {
                e18Var2.a0(-364603297);
                tjh.b(d4c.j0(R.string.ccr_workflow_detail_unavailable, e18Var2), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131066);
                e18Var2.v(i3);
                r7e r7eVarS = e18Var2.s();
                if (r7eVarS != null) {
                    r7eVarS.d = new fnh(dc1Var, i4gVar, i);
                    return;
                }
                return;
            }
            e18Var2.a0(-364361125);
            e18Var2.p(false);
            String str = dc1Var.e;
            if (str == null) {
                str = dc1Var.d;
            }
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).h;
            long j = gm3.a(e18Var2).M;
            String str2 = str;
            fqb fqbVar2 = fqbVar;
            tjh.b(str2, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var2, 0, 0, 131066);
            e18 e18Var3 = e18Var2;
            aij aijVarH = gmk.h(dc1Var.h, dc1Var.f.a());
            if (aijVarH != null) {
                thj thjVar = aijVarH.a;
                sq6.A(8.0f, -364005028, e18Var3, e18Var3, fqbVar2);
                tjh.b(d4c.k0(R.string.ccr_workflow_detail_counts, new Object[]{Integer.valueOf(thjVar.a), Integer.valueOf(thjVar.b), Integer.valueOf(thjVar.d), Integer.valueOf(thjVar.a())}, e18Var3), null, gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 0, 0, 131066);
                e18Var3 = e18Var3;
                e18Var3.p(false);
            } else {
                e18Var3.a0(-363544709);
                e18Var3.p(false);
            }
            e18 e18Var4 = e18Var3;
            tjh.b(gid.p(16.0f, R.string.ccr_workflow_detail_placeholder, e18Var3, e18Var3, fqbVar2), null, gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var4, 0, 0, 131066);
            e18Var = e18Var4;
            e18Var.p(false);
            e18Var.p(true);
            obj = fqbVar2;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            obj = iqbVar;
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            r7eVarS2.d = new c3g(dc1Var, i, i4gVar, obj, 9);
        }
    }

    public static final pvg c(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 107876) {
            if (iHashCode != 111277) {
                if (iHashCode == 3151468 && lowerCase.equals("free")) {
                    return pvg.FREE;
                }
            } else if (lowerCase.equals("pro")) {
                return pvg.PRO;
            }
        } else if (lowerCase.equals("max")) {
            return pvg.MAX;
        }
        SilentException.a(new SilentException("Unknown subscription tier string: ".concat(str)), null, false, 3);
        return null;
    }

    public static dge d(gg8 gg8Var) {
        Object hreVar;
        if (!dge.h) {
            return null;
        }
        try {
            hreVar = new dge(gg8Var);
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (jre.a(hreVar) != null) {
            dge.h = false;
        }
        return (dge) (hreVar instanceof hre ? null : hreVar);
    }

    public static final pk7 e(long j) {
        return new pk7(d4c.n0(j));
    }

    public static final sch f(double d2) {
        return new sch(d2);
    }

    public static ColorStateList g(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListK;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListK = x44.K(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListK;
    }
}
