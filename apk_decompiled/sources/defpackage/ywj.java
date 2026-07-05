package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ywj {
    public static final ta4 a = new ta4(1216399290, false, new bb4(22));
    public static final ta4 b = new ta4(1310853983, false, new bb4(23));
    public static final ta4 c = new ta4(2063495745, false, new db4(1));
    public static final int[] d = {R.attr.colorPrimary};
    public static final int[] e = {R.attr.colorPrimaryVariant};

    public static final void a(final boolean z, final zy7 zy7Var, final String str, final long j, final long j2, final iid iidVar, final iqb iqbVar, final String str2, final boolean z2, pl3 pl3Var, ld4 ld4Var, final int i) {
        int i2;
        zy7 zy7Var2;
        String str3;
        String str4;
        boolean z3;
        e18 e18Var;
        final pl3 pl3Var2;
        int i3;
        pl3 pl3Var3;
        zy7Var.getClass();
        str.getClass();
        iidVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-314255936);
        if ((i & 6) == 0) {
            i2 = (e18Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var2.h(zy7Var2) ? 32 : 16;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i & 384) == 0) {
            str3 = str;
            i2 |= e18Var2.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.e(j) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.e(j2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.d(iidVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            str4 = str2;
            i2 |= e18Var2.f(str4) ? 8388608 : 4194304;
        } else {
            str4 = str2;
        }
        if ((100663296 & i) == 0) {
            z3 = z2;
            i2 |= e18Var2.g(z3) ? 67108864 : 33554432;
        } else {
            z3 = z2;
        }
        if ((805306368 & i) == 0) {
            i2 |= 268435456;
        }
        if (e18Var2.Q(i2 & 1, (306783379 & i2) != 306783378)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(pl3.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i3 = i2 & (-1879048193);
                pl3Var3 = (pl3) objN;
            } else {
                e18Var2.T();
                i3 = i2 & (-1879048193);
                pl3Var3 = pl3Var;
            }
            e18Var2.q();
            int i4 = i3 >> 6;
            e18Var = e18Var2;
            b(z, zy7Var2, str3, iidVar, iqbVar, null, str4, fd9.q0(474876367, new pz7() { // from class: jid
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var3 = (e18) ld4Var2;
                    if (e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        usj.b(j, j2, null, e18Var3, 384);
                    } else {
                        e18Var3.T();
                    }
                    return iei.a;
                }
            }, e18Var2), z3, pl3Var3, e18Var, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i4 & 7168) | (i4 & 57344) | ((i3 >> 3) & 3670016) | (i3 & 234881024), 32);
            pl3Var2 = pl3Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            pl3Var2 = pl3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: kid
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    ywj.a(z, zy7Var, str, j, j2, iidVar, iqbVar, str2, z2, pl3Var2, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r29, defpackage.zy7 r30, java.lang.String r31, defpackage.iid r32, defpackage.iqb r33, java.lang.String r34, java.lang.String r35, defpackage.pz7 r36, boolean r37, defpackage.pl3 r38, defpackage.ld4 r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywj.b(boolean, zy7, java.lang.String, iid, iqb, java.lang.String, java.lang.String, pz7, boolean, pl3, ld4, int, int):void");
    }

    public static final void c(int i, ld4 ld4Var, iqb iqbVar, boolean z) {
        long j;
        long j2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(487620169);
        int i2 = (e18Var.g(z) ? 4 : 2) | i | 48;
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            iqbVar = fqb.E;
            iqb iqbVarO = b.o(iqbVar, 20.0f);
            if (z) {
                e18Var.a0(1113272796);
                j = gm3.a(e18Var).k;
                e18Var.p(false);
            } else {
                e18Var.a0(1113338640);
                e18Var.p(false);
                j = d54.g;
            }
            wlg wlgVarA = f8g.a(j, null, "Background color", e18Var, 384, 10);
            wlg wlgVarA2 = f8g.a(z ? d54.d : d54.g, null, "Dot color", e18Var, 384, 10);
            if (z) {
                e18Var.a0(1113698736);
                e18Var.p(false);
                j2 = d54.g;
            } else {
                e18Var.a0(1113745701);
                j2 = gm3.a(e18Var).v;
                e18Var.p(false);
            }
            wlg wlgVarA3 = f8g.a(j2, null, "Border color", e18Var, 384, 10);
            xo1 xo1Var = lja.K;
            long j3 = ((d54) wlgVarA3.getValue()).a;
            vve vveVar = xve.a;
            iqb iqbVarP = yfd.p(ez1.t(iqbVarO, 1.0f, j3, vveVar), ((d54) wlgVarA.getValue()).a, vveVar);
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
            dw1.a(yfd.p(b.o(iqbVar, 7.0f), ((d54) wlgVarA2.getValue()).a, vveVar), e18Var, 0);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lid(z, iqbVar, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r34, java.lang.String r35, defpackage.iid r36, defpackage.iqb r37, java.lang.String r38, boolean r39, defpackage.ld4 r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywj.d(java.lang.String, java.lang.String, iid, iqb, java.lang.String, boolean, ld4, int, int):void");
    }

    public static final void e(j0a j0aVar, List list, List list2, Set set, pz7 pz7Var, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, zy7 zy7Var) {
        j0aVar.getClass();
        list.getClass();
        list2.getClass();
        set.getClass();
        pz7Var.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        bz7Var3.getClass();
        bz7Var4.getClass();
        zy7Var.getClass();
        if (list.isEmpty() && list2.isEmpty()) {
            return;
        }
        j0a.V(j0aVar, mf6.L, null, auk.a, 2);
        j0aVar.W(list2.size(), new zkd(new z1g(16), 9, list2), new zkd(new z1g(17), 10, list2), new ta4(802480018, true, new cw(list2, set, bz7Var, bz7Var3, zy7Var)));
        j0aVar.W(list.size(), new zkd(new z1g(18), 11, list), new zkd(new z1g(19), 12, list), new ta4(802480018, true, new zj4(list, set, pz7Var, bz7Var2, bz7Var4, zy7Var)));
    }

    public static void f(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0e.n, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                h(context, e, "Theme.MaterialComponents");
            }
        }
        h(context, d, "Theme.AppCompat");
    }

    public static void g(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0e.n, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        sz6.p("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void h(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                sz6.p(ij0.j("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static os6 i(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            strM.getClass();
            return new os6(strM);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type ContainerView", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type ContainerView", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type ContainerView", e4);
            return null;
        }
    }

    public static pwi j(qh9 qh9Var) {
        try {
            long jK = qh9Var.s("duration").k();
            bh9 bh9VarS = qh9Var.s("timestamp");
            Long lValueOf = bh9VarS != null ? Long.valueOf(bh9VarS.k()) : null;
            bh9 bh9VarS2 = qh9Var.s("target_selector");
            String strM = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("sub_parts");
            return new pwi(jK, lValueOf, strM, bh9VarS3 != null ? dxj.g(bh9VarS3.g()) : null);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Inp", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Inp", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Inp", e4);
            return null;
        }
    }

    public static final double k(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return 1.0d;
        }
        Iterator it = list.iterator();
        double dA = ((ce2) it.next()).a();
        Double dValueOf = null;
        while (it.hasNext()) {
            double dA2 = ((ce2) it.next()).a();
            double dAbs = Math.abs(dA2 - dA);
            if (dAbs != 0.0d) {
                if (dValueOf != null) {
                    double dE = pmk.e(dValueOf.doubleValue(), dAbs);
                    dValueOf = Double.valueOf(dE);
                    if (dE == 0.0d) {
                        sz6.p("The x-values are too precise. The maximum precision is four decimal places.");
                        return 0.0d;
                    }
                } else {
                    dValueOf = Double.valueOf(dAbs);
                }
            }
            dA = dA2;
        }
        if (dValueOf != null) {
            return dValueOf.doubleValue();
        }
        return 1.0d;
    }

    public static AbstractList l(List list, lz7 lz7Var) {
        return list instanceof RandomAccess ? new mba(list, lz7Var) : new nba(list, lz7Var);
    }
}
