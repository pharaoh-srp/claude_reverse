package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xff {
    public final Object a;
    public final rz7 b;
    public final rz7 c;
    public final Object d;
    public final xzg e;
    public final rz7 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ zff i;

    public xff(zff zffVar, Object obj, rz7 rz7Var, rz7 rz7Var2, sqb sqbVar, xzg xzgVar, rz7 rz7Var3) {
        this.i = zffVar;
        this.a = obj;
        this.b = rz7Var;
        this.c = rz7Var2;
        this.d = sqbVar;
        this.e = xzgVar;
        this.f = rz7Var3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof lff) {
            ((lff) obj).m(this.h, this.i.E);
            return;
        }
        y86 y86Var = obj instanceof y86 ? (y86) obj : null;
        if (y86Var != null) {
            y86Var.a();
        }
    }
}
