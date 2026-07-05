package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vua extends mqh {
    public final j7b b;

    public vua(j7b j7bVar) {
        this.b = j7bVar;
    }

    @Override // defpackage.mqh
    public final int b(Object obj) {
        return obj == uua.e ? 0 : -1;
    }

    @Override // defpackage.mqh
    public final jqh f(int i, jqh jqhVar, boolean z) {
        jqhVar.h(z ? 0 : null, z ? uua.e : null, 0, -9223372036854775807L, 0L, nd.c, true);
        return jqhVar;
    }

    @Override // defpackage.mqh
    public final int h() {
        return 1;
    }

    @Override // defpackage.mqh
    public final Object l(int i) {
        return uua.e;
    }

    @Override // defpackage.mqh
    public final kqh m(int i, kqh kqhVar, long j) {
        Object obj = kqh.o;
        kqhVar.b(this.b, false, true, null, 0L, -9223372036854775807L);
        kqhVar.i = true;
        return kqhVar;
    }

    @Override // defpackage.mqh
    public final int o() {
        return 1;
    }
}
