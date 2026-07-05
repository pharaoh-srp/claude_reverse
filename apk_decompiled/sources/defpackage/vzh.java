package defpackage;

import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.ui.components.snackbar.a;

/* JADX INFO: loaded from: classes.dex */
public final class vzh extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ boolean G;
    public final /* synthetic */ q0i H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vzh(q0i q0iVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = q0iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        q0i q0iVar = this.H;
        switch (i) {
            case 0:
                vzh vzhVar = new vzh(q0iVar, tp4Var, 0);
                vzhVar.G = ((Boolean) obj).booleanValue();
                return vzhVar;
            case 1:
                vzh vzhVar2 = new vzh(q0iVar, tp4Var, 1);
                vzhVar2.G = ((Boolean) obj).booleanValue();
                return vzhVar2;
            case 2:
                vzh vzhVar3 = new vzh(q0iVar, tp4Var, 2);
                vzhVar3.G = ((Boolean) obj).booleanValue();
                return vzhVar3;
            default:
                vzh vzhVar4 = new vzh(q0iVar, tp4Var, 3);
                vzhVar4.G = ((Boolean) obj).booleanValue();
                return vzhVar4;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((vzh) create(bool, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        q0i q0iVar = this.H;
        switch (i) {
            case 0:
                boolean z = this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    f9 f9Var = q0iVar.b;
                    this.G = z;
                    this.F = 1;
                    AccountSettings settings = f9Var.c.a().getSettings();
                    obj = f9Var.c(new q8(z, 11), new r8(settings != null ? settings.getEnabled_turmeric() : null, 4), this);
                    if (obj == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                a.a((ApiResult) obj, q0iVar.v);
                break;
            case 1:
                boolean z2 = this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    f9 f9Var2 = q0iVar.b;
                    this.G = z2;
                    this.F = 1;
                    AccountSettings settings2 = f9Var2.c.a().getSettings();
                    obj = f9Var2.c(new q8(z2, 14), new r8(settings2 != null ? settings2.getPreview_feature_uses_artifacts() : null, 6), this);
                    if (obj == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                a.a((ApiResult) obj, q0iVar.v);
                break;
            case 2:
                boolean z3 = this.G;
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    f9 f9Var3 = q0iVar.b;
                    this.G = z3;
                    this.F = 1;
                    AccountSettings settings3 = f9Var3.c.a().getSettings();
                    obj = f9Var3.c(new q8(z3, 13), new r8(settings3 != null ? settings3.getEnabled_monkeys_in_a_barrel() : null, 5), this);
                    if (obj == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                a.a((ApiResult) obj, q0iVar.v);
                break;
            default:
                boolean z4 = this.G;
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    f9 f9Var4 = q0iVar.b;
                    this.G = z4;
                    this.F = 1;
                    AccountSettings settings4 = f9Var4.c.a().getSettings();
                    obj = f9Var4.c(new q8(z4, 10), new r8(settings4 != null ? settings4.getEnabled_web_search() : null, 3), this);
                    if (obj == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                a.a((ApiResult) obj, q0iVar.v);
                break;
        }
        return ieiVar;
    }
}
