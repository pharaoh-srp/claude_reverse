package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s3g {
    public final g2g a;
    public int c;
    public s1g f;
    public int h;
    public final lsc b = mpk.P(g4c.a);
    public final isc d = new isc(0);
    public xlg e = xlg.E;
    public final isc g = new isc(0);

    public s3g(g2g g2gVar) {
        this.a = g2gVar;
    }

    public final r3g a() {
        return (r3g) this.b.getValue();
    }

    public final void b() {
        Object obj;
        List listC = this.a.c();
        int size = listC.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = listC.get(i);
            if (((h2g) obj).c().b()) {
                break;
            } else {
                i++;
            }
        }
        h2g h2gVar = (h2g) obj;
        if (h2gVar == null && this.f == null) {
            return;
        }
        if (x44.r(h2gVar != null ? h2gVar.P : null, this.f)) {
            return;
        }
        this.g.i(this.h + 1);
    }

    public final void c() {
        Object obj;
        Object obj2;
        r3g r3gVarA;
        isc iscVar = this.d;
        int iH = iscVar.h();
        int i = this.c;
        int i2 = 0;
        g2g g2gVar = this.a;
        if (iH != i) {
            this.c = iscVar.h();
            int iOrdinal = this.e.ordinal();
            if (iOrdinal == 0) {
                r3gVarA = a();
            } else if (iOrdinal != 1) {
                r3gVarA = g4c.a;
                if (iOrdinal == 2) {
                    List listC = g2gVar.c();
                    int size = listC.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            r3gVarA = a().h();
                            break;
                        } else if (x44.r(((h2g) listC.get(i3)).P, this.f)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else if (iOrdinal != 3) {
                    mr9.b();
                    return;
                }
            } else {
                r3gVarA = a().g(this.f);
            }
            this.b.setValue(r3gVarA);
            this.e = xlg.E;
        }
        isc iscVar2 = this.g;
        if (iscVar2.h() != this.h) {
            s1g s1gVar = null;
            if (g2gVar.b.a()) {
                List listC2 = g2gVar.c();
                int size2 = listC2.size();
                while (true) {
                    if (i2 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listC2.get(i2);
                    if (((h2g) obj2).c().b()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                h2g h2gVar = (h2g) obj2;
                if (h2gVar != null) {
                    s1gVar = h2gVar.P;
                }
            } else {
                List listB = g2gVar.b();
                int size3 = listB.size();
                while (true) {
                    if (i2 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i2);
                    if (((h2g) obj).c().b()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                h2g h2gVar2 = (h2g) obj;
                if (h2gVar2 != null) {
                    s1gVar = h2gVar2.P;
                }
            }
            if (!x44.r(s1gVar, this.f)) {
                this.f = s1gVar;
            }
            this.h = iscVar2.h();
        }
    }
}
