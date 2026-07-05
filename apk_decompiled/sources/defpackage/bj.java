package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bj extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj(int i) {
        super(2, null);
        this.E = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                bj bjVar = new bj(2, tp4Var, 0);
                bjVar.F = obj;
                return bjVar;
            case 1:
                bj bjVar2 = new bj(2, tp4Var, 1);
                bjVar2.F = ((ai2) obj).a;
                return bjVar2;
            case 2:
                bj bjVar3 = new bj(2, tp4Var, 2);
                bjVar3.F = obj;
                return bjVar3;
            case 3:
                bj bjVar4 = new bj(2, tp4Var, 3);
                bjVar4.F = obj;
                return bjVar4;
            case 4:
                bj bjVar5 = new bj(2, tp4Var, 4);
                bjVar5.F = obj;
                return bjVar5;
            case 5:
                bj bjVar6 = new bj(2, tp4Var, 5);
                bjVar6.F = obj;
                return bjVar6;
            case 6:
                bj bjVar7 = new bj(2, tp4Var, 6);
                bjVar7.F = obj;
                return bjVar7;
            case 7:
                bj bjVar8 = new bj(2, tp4Var, 7);
                bjVar8.F = obj;
                return bjVar8;
            case 8:
                bj bjVar9 = new bj(2, tp4Var, 8);
                bjVar9.F = ((ai2) obj).a;
                return bjVar9;
            case 9:
                bj bjVar10 = new bj(2, tp4Var, 9);
                bjVar10.F = obj;
                return bjVar10;
            default:
                bj bjVar11 = new bj(2, tp4Var, 10);
                bjVar11.F = obj;
                return bjVar11;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = 2;
        iei ieiVar = iei.a;
        switch (i) {
            case 1:
                Object obj3 = ((ai2) obj).a;
                bj bjVar = new bj(i2, (tp4) obj2, 1);
                bjVar.F = obj3;
                break;
            case 8:
                Object obj4 = ((ai2) obj).a;
                bj bjVar2 = new bj(i2, (tp4) obj2, 8);
                bjVar2.F = obj4;
                break;
        }
        return ((bj) create((String) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }
}
