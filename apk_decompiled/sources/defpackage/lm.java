package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lm extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ vm F;
    public final /* synthetic */ String G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(vm vmVar, String str, boolean z, boolean z2, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = vmVar;
        this.G = str;
        this.H = z;
        this.I = z2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new lm(this.F, this.G, this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((lm) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            this.E = 1;
            Object objL = this.F.l(this.G, this.H, this.I, this);
            m45 m45Var = m45.E;
            if (objL == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }
}
