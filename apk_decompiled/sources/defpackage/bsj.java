package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bsj {
    public static uwi a(qh9 qh9Var) {
        try {
            return new uwi(qh9Var.s("count").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type LongTask", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type LongTask", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type LongTask", e3);
            return null;
        }
    }

    public static void b(int i) {
        boolean z = true;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
            }
        }
        dgj.p(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }

    public static String c(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        mr9.y();
        return null;
    }
}
