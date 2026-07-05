package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class guc implements y1e, e9d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ guc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e9d
    public final Object b(String str, bz7 bz7Var, vp4 vp4Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((juc) obj).b(str, bz7Var, vp4Var);
            default:
                return ((l9d) obj).b(str, bz7Var, vp4Var);
        }
    }

    @Override // defpackage.y1e
    public final lze c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((juc) obj).b;
            default:
                return ((l9d) obj).b;
        }
    }
}
