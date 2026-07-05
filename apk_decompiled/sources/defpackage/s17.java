package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s17 implements r17 {
    public final /* synthetic */ hdc a;

    public /* synthetic */ s17(hdc hdcVar) {
        this.a = hdcVar;
    }

    @Override // defpackage.r17
    public final m4e a(kie kieVar, gb9 gb9Var) {
        if (kieVar.c.a("Accept") == null) {
            jie jieVarB = kieVar.b();
            jieVarB.a("Accept", "text/event-stream");
            kieVar = new kie(jieVarB);
        }
        m4e m4eVar = new m4e(kieVar, gb9Var);
        f4e f4eVar = new f4e(this.a, kieVar, false);
        f4eVar.d(m4eVar);
        m4eVar.H = f4eVar;
        return m4eVar;
    }
}
