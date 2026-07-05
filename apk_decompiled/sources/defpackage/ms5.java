package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ms5 implements nyg {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ ms5(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.nyg
    public final Object get() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                try {
                    return (y7b) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    pmf.m(e);
                    return null;
                }
            default:
                return (os5) obj;
        }
    }
}
