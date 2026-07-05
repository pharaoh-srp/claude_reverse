package defpackage;

import com.anthropic.claude.bell.tts.d;

/* JADX INFO: loaded from: classes2.dex */
public final class bff extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bff(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return new bff((gff) obj2, tp4Var, 0);
            case 1:
                bff bffVar = new bff((mif) obj2, tp4Var, 1);
                long j = ((fcc) obj).a;
                return bffVar;
            case 2:
                return new bff((jud) obj2, tp4Var, 2);
            case 3:
                return new bff((izf) obj2, tp4Var, 3);
            case 4:
                return new bff((s2g) obj2, tp4Var, 4);
            case 5:
                return new bff((n9g) obj2, tp4Var, 5);
            case 6:
                return new bff((whg) obj2, tp4Var, 6);
            case 7:
                return new bff((e0h) obj2, tp4Var, 7);
            case 8:
                return new bff((d) obj2, tp4Var, 8);
            case 9:
                return new bff((pd5) obj2, tp4Var, 9);
            case 10:
                return new bff((gph) obj2, tp4Var, 10);
            case 11:
                return new bff((hm) obj2, tp4Var, 11);
            case 12:
                return new bff((cji) obj2, tp4Var, 12);
            default:
                return new bff((qkj) obj2, tp4Var, 13);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 1:
                long j = ((fcc) obj).a;
                break;
        }
        return ((bff) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e4, code lost:
    
        if (r10.invoke(r0, r9) == r2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ef, code lost:
    
        if (r10.invoke(r0, r9) == r2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bff.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
