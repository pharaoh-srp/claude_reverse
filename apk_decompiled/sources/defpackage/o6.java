package defpackage;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class o6 implements v86 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public o6(Activity activity, w7 w7Var, zy7 zy7Var) {
        this.a = 3;
        this.c = activity;
        this.d = w7Var;
        this.b = zy7Var;
    }

    @Override // defpackage.v86
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((zy7) obj3).a();
                ((m4a) obj2).a().c((n6) obj);
                break;
            case 1:
                ((v77) obj3).x((qm3) obj2);
                ((View) obj).setKeepScreenOn(false);
                break;
            case 2:
                fd9.z((l45) obj3, null);
                ((qbd) obj2).a.c((eu5) obj);
                break;
            case 3:
                Activity activity = (Activity) obj2;
                if (activity == null || !activity.isChangingConfigurations()) {
                    ((w7) obj).a(v7.G);
                }
                ((zy7) obj3).a();
                break;
            default:
                ec ecVar = (ec) obj3;
                ecVar.c(obj2);
                ecVar.c(obj);
                break;
        }
    }

    public /* synthetic */ o6(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
