package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e4d extends ts9 implements zy7 {
    public final /* synthetic */ String F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4d(String str, int i, int i2) {
        super(0);
        this.F = str;
        this.G = i;
        this.H = i2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        StringBuilder sbP = ij0.p("Number of bytes read for operation='", this.F, this.G, "' doesn't match with expected: expected=", ", actual=");
        sbP.append(this.H);
        return sbP.toString();
    }
}
