package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class my0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ v4g G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my0(v4g v4gVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = v4gVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        v4g v4gVar = this.G;
        switch (i) {
            case 0:
                return new my0(v4gVar, tp4Var, 0);
            case 1:
                return new my0(v4gVar, tp4Var, 1);
            case 2:
                return new my0(v4gVar, tp4Var, 2);
            case 3:
                return new my0(v4gVar, tp4Var, 3);
            case 4:
                return new my0(v4gVar, tp4Var, 4);
            case 5:
                return new my0(v4gVar, tp4Var, 5);
            case 6:
                return new my0(v4gVar, tp4Var, 6);
            case 7:
                return new my0(v4gVar, tp4Var, 7);
            case 8:
                return new my0(v4gVar, tp4Var, 8);
            case 9:
                return new my0(v4gVar, tp4Var, 9);
            case 10:
                return new my0(v4gVar, tp4Var, 10);
            case 11:
                return new my0(v4gVar, tp4Var, 11);
            case 12:
                return new my0(v4gVar, tp4Var, 12);
            case 13:
                return new my0(v4gVar, tp4Var, 13);
            default:
                return new my0(v4gVar, tp4Var, 14);
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
        return ((my0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        v4g v4gVar = this.G;
        m45 m45Var = m45.E;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (v4gVar.e(this) == m45Var) {
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
                    this.F = 1;
                    if (v4gVar.e(this) == m45Var) {
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
                    this.F = 1;
                    if (v4gVar.g(this) == m45Var) {
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
                    this.F = 1;
                    if (v4gVar.e(this) == m45Var) {
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 4:
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (v4gVar.b(this) == m45Var) {
                    }
                } else if (i7 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 5:
                int i8 = this.F;
                if (i8 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (v4gVar.h(this) == m45Var) {
                    }
                } else if (i8 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 6:
                int i9 = this.F;
                if (i9 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (v4gVar.b(this) == m45Var) {
                    }
                } else if (i9 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 7:
                int i10 = this.F;
                if (i10 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (v4gVar.g(this) == m45Var) {
                    }
                } else if (i10 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 8:
                int i11 = this.F;
                if (i11 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (v4gVar.e(this) == m45Var) {
                    }
                } else if (i11 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 9:
                int i12 = this.F;
                if (i12 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (v4gVar.h(this) == m45Var) {
                    }
                } else if (i12 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 10:
                int i13 = this.F;
                if (i13 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (v4gVar.e(this) == m45Var) {
                    }
                } else if (i13 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 11:
                int i14 = this.F;
                if (i14 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (v4gVar.g(this) == m45Var) {
                    }
                } else if (i14 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 12:
                int i15 = this.F;
                if (i15 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (v4gVar.e(this) == m45Var) {
                    }
                } else if (i15 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 13:
                int i16 = this.F;
                if (i16 == 0) {
                    sf5.h0(obj);
                    xl1 xl1Var = new xl1(mpk.d0(new fnb(v4gVar, i2)), 4);
                    this.F = 1;
                    if (j8.G(xl1Var, this) != m45Var) {
                    }
                } else if (i16 == 1) {
                    sf5.h0(obj);
                } else if (i16 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                this.F = 2;
                if (v4gVar.b(this) != m45Var) {
                }
                break;
            default:
                int i17 = this.F;
                if (i17 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (v4gVar.e(this) == m45Var) {
                    }
                } else if (i17 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
