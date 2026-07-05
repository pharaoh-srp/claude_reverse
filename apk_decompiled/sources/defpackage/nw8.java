package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class nw8 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ gkj G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw8(gkj gkjVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = gkjVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new nw8(this.G, tp4Var, 0);
            case 1:
                return new nw8(this.G, tp4Var, 1);
            case 2:
                return new nw8(this.G, tp4Var, 2);
            case 3:
                return new nw8(this.G, tp4Var, 3);
            default:
                return new nw8(this.G, tp4Var, 4);
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
        return ((nw8) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        gkj gkjVar = this.G;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    gkjVar.getClass();
                    if (fd9.N(new fkj(gkjVar, tp4Var, i2), this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    a80 a80Var = gkjVar.b;
                    Float f = new Float(1.0f);
                    this.F = 1;
                    if (a80.c(a80Var, f, null, null, this, 14) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    a80 a80Var2 = gkjVar.b;
                    Float f2 = new Float(1.0f);
                    this.F = 1;
                    if (a80Var2.g(this, f2) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 3:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    a80 a80Var3 = gkjVar.c;
                    Float f3 = new Float(MTTypesetterKt.kLineSkipLimitMultiplier);
                    this.F = 1;
                    if (a80Var3.g(this, f3) == m45Var) {
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    a80 a80Var4 = gkjVar.d;
                    Float f4 = new Float(MTTypesetterKt.kLineSkipLimitMultiplier);
                    this.F = 1;
                    if (a80Var4.g(this, f4) == m45Var) {
                    }
                } else if (i7 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
