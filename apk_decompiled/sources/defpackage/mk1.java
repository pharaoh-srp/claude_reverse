package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class mk1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ a80 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk1(boolean z, a80 a80Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = z;
        this.H = a80Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new mk1(this.G, this.H, tp4Var, 0);
            default:
                return new mk1(this.G, this.H, tp4Var, 1);
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
        return ((mk1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    if (z) {
                        Float f = new Float(1.0f);
                        yig yigVarK = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7);
                        this.F = 1;
                        if (a80.c(this.H, f, yigVarK, null, this, 12) == m45Var) {
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
                    a80 a80Var = this.H;
                    if (z) {
                        Float f2 = new Float(0.35f);
                        y19 y19VarZ = kxk.z(kxk.N(1600, 0, wi6.a, 2), fhe.F, 4);
                        this.F = 1;
                        if (a80.c(a80Var, f2, y19VarZ, null, this, 12) != m45Var) {
                        }
                    } else {
                        Float f3 = new Float(1.0f);
                        this.F = 2;
                        if (a80Var.g(this, f3) != m45Var) {
                        }
                    }
                } else if (i3 == 1 || i3 == 2) {
                    sf5.h0(obj);
                } else {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                }
                break;
        }
        return m45Var;
    }
}
