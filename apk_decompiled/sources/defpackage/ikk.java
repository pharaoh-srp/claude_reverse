package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.api.tasks.TaskStatus;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.tool.model.RecipeDisplayV0InputStepsItem;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ikk {
    public static final ta4 a = new ta4(562049989, false, new pb4(0));

    public static final void a(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(69604369);
        int i2 = i | 6;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            String strJ0 = d4c.j0(R.string.caps_badge_experimental, e18Var);
            long j = gm3.a(e18Var).A;
            long j2 = gm3.a(e18Var).x;
            fqb fqbVar = fqb.E;
            me7.a(strJ0, fqbVar, j, j2, null, null, null, null, e18Var, 48, 240);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 18, iqbVar);
        }
    }

    public static final void b(int i, long j, long j2, ud0 ud0Var, ld4 ld4Var, iqb iqbVar) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-793743954);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(ud0Var) : e18Var.h(ud0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.e(j2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarP = yfd.p(b.o(iqbVar, 24.0f), j2, xve.a);
            o5b o5bVarD = dw1.d(xo1Var, false);
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ud0 ud0Var2 = ud0.d;
            cv8.b(a.a(ud0Var, e18Var), null, b.o(fqb.E, 14.0f), j, e18Var, 440 | ((i2 << 6) & 7168), 0);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new oyb(i, j, j2, ud0Var, iqbVar);
        }
    }

    public static final void c(m4a m4aVar, bz7 bz7Var, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1868327245);
        int i2 = (e18Var.h(m4aVar) ? 4 : 2) | i | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = ((i2 & 112) == 32) | e18Var.h(m4aVar) | ((i2 & 896) == 256);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new l6(m4aVar, bz7Var, zy7Var, i3);
                e18Var.k0(objN);
            }
            fd9.d(m4aVar, (bz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(m4aVar, i, bz7Var, zy7Var, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean, int] */
    public static final void d(final RecipeDisplayV0InputStepsItem recipeDisplayV0InputStepsItem, int i, final boolean z, final zy7 zy7Var, List list, float f, final v5b v5bVar, final String str, iqb iqbVar, ld4 ld4Var, final int i2) {
        int i3;
        float f2;
        final int i4;
        List list2;
        iqb iqbVar2;
        e18 e18Var;
        bx bxVar;
        z80 z80Var;
        iqb iqbVarT;
        int i5;
        zy7 zy7Var2;
        fqb fqbVar;
        z80 z80Var2;
        ?? r2;
        e18 e18Var2;
        boolean z2;
        long j;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(1339038896);
        if ((i2 & 6) == 0) {
            i3 = (e18Var3.f(recipeDisplayV0InputStepsItem) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var3.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var3.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var3.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? e18Var3.f(list) : e18Var3.h(list) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            i3 |= e18Var3.c(f) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= e18Var3.d(v5bVar.ordinal()) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= e18Var3.f(str) ? 8388608 : 4194304;
        }
        int i6 = i3 | 100663296;
        if (e18Var3.Q(i6 & 1, (38347923 & i6) != 38347922)) {
            final Context context = (Context) e18Var3.j(w00.b);
            fqb fqbVar2 = fqb.E;
            iqb iqbVarC = b.c(fqbVar2, 1.0f);
            cxe cxeVarA = axe.a(new ho0(12.0f, true, new sz6(1)), lja.P, e18Var3, 6);
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVarC);
            dd4.e.getClass();
            zy7 zy7Var3 = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(zy7Var3);
            } else {
                e18Var3.n0();
            }
            z80 z80Var3 = cd4.f;
            d4c.i0(e18Var3, z80Var3, cxeVarA);
            z80 z80Var4 = cd4.e;
            d4c.i0(e18Var3, z80Var4, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var5 = cd4.g;
            d4c.i0(e18Var3, z80Var5, numValueOf);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var3, bxVar2);
            z80 z80Var6 = cd4.d;
            d4c.i0(e18Var3, z80Var6, iqbVarE);
            iqb iqbVarO = b.o(fqbVar2, 28.0f);
            vve vveVar = xve.a;
            iqb iqbVarV = xn5.V(iqbVarO, vveVar);
            if (z) {
                e18Var3.a0(-829071913);
                bxVar = bxVar2;
                z80Var = z80Var5;
                iqbVarT = yfd.p(fqbVar2, gm3.a(e18Var3).M, zni.b);
                e18Var3.p(false);
            } else {
                bxVar = bxVar2;
                z80Var = z80Var5;
                e18Var3.a0(-828967722);
                iqbVarT = ez1.t(fqbVar2, 0.5f, gm3.a(e18Var3).u, vveVar);
                e18Var3.p(false);
            }
            iqb iqbVarB = iqbVarV.B(iqbVarT);
            vue vueVar = new vue(1);
            int i7 = i6 & 7168;
            boolean z3 = i7 == 2048;
            Object objN = e18Var3.N();
            Object obj = jd4.a;
            if (z3 || objN == obj) {
                objN = new kl1(21, zy7Var);
                e18Var3.k0(objN);
            }
            iqb iqbVarC2 = androidx.compose.foundation.b.c(iqbVarB, false, null, vueVar, null, (zy7) objN, 11);
            boolean zH = ((i6 & 112) == 32) | ((i6 & 896) == 256) | e18Var3.h(context);
            Object objN2 = e18Var3.N();
            if (zH || objN2 == obj) {
                i4 = i;
                objN2 = new bz7() { // from class: i7e
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj2) {
                        String string;
                        ekf ekfVar = (ekf) obj2;
                        ekfVar.getClass();
                        boolean z4 = z;
                        Context context2 = context;
                        int i8 = i4;
                        if (z4) {
                            string = context2.getString(R.string.recipe_step_completed, Integer.valueOf(i8));
                            string.getClass();
                        } else {
                            string = context2.getString(R.string.recipe_step_toggle, Integer.valueOf(i8));
                            string.getClass();
                        }
                        ckf.l(ekfVar, string);
                        return iei.a;
                    }
                };
                e18Var3.k0(objN2);
            } else {
                i4 = i;
            }
            iqb iqbVarB2 = tjf.b(iqbVarC2, false, (bz7) objN2);
            o5b o5bVarD = dw1.d(lja.K, false);
            int iHashCode2 = Long.hashCode(e18Var3.T);
            hyc hycVarL2 = e18Var3.l();
            iqb iqbVarE2 = kxk.E(e18Var3, iqbVarB2);
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(zy7Var3);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, z80Var3, o5bVarD);
            d4c.i0(e18Var3, z80Var4, hycVarL2);
            z80 z80Var7 = z80Var;
            bx bxVar3 = bxVar;
            ij0.t(iHashCode2, e18Var3, z80Var7, e18Var3, bxVar3);
            d4c.i0(e18Var3, z80Var6, iqbVarE2);
            if (z) {
                e18Var3.a0(-1644160301);
                bpc bpcVarA = a.a(ud0.L, e18Var3);
                long j2 = gm3.a(e18Var3).n;
                i5 = i6;
                fqbVar = fqbVar2;
                z80Var2 = z80Var3;
                r2 = 1;
                zy7Var2 = zy7Var3;
                cv8.b(bpcVarA, null, b.o(fqbVar2, 14.0f), j2, e18Var3, 440, 0);
                e18 e18Var4 = e18Var3;
                e18Var4.p(false);
                e18Var2 = e18Var4;
            } else {
                i5 = i6;
                zy7Var2 = zy7Var3;
                fqbVar = fqbVar2;
                z80Var2 = z80Var3;
                r2 = 1;
                e18Var3.a0(-1643892647);
                tjh.b(String.valueOf(i4), null, gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 0, 0, 131066);
                e18 e18Var5 = e18Var3;
                e18Var5.p(false);
                e18Var2 = e18Var5;
            }
            e18Var2.p(r2);
            hw9 hw9Var = new hw9(1.0f, r2);
            q64 q64VarA = p64.a(new ho0(8.0f, r2, new sz6(r2)), lja.S, e18Var2, 6);
            int iHashCode3 = Long.hashCode(e18Var2.T);
            hyc hycVarL3 = e18Var2.l();
            iqb iqbVarE3 = kxk.E(e18Var2, hw9Var);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(zy7Var2);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var2, q64VarA);
            d4c.i0(e18Var2, z80Var4, hycVarL3);
            ij0.t(iHashCode3, e18Var2, z80Var7, e18Var2, bxVar3);
            d4c.i0(e18Var2, z80Var6, iqbVarE3);
            e18Var2.a0(-1483011078);
            list2 = list;
            f2 = f;
            String strC = k7e.c(recipeDisplayV0InputStepsItem.getContent(), list2, f2, v5bVar);
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).g;
            if (z) {
                e18Var2.a0(1002379516);
                j = gm3.a(e18Var2).O;
                z2 = false;
            } else {
                z2 = false;
                e18Var2.a0(1002380540);
                j = gm3.a(e18Var2).M;
            }
            e18Var2.p(z2);
            long j3 = j;
            qeh qehVar = z ? qeh.d : null;
            iqb iqbVarC3 = b.c(fqbVar, 1.0f);
            boolean z4 = z2;
            vue vueVar2 = new vue(1);
            boolean z5 = i7 == 2048 ? true : z4;
            Object objN3 = e18Var2.N();
            int i8 = 15;
            if (z5 || objN3 == obj) {
                objN3 = new kw0(i8, zy7Var);
                e18Var2.k0(objN3);
            }
            iqbVar2 = fqbVar;
            e18 e18Var6 = e18Var2;
            tjh.b(strC, kzj.h(iqbVarC3, z, false, vueVar2, (bz7) objN3, 10), j3, 0L, null, null, null, 0L, qehVar, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var6, 0, 0, 130552);
            e18 e18Var7 = e18Var6;
            e18Var7.p(false);
            Integer timer_seconds = recipeDisplayV0InputStepsItem.getTimer_seconds();
            if (timer_seconds == null) {
                e18Var7.a0(1272305145);
                e18Var7.p(false);
            } else {
                e18Var7.a0(1272305146);
                int iIntValue = timer_seconds.intValue();
                if (iIntValue > 0) {
                    e18Var7.a0(-2119692402);
                    String title = recipeDisplayV0InputStepsItem.getTitle();
                    if (title == null) {
                        e18Var7.a0(-1869490365);
                        title = d4c.k0(R.string.recipe_step_number, new Object[]{Integer.valueOf(i4)}, e18Var7);
                    } else {
                        e18Var7.a0(-1869491543);
                    }
                    e18Var7.p(false);
                    hkk.b(iIntValue, title, str, null, e18Var7, (i5 >> 15) & 896);
                    e18Var7.p(false);
                } else {
                    e18Var7.a0(-2119346442);
                    e18Var7.p(false);
                }
                e18Var7.p(false);
            }
            e18Var7.p(true);
            e18Var7.p(true);
            e18Var = e18Var7;
        } else {
            e18 e18Var8 = e18Var3;
            f2 = f;
            i4 = i;
            list2 = list;
            e18Var8.T();
            iqbVar2 = iqbVar;
            e18Var = e18Var8;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final List list3 = list2;
            final int i9 = i4;
            final float f3 = f2;
            final iqb iqbVar3 = iqbVar2;
            r7eVarS.d = new pz7() { // from class: j7e
                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ikk.d(recipeDisplayV0InputStepsItem, i9, z, zy7Var, list3, f3, v5bVar, str, iqbVar3, (ld4) obj2, x44.p0(i2 | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void e(final List list, final List list2, final float f, final v5b v5bVar, Set set, bz7 bz7Var, final String str, iqb iqbVar, ld4 ld4Var, final int i) {
        e18 e18Var;
        Set set2;
        final iqb iqbVar2;
        final bz7 bz7Var2 = bz7Var;
        list.getClass();
        v5bVar.getClass();
        set.getClass();
        bz7Var2.getClass();
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(880720169);
        int i2 = i | (e18Var2.f(list) ? 4 : 2) | (e18Var2.f(list2) ? 32 : 16) | (e18Var2.c(f) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.d(v5bVar.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.f(set) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.h(bz7Var2) ? 131072 : 65536) | (e18Var2.f(str) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | 12582912;
        if (e18Var2.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            String upperCase = d4c.j0(R.string.recipe_steps, e18Var2).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            tjh.b(upperCase, null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
            e18Var = e18Var2;
            int i3 = 6;
            q64 q64VarA2 = p64.a(new ho0(12.0f, true, new sz6(1)), vo1Var, e18Var, 6);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            fqb fqbVar2 = fqbVar;
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar2);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            e18Var.a0(-248087931);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    x44.n0();
                    throw null;
                }
                RecipeDisplayV0InputStepsItem recipeDisplayV0InputStepsItem = (RecipeDisplayV0InputStepsItem) obj;
                String id = recipeDisplayV0InputStepsItem.getId();
                boolean zContains = set.contains(id);
                boolean zF = ((i2 & 458752) == 131072) | e18Var.f(id);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new qn(bz7Var, id, i3);
                    e18Var.k0(objN);
                }
                e18 e18Var3 = e18Var;
                d(recipeDisplayV0InputStepsItem, i5, zContains, (zy7) objN, list2, f, v5bVar, str, null, e18Var3, ((i2 << 9) & 4186112) | ((i2 << 3) & 29360128));
                i4 = i5;
                e18Var = e18Var3;
                i3 = i3;
                fqbVar2 = fqbVar2;
            }
            set2 = set;
            bz7Var2 = bz7Var;
            ij0.w(e18Var, false, true, true);
            iqbVar2 = fqbVar2;
        } else {
            e18Var = e18Var2;
            set2 = set;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final Set set3 = set2;
            r7eVarS.d = new pz7(list, list2, f, v5bVar, set3, bz7Var2, str, iqbVar2, i) { // from class: h7e
                public final /* synthetic */ List E;
                public final /* synthetic */ List F;
                public final /* synthetic */ float G;
                public final /* synthetic */ v5b H;
                public final /* synthetic */ Set I;
                public final /* synthetic */ bz7 J;
                public final /* synthetic */ String K;
                public final /* synthetic */ iqb L;

                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP0 = x44.p0(1);
                    ikk.e(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj2, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void f(TaskStatus taskStatus, iqb iqbVar, ld4 ld4Var, int i) {
        taskStatus.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(604775948);
        int i2 = (e18Var.d(taskStatus.ordinal()) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            int i3 = h8h.a[taskStatus.ordinal()];
            fqb fqbVar = fqb.E;
            switch (i3) {
                case 1:
                    e18Var.a0(-507259920);
                    b(3072, gm3.a(e18Var).Q, d54.b(0.1f, gm3.a(e18Var).Q), ud0.x0, e18Var, fqbVar);
                    e18Var.p(false);
                    break;
                case 2:
                    e18Var.a0(-506966350);
                    b(3072, gm3.a(e18Var).k, gm3.a(e18Var).m, ud0.L, e18Var, fqbVar);
                    e18Var.p(false);
                    break;
                case 3:
                case 4:
                    e18Var.a0(-506657528);
                    b(3072, gm3.a(e18Var).y, gm3.a(e18Var).A, ud0.M1, e18Var, fqbVar);
                    e18Var.p(false);
                    break;
                case 5:
                case 6:
                case 7:
                    e18Var.a0(-507364421);
                    g(MTTypesetterKt.kLineSkipLimitMultiplier, 6, e18Var, fqbVar);
                    e18Var.p(false);
                    break;
                default:
                    throw ebh.u(e18Var, 1369104984, false);
            }
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ufe(taskStatus, iqbVar, i, 16);
        }
    }

    public static final void g(float f, int i, ld4 ld4Var, iqb iqbVar) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-874398467);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            long j = gm3.a(e18Var).m;
            long j2 = gm3.a(e18Var).k;
            f = 24.0f;
            iqb iqbVarO = b.o(iqbVar, 24.0f);
            boolean zE = e18Var.e(j) | e18Var.e(j2);
            Object objN = e18Var.N();
            if (zE || objN == jd4.a) {
                np npVar = new np(j, 2, j2);
                e18Var.k0(npVar);
                objN = npVar;
            }
            v40.a(0, e18Var, (bz7) objN, iqbVarO);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new imb(iqbVar, f, i, i4);
        }
    }

    public static final void h(String str, String str2, boolean z, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1800839291);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarI = gb9.I(j8.e0(b.c(fqbVar, 1.0f), z, false, new vue(3), zy7Var, 10), m5j.b);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarI);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            hw9 hw9VarN = kgh.n(e18Var2, iqbVarE, z80Var4, 1.0f, true);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, hw9VarN);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, q64VarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            tjh.b(str, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, i2 & 14, 0, 131066);
            kxk.g(e18Var2, b.e(fqbVar, 2.0f));
            tjh.b(str2, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, (i2 >> 3) & 14, 0, 131066);
            e18Var = e18Var2;
            e18Var.p(true);
            if (z) {
                e18Var.a0(358234218);
                iqbVar2 = fqbVar;
                cv8.b(a.a(ud0.L, e18Var), null, b.o(iqbVar2, 20.0f), gm3.a(e18Var).M, e18Var, 440, 0);
                e18Var.p(false);
            } else {
                iqbVar2 = fqbVar;
                e18Var.a0(358491115);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new veb(str, str2, z, zy7Var, iqbVar2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(java.lang.String r24, java.lang.Object r25, java.util.List r26, defpackage.rz7 r27, defpackage.bz7 r28, defpackage.iqb r29, defpackage.pz7 r30, defpackage.ld4 r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikk.i(java.lang.String, java.lang.Object, java.util.List, rz7, bz7, iqb, pz7, ld4, int, int):void");
    }

    public static final void j(String str, String str2, boolean z, bz7 bz7Var, iqb iqbVar, boolean z2, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        boolean z3;
        str.getClass();
        str2.getClass();
        bz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(190737053);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 221184;
        if (e18Var2.Q(i2 & 1, (74899 & i2) != 74898)) {
            qnc qncVar = m5j.b;
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            ybi.b(null, fd9.q0(1523839637, new ngf(str, 18), e18Var2), kzj.h(b.c(fqbVar, 1.0f), z, true, new vue(2), bz7Var, 8), fd9.q0(-399410793, new ngf(str2, 19), e18Var2), fd9.q0(-1361036008, new tp(z, 14), e18Var2), 0L, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var, 1600566, 0, 16288);
            iqbVar2 = fqbVar;
            z3 = true;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            z3 = z2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kv2(str, str2, z, bz7Var, iqbVar2, z3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object k(defpackage.uma r10, defpackage.bna r11, int r12, defpackage.ana r13, defpackage.xzg r14, int r15) {
        /*
            int r2 = r10.f()
            lsc r0 = r10.H
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
            lsc r0 = r10.J
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r5 = r0.floatValue()
            r0 = r15 & 32
            if (r0 == 0) goto L28
            lsc r13 = r10.I
            java.lang.Object r13 = r13.getValue()
            ana r13 = (defpackage.ana) r13
        L28:
            r6 = r13
            r13 = r15 & 64
            r15 = 0
            if (r13 == 0) goto L46
            int r13 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r13 >= 0) goto L35
            if (r11 != 0) goto L35
            goto L3f
        L35:
            if (r11 != 0) goto L38
            goto L46
        L38:
            if (r13 >= 0) goto L42
            if (r6 == 0) goto L3f
            float r15 = r6.b
            goto L46
        L3f:
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L46
        L42:
            if (r6 == 0) goto L46
            float r15 = r6.a
        L46:
            r8 = r15
            fxb r13 = r10.R
            qma r0 = new qma
            r9 = 0
            r1 = r10
            r7 = r11
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            zwb r10 = defpackage.zwb.E
            java.lang.Object r10 = r13.b(r10, r0, r14)
            m45 r11 = defpackage.m45.E
            if (r10 != r11) goto L5d
            return r10
        L5d:
            iei r10 = defpackage.iei.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikk.k(uma, bna, int, ana, xzg, int):java.lang.Object");
    }

    public static ikk l(Class cls) {
        try {
            try {
                try {
                    try {
                        Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return new dh3(declaredConstructor, cls, 0);
                    } catch (Exception unused) {
                        sz6.p("cannot construct instances of ".concat(cls.getName()));
                        return null;
                    }
                } catch (NoSuchMethodException unused2) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new eh3(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new fh3(declaredMethod2, cls, iIntValue);
            } catch (IllegalAccessException unused4) {
                mr9.u();
                return null;
            }
        } catch (IllegalAccessException unused5) {
            mr9.u();
            return null;
        } catch (NoSuchMethodException unused6) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new dh3(declaredMethod3, cls, 1);
        } catch (InvocationTargetException e) {
            spi.l(e);
            throw null;
        }
    }

    public static Object n(uma umaVar, bna bnaVar, float f, tp4 tp4Var) {
        Object objB = umaVar.R.b(zwb.E, new tma(umaVar, bnaVar, f, umaVar.f(), !(f == umaVar.g()), null), tp4Var);
        return objB == m45.E ? objB : iei.a;
    }

    public static final String o(TaskResponse taskResponse, ld4 ld4Var) {
        taskResponse.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-1294755653);
        String status_description = taskResponse.getStatus_description();
        if (bsg.I0(status_description)) {
            status_description = p(taskResponse.getStatus(), e18Var);
        }
        e18Var.p(false);
        return status_description;
    }

    public static final String p(TaskStatus taskStatus, ld4 ld4Var) {
        e18 e18Var;
        int i;
        int i2;
        taskStatus.getClass();
        int i3 = h8h.a[taskStatus.ordinal()];
        if (i3 == 1) {
            e18Var = (e18) ld4Var;
            i = R.string.task_status_fallback_needs_attention;
            i2 = 1768525860;
        } else if (i3 == 2) {
            e18Var = (e18) ld4Var;
            i = R.string.task_status_fallback_completed;
            i2 = 1768528734;
        } else if (i3 == 3 || i3 == 4) {
            e18Var = (e18) ld4Var;
            i = R.string.task_status_fallback_failed;
            i2 = 1768531995;
        } else {
            e18Var = (e18) ld4Var;
            i = R.string.task_status_fallback_active;
            i2 = 1768534075;
        }
        return vb7.n(e18Var, i2, i, e18Var, false);
    }

    public abstract Object m();
}
