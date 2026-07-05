package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gyc extends nyc {
    public hyc K;

    @Override // defpackage.nyc, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof fvd) {
            return super.containsKey((fvd) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof zqi) {
            return super.containsValue((zqi) obj);
        }
        return false;
    }

    @Override // defpackage.nyc, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof fvd) {
            return (zqi) super.get((fvd) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof fvd) ? obj2 : (zqi) super.getOrDefault((fvd) obj, (zqi) obj2);
    }

    @Override // defpackage.nyc
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final hyc g() {
        x6i x6iVar = this.G;
        hyc hycVar = this.K;
        if (x6iVar != hycVar.E) {
            this.F = new vz8(21);
            hycVar = new hyc(this.G, d());
        }
        this.K = hycVar;
        return hycVar;
    }

    @Override // defpackage.nyc, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof fvd) {
            return (zqi) super.remove((fvd) obj);
        }
        return null;
    }
}
