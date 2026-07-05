package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b6f implements x5f {
    public final /* synthetic */ pz7 a;
    public final /* synthetic */ bz7 b;

    public b6f(bz7 bz7Var, pz7 pz7Var) {
        this.a = pz7Var;
        this.b = bz7Var;
    }

    @Override // defpackage.x5f
    public final Object a(Object obj) {
        return this.b.invoke(obj);
    }

    @Override // defpackage.x5f
    public final Object b(y4f y4fVar, Object obj) {
        return this.a.invoke(y4fVar, obj);
    }
}
