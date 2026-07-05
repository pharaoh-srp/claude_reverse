package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w19 {
    public boolean a;
    public int b;
    public Object c;
    public Object d;

    public static w19 b() {
        w19 w19Var = new w19();
        w19Var.a = true;
        w19Var.b = 0;
        return w19Var;
    }

    public w19 a() {
        dgj.n("execute parameter required", ((see) this.c) != null);
        jf7[] jf7VarArr = (jf7[]) this.d;
        boolean z = this.a;
        int i = this.b;
        w19 w19Var = new w19();
        w19Var.d = this;
        w19Var.c = jf7VarArr;
        boolean z2 = false;
        if (jf7VarArr != null && z) {
            z2 = true;
        }
        w19Var.a = z2;
        w19Var.b = i;
        return w19Var;
    }
}
