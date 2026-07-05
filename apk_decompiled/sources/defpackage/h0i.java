package defpackage;

import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.types.strings.McpServerId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0i implements lp7, zz7 {
    public final /* synthetic */ q0i E;

    public h0i(q0i q0iVar) {
        this.E = q0iVar;
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        return new pd(2, 4, q0i.class, this.E, "applyMcpBootstrapEvent", "applyMcpBootstrapEvent(Lcom/anthropic/claude/tool/mcp/McpBootstrapEvent;)V");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof lp7) && (obj instanceof zz7)) {
            return d().equals(((zz7) obj).d());
        }
        return false;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        kwb kwbVarC;
        j0b j0bVar = (j0b) obj;
        q0i q0iVar = this.E;
        koi koiVar = q0iVar.p;
        kdg kdgVar = koiVar.q;
        if (j0bVar instanceof i0b) {
            rcg rcgVarJ = ycg.j();
            kwb kwbVar = rcgVarJ instanceof kwb ? (kwb) rcgVarJ : null;
            if (kwbVar == null || (kwbVarC = kwbVar.C(null, null)) == null) {
                sz6.j("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                rcg rcgVarJ2 = kwbVarC.j();
                try {
                    q0iVar.i(((i0b) j0bVar).a, true);
                    ArrayList arrayList = ((i0b) j0bVar).a;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(McpServerId.m1029boximpl(((McpServer) it.next()).m346getUuidowoRr7k()));
                    }
                    b54.w0(new hfh(5, linkedHashSet), kdgVar);
                    rcg.q(rcgVarJ2);
                    kwbVarC.w().p();
                } catch (Throwable th) {
                    rcg.q(rcgVarJ2);
                    throw th;
                }
            } finally {
            }
        } else if (j0bVar instanceof g0b) {
            McpServer mcpServer = ((g0b) j0bVar).a;
            q0iVar.i(x44.W(mcpServer), mcpServer.getConnected() == null);
        } else if (j0bVar instanceof f0b) {
            b54.w0(new hfh(6, j0bVar), kdgVar);
            koiVar.n(false);
        } else if (!(j0bVar instanceof h0b)) {
            mr9.b();
            return null;
        }
        return iei.a;
    }

    public final int hashCode() {
        return d().hashCode();
    }
}
