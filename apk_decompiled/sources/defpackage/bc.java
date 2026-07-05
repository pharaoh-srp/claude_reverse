package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bc extends r3g {
    public s1g a;
    public final lsc b;

    public bc(s1g s1gVar, l9e l9eVar) {
        this.a = s1gVar;
        this.b = mpk.P(l9eVar);
    }

    @Override // defpackage.r3g
    public final r3g a(g2g g2gVar, s1g s1gVar, long j, long j2, long j3) {
        Object obj;
        dpf dpfVar = new dpf(j, fcc.h(j2, j3), j3);
        l9e l9eVarC = c();
        if (l9eVarC == null) {
            s1g s1gVar2 = this.a;
            if (s1gVar2 == null) {
                List listB = g2gVar.b();
                int size = listB.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i);
                    if (g2gVar.c().contains((h2g) obj)) {
                        break;
                    }
                    i++;
                }
                h2g h2gVar = (h2g) obj;
                s1gVar2 = h2gVar != null ? h2gVar.P : null;
            }
            l9eVarC = oq5.m(g2gVar, s1gVar2);
            if (l9eVarC == null) {
                l9eVarC = d4c.x(j2, j);
            }
        }
        oq5.n(dpfVar, j, j2, j3, true);
        return new ac(dpfVar, s1gVar, l9eVarC);
    }

    @Override // defpackage.r3g
    public final boolean b() {
        return true;
    }

    @Override // defpackage.r3g
    public final l9e c() {
        return (l9e) this.b.getValue();
    }

    @Override // defpackage.r3g
    public final dpf e() {
        return null;
    }

    @Override // defpackage.r3g
    public final l9e f(g2g g2gVar) {
        Object obj;
        l9e l9eVarC = c();
        if (l9eVarC != null) {
            return l9eVarC;
        }
        if (c() == null) {
            s1g s1gVar = this.a;
            if (s1gVar == null) {
                List listB = g2gVar.b();
                int size = listB.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i);
                    if (g2gVar.c().contains((h2g) obj)) {
                        break;
                    }
                    i++;
                }
                h2g h2gVar = (h2g) obj;
                s1gVar = h2gVar != null ? h2gVar.P : null;
            }
            l9e l9eVarM = oq5.m(g2gVar, s1gVar);
            if (l9eVarM != null) {
                this.b.setValue(l9eVarM);
            }
        }
        return c();
    }

    @Override // defpackage.r3g
    public final r3g g(s1g s1gVar) {
        if (this.a == null) {
            this.a = s1gVar;
        }
        return this;
    }

    @Override // defpackage.r3g
    public final r3g h() {
        return g4c.a;
    }

    @Override // defpackage.r3g
    public final void i(l9e l9eVar) {
        this.b.setValue(l9eVar);
    }
}
