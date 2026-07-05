package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class rw8 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ koc G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw8(int i, tp4 tp4Var, koc kocVar) {
        super(2, tp4Var);
        this.E = i;
        this.G = kocVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new rw8(0, tp4Var, this.G);
            case 1:
                return new rw8(1, tp4Var, this.G);
            case 2:
                return new rw8(2, tp4Var, this.G);
            case 3:
                return new rw8(3, tp4Var, this.G);
            default:
                return new rw8(4, tp4Var, this.G);
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
        return ((rw8) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Object objF2;
        int i = this.E;
        koc kocVar = this.G;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    int iH = ((isc) kocVar.d.G).h() - 1;
                    this.F = 1;
                    if (kocVar.f(iH, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7), this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return ieiVar;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    int iH2 = ((isc) kocVar.d.G).h() + 1;
                    this.F = 1;
                    if (kocVar.f(iH2, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7), this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return ieiVar;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    loc locVar = moc.a;
                    if (((isc) kocVar.d.G).h() - 1 < 0 || (objF = kocVar.f(((isc) kocVar.d.G).h() - 1, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7), this)) != m45Var) {
                        objF = ieiVar;
                    }
                    if (objF == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return ieiVar;
            case 3:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    loc locVar2 = moc.a;
                    if (((isc) kocVar.d.G).h() + 1 >= kocVar.l() || (objF2 = kocVar.f(((isc) kocVar.d.G).h() + 1, kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7), this)) != m45Var) {
                        objF2 = ieiVar;
                    }
                    if (objF2 == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i5 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return ieiVar;
            default:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    Object objC = kocVar.c(zwb.E, new vj(15), this);
                    if (objC != m45Var) {
                        objC = ieiVar;
                    }
                    if (objC == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i6 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return ieiVar;
        }
    }
}
