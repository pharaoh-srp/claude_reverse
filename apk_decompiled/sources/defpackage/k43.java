package defpackage;

import com.anthropic.claude.mcpapps.McpAppApi$McpAppFetchException;

/* JADX INFO: loaded from: classes2.dex */
public final class k43 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t53 F;
    public final /* synthetic */ ctc G;
    public final /* synthetic */ Exception H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k43(t53 t53Var, ctc ctcVar, Exception exc, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = t53Var;
        this.G = ctcVar;
        this.H = exc;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new k43(this.F, this.G, this.H, tp4Var, 0);
            default:
                return new k43(this.F, this.G, this.H, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((k43) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((k43) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String str;
        String strI;
        int i = this.E;
        iei ieiVar = iei.a;
        Exception exc = this.H;
        ctc ctcVar = this.G;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                t53Var.n0.put(ctcVar.a, new txa(null, null, null, null, qxa.a, null, null, null, null, null, 1007));
                String message = exc.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                t53Var.D1(ctcVar, message, aok.i(exc), aok.h(exc));
                break;
            default:
                sf5.h0(obj);
                t53Var.n0.put(ctcVar.a, new txa(null, null, null, null, lxa.a, null, null, null, null, null, 1007));
                Integer numH = aok.h(exc);
                if (numH != null) {
                    str = "HTML fetch failed (" + numH + ")";
                } else {
                    str = "HTML fetch failed";
                }
                McpAppApi$McpAppFetchException mcpAppApi$McpAppFetchException = exc instanceof McpAppApi$McpAppFetchException ? (McpAppApi$McpAppFetchException) exc : null;
                if (mcpAppApi$McpAppFetchException == null || (strI = mcpAppApi$McpAppFetchException.E) == null) {
                    strI = aok.i(exc);
                }
                t53Var.D1(ctcVar, str, strI, numH);
                break;
        }
        return ieiVar;
    }
}
