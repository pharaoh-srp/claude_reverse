package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fph extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ gph G;
    public final /* synthetic */ float H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fph(gph gphVar, float f, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = gphVar;
        this.H = f;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        float f = this.H;
        gph gphVar = this.G;
        switch (i) {
            case 0:
                return new fph(gphVar, f, tp4Var, 0);
            default:
                return new fph(gphVar, f, tp4Var, 1);
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
        return ((fph) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        float f = this.H;
        m45 m45Var = m45.E;
        gph gphVar = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    a80 a80Var = gphVar.X;
                    if (a80Var != null) {
                        Float f2 = new Float(f);
                        mb0 mb0Var = gphVar.V ? q0h.f : gphVar.U;
                        this.F = 1;
                        obj = a80.c(a80Var, f2, mb0Var, null, this, 12);
                        if (obj == m45Var) {
                        }
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
                    a80 a80Var2 = gphVar.W;
                    if (a80Var2 != null) {
                        Float f3 = new Float(f);
                        mb0 mb0Var2 = gphVar.V ? q0h.f : gphVar.U;
                        this.F = 1;
                        obj = a80.c(a80Var2, f3, mb0Var2, null, this, 12);
                        if (obj == m45Var) {
                        }
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return ieiVar;
    }
}
