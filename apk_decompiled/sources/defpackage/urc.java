package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class urc extends zh4 {
    public final boolean r;

    public urc(boolean z) {
        this.r = z;
    }

    @Override // defpackage.zh4
    public final void j(zie zieVar, Object obj) {
        if (obj == null) {
            return;
        }
        zieVar.b(obj.toString(), null, this.r);
    }
}
