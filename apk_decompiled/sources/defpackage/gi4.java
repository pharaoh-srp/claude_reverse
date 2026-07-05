package defpackage;

import android.content.Context;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.connector.auth.b;
import com.anthropic.claude.ui.components.snackbar.a;

/* JADX INFO: loaded from: classes2.dex */
public final class gi4 extends xzg implements pz7 {
    public hi4 E;
    public int F;
    public final /* synthetic */ hi4 G;
    public final /* synthetic */ bi4 H;
    public final /* synthetic */ Context I;
    public final /* synthetic */ si4 J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ pz7 L;
    public final /* synthetic */ gh2 M;
    public final /* synthetic */ zy7 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi4(hi4 hi4Var, bi4 bi4Var, Context context, si4 si4Var, boolean z, pz7 pz7Var, gh2 gh2Var, zy7 zy7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = hi4Var;
        this.H = bi4Var;
        this.I = context;
        this.J = si4Var;
        this.K = z;
        this.L = pz7Var;
        this.M = gh2Var;
        this.N = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new gi4(this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((gi4) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        hi4 hi4Var;
        gi4 gi4Var;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            hi4Var = this.G;
            b bVar = hi4Var.a;
            this.E = hi4Var;
            this.F = 1;
            gi4Var = this;
            obj = bVar.i(this.H, this.I, this.J, this.K, this.L, gi4Var);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hi4Var = this.E;
            sf5.h0(obj);
            gi4Var = this;
        }
        ApiResult apiResult = (ApiResult) obj;
        a.a(apiResult, gi4Var.M);
        if (apiResult instanceof nf0) {
            hi4Var.a.b();
            gi4Var.N.a();
        }
        return iei.a;
    }
}
