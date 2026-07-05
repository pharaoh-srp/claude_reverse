package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o77 implements hba, t0h {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ o77(int i, v6d v6dVar, v6d v6dVar2) {
        this.E = i;
        this.F = v6dVar;
        this.G = v6dVar2;
    }

    @Override // defpackage.t0h
    public Object execute() {
        wk wkVar = (wk) this.F;
        ((fj0) wkVar.f).I((g91) this.G, this.E + 1, false);
        return null;
    }

    @Override // defpackage.hba
    public void invoke(Object obj) {
        v6d v6dVar = (v6d) this.F;
        v6d v6dVar2 = (v6d) this.G;
        u6d u6dVar = (u6d) obj;
        u6dVar.getClass();
        u6dVar.n(this.E, v6dVar, v6dVar2);
    }

    public /* synthetic */ o77(wk wkVar, g91 g91Var, int i) {
        this.F = wkVar;
        this.G = g91Var;
        this.E = i;
    }
}
