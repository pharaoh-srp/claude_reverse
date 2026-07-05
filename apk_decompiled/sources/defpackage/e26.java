package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e26 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ float G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e26(int i, float f) {
        super(0);
        this.F = i;
        this.G = f;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        float f = this.G;
        switch (i) {
            case 0:
                return "Sample rate value provided " + f + " is below 0, setting it to 0.";
            case 1:
                return "Sample rate value provided " + f + " is above 100, setting it to 100.";
            case 2:
                return "Sample rate value provided " + f + " is below 0, setting it to 0.";
            default:
                return "Sample rate value provided " + f + " is above 100, setting it to 100.";
        }
    }
}
