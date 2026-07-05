package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i2d extends iwe {
    public final k1d b;
    public final String c;
    public final lsc d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2d(k1d k1dVar, String str, h86 h86Var) {
        super(h86Var);
        k1dVar.getClass();
        str.getClass();
        this.b = k1dVar;
        this.c = str;
        this.d = mpk.P(null);
    }

    @Override // defpackage.iwe, defpackage.y59
    public final void onDestroy() {
        v0d v0dVar = (v0d) this.d.getValue();
        if (v0dVar != null) {
            v0dVar.h = true;
            p5e p5eVar = v0dVar.f;
            if (p5eVar != null) {
                p5eVar.c(1000, "client disposed");
            }
            v0dVar.f = null;
        }
        this.d.setValue(null);
        super.onDestroy();
    }
}
