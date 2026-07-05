package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a3k {
    public static final /* synthetic */ int a = 0;

    static {
        int i = e3k.D;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + cpk.w(exc.getMessage());
            int i = jyj.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static lqk b(int i, int i2, hp1 hp1Var, String str, isk iskVar) {
        try {
            lrk lrkVarQ = wrk.q();
            int i3 = hp1Var.a;
            lrkVarQ.b();
            wrk.p((wrk) lrkVarQ.F, i3);
            String str2 = hp1Var.c;
            lrkVarQ.b();
            wrk.s((wrk) lrkVarQ.F, str2);
            int i4 = hp1Var.b;
            if (i4 != 0) {
                lrkVarQ.b();
                wrk.u((wrk) lrkVarQ.F, i4);
            }
            if (i != 0) {
                lrkVarQ.b();
                wrk.v((wrk) lrkVarQ.F, i);
            }
            if (str != null) {
                lrkVarQ.b();
                wrk.r((wrk) lrkVarQ.F, str);
            }
            hqk hqkVarS = lqk.s();
            hqkVarS.c(lrkVarQ);
            hqkVarS.b();
            lqk.r((lqk) hqkVarS.F, i2);
            if (!iskVar.equals(isk.BROADCAST_ACTION_UNSPECIFIED)) {
                hqkVarS.b();
                lqk.v((lqk) hqkVarS.F, iskVar);
            }
            return (lqk) hqkVarS.a();
        } catch (Throwable th) {
            jyj.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static irk c(int i, isk iskVar) {
        try {
            qqk qqkVarQ = irk.q();
            qqkVarQ.g(i);
            if (!iskVar.equals(isk.BROADCAST_ACTION_UNSPECIFIED)) {
                qqkVarQ.c(iskVar);
            }
            return (irk) qqkVarQ.a();
        } catch (Exception e) {
            jyj.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
