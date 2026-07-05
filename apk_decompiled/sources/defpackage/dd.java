package defpackage;

import android.app.Activity;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class dd implements v86 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v86
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ad adVar = ((wc) obj).a;
                if (adVar == null) {
                    sz6.j("Launcher has not been initialized");
                } else {
                    adVar.B();
                }
                break;
            case 1:
                wni wniVar = (wni) obj;
                ListIterator listIterator = wniVar.g.listIterator(0);
                while (true) {
                    c8a c8aVar = (c8a) listIterator;
                    if (c8aVar.hasNext()) {
                        wniVar.a.m((uja) c8aVar.next());
                    }
                    break;
                }
                break;
            case 2:
                sih sihVar = (sih) obj;
                sihVar.w();
                sihVar.j = null;
                break;
            case 3:
                em2 em2Var = ((t53) obj).h0;
                int i2 = em2Var.A - 1;
                int i3 = i2 >= 0 ? i2 : 0;
                em2Var.A = i3;
                if (i3 == 0 && !((Boolean) em2Var.v.getValue()).booleanValue()) {
                    em2Var.w = true;
                    break;
                }
                break;
            case 4:
                ((z86) obj).F.a();
                break;
            case 5:
                ((zhh) obj).u();
                break;
            case 6:
                ((iz9) obj).d = null;
                break;
            case 7:
                xz9 xz9Var = (xz9) obj;
                bm7 bm7Var = xz9Var.c;
                if (bm7Var != null) {
                    bm7Var.a = false;
                }
                xz9Var.c = null;
                break;
            case 8:
                ((sz9) obj).f = true;
                break;
            case 9:
                ((wvb) obj).e = null;
                break;
            case 10:
                ((eie) obj).d();
                break;
            case 11:
                d8f d8fVar = (d8f) obj;
                if (d8fVar.c) {
                    Activity activity = d8fVar.d;
                    if (activity != null) {
                        activity.unregisterScreenCaptureCallback(qh3.b(d8fVar.e.getValue()));
                    }
                    d8fVar.d = null;
                    break;
                }
                break;
            default:
                ((gff) ((rok) obj)).V0(null);
                break;
        }
    }
}
