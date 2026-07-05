package defpackage;

import com.anthropic.claude.api.mcp.McpPrompt;
import com.anthropic.claude.api.mcp.McpPromptArgument;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c3b extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3b(boolean z, List list, f03 f03Var, McpPrompt mcpPrompt, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = z;
        this.G = list;
        this.H = f03Var;
        this.I = mcpPrompt;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                return new c3b(this.F, (List) this.G, (f03) obj3, (McpPrompt) obj2, tp4Var);
            default:
                c3b c3bVar = new c3b((sih) obj3, (e8d) obj2, this.F, tp4Var);
                c3bVar.G = obj;
                return c3bVar;
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
                ((c3b) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
            default:
                return ((c3b) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        boolean z = this.F;
        Object obj2 = this.I;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                f03 f03Var = (f03) obj3;
                mdg mdgVar = f03Var.x;
                sf5.h0(obj);
                if (!z) {
                    for (McpPromptArgument mcpPromptArgument : (List) this.G) {
                        String name = mcpPromptArgument.getName();
                        if (name != null && !mdgVar.containsKey(name)) {
                            mdgVar.put(name, new y2b(name, mcpPromptArgument.getDescription(), x44.r(mcpPromptArgument.getRequired(), Boolean.TRUE), ""));
                        }
                    }
                    f03Var.w.setValue((McpPrompt) obj2);
                }
                return iei.a;
            default:
                sf5.h0(obj);
                l45 l45Var = (l45) this.G;
                sih sihVar = (sih) obj3;
                e8d e8dVar = (e8d) obj2;
                ufh ufhVar = new ufh(sihVar, e8dVar, null, 4);
                o45 o45Var = o45.H;
                gb9.D(l45Var, null, o45Var, ufhVar, 1);
                gb9.D(l45Var, null, o45Var, new pih(e8dVar, sihVar, z, (tp4) null), 1).D0(new gih(sihVar, 1));
                return gb9.D(l45Var, null, o45Var, new pih(sihVar, e8dVar, z, (tp4) null), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3b(sih sihVar, e8d e8dVar, boolean z, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = sihVar;
        this.I = e8dVar;
        this.F = z;
    }
}
