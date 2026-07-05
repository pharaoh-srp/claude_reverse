package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ekj extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ float F;
    public final /* synthetic */ gkj G;
    public final /* synthetic */ long H;
    public final /* synthetic */ yig I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekj(float f, gkj gkjVar, long j, yig yigVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = f;
        this.G = gkjVar;
        this.H = j;
        this.I = yigVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        ekj ekjVar = new ekj(this.F, this.G, this.H, this.I, tp4Var);
        ekjVar.E = obj;
        return ekjVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((ekj) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        l45 l45Var = (l45) this.E;
        gkj gkjVar = this.G;
        gkjVar.getClass();
        float fD0 = wd6.d0(this.F, 1.0f, 5.0f);
        long jB = gkj.b(this.G, fD0, this.H, 0L);
        l9e l9eVarA = gkj.a(gkjVar, fD0);
        float fD02 = wd6.d0(fcc.f(jB), l9eVarA.a, l9eVarA.c);
        gkj gkjVar2 = this.G;
        yig yigVar = this.I;
        gb9.D(l45Var, null, null, new dkj(gkjVar2, fD02, yigVar, l9eVarA, null, 0), 3);
        gb9.D(l45Var, null, null, new dkj(this.G, wd6.d0(fcc.g(jB), l9eVarA.b, l9eVarA.d), yigVar, l9eVarA, null, 1), 3);
        return gb9.D(l45Var, null, null, new kj1(gkjVar, fD0, yigVar, (tp4) null, 4), 3);
    }
}
