package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vj9 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ sxb G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj9(sxb sxbVar, int i) {
        super(1);
        this.F = i;
        this.G = sxbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        sxb sxbVar = this.G;
        switch (i) {
            case 0:
                fab fabVar = (fab) obj;
                fabVar.getClass();
                return fabVar.g(sxbVar, 4);
            default:
                fab fabVar2 = (fab) obj;
                fabVar2.getClass();
                return fabVar2.d(sxbVar, 15);
        }
    }
}
