package defpackage;

import com.anthropic.claude.conway.protocol.ConwayHttpException;
import com.anthropic.claude.conway.protocol.ConwaySearchHit;
import com.anthropic.claude.conway.protocol.ConwaySearchResponse;
import com.anthropic.claude.conway.protocol.b0;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lz4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ b0 F;
    public final /* synthetic */ String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lz4(b0 b0Var, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = b0Var;
        this.G = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.G;
        b0 b0Var = this.F;
        switch (i) {
            case 0:
                return new lz4(b0Var, str, tp4Var, 0);
            default:
                return new lz4(b0Var, str, tp4Var, 1);
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
        return ((lz4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        pqe pqeVarF;
        int i = this.E;
        String str = this.G;
        b0 b0Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                jie jieVar = new jie();
                jieVar.g(b0Var.a + str);
                b0Var.f(jieVar);
                jieVar.c();
                String str2 = (String) b0Var.i.get();
                if (str2 != null) {
                    jieVar.d("X-Client-Id", str2);
                }
                pqeVarF = new f4e(b0Var.c, new kie(jieVar), false).f();
                try {
                    String strF = pqeVarF.K.f();
                    if (!pqeVarF.U) {
                        throw new ConwayHttpException("GET", str, pqeVarF.H, strF);
                    }
                    pqeVarF.close();
                    return strF;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            default:
                sf5.h0(obj);
                String strO = kgh.o(b0Var.a, "/sandbox/search");
                us8 us8Var = new us8();
                us8Var.h(null, strO);
                us8 us8VarF = us8Var.c().f();
                us8VarF.b("q", str);
                vs8 vs8VarC = us8VarF.c();
                jie jieVar2 = new jie();
                jieVar2.a = vs8VarC;
                b0Var.f(jieVar2);
                jieVar2.c();
                String str3 = (String) b0Var.i.get();
                if (str3 != null) {
                    jieVar2.d("X-Client-Id", str3);
                }
                pqeVarF = new f4e(b0Var.c, new kie(jieVar2), false).f();
                try {
                    String strF2 = pqeVarF.K.f();
                    if (pqeVarF.U) {
                        List<ConwaySearchHit> results = ((ConwaySearchResponse) ex4.a.b(strF2, ConwaySearchResponse.Companion.serializer())).getResults();
                        pqeVarF.close();
                        return results;
                    }
                    throw new IOException("GET /sandbox/search failed: HTTP " + pqeVarF.H + " " + strF2);
                } finally {
                }
        }
    }
}
