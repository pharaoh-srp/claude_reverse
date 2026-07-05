package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vmd extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ wmd G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmd(wmd wmdVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = wmdVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        wmd wmdVar = this.G;
        switch (i) {
            case 0:
                return new vmd(wmdVar, tp4Var, 0);
            default:
                return new vmd(wmdVar, tp4Var, 1);
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
        return ((vmd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        wmd wmdVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    wqd wqdVar = wmdVar.c;
                    String strM809getProjectId5pmjbU = wmdVar.b.m809getProjectId5pmjbU();
                    this.F = 1;
                    wqdVar.getClass();
                    Object objN = fd9.N(new vo(wqdVar, strM809getProjectId5pmjbU, null), this);
                    if (objN == m45Var) {
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
                    wqd wqdVar2 = wmdVar.c;
                    String strM809getProjectId5pmjbU2 = wmdVar.b.m809getProjectId5pmjbU();
                    this.F = 1;
                    Object objH = wqdVar2.h(strM809getProjectId5pmjbU2, this);
                    if (objH == m45Var) {
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
