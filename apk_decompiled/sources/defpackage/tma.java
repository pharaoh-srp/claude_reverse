package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tma extends xzg implements bz7 {
    public final /* synthetic */ uma E;
    public final /* synthetic */ bna F;
    public final /* synthetic */ float G;
    public final /* synthetic */ int H;
    public final /* synthetic */ boolean I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tma(uma umaVar, bna bnaVar, float f, int i, boolean z, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = umaVar;
        this.F = bnaVar;
        this.G = f;
        this.H = i;
        this.I = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new tma(this.E, this.F, this.G, this.H, this.I, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        tma tmaVar = (tma) create((tp4) obj);
        iei ieiVar = iei.a;
        tmaVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        bna bnaVar = this.F;
        uma umaVar = this.E;
        umaVar.M.setValue(bnaVar);
        umaVar.i(this.G);
        umaVar.h(this.H);
        umaVar.E.setValue(Boolean.FALSE);
        if (this.I) {
            umaVar.P.setValue(Long.MIN_VALUE);
        }
        return iei.a;
    }
}
