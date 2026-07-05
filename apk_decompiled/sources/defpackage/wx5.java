package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wx5 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ m7f G;

    public /* synthetic */ wx5(String str, m7f m7fVar, int i) {
        this.E = i;
        this.F = str;
        this.G = m7fVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        m7f m7fVar = this.G;
        String str = this.F;
        swe sweVar = (swe) obj;
        switch (i) {
            case 0:
                sweVar.getClass();
                kce kceVar = jce.a;
                return new vx5(str, (vd3) m7fVar.a(kceVar.b(vd3.class), null, null), (h86) m7fVar.a(kceVar.b(h86.class), null, null));
            default:
                sweVar.getClass();
                kce kceVar2 = jce.a;
                return new nfe(str, (vd3) m7fVar.a(kceVar2.b(vd3.class), null, null), (h86) m7fVar.a(kceVar2.b(h86.class), null, null));
        }
    }
}
