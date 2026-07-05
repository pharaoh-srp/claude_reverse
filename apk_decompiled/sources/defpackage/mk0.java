package defpackage;

import com.anthropic.claude.analytics.events.AppStartEvents$MaybeRefreshRefreshed;
import com.anthropic.claude.configs.FlexibleUpdateConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mk0 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk0(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.H = obj;
        this.G = obj2;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.G;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                return new mk0((ok0) obj2, (String) obj, tp4Var, 0);
            case 1:
                return new mk0((tl0) obj2, (String) obj, tp4Var, 1);
            case 2:
                return new mk0((el5) obj2, (bi5) obj, tp4Var, 2);
            case 3:
                return new mk0((pz7) obj2, (qf5) obj, tp4Var, 3);
            case 4:
                return new mk0((bi5) obj2, (pz7) obj, tp4Var, 4);
            case 5:
                return new mk0((lp7) obj2, (dae) obj, tp4Var, 5);
            case 6:
                return new mk0((rc8) obj2, (oke) obj, tp4Var, 6);
            default:
                return new mk0((fj0) obj2, (toh) obj, tp4Var, 7);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
        }
        return ((mk0) create(tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objD;
        Object objB;
        qf5 qf5Var;
        Object obj2;
        Object objA;
        int i = this.E;
        int i2 = 0;
        iei ieiVar = iei.a;
        Object obj3 = this.G;
        m45 m45Var = m45.E;
        Object obj4 = this.H;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    Object objA2 = ((ok0) obj4).f.a((String) obj3, "sdk", false, this);
                    return objA2 == m45Var ? m45Var : objA2;
                }
                if (i3 == 1) {
                    sf5.h0(obj);
                    return obj;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                String str = (String) obj3;
                tl0 tl0Var = (tl0) obj4;
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                tl0Var.d.e(new AppStartEvents$MaybeRefreshRefreshed(str), AppStartEvents$MaybeRefreshRefreshed.Companion.serializer());
                this.F = 1;
                Object objI = tl0Var.i(str, this);
                return objI == m45Var ? m45Var : objI;
            case 2:
                el5 el5Var = (el5) obj4;
                bi5 bi5Var = (bi5) obj3;
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    eh5 eh5Var = new eh5(i2, tp4Var, bi5Var);
                    List list = (List) el5Var.H;
                    if (list == null || list.isEmpty()) {
                        this.F = 1;
                        objD = bi5.d(bi5Var, false, eh5Var, this);
                        if (objD == m45Var) {
                            return m45Var;
                        }
                        qf5Var = (qf5) objD;
                    } else {
                        z7g z7gVarF = bi5Var.f();
                        hh5 hh5Var = new hh5(bi5Var, eh5Var, el5Var, null);
                        this.F = 2;
                        objB = z7gVarF.b(hh5Var, this);
                        if (objB == m45Var) {
                            return m45Var;
                        }
                        qf5Var = (qf5) objB;
                    }
                } else if (i5 == 1) {
                    sf5.h0(obj);
                    objD = obj;
                    qf5Var = (qf5) objD;
                } else {
                    if (i5 != 2) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                    objB = obj;
                    qf5Var = (qf5) objB;
                }
                return bi5Var.g.M(qf5Var);
            case 3:
                int i6 = this.F;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                Object obj5 = ((qf5) obj3).b;
                this.F = 1;
                Object objInvoke = ((pz7) obj4).invoke(obj5, this);
                return objInvoke == m45Var ? m45Var : objInvoke;
            case 4:
                bi5 bi5Var2 = (bi5) obj4;
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    obj2 = null;
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            sf5.h0(obj);
                            return obj;
                        }
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                    obj2 = obj;
                }
                crd crdVar = (crd) obj2;
                xii xiiVar = (xii) getContext().x0(a5.O);
                if (xiiVar != null) {
                    xiiVar.a(bi5Var2);
                }
                xii xiiVar2 = new xii(xiiVar, bi5Var2);
                cx cxVar = new cx(bi5Var2, (pz7) obj3, crdVar, (tp4) null);
                this.F = 2;
                Object objC0 = gb9.c0(xiiVar2, cxVar, this);
                return objC0 == m45Var ? m45Var : objC0;
            case 5:
                dae daeVar = (dae) obj3;
                int i8 = this.F;
                if (i8 == 0) {
                    sf5.h0(obj);
                    lp7 lp7Var = (lp7) obj4;
                    Object obj6 = daeVar.E;
                    if (obj6 == l9c.a) {
                        obj6 = null;
                    }
                    this.F = 1;
                    if (lp7Var.g(obj6, this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i8 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                daeVar.E = null;
                return ieiVar;
            case 6:
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
                FlexibleUpdateConfig flexibleUpdateConfig = (FlexibleUpdateConfig) ((rc8) obj4).l(FlexibleUpdateConfig.CONFIG_NAME, iv1.J(jce.b(FlexibleUpdateConfig.class)));
                if (flexibleUpdateConfig == null) {
                    flexibleUpdateConfig = new FlexibleUpdateConfig(false, 0, 0, 7, (mq5) null);
                }
                boolean enabled = flexibleUpdateConfig.getEnabled();
                int min_staleness_days = flexibleUpdateConfig.getMin_staleness_days();
                int dismiss_cooldown_days = flexibleUpdateConfig.getDismiss_cooldown_days();
                this.F = 1;
                return ((oke) obj3).b(enabled, min_staleness_days, dismiss_cooldown_days, this) == m45Var ? m45Var : ieiVar;
            default:
                fj0 fj0Var = (fj0) obj4;
                int i10 = this.F;
                try {
                    if (i10 == 0) {
                        sf5.h0(obj);
                        ((lsc) fj0Var.F).setValue(Boolean.FALSE);
                        gff gffVar = (gff) fj0Var.E;
                        toh tohVar = (toh) obj3;
                        this.F = 1;
                        a6i a6iVar = gffVar.I;
                        if (a6iVar == null || (objA = gxb.a(gffVar.P, new j30(a6iVar, gffVar, tohVar, (tp4) null, 7), this)) != m45Var) {
                            objA = ieiVar;
                        }
                        if (objA == m45Var) {
                            return m45Var;
                        }
                    } else {
                        if (i10 != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sf5.h0(obj);
                    }
                    return ieiVar;
                } finally {
                    ((lsc) fj0Var.F).setValue(Boolean.FALSE);
                }
        }
    }
}
