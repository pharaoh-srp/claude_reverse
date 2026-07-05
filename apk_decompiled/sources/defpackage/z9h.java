package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z9h extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ aah G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9h(aah aahVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = aahVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        aah aahVar = this.G;
        switch (i) {
            case 0:
                return new z9h(aahVar, tp4Var, 0);
            default:
                return new z9h(aahVar, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((z9h) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        aah aahVar = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    int iH = aahVar.j.h();
                    this.F = 1;
                    return aah.O(aahVar, iH, this) == m45Var ? m45Var : ieiVar;
                }
                if (i2 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                lsc lscVar = aahVar.f;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    lscVar.setValue(Boolean.TRUE);
                    aahVar.d.i(aahVar.c.a());
                    this.F = 1;
                    if (aah.O(aahVar, 0, this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                lscVar.setValue(Boolean.FALSE);
                return ieiVar;
        }
    }
}
