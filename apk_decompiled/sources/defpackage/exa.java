package defpackage;

import android.content.Context;
import com.anthropic.claude.mcpapps.b;
import com.anthropic.claude.mcpapps.transport.JsonRpcRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class exa extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public Object G;
    public Object H;
    public Object I;
    public final /* synthetic */ Serializable J;
    public Object K;
    public Object L;
    public final /* synthetic */ Object M;
    public Object N;
    public Object O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exa(wm0 wm0Var, x7e x7eVar, cae caeVar, amg amgVar, Context context, jfe jfeVar, drh drhVar, xqh xqhVar, l45 l45Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = wm0Var;
        this.I = x7eVar;
        this.J = caeVar;
        this.K = amgVar;
        this.L = context;
        this.M = jfeVar;
        this.N = drhVar;
        this.O = xqhVar;
        this.P = l45Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.P;
        Object obj3 = this.M;
        Serializable serializable = this.J;
        switch (i) {
            case 0:
                return new exa((JsonRpcRequest) obj2, (b) obj3, (String) serializable, tp4Var);
            default:
                exa exaVar = new exa((wm0) this.H, (x7e) this.I, (cae) serializable, (amg) this.K, (Context) this.L, (jfe) obj3, (drh) this.N, (xqh) this.O, (l45) obj2, tp4Var);
                exaVar.G = obj;
                return exaVar;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((exa) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((exa) create((u7e) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x030e  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exa(JsonRpcRequest jsonRpcRequest, b bVar, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.P = jsonRpcRequest;
        this.M = bVar;
        this.J = str;
    }
}
