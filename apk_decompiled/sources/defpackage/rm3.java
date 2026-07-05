package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class rm3 implements v86 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rm3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.v86
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((m4a) obj2).a().c((pm3) obj);
                break;
            case 1:
                hi6 hi6Var = (hi6) obj2;
                String str = ((npg) obj).b;
                hi6Var.getClass();
                ((HashSet) hi6Var.F).remove(str);
                break;
            case 2:
                ((m4a) obj2).a().c((pm3) obj);
                break;
            case 3:
                ((ec) obj2).c(obj);
                break;
            case 4:
                ((c4a) obj2).c((i4a) obj);
                break;
            case 5:
                ((m4a) obj2).a().c((n6) obj);
                break;
            default:
                j7d j7dVar = (j7d) obj2;
                if (j7dVar != null) {
                    ((v77) obj).x(j7dVar);
                }
                break;
        }
    }
}
