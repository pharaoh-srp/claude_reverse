package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gvb extends xra implements pm9 {
    public final syc H;
    public Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvb(syc sycVar, Object obj, Object obj2) {
        super(obj, 0, obj2);
        sycVar.getClass();
        this.H = sycVar;
        this.I = obj2;
    }

    @Override // defpackage.xra, java.util.Map.Entry
    public final Object getValue() {
        return this.I;
    }

    @Override // defpackage.xra, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.I;
        this.I = obj;
        oyc oycVar = (oyc) this.H.F;
        myc mycVar = oycVar.H;
        Object obj3 = this.F;
        if (!mycVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z = oycVar.G;
        if (!z) {
            mycVar.put(obj3, obj);
        } else {
            if (!z) {
                pmf.d();
                return null;
            }
            y6i y6iVar = oycVar.E[oycVar.F];
            Object obj4 = y6iVar.E[y6iVar.G];
            mycVar.put(obj3, obj);
            oycVar.d(obj4 != null ? obj4.hashCode() : 0, mycVar.G, obj4, 0, 0, false);
        }
        oycVar.K = mycVar.I;
        return obj2;
    }
}
