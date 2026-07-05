package defpackage;

import com.anthropic.claude.api.mcp.McpServer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hk4 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    public /* synthetic */ hk4(McpServer mcpServer, zy7 zy7Var, bz7 bz7Var, pz7 pz7Var, bz7 bz7Var2, iqb iqbVar, bz7 bz7Var3, zy7 zy7Var2, qnc qncVar, int i, int i2) {
        this.I = mcpServer;
        this.F = zy7Var;
        this.K = bz7Var;
        this.N = pz7Var;
        this.L = bz7Var2;
        this.O = iqbVar;
        this.M = bz7Var3;
        this.J = zy7Var2;
        this.P = qncVar;
        this.G = i;
        this.H = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        Object obj3 = this.P;
        Object obj4 = this.O;
        Object obj5 = this.N;
        Object obj6 = this.M;
        Object obj7 = this.L;
        Object obj8 = this.K;
        Object obj9 = this.J;
        Object obj10 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                cqk.a((McpServer) obj10, this.F, (bz7) obj8, (pz7) obj5, (bz7) obj7, (iqb) obj4, (bz7) obj6, (zy7) obj9, (qnc) obj3, (ld4) obj, iP0, this.H);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                jwk.s((String) obj10, (String) obj9, (String) obj8, (String) obj7, (String) obj6, (String) obj5, this.F, (String) obj4, (qi3) obj3, (ld4) obj, iP02, this.H);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ hk4(String str, String str2, String str3, String str4, String str5, String str6, zy7 zy7Var, String str7, qi3 qi3Var, int i, int i2) {
        this.I = str;
        this.J = str2;
        this.K = str3;
        this.L = str4;
        this.M = str5;
        this.N = str6;
        this.F = zy7Var;
        this.O = str7;
        this.P = qi3Var;
        this.G = i;
        this.H = i2;
    }
}
