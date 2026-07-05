package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ki5 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki5(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                ki5 ki5Var = new ki5(2, tp4Var, 0);
                ki5Var.G = obj;
                return ki5Var;
            case 1:
                ki5 ki5Var2 = new ki5(2, tp4Var, 1);
                ki5Var2.G = obj;
                return ki5Var2;
            default:
                ki5 ki5Var3 = new ki5(2, tp4Var, 2);
                ki5Var3.G = obj;
                return ki5Var3;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((ki5) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x004e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // defpackage.vd1
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
