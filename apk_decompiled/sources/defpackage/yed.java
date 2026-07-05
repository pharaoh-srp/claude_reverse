package defpackage;

import com.anthropic.claude.project.knowledge.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yed implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ fnd F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ yed(fnd fndVar, zy7 zy7Var) {
        this.F = fndVar;
        this.G = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.G;
        fnd fndVar = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    twj.c(0, e18Var, zy7Var, fndVar.getFileName(), fndVar instanceof end);
                }
                break;
            default:
                num.getClass();
                a.a(fndVar, zy7Var, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ yed(fnd fndVar, zy7 zy7Var, int i) {
        this.F = fndVar;
        this.G = zy7Var;
    }
}
