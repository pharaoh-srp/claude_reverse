package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cl5 implements twb {
    public volatile xmi E;

    @Override // defpackage.twb
    public final void b() {
        this.E = new xmi(this.E.a, 30);
    }

    @Override // defpackage.twb
    public final void c(String str, String str2, Map map) {
        str.getClass();
        this.E = xmi.a(this.E, null, str, str2, sta.q0(map), 1);
    }

    @Override // defpackage.twb
    public final void m(String str) {
        this.E = xmi.a(this.E, str, null, null, null, 30);
    }

    @Override // defpackage.twb
    public final xmi r() {
        return this.E;
    }
}
