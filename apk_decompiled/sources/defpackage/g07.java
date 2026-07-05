package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;

/* JADX INFO: loaded from: classes.dex */
public final class g07 extends xzg implements pz7 {
    public sy1 E;
    public BaseEvent F;
    public boolean G;
    public int H;
    public final /* synthetic */ h07 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g07(h07 h07Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = h07Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new g07(this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((g07) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (((defpackage.bpg) r8).i(5, r12, r11) == r5) goto L25;
     */
    /* JADX WARN: Path cross not found for [B:33:0x00cb, B:43:0x00f3], limit reached: 52 */
    /* JADX WARN: Path cross not found for [B:43:0x00f3, B:33:0x00cb], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r0 r12
      0x0028: PHI (r0v3 sy1) = (r0v6 sy1), (r0v22 sy1) binds: [B:17:0x0041, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r12v4 java.lang.Object) = (r12v11 java.lang.Object), (r12v0 java.lang.Object) binds: [B:17:0x0041, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108 A[LOOP:2: B:44:0x0102->B:46:0x0108, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005d -> B:32:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0096 -> B:26:0x0099). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g07.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
