package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pz5 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ c9i F;

    public /* synthetic */ pz5(c9i c9iVar, int i) {
        this.E = i;
        this.F = c9iVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        switch (this.E) {
            case 0:
                long j = ((y69) this.F.b().invoke((sb0) obj)).a;
                int i = (int) (j >> 32);
                int i2 = (int) (j & 4294967295L);
                return new c79(i, i2, i, i2);
            case 1:
                return (sb0) this.F.a().invoke(new y69(((c79) obj).e()));
            default:
                return (sb0) this.F.a().invoke(new g79(((c79) obj).d()));
        }
    }
}
