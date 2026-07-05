package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lra implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ mra F;

    public /* synthetic */ lra(mra mraVar, int i) {
        this.E = i;
        this.F = mraVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        mra mraVar = this.F;
        switch (i) {
            case 0:
                return Integer.valueOf(Math.max(1, mraVar.P().size()));
            case 1:
                if (mraVar.P().size() > 1) {
                    return (sq1) mraVar.h.getValue();
                }
                return null;
            default:
                mraVar.c.setValue(Boolean.valueOf(!mraVar.O()));
                return iei.a;
        }
    }
}
