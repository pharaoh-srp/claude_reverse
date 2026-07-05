package defpackage;

import com.anthropic.claude.conway.protocol.PaginatedMessages;
import com.anthropic.claude.conway.protocol.b0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class n61 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n61(Object obj, long j, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.F = j;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new n61((p61) this.G, this.F, tp4Var, 0);
            case 1:
                return new n61((b0) this.G, this.F, tp4Var, 1);
            default:
                n61 n61Var = new n61(this.F, tp4Var);
                n61Var.G = obj;
                return n61Var;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((n61) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 1:
                return ((n61) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                ((n61) create((paf) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        long j = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                k61 k61Var = ((p61) this.G).E;
                float[] fArr = {d54.h(j), d54.g(j), d54.e(j), d54.d(j)};
                k61Var.getClass();
                k61Var.c = fArr;
                return ieiVar;
            case 1:
                sf5.h0(obj);
                b0 b0Var = (b0) this.G;
                String str = b0Var.a + "/sandbox/agents/main/messages?before=" + j + "&limit=100";
                jie jieVar = new jie();
                jieVar.g(str);
                b0Var.f(jieVar);
                jieVar.c();
                String str2 = (String) b0Var.i.get();
                if (str2 != null) {
                    jieVar.d("X-Client-Id", str2);
                }
                pqe pqeVarF = new f4e(b0Var.c, new kie(jieVar), false).f();
                try {
                    String strF = pqeVarF.K.f();
                    if (pqeVarF.U) {
                        PaginatedMessages paginatedMessages = (PaginatedMessages) ex4.a.b(strF, PaginatedMessages.Companion.serializer());
                        pqeVarF.close();
                        return paginatedMessages;
                    }
                    throw new IOException("GET /sandbox/agents/main/messages failed: HTTP " + pqeVarF.H + " " + strF);
                } finally {
                }
            default:
                sf5.h0(obj);
                raf rafVar = ((paf) this.G).a;
                rafVar.c(rafVar.k, j, 1);
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(long j, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.F = j;
    }
}
