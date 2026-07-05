package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class oqi {
    public bz7 a;

    public abstract void a(xd6 xd6Var);

    public bz7 b() {
        return this.a;
    }

    public final void c() {
        bz7 bz7VarB = b();
        if (bz7VarB != null) {
            bz7VarB.invoke(this);
        }
    }

    public void d(e0 e0Var) {
        this.a = e0Var;
    }
}
