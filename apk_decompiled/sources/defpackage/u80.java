package defpackage;

import com.anthropic.claude.mcpapps.b;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u80 implements v86 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u80(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.v86
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((kdg) obj3).remove(obj2);
                ((i90) obj).d.k(obj2);
                break;
            case 1:
                t53 t53Var = (t53) obj3;
                fj0 fj0Var = (fj0) obj2;
                b bVar = t53Var.X;
                if (bVar.h == fj0Var) {
                    bVar.h = null;
                }
                if (t53Var.z0 == ((zw) obj)) {
                    t53Var.z0 = null;
                }
                break;
            case 2:
                ((m4a) obj3).a().c((g4a) obj2);
                n4a n4aVar = (n4a) ((dae) obj).E;
                if (n4aVar != null) {
                    n4aVar.a();
                }
                break;
            case 3:
                ((m4a) obj3).a().c((g4a) obj2);
                w4a w4aVar = (w4a) ((dae) obj).E;
                if (w4aVar != null) {
                    w4aVar.a();
                }
                break;
            default:
                a5f a5fVar = (a5f) obj3;
                f5f f5fVar = (f5f) obj;
                if (a5fVar.F.k(obj2) == f5fVar) {
                    Map map = a5fVar.E;
                    Map mapE = f5fVar.e();
                    if (!mapE.isEmpty()) {
                        map.put(obj2, mapE);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
