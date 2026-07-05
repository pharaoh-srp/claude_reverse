package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v9f extends pd implements pz7, uzg {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9f(z9f z9fVar, int i) {
        super(2, 4, z9f.class, z9fVar, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V");
        this.L = i;
        switch (i) {
            case 1:
                super(2, 4, z9f.class, z9fVar, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V");
                break;
            default:
                break;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.L;
        iei ieiVar = iei.a;
        Object obj3 = this.E;
        switch (i) {
            case 0:
                z9f z9fVar = (z9f) obj3;
                gb9.D(z9fVar.p0.c(), null, null, new w9f(z9fVar, ((qsi) obj).a, null, 2), 3);
                break;
            default:
                z9f z9fVar2 = (z9f) obj3;
                gb9.D(z9fVar2.p0.c(), null, null, new w9f(z9fVar2, ((qsi) obj).a, null, 1), 3);
                break;
        }
        return ieiVar;
    }
}
