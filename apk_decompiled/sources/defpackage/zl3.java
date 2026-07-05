package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zl3 extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ x0a G;
    public final /* synthetic */ nwb H;
    public final /* synthetic */ nwb I;
    public final /* synthetic */ nwb J;
    public final /* synthetic */ nwb K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl3(boolean z, x0a x0aVar, nwb nwbVar, nwb nwbVar2, nwb nwbVar3, nwb nwbVar4, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = z;
        this.G = x0aVar;
        this.H = nwbVar;
        this.I = nwbVar2;
        this.J = nwbVar3;
        this.K = nwbVar4;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        zl3 zl3Var = new zl3(this.F, this.G, this.H, this.I, this.J, this.K, tp4Var);
        zl3Var.E = obj;
        return zl3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        zl3 zl3Var = (zl3) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        zl3Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        l45 l45Var = (l45) this.E;
        sf5.h0(obj);
        if (!this.F) {
            j8.T(new gq7(new v70(mpk.d0(new yl3(this.G, this.H, 0)), 2), new j43(this.I, this.G, this.J, this.K, null, 1), 2), l45Var);
        }
        return iei.a;
    }
}
