package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kv4 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ lv4 G;
    public final /* synthetic */ String H;
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv4(long j, lv4 lv4Var, String str, int i, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = j;
        this.G = lv4Var;
        this.H = str;
        this.I = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new kv4(this.F, this.G, this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((kv4) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            this.E = 1;
            Object objK = d4c.K(this.F, this);
            m45 m45Var = m45.E;
            if (objK == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        lv4 lv4Var = this.G;
        lv4Var.k = null;
        lv4Var.h = null;
        lv4Var.a(this.I, this.H);
        return iei.a;
    }
}
