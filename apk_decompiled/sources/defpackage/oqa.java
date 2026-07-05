package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oqa implements wsa {
    public final n88 a;
    public final pz7 b;
    public final Object c;

    public oqa(n88 n88Var, pz7 pz7Var, Object obj) {
        n88Var.getClass();
        pz7Var.getClass();
        obj.getClass();
        this.a = n88Var;
        this.b = pz7Var;
        this.c = obj;
    }

    @Override // defpackage.wsa
    public final void a() {
        this.b.invoke(this.a, null);
    }

    @Override // defpackage.wsa
    public final void b() {
        this.b.invoke(this.a, this.c);
    }

    @Override // defpackage.wsa
    public final void c() {
        this.b.invoke(this.a, null);
    }
}
