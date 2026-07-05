package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.mcpapps.transport.ToolInputDeltaParams;
import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutputConnectorsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class vy4 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy4(vya vyaVar, vza vzaVar, boolean z, bg9 bg9Var, bz7 bz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = vyaVar;
        this.H = vzaVar;
        this.F = z;
        this.I = bg9Var;
        this.J = bz7Var;
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
                return new vy4((nwb) obj5, (nwb) obj4, (koi) obj3, this.F, (f) obj2, tp4Var);
            default:
                return new vy4((vya) obj5, (vza) obj4, this.F, (bg9) obj3, (bz7) obj2, tp4Var);
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
                ((vy4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((vy4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        Object obj2 = this.J;
        Object obj3 = this.I;
        boolean z = this.F;
        Object obj4 = this.H;
        Object obj5 = this.G;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                nwb nwbVar = (nwb) obj4;
                sf5.h0(obj);
                if (((di4) ((nwb) obj5).getValue()) == null) {
                    ConwaySuggestConnectorsOutputConnectorsItem conwaySuggestConnectorsOutputConnectorsItem = (ConwaySuggestConnectorsOutputConnectorsItem) nwbVar.getValue();
                    if (conwaySuggestConnectorsOutputConnectorsItem != null) {
                        koi koiVar = (koi) obj3;
                        zy1 zy1Var = ((f) obj2).r;
                        McpServer mcpServerB = e05.b(koiVar.q, conwaySuggestConnectorsOutputConnectorsItem);
                        if (mcpServerB != null ? x44.r(mcpServerB.getConnected(), Boolean.TRUE) : false) {
                            st6 st6Var = st6.F;
                            if (z && e05.c(mcpServerB, koiVar.c())) {
                                String name = conwaySuggestConnectorsOutputConnectorsItem.getName();
                                name.getClass();
                                zy1Var.r(new qt6(R.string.conway_connector_always_allowed_snackbar, x44.W(name), st6Var));
                            } else {
                                String name2 = conwaySuggestConnectorsOutputConnectorsItem.getName();
                                name2.getClass();
                                zy1Var.r(new qt6(R.string.conway_connector_connected_snackbar, x44.W(name2), st6Var));
                            }
                        }
                    }
                    nwbVar.setValue(null);
                }
                break;
            default:
                sf5.h0(obj);
                vya vyaVar = (vya) obj5;
                String str = vyaVar.h;
                vza vzaVar = (vza) obj4;
                if (vzaVar.a() && str != null && vyaVar.g == null && z) {
                    int length = str.length();
                    int i2 = vzaVar.s;
                    if (length > i2) {
                        String strSubstring = str.substring(i2);
                        vzaVar.s = str.length();
                        zfa.a.getClass();
                        if (yfa.b()) {
                            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj6 : copyOnWriteArrayList) {
                                ((n30) ((zfa) obj6)).getClass();
                                arrayList.add(obj6);
                            }
                            if (!arrayList.isEmpty()) {
                                zfa.a.getClass();
                                String strU = grc.u("Sending tool input delta (", strSubstring.length(), " chars)");
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((n30) ((zfa) it.next())).b(sfa.INFO, "McpAppViewHost", strU);
                                }
                            }
                        }
                        aya ayaVar = vzaVar.a;
                        bg9 bg9Var = (bg9) obj3;
                        ToolInputDeltaParams toolInputDeltaParams = new ToolInputDeltaParams(strSubstring);
                        bg9Var.getClass();
                        ayaVar.d("ui/notifications/tool-input-delta", ch9.i(bg9Var.c(toolInputDeltaParams, ToolInputDeltaParams.Companion.serializer())));
                        bz7 bz7Var = (bz7) obj2;
                        if (bz7Var != null) {
                            bz7Var.invoke("ui/notifications/tool-input-delta");
                        }
                    }
                }
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy4(nwb nwbVar, nwb nwbVar2, koi koiVar, boolean z, f fVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = nwbVar;
        this.H = nwbVar2;
        this.I = koiVar;
        this.F = z;
        this.J = fVar;
    }
}
