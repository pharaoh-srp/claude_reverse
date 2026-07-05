package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h0a implements xy9 {
    public final x0a a;

    public h0a(x0a x0aVar) {
        this.a = x0aVar;
    }

    @Override // defpackage.xy9
    public final int a() {
        return this.a.h().n;
    }

    @Override // defpackage.xy9
    public final int b() {
        return Math.min(a() - 1, ((q0a) w44.U0(this.a.h().k)).a);
    }

    @Override // defpackage.xy9
    public final int c() {
        int i;
        x0a x0aVar = this.a;
        if (x0aVar.h().k.isEmpty()) {
            return 0;
        }
        int iH = nvj.h(x0aVar.h());
        int iH2 = kvj.h(x0aVar.h());
        if (iH2 != 0 && (i = iH / iH2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.xy9
    public final boolean d() {
        return !this.a.h().k.isEmpty();
    }

    @Override // defpackage.xy9
    public final int e() {
        return Math.max(0, ((isc) this.a.e.b).h());
    }
}
