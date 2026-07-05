package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a55 {
    static {
        new i4g(gb9.b(16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 16.0f);
    }

    public static final void a(b55 b55Var, hi4 hi4Var, Set set, pz7 pz7Var, i4g i4gVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        iqb iqbVar2;
        String strA;
        Context context;
        int i3;
        lz1 lz1Var;
        b55 b55Var2 = b55Var;
        koi koiVar = b55Var2.b;
        set.getClass();
        i4gVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-396213653);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(b55Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(hi4Var) : e18Var2.h(hi4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var2.f(set) : e18Var2.h(set) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(i4gVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i4 = i2 | 196608;
        if (e18Var2.Q(i4 & 1, (i4 & 74899) != 74898)) {
            Context context2 = (Context) e18Var2.j(w00.b);
            nwb nwbVarU = mpk.u(hi4Var.a.g, e18Var2);
            List listF = koiVar.f();
            boolean zJ = koiVar.j();
            di4 di4Var = (di4) nwbVarU.getValue();
            if (di4Var == null) {
                strA = null;
            } else {
                if (!(di4Var instanceof bi4)) {
                    mr9.b();
                    return;
                }
                strA = ((bi4) di4Var).a();
            }
            String str = strA;
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object objN = e18Var2.N();
            lz1 lz1Var2 = jd4.a;
            if (z || objN == lz1Var2) {
                context = context2;
                i3 = i5;
                lz1Var = lz1Var2;
                ty4 ty4Var = new ty4(1, b55Var, b55.class, "trackListedIfNeeded", "trackListedIfNeeded(I)V", 0, 7);
                b55Var2 = b55Var;
                e18Var2.k0(ty4Var);
                objN = ty4Var;
            } else {
                i3 = i5;
                context = context2;
                lz1Var = lz1Var2;
            }
            bz7 bz7Var = (bz7) ((jm9) objN);
            boolean zH = ((i4 & 112) == 32 || ((i4 & 64) != 0 && e18Var2.h(hi4Var))) | e18Var2.h(context) | (i3 == 4);
            Object objN2 = e18Var2.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new ny4((Object) hi4Var, context, (Object) b55Var2, 4);
                e18Var2.k0(objN2);
            }
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            b(listF, zJ, str, bz7Var, (bz7) objN2, set, pz7Var, i4gVar, fqbVar, null, e18Var, (i4 << 9) & 268369920, 512);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(b55Var2, hi4Var, set, pz7Var, i4gVar, iqbVar2, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.util.List r27, final boolean r28, final java.lang.String r29, final defpackage.bz7 r30, final defpackage.bz7 r31, final java.util.Set r32, final defpackage.pz7 r33, final defpackage.i4g r34, defpackage.iqb r35, defpackage.pl3 r36, defpackage.ld4 r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a55.b(java.util.List, boolean, java.lang.String, bz7, bz7, java.util.Set, pz7, i4g, iqb, pl3, ld4, int, int):void");
    }
}
