package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yi2 extends xzg implements pz7 {
    public amg E;
    public gh2 F;
    public dqh G;
    public lf9 H;
    public xi2 I;
    public Object J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public int O;
    public /* synthetic */ Object P;
    public final /* synthetic */ eqh Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ i04 S;
    public final /* synthetic */ long T;
    public final /* synthetic */ i04 U;
    public final /* synthetic */ lp7 V;
    public final /* synthetic */ m14 W;
    public final /* synthetic */ v70 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi2(eqh eqhVar, int i, i04 i04Var, long j, i04 i04Var2, lp7 lp7Var, m14 m14Var, v70 v70Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.Q = eqhVar;
        this.R = i;
        this.S = i04Var;
        this.T = j;
        this.U = i04Var2;
        this.V = lp7Var;
        this.W = m14Var;
        this.X = v70Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        yi2 yi2Var = new yi2(this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, tp4Var);
        yi2Var.P = obj;
        return yi2Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((yi2) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0302, code lost:
    
        if (((java.lang.Number) r19.invoke(java.lang.Double.valueOf(r11))).doubleValue() >= (-0.01d)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0305, code lost:
    
        r19 = r11;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x030d, code lost:
    
        if (r23 >= (-0.01d)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x030f, code lost:
    
        r36 = (r11 + r19) / 2.0d;
        r40 = ((java.lang.Number) r19.invoke(java.lang.Double.valueOf(r36))).doubleValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0325, code lost:
    
        if (r40 > 0.0d) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0327, code lost:
    
        r11 = r36;
        r23 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x032c, code lost:
    
        r19 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x032f, code lost:
    
        r3 = r10.b;
        r23 = r14;
        r10.a = (((r11 - r3) / r21) * 0.010000000000000009d) + (r10.a * 0.99d);
        r3 = java.lang.Math.max(r11, r3);
        r10.b = r3;
        r10.c = r7;
        r7 = (int) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0356, code lost:
    
        r3 = ((java.lang.Number) r11.invoke(r2)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0360, code lost:
    
        if (r7 <= r3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0363, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0366, code lost:
    
        if (r10.f == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x036f, code lost:
    
        if (r10.b < r10.e) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0371, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0373, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0374, code lost:
    
        if (r3 != r9) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0376, code lost:
    
        if (r2 != r5) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0378, code lost:
    
        if (r4 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x037b, code lost:
    
        r6 = r9;
        r12 = r16;
        r14 = r23;
        r8 = r28;
        r2 = r35;
        r9 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r15;
        r15 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x038c, code lost:
    
        r5 = r44.W.invoke(r2, new java.lang.Integer(r3));
        r44.P = r1;
        r12 = r16;
        r44.E = r12;
        r44.F = r14;
        r44.G = r15;
        r13 = r23;
        r44.H = r13;
        r44.I = r10;
        r44.J = r2;
        r44.K = r3;
        r6 = r35;
        r44.L = r6;
        r44.M = r3;
        r44.N = r4;
        r44.O = 2;
        r8 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03c0, code lost:
    
        if (r44.V.g(r5, r44) != r8) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03c3, code lost:
    
        r14 = r13;
        r13 = r14;
        r9 = r2;
        r5 = r3;
        r2 = r4;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0414, code lost:
    
        r11 = r19;
        r12 = r12;
        r6 = r6;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0425, code lost:
    
        defpackage.pmf.h("List contains no element matching the predicate.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x042b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x042f, code lost:
    
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e4, code lost:
    
        r7 = defpackage.uh6.g(defpackage.dqh.a(r15.E)) / 1.0E9d;
        r11 = r6.d;
        r12 = r11.size();
        r13 = r6.b;
        r35 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0204, code lost:
    
        if (r12 != 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0206, code lost:
    
        r7 = (int) r13;
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0209, code lost:
    
        r23 = r10;
        r11 = r33;
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0210, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0217, code lost:
    
        if (r13 < r6.e) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021b, code lost:
    
        if (r6.f != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x021d, code lost:
    
        r6.c = r7;
        r7 = (int) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0221, code lost:
    
        r3 = r6.f;
        r4 = ((defpackage.qp0) defpackage.w44.U0(r11)).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022b, code lost:
    
        if (r3 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x022d, code lost:
    
        r12 = 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0230, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0231, code lost:
    
        r4 = r4 + r12;
        r21 = (0.9d * r7) - 0.3d;
        r12 = new defpackage.bae();
        r11 = r11.listIterator(r11.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0247, code lost:
    
        if (r11.hasPrevious() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0249, code lost:
    
        r13 = (defpackage.qp0) r11.previous();
        r14 = r10;
        r19 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0256, code lost:
    
        if (r13.a >= r21) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0258, code lost:
    
        r12.E = r13.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025c, code lost:
    
        if (r3 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x025e, code lost:
    
        r10 = defpackage.wd6.c0((r7 - r3.doubleValue()) / 0.5d, 0.0d, 1.0d);
        r10 = r6.g;
        r12.E = java.lang.Math.max(r12.E, (int) (((((double) r6.e) - r10) * r10) + r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x028a, code lost:
    
        if (r12.E < r4) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x028c, code lost:
    
        r3 = r4;
        r6.b = r3;
        r6.c = r7;
        r7 = (int) r3;
        r10 = r6;
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0295, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029f, code lost:
    
        if (java.lang.Double.isNaN(r6.c) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02a1, code lost:
    
        r6.c = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02a3, code lost:
    
        r10 = r7 - r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ae, code lost:
    
        if (r10 >= 1.0E-6d) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02b0, code lost:
    
        r21 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02b3, code lost:
    
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b5, code lost:
    
        r20 = r6;
        r23 = r12;
        r19 = new defpackage.wi2(r20, r21, r23, r4, 0);
        r10 = r20;
        r11 = r23.E;
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02d0, code lost:
    
        if (r11 != r11) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02d3, code lost:
    
        r23 = ((java.lang.Number) r19.invoke(java.lang.Double.valueOf(r11))).doubleValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02e8, code lost:
    
        if (r23 <= 0.01d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02ea, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x03f6 -> B:8:0x0037). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yi2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
