package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dqa implements nhb {
    public nhb[] a;

    @Override // defpackage.nhb
    public final e2e a(Class cls) {
        for (nhb nhbVar : this.a) {
            if (nhbVar.b(cls)) {
                return nhbVar.a(cls);
            }
        }
        pmf.n("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.nhb
    public final boolean b(Class cls) {
        for (nhb nhbVar : this.a) {
            if (nhbVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
