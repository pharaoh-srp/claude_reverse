package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class oyg implements nyg, Serializable {
    public final transient Object E = new Object();
    public final nyg F;
    public volatile transient boolean G;
    public transient Object H;

    public oyg(nyg nygVar) {
        this.F = nygVar;
    }

    @Override // defpackage.nyg
    public final Object get() {
        if (!this.G) {
            synchronized (this.E) {
                try {
                    if (!this.G) {
                        Object obj = this.F.get();
                        this.H = obj;
                        this.G = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.H;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.G) {
            obj = "<supplier that returned " + this.H + ">";
        } else {
            obj = this.F;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
