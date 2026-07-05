package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w66 extends xzg implements pz7 {
    public final /* synthetic */ Object E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ zy7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w66(Object obj, boolean z, boolean z2, zy7 zy7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = obj;
        this.F = z;
        this.G = z2;
        this.H = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new w66(this.E, this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        w66 w66Var = (w66) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        w66Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        if (this.E == null && (this.F || this.G)) {
            this.H.a();
        }
        return iei.a;
    }
}
