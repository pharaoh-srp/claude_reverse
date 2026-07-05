package defpackage;

import android.content.Context;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.api.mcp.McpAuthStatus;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.h;
import com.anthropic.claude.connector.auth.b;
import com.anthropic.claude.types.strings.DirectoryServerId;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class uj4 extends iwe {
    public final ij4 b;
    public final koi c;
    public final b d;
    public final mn5 e;
    public final zy1 f;
    public final amg g;
    public final amg h;
    public final amg i;
    public final a4e j;
    public final a4e k;
    public final wz5 l;

    public uj4(ij4 ij4Var, koi koiVar, b bVar, mn5 mn5Var, h86 h86Var) {
        super(h86Var);
        this.b = ij4Var;
        this.c = koiVar;
        this.d = bVar;
        this.e = mn5Var;
        this.f = x44.a();
        amg amgVarA = bmg.a("");
        this.g = amgVarA;
        tp4 tp4Var = null;
        amg amgVarA2 = bmg.a(null);
        this.h = amgVarA2;
        amg amgVarA3 = bmg.a(n56.F);
        this.i = amgVarA3;
        a4e a4eVar = ij4Var.f;
        z01 z01Var = new z01(a4eVar, 3);
        mp4 mp4Var = this.a;
        lm6 lm6Var = lm6.E;
        ql8 ql8Var = v3g.a;
        this.j = j8.f0(z01Var, mp4Var, ql8Var, lm6Var);
        this.k = j8.f0(new z01(a4eVar, 4), this.a, ql8Var, Boolean.FALSE);
        int i = 0;
        this.l = mpk.w(new kj4(this, i));
        g56 g56Var = (g56) ij4Var.h.getValue();
        amgVarA.m(g56Var.b);
        amgVarA2.m(g56Var.c);
        amgVarA3.m(g56Var.a);
        gb9.D(this.a, null, null, new mj4(this, tp4Var, i), 3);
        gb9.D(this.a, null, null, new mj4(this, tp4Var, 1), 3);
    }

    public final ek4 O(DirectoryServer directoryServer) {
        directoryServer.getClass();
        Map map = (Map) this.l.getValue();
        String strA = h.a(directoryServer);
        McpServer mcpServer = (McpServer) map.get(strA != null ? xvk.h(strA) : null);
        if (mcpServer == null && !this.c.a()) {
            return ek4.H;
        }
        ek4 ek4Var = ek4.E;
        if (mcpServer == null) {
            return ek4Var;
        }
        if (x44.r(mcpServer.getConnected(), Boolean.TRUE)) {
            return ek4.F;
        }
        McpAuthStatus authStatus = mcpServer.getAuthStatus();
        return (authStatus == null || !authStatus.isExplicitTokenError()) ? ek4Var : ek4.G;
    }

    public final void P(DirectoryServer directoryServer, hi4 hi4Var, Context context) {
        directoryServer.getClass();
        hi4Var.getClass();
        context.getClass();
        amg amgVar = this.b.g;
        if (amgVar.l(null, DirectoryServerId.m999boximpl(directoryServer.m342getIdHdVeoME()))) {
            d44 d44Var = new d44(amgVar, 5, directoryServer);
            zy1 zy1Var = this.f;
            zy1Var.getClass();
            hi4Var.d = gb9.D(hi4Var.c, null, null, new b9(hi4Var, directoryServer, context, zy1Var, d44Var, null, 10), 3);
        }
    }
}
