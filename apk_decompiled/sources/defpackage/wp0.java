package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class wp0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ xp0 G;
    public final /* synthetic */ tp0 H;
    public final /* synthetic */ zy7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp0(xp0 xp0Var, tp0 tp0Var, zy7 zy7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = xp0Var;
        this.H = tp0Var;
        this.I = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new wp0(this.G, this.H, this.I, tp4Var, 0);
            default:
                return new wp0(this.G, this.H, this.I, tp4Var, 1);
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
        return ((wp0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.I;
        tp0 tp0Var = this.H;
        xp0 xp0Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    Context context = xp0Var.e;
                    h86 h86Var = xp0Var.f;
                    this.F = 1;
                    String strA = rq0.a(tp0Var, context);
                    obj = strA == null ? Boolean.FALSE : rq0.c(context, tp0Var.a.g(), strA, h86Var, this);
                    if (obj == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    zy7Var.a();
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    Context context2 = xp0Var.e;
                    h86 h86Var2 = xp0Var.f;
                    this.F = 1;
                    obj = zr0.e(context2, tp0Var, h86Var2, this);
                    if (obj == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    zy7Var.a();
                }
                break;
        }
        return ieiVar;
    }
}
