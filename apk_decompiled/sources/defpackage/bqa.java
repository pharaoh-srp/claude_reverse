package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bqa implements lhb {
    public lhb[] a;

    @Override // defpackage.lhb
    public final c2e a(Class cls) {
        for (lhb lhbVar : this.a) {
            if (lhbVar.b(cls)) {
                return lhbVar.a(cls);
            }
        }
        pmf.n("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.lhb
    public final boolean b(Class cls) {
        for (lhb lhbVar : this.a) {
            if (lhbVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
