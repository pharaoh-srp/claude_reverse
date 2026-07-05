package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vz1 extends xmc implements wmc {
    public final qz1 K;
    public final q28 L;
    public final dpf M;
    public atd N;
    public n16 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz1(ww7 ww7Var, gfa gfaVar, tqb tqbVar, atd atdVar, qz1 qz1Var) {
        super(tqbVar, ww7Var);
        ww7Var.getClass();
        tqbVar.getClass();
        this.K = qz1Var;
        itd itdVar = atdVar.H;
        itdVar.getClass();
        htd htdVar = atdVar.I;
        htdVar.getClass();
        q28 q28Var = new q28(itdVar, htdVar);
        this.L = q28Var;
        this.M = new dpf(atdVar, q28Var, qz1Var, new lxe(13, this));
        this.N = atdVar;
    }

    @Override // defpackage.wmc
    public final fab G() {
        n16 n16Var = this.O;
        if (n16Var != null) {
            return n16Var;
        }
        x44.o0("_memberScope");
        throw null;
    }

    public final void O0(r06 r06Var) {
        r06Var.getClass();
        atd atdVar = this.N;
        if (atdVar == null) {
            sz6.j("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.N = null;
        ysd ysdVar = atdVar.J;
        ysdVar.getClass();
        this.O = new n16(this, ysdVar, this.L, this.K, null, r06Var, "scope of " + this, new l4(13, this));
    }

    @Override // defpackage.xmc, defpackage.co5
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.I);
        sb.append(" from ");
        int i = o06.a;
        tqb tqbVarD = m06.d(this);
        tqbVarD.getClass();
        sb.append(tqbVarD);
        return sb.toString();
    }
}
