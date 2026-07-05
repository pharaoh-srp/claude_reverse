package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d18 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d18(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e18 e18Var = (e18) obj;
                e18Var.A--;
                break;
            default:
                ndg ndgVar = (ndg) obj;
                ndgVar.k--;
                break;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((e18) obj).A++;
                break;
            default:
                ((ndg) obj).k++;
                break;
        }
    }
}
