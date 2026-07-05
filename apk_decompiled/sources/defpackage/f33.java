package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class f33 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ t53 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f33(t53 t53Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = t53Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        t53 t53Var = this.G;
        switch (i) {
            case 0:
                return new f33(t53Var, tp4Var, 0);
            case 1:
                return new f33(t53Var, tp4Var, 1);
            case 2:
                return new f33(t53Var, tp4Var, 2);
            case 3:
                return new f33(t53Var, tp4Var, 3);
            case 4:
                return new f33(t53Var, tp4Var, 4);
            case 5:
                return new f33(t53Var, tp4Var, 5);
            case 6:
                return new f33(t53Var, tp4Var, 6);
            case 7:
                return new f33(t53Var, tp4Var, 7);
            case 8:
                return new f33(t53Var, tp4Var, 8);
            case 9:
                return new f33(t53Var, tp4Var, 9);
            default:
                return new f33(t53Var, tp4Var, 10);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 3:
                ((f33) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ((f33) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        int i2 = 0;
        iei ieiVar = iei.a;
        t53 t53Var = this.G;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        int i3 = 1;
        switch (i) {
            case 0:
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                b1i b1iVar = t53Var.G;
                kp7 kp7VarA = (b1iVar.f() || ((Boolean) b1iVar.e.getValue()).booleanValue()) ? j8.A(mpk.d0(new l80(t53Var, 9, new LinkedHashSet()))) : jm6.E;
                e33 e33Var = new e33(t53Var, null);
                this.F = 1;
                return j8.u(kp7VarA, e33Var, this) == m45Var ? m45Var : ieiVar;
            case 1:
                int i5 = this.F;
                if (i5 != 0) {
                    if (i5 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                zy1 zy1Var = t53Var.m.h;
                zy1 zy1Var2 = t53Var.j0;
                this.F = 1;
                return x44.I(zy1Var, zy1Var2, this) == m45Var ? m45Var : ieiVar;
            case 2:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    return new aj0(1, new er7(mpk.d0(new w13(t53Var, 23)), t53Var.E.H, new b53(3, null), 1)).a(new g33(t53Var, 3), this) == m45Var ? m45Var : ieiVar;
                }
                if (i6 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i7 = this.F;
                if (i7 != 0) {
                    if (i7 == 1) {
                        throw sq6.y(obj);
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                n2g n2gVar = t53Var.m.g;
                g33 g33Var = new g33(t53Var, 0);
                this.F = 1;
                n2gVar.getClass();
                n2g.n(n2gVar, g33Var, this);
                return m45Var;
            case 4:
                int i8 = this.F;
                if (i8 == 0) {
                    sf5.h0(obj);
                    zy1 zy1Var3 = t53Var.i0;
                    this.F = 1;
                    return zy1Var3.b(this, a63.a) == m45Var ? m45Var : ieiVar;
                }
                if (i8 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                int i9 = this.F;
                if (i9 != 0) {
                    if (i9 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                zy1 zy1Var4 = t53Var.D.v;
                zy1 zy1Var5 = t53Var.j0;
                this.F = 1;
                return x44.I(zy1Var4, zy1Var5, this) == m45Var ? m45Var : ieiVar;
            case 6:
                int i10 = this.F;
                if (i10 != 0) {
                    if (i10 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                kp7 kp7VarA2 = j8.A(mpk.d0(new w13(t53Var, 28)));
                g33 g33Var2 = new g33(t53Var, 1);
                this.F = 1;
                return kp7VarA2.a(g33Var2, this) == m45Var ? m45Var : ieiVar;
            case 7:
                int i11 = this.F;
                if (i11 != 0) {
                    if (i11 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                b3f b3fVarD0 = mpk.d0(new w13(t53Var, 29));
                g33 g33Var3 = new g33(t53Var, 2);
                this.F = 1;
                return b3fVarD0.a(g33Var3, this) == m45Var ? m45Var : ieiVar;
            case 8:
                int i12 = this.F;
                if (i12 != 0) {
                    if (i12 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                kp7 kp7VarA3 = j8.A(new gw2(mpk.d0(new i33(t53Var, i2)), 1));
                ax axVar = new ax(t53Var, null);
                this.F = 1;
                return j8.u(kp7VarA3, axVar, this) == m45Var ? m45Var : ieiVar;
            case 9:
                int i13 = this.F;
                if (i13 != 0) {
                    if (i13 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                kp7 kp7VarA4 = j8.A(mpk.d0(new i33(t53Var, i3)));
                n33 n33Var = new n33(t53Var, tp4Var, i2);
                this.F = 1;
                return j8.u(kp7VarA4, n33Var, this) == m45Var ? m45Var : ieiVar;
            default:
                int i14 = this.F;
                if (i14 == 0) {
                    sf5.h0(obj);
                    q0i q0iVar = t53Var.D;
                    this.F = 1;
                    return q0iVar.e(this) == m45Var ? m45Var : ieiVar;
                }
                if (i14 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
