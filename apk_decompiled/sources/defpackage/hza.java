package defpackage;

import com.anthropic.claude.mcpapps.transport.HostContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class hza extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vza F;
    public final /* synthetic */ HostContext G;
    public final /* synthetic */ bg9 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hza(vza vzaVar, HostContext hostContext, bg9 bg9Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = vzaVar;
        this.G = hostContext;
        this.H = bg9Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new hza(this.F, this.G, this.H, tp4Var, 0);
            default:
                return new hza(this.F, this.G, this.H, tp4Var, 1);
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
                ((hza) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((hza) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        bg9 bg9Var = this.H;
        vza vzaVar = this.F;
        HostContext hostContext = this.G;
        switch (i) {
            case 0:
                sf5.h0(obj);
                if (vzaVar.d() && !x44.r(hostContext, vzaVar.u)) {
                    lok.c(vzaVar, bg9Var, hostContext);
                }
                break;
            default:
                sf5.h0(obj);
                if (vzaVar.a() && !vzaVar.d() && !x44.r(hostContext, vzaVar.u)) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj2)).getClass();
                            arrayList.add(obj2);
                        }
                        if (!arrayList.isEmpty()) {
                            zfa.a.getClass();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfa.INFO, "McpAppViewHost", "Sending inline host context change");
                            }
                        }
                    }
                    aya ayaVar = vzaVar.a;
                    bg9Var.getClass();
                    ayaVar.d("ui/notifications/host-context-changed", ch9.i(bg9Var.c(hostContext, HostContext.Companion.serializer())));
                    vzaVar.u = hostContext;
                }
                break;
        }
        return ieiVar;
    }
}
