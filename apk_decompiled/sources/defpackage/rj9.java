package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rj9 extends or9 {
    public static final /* synthetic */ wn9[] h;
    public qj9 f;
    public final dfa g;

    static {
        kce kceVar = jce.a;
        h = new wn9[]{kceVar.g(new mrd(kceVar.b(rj9.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj9(gfa gfaVar) {
        super(gfaVar);
        sq6.a(1);
        this.g = new dfa(gfaVar, new mx1(this, 7, gfaVar));
        int iF = sq6.F(1);
        if (iF == 1) {
            c();
        } else {
            if (iF != 2) {
                return;
            }
            c();
        }
    }

    public final wj9 I() {
        return (wj9) wd6.s0(this.g, h[0]);
    }

    @Override // defpackage.or9
    public final bf d() {
        return I();
    }

    @Override // defpackage.or9
    public final Iterable l() {
        Iterable iterableL = super.l();
        uqb uqbVarK = k();
        uqbVarK.getClass();
        return w44.Z0(iterableL, new oj9(this.d, uqbVarK));
    }

    @Override // defpackage.or9
    public final x4d o() {
        return I();
    }
}
