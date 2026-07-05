package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jod implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lod F;

    public /* synthetic */ jod(lod lodVar, int i) {
        this.E = i;
        this.F = lodVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        lod lodVar = this.F;
        switch (i) {
            case 0:
                lodVar.n.setValue(Boolean.FALSE);
                return iei.a;
            default:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(lodVar.q.b(str));
        }
    }
}
