package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y45 {
    static {
        new i4g(gb9.b(16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 16.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final int r31, final int r32, final boolean r33, final java.util.List r34, final boolean r35, final boolean r36, final defpackage.bz7 r37, final defpackage.zy7 r38, final defpackage.i4g r39, defpackage.iqb r40, defpackage.ld4 r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y45.a(int, int, boolean, java.util.List, boolean, boolean, bz7, zy7, i4g, iqb, ld4, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    public static final void b(List list, final int i, boolean z, final boolean z2, final zy7 zy7Var, i4g i4gVar, String str, ld4 ld4Var, int i2) {
        int i3;
        ?? r3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1609082082);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            i3 |= e18Var.f(i4gVar) ? 131072 : 65536;
        }
        int i4 = 1572864 & i2;
        fqb fqbVar = fqb.E;
        if (i4 == 0) {
            i3 |= e18Var.f(fqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= e18Var.f(str) ? 8388608 : 4194304;
        }
        if (e18Var.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            qnc qncVar = qf2.a;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            iqb iqbVarN = gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarN);
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
            if (list.isEmpty()) {
                r3 = 0;
                e18Var.a0(-1200566026);
                e18Var.p(false);
            } else {
                e18Var.a0(-1200918713);
                x21.b(list, gb9.b(12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), null, e18Var, i3 & 14);
                r3 = 0;
                e18Var.p(false);
            }
            if (str == null) {
                e18Var.a0(-1200526781);
                e18Var.p(r3);
            } else {
                e18Var.a0(-1200526780);
                yuk.a(str, gb9.L(fqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var, r3);
                e18Var.p(r3);
            }
            if (z) {
                e18Var.a0(-1200263063);
                yhk.a(null, fd9.q0(1151576409, new rz7() { // from class: x45
                    @Override // defpackage.rz7
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        String strF0;
                        ld4 ld4Var2 = (ld4) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((s64) obj).getClass();
                        e18 e18Var2 = (e18) ld4Var2;
                        if (e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            bpc bpcVarA = a.a(ud0.X, e18Var2);
                            String strJ0 = d4c.j0(R.string.connectors_label, e18Var2);
                            int i5 = i;
                            if (i5 > 0) {
                                e18Var2.a0(-1585648408);
                                strF0 = d4c.f0(R.plurals.connectors_connected_count, i5, new Object[]{Integer.valueOf(i5)}, e18Var2);
                                e18Var2.p(false);
                            } else {
                                e18Var2.a0(-1585362867);
                                e18Var2.p(false);
                                strF0 = null;
                            }
                            gvk.a(new q21(bpcVarA, strJ0, zy7Var, null, strF0, false, false, z2, null, 744), qf2.a, b.c(fqb.E, 1.0f), qf2.c(e18Var2), e18Var2, 384);
                        } else {
                            e18Var2.T();
                        }
                        return iei.a;
                    }
                }, e18Var), e18Var, 48);
                e18Var.p(r3);
            } else {
                e18Var.a0(-1199235754);
                e18Var.p(r3);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lv2(list, i, z, z2, zy7Var, i4gVar, str, i2);
        }
    }
}
