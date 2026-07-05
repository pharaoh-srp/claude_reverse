package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qma extends xzg implements bz7 {
    public int E;
    public final /* synthetic */ uma F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ float J;
    public final /* synthetic */ ana K;
    public final /* synthetic */ bna L;
    public final /* synthetic */ float M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qma(uma umaVar, int i, int i2, boolean z, float f, ana anaVar, bna bnaVar, float f2, tp4 tp4Var) {
        super(1, tp4Var);
        this.F = umaVar;
        this.G = i;
        this.H = i2;
        this.I = z;
        this.J = f;
        this.K = anaVar;
        this.L = bnaVar;
        this.M = f2;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new qma(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((qma) create((tp4) obj)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        uma umaVar = this.F;
        try {
            if (i == 0) {
                sf5.h0(obj);
                umaVar.h(this.G);
                lsc lscVar = umaVar.E;
                lsc lscVar2 = umaVar.G;
                int i2 = this.H;
                lscVar2.setValue(Integer.valueOf(i2));
                umaVar.H.setValue(Boolean.valueOf(this.I));
                lsc lscVar3 = umaVar.J;
                float f = this.J;
                lscVar3.setValue(Float.valueOf(f));
                umaVar.I.setValue(this.K);
                lsc lscVar4 = umaVar.M;
                bna bnaVar = this.L;
                lscVar4.setValue(bnaVar);
                umaVar.i(this.M);
                lsc lscVar5 = umaVar.K;
                Boolean bool = Boolean.FALSE;
                lscVar5.setValue(bool);
                umaVar.P.setValue(Long.MIN_VALUE);
                if (bnaVar == null) {
                    lscVar.setValue(bool);
                    return ieiVar;
                }
                if (Float.isInfinite(f)) {
                    umaVar.i(umaVar.e());
                    lscVar.setValue(bool);
                    umaVar.h(i2);
                    return ieiVar;
                }
                lscVar.setValue(Boolean.TRUE);
                im6 im6Var = im6.E;
                bn5 bn5Var = new bn5(knk.z(getContext()), this.H, this.G, this.F, (tp4) null);
                this.E = 1;
                Object objC0 = gb9.c0(im6Var, bn5Var, this);
                m45 m45Var = m45.E;
                if (objC0 == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
            }
            knk.u(getContext());
            uma.d(umaVar, false);
            return ieiVar;
        } catch (Throwable th) {
            uma.d(umaVar, false);
            throw th;
        }
    }
}
