package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ckj extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ gkj F;
    public final /* synthetic */ float G;
    public final /* synthetic */ long H;
    public final /* synthetic */ long I;
    public final /* synthetic */ long J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckj(gkj gkjVar, float f, long j, long j2, long j3, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = gkjVar;
        this.G = f;
        this.H = j;
        this.I = j2;
        this.J = j3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        ckj ckjVar = new ckj(this.F, this.G, this.H, this.I, this.J, tp4Var);
        ckjVar.E = obj;
        return ckjVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ckj ckjVar = (ckj) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        ckjVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        l45 l45Var = (l45) this.E;
        gkj gkjVar = this.F;
        float fC = gkjVar.c();
        float f = this.G;
        float fD0 = wd6.d0(fC * f, 0.9f, 5.0f);
        long jB = gkj.b(this.F, fD0, this.H, this.I);
        l9e l9eVarA = gkj.a(gkjVar, fD0);
        gkjVar.c.i(new Float(l9eVarA.a), new Float(l9eVarA.c));
        tp4 tp4Var = null;
        gb9.D(l45Var, null, null, new bkj(gkjVar, jB, tp4Var, 0), 3);
        gkjVar.d.i(new Float(l9eVarA.b), new Float(l9eVarA.d));
        gb9.D(l45Var, null, null, new bkj(gkjVar, jB, tp4Var, 1), 3);
        gb9.D(l45Var, null, null, new jf5(gkjVar, fD0, tp4Var, 1), 3);
        fnf fnfVar = gkjVar.g;
        if (f == 1.0f) {
            ((qv5) fnfVar.F).a(this.J, this.H);
        } else {
            fnfVar.l();
        }
        return iei.a;
    }
}
