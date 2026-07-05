package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xe4 extends fvd {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public xe4(bz7 bz7Var) {
        super(new rk3(9));
        this.c = new ye4(bz7Var);
    }

    @Override // defpackage.fvd
    public final hvd a(Object obj) {
        switch (this.b) {
            case 0:
                return new hvd(this, obj, obj == null, null, true);
            default:
                return new hvd(this, obj, obj == null, (fdg) this.c, true);
        }
    }

    @Override // defpackage.fvd
    public zqi b() {
        switch (this.b) {
            case 0:
                return (ye4) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe4(zy7 zy7Var) {
        super(zy7Var);
        a5 a5Var = a5.N;
        this.c = a5Var;
    }
}
