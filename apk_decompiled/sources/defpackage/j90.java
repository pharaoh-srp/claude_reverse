package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j90 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ k90 G;
    public final /* synthetic */ vve H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j90(k90 k90Var, vve vveVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = k90Var;
        this.H = vveVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new j90(this.G, this.H, tp4Var, 0);
            case 1:
                return new j90(this.G, this.H, tp4Var, 1);
            case 2:
                return new j90(this.G, this.H, tp4Var, 2);
            case 3:
                return new j90(this.G, this.H, tp4Var, 3);
            default:
                return new j90(this.G, this.H, tp4Var, 4);
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
        return ((j90) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        vve vveVar = this.H;
        k90 k90Var = this.G;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    a80 a80Var = k90Var.e;
                    if (a80Var == null) {
                        return ieiVar;
                    }
                    Float f = new Float(vveVar.a.a(k90Var.c, k90Var.d));
                    yig yigVar = k90Var.b;
                    this.F = 1;
                    obj = a80.c(a80Var, f, yigVar, null, this, 12);
                    if (obj == m45Var) {
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
            case 1:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    a80 a80Var2 = k90Var.f;
                    if (a80Var2 == null) {
                        return ieiVar;
                    }
                    Float f2 = new Float(vveVar.b.a(k90Var.c, k90Var.d));
                    yig yigVar2 = k90Var.b;
                    this.F = 1;
                    obj = a80.c(a80Var2, f2, yigVar2, null, this, 12);
                    if (obj == m45Var) {
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
            case 2:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    a80 a80Var3 = k90Var.g;
                    if (a80Var3 == null) {
                        return ieiVar;
                    }
                    Float f3 = new Float(vveVar.d.a(k90Var.c, k90Var.d));
                    yig yigVar3 = k90Var.b;
                    this.F = 1;
                    obj = a80.c(a80Var3, f3, yigVar3, null, this, 12);
                    if (obj == m45Var) {
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
            case 3:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    a80 a80Var4 = k90Var.h;
                    if (a80Var4 == null) {
                        return ieiVar;
                    }
                    Float f4 = new Float(vveVar.c.a(k90Var.c, k90Var.d));
                    yig yigVar4 = k90Var.b;
                    this.F = 1;
                    obj = a80.c(a80Var4, f4, yigVar4, null, this, 12);
                    if (obj == m45Var) {
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
            default:
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    k90Var.getClass();
                    return fd9.N(new zn(k90Var, vveVar, tp4Var, i2), this) == m45Var ? m45Var : ieiVar;
                }
                if (i7 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
