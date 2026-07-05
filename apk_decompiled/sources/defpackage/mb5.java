package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mb5 extends xzg implements pz7 {
    public hxb E;
    public nb5 F;
    public int G;
    public final /* synthetic */ nb5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb5(nb5 nb5Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = nb5Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new mb5(this.H, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((mb5) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092 A[Catch: all -> 0x0018, Exception -> 0x001b, LinkageError -> 0x001e, CancellationException -> 0x0021, TRY_LEAVE, TryCatch #6 {all -> 0x0018, blocks: (B:7:0x0013, B:38:0x008a, B:40:0x0092, B:43:0x009d, B:44:0x00ac, B:46:0x00b2, B:48:0x00bf, B:52:0x00cd, B:54:0x00d1, B:57:0x00dc, B:59:0x00f1, B:60:0x00f9, B:68:0x0113, B:69:0x011f, B:72:0x012e), top: B:76:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[Catch: all -> 0x0018, Exception -> 0x001b, LinkageError -> 0x001e, CancellationException -> 0x0021, TRY_ENTER, TryCatch #6 {all -> 0x0018, blocks: (B:7:0x0013, B:38:0x008a, B:40:0x0092, B:43:0x009d, B:44:0x00ac, B:46:0x00b2, B:48:0x00bf, B:52:0x00cd, B:54:0x00d1, B:57:0x00dc, B:59:0x00f1, B:60:0x00f9, B:68:0x0113, B:69:0x011f, B:72:0x012e), top: B:76:0x0009 }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [mb5, tp4, vp4] */
    /* JADX WARN: Type inference failed for: r6v1, types: [hxb] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
