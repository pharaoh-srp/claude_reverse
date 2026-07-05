package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class vfi implements kw9, Serializable {
    public zy7 E;
    public Object F;

    @Override // defpackage.kw9
    public final boolean b() {
        return this.F != lja.d0;
    }

    @Override // defpackage.kw9
    public final Object getValue() {
        if (this.F == lja.d0) {
            zy7 zy7Var = this.E;
            zy7Var.getClass();
            this.F = zy7Var.a();
            this.E = null;
        }
        return this.F;
    }

    public final String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
