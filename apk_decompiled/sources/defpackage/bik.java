package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.analytics.health.HealthMetricAction;
import com.anthropic.claude.design.icon.a;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bik {
    public static final ta4 a = new ta4(-884887850, false, new gb4(16));
    public static final ta4 b = new ta4(-2026082828, false, new db4(14));
    public static final ta4 c = new ta4(266772726, false, new db4(15));
    public static final ta4 d = new ta4(-826913541, false, new gb4(17));
    public static final ta4 e = new ta4(-1827969412, false, new gb4(18));
    public static final ta4 f = new ta4(1534368338, false, new db4(16));
    public static final ta4 g = new ta4(-218518193, false, new gb4(19));
    public static final xb h = new xb(14);

    /* JADX WARN: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r26, final defpackage.ta4 r27, final defpackage.ta4 r28, final defpackage.zy7 r29, defpackage.iqb r30, long r31, long r33, float r35, defpackage.ld4 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bik.a(boolean, ta4, ta4, zy7, iqb, long, long, float, ld4, int, int):void");
    }

    public static final void b(String str, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        String strN;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2366464);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            bpc bpcVarA = a.a(ud0.m0, e18Var);
            if (str != null) {
                e18Var.a0(1780056890);
                strN = d4c.k0(R.string.project_knowledge_screen_empty_state_title, new Object[]{str}, e18Var);
                e18Var.p(false);
            } else {
                strN = vb7.n(e18Var, 1780166103, R.string.project_knowledge_screen_empty_state_title_no_project_name, e18Var, false);
            }
            String str2 = strN;
            fqb fqbVar = fqb.E;
            pvj.b(bpcVarA, str2, fqbVar, null, e18Var, 392, 8);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new el(str, iqbVar, i, 7);
        }
    }

    public static final int c(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int d(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static at6 e(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("code_type");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("parent_process");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("incident_identifier");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("process");
            String strM4 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("exception_type");
            String strM5 = bh9VarS5 != null ? bh9VarS5.m() : null;
            bh9 bh9VarS6 = qh9Var.s("exception_codes");
            String strM6 = bh9VarS6 != null ? bh9VarS6.m() : null;
            bh9 bh9VarS7 = qh9Var.s("path");
            return new at6(strM, strM2, strM3, strM4, strM5, strM6, bh9VarS7 != null ? bh9VarS7.m() : null);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Meta", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Meta", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Meta", e4);
            return null;
        }
    }

    public static cxi f(qh9 qh9Var) {
        int i;
        String strM;
        String strM2;
        try {
            bh9 bh9VarS = qh9Var.s("status");
            int i2 = 0;
            if (bh9VarS != null && (strM2 = bh9VarS.m()) != null) {
                int[] iArrH = sq6.H(4);
                int length = iArrH.length;
                for (int i3 = 0; i3 < length; i3++) {
                    i = iArrH[i3];
                    if (!fsh.k(i).equals(strM2)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            i = 0;
            bh9 bh9VarS2 = qh9Var.s("error_reason");
            if (bh9VarS2 != null && (strM = bh9VarS2.m()) != null) {
                int[] iArrH2 = sq6.H(4);
                int length2 = iArrH2.length;
                while (i2 < length2) {
                    int i4 = iArrH2[i2];
                    if (fsh.j(i4).equals(strM)) {
                        i2 = i4;
                    } else {
                        i2++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new cxi(i, i2);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Profiling", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Profiling", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Profiling", e4);
            return null;
        }
    }

    public static final void g(hl8 hl8Var, String str, bne bneVar) {
        hl8Var.getClass();
        hl8.b(hl8Var, HealthMetricAction.LOGIN, bneVar, str, null, 24);
    }

    public static final void h(hl8 hl8Var, String str) {
        hl8Var.getClass();
        hl8.b(hl8Var, HealthMetricAction.SIGNUP, ane.a, str, null, 24);
    }
}
