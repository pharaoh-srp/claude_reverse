package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zf1 implements qcc {
    public final /* synthetic */ int E;
    public final /* synthetic */ sih F;

    public /* synthetic */ zf1(sih sihVar, int i) {
        this.E = i;
        this.F = sihVar;
    }

    @Override // defpackage.qcc
    public final long a() {
        switch (this.E) {
            case 0:
                return this.F.o(true).b;
            case 1:
                return this.F.u(true, true).b;
            default:
                return this.F.u(false, true).b;
        }
    }
}
