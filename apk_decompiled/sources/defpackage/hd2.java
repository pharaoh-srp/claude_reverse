package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hd2 extends xzg implements rz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public /* synthetic */ Object G;
    public /* synthetic */ float H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd2(aae aaeVar, eo7 eo7Var, q28 q28Var, float f, tp4 tp4Var) {
        super(3, tp4Var);
        this.I = aaeVar;
        this.J = eo7Var;
        this.K = q28Var;
        this.H = f;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.I;
        switch (i) {
            case 0:
                float fFloatValue = ((Number) obj2).floatValue();
                hd2 hd2Var = new hd2((od2) obj6, (ed2) obj5, (xd2) obj4, (tp4) obj3);
                hd2Var.G = obj;
                hd2Var.H = fFloatValue;
                return hd2Var.invokeSuspend(ieiVar);
            default:
                hd2 hd2Var2 = new hd2((aae) obj6, (eo7) obj5, (q28) obj4, this.H, (tp4) obj3);
                hd2Var2.G = (qy) obj;
                return hd2Var2.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        aae aaeVar;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.J;
        Object obj3 = this.I;
        Object obj4 = this.K;
        m45 m45Var = m45.E;
        int i2 = 1;
        switch (i) {
            case 0:
                Object obj5 = this.G;
                float f = this.H;
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                this.G = null;
                this.H = f;
                this.F = 1;
                return od2.a((od2) obj3, obj5, f, (ed2) obj2, (xd2) obj4, this) == m45Var ? m45Var : ieiVar;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    iy iyVar = new iy((q28) obj4, i2, (qy) this.G);
                    aae aaeVar2 = (aae) obj3;
                    float f2 = this.H;
                    this.G = aaeVar2;
                    this.F = 1;
                    Object objA = ((eo7) obj2).a(iyVar, f2, this);
                    if (objA == m45Var) {
                        return m45Var;
                    }
                    obj = objA;
                    aaeVar = aaeVar2;
                } else {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aaeVar = (aae) this.G;
                    sf5.h0(obj);
                }
                aaeVar.E = ((Number) obj).floatValue();
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd2(od2 od2Var, ed2 ed2Var, xd2 xd2Var, tp4 tp4Var) {
        super(3, tp4Var);
        this.I = od2Var;
        this.J = ed2Var;
        this.K = xd2Var;
    }
}
