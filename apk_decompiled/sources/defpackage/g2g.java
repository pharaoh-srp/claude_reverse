package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g2g {
    public final Object a;
    public final k3g b;
    public final s3g c = new s3g(this);
    public final lsc d;
    public final lsc e;
    public final a80 f;
    public boolean g;
    public final f2g h;
    public final f2g i;

    public g2g(Object obj, k3g k3gVar) {
        this.a = obj;
        this.b = k3gVar;
        lm6 lm6Var = lm6.E;
        this.d = mpk.P(lm6Var);
        this.e = mpk.P(lm6Var);
        this.f = new a80(new fcc(0L), dgj.k, null, 12);
        this.h = new f2g(this, 0);
        this.i = new f2g(this, 1);
    }

    public final boolean a() {
        s3g s3gVar = this.c;
        return s3gVar.a().b() || s3gVar.a().d() || s3gVar.e == xlg.F;
    }

    public final List b() {
        return (List) this.d.getValue();
    }

    public final List c() {
        return (List) this.e.getValue();
    }

    public final boolean d() {
        List listC = c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            a6i a6iVar = ((h2g) listC.get(i)).c().b;
            while (true) {
                a6i a6iVar2 = a6iVar.b;
                if (a6iVar2 == null) {
                    break;
                }
                a6iVar = a6iVar2;
            }
            if (!x44.r(a6iVar.a.q0(), a6iVar.d.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        List listB = b();
        ArrayList arrayList = new ArrayList();
        int size = listB.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            h2g h2gVar = (h2g) listB.get(i);
            if (h2gVar.h()) {
                arrayList.add(h2gVar);
                if (h2gVar.c().b()) {
                    z = true;
                }
            }
        }
        this.e.setValue(arrayList);
        s3g s3gVar = this.c;
        g2g g2gVar = s3gVar.a;
        isc iscVar = s3gVar.d;
        if (g2gVar.c().size() > 1 && z) {
            s3gVar.e = xlg.F;
            iscVar.i(s3gVar.c + 1);
        } else if (!g2gVar.b.a()) {
            s3gVar.e = xlg.E;
            s3gVar.c = iscVar.h();
            s3gVar.b.setValue(g4c.a);
        } else if (!z) {
            s3gVar.e = xlg.G;
            iscVar.i(s3gVar.c + 1);
        }
        s3gVar.b();
    }
}
