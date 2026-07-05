package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kg4 implements f89 {
    @Override // defpackage.f89
    public final pqe c(v4e v4eVar) {
        kie kieVar = v4eVar.e;
        pqe pqeVarB = v4eVar.b(kieVar);
        if (pqeVarB.H == 408) {
            String str = kieVar.b;
            wg8 wg8Var = kieVar.c;
            boolean zR = false;
            if (x44.r(str, "POST")) {
                String strA = wg8Var.a("connect-protocol-version");
                if (strA == null) {
                    strA = "";
                }
                if (strA.equals("1")) {
                    String strA2 = wg8Var.a("Content-Type");
                    if (isg.q0(strA2 != null ? strA2 : "", "application/", false)) {
                        zR = true;
                    }
                }
            } else if (x44.r(str, "GET")) {
                zR = x44.r(kieVar.a.g("connect"), "v1");
            }
            if (zR) {
                String strA3 = pqeVarB.J.a("Content-Type");
                p8b p8bVarD = null;
                if (strA3 != null) {
                    ide ideVar = p8b.e;
                    try {
                        p8bVarD = nai.D(strA3);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (p8bVarD != null && p8bVarD.b.equals("application") && p8bVarD.c.equals("json")) {
                    nqe nqeVarC = pqeVarB.c();
                    nqeVarC.c = 499;
                    nqeVarC.d = ij0.m(new StringBuilder(), pqeVarB.G, " |originally 408|");
                    return nqeVarC.a();
                }
            }
        }
        return pqeVarB;
    }
}
