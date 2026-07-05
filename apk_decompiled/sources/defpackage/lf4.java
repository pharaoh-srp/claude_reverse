package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lf4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ rz7 G;
    public final /* synthetic */ ldd H;
    public final /* synthetic */ z7d I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf4(rz7 rz7Var, ldd lddVar, z7d z7dVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = rz7Var;
        this.H = lddVar;
        this.I = z7dVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new lf4(this.G, this.H, this.I, tp4Var, 0);
            default:
                return new lf4(this.G, this.H, this.I, tp4Var, 1);
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
        return ((lf4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        z7d z7dVar = this.I;
        ldd lddVar = this.H;
        rz7 rz7Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    fcc fccVar = new fcc(z7dVar.c);
                    this.F = 1;
                    if (rz7Var.invoke(lddVar, fccVar, this) == m45Var) {
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
                    fcc fccVar2 = new fcc(z7dVar.c);
                    this.F = 1;
                    if (rz7Var.invoke(lddVar, fccVar2, this) == m45Var) {
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
