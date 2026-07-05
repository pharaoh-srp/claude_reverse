package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o1i {
    public peh a;
    public n1i b = n1i.E;

    public final void a() {
        jeh jehVar;
        if (this.b == n1i.E) {
            e39.c("ToolbarRequester is not initialized.");
        }
        peh pehVar = this.a;
        if (pehVar == null || !pehVar.R) {
            return;
        }
        fkg fkgVar = pehVar.Y;
        if ((fkgVar == null || !fkgVar.c()) && (jehVar = (jeh) yb5.o(pehVar, keh.a())) != null) {
            pehVar.Y = gb9.D(pehVar.d1(), null, o45.H, new v2h(pehVar, jehVar, null, 5), 1);
        }
    }
}
