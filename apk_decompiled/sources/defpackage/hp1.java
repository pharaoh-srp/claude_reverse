package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hp1 {
    public int a;
    public int b;
    public String c;

    public static gp1 a() {
        gp1 gp1Var = new gp1();
        gp1Var.F = 0;
        gp1Var.G = "";
        return gp1Var;
    }

    public final String toString() {
        int i = this.a;
        int i2 = jyj.a;
        return ij0.k("Response Code: ", duj.a(i).toString(), ", Debug Message: ", this.c);
    }
}
