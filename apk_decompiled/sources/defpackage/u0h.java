package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class u0h implements kw9, Serializable {
    public zy7 E;
    public volatile Object F;
    public final Object G;

    public u0h(zy7 zy7Var) {
        zy7Var.getClass();
        this.E = zy7Var;
        this.F = lja.d0;
        this.G = this;
    }

    @Override // defpackage.kw9
    public final boolean b() {
        return this.F != lja.d0;
    }

    @Override // defpackage.kw9
    public final Object getValue() {
        Object objA;
        Object obj = this.F;
        lja ljaVar = lja.d0;
        if (obj != ljaVar) {
            return obj;
        }
        synchronized (this.G) {
            objA = this.F;
            if (objA == ljaVar) {
                zy7 zy7Var = this.E;
                zy7Var.getClass();
                objA = zy7Var.a();
                this.F = objA;
                this.E = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
