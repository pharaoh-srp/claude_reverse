package defpackage;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ok3 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public final /* synthetic */ nwb G;
    public final /* synthetic */ nwb H;
    public Object I;
    public Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok3(b0g b0gVar, pl3 pl3Var, View view, x89 x89Var, nwb nwbVar, nwb nwbVar2, nwb nwbVar3, Activity activity, j8f j8fVar, nwb nwbVar4, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = b0gVar;
        this.J = pl3Var;
        this.K = view;
        this.L = x89Var;
        this.G = nwbVar;
        this.H = nwbVar2;
        this.M = nwbVar3;
        this.O = activity;
        this.P = j8fVar;
        this.N = nwbVar4;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.P;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        Object obj7 = this.K;
        switch (i) {
            case 0:
                return new ok3((b0g) this.I, (pl3) this.J, (View) obj7, (x89) obj6, this.G, this.H, (nwb) obj5, (Activity) obj3, (j8f) obj2, (nwb) obj4, tp4Var);
            default:
                nwb nwbVar = this.H;
                return new ok3((q61) obj7, this.G, (qi3) obj6, (fk0) obj5, (String) obj4, (h9) obj3, (ul7) obj2, nwbVar, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((ok3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return m45.E;
            default:
                return ((ok3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
    
        if (r13 != r6) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok3(q61 q61Var, nwb nwbVar, qi3 qi3Var, fk0 fk0Var, String str, h9 h9Var, ul7 ul7Var, nwb nwbVar2, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = q61Var;
        this.G = nwbVar;
        this.L = qi3Var;
        this.M = fk0Var;
        this.N = str;
        this.O = h9Var;
        this.P = ul7Var;
        this.H = nwbVar2;
    }
}
