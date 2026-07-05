package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cp0 extends x1 {
    public int G = -1;
    public final /* synthetic */ dp0 H;

    public cp0(dp0 dp0Var) {
        this.H = dp0Var;
    }

    @Override // defpackage.x1
    public final void a() {
        int i;
        Object[] objArr;
        do {
            i = this.G + 1;
            this.G = i;
            objArr = this.H.E;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.E = 2;
            return;
        }
        Object obj = objArr[i];
        obj.getClass();
        this.F = obj;
        this.E = 1;
    }
}
