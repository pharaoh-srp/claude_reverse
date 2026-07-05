package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qyg implements nyg {
    public static final pyg H = new pyg();
    public final Object E = new Object();
    public volatile nyg F;
    public Object G;

    public qyg(nyg nygVar) {
        this.F = nygVar;
    }

    @Override // defpackage.nyg
    public final Object get() {
        nyg nygVar = this.F;
        pyg pygVar = H;
        if (nygVar != pygVar) {
            synchronized (this.E) {
                try {
                    if (this.F != pygVar) {
                        Object obj = this.F.get();
                        this.G = obj;
                        this.F = pygVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.G;
    }

    public final String toString() {
        Object obj = this.F;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == H) {
            obj = "<supplier that returned " + this.G + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
