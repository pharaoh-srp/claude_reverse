package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ks0 extends pd implements bz7 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(wwb wwbVar) {
        super(1, 8, wwb.class, wwbVar, "add", "add(Ljava/lang/Object;)Z");
        this.L = 3;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.L;
        int i2 = 2;
        tp4 tp4Var = null;
        iei ieiVar = iei.a;
        Object obj2 = this.E;
        switch (i) {
            case 0:
                pwd pwdVar = (pwd) obj2;
                gb9.D(pwdVar.a, null, null, new m61(pwdVar, ((Boolean) obj).booleanValue(), tp4Var, 7), 3);
                break;
            case 1:
                gt2 gt2Var = (gt2) obj;
                gt2Var.getClass();
                hw2 hw2Var = (hw2) obj2;
                hw2Var.getClass();
                gb9.D(hw2Var.a, null, null, new nn1(hw2Var, gt2Var, tp4Var, 16), 3);
                break;
            case 2:
                w2a w2aVar = (w2a) obj;
                w2aVar.getClass();
                ((List) obj2).add(w2aVar);
                break;
            case 3:
                ((wwb) obj2).b((w8f) obj);
                break;
            case 4:
                r93 r93Var = (r93) obj2;
                gb9.D(r93Var.h, null, null, new m61(r93Var, ((Boolean) obj).booleanValue(), tp4Var, i2), 3);
                break;
            case 5:
                r93 r93Var2 = (r93) obj2;
                gb9.D(r93Var2.h, null, null, new m61(r93Var2, ((Boolean) obj).booleanValue(), tp4Var, i2), 3);
                break;
            default:
                ((vfh) obj2).s1(((ty8) obj).a);
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ks0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.L = i3;
    }
}
