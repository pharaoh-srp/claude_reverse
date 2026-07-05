package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rwb extends xzg implements bz7 {
    public int E;
    public final /* synthetic */ fj0 F;
    public final /* synthetic */ float G;
    public final /* synthetic */ toh H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwb(fj0 fj0Var, float f, toh tohVar, tp4 tp4Var) {
        super(1, tp4Var);
        this.F = fj0Var;
        this.G = f;
        this.H = tohVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new rwb(this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((rwb) create((tp4) obj)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            fj0 fj0Var = this.F;
            ((lsc) fj0Var.F).setValue(Boolean.TRUE);
            gff gffVar = (gff) fj0Var.E;
            this.E = 1;
            Object objS0 = gffVar.S0(this.G, this.H, this);
            m45 m45Var = m45.E;
            if (objS0 == m45Var) {
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
