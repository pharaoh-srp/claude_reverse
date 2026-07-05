package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x25 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x25(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
        this.K = obj5;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.K;
        switch (i) {
            case 0:
                return new x25((m2a) this.G, (nwb) this.H, (jjh) this.I, (zhh) this.J, (xy8) obj2, tp4Var, 0);
            case 1:
                x25 x25Var = new x25((kq4) this.H, (ArrayList) this.I, (ft2) this.J, (ArrayList) obj2, tp4Var, 1);
                x25Var.G = obj;
                return x25Var;
            case 2:
                x25 x25Var2 = new x25((jj5) this.H, (ArrayList) this.I, (kmd) this.J, (ArrayList) obj2, tp4Var, 2);
                x25Var2.G = obj;
                return x25Var2;
            case 3:
                x25 x25Var3 = new x25((x7e) this.I, (w7e) this.J, (arb) obj2, tp4Var, 3);
                x25Var3.H = obj;
                return x25Var3;
            case 4:
                x25 x25Var4 = new x25((jxb) this.J, (h30) obj2, tp4Var);
                x25Var4.I = obj;
                return x25Var4;
            case 5:
                return new x25((zy7) this.G, (ybg) this.H, (String) this.I, (String) this.J, (zy7) obj2, tp4Var, 5);
            case 6:
                return new x25((gff) this.I, this.J, (a6i) obj2, tp4Var, 6);
            case 7:
                x25 x25Var5 = new x25((zy7) obj2, tp4Var, 7);
                x25Var5.J = obj;
                return x25Var5;
            default:
                return new x25((dnh) obj2, tp4Var, 8);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((x25) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((x25) create((y4i) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((x25) create((y4i) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                return ((x25) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 4:
                return ((x25) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 5:
                return ((x25) create((iei) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 6:
                return ((x25) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                ((x25) create((lp7) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45.E;
            default:
                return ((x25) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0309, code lost:
    
        if (defpackage.gff.N0(r15, r22) != r3) goto L138;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:37:0x0112, B:42:0x012d], limit reached: 361 */
    /* JADX WARN: Path cross not found for [B:42:0x012d, B:37:0x0112], limit reached: 361 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x053c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0496 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123 A[Catch: all -> 0x00c9, PHI: r2 r4 r6 r9
      0x0123: PHI (r2v70 java.lang.Object) = (r2v69 java.lang.Object), (r2v74 java.lang.Object) binds: [B:38:0x0120, B:30:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r4v45 gh2) = (r4v44 gh2), (r4v49 gh2) binds: [B:38:0x0120, B:30:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r6v20 ??) = (r6v25 ??), (r6v26 ??) binds: [B:38:0x0120, B:30:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r9v19 lp7) = (r9v18 lp7), (r9v23 lp7) binds: [B:38:0x0120, B:30:0x00e0] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {all -> 0x00c9, blocks: (B:30:0x00e0, B:40:0x0123, B:37:0x0112, B:42:0x012d, B:24:0x00c5), top: B:345:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012d A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #6 {all -> 0x00c9, blocks: (B:30:0x00e0, B:40:0x0123, B:37:0x0112, B:42:0x012d, B:24:0x00c5), top: B:345:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0225  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [gmf] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [gmf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0099 -> B:15:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x012b -> B:37:0x0112). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x013f -> B:37:0x0112). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x25.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x25(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.K = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x25(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
        this.J = obj2;
        this.K = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x25(jxb jxbVar, h30 h30Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 4;
        this.J = jxbVar;
        this.K = h30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x25(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = arrayList;
        this.J = obj2;
        this.K = arrayList2;
    }
}
