package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wn extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public final /* synthetic */ List G;
    public final /* synthetic */ x0a H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(x0a x0aVar, List list, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = x0aVar;
        this.G = list;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new wn(this.H, this.G, tp4Var);
            default:
                return new wn(this.G, this.H, tp4Var);
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
        return ((wn) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        List list = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    bae baeVar = new bae();
                    dae daeVar = new dae();
                    z9e z9eVar = new z9e();
                    x0a x0aVar = this.H;
                    b3f b3fVarD0 = mpk.d0(new k6(x0aVar, 6, list));
                    vn vnVar = new vn(baeVar, daeVar, z9eVar, x0aVar, 0);
                    this.F = 1;
                    if (b3fVarD0.a(vnVar, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    if (!list.isEmpty()) {
                        int iM = x44.M(list);
                        this.F = 1;
                        y5f y5fVar = x0a.y;
                        if (this.H.f(iM, 0, this) == m45Var) {
                        }
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(List list, x0a x0aVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = list;
        this.H = x0aVar;
    }
}
