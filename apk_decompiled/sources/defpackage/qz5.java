package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qz5 implements c9i {
    public final pz5 a;
    public final pz5 b;

    public qz5(c9i c9iVar) {
        this.a = new pz5(c9iVar, 0);
        this.b = new pz5(c9iVar, 1);
    }

    @Override // defpackage.c9i
    public final bz7 a() {
        return this.b;
    }

    @Override // defpackage.c9i
    public final bz7 b() {
        return this.a;
    }
}
