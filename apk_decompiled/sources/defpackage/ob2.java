package defpackage;

import com.anthropic.claude.analytics.events.MemoryEvents$MemoryToggle;
import com.anthropic.claude.analytics.events.SettingsEvents$SettingsMemorySearchToggle;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.ui.components.snackbar.a;

/* JADX INFO: loaded from: classes2.dex */
public final class ob2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ boolean G;
    public final /* synthetic */ qb2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ob2(qb2 qb2Var, boolean z, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = qb2Var;
        this.G = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        qb2 qb2Var = this.H;
        switch (i) {
            case 0:
                ob2 ob2Var = new ob2(qb2Var, tp4Var, 0);
                ob2Var.G = ((Boolean) obj).booleanValue();
                return ob2Var;
            case 1:
                ob2 ob2Var2 = new ob2(qb2Var, tp4Var, 1);
                ob2Var2.G = ((Boolean) obj).booleanValue();
                return ob2Var2;
            case 2:
                ob2 ob2Var3 = new ob2(qb2Var, tp4Var, 2);
                ob2Var3.G = ((Boolean) obj).booleanValue();
                return ob2Var3;
            case 3:
                return new ob2(qb2Var, this.G, tp4Var, 3);
            case 4:
                return new ob2(qb2Var, this.G, tp4Var, 4);
            case 5:
                return new ob2(qb2Var, this.G, tp4Var, 5);
            case 6:
                return new ob2(qb2Var, this.G, tp4Var, 6);
            case 7:
                return new ob2(qb2Var, this.G, tp4Var, 7);
            case 8:
                return new ob2(qb2Var, this.G, tp4Var, 8);
            default:
                return new ob2(qb2Var, this.G, tp4Var, 9);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                break;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                break;
        }
        return ((ob2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        qb2 qb2Var = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                boolean z = this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    f9 f9Var = qb2Var.c;
                    this.G = z;
                    this.F = 1;
                    AccountSettings settings = f9Var.c.a().getSettings();
                    obj = f9Var.c(new q8(z, 2), new r8(settings != null ? settings.getEnabled_saffron_search() : null, 1), this);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                a.a((ApiResult) obj, qb2Var.l);
                return ieiVar;
            case 1:
                boolean z2 = this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    f9 f9Var2 = qb2Var.c;
                    this.G = z2;
                    this.F = 1;
                    obj = f9Var2.g(z2, this);
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
                ApiResult apiResult = (ApiResult) obj;
                a.a(apiResult, qb2Var.l);
                if (!(apiResult instanceof of0)) {
                    if (apiResult instanceof nf0) {
                        return ieiVar;
                    }
                    wg6.i();
                    return null;
                }
                if (!z2) {
                    return ieiVar;
                }
                qb2.O(qb2Var);
                return ieiVar;
            case 2:
                boolean z3 = this.G;
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    f9 f9Var3 = qb2Var.c;
                    this.G = z3;
                    this.F = 1;
                    AccountSettings settings2 = f9Var3.c.a().getSettings();
                    obj = f9Var3.c(new q8(z3, 7), new r8(settings2 != null ? settings2.getEnabled_model_auto_fallback() : null, 2), this);
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
                a.a((ApiResult) obj, qb2Var.l);
                return ieiVar;
            case 3:
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
                jk5 jk5Var = qb2Var.b.B;
                boolean z4 = this.G;
                this.F = 1;
                ((bz7) jk5Var.L).invoke(Boolean.valueOf(z4));
                return cbf.t((cbf) jk5Var.F, Boolean.valueOf(z4), this, 6) == m45Var ? m45Var : ieiVar;
            case 4:
                boolean z5 = this.G;
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    jk5 jk5Var2 = qb2Var.b.A;
                    this.F = 1;
                    ((bz7) jk5Var2.L).invoke(Boolean.valueOf(z5));
                    if (cbf.t((cbf) jk5Var2.F, Boolean.valueOf(z5), this, 6) != m45Var) {
                    }
                    return m45Var;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                if (z5) {
                    return ieiVar;
                }
                q0i q0iVar = qb2Var.b;
                q0i q0iVar2 = qb2Var.b;
                if (q0iVar.n.d.i() || !q0iVar2.F.c(null, ynb.a)) {
                    return ieiVar;
                }
                p60 p60Var = q0iVar2.F;
                this.F = 2;
                if (p60Var.q(null, false, this) != m45Var) {
                    return ieiVar;
                }
                return m45Var;
            case 5:
                int i7 = this.F;
                if (i7 != 0) {
                    if (i7 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                p60 p60Var2 = qb2Var.b.z;
                boolean z6 = this.G;
                this.F = 1;
                return p60Var2.q(null, z6, this) == m45Var ? m45Var : ieiVar;
            case 6:
                int i8 = this.F;
                if (i8 != 0) {
                    if (i8 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                p60 p60Var3 = qb2Var.b.F;
                boolean z7 = this.G;
                this.F = 1;
                return p60Var3.q(null, z7, this) == m45Var ? m45Var : ieiVar;
            case 7:
                boolean z8 = this.G;
                int i9 = this.F;
                if (i9 == 0) {
                    sf5.h0(obj);
                    cbf cbfVar = qb2Var.m;
                    Boolean boolValueOf = Boolean.valueOf(z8);
                    this.F = 1;
                    if (cbf.t(cbfVar, boolValueOf, this, 4) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i9 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                qb2Var.e.e(new MemoryEvents$MemoryToggle(z8), MemoryEvents$MemoryToggle.Companion.serializer());
                return ieiVar;
            case 8:
                boolean z9 = this.G;
                int i10 = this.F;
                if (i10 == 0) {
                    sf5.h0(obj);
                    cbf cbfVar2 = qb2Var.n;
                    Boolean boolValueOf2 = Boolean.valueOf(z9);
                    this.F = 1;
                    if (cbf.t(cbfVar2, boolValueOf2, this, 4) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i10 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                qb2Var.e.e(new SettingsEvents$SettingsMemorySearchToggle(z9), SettingsEvents$SettingsMemorySearchToggle.Companion.serializer());
                return ieiVar;
            default:
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
                cbf cbfVar3 = qb2Var.u;
                Boolean boolValueOf3 = Boolean.valueOf(this.G);
                this.F = 1;
                return cbf.t(cbfVar3, boolValueOf3, this, 4) == m45Var ? m45Var : ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ob2(qb2 qb2Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = qb2Var;
    }
}
