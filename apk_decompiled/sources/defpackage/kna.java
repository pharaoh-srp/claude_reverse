package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kna implements ona {
    public final /* synthetic */ int a;
    public final /* synthetic */ pna b;

    public /* synthetic */ kna(pna pnaVar, int i) {
        this.a = i;
        this.b = pnaVar;
    }

    @Override // defpackage.ona
    public final void run() {
        int i = this.a;
        pna pnaVar = this.b;
        switch (i) {
            case 0:
                pnaVar.k();
                break;
            default:
                pnaVar.i();
                break;
        }
    }
}
