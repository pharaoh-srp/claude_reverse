package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cff extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ gff I;
    public final /* synthetic */ a6i J;
    public final /* synthetic */ float K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cff(Object obj, Object obj2, gff gffVar, a6i a6iVar, float f, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = obj;
        this.H = obj2;
        this.I = gffVar;
        this.J = a6iVar;
        this.K = f;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        cff cffVar = new cff(this.G, this.H, this.I, this.J, this.K, tp4Var);
        cffVar.F = obj;
        return cffVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((cff) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        gff gffVar = this.I;
        if (i == 0) {
            sf5.h0(obj);
            l45 l45Var = (l45) this.F;
            Object obj2 = this.G;
            Object obj3 = this.H;
            if (obj2.equals(obj3)) {
                gffVar.S = null;
                if (x44.r(gffVar.G.getValue(), obj2)) {
                    return ieiVar;
                }
            } else {
                gff.L0(gffVar);
            }
            boolean zEquals = obj2.equals(obj3);
            float f = this.K;
            if (!zEquals) {
                a6i a6iVar = this.J;
                a6iVar.p(obj2);
                a6iVar.n(0L);
                gffVar.F.setValue(obj2);
                a6iVar.j(f);
            }
            gffVar.U0(f);
            if (gffVar.R.i()) {
                gb9.D(l45Var, null, null, new bff(gffVar, null, 0), 3);
            } else {
                gffVar.Q = Long.MIN_VALUE;
            }
            this.E = 1;
            Object objO0 = gff.O0(gffVar, this);
            m45 m45Var = m45.E;
            if (objO0 == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        gffVar.T0();
        return ieiVar;
    }
}
