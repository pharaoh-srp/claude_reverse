package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class my implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ry F;

    public /* synthetic */ my(ry ryVar, int i) {
        this.E = i;
        this.F = ryVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        ry ryVar = this.F;
        switch (i) {
            case 0:
                return ryVar.c();
            default:
                return new cpc(ryVar.c(), ryVar.i.getValue());
        }
    }
}
