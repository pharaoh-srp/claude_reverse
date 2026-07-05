package defpackage;

import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends gre implements pz7 {
    public final /* synthetic */ int F;
    public int G;
    public Object H;
    public Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.F = i;
        this.I = obj;
        this.J = obj2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.F;
        Object obj2 = this.J;
        switch (i) {
            case 0:
                f fVar = new f((FileSystem) this.I, (Path) obj2, tp4Var, 0);
                fVar.H = obj;
                return fVar;
            case 1:
                f fVar2 = new f((zy7) this.I, (zy7) obj2, tp4Var, 1);
                fVar2.H = obj;
                return fVar2;
            case 2:
                f fVar3 = new f((String) this.I, (gt0) obj2, tp4Var, 2);
                fVar3.H = obj;
                return fVar3;
            case 3:
                f fVar4 = new f((c45) this.I, (pz7) obj2, tp4Var, 3);
                fVar4.H = obj;
                return fVar4;
            case 4:
                f fVar5 = new f((l45) this.I, (gkj) obj2, tp4Var, 4);
                fVar5.H = obj;
                return fVar5;
            case 5:
                f fVar6 = new f((zeh) obj2, tp4Var, 5);
                fVar6.H = obj;
                return fVar6;
            case 6:
                f fVar7 = new f((zy7) obj2, tp4Var, 6);
                fVar7.I = obj;
                return fVar7;
            case 7:
                f fVar8 = new f((mif) this.I, (rhf) obj2, tp4Var, 7);
                fVar8.H = obj;
                return fVar8;
            default:
                f fVar9 = new f((u7d) this.I, (dae) obj2, tp4Var, 8);
                fVar9.H = obj;
                return fVar9;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((f) create((d0h) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b2 A[Catch: CancellationException -> 0x0299, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0299, blocks: (B:148:0x02b2, B:151:0x02c0, B:137:0x0295, B:142:0x02a0), top: B:207:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v29, types: [pz7] */
    /* JADX WARN: Type inference failed for: r0v39, types: [d0h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [d0h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r4v0, types: [u7d] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3, types: [d0h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [d0h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0235 -> B:115:0x0239). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x02c9 -> B:146:0x02ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x02da -> B:146:0x02ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00af -> B:34:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0174 -> B:75:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01cc -> B:92:0x01d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.F = i;
        this.J = obj;
    }
}
