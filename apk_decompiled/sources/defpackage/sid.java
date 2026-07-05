package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sid implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vid F;

    public /* synthetic */ sid(vid vidVar, int i) {
        this.E = i;
        this.F = vidVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        vid vidVar = this.F;
        switch (i) {
            case 0:
                lsc lscVar = vidVar.i;
                lsc lscVar2 = vidVar.h;
                cjh cjhVar = (cjh) lscVar2.getValue();
                q7 q7Var = vidVar.b;
                break;
            case 1:
                break;
            case 2:
                vidVar.q.setValue(Boolean.TRUE);
                break;
            default:
                vidVar.q.setValue(Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
