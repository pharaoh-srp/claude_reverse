package defpackage;

import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.conway.f;

/* JADX INFO: loaded from: classes2.dex */
public final class m61 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ boolean G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m61(Object obj, boolean z, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.G = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                return new m61(this.G, (nwb) obj2, tp4Var, 0);
            case 1:
                return new m61((f03) obj2, this.G, tp4Var, 1);
            case 2:
                return new m61((r93) obj2, this.G, tp4Var, 2);
            case 3:
                return new m61(this.G, (c) obj2, tp4Var, 3);
            case 4:
                return new m61(this.G, (i) obj2, tp4Var, 4);
            case 5:
                return new m61((kk4) obj2, this.G, tp4Var, 5);
            case 6:
                m61 m61Var = new m61((f) obj2, tp4Var);
                m61Var.G = ((Boolean) obj).booleanValue();
                return m61Var;
            case 7:
                return new m61((pwd) obj2, this.G, tp4Var, 7);
            case 8:
                return new m61((kzd) obj2, this.G, tp4Var, 8);
            case 9:
                return new m61((zhh) obj2, this.G, tp4Var, 9);
            default:
                return new m61((m1j) obj2, this.G, tp4Var, 10);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
        }
        return ((m61) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d9, code lost:
    
        if (defpackage.pwd.S(r10, r15, r17) == r11) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e4, code lost:
    
        if (defpackage.pwd.P(r10, r17) == r11) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f2, code lost:
    
        if (r12.b(r17, r4) == r11) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0394, code lost:
    
        if (defpackage.gb9.c0(r0, r2, r17) == r10) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04c2, code lost:
    
        if (r2.W(true, r0, r17) == r5) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019f, code lost:
    
        if (r1 != r11) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bd, code lost:
    
        if (r10.W(r17, r6, r9) == r11) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0195  */
    /* JADX WARN: Type inference failed for: r8v0, types: [mq5, tp4] */
    /* JADX WARN: Type inference failed for: r8v44 */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m61.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m61(f fVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 6;
        this.H = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m61(boolean z, Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = z;
        this.H = obj;
    }
}
