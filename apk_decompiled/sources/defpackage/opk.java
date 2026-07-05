package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
import android.view.View;
import androidx.compose.foundation.b;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class opk {
    public static final ta4 a = new ta4(-1501096317, false, new ub4(8));
    public static final ta4 b = new ta4(-883264159, false, new ub4(9));
    public static final ta4 c = new ta4(-934519220, false, new ub4(10));

    public static final void a(ld4 ld4Var, bz7 bz7Var) {
        bz7Var.getClass();
        Object[] objArr = new Object[0];
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new b5(18);
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
        boolean zF = e18Var.f(nwbVar) | e18Var.h(bz7Var);
        Object objN2 = e18Var.N();
        if (zF || objN2 == lz1Var) {
            objN2 = new m0(bz7Var, nwbVar, null, 13);
            e18Var.k0(objN2);
        }
        fd9.i(e18Var, (pz7) objN2, iei.a);
    }

    public static final void b(LocalDate localDate, bz7 bz7Var, String str, iqb iqbVar, boolean z, ld4 ld4Var, int i) {
        int i2;
        String str2;
        boolean z2;
        e18 e18Var;
        String strN;
        xl5 xl5Var;
        bz7Var.getClass();
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(707045441);
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(localDate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= e18Var2.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(null) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = i2 | 196608;
        if (e18Var2.Q(i3 & 1, (74899 & i3) != 74898)) {
            Configuration configuration = (Configuration) e18Var2.j(w00.a);
            boolean zF = e18Var2.f(configuration);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                LocaleList locales = configuration.getLocales();
                locales.getClass();
                objN = (Locale) w44.L0(mpk.f0(locales));
                e18Var2.k0(objN);
            }
            Locale locale = (Locale) objN;
            Object objN2 = e18Var2.N();
            Object obj = objN2;
            if (objN2 == lz1Var) {
                DateFormat dateInstance = DateFormat.getDateInstance(2, locale);
                dateInstance.setTimeZone(gqh.a);
                e18Var2.k0(dateInstance);
                obj = dateInstance;
            }
            DateFormat dateFormat = (DateFormat) obj;
            Object[] objArr = new Object[0];
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = new l84(9);
                e18Var2.k0(objN3);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN3, e18Var2, 48);
            wo1 wo1Var = lja.Q;
            iqb iqbVarB = iqbVar.B(fqb.E);
            boolean zH = e18Var2.h(localDate) | e18Var2.f(nwbVar);
            Object objN4 = e18Var2.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new lj2(localDate, 17, nwbVar);
                e18Var2.k0(objN4);
            }
            iqb iqbVarV = xn5.V(ez1.C(u00.C(iqbVarB, (bz7) objN4), null, 3), gm3.b(e18Var2).d);
            boolean zF2 = e18Var2.f(nwbVar);
            Object objN5 = e18Var2.N();
            if (zF2 || objN5 == lz1Var) {
                objN5 = new dy2(23, nwbVar);
                e18Var2.k0(objN5);
            }
            iqb iqbVarJ = gb9.J(ez1.t(b.c(iqbVarV, true, null, null, null, (zy7) objN5, 14), 0.5f, gm3.a(e18Var2).v, gm3.b(e18Var2).d), 12.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var2, 48);
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
            d4c.i0(e18Var2, cd4.f, cxeVarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            tjh.b(str2, new hw9(1.0f, true), gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, (i3 >> 6) & 14, 0, 131064);
            if (localDate != null) {
                Date dateFrom = Date.from(localDate.atStartOfDay(vjj.a).toInstant());
                dateFrom.getClass();
                strN = dateFormat.format(dateFrom);
            } else {
                strN = null;
            }
            if (strN == null) {
                strN = vb7.n(e18Var2, 975618297, R.string.birthday_picker_select_date, e18Var2, false);
            } else {
                e18Var2.a0(975615507);
                e18Var2.p(false);
            }
            tjh.b(strN, null, gm3.a(e18Var2).l, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).h, e18Var2, 0, 0, 131066);
            e18 e18Var3 = e18Var2;
            e18Var3.p(true);
            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var3.a0(1073138107);
                Long lValueOf = localDate != null ? Long.valueOf(localDate.atStartOfDay(vjj.a).toInstant().toEpochMilli()) : null;
                qnc qncVar = cn5.a;
                b79 b79Var = yl5.a;
                xl5 xl5Var2 = yl5.b;
                Locale locale2 = ((eea) e18Var3.j(ve4.p)).a;
                Object[] objArr2 = new Object[0];
                y5f y5fVarK = dgj.K(new f25(xl5Var2, 4, locale2), new lc4(21));
                boolean zF3 = e18Var3.f(lValueOf) | e18Var3.f(lValueOf) | e18Var3.h(b79Var) | e18Var3.d(0) | e18Var3.f(xl5Var2) | e18Var3.f(locale2);
                Object objN6 = e18Var3.N();
                if (zF3 || objN6 == lz1Var) {
                    objN6 = new dn(lValueOf, lValueOf, b79Var, xl5Var2, locale2, 8);
                    xl5Var = xl5Var2;
                    e18Var3.k0(objN6);
                } else {
                    xl5Var = xl5Var2;
                }
                dn5 dn5Var = (dn5) iuj.K(objArr2, y5fVarK, (zy7) objN6, e18Var3, 0);
                dn5Var.d.setValue(xl5Var);
                boolean zF4 = e18Var3.f(nwbVar);
                Object objN7 = e18Var3.N();
                if (zF4 || objN7 == lz1Var) {
                    objN7 = new dy2(24, nwbVar);
                    e18Var3.k0(objN7);
                }
                zl5.a((zy7) objN7, fd9.q0(226151790, new f44(dn5Var, bz7Var, nwbVar, 3), e18Var3), null, fd9.q0(-1087678096, new jj2(4, nwbVar), e18Var3), null, null, null, fd9.q0(1240102661, new nn(15, dn5Var), e18Var3), e18Var3, 100666416);
                e18Var3.p(false);
            } else {
                e18Var3.a0(1074865985);
                e18Var3.p(false);
            }
            z2 = true;
            e18Var = e18Var3;
        } else {
            e18Var2.T();
            z2 = z;
            e18Var = e18Var2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new k04(localDate, bz7Var, str, iqbVar, z2, i);
        }
    }

    public static final void c(Long l, am5 am5Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-143379476);
        int i2 = i | (e18Var2.f(l) ? 4 : 2) | (e18Var2.f(am5Var) ? 32 : 16);
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            Configuration configuration = (Configuration) e18Var2.j(w00.a);
            boolean zF = e18Var2.f(configuration);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                LocaleList locales = configuration.getLocales();
                locales.getClass();
                objN = (Locale) w44.L0(mpk.f0(locales));
                e18Var2.k0(objN);
            }
            Locale locale = (Locale) objN;
            String strA = am5Var.a(l, locale, false);
            String strA2 = am5Var.a(l, locale, true);
            if (strA2 == null) {
                strA2 = vb7.n(e18Var2, -348705886, R.string.birthday_picker_your_birthday, e18Var2, false);
            } else {
                e18Var2.a0(-348711125);
                e18Var2.p(false);
            }
            if (strA == null) {
                strA = vb7.n(e18Var2, -348702302, R.string.birthday_picker_your_birthday, e18Var2, false);
            } else {
                e18Var2.a0(-348703077);
                e18Var2.p(false);
            }
            String strK0 = d4c.k0(R.string.birthday_picker_current_selection_format, new Object[]{strA2}, e18Var2);
            long j = gm3.a(e18Var2).M;
            boolean zF2 = e18Var2.f(strK0);
            Object objN2 = e18Var2.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new w43(strK0, 22);
                e18Var2.k0(objN2);
            }
            e18Var = e18Var2;
            tjh.b(strA, tjf.b(iqbVar, false, (bz7) objN2), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, e18Var, 0, 24576, 245752);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f44(l, i, am5Var, iqbVar, 2);
        }
    }

    public static final void d(int i, int i2, ld4 ld4Var, iqb iqbVar) {
        e18 e18Var;
        String strN;
        int i3;
        int i4;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(56055631);
        int i5 = (e18Var2.d(i) ? 4 : 2) | i2 | (e18Var2.f(iqbVar) ? 32 : 16);
        if (e18Var2.Q(i5 & 1, (i5 & 19) != 18)) {
            if (i == 0) {
                i3 = -1965108244;
                i4 = R.string.birthday_picker_select_your_birthday;
            } else if (i == 1) {
                i3 = -1965105332;
                i4 = R.string.birthday_picker_enter_your_birthdate;
            } else {
                e18Var2.a0(-788647601);
                e18Var2.p(false);
                strN = "";
                e18Var = e18Var2;
                tjh.b(strN, iqbVar, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, i5 & 112, 0, 262136);
            }
            strN = vb7.n(e18Var2, i3, i4, e18Var2, false);
            e18Var = e18Var2;
            tjh.b(strN, iqbVar, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, i5 & 112, 0, 262136);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i10(i, i2, 5, iqbVar);
        }
    }

    public static qoe e(qh9 qh9Var) {
        try {
            return new qoe(qh9Var.s("duration").k(), qh9Var.s("start").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Dns", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Dns", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Dns", e3);
            return null;
        }
    }

    public static final fjh f(fjh fjhVar, fjh fjhVar2, float f) {
        return new fjh(d4c.W(fjhVar.a, fjhVar2.a, f), d4c.W(fjhVar.b, fjhVar2.b, f));
    }

    public static int g(mu9 mu9Var, fma fmaVar, h5b h5bVar, int i) {
        return mu9Var.b(new mb9(fmaVar, fmaVar.getLayoutDirection()), new x5b(h5bVar, z5b.F, a6b.F), sl4.b(0, i, 0, 0, 13)).a();
    }

    public static int h(mu9 mu9Var, fma fmaVar, h5b h5bVar, int i) {
        return mu9Var.b(new mb9(fmaVar, fmaVar.getLayoutDirection()), new x5b(h5bVar, z5b.F, a6b.E), sl4.b(0, 0, 0, i, 7)).b();
    }

    public static int i(mu9 mu9Var, fma fmaVar, h5b h5bVar, int i) {
        return mu9Var.b(new mb9(fmaVar, fmaVar.getLayoutDirection()), new x5b(h5bVar, z5b.E, a6b.F), sl4.b(0, i, 0, 0, 13)).a();
    }

    public static int j(mu9 mu9Var, fma fmaVar, h5b h5bVar, int i) {
        return mu9Var.b(new mb9(fmaVar, fmaVar.getLayoutDirection()), new x5b(h5bVar, z5b.E, a6b.E), sl4.b(0, 0, 0, i, 7)).b();
    }

    public static final void k(m4c m4cVar, oyi oyiVar) {
        oyiVar.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String l(android.content.Context r2, int r3) {
        /*
            java.lang.String r0 = "0x"
            r1 = 16
            if (r2 == 0) goto L11
            android.content.res.Resources r2 = r2.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L23
            if (r2 == 0) goto L11
            java.lang.String r2 = r2.getResourceEntryName(r3)     // Catch: android.content.res.Resources.NotFoundException -> L23
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 != 0) goto L31
            defpackage.gb9.q(r1)     // Catch: android.content.res.Resources.NotFoundException -> L23
            java.lang.String r2 = java.lang.Integer.toString(r3, r1)     // Catch: android.content.res.Resources.NotFoundException -> L23
            r2.getClass()     // Catch: android.content.res.Resources.NotFoundException -> L23
            java.lang.String r2 = r0.concat(r2)     // Catch: android.content.res.Resources.NotFoundException -> L23
            return r2
        L23:
            defpackage.gb9.q(r1)
            java.lang.String r2 = java.lang.Integer.toString(r3, r1)
            r2.getClass()
            java.lang.String r2 = r0.concat(r2)
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opk.l(android.content.Context, int):java.lang.String");
    }

    public static final String m(View view) {
        String canonicalName = view.getClass().getCanonicalName();
        return canonicalName == null ? view.getClass().getSimpleName() : canonicalName;
    }

    public static int n(fzj fzjVar) {
        Iterator it = fzjVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
