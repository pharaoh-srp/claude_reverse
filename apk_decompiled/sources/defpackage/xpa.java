package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xpa extends zh4 {
    public final wc r;

    public xpa(wc wcVar) {
        this.r = wcVar;
    }

    @Override // defpackage.zh4
    public final void t(Object obj) {
        ad adVar = this.r.a;
        if (adVar != null) {
            adVar.t(obj);
        } else {
            sz6.j("Launcher has not been initialized");
        }
    }
}
