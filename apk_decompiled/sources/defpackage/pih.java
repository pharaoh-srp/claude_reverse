package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pih extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public final /* synthetic */ sih G;
    public final /* synthetic */ e8d H;
    public final /* synthetic */ boolean I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pih(e8d e8dVar, sih sihVar, boolean z, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = e8dVar;
        this.G = sihVar;
        this.I = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        boolean z = this.I;
        e8d e8dVar = this.H;
        sih sihVar = this.G;
        switch (i) {
            case 0:
                return new pih(e8dVar, sihVar, z, tp4Var);
            default:
                return new pih(sihVar, e8dVar, z, tp4Var);
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
        return ((pih) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.I;
        e8d e8dVar = this.H;
        sih sihVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    z5l z5lVar = new z5l(sihVar, z, 5);
                    oih oihVar = new oih(sihVar, 0);
                    this.F = 1;
                    Object objF = pok.f(e8dVar, new ug1(z5lVar, oihVar, null, 4), this);
                    if (objF != m45Var) {
                        objF = ieiVar;
                    }
                    if (objF == m45Var) {
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
                    if (sih.b(sihVar, e8dVar, z, this) == m45Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pih(sih sihVar, e8d e8dVar, boolean z, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = sihVar;
        this.H = e8dVar;
        this.I = z;
    }
}
