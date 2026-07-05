package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class k46 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ float G;
    public final /* synthetic */ qx1 H;
    public final /* synthetic */ nwb I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k46(float f, qx1 qx1Var, nwb nwbVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = f;
        this.H = qx1Var;
        this.I = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new k46(this.G, this.H, this.I, tp4Var, 0);
            default:
                return new k46(this.G, this.H, this.I, tp4Var, 1);
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
        return ((k46) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        qx1 qx1Var = this.H;
        float f = this.G;
        nwb nwbVar = this.I;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    if (((Number) nwbVar.getValue()).intValue() > 0) {
                        l9e l9eVar = new l9e(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, ((Number) nwbVar.getValue()).intValue() + f);
                        this.F = 1;
                        if (qx1Var.a(l9eVar, this) == m45Var) {
                        }
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
                    this.F = 1;
                    if (d4c.K(300L, this) != m45Var) {
                    }
                } else if (i3 == 1) {
                    sf5.h0(obj);
                } else if (i3 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                l9e l9eVar2 = new l9e(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, ((Number) nwbVar.getValue()).intValue() + f);
                this.F = 2;
                if (qx1Var.a(l9eVar2, this) != m45Var) {
                }
                break;
        }
        return m45Var;
    }
}
