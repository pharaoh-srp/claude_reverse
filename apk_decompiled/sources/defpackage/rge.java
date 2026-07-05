package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rge extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ che G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rge(che cheVar, int i) {
        super(0);
        this.F = i;
        this.G = cheVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        che cheVar = this.G;
        switch (i) {
            case 0:
                return Boolean.valueOf(cheVar.j.getValue() != null);
            case 1:
                return cheVar.a.l();
            default:
                return cheVar.f();
        }
    }
}
