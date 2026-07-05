package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class by9 extends xmc {
    public static final /* synthetic */ wn9[] Q;
    public final ube K;
    public final el5 L;
    public final dfa M;
    public final mk9 N;
    public final yea O;
    public final wc0 P;

    static {
        kce kceVar = jce.a;
        Q = new wn9[]{kceVar.g(new mrd(kceVar.b(by9.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), kceVar.g(new mrd(kceVar.b(by9.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public by9(el5 el5Var, ube ubeVar) {
        el5Var.getClass();
        ke9 ke9Var = (ke9) el5Var.E;
        super(ke9Var.o, ubeVar.a);
        this.K = ubeVar;
        el5 el5VarT = mwa.t(el5Var, this, null, 6);
        this.L = el5VarT;
        ke9Var.d.c().c.getClass();
        jk9 jk9Var = jk9.g;
        ke9 ke9Var2 = (ke9) el5VarT.E;
        gfa gfaVar = ke9Var2.a;
        ay9 ay9Var = new ay9(this, 0);
        gfaVar.getClass();
        this.M = new dfa(gfaVar, ay9Var);
        this.N = new mk9(el5VarT, ubeVar, this);
        ay9 ay9Var2 = new ay9(this, 2);
        gfaVar.getClass();
        this.O = new yea(gfaVar, ay9Var2);
        this.P = ke9Var2.v.b ? dd8.F : mpk.a0(el5VarT, ubeVar);
        gfaVar.a(new ay9(this, 1));
    }

    @Override // defpackage.wmc
    public final fab G() {
        return this.N;
    }

    @Override // defpackage.xmc, defpackage.eo5, defpackage.do5
    public final neg d() {
        return new ax5(16, this);
    }

    @Override // defpackage.rok, defpackage.ub0
    public final wc0 getAnnotations() {
        return this.P;
    }

    @Override // defpackage.xmc, defpackage.co5
    public final String toString() {
        return "Lazy Java package fragment: " + this.I + " of module " + ((ke9) this.L.E).o;
    }
}
