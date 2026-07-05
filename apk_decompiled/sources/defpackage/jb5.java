package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class jb5 implements f89 {
    public final i25 E;

    public jb5(i25 i25Var) {
        this.E = i25Var;
    }

    @Override // defpackage.f89
    public final pqe c(v4e v4eVar) {
        kie kieVar = v4eVar.e;
        jie jieVarB = kieVar.b();
        vs8 vs8Var = kieVar.a;
        i25 i25Var = this.E;
        List listB = i25Var.b(vs8Var);
        if (!listB.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (Object obj : listB) {
                int i2 = i + 1;
                if (i < 0) {
                    x44.n0();
                    throw null;
                }
                g25 g25Var = (g25) obj;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(g25Var.a);
                sb.append('=');
                sb.append(g25Var.b);
                i = i2;
            }
            jieVarB.d("Cookie", sb.toString());
        }
        kie kieVar2 = new kie(jieVarB);
        pqe pqeVarB = v4eVar.b(kieVar2);
        wg8 wg8Var = pqeVarB.J;
        Pattern pattern = g25.k;
        vs8 vs8Var2 = kieVar2.a;
        List listM = eve.M(vs8Var2, wg8Var);
        if (!listM.isEmpty()) {
            i25Var.a(vs8Var2, listM);
        }
        return pqeVarB;
    }
}
