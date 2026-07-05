package defpackage;

import com.anthropic.claude.models.organization.configtypes.WorkingTextConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ax extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public /* synthetic */ boolean G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(gx gxVar, boolean z, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = gxVar;
        this.G = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                return new ax((gx) obj2, this.G, tp4Var);
            case 1:
                ax axVar = new ax((t53) obj2, tp4Var);
                axVar.G = ((Boolean) obj).booleanValue();
                return axVar;
            default:
                return new ax(this.G, (y4g) obj2, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((ax) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ax) create(bool, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((ax) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        Object obj2 = this.H;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    lpg lpgVar = (lpg) ((gx) obj2).F.E;
                    z0h z0hVar = new z0h(this.G, 0);
                    pl9 pl9VarB = jce.a.b(a1h.class);
                    this.F = 1;
                    if (lpgVar.b(z0hVar, pl9VarB, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                t53 t53Var = (t53) obj2;
                lsc lscVar = t53Var.C0;
                boolean z = this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    if (!z) {
                        lscVar.setValue(Boolean.FALSE);
                    } else {
                        lz1 lz1Var = uh6.F;
                        WorkingTextConfig workingTextConfig = (WorkingTextConfig) t53Var.u.f("mobile_working_text_config", WorkingTextConfig.Companion.serializer()).getValue();
                        long jQ = v40.Q(workingTextConfig != null ? workingTextConfig.getDelayMillis() : yr6.INVALID_OWNERSHIP, zh6.MILLISECONDS);
                        this.G = z;
                        this.F = 1;
                        if (d4c.L(jQ, this) == m45Var) {
                        }
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                lscVar.setValue(Boolean.TRUE);
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    if (this.G) {
                        this.F = 1;
                        Object objA = ((y4g) obj2).a.a(x4g.E, zwb.E, new ey(), this);
                        if (objA != m45Var) {
                            objA = ieiVar;
                        }
                        if (objA == m45Var) {
                        }
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(t53 t53Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = t53Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(boolean z, y4g y4gVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = z;
        this.H = y4gVar;
    }
}
