package defpackage;

import android.os.Bundle;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ytk {
    public static final ta4 a = new ta4(-292775230, false, new xb4(29));

    public static final void a(int i, int i2, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        int i3;
        zy7 zy7Var2;
        String str2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1623009397);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        byte b = 0;
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            uhk.b(zy7Var, iqbVar, str, null, fd9.q0(1570747677, new gq0(i, i4, b), e18Var), e18Var, ((i3 >> 3) & 14) | 24576 | ((i3 >> 6) & 112) | (i3 & 896), 8);
            zy7Var2 = zy7Var;
            str2 = str;
        } else {
            zy7Var2 = zy7Var;
            str2 = str;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ou0(i, zy7Var2, str2, iqbVar, i2);
        }
    }

    public static final void b(j50 j50Var, String str, q68 q68Var, int i, e54 e54Var, ld4 ld4Var, int i2, int i3) {
        int i4;
        int i5;
        e54 e54Var2;
        e54 e54Var3 = e54Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(491792371);
        int i6 = i2 | (e18Var.f(j50Var) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i6 |= e18Var.f(str) ? 32 : 16;
        }
        int i7 = i6 | (e18Var.f(q68Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i8 = i7 | 3072;
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 = i7 | 27648;
        } else {
            i4 = ((i2 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var.f(e54Var3) : e18Var.h(e54Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | i8;
        }
        if ((i4 & 9363) == 9362 && e18Var.C()) {
            e18Var.T();
            i5 = i;
            e54Var2 = e54Var3;
        } else {
            if (i9 != 0) {
                e54Var3 = null;
            }
            e54 e54Var4 = e54Var3;
            c(j50Var, str, q68Var, e54Var4, e18Var, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | 3072 | (i4 & 57344));
            i5 = 1;
            e54Var2 = e54Var4;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow7(j50Var, str, q68Var, i5, e54Var2, i2, i3, 1);
        }
    }

    public static final void c(j50 j50Var, String str, q68 q68Var, e54 e54Var, ld4 ld4Var, int i) {
        int i2;
        q68 q68VarD;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2075067909);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(j50Var) : e18Var.h(j50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(q68Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = 1;
        if ((i & 3072) == 0) {
            i2 |= e18Var.d(1) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var.f(e54Var) : e18Var.h(e54Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(null) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && e18Var.C()) {
            e18Var.T();
        } else {
            lz1 lz1Var = jd4.a;
            int i5 = 0;
            if (str != null) {
                e18Var.b0(884116866);
                e18Var.b0(5004770);
                boolean z = (i2 & 112) == 32;
                Object objN = e18Var.N();
                if (z || objN == lz1Var) {
                    objN = new cm5(str, 10);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                pjf pjfVar = new pjf();
                ((bz7) objN).invoke(pjfVar);
                q68VarD = q68Var.d(new rjf(pjfVar));
                e18Var.p(false);
            } else {
                e18Var.b0(884211261);
                e18Var.p(false);
                q68VarD = q68Var;
            }
            e18Var.b0(1849434622);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = vw8.E;
                e18Var.k0(objN2);
            }
            e18Var.p(false);
            zy7 zy7Var = (zy7) ((jm9) objN2);
            e18Var.b0(-1115894518);
            e18Var.b0(1886828752);
            if (!(e18Var.a instanceof gn0)) {
                iuj.A();
                throw null;
            }
            e18Var.Y();
            if (e18Var.S) {
                e18Var.k(new r68(0, zy7Var));
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, new lc4(29), j50Var);
            d4c.i0(e18Var, new uw8(i5), q68VarD);
            d4c.i0(e18Var, new uw8(i4), new io4());
            d4c.i0(e18Var, new uw8(i3), e54Var);
            d4c.i0(e18Var, new uw8(3), null);
            e18Var.p(true);
            e18Var.p(false);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(j50Var, str, q68Var, e54Var, i, 3);
        }
    }

    public static final void d(boolean z, zy7 zy7Var, x0a x0aVar, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        zy7Var.getClass();
        x0aVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2044270390);
        int i2 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.f(x0aVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 << 6;
            fqb fqbVar = fqb.E;
            gwj.a(d4c.j0(R.string.chat_new_chat, e18Var), a.a(ud0.d, e18Var), z, zy7Var, x0aVar, fqbVar, e18Var, (i3 & 57344) | (i3 & 896) | 64 | (i3 & 7168) | 196608, 0);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new e04(z, zy7Var, x0aVar, iqbVar2, i, 1);
        }
    }

    public static final void e(String str, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1199523316);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            iqb iqbVarJ = gb9.J(ez1.t(iqbVar, 0.5f, gm3.a(e18Var2).v, gm3.b(e18Var2).c), 12.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            tjh.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).i, e18Var2, i2 & 14, 0, 131070);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar, i, 20);
        }
    }

    public static final boolean f(String str, Bundle bundle) {
        return bundle.containsKey(str);
    }

    public static final String g(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 0) {
            if (iHashCode != 2880) {
                if (iHashCode == 47665 && str.equals("001")) {
                    return "🇺🇳";
                }
            } else if (str.equals("ZZ")) {
                return "🌐";
            }
        } else if (str.equals("")) {
            return "🌐";
        }
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        ArrayList arrayList = new ArrayList(upperCase.length());
        for (int i = 0; i < upperCase.length(); i++) {
            arrayList.add(Integer.valueOf(Character.codePointAt(String.valueOf(upperCase.charAt(i)), 0) - (-127397)));
        }
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Character.toChars(((Number) it.next()).intValue()));
        }
        return w44.S0(arrayList2, "", null, null, new qy4(3), 30);
    }

    public static final Bundle h(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        sz6.p(ij0.j("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static final Bundle i(String str, Bundle bundle) {
        return bundle.getBundle(str);
    }

    public static final ArrayList j(Bundle bundle) {
        return bundle.getStringArrayList("classes_to_restore");
    }

    public static final boolean k(uk6 uk6Var) {
        String str = null;
        rjf rjfVar = (rjf) uk6Var.a.a(pj3.g0, null);
        pjf pjfVar = rjfVar != null ? rjfVar.a : null;
        if (pjfVar != null) {
            Object obj = pjfVar.a.get(wvj.b);
            if (obj == null) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                str = (String) list.get(0);
            }
        }
        return str == null || str.length() == 0;
    }

    public static final boolean l(Bundle bundle) {
        return bundle.isEmpty();
    }
}
