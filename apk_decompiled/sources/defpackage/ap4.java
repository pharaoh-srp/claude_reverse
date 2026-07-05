package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ap4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;

    public /* synthetic */ ap4(long j, int i) {
        this.E = i;
        this.F = j;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return new y69(this.F);
            default:
                return new za6(this.F);
        }
    }
}
