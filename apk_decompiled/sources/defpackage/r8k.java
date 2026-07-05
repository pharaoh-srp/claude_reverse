package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r8k extends h6k {
    public final /* synthetic */ int I;
    public final /* synthetic */ String J;
    public final /* synthetic */ j6k K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8k(j6k j6kVar, String str, int i) {
        super(j6kVar, true);
        this.I = i;
        this.J = str;
        this.K = j6kVar;
    }

    @Override // defpackage.h6k
    public final void a() {
        switch (this.I) {
            case 0:
                u4k u4kVar = this.K.g;
                dgj.v(u4kVar);
                u4kVar.beginAdUnitExposure(this.J, this.F);
                break;
            default:
                u4k u4kVar2 = this.K.g;
                dgj.v(u4kVar2);
                u4kVar2.endAdUnitExposure(this.J, this.F);
                break;
        }
    }
}
