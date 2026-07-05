package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dp5 implements hba, lz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    public /* synthetic */ dp5(kx kxVar, int i, v6d v6dVar, v6d v6dVar2) {
        this.E = 0;
        this.F = i;
    }

    @Override // defpackage.lz7
    public Object apply(Object obj) {
        return Integer.valueOf(this.F);
    }

    @Override // defpackage.hba
    public void invoke(Object obj) {
        int i = this.E;
        int i2 = this.F;
        switch (i) {
            case 0:
                q7b q7bVar = (q7b) obj;
                q7bVar.getClass();
                if (i2 == 1) {
                    q7bVar.v = true;
                }
                q7bVar.l = i2;
                break;
            default:
                ((u6d) obj).h(i2);
                break;
        }
    }

    public /* synthetic */ dp5(int i, int i2) {
        this.E = i2;
        this.F = i;
    }
}
