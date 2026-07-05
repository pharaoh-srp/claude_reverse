package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hjk {
    public static final ta4 a = new ta4(597633477, false, new hb4(16));
    public static final ta4 b = new ta4(1741321720, false, new ob4(1));

    public static nla a(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("viewport");
            return new nla(bh9VarS != null ? ckk.g(bh9VarS.g()) : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Display", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Display", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Display", e3);
            return null;
        }
    }

    public static final hab b(ctd ctdVar, txb txbVar, cbi cbiVar, boolean z, boolean z2, boolean z3) {
        ctdVar.getClass();
        txbVar.getClass();
        t28 t28Var = el9.d;
        t28Var.getClass();
        yk9 yk9Var = (yk9) uik.i(ctdVar, t28Var);
        if (yk9Var != null) {
            if (z) {
                oc7 oc7Var = fl9.a;
                hk9 hk9VarB = fl9.b(ctdVar, txbVar, cbiVar, z3);
                if (hk9VarB != null) {
                    return aqk.f(hk9VarB);
                }
            } else if (z2 && (yk9Var.F & 2) == 2) {
                wk9 wk9Var = yk9Var.H;
                wk9Var.getClass();
                return new hab(txbVar.getString(wk9Var.G).concat(txbVar.getString(wk9Var.H)));
            }
        }
        return null;
    }

    public static final l1h d(xfj xfjVar, int i) {
        return new l1h(xfjVar.a, xfjVar.b, i);
    }

    public static final String f(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 60;
        long j4 = j3 / 60;
        long j5 = j4 / 24;
        long j6 = j5 / 7;
        StringBuilder sb = new StringBuilder("P");
        if (j6 > 0) {
            sb.append(j6 + "W");
        } else {
            long j7 = j5 % 7;
            if (j7 > 0) {
                sb.append(j7 + "D");
            }
            long j8 = j4 % 24;
            long j9 = j3 % 60;
            long j10 = j2 % 60;
            if (j8 > 0 || j9 > 0 || j10 > 0) {
                sb.append("T");
                if (j8 > 0) {
                    sb.append(j8 + "H");
                }
                if (j9 > 0) {
                    sb.append(j9 + "M");
                }
                if (j10 > 0) {
                    sb.append(j10 + "S");
                }
            }
        }
        if (sb.length() == 1) {
            sb.append("T0S");
        }
        return sb.toString();
    }

    public abstract qh9 e();
}
