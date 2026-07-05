package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ai5 extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ bi5 G;
    public final /* synthetic */ bae H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ boolean J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai5(bi5 bi5Var, bae baeVar, Object obj, boolean z, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = bi5Var;
        this.H = baeVar;
        this.I = obj;
        this.J = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        ai5 ai5Var = new ai5(this.G, this.H, this.I, this.J, tp4Var);
        ai5Var.F = obj;
        return ai5Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((ai5) create((lk7) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        lk7 lk7Var = (lk7) this.F;
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            this.G.getClass();
            zh5 zh5Var = new zh5(this.H, this.G, lk7Var, this.I, this.J, null);
            this.F = null;
            this.E = 1;
            Object objY = zh4.y(this, zh5Var);
            m45 m45Var = m45.E;
            if (objY == m45Var) {
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
