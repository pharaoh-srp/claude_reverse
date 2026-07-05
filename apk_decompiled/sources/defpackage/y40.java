package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class y40 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ e50 G;
    public final /* synthetic */ za1 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y40(e50 e50Var, za1 za1Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = e50Var;
        this.H = za1Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new y40(this.G, this.H, tp4Var, 0);
            default:
                return new y40(this.G, this.H, tp4Var, 1);
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
        return ((y40) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        za1 za1Var = this.H;
        e50 e50Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    a80 a80Var = e50Var.a;
                    float f = za1Var.a;
                    Float f2 = new Float(f < 0.05f ? f : 1.0f);
                    this.F = 1;
                    if (a80.c(a80Var, f2, null, null, this, 14) == m45Var) {
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
                    a80 a80Var2 = e50Var.c;
                    float f3 = za1Var.a;
                    Float f4 = new Float(f3 < 0.05f ? MTTypesetterKt.kLineSkipLimitMultiplier : d4c.W(0.4f, 1.0f, (f3 - 0.05f) / 0.95f));
                    this.F = 1;
                    if (a80.c(a80Var2, f4, null, null, this, 14) == m45Var) {
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
}
