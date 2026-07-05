package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dff extends xzg implements bz7 {
    public int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ gff H;
    public final /* synthetic */ a6i I;
    public final /* synthetic */ float J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dff(Object obj, Object obj2, gff gffVar, a6i a6iVar, float f, tp4 tp4Var) {
        super(1, tp4Var);
        this.F = obj;
        this.G = obj2;
        this.H = gffVar;
        this.I = a6iVar;
        this.J = f;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new dff(this.F, this.G, this.H, this.I, this.J, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((dff) create((tp4) obj)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            cff cffVar = new cff(this.F, this.G, this.H, this.I, this.J, null);
            this.E = 1;
            Object objN = fd9.N(cffVar, this);
            m45 m45Var = m45.E;
            if (objN == m45Var) {
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
