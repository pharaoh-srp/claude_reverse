package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hkc implements f89 {
    public final String E;

    public hkc(String str) {
        str.getClass();
        this.E = str;
    }

    @Override // defpackage.f89
    public final pqe c(v4e v4eVar) {
        jie jieVarB = v4eVar.e.b();
        jieVarB.a("x-organization-id", this.E);
        return v4eVar.b(new kie(jieVarB));
    }
}
