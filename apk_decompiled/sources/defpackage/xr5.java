package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xr5 {
    public boolean c;
    public float e;
    public int a = -1;
    public final wwb b = new wwb(0, new wz9[16]);
    public int d = -1;

    public static int a(dx9 dx9Var, boolean z) {
        ukc ukcVar = ukc.E;
        if (z) {
            ex9 ex9Var = (ex9) w44.U0(dx9Var.m);
            return (dx9Var.q == ukcVar ? ex9Var.u : ex9Var.v) + 1;
        }
        ex9 ex9Var2 = (ex9) w44.L0(dx9Var.m);
        return (dx9Var.q == ukcVar ? ex9Var2.u : ex9Var2.v) - 1;
    }
}
