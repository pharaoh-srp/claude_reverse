package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oa2 implements pa2 {
    public final /* synthetic */ int E;
    public final Object F;

    public /* synthetic */ oa2(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.pa2
    public final void b(Throwable th) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                ((bz7) obj).invoke(th);
                break;
            default:
                ((y86) obj).a();
                break;
        }
    }

    public final String toString() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((bz7) obj).getClass().getSimpleName() + '@' + xn5.d0(this) + ']';
            default:
                return "DisposeOnCancel[" + ((y86) obj) + ']';
        }
    }
}
