package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y7f {
    public static final lz1 d;
    public static final /* synthetic */ wn9[] e;
    public final i0 a;
    public final bz7 b;
    public final dfa c;

    static {
        kce kceVar = jce.a;
        e = new wn9[]{kceVar.g(new mrd(kceVar.b(y7f.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
        d = new lz1(28);
    }

    public y7f(i0 i0Var, gfa gfaVar, bz7 bz7Var) {
        this.a = i0Var;
        this.b = bz7Var;
        x7f x7fVar = new x7f(0, this);
        gfaVar.getClass();
        this.c = new dfa(gfaVar, x7fVar);
    }
}
