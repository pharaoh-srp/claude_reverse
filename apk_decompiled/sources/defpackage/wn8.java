package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wn8 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ yn8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn8(yn8 yn8Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = yn8Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        yn8 yn8Var = this.G;
        switch (i) {
            case 0:
                return new wn8(yn8Var, tp4Var, 0);
            case 1:
                return new wn8(yn8Var, tp4Var, 1);
            case 2:
                return new wn8(yn8Var, tp4Var, 2);
            default:
                return new wn8(yn8Var, tp4Var, 3);
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
        return ((wn8) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        yn8 yn8Var = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    kae kaeVar = yn8Var.j;
                    String str = yn8Var.c.e;
                    this.F = 1;
                    if (kaeVar.b(str, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    vd3 vd3Var = yn8Var.d;
                    this.F = 1;
                    if (vd3Var.k(this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                yn8Var.l.setValue(Boolean.TRUE);
                break;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    wqd wqdVar = yn8Var.e;
                    this.F = 1;
                    if (wqdVar.n(this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                yn8Var.m.setValue(Boolean.TRUE);
                break;
            default:
                lsc lscVar = yn8Var.n;
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    lscVar.setValue(Boolean.TRUE);
                    wqd wqdVar2 = yn8Var.e;
                    this.F = 1;
                    obj = wqdVar2.s(this);
                    if (obj == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    yn8Var.m.setValue(Boolean.TRUE);
                } else {
                    yn8Var.f.b = 0L;
                }
                lscVar.setValue(Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
