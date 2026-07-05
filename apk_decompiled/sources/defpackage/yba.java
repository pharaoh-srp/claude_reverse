package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yba extends bvb {
    public final goj l;
    public m4a m;
    public z5l n;

    public yba(goj gojVar) {
        this.l = gojVar;
        if (gojVar.a == null) {
            gojVar.a = this;
        } else {
            sz6.j("There is already a listener registered");
            throw null;
        }
    }

    @Override // defpackage.bvb
    public final void e() {
        goj gojVar = this.l;
        gojVar.b = true;
        gojVar.d = false;
        gojVar.c = false;
        gojVar.i.drainPermits();
        gojVar.c();
    }

    @Override // defpackage.bvb
    public final void f() {
        this.l.b = false;
    }

    @Override // defpackage.bvb
    public final void h(kbc kbcVar) {
        super.h(kbcVar);
        this.m = null;
        this.n = null;
    }

    public final void j() {
        m4a m4aVar = this.m;
        z5l z5lVar = this.n;
        if (m4aVar == null || z5lVar == null) {
            return;
        }
        super.h(z5lVar);
        d(m4aVar, z5lVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
