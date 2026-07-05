package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.ui.components.error.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uvk {
    public static final ta4 a = new ta4(-1655151435, false, new lc4(0));

    static {
        new ta4(560965891, false, new lc4(1));
        new ta4(-487867583, false, new lc4(2));
        new ta4(-808188298, false, new lc4(3));
        new ta4(-1222156138, false, new lc4(4));
    }

    public static final void a(ftc ftcVar, lvh lvhVar, String str, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        lvhVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(372117709);
        int i2 = i | (e18Var.f(ftcVar) ? 4 : 2) | (e18Var.f(lvhVar) ? 32 : 16) | (e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 24576;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            fqb fqbVar = fqb.E;
            osk.l(ftcVar, lvhVar, false, str, true, fqbVar, e18Var, ((i2 << 3) & 7168) | (i2 & 14) | 24576 | (i2 & 112) | 384 | 196608);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(ftcVar, lvhVar, str, iqbVar2, i, 12);
        }
    }

    public static final void b(final String str, String str2, boolean z, final pvg pvgVar, final RavenType ravenType, final sz7 sz7Var, iqb iqbVar, final long j, ld4 ld4Var, int i) {
        int i2;
        String str3;
        boolean z2;
        str.getClass();
        str2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(369371700);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= e18Var.f(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.d(pvgVar.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.d(ravenType == null ? -1 : ravenType.ordinal()) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(sz7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.e(j) ? 8388608 : 4194304;
        }
        if (e18Var.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new ucf(7);
                e18Var.k0(objN);
            }
            final nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            boolean zF = e18Var.f(nwbVar);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new ol5(29, nwbVar);
                e18Var.k0(objN2);
            }
            final String str4 = str3;
            final boolean z3 = z2;
            kkk.a(zBooleanValue, (bz7) objN2, iqbVar, fd9.q0(1121627614, new rz7() { // from class: khf
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    wb7 wb7Var = (wb7) obj;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    wb7Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? ((e18) ld4Var2).f(wb7Var) : ((e18) ld4Var2).h(wb7Var) ? 4 : 2;
                    }
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        e0g e0gVar = gm3.b(e18Var2).q;
                        qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).v);
                        Object objN3 = e18Var2.N();
                        lz1 lz1Var2 = jd4.a;
                        if (objN3 == lz1Var2) {
                            objN3 = new d6f(7);
                            e18Var2.k0(objN3);
                        }
                        iqb iqbVarC = fqb.E;
                        iqb iqbVarB = tjf.b(iqbVarC, true, (bz7) objN3);
                        sz7 sz7Var2 = sz7Var;
                        iqb iqbVarB2 = wb7Var.b(iqbVarB, "PrimaryNotEditable", sz7Var2 != null);
                        if (sz7Var2 == null) {
                            e18Var2.a0(-152630266);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(-152625931);
                            iqb iqbVarV = xn5.V(iqbVarC, gm3.b(e18Var2).q);
                            Object objN4 = e18Var2.N();
                            if (objN4 == lz1Var2) {
                                objN4 = new oob(19);
                                e18Var2.k0(objN4);
                            }
                            iqbVarC = b.c(iqbVarV, false, null, null, null, (zy7) objN4, 15);
                            e18Var2.p(false);
                        }
                        pzg.a(iqbVarB2.B(iqbVarC), e0gVar, j, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, qu1VarA, fd9.q0(-1138137693, new ht0(pvgVar, ravenType, sz7Var2, str, z3, str4), e18Var2), e18Var2, 12582912, 56);
                        if (sz7Var2 != null) {
                            e18Var2.a0(-434245297);
                            nwb nwbVar2 = nwbVar;
                            boolean zBooleanValue2 = ((Boolean) nwbVar2.getValue()).booleanValue();
                            boolean zF2 = e18Var2.f(nwbVar2);
                            Object objN5 = e18Var2.N();
                            if (zF2 || objN5 == lz1Var2) {
                                objN5 = new k3c(27, nwbVar2);
                                e18Var2.k0(objN5);
                            }
                            wb7Var.a(zBooleanValue2, (zy7) objN5, null, null, false, gm3.b(e18Var2).f, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-144480923, new u3e(sz7Var2, 6, nwbVar2), e18Var2), e18Var2, 0, 6 | ((iIntValue << 3) & 112), 988);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(-433979100);
                            e18Var2.p(false);
                        }
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, ((i2 >> 12) & 896) | 3072, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xu8(str, str2, z, pvgVar, ravenType, sz7Var, iqbVar, j, i);
        }
    }

    public static final void c(pvg pvgVar, RavenType ravenType, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-463123869);
        int i2 = (e18Var.d(pvgVar.ordinal()) ? 4 : 2) | i | (e18Var.d(ravenType == null ? -1 : ravenType.ordinal()) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            pzg.a(null, xve.a(100), gm3.a(e18Var).M, gm3.a(e18Var).o, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(645998248, new jhf(pvgVar, ravenType), e18Var), e18Var, 12582912, 113);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jhf(pvgVar, ravenType, i);
        }
    }

    public static final void d(hn5 hn5Var, bz7[] bz7VarArr, bz7 bz7Var) {
        hn5Var.getClass();
        if (!(hn5Var instanceof g1)) {
            sz6.j("impossible");
            return;
        }
        g1 g1Var = (g1) hn5Var;
        bz7[] bz7VarArr2 = (bz7[]) Arrays.copyOf(bz7VarArr, bz7VarArr.length);
        nai.n(1, bz7Var);
        ArrayList arrayList = new ArrayList(bz7VarArr2.length);
        for (bz7 bz7Var2 : bz7VarArr2) {
            g1 g1VarH = g1Var.h();
            bz7Var2.invoke(g1VarH);
            arrayList.add(new ze4(g1VarH.b().E));
        }
        g1 g1VarH2 = g1Var.h();
        bz7Var.invoke(g1VarH2);
        g1Var.b().g(new pw(new ze4(g1VarH2.b().E), arrayList));
    }

    public static final void e(hn5 hn5Var, char c) {
        hn5Var.getClass();
        String strValueOf = String.valueOf(c);
        strValueOf.getClass();
        ((g1) hn5Var).b().g(new gl4(strValueOf));
    }

    public static final float f(float f, float f2, float f3) {
        return d4c.W(f, f2, f3);
    }

    public static final void g(Context context, Uri uri, String str, zy1 zy1Var) {
        context.getClass();
        uri.getClass();
        str.getClass();
        zy1Var.getClass();
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, str);
            intent.addFlags(1);
            intent.addFlags(268435456);
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Intent intentCreateChooser = Intent.createChooser(intent, context.getString(R.string.chat_open_file));
                intentCreateChooser.addFlags(268435456);
                try {
                    context.startActivity(intentCreateChooser);
                } catch (Exception e) {
                    List list = xah.a;
                    xah.f(e, "Failed to open file with chooser: mimeType=" + str + ", uri=" + uri, null, null, 28);
                    a.a(new pt6(R.string.wiggle_no_app_for_file_type), zy1Var);
                }
            }
        } catch (Exception e2) {
            List list2 = xah.a;
            xah.f(e2, "Failed to open file: mimeType=" + str + ", uri=" + uri, null, null, 28);
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            a.a(new qt6(R.string.wiggle_error_opening_file, x44.W(message)), zy1Var);
        }
    }

    public static final void h(hn5 hn5Var, String str, bz7 bz7Var) {
        hn5Var.getClass();
        if (!(hn5Var instanceof g1)) {
            sz6.j("impossible");
            return;
        }
        g1 g1Var = (g1) hn5Var;
        nai.n(1, bz7Var);
        dn0 dn0VarB = g1Var.b();
        g1 g1VarH = g1Var.h();
        bz7Var.invoke(g1VarH);
        dn0VarB.g(new mjc(str, new ze4(g1VarH.b().E)));
    }

    public abstract l7g i(t9i t9iVar, cs9 cs9Var);
}
