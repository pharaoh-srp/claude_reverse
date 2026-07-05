package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jp6 extends ts9 implements bz7 {
    public final /* synthetic */ lp6 F;
    public final /* synthetic */ long G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp6(lp6 lp6Var, long j) {
        super(1);
        this.F = lp6Var;
        this.G = j;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        zo6 zo6Var = (zo6) obj;
        lp6 lp6Var = this.F;
        s9g s9gVar = lp6Var.W.a.b;
        long j = this.G;
        long j2 = 0;
        long j3 = s9gVar != null ? ((y69) s9gVar.a.invoke(new g79(j))).a : 0L;
        s9g s9gVar2 = lp6Var.X.a.b;
        long j4 = s9gVar2 != null ? ((y69) s9gVar2.a.invoke(new g79(j))).a : 0L;
        int iOrdinal = zo6Var.ordinal();
        if (iOrdinal == 0) {
            j2 = j3;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                wg6.i();
                return null;
            }
            j2 = j4;
        }
        return new y69(j2);
    }
}
