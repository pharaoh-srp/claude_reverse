package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vfa implements wti {
    public final /* synthetic */ int a;
    public final wti b;
    public final Object c;

    public vfa(al2 al2Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                sv5 sv5Var = new sv5(new poj(dah.I), true);
                this.c = al2Var;
                this.b = sv5Var;
                break;
            default:
                this.b = new sv5(new poj(dah.I), true);
                List list = al2Var.i;
                ArrayList arrayList = new ArrayList(x44.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.log10(((Number) it.next()).doubleValue())));
                }
                this.c = arrayList;
                break;
        }
    }

    @Override // defpackage.wti
    public final float a(ge2 ge2Var, y9d y9dVar, float f, float f2) {
        int i = this.a;
        wti wtiVar = this.b;
        ge2Var.getClass();
        y9dVar.getClass();
        switch (i) {
        }
        return wtiVar.a(ge2Var, y9dVar, f, f2);
    }

    @Override // defpackage.wti
    public final float b(ge2 ge2Var, y9d y9dVar, float f, float f2) {
        int i = this.a;
        wti wtiVar = this.b;
        ge2Var.getClass();
        y9dVar.getClass();
        switch (i) {
        }
        return wtiVar.b(ge2Var, y9dVar, f, f2);
    }

    @Override // defpackage.wti
    public final List c(ge2 ge2Var, pa1 pa1Var) {
        int i = this.a;
        Object obj = this.c;
        ge2Var.getClass();
        pa1Var.getClass();
        switch (i) {
            case 0:
                return (ArrayList) obj;
            default:
                return ((al2) obj).i;
        }
    }

    @Override // defpackage.wti
    public final boolean d(yd2 yd2Var) {
        int i = this.a;
        wti wtiVar = this.b;
        switch (i) {
        }
        return wtiVar.d(yd2Var);
    }

    @Override // defpackage.wti
    public final List e(pa1 pa1Var, yd2 yd2Var) {
        int i = this.a;
        Object obj = this.c;
        pa1Var.getClass();
        switch (i) {
            case 0:
                return (ArrayList) obj;
            default:
                return ((al2) obj).i;
        }
    }

    @Override // defpackage.wti
    public final List f(yd2 yd2Var, float f, float f2, pa1 pa1Var) {
        int i = this.a;
        Object obj = this.c;
        pa1Var.getClass();
        switch (i) {
            case 0:
                return (ArrayList) obj;
            default:
                return ((al2) obj).i;
        }
    }

    @Override // defpackage.wti
    public final List g(ge2 ge2Var, float f, float f2, qa1 qa1Var) {
        int i = this.a;
        Object obj = this.c;
        ge2Var.getClass();
        qa1Var.getClass();
        switch (i) {
            case 0:
                return (ArrayList) obj;
            default:
                return ((al2) obj).i;
        }
    }
}
