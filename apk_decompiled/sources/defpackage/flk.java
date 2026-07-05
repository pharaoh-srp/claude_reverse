package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.text.format.DateUtils;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class flk {
    public static final ta4 a = new ta4(-631848466, false, new pb4(18));
    public static final ta4 b = new ta4(1003600727, false, new pb4(19));
    public static final ta4 c = new ta4(570447222, false, new pb4(20));
    public static final ta4 d = new ta4(137293717, false, new pb4(21));
    public static final ta4 e = new ta4(1534665277, false, new pb4(22));
    public static final ta4 f = new ta4(1574091686, false, new pb4(23));
    public static final ta4 g = new ta4(-563121864, false, new pb4(24));

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.iqb r22, boolean r23, defpackage.ld4 r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flk.a(iqb, boolean, ld4, int, int):void");
    }

    public static final void b(final tn3 tn3Var, final rn3 rn3Var, final iqb iqbVar, ld4 ld4Var, final int i) {
        int i2;
        r7e r7eVarS;
        pz7 pz7Var;
        bna bnaVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2059839475);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(tn3Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(rn3Var) : e18Var.h(rn3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.T();
        } else {
            if (((Boolean) e18Var.j(p59.a)).booleanValue()) {
                e18Var.a0(-1814762058);
                kxk.g(e18Var, kud.d(iqbVar, 3.235294f, false));
                e18Var.p(false);
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i3 = 0;
                    pz7Var = new pz7() { // from class: bn3
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            iei ieiVar = iei.a;
                            int i5 = i;
                            iqb iqbVar2 = iqbVar;
                            rn3 rn3Var2 = rn3Var;
                            tn3 tn3Var2 = tn3Var;
                            ld4 ld4Var2 = (ld4) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    flk.b(tn3Var2, rn3Var2, iqbVar2, ld4Var2, x44.p0(i5 | 1));
                                    break;
                                default:
                                    flk.b(tn3Var2, rn3Var2, iqbVar2, ld4Var2, x44.p0(i5 | 1));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            e18Var.a0(-1814676529);
            e18Var.p(false);
            ina inaVarQ = jlk.q(new jna(R.raw.clawd_jumping), e18Var, 6);
            ina inaVarQ2 = jlk.q(new jna(R.raw.clawd_dancing), e18Var, 6);
            int iOrdinal = tn3Var.ordinal();
            if (iOrdinal == 0) {
                bnaVar = (bna) inaVarQ.getValue();
            } else {
                if (iOrdinal != 1) {
                    wg6.i();
                    return;
                }
                bnaVar = (bna) inaVarQ2.getValue();
            }
            bna bnaVar2 = bnaVar;
            uma umaVarF = kkk.f(e18Var);
            nwb nwbVarZ = mpk.Z(rn3Var, e18Var);
            Object objB = (rn3) nwbVarZ.getValue();
            if (!(objB instanceof pn3)) {
                Object obj = on3.a;
                if (x44.r(objB, obj)) {
                    objB = obj;
                } else if (!(objB instanceof nn3)) {
                    obj = qn3.a;
                    if (!x44.r(objB, obj)) {
                        wg6.i();
                        return;
                    }
                    objB = obj;
                }
                r7eVarS.d = pz7Var;
            }
            objB = jce.a.b(pn3.class);
            boolean zH = e18Var.h(bnaVar2) | e18Var.f(nwbVarZ) | e18Var.f(umaVarF);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                pb2 pb2Var = new pb2(bnaVar2, umaVarF, nwbVarZ, null, 20);
                e18Var.k0(pb2Var);
                objN = pb2Var;
            }
            fd9.j(bnaVar2, objB, (pz7) objN, e18Var);
            iqb iqbVarD = kud.d(iqbVar, 3.235294f, false);
            boolean zF = e18Var.f(umaVarF);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new an3(umaVarF, 1);
                e18Var.k0(objN2);
            }
            mkk.c(bnaVar2, (zy7) objN2, iqbVarD, e18Var, 0);
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i4 = 1;
            pz7Var = new pz7() { // from class: bn3
                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj22) {
                    int i42 = i4;
                    iei ieiVar = iei.a;
                    int i5 = i;
                    iqb iqbVar2 = iqbVar;
                    rn3 rn3Var2 = rn3Var;
                    tn3 tn3Var2 = tn3Var;
                    ld4 ld4Var2 = (ld4) obj2;
                    ((Integer) obj22).getClass();
                    switch (i42) {
                        case 0:
                            flk.b(tn3Var2, rn3Var2, iqbVar2, ld4Var2, x44.p0(i5 | 1));
                            break;
                        default:
                            flk.b(tn3Var2, rn3Var2, iqbVar2, ld4Var2, x44.p0(i5 | 1));
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.iqb r30, final boolean r31, final java.lang.String r32, long r33, defpackage.ld4 r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flk.c(iqb, boolean, java.lang.String, long, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.cte r18, defpackage.jz0 r19, defpackage.iqb r20, defpackage.ld4 r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flk.d(cte, jz0, iqb, ld4, int, int):void");
    }

    public static IOException e(File file, IOException iOException) {
        file.getClass();
        return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? g(file, iOException) : g(file, iOException) : file.canWrite() ? g(file, iOException) : g(file, iOException) : file.canRead() ? file.canWrite() ? g(file, iOException) : g(file, iOException) : file.canWrite() ? g(file, iOException) : g(file, iOException) : g(file, iOException);
    }

    public static IOException f(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException g(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            return parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? f(file, iOException) : f(file, iOException) : parentFile.canWrite() ? f(file, iOException) : f(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? f(file, iOException) : f(file, iOException) : parentFile.canWrite() ? f(file, iOException) : f(file, iOException);
        }
        return f(file, iOException);
    }

    public static qa h(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("viewport");
            return new qa(bh9VarS != null ? zlk.d(bh9VarS.g()) : null);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Display", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Display", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Display", e4);
            return null;
        }
    }

    public static am4 i(qh9 qh9Var) {
        try {
            if (qh9Var.s("format_version").k() == 2) {
                return new am4(22);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Dd", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Dd", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Dd", e4);
            return null;
        }
    }

    public static lsc j() {
        return tbj.a;
    }

    public static final CharSequence k(Date date, long j, e18 e18Var) {
        date.getClass();
        e18Var.a0(-215475071);
        boolean zF = e18Var.f(date);
        Object objN = e18Var.N();
        Object obj = jd4.a;
        if (zF || objN == obj) {
            objN = Boolean.valueOf(Math.abs(date.getTime() - j) < 60000);
            e18Var.k0(objN);
        }
        if (((Boolean) objN).booleanValue()) {
            e18Var.a0(1758504387);
            String strJ0 = d4c.j0(R.string.date_format_just_now, e18Var);
            e18Var.a0(-1322292473);
            String strR = mpk.r(strJ0, e18Var);
            e18Var.p(false);
            e18Var.p(false);
            e18Var.p(false);
            return strR;
        }
        e18Var.a0(1758656225);
        e18Var.p(false);
        Configuration configuration = (Configuration) e18Var.j(w00.a);
        boolean zF2 = e18Var.f(configuration);
        Object objN2 = e18Var.N();
        if (zF2 || objN2 == obj) {
            LocaleList locales = configuration.getLocales();
            locales.getClass();
            objN2 = (Locale) w44.L0(mpk.f0(locales));
            e18Var.k0(objN2);
        }
        boolean zF3 = e18Var.f(date) | e18Var.f((Locale) objN2) | e18Var.e(j);
        Object objN3 = e18Var.N();
        if (zF3 || objN3 == obj) {
            objN3 = DateUtils.getRelativeTimeSpanString(date.getTime(), j, 1000L);
            objN3.getClass();
            e18Var.k0(objN3);
        }
        CharSequence charSequence = (CharSequence) objN3;
        e18Var.p(false);
        return charSequence;
    }

    public static final String l(c69 c69Var, c69 c69Var2, g5g g5gVar, ld4 ld4Var) {
        c69Var.getClass();
        c69Var2.getClass();
        long jA = c69Var2.a(c69Var);
        zh6 zh6Var = zh6.MINUTES;
        if (uh6.o(jA, zh6Var) < 1) {
            e18 e18Var = (e18) ld4Var;
            return vb7.n(e18Var, -1253380791, R.string.short_relative_time_now, e18Var, false);
        }
        zh6 zh6Var2 = zh6.HOURS;
        if (uh6.o(jA, zh6Var2) < 1) {
            e18 e18Var2 = (e18) ld4Var;
            e18Var2.a0(-1253378845);
            String strK0 = d4c.k0(g5gVar.E, new Object[]{Long.valueOf(uh6.o(jA, zh6Var))}, e18Var2);
            e18Var2.p(false);
            return strK0;
        }
        zh6 zh6Var3 = zh6.DAYS;
        if (uh6.o(jA, zh6Var3) < 1) {
            e18 e18Var3 = (e18) ld4Var;
            e18Var3.a0(-1253376129);
            String strK02 = d4c.k0(g5gVar.F, new Object[]{Long.valueOf(uh6.o(jA, zh6Var2))}, e18Var3);
            e18Var3.p(false);
            return strK02;
        }
        if (uh6.o(jA, zh6Var3) < 7) {
            e18 e18Var4 = (e18) ld4Var;
            e18Var4.a0(-1253373539);
            String strK03 = d4c.k0(g5gVar.G, new Object[]{Long.valueOf(uh6.o(jA, zh6Var3))}, e18Var4);
            e18Var4.p(false);
            return strK03;
        }
        e18 e18Var5 = (e18) ld4Var;
        e18Var5.a0(-1253371208);
        Context context = (Context) e18Var5.j(w00.b);
        long jB = c69Var.b();
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        boolean zF = e18Var5.f(locales) | e18Var5.e(jB);
        Object objN = e18Var5.N();
        if (zF || objN == jd4.a) {
            objN = DateUtils.formatDateTime(context, jB, 65544);
            e18Var5.k0(objN);
        }
        String str = (String) objN;
        str.getClass();
        e18Var5.p(false);
        return str;
    }
}
