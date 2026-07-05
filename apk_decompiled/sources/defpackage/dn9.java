package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dn9 extends gm9 {
    public static final /* synthetic */ wn9[] g;
    public final ece c;
    public final ece d;
    public final fce e;
    public final fce f;

    static {
        kce kceVar = jce.a;
        g = new wn9[]{kceVar.g(new mrd(kceVar.b(dn9.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), kceVar.g(new mrd(kceVar.b(dn9.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), kceVar.g(new mrd(kceVar.b(dn9.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), kceVar.g(new mrd(kceVar.b(dn9.class), "metadata", "getMetadata()Lkotlin/Triple;")), kceVar.g(new mrd(kceVar.b(dn9.class), "members", "getMembers()Ljava/util/Collection;"))};
    }

    public dn9(fn9 fn9Var) {
        super(fn9Var);
        this.c = csg.C(null, new v01(22, fn9Var));
        this.d = csg.C(null, new cn9(this, 1));
        this.e = new fce(new bn9(this, fn9Var));
        this.f = new fce(new cn9(this, 0));
        csg.C(null, new bn9(fn9Var, this));
    }

    public final r7i a() {
        wn9 wn9Var = g[3];
        return (r7i) this.f.a();
    }

    public final Class b() {
        wn9 wn9Var = g[2];
        return (Class) this.e.a();
    }

    public final fab c() {
        wn9 wn9Var = g[1];
        Object objA = this.d.a();
        objA.getClass();
        return (fab) objA;
    }
}
