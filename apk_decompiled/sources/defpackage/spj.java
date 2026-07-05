package defpackage;

import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.n0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public final class spj {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ l5l h;
    public final n0 i;

    public spj(l5l l5lVar, String str, int i, n0 n0Var, int i2) {
        this.g = i2;
        this.h = l5lVar;
        this.a = str;
        this.b = i;
        this.i = n0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean a(String str, f fVar, qgk qgkVar) {
        List listT;
        dgj.v(fVar);
        if (str != null && fVar.x() && fVar.q() != 1 && (fVar.q() != 7 ? fVar.w() : fVar.p() != 0)) {
            int iQ = fVar.q();
            boolean zU = fVar.u();
            String strS = (zU || iQ == 2 || iQ == 7) ? fVar.s() : fVar.s().toUpperCase(Locale.ENGLISH);
            if (fVar.p() == 0) {
                listT = null;
            } else {
                listT = fVar.t();
                if (!zU) {
                    ArrayList arrayList = new ArrayList(listT.size());
                    Iterator it = listT.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listT = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iQ == 2 ? strS : null;
            if (iQ != 7 ? strS != null : listT != null && !listT.isEmpty()) {
                if (!zU && iQ != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (g5l.a[sq6.F(iQ)]) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, zU ? 0 : 66).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                qgkVar.M.c("Invalid regular expression in REGEXP audience filter. expression", str2);
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strS));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strS));
                    case 4:
                        return Boolean.valueOf(str.contains(strS));
                    case 5:
                        return Boolean.valueOf(str.equals(strS));
                    case 6:
                        if (listT != null) {
                            return Boolean.valueOf(listT.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean b(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.d r9, double r10) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.b(java.math.BigDecimal, com.google.android.gms.internal.measurement.d, double):java.lang.Boolean");
    }

    public static Boolean c(boolean z, Boolean bool) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(java.lang.Long r19, java.lang.Long r20, com.google.android.gms.internal.measurement.x r21, long r22, defpackage.fvj r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spj.d(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.x, long, fvj, boolean):boolean");
    }

    public boolean e(Long l, Long l2, g0 g0Var, boolean z) {
        boolean z2;
        Boolean boolC;
        Boolean boolB;
        Boolean boolB2;
        Boolean boolB3;
        u2l.a();
        l5l l5lVar = this.h;
        umk umkVar = (umk) l5lVar.E;
        boolean zX0 = umkVar.K.X0(this.a, zvj.l0);
        e eVar = (e) this.i;
        boolean zU = eVar.u();
        boolean zV = eVar.v();
        boolean zW = eVar.w();
        boolean z3 = zU || zV || zW;
        if (z && !z3) {
            l5lVar.b0().R.a(Integer.valueOf(this.b), eVar.x() ? Integer.valueOf(eVar.p()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        c cVarR = eVar.r();
        boolean zU2 = cVarR.u();
        if (!g0Var.G()) {
            z2 = zW;
            if (!g0Var.E()) {
                if (!g0Var.I()) {
                    l5lVar.b0().M.c("User property has no value, property", umkVar.Q.g(g0Var.C()));
                } else if (cVarR.y()) {
                    boolC = c(zU2, a(g0Var.D(), cVarR.s(), l5lVar.b0()));
                } else if (!cVarR.w()) {
                    l5lVar.b0().M.c("No string or number filter defined. property", umkVar.Q.g(g0Var.C()));
                } else if (dik.w1(g0Var.D())) {
                    String strD = g0Var.D();
                    d dVarR = cVarR.r();
                    if (dik.w1(strD)) {
                        try {
                            boolB = b(new BigDecimal(strD), dVarR, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolB = null;
                        }
                        boolC = c(zU2, boolB);
                    } else {
                        boolB = null;
                        boolC = c(zU2, boolB);
                    }
                } else {
                    l5lVar.b0().M.a(umkVar.Q.g(g0Var.C()), g0Var.D(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolC = null;
            } else if (cVarR.w()) {
                double dP = g0Var.p();
                try {
                    boolB2 = b(new BigDecimal(dP), cVarR.r(), Math.ulp(dP));
                } catch (NumberFormatException unused2) {
                    boolB2 = null;
                }
                boolC = c(zU2, boolB2);
            } else {
                l5lVar.b0().M.c("No number filter for double property. property", umkVar.Q.g(g0Var.C()));
                boolC = null;
            }
        } else if (cVarR.w()) {
            z2 = zW;
            try {
                boolB3 = b(new BigDecimal(g0Var.y()), cVarR.r(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolB3 = null;
            }
            boolC = c(zU2, boolB3);
        } else {
            l5lVar.b0().M.c("No number filter for long property. property", umkVar.Q.g(g0Var.C()));
            z2 = zW;
            boolC = null;
        }
        l5lVar.b0().R.c("Property filter result", boolC == null ? "null" : boolC);
        if (boolC == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!z2 || boolC.booleanValue()) {
            if (!z || eVar.u()) {
                this.d = boolC;
            }
            if (boolC.booleanValue() && z3 && g0Var.H()) {
                long jA = g0Var.A();
                if (l != null) {
                    jA = l.longValue();
                }
                if (zX0 && eVar.u() && !eVar.v() && l2 != null) {
                    jA = l2.longValue();
                }
                if (eVar.v()) {
                    this.f = Long.valueOf(jA);
                } else {
                    this.e = Long.valueOf(jA);
                }
            }
        }
        return true;
    }
}
