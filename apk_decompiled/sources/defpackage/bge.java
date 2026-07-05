package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bge extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ dge G;
    public final /* synthetic */ ja8 H;
    public final /* synthetic */ aae I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bge(dge dgeVar, ja8 ja8Var, aae aaeVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = dgeVar;
        this.H = ja8Var;
        this.I = aaeVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new bge(this.G, this.H, this.I, tp4Var, 0);
            default:
                return new bge(this.G, this.H, this.I, tp4Var, 1);
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
        return ((bge) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        aae aaeVar = this.I;
        m45 m45Var = m45.E;
        dge dgeVar = this.G;
        ja8 ja8Var = this.H;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    float f = aaeVar.E;
                    this.F = 1;
                    if (dge.a(dgeVar, ja8Var, f, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                ((ga8) yb5.o(dgeVar.a, ve4.g)).a(ja8Var);
                break;
            default:
                gg8 gg8Var = dgeVar.a;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    float f2 = aaeVar.E;
                    this.F = 1;
                    if (dge.a(dgeVar, ja8Var, f2, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                ((ga8) yb5.o(gg8Var, ve4.g)).a(ja8Var);
                if (dgeVar.f) {
                    wd6.t0(gg8Var);
                }
                break;
        }
        return ieiVar;
    }
}
