package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y1a implements sbj {
    public zy7 a;
    public lsc b;
    public final lsc c = mpk.P(Boolean.FALSE);

    public final long a() {
        sz5 sz5Var;
        if (this.b == null) {
            zy7 zy7Var = this.a;
            if (zy7Var == null || (sz5Var = (sz5) zy7Var.a()) == null) {
                sz5Var = sz5.c;
            }
            this.b = mpk.P(sz5Var);
            this.a = null;
        }
        lsc lscVar = this.b;
        lscVar.getClass();
        return ((sz5) lscVar.getValue()).a;
    }

    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
