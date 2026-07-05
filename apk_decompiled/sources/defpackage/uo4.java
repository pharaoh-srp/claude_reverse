package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uo4 extends t3 implements m6e {
    public final /* synthetic */ int G = 1;
    public final sxb H;
    public final Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo4(c92 c92Var, yr9 yr9Var, sxb sxbVar) {
        super(yr9Var);
        yr9Var.getClass();
        this.I = c92Var;
        this.H = sxbVar;
    }

    public final sxb p() {
        switch (this.G) {
        }
        return this.H;
    }

    @Override // defpackage.t3
    public final String toString() {
        int i = this.G;
        Object obj = this.I;
        switch (i) {
            case 0:
                return getType() + ": Ctx { " + ((qqb) obj) + " }";
            default:
                return "Cxt { " + ((c92) obj) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo4(qqb qqbVar, yr9 yr9Var, sxb sxbVar) {
        super(yr9Var);
        yr9Var.getClass();
        this.I = qqbVar;
        this.H = sxbVar;
    }
}
