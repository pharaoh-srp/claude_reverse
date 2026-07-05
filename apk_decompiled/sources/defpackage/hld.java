package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hld extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ ild G;
    public final /* synthetic */ boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hld(ild ildVar, boolean z, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = ildVar;
        this.H = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        boolean z = this.H;
        ild ildVar = this.G;
        switch (i) {
            case 0:
                return new hld(ildVar, z, tp4Var, 0);
            default:
                return new hld(ildVar, z, tp4Var, 1);
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
        return ((hld) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.H;
        ild ildVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    wqd wqdVar = ildVar.g;
                    String strM789getProjectId5pmjbU = ildVar.b.m789getProjectId5pmjbU();
                    this.F = 1;
                    if (wqdVar.u(this, strM789getProjectId5pmjbU, z) == m45Var) {
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
                    wqd wqdVar2 = ildVar.g;
                    String strM789getProjectId5pmjbU2 = ildVar.b.m789getProjectId5pmjbU();
                    this.F = 1;
                    if (wqdVar2.x(this, strM789getProjectId5pmjbU2, z) == m45Var) {
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
