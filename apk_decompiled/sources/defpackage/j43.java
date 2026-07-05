package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.mcpapps.transport.McpServerCapabilities;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class j43 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j43(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.J;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                return new j43((t53) this.F, (ctc) obj5, (String) obj4, (McpServerCapabilities) obj3, (McpServer) obj2, tp4Var, 0);
            case 1:
                j43 j43Var = new j43((nwb) obj5, (x0a) obj4, (nwb) obj3, (nwb) obj2, tp4Var, 1);
                j43Var.F = obj;
                return j43Var;
            case 2:
                j43 j43Var2 = new j43((r4g) obj5, (pl3) obj4, (gf8) obj3, (bz7) obj2, tp4Var, 2);
                j43Var2.F = obj;
                return j43Var2;
            default:
                return new j43((Long) this.F, (o72) obj5, (nl5) obj4, (Locale) obj3, (nwb) obj2, tp4Var, 3);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((j43) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((j43) create((q0a) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((j43) create((l75) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                ((j43) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.J;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                sf5.h0(obj);
                t53 t53Var = (t53) this.F;
                McpServer mcpServer = (McpServer) obj2;
                t53Var.n0.put(((ctc) obj5).a, new txa((String) obj4, null, null, (McpServerCapabilities) obj3, null, t53.Q(t53Var, mcpServer, null), mcpServer.getAllowed_link_domains(), t53Var.L0, mcpServer.m346getUuidowoRr7k(), mcpServer.getUrl(), 22));
                return ieiVar;
            case 1:
                x0a x0aVar = (x0a) obj4;
                q0a q0aVar = (q0a) this.F;
                sf5.h0(obj);
                nwb nwbVar = (nwb) obj5;
                if (va6.a(((va6) nwbVar.getValue()).E, MTTypesetterKt.kLineSkipLimitMultiplier) > 0) {
                    int iM0 = ((cz5) ((nwb) obj3).getValue()).M0(((va6) nwbVar.getValue()).E);
                    int i2 = (x0aVar.h().m - x0aVar.h().q) - q0aVar.p;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    ((bz7) ((jm9) ((nwb) obj2).getValue())).invoke(new Integer(Math.min(iM0, i2)));
                }
                return ieiVar;
            case 2:
                l75 l75Var = (l75) this.F;
                sf5.h0(obj);
                if (l75Var == null) {
                    wg6.i();
                    return null;
                }
                ((r4g) obj5).a();
                ((pl3) obj4).d((gf8) obj3);
                ((bz7) obj2).invoke(l75Var.a);
                return ieiVar;
            default:
                sf5.h0(obj);
                Long l = (Long) this.F;
                if (l != null) {
                    nwb nwbVar2 = (nwb) obj2;
                    long jLongValue = l.longValue();
                    String str = ((nl5) obj4).c;
                    ZoneId zoneId = o72.e;
                    String str2 = Instant.ofEpochMilli(jLongValue).atZone(o72.e).toLocalDate().format(kvj.c(str, (Locale) obj3, ((o72) obj5).b));
                    cjh cjhVar = new cjh(str2, str2.length() == 0 ? kkh.b : mwa.m(str2.length(), str2.length()), 4);
                    qnc qncVar = rl5.a;
                    nwbVar2.setValue(cjhVar);
                }
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j43(Object obj, Object obj2, Object obj3, Object obj4, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
    }
}
