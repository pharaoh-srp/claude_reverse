package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z3l {
    public static final iqk a;
    public static final iqk b;
    public static final iqk c;
    public static final iqk d;
    public static final iqk e;
    public static final iqk f;

    static {
        bm7 bm7Var = new bm7(rpk.a("com.google.android.gms.measurement"), "", "", true, true);
        a = bm7Var.g("measurement.test.boolean_flag", false);
        b = bm7Var.e(-1L, "measurement.test.cached_long_flag");
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = iqk.g;
        c = new iqk(bm7Var, "measurement.test.double_flag", dValueOf, 3);
        d = bm7Var.e(-2L, "measurement.test.int_flag");
        e = bm7Var.e(-1L, "measurement.test.long_flag");
        f = bm7Var.f("measurement.test.string_flag", "---");
    }
}
