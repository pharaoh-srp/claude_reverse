package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cud extends a0 {
    public final esd I;
    public final cud J;
    public final gh3 K;
    public final dsd L;
    public final boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cud(esd esdVar, txb txbVar, cbi cbiVar, neg negVar, cud cudVar) {
        super(txbVar, cbiVar, negVar);
        esdVar.getClass();
        txbVar.getClass();
        this.I = esdVar;
        this.J = cudVar;
        this.K = iv1.u(txbVar, esdVar.I);
        dsd dsdVar = (dsd) on7.f.e(esdVar.H);
        this.L = dsdVar == null ? dsd.CLASS : dsdVar;
        this.M = on7.g.e(esdVar.H).booleanValue();
    }

    @Override // defpackage.a0
    public final ww7 l() {
        return this.K.b();
    }
}
