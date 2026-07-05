package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qw8 extends xzg implements rz7 {
    public /* synthetic */ float E;
    public final /* synthetic */ float F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ l45 H;
    public final /* synthetic */ nwb I;
    public final /* synthetic */ hsc J;
    public final /* synthetic */ gw8 K;
    public final /* synthetic */ nwb L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw8(float f, zy7 zy7Var, l45 l45Var, nwb nwbVar, hsc hscVar, gw8 gw8Var, nwb nwbVar2, tp4 tp4Var) {
        super(3, tp4Var);
        this.F = f;
        this.G = zy7Var;
        this.H = l45Var;
        this.I = nwbVar;
        this.J = hscVar;
        this.K = gw8Var;
        this.L = nwbVar2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        gw8 gw8Var = this.K;
        nwb nwbVar = this.L;
        qw8 qw8Var = new qw8(this.F, this.G, this.H, this.I, this.J, gw8Var, nwbVar, (tp4) obj3);
        qw8Var.E = fFloatValue;
        iei ieiVar = iei.a;
        qw8Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        float f = this.E;
        sf5.h0(obj);
        float f2 = tw8.b;
        this.I.setValue(Boolean.FALSE);
        hsc hscVar = this.J;
        if (Math.abs(hscVar.h()) > this.F || Math.abs(f) > 1200.0f) {
            this.G.a();
        } else {
            this.L.setValue(gb9.D(this.H, null, null, new ix5(this.K, hscVar, null, 19), 3));
        }
        return iei.a;
    }
}
