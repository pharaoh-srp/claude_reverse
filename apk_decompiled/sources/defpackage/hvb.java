package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvb extends wra implements pm9 {
    public final syc G;
    public Object H;

    public hvb(syc sycVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.G = sycVar;
        this.H = obj2;
    }

    @Override // defpackage.wra, java.util.Map.Entry
    public final Object getValue() {
        return this.H;
    }

    @Override // defpackage.wra, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.H;
        this.H = obj;
        pyc pycVar = (pyc) this.G.F;
        nyc nycVar = pycVar.H;
        Object obj3 = this.E;
        if (!nycVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z = pycVar.G;
        if (!z) {
            nycVar.put(obj3, obj);
        } else {
            if (!z) {
                pmf.d();
                return null;
            }
            z6i z6iVar = pycVar.E[pycVar.F];
            Object obj4 = z6iVar.E[z6iVar.G];
            nycVar.put(obj3, obj);
            pycVar.d(obj4 != null ? obj4.hashCode() : 0, nycVar.G, obj4, 0);
        }
        pycVar.K = nycVar.I;
        return obj2;
    }
}
