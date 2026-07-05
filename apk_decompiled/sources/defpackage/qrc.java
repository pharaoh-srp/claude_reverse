package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class qrc extends zh4 {
    public final /* synthetic */ int r;
    public final Method s;
    public final int t;

    public /* synthetic */ qrc(Method method, int i, int i2) {
        this.r = i2;
        this.s = method;
        this.t = i;
    }

    @Override // defpackage.zh4
    public final void j(zie zieVar, Object obj) {
        int i = this.r;
        int i2 = this.t;
        Method method = this.s;
        switch (i) {
            case 0:
                wg8 wg8Var = (wg8) obj;
                if (wg8Var == null) {
                    throw zni.Q(method, i2, "Headers parameter must not be null.", new Object[0]);
                }
                gmf gmfVar = zieVar.f;
                gmfVar.getClass();
                int size = wg8Var.size();
                for (int i3 = 0; i3 < size; i3++) {
                    skj.a(gmfVar, wg8Var.e(i3), wg8Var.k(i3));
                }
                return;
            default:
                if (obj == null) {
                    throw zni.Q(method, i2, "@Url parameter is null.", new Object[0]);
                }
                zieVar.c = obj.toString();
                return;
        }
    }
}
