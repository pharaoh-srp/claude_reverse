package defpackage;

import com.anthropic.claude.code.remote.c;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uz3 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ c G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uz3(c cVar, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = cVar;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new uz3(this.G, this.H, tp4Var, 0);
            default:
                return new uz3(this.G, this.H, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((uz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        c cVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    jwf jwfVar = cVar.c;
                    List list = cVar.u;
                    boolean z = cVar.v;
                    this.F = 1;
                    Object objJ = jwf.j(jwfVar, this.H, null, list, z, this, 5);
                    if (objJ == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    String strMo700getGroupingFiltern6qb3o = cVar.q.mo700getGroupingFiltern6qb3o();
                    jwf jwfVar2 = cVar.c;
                    String str = this.H;
                    Object objG = strMo700getGroupingFiltern6qb3o != null ? jwf.g(jwfVar2, str, x44.W(vq.GROUPING_MEMBER), strMo700getGroupingFiltern6qb3o, this, 6) : jwf.g(jwfVar2, str, null, null, this, 30);
                    if (objG == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
