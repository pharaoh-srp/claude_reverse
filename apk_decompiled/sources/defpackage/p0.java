package defpackage;

import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ long G;
    public Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p5d p5dVar, CharSequence charSequence, long j, sih sihVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 9;
        this.H = p5dVar;
        this.I = charSequence;
        this.G = j;
        this.J = sihVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.J;
        Object obj3 = this.I;
        switch (i) {
            case 0:
                return new p0((lf9) obj3, this.G, (zub) obj2, tp4Var, 0);
            case 1:
                p0 p0Var = new p0((eqh) obj3, this.G, (gq7) obj2, tp4Var, 1);
                p0Var.H = obj;
                return p0Var;
            case 2:
                p0 p0Var2 = new p0((b0) obj3, this.G, (f) obj2, tp4Var, 2);
                p0Var2.H = obj;
                return p0Var2;
            case 3:
                return new p0((cae) this.H, (cae) obj3, (b89) obj2, this.G, tp4Var);
            case 4:
                return new p0((bz9) obj3, (kl7) obj2, this.G, tp4Var, 4);
            case 5:
                p0 p0Var3 = new p0((p5d) obj3, (CharSequence) obj2, this.G, tp4Var, 5);
                p0Var3.H = obj;
                return p0Var3;
            case 6:
                p0 p0Var4 = new p0((raf) obj3, this.G, (aae) obj2, tp4Var, 6);
                p0Var4.H = obj;
                return p0Var4;
            case 7:
                return new p0((feh) this.H, this.G, (jeh) obj3, (eeh) obj2, tp4Var);
            case 8:
                return new p0((nwb) obj3, this.G, (zub) obj2, tp4Var, 8);
            case 9:
                return new p0((p5d) this.H, (CharSequence) obj3, this.G, (sih) obj2, tp4Var);
            default:
                return new p0((sih) obj3, this.G, (zub) obj2, tp4Var, 10);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((p0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0269, code lost:
    
        if (defpackage.a80.c(r0, r3, r12, r3, r15, 4) != r10) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02aa, code lost:
    
        if (defpackage.pjj.b(r15) == r1) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02d2, code lost:
    
        if (defpackage.d4c.K((r9 - r7) / 1000000, r15) == r1) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x051b, code lost:
    
        if (r0.b(r2, r15) != r6) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0108, code lost:
    
        if (r0.b(r8, r15) == r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016d, code lost:
    
        if (r1.a(r3, r15) == r0) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(cae caeVar, cae caeVar2, b89 b89Var, long j, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 3;
        this.H = caeVar;
        this.I = caeVar2;
        this.J = b89Var;
        this.G = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(feh fehVar, long j, jeh jehVar, eeh eehVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 7;
        this.H = fehVar;
        this.G = j;
        this.I = jehVar;
        this.J = eehVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, long j, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
        this.G = j;
        this.J = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, Object obj2, long j, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
        this.J = obj2;
        this.G = j;
    }
}
