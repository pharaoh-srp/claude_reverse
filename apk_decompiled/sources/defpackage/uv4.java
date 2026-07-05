package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uv4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ xpa F;

    public /* synthetic */ uv4(xpa xpaVar, int i) {
        this.E = i;
        this.F = xpaVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        xpa xpaVar = this.F;
        switch (i) {
            case 0:
                xpaVar.t(new String[]{"application/zip"});
                break;
            default:
                xpaVar.t("android.permission.WRITE_EXTERNAL_STORAGE");
                break;
        }
        return ieiVar;
    }
}
