package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qi5 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;

    public /* synthetic */ qi5(String str, int i) {
        this.E = i;
        this.F = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        String str;
        int i = this.E;
        String str2 = this.F;
        switch (i) {
            case 0:
                str = "persist message turn for chat ";
                break;
            case 1:
                str = "persist prefetched messages for chat ";
                break;
            default:
                return mpk.P(str2);
        }
        return ij0.i(str, str2);
    }
}
