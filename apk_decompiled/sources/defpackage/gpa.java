package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gpa implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ hpa F;

    public /* synthetic */ gpa(hpa hpaVar, int i) {
        this.E = i;
        this.F = hpaVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        hpa hpaVar = this.F;
        switch (i) {
            case 0:
                hpaVar.r1();
                return iei.a;
            default:
                return new fcc(hpaVar.g0);
        }
    }
}
