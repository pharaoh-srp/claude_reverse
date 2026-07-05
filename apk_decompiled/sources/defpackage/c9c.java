package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c9c extends iwe {
    public final qi3 b;
    public final z8c c;
    public final zy1 d;
    public final lsc e;
    public final lsc f;
    public final cbf g;

    public c9c(qi3 qi3Var, z8c z8cVar, h86 h86Var) {
        super(h86Var);
        this.b = qi3Var;
        this.c = z8cVar;
        this.d = x44.a();
        this.e = mpk.P(Boolean.TRUE);
        tp4 tp4Var = null;
        this.f = mpk.P(null);
        this.g = new cbf(new tl8(22, this), new kza(this, tp4Var, 10));
        gb9.D(this.a, null, null, new al8(this, tp4Var, 20), 3);
    }

    public final wlg O(g9c g9cVar) {
        z8c z8cVar = this.c;
        z8cVar.getClass();
        wlg wlgVar = (wlg) z8cVar.d.get(g9cVar);
        return wlgVar == null ? mpk.w(new nlh(13)) : wlgVar;
    }

    public final void P(g9c g9cVar, boolean z) {
        gb9.D(this.a, null, null, new ku(this, g9cVar, z, (tp4) null, 15), 3);
    }
}
