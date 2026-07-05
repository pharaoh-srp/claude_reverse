package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bri extends dab {
    public final /* synthetic */ int c = 1;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public bri(int i) {
        StringBuilder sbU = vb7.u("must have at least ", i, " value parameter");
        sbU.append(i > 1 ? "s" : "");
        super(sbU.toString(), 1);
        this.d = i;
    }

    @Override // defpackage.wd3
    public final boolean a(ge9 ge9Var) {
        int i = this.c;
        int i2 = this.d;
        switch (i) {
            case 0:
                if (ge9Var.I().size() >= i2) {
                }
                break;
            default:
                if (ge9Var.I().size() == i2) {
                }
                break;
        }
        return true;
    }

    public bri() {
        super("must have exactly 2 value parameters", 1);
        this.d = 2;
    }
}
