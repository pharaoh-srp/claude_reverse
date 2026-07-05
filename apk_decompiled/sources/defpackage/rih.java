package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rih extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ sih G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rih(sih sihVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = sihVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new rih(this.G, tp4Var, 0);
            default:
                return new rih(this.G, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((rih) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        sih sihVar = this.G;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    sihVar.getClass();
                    b3f b3fVarD0 = mpk.d0(new lf1(sihVar, 5));
                    kih kihVar = kih.E;
                    u9e u9eVar = j8.e;
                    nai.n(2, kihVar);
                    Object objA = j8.B(b3fVarD0, u9eVar, kihVar).a(new q73(new bae(), 3, new lih(sihVar, 0)), this);
                    if (objA != m45Var) {
                        objA = ieiVar;
                    }
                    if (objA != m45Var) {
                        objA = ieiVar;
                    }
                    if (objA == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    sihVar.getClass();
                    kp7 kp7VarD0 = mpk.d0(new lf1(sihVar, 4));
                    if (knk.j) {
                        kp7VarD0 = j8.B(kp7VarD0, new yeg(13), j8.f);
                    }
                    Object objA2 = kp7VarD0.a(new lih(sihVar, 1), this);
                    if (objA2 != m45Var) {
                        objA2 = ieiVar;
                    }
                    if (objA2 == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
