package defpackage;

import com.anthropic.claude.api.conway.RefreshMcpRequest;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.connector.auth.b;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.types.strings.McpServerId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hy4 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public /* synthetic */ String G;
    public final /* synthetic */ f H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy4(f fVar, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = fVar;
        this.G = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        f fVar = this.H;
        switch (i) {
            case 0:
                return new hy4(fVar, this.G, tp4Var);
            default:
                hy4 hy4Var = new hy4(fVar, tp4Var);
                hy4Var.G = ((McpServerId) obj).m1035unboximpl();
                return hy4Var;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((hy4) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((hy4) create(McpServerId.m1029boximpl(((McpServerId) obj).m1035unboximpl()), (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        f fVar = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    er4 er4Var = fVar.k;
                    String str = fVar.f.e;
                    RefreshMcpRequest refreshMcpRequest = new RefreshMcpRequest(this.G);
                    this.F = 1;
                    obj = er4Var.g(str, refreshMcpRequest, this);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                if (apiResult instanceof of0) {
                    return ieiVar;
                }
                if (!(apiResult instanceof nf0)) {
                    wg6.i();
                    return null;
                }
                nf0 nf0Var = (nf0) apiResult;
                zfa.a.getClass();
                if (!yfa.b()) {
                    return ieiVar;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList.add(obj2);
                }
                if (arrayList.isEmpty()) {
                    return ieiVar;
                }
                String strR = sq6.r(zfa.a, "refreshClients failed: ", nf0Var);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.WARN, "Conway", strR);
                }
                return ieiVar;
            default:
                String str2 = this.G;
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                b bVar = fVar.n;
                this.G = null;
                this.F = 1;
                return bVar.c.b(str2, this) == m45Var ? m45Var : ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy4(f fVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = fVar;
    }
}
