package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bo6 {
    public static final bo6 b = new bo6(new zl4(5));
    public static final bo6 c = new bo6(new yl4());
    public final ao6 a;

    static {
        int i = 6;
        new bo6(new am4(i));
        new bo6(new zl4(i));
        new bo6(new am4(5));
        new bo6(new cm4());
        new bo6(new bm4());
    }

    public bo6(qo6 qo6Var) {
        if (hrh.a()) {
            this.a = new zn6(qo6Var, 1);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.a = new zn6(qo6Var, 0);
        } else {
            this.a = new poj(qo6Var);
        }
    }
}
