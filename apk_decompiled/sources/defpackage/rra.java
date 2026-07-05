package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class rra extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ koc G;
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rra(koc kocVar, int i, tp4 tp4Var, int i2) {
        super(2, tp4Var);
        this.E = i2;
        this.G = kocVar;
        this.H = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new rra(this.G, this.H, tp4Var, 0);
            case 1:
                return new rra(this.G, this.H, tp4Var, 1);
            case 2:
                return new rra(this.G, this.H, tp4Var, 2);
            default:
                return new rra(this.G, this.H, tp4Var, 3);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((rra) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((rra) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((rra) create((h9f) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((rra) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        koc kocVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    return kocVar.f(i2, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7), this) == m45Var ? m45Var : ieiVar;
                }
                if (i3 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    return kocVar.f(i2, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7), this) == m45Var ? m45Var : ieiVar;
                }
                if (i4 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (kocVar.i(this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i5 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                kocVar.s(kocVar.j(i2), MTTypesetterKt.kLineSkipLimitMultiplier, true);
                return ieiVar;
            default:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    return kocVar.f(i2, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7), this) == m45Var ? m45Var : ieiVar;
                }
                if (i6 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
