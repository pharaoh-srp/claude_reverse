package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ufd extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ vfd G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ufd(vfd vfdVar, int i) {
        super(0);
        this.F = i;
        this.G = vfdVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        vfd vfdVar = this.G;
        switch (i) {
            case 0:
                return pkg.j.c(vfdVar.F);
            default:
                return pkg.j.c(vfdVar.E);
        }
    }
}
