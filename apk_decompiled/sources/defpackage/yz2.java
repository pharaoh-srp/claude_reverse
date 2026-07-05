package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$McpServersListed;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yz2 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ f03 F;

    public /* synthetic */ yz2(f03 f03Var, int i) {
        this.E = i;
        this.F = f03Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        f03 f03Var = this.F;
        switch (i) {
            case 0:
                break;
            case 1:
                koi koiVar = f03Var.k;
                int size = koiVar.f().size();
                if (f03Var.v && size > 0) {
                    f03Var.v = false;
                    f03Var.c.e(new McpEvents$McpServersListed(koiVar.e, size), McpEvents$McpServersListed.Companion.serializer());
                }
                break;
            case 2:
                f03Var.w.setValue(null);
                f03Var.x.clear();
                break;
            default:
                f03Var.O().r();
                break;
        }
        return ieiVar;
    }
}
