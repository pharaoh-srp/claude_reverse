package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hb9 extends fre {
    public int E;
    public final /* synthetic */ pz7 F;
    public final /* synthetic */ tp4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb9(tp4 tp4Var, tp4 tp4Var2, pz7 pz7Var) {
        super(tp4Var);
        this.F = pz7Var;
        this.G = tp4Var2;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i != 0) {
            if (i != 1) {
                sz6.j("This coroutine had already completed");
                return null;
            }
            this.E = 2;
            sf5.h0(obj);
            return obj;
        }
        this.E = 1;
        sf5.h0(obj);
        pz7 pz7Var = this.F;
        pz7Var.getClass();
        nai.n(2, pz7Var);
        return pz7Var.invoke(this.G, this);
    }
}
