package defpackage;

import android.content.Context;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.connector.auth.b;
import com.anthropic.claude.ui.components.snackbar.a;

/* JADX INFO: loaded from: classes2.dex */
public final class fi4 extends xzg implements pz7 {
    public hi4 E;
    public int F;
    public final /* synthetic */ hi4 G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ Context J;
    public final /* synthetic */ si4 K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ pz7 M;
    public final /* synthetic */ gh2 N;
    public final /* synthetic */ zy7 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi4(hi4 hi4Var, String str, String str2, Context context, si4 si4Var, boolean z, pz7 pz7Var, gh2 gh2Var, zy7 zy7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = hi4Var;
        this.H = str;
        this.I = str2;
        this.J = context;
        this.K = si4Var;
        this.L = z;
        this.M = pz7Var;
        this.N = gh2Var;
        this.O = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new fi4(this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((fi4) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        hi4 hi4Var;
        fi4 fi4Var;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            hi4Var = this.G;
            b bVar = hi4Var.a;
            this.E = hi4Var;
            this.F = 1;
            fi4Var = this;
            obj = bVar.e(this.H, this.I, this.J, this.K, this.L, this.M, fi4Var);
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
            fi4Var = this;
        }
        ApiResult apiResult = (ApiResult) obj;
        a.a(apiResult, fi4Var.N);
        if (apiResult instanceof nf0) {
            hi4Var.a.b();
            fi4Var.O.a();
        }
        return iei.a;
    }
}
