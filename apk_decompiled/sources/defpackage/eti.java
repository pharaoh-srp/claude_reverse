package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eti implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fti F;

    public /* synthetic */ eti(fti ftiVar, int i) {
        this.E = i;
        this.F = ftiVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        fti ftiVar = this.F;
        switch (i) {
            case 0:
                return Boolean.valueOf((((Boolean) ftiVar.l.getValue()).booleanValue() || bsg.I0((String) ftiVar.k.getValue())) ? false : true);
            default:
                return (String) ftiVar.k.getValue();
        }
    }
}
