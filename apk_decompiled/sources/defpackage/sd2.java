package defpackage;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class sd2 extends xzg implements bz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public Object G;
    public Object H;
    public Serializable I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd2(dae daeVar, dae daeVar2, dae daeVar3, z9e z9eVar, z9e z9eVar2, tp4 tp4Var) {
        super(1, tp4Var);
        this.G = daeVar;
        this.H = daeVar2;
        this.I = daeVar3;
        this.J = z9eVar;
        this.K = z9eVar2;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.K;
        Object obj2 = this.J;
        switch (i) {
            case 0:
                return new sd2((dae) this.G, (dae) this.H, (dae) this.I, (z9e) obj2, (z9e) obj, tp4Var);
            default:
                return new sd2((Set) obj2, (kq4) obj, tp4Var);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
        }
        return ((sd2) create(tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a4 -> B:14:0x0056). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd2(Set set, kq4 kq4Var, tp4 tp4Var) {
        super(1, tp4Var);
        this.J = set;
        this.K = kq4Var;
    }
}
