package defpackage;

import android.content.Context;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.mcpapps.transport.McpUiContentBlock;
import com.anthropic.claude.mcpapps.transport.UpdateModelContextParams;
import com.anthropic.claude.types.strings.TaskId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n23 extends xzg implements rz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n23(gw8 gw8Var, nwb nwbVar, nwb nwbVar2, tp4 tp4Var) {
        super(3, tp4Var);
        this.E = 3;
        this.F = gw8Var;
        this.G = nwbVar;
        this.H = nwbVar2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                n23 n23Var = new n23((t53) obj4, (tp4) obj3, 0);
                n23Var.F = (ctc) obj;
                n23Var.G = (UpdateModelContextParams) obj2;
                n23Var.invokeSuspend(ieiVar);
                break;
            case 1:
                n23 n23Var2 = new n23((Context) obj4, (tp4) obj3, 1);
                n23Var2.F = (String) obj;
                n23Var2.G = (String) obj2;
                break;
            case 2:
                n23 n23Var3 = new n23((f) obj4, (tp4) obj3, 2);
                n23Var3.F = (String) obj;
                n23Var3.G = (String) obj2;
                break;
            case 3:
                long j = ((fcc) obj2).a;
                new n23((gw8) this.F, (nwb) this.G, (nwb) obj4, (tp4) obj3).invokeSuspend(ieiVar);
                break;
            case 4:
                n23 n23Var4 = new n23((z9e) this.G, (iqf) obj4, (tp4) obj3, 4);
                n23Var4.F = (Throwable) obj2;
                n23Var4.invokeSuspend(ieiVar);
                break;
            case 5:
                n23 n23Var5 = new n23((e8h) this.G, (String) obj4, (tp4) obj3, 5);
                n23Var5.F = (Throwable) obj2;
                n23Var5.invokeSuspend(ieiVar);
                break;
            default:
                n23 n23Var6 = new n23((String) this.G, (String) obj4, (tp4) obj3, 6);
                n23Var6.F = (Throwable) obj2;
                n23Var6.invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        sfa sfaVar = sfa.WARN;
        iei ieiVar = iei.a;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                ctc ctcVar = (ctc) this.F;
                UpdateModelContextParams updateModelContextParams = (UpdateModelContextParams) this.G;
                sf5.h0(obj);
                String str = ctcVar.b;
                List<McpUiContentBlock> content = updateModelContextParams.getContent();
                str.getClass();
                content.getClass();
                ((t53) obj2).v0.put(str, content);
                break;
            case 1:
                String str2 = (String) this.F;
                String str3 = (String) this.G;
                sf5.h0(obj);
                cpc cpcVarN = hj6.N((Context) obj2, str2, str3, null, null);
                boolean zBooleanValue = ((Boolean) cpcVarN.E).booleanValue();
                String str4 = (String) cpcVarN.F;
                if (zBooleanValue) {
                    i15 i15Var = i15.d;
                } else {
                    i15 i15Var2 = i15.d;
                }
                break;
            case 2:
                String str5 = (String) this.F;
                String str6 = (String) this.G;
                sf5.h0(obj);
                cpc cpcVarN2 = hj6.N(((f) obj2).b, str5, str6, null, null);
                boolean zBooleanValue2 = ((Boolean) cpcVarN2.E).booleanValue();
                String str7 = (String) cpcVarN2.F;
                if (zBooleanValue2) {
                    i15 i15Var3 = i15.d;
                } else {
                    i15 i15Var4 = i15.d;
                }
                break;
            case 3:
                sf5.h0(obj);
                nwb nwbVar = (nwb) this.G;
                float f = tw8.b;
                nwbVar.setValue(Boolean.TRUE);
                lf9 lf9Var = (lf9) ((nwb) obj2).getValue();
                if (lf9Var != null) {
                    lf9Var.d(null);
                }
                ((gw8) this.F).d(true);
                break;
            case 4:
                Throwable th = (Throwable) this.F;
                sf5.h0(obj);
                ((z9e) this.G).E = true;
                amg amgVar = ((iqf) obj2).f;
                Exception exc = th instanceof Exception ? (Exception) th : null;
                if (exc == null) {
                    exc = new Exception(th);
                }
                nh4 nh4Var = new nh4(exc);
                amgVar.getClass();
                amgVar.n(null, nh4Var);
                break;
            case 5:
                Throwable th2 = (Throwable) this.F;
                sf5.h0(obj);
                String str8 = (String) obj2;
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj3)).getClass();
                        arrayList.add(obj3);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String strK = ij0.k("stream ended for ", TaskId.m1133toStringimpl(str8), ": ", gsk.c(th2));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, "TaskSessionEventLog", strK);
                        }
                    }
                }
                e8h e8hVar = (e8h) this.G;
                v7h v7hVar = new v7h(th2);
                ih9 ih9Var = e8h.f;
                e8hVar.d.setValue(v7hVar);
                break;
            default:
                Throwable th3 = (Throwable) this.F;
                sf5.h0(obj);
                if (th3 != null) {
                    String str9 = (String) this.G;
                    String str10 = (String) obj2;
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : copyOnWriteArrayList2) {
                            ((n30) ((zfa) obj4)).getClass();
                            arrayList2.add(obj4);
                        }
                        if (!arrayList2.isEmpty()) {
                            zfa.a.getClass();
                            String strM1133toStringimpl = TaskId.m1133toStringimpl(str9);
                            String strC = gsk.c(th3);
                            StringBuilder sbR = kgh.r("stream ended for ", strM1133toStringimpl, "/", str10, ": ");
                            sbR.append(strC);
                            String string = sbR.toString();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ((n30) ((zfa) it2.next())).b(sfaVar, "TaskStepEventLog", string);
                            }
                        }
                    }
                }
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n23(Object obj, tp4 tp4Var, int i) {
        super(3, tp4Var);
        this.E = i;
        this.H = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n23(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(3, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
    }
}
