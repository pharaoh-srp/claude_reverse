package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ufh extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ sih G;
    public final /* synthetic */ e8d H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufh(tp4 tp4Var, e8d e8dVar, sih sihVar) {
        super(2, tp4Var);
        this.E = 3;
        this.H = e8dVar;
        this.G = sihVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        e8d e8dVar = this.H;
        sih sihVar = this.G;
        switch (i) {
            case 0:
                return new ufh(sihVar, e8dVar, tp4Var, 0);
            case 1:
                return new ufh(sihVar, e8dVar, tp4Var, 1);
            case 2:
                return new ufh(sihVar, e8dVar, tp4Var, 2);
            case 3:
                return new ufh(tp4Var, e8dVar, sihVar);
            default:
                return new ufh(sihVar, e8dVar, tp4Var, 4);
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
        return ((ufh) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        e8d e8dVar = this.H;
        iei ieiVar = iei.a;
        sih sihVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (sihVar.n(e8dVar, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (sihVar.n(e8dVar, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (sih.a(sihVar, e8dVar, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 3:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    gih gihVar = new gih(sihVar, 0);
                    this.F = 1;
                    if (x4h.f(this.H, null, null, null, gihVar, this, 7) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (sihVar.n(e8dVar, this) == m45Var) {
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ufh(sih sihVar, e8d e8dVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = sihVar;
        this.H = e8dVar;
    }
}
