package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nt4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ x0a G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt4(x0a x0aVar, int i, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 4;
        this.G = x0aVar;
        this.F = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        x0a x0aVar = this.G;
        switch (i) {
            case 0:
                return new nt4(x0aVar, tp4Var, 0);
            case 1:
                return new nt4(x0aVar, tp4Var, 1);
            case 2:
                return new nt4(x0aVar, tp4Var, 2);
            case 3:
                return new nt4(x0aVar, tp4Var, 3);
            case 4:
                return new nt4(x0aVar, this.F, tp4Var);
            case 5:
                return new nt4(x0aVar, tp4Var, 5);
            default:
                return new nt4(x0aVar, tp4Var, 6);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 4:
                ((nt4) create((h9f) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ((nt4) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = null;
        x0a x0aVar = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    this.F = 1;
                    y5f y5fVar = x0a.y;
                    if (x0aVar.f(0, 0, this) == m45Var) {
                    }
                }
                break;
            case 1:
                int i3 = this.F;
                try {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            sf5.h0(obj);
                        }
                        break;
                    } else {
                        sf5.h0(obj);
                        int iH = ((isc) x0aVar.e.b).h() + 1;
                        this.F = 1;
                        if (x0aVar.f(iH, 0, this) == m45Var) {
                        }
                    }
                    break;
                } catch (IllegalArgumentException unused) {
                }
                break;
            case 2:
                int i4 = this.F;
                try {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            sf5.h0(obj);
                        }
                        break;
                    } else {
                        sf5.h0(obj);
                        int iH2 = ((isc) x0aVar.e.b).h() - 1;
                        this.F = 1;
                        if (x0aVar.f(iH2, 0, this) == m45Var) {
                        }
                    }
                    break;
                } catch (IllegalArgumentException unused2) {
                }
                break;
            case 3:
                int i5 = this.F;
                if (i5 != 0) {
                    if (i5 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    vj vjVar = new vj(2, tp4Var, 12);
                    this.F = 1;
                    if (x0aVar.c(zwb.E, vjVar, this) == m45Var) {
                    }
                }
                break;
            case 4:
                sf5.h0(obj);
                x0aVar.l(this.F, 0, true);
                break;
            case 5:
                int i6 = this.F;
                if (i6 != 0) {
                    if (i6 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    this.F = 1;
                    if (x0a.k(x0aVar, Integer.MAX_VALUE, this) == m45Var) {
                    }
                }
                break;
            default:
                int i7 = this.F;
                if (i7 != 0) {
                    if (i7 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    b3f b3fVarD0 = mpk.d0(new i23(x0aVar, 4));
                    i7 i7Var = new i7(24, x0aVar);
                    this.F = 1;
                    if (b3fVarD0.a(i7Var, this) == m45Var) {
                    }
                }
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt4(x0a x0aVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = x0aVar;
    }
}
