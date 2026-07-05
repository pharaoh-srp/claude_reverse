package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zy9 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ bz9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy9(bz9 bz9Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = bz9Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        bz9 bz9Var = this.G;
        switch (i) {
            case 0:
                return new zy9(bz9Var, tp4Var, 0);
            case 1:
                return new zy9(bz9Var, tp4Var, 1);
            case 2:
                return new zy9(bz9Var, tp4Var, 2);
            case 3:
                return new zy9(bz9Var, tp4Var, 3);
            default:
                return new zy9(bz9Var, tp4Var, 4);
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
        return ((zy9) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        bz9 bz9Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    a80 a80Var = bz9Var.p;
                    Float f = new Float(1.0f);
                    this.F = 1;
                    if (a80Var.g(this, f) == m45Var) {
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
                    a80 a80Var2 = bz9Var.o;
                    y69 y69Var = new y69(0L);
                    this.F = 1;
                    if (a80Var2.g(this, y69Var) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                bz9Var.g(0L);
                bz9Var.f(false);
                break;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    a80 a80Var3 = bz9Var.o;
                    this.F = 1;
                    if (a80Var3.h(this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 3:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    a80 a80Var4 = bz9Var.p;
                    this.F = 1;
                    if (a80Var4.h(this) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    a80 a80Var5 = bz9Var.p;
                    this.F = 1;
                    if (a80Var5.h(this) == m45Var) {
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
