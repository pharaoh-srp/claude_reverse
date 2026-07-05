package defpackage;

import com.anthropic.claude.api.mcp.McpServer;
import java.util.LinkedHashMap;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kj4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ uj4 F;

    public /* synthetic */ kj4(uj4 uj4Var, int i) {
        this.E = i;
        this.F = uj4Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        uj4 uj4Var = this.F;
        switch (i) {
            case 0:
                kdg kdgVar = uj4Var.c.q;
                int iD0 = tta.d0(x44.y(kdgVar, 10));
                if (iD0 < 16) {
                    iD0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                ListIterator listIterator = kdgVar.listIterator();
                while (true) {
                    c8a c8aVar = (c8a) listIterator;
                    if (!c8aVar.hasNext()) {
                        return linkedHashMap;
                    }
                    Object next = c8aVar.next();
                    String url = ((McpServer) next).getUrl();
                    linkedHashMap.put(url != null ? xvk.h(url) : null, next);
                }
                break;
            default:
                uj4Var.h.m(null);
                return iei.a;
        }
    }
}
