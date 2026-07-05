package defpackage;

import com.anthropic.claude.conway.protocol.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class vn4 extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public long F;
    public int G;
    public /* synthetic */ Object H;
    public Object I;
    public Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn4(wn4 wn4Var, hhi hhiVar, xx1 xx1Var, long j, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = wn4Var;
        this.J = hhiVar;
        this.K = xx1Var;
        this.F = j;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.K;
        switch (i) {
            case 0:
                vn4 vn4Var = new vn4((wn4) this.I, (hhi) this.J, (xx1) obj2, this.F, tp4Var);
                vn4Var.H = obj;
                return vn4Var;
            case 1:
                vn4 vn4Var2 = new vn4((b0) obj2, tp4Var);
                vn4Var2.H = obj;
                return vn4Var2;
            default:
                vn4 vn4Var3 = new vn4((hdd) this.I, (sih) this.J, this.F, (zub) obj2, tp4Var);
                vn4Var3.H = obj;
                return vn4Var3;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((vn4) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((vn4) create((aid) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((vn4) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:54|55|56|206|57|(1:59)|60|(1:62)(5:63|(2:66|64)|224|69|(3:71|(2:74|72)|225))|76|(1:78)|79|80|122|(2:124|(5:140|(1:144)|145|(1:147)|148)(4:126|(5:129|(2:132|130)|222|133|(3:135|(2:138|136)|223))|128|139))|156|164) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0279, code lost:
    
        r0 = (com.anthropic.claude.conway.protocol.b0) r26.K;
        defpackage.zfa.a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0286, code lost:
    
        if (defpackage.yfa.b() != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0289, code lost:
    
        r2 = defpackage.iuj.E(r11);
        r6 = defpackage.yfa.b;
        r7 = new java.util.ArrayList();
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x029e, code lost:
    
        r8 = r6.next();
        ((defpackage.n30) ((defpackage.zfa) r8)).getClass();
        r7.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b2, code lost:
    
        if (r7.isEmpty() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02b4, code lost:
    
        defpackage.zfa.a.getClass();
        r0 = "Reconnect stalled (" + r0.k + " consecutive failures)";
        r6 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02db, code lost:
    
        ((defpackage.n30) ((defpackage.zfa) r6.next())).b(r15, r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02e7, code lost:
    
        r0 = ((com.anthropic.claude.conway.protocol.b0) r26.K).l;
        r2 = java.lang.Boolean.TRUE;
        r0.getClass();
        r0.n(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ff, code lost:
    
        ((defpackage.f4e) r0).cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03cc, code lost:
    
        if (defpackage.d4c.K(r5, r26) == r12) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0431, code lost:
    
        if (defpackage.v40.k(r11, r2, r26) == r12) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r6.b(r3, r26) == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0190, code lost:
    
        r3 = r3;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f0, code lost:
    
        r6 = defpackage.iuj.E(r11);
        r13 = defpackage.yfa.b;
        r14 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0205, code lost:
    
        r15 = r13.next();
        ((defpackage.n30) ((defpackage.zfa) r15)).getClass();
        r14.add(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021a, code lost:
    
        if (r14.isEmpty() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x021c, code lost:
    
        defpackage.zfa.a.getClass();
        r15 = r8;
        r7 = r2.E;
        r0 = defpackage.gsk.c(r0);
        r13 = new java.lang.StringBuilder();
        r21 = r2;
        r13.append("Stream dropped, backoff=");
        r13.append(r7);
        r13.append("ms: ");
        r13.append(r0);
        r0 = r13.toString();
        r2 = r14.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x024d, code lost:
    
        ((defpackage.n30) ((defpackage.zfa) r2.next())).b(r15, r6, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:85:0x01ec, B:86:0x01f0], limit reached: 228 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026b A[Catch: all -> 0x025c, TryCatch #12 {all -> 0x025c, blocks: (B:83:0x01e1, B:100:0x025e, B:102:0x026b, B:104:0x0279, B:117:0x02e7, B:107:0x0289, B:108:0x0298, B:110:0x029e, B:111:0x02ae, B:113:0x02b4, B:114:0x02d5, B:116:0x02db, B:86:0x01f0, B:87:0x01ff, B:91:0x0216, B:93:0x021c, B:94:0x0247, B:96:0x024d, B:157:0x03f3, B:51:0x0117, B:55:0x012e, B:57:0x0132, B:60:0x015d, B:63:0x0169, B:64:0x0178, B:66:0x017e, B:69:0x0191, B:71:0x0197, B:72:0x01a2, B:74:0x01a8, B:37:0x00c2, B:46:0x00e2), top: B:208:0x008f, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0289 A[Catch: all -> 0x025c, TryCatch #12 {all -> 0x025c, blocks: (B:83:0x01e1, B:100:0x025e, B:102:0x026b, B:104:0x0279, B:117:0x02e7, B:107:0x0289, B:108:0x0298, B:110:0x029e, B:111:0x02ae, B:113:0x02b4, B:114:0x02d5, B:116:0x02db, B:86:0x01f0, B:87:0x01ff, B:91:0x0216, B:93:0x021c, B:94:0x0247, B:96:0x024d, B:157:0x03f3, B:51:0x0117, B:55:0x012e, B:57:0x0132, B:60:0x015d, B:63:0x0169, B:64:0x0178, B:66:0x017e, B:69:0x0191, B:71:0x0197, B:72:0x01a2, B:74:0x01a8, B:37:0x00c2, B:46:0x00e2), top: B:208:0x008f, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169 A[Catch: all -> 0x00ca, CancellationException -> 0x00d3, Exception -> 0x018f, TryCatch #1 {Exception -> 0x018f, blocks: (B:57:0x0132, B:60:0x015d, B:63:0x0169, B:64:0x0178, B:66:0x017e, B:69:0x0191, B:71:0x0197, B:72:0x01a2, B:74:0x01a8), top: B:206:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f0 A[Catch: all -> 0x025c, TryCatch #12 {all -> 0x025c, blocks: (B:83:0x01e1, B:100:0x025e, B:102:0x026b, B:104:0x0279, B:117:0x02e7, B:107:0x0289, B:108:0x0298, B:110:0x029e, B:111:0x02ae, B:113:0x02b4, B:114:0x02d5, B:116:0x02db, B:86:0x01f0, B:87:0x01ff, B:91:0x0216, B:93:0x021c, B:94:0x0247, B:96:0x024d, B:157:0x03f3, B:51:0x0117, B:55:0x012e, B:57:0x0132, B:60:0x015d, B:63:0x0169, B:64:0x0178, B:66:0x017e, B:69:0x0191, B:71:0x0197, B:72:0x01a2, B:74:0x01a8, B:37:0x00c2, B:46:0x00e2), top: B:208:0x008f, inners: #6 }] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [long] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [long] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x03cc -> B:35:0x00b2). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn4(hdd hddVar, sih sihVar, long j, zub zubVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = hddVar;
        this.J = sihVar;
        this.F = j;
        this.K = zubVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn4(b0 b0Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = b0Var;
    }
}
