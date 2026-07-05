package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zt5 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ xv8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt5(xv8 xv8Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = xv8Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new zt5(this.G, tp4Var, 0);
            case 1:
                return new zt5(this.G, tp4Var, 1);
            case 2:
                return new zt5(this.G, tp4Var, 2);
            case 3:
                return new zt5(this.G, tp4Var, 3);
            case 4:
                return new zt5(this.G, tp4Var, 4);
            default:
                return new zt5(this.G, tp4Var, 5);
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
        return ((zt5) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        int i = this.E;
        xv8 xv8Var = this.G;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
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
                    gff gffVar = (gff) xv8Var.G;
                    this.F = 1;
                    if (gffVar.W0(zo6.F, this) == m45Var) {
                    }
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    gff gffVar2 = (gff) xv8Var.H;
                    this.F = 1;
                    if (gffVar2.W0(zo6.E, this) == m45Var) {
                    }
                }
                break;
            case 2:
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    e50 e50Var = (e50) xv8Var.F;
                    if (e50Var != null) {
                        this.F = 1;
                        Object objA3 = e50.a(new pz7[]{new a50(e50Var, null, 0), new a50(e50Var, null, 1)}, this);
                        if (objA3 != m45Var) {
                            objA3 = ieiVar;
                        }
                        if (objA3 == m45Var) {
                        }
                    }
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
                    gff gffVar3 = (gff) xv8Var.G;
                    this.F = 1;
                    a6i a6iVar = gffVar3.I;
                    if (a6iVar == null || (objA = gxb.a(gffVar3.P, new j30(a6iVar, gffVar3, zo6.G, (tp4) null, 7), this)) != m45Var) {
                        objA = ieiVar;
                    }
                    if (objA == m45Var) {
                    }
                }
                break;
            case 4:
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
                    gff gffVar4 = (gff) xv8Var.H;
                    this.F = 1;
                    a6i a6iVar2 = gffVar4.I;
                    if (a6iVar2 == null || (objA2 = gxb.a(gffVar4.P, new j30(a6iVar2, gffVar4, zo6.F, (tp4) null, 7), this)) != m45Var) {
                        objA2 = ieiVar;
                    }
                    if (objA2 == m45Var) {
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
                    e50 e50Var2 = (e50) xv8Var.F;
                    if (e50Var2 != null) {
                        this.F = 1;
                        Object objA4 = e50.a(new pz7[]{new a50(e50Var2, null, 2), new a50(e50Var2, null, 3)}, this);
                        if (objA4 != m45Var) {
                            objA4 = ieiVar;
                        }
                        if (objA4 == m45Var) {
                        }
                    }
                }
                break;
        }
        return ieiVar;
    }
}
