package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kwf implements f89 {
    public final String E;
    public final k8i F;

    public kwf(String str, k8i k8iVar) {
        str.getClass();
        this.E = str;
        this.F = k8iVar;
    }

    @Override // defpackage.f89
    public final pqe c(v4e v4eVar) {
        kie kieVar = v4eVar.e;
        jie jieVarB = kieVar.b();
        jieVarB.a("X-Organization-Uuid", this.E);
        jieVarB.a("Anthropic-Version", "2023-06-01");
        if (kieVar.c.a("Anthropic-Beta") == null) {
            jieVarB.a("Anthropic-Beta", "ccr-byoc-2025-07-29");
        }
        String strF = this.F.f();
        if (strF != null) {
            jieVarB.a("X-Trusted-Device-Token", strF);
        }
        return v4eVar.b(new kie(jieVarB));
    }
}
