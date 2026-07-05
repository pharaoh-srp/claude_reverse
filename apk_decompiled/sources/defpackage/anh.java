package defpackage;

import com.anthropic.claude.analytics.events.ThirdPartyToolEvents$ThirdPartyToolParseFailed;
import com.anthropic.claude.api.chat.tool.Tool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class anh extends xzg implements pz7 {
    public final /* synthetic */ dnh E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anh(dnh dnhVar, String str, String str2, String str3, String str4, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = dnhVar;
        this.F = str;
        this.G = str2;
        this.H = str3;
        this.I = str4;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new anh(this.E, this.F, this.G, this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((anh) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String str = this.G;
        dnh dnhVar = this.E;
        sf5.h0(obj);
        try {
            Iterable iterable = (Iterable) dnhVar.c.a.b(this.F, d4c.t(Tool.CustomTool.Companion.serializer()));
            String str2 = this.H;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                xmh xmhVarB = dnh.b(dnhVar, str, str2, (Tool.CustomTool) it.next());
                if (xmhVarB != null) {
                    arrayList.add(xmhVarB);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList2.add(obj2);
                }
                if (!arrayList2.isEmpty()) {
                    zfa.a.getClass();
                    String strK = ij0.k("Failed to parse tools from ", this.I, ": ", gsk.c(th));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((n30) ((zfa) it2.next())).b(sfa.WARN, "ThirdPartyAppToolBridge", strK);
                    }
                }
            }
            dnhVar.f.e(new ThirdPartyToolEvents$ThirdPartyToolParseFailed(str, "malformed_json"), ThirdPartyToolEvents$ThirdPartyToolParseFailed.Companion.serializer());
            return lm6.E;
        }
    }
}
