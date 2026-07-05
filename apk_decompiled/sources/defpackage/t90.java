package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t90 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ v90 G;
    public final /* synthetic */ vve H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t90(v90 v90Var, vve vveVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = v90Var;
        this.H = vveVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new t90(this.G, this.H, tp4Var, 0);
            case 1:
                return new t90(this.G, this.H, tp4Var, 1);
            case 2:
                return new t90(this.G, this.H, tp4Var, 2);
            case 3:
                return new t90(this.G, this.H, tp4Var, 3);
            default:
                return new t90(this.G, this.H, tp4Var, 4);
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
        return ((t90) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        vve vveVar = this.H;
        m45 m45Var = m45.E;
        v90 v90Var = this.G;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    v90Var.getClass();
                    if (fd9.N(new zn(v90Var, vveVar, tp4Var, 2), this) == m45Var) {
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
                    a80 a80Var = v90Var.e;
                    if (a80Var != null) {
                        Float f = new Float(vveVar.a.a(v90Var.c, v90Var.d));
                        yig yigVar = v90Var.b;
                        this.F = 1;
                        obj = a80.c(a80Var, f, yigVar, null, this, 12);
                        if (obj == m45Var) {
                        }
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    a80 a80Var2 = v90Var.f;
                    if (a80Var2 != null) {
                        Float f2 = new Float(vveVar.b.a(v90Var.c, v90Var.d));
                        yig yigVar2 = v90Var.b;
                        this.F = 1;
                        obj = a80.c(a80Var2, f2, yigVar2, null, this, 12);
                        if (obj == m45Var) {
                        }
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
                    a80 a80Var3 = v90Var.g;
                    if (a80Var3 != null) {
                        Float f3 = new Float(vveVar.d.a(v90Var.c, v90Var.d));
                        yig yigVar3 = v90Var.b;
                        this.F = 1;
                        obj = a80.c(a80Var3, f3, yigVar3, null, this, 12);
                        if (obj == m45Var) {
                        }
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
                    a80 a80Var4 = v90Var.h;
                    if (a80Var4 != null) {
                        Float f4 = new Float(vveVar.c.a(v90Var.c, v90Var.d));
                        yig yigVar4 = v90Var.b;
                        this.F = 1;
                        obj = a80.c(a80Var4, f4, yigVar4, null, this, 12);
                        if (obj == m45Var) {
                        }
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return ieiVar;
    }
}
