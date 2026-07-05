package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r5 implements v86 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.v86
    public final void a() throws Exception {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((AccessibilityManager) obj2).removeTouchExplorationStateChangeListener((p5) obj);
                break;
            case 1:
                ((fb1) obj2).b((nc4) obj);
                break;
            case 2:
                on8 on8Var = (on8) obj2;
                on8Var.getClass();
                obj.getClass();
                on8Var.a.remove(obj);
                break;
            case 3:
                ((bb1) obj2).c((wa1) obj);
                break;
            case 4:
                nwb nwbVar = (nwb) obj2;
                Map map = (Map) nwbVar.getValue();
                if (map != null) {
                    ((nwb) obj).setValue(map);
                }
                nwbVar.setValue(null);
                break;
            case 5:
                ((b29) obj2).a.l((z19) obj);
                break;
            case 6:
                ((f1a) obj2).G.l(obj);
                break;
            case 7:
                ((koi) obj2).m((vni) obj);
                break;
            case 8:
                ((c4a) obj2).c((i4a) obj);
                break;
            case 9:
                ((fb1) obj2).b((vc4) obj);
                break;
            case 10:
                nwb nwbVar2 = (nwb) obj2;
                odd oddVar = (odd) nwbVar2.getValue();
                if (oddVar != null) {
                    ndd nddVar = new ndd(oddVar);
                    zub zubVar = (zub) obj;
                    if (zubVar != null) {
                        zubVar.c(nddVar);
                    }
                    nwbVar2.setValue(null);
                }
                break;
            case 11:
                ((dkh) obj2).c.remove((bz7) obj);
                break;
            case 12:
                ((a6i) obj2).j.remove((a6i) obj);
                break;
            case 13:
                a6i a6iVar = (a6i) obj2;
                a6iVar.getClass();
                p5i p5iVar = (p5i) ((q5i) obj).b.getValue();
                if (p5iVar != null) {
                    a6iVar.i.remove(p5iVar.E);
                }
                break;
            case 14:
                ((a6i) obj2).i.remove((v5i) obj);
                break;
            default:
                gdj gdjVar = (gdj) obj2;
                View view = (View) obj;
                int i2 = gdjVar.v - 1;
                gdjVar.v = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = mvi.a;
                    fvi.c(view, null);
                    mvi.j(view, null);
                    view.removeOnAttachStateChangeListener(gdjVar.w);
                }
                break;
        }
    }
}
