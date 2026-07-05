package defpackage;

import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.ui.components.snackbar.a;

/* JADX INFO: loaded from: classes3.dex */
public final class igd extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public final /* synthetic */ jgd G;
    public /* synthetic */ boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igd(jgd jgdVar, boolean z, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = jgdVar;
        this.H = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        jgd jgdVar = this.G;
        switch (i) {
            case 0:
                igd igdVar = new igd(jgdVar, tp4Var);
                igdVar.H = ((Boolean) obj).booleanValue();
                return igdVar;
            default:
                return new igd(jgdVar, this.H, tp4Var);
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
                return ((igd) create(bool, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((igd) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        jgd jgdVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                boolean z = this.H;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    f9 f9Var = jgdVar.c;
                    this.H = z;
                    this.F = 1;
                    AccountSettings settings = f9Var.c.a().getSettings();
                    obj = f9Var.c(new q8(z, 1), new r8(settings != null ? settings.getGrove_enabled() : null, 0), this);
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
                a.a((ApiResult) obj, jgdVar.e);
                return ieiVar;
            default:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                cbf cbfVar = jgdVar.k;
                Boolean boolValueOf = Boolean.valueOf(this.H);
                this.F = 1;
                return cbf.t(cbfVar, boolValueOf, this, 4) == m45Var ? m45Var : ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igd(jgd jgdVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = jgdVar;
    }
}
