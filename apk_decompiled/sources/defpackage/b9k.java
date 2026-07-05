package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b9k extends h6k {
    public final /* synthetic */ int I;
    public final /* synthetic */ n4k J;
    public final /* synthetic */ j6k K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9k(j6k j6kVar, n4k n4kVar, int i) {
        super(j6kVar, true);
        this.I = i;
        this.J = n4kVar;
        this.K = j6kVar;
    }

    @Override // defpackage.h6k
    public final void a() {
        switch (this.I) {
            case 0:
                u4k u4kVar = this.K.g;
                dgj.v(u4kVar);
                u4kVar.getGmpAppId(this.J);
                break;
            case 1:
                u4k u4kVar2 = this.K.g;
                dgj.v(u4kVar2);
                u4kVar2.generateEventId(this.J);
                break;
            case 2:
                u4k u4kVar3 = this.K.g;
                dgj.v(u4kVar3);
                u4kVar3.getCachedAppInstanceId(this.J);
                break;
            case 3:
                u4k u4kVar4 = this.K.g;
                dgj.v(u4kVar4);
                u4kVar4.getCurrentScreenClass(this.J);
                break;
            default:
                u4k u4kVar5 = this.K.g;
                dgj.v(u4kVar5);
                u4kVar5.getCurrentScreenName(this.J);
                break;
        }
    }

    @Override // defpackage.h6k
    public final void b() {
        int i = this.I;
        n4k n4kVar = this.J;
        switch (i) {
            case 0:
                n4kVar.f(null);
                break;
            case 1:
                n4kVar.f(null);
                break;
            case 2:
                n4kVar.f(null);
                break;
            case 3:
                n4kVar.f(null);
                break;
            default:
                n4kVar.f(null);
                break;
        }
    }
}
