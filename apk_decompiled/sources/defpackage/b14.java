package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b14 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ o0h G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b14(o0h o0hVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = o0hVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new b14(this.G, tp4Var, 0);
            case 1:
                return new b14(this.G, tp4Var, 1);
            default:
                return new b14(this.G, tp4Var, 2);
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
        return ((b14) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        mb0 mb0Var;
        mb0 mb0Var2;
        mb0 mb0Var3;
        int i = this.E;
        zwb zwbVar = zwb.E;
        zre zreVar = zre.E;
        o0h o0hVar = this.G;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    ry ryVar = o0hVar.a;
                    if (ryVar.d()) {
                        mb0Var = ryVar.d;
                        if (mb0Var == null) {
                            x44.o0("snapAnimationSpec");
                            throw null;
                        }
                    } else {
                        mb0Var = vx.a;
                    }
                    Object objA = ryVar.a(zreVar, zwbVar, new xx(ryVar, mb0Var, null), this);
                    if (objA != m45Var) {
                        objA = ieiVar;
                    }
                    if (objA == m45Var) {
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
                    this.F = 1;
                    ry ryVar2 = o0hVar.a;
                    if (ryVar2.d()) {
                        mb0Var2 = ryVar2.d;
                        if (mb0Var2 == null) {
                            x44.o0("snapAnimationSpec");
                            throw null;
                        }
                    } else {
                        mb0Var2 = vx.a;
                    }
                    Object objA2 = ryVar2.a(zreVar, zwbVar, new xx(ryVar2, mb0Var2, null), this);
                    if (objA2 != m45Var) {
                        objA2 = ieiVar;
                    }
                    if (objA2 == m45Var) {
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
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    ry ryVar3 = o0hVar.a;
                    if (ryVar3.d()) {
                        mb0Var3 = ryVar3.d;
                        if (mb0Var3 == null) {
                            x44.o0("snapAnimationSpec");
                            throw null;
                        }
                    } else {
                        mb0Var3 = vx.a;
                    }
                    Object objA3 = ryVar3.a(zreVar, zwbVar, new xx(ryVar3, mb0Var3, null), this);
                    if (objA3 != m45Var) {
                        objA3 = ieiVar;
                    }
                    if (objA3 == m45Var) {
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
        }
    }
}
