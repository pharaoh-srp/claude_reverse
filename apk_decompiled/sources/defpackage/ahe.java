package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ahe extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ x0a G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ahe(x0a x0aVar, int i) {
        super(0);
        this.F = i;
        this.G = x0aVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        long jG;
        int i = this.F;
        x0a x0aVar = this.G;
        switch (i) {
            case 0:
                p0a p0aVarH = x0aVar.h();
                int iOrdinal = p0aVarH.p.ordinal();
                if (iOrdinal == 0) {
                    jG = p0aVarH.g() & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        mr9.b();
                        return null;
                    }
                    jG = p0aVarH.g() >> 32;
                }
                return Float.valueOf(((int) jG) * 0.05f);
            default:
                return x0aVar.h().p;
        }
    }
}
