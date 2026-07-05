package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v6c extends ex5 {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6c(j7g j7gVar, int i) {
        super(j7gVar);
        this.G = i;
    }

    @Override // defpackage.dx5, defpackage.yr9
    public final boolean b0() {
        switch (this.G) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.dx5
    public final dx5 s0(j7g j7gVar) {
        switch (this.G) {
            case 0:
                return new v6c(j7gVar, 0);
            default:
                return new v6c(j7gVar, 1);
        }
    }
}
