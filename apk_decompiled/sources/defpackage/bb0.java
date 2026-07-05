package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bb0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb0(bi5 bi5Var, crd crdVar, boolean z, pz7 pz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 3;
        this.H = bi5Var;
        this.G = z;
        this.I = pz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                return new bb0(this.G, (kja) obj3, (zy7) obj2, tp4Var, 0);
            case 1:
                return new bb0(this.G, (x0a) obj3, (nwb) obj2, tp4Var, 1);
            case 2:
                return new bb0(this.G, (x0a) obj3, (zy7) obj2, tp4Var, 2);
            default:
                return new bb0((bi5) obj3, (crd) null, this.G, (pz7) obj2, tp4Var);
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
        return ((bb0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.I;
        boolean z = this.G;
        m45 m45Var = m45.E;
        Object obj3 = this.H;
        int i2 = 1;
        switch (i) {
            case 0:
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
                    if (z) {
                        if (((kja) obj3) == null) {
                            this.F = 1;
                            if (d4c.K(2500L, this) == m45Var) {
                            }
                        }
                        break;
                    }
                }
                ((zy7) obj2).a();
                break;
            case 1:
                x0a x0aVar = (x0a) obj3;
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
                    if (z) {
                        xl1 xl1Var = new xl1(mpk.d0(new a23(x0aVar, 1)), 1);
                        g23 g23Var = new g23(x0aVar, (nwb) obj2, i2);
                        this.F = 1;
                        if (xl1Var.a(g23Var, this) == m45Var) {
                        }
                        break;
                    }
                }
                break;
            case 2:
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
                    if (z) {
                        z01 z01Var = new z01(((x0a) obj3).g.a, 1);
                        ul1 ul1Var = new ul1(1, (zy7) obj2);
                        this.F = 1;
                        if (z01Var.a(ul1Var, this) == m45Var) {
                        }
                        break;
                    }
                }
                break;
            default:
                bi5 bi5Var = (bi5) obj3;
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    vh5 vh5Var = new vh5(z, bi5Var, (pz7) obj2, null);
                    this.F = 1;
                    Object objY = zh4.y(this, vh5Var);
                    if (objY == m45Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb0(boolean z, Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = z;
        this.H = obj;
        this.I = obj2;
    }
}
