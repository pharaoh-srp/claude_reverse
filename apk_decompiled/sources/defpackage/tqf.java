package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.sessions.types.StdinMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class tqf extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ jrf G;
    public final /* synthetic */ String H;
    public final /* synthetic */ StdinMessage.ControlRequest I;
    public final /* synthetic */ z9e J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqf(jrf jrfVar, String str, StdinMessage.ControlRequest controlRequest, z9e z9eVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = jrfVar;
        this.H = str;
        this.I = controlRequest;
        this.J = z9eVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        tqf tqfVar = new tqf(this.G, this.H, this.I, this.J, tp4Var);
        tqfVar.F = obj;
        return tqfVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((tqf) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        l45 l45Var = (l45) this.F;
        int i = this.E;
        sfa sfaVar = sfa.WARN;
        z9e z9eVar = this.J;
        try {
            if (i == 0) {
                sf5.h0(obj);
                jwf jwfVar = this.G.a;
                String str = this.H;
                List listW = x44.W(this.I);
                this.F = l45Var;
                this.E = 1;
                obj = jwfVar.l(str, listW, this);
                m45 m45Var = m45.E;
                if (obj == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (!(apiResult instanceof of0)) {
                if (!(apiResult instanceof nf0)) {
                    throw new NoWhenBranchMatchedException();
                }
                z9eVar.E = false;
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(l45Var);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList.add(obj2);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String str2 = "initialize control request failed: " + oyk.b((nf0) apiResult);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, strE, str2);
                        }
                    }
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            z9eVar.E = false;
            zfa.a.getClass();
            if (yfa.b()) {
                String strE2 = iuj.E(l45Var);
                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : copyOnWriteArrayList2) {
                    ((n30) ((zfa) obj3)).getClass();
                    arrayList2.add(obj3);
                }
                if (!arrayList2.isEmpty()) {
                    String strQ = sq6.q(zfa.a, e2, "initialize control request threw: ");
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((n30) ((zfa) it2.next())).b(sfaVar, strE2, strQ);
                    }
                }
            }
        }
        return iei.a;
    }
}
