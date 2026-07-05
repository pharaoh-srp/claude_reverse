package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t9k extends h6k {
    public final /* synthetic */ String I;
    public final /* synthetic */ String J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ n4k L;
    public final /* synthetic */ j6k M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9k(j6k j6kVar, String str, String str2, boolean z, n4k n4kVar) {
        super(j6kVar, true);
        this.I = str;
        this.J = str2;
        this.K = z;
        this.L = n4kVar;
        this.M = j6kVar;
    }

    @Override // defpackage.h6k
    public final void a() {
        u4k u4kVar = this.M.g;
        dgj.v(u4kVar);
        u4kVar.getUserProperties(this.I, this.J, this.K, this.L);
    }

    @Override // defpackage.h6k
    public final void b() {
        this.L.f(null);
    }
}
