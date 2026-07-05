package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b5i implements ge1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b5i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ge1
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((c5i) obj).k = true;
                break;
            case 1:
                ((c5i) obj).k = true;
                break;
            case 2:
                ((c5i) obj).k = true;
                break;
            default:
                le1 le1Var = (le1) obj;
                boolean z = le1Var.r.i() == 1.0f;
                if (z != le1Var.x) {
                    le1Var.x = z;
                    le1Var.o.invalidateSelf();
                }
                break;
        }
    }
}
