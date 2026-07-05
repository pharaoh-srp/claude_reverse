package defpackage;

import com.anthropic.claude.conway.protocol.AgentState;
import com.anthropic.claude.conway.protocol.ModelInfo;
import com.anthropic.claude.conway.protocol.b0;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mz4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ b0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz4(b0 b0Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = b0Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        b0 b0Var = this.F;
        switch (i) {
            case 0:
                return new mz4(b0Var, tp4Var, 0);
            default:
                return new mz4(b0Var, tp4Var, 1);
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
        return ((mz4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        pqe pqeVarF;
        int i = this.E;
        b0 b0Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                jie jieVar = new jie();
                jieVar.g(b0Var.a + "/sandbox/agents");
                b0Var.f(jieVar);
                jieVar.c();
                String str = (String) b0Var.i.get();
                if (str != null) {
                    jieVar.d("X-Client-Id", str);
                }
                pqeVarF = new f4e(b0Var.c, new kie(jieVar), false).f();
                try {
                    String strF = pqeVarF.K.f();
                    if (pqeVarF.U) {
                        List list = (List) ex4.a.b(strF, d4c.t(AgentState.Companion.serializer()));
                        pqeVarF.close();
                        return list;
                    }
                    throw new IOException("GET /sandbox/agents failed: HTTP " + pqeVarF.H + " " + strF);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            default:
                sf5.h0(obj);
                jie jieVar2 = new jie();
                jieVar2.g(b0Var.a + "/sandbox/model");
                b0Var.f(jieVar2);
                jieVar2.c();
                String str2 = (String) b0Var.i.get();
                if (str2 != null) {
                    jieVar2.d("X-Client-Id", str2);
                }
                pqeVarF = new f4e(b0Var.c, new kie(jieVar2), false).f();
                try {
                    String strF2 = pqeVarF.K.f();
                    if (pqeVarF.U) {
                        ModelInfo modelInfo = (ModelInfo) ex4.a.b(strF2, ModelInfo.Companion.serializer());
                        pqeVarF.close();
                        return modelInfo;
                    }
                    throw new IOException("GET /sandbox/model failed: HTTP " + pqeVarF.H + " " + strF2);
                } finally {
                }
        }
    }
}
