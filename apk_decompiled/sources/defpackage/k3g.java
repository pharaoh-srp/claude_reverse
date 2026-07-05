package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k3g implements mma {
    public final /* synthetic */ mma E;
    public final l45 F;
    public cu9 I;
    public cu9 J;
    public final lsc G = mpk.P(Boolean.FALSE);
    public final x7f H = new x7f(1, this);
    public final kdg K = new kdg();
    public final mdg L = new mdg();

    public k3g(mma mmaVar, l45 l45Var) {
        this.E = mmaVar;
        this.F = l45Var;
    }

    public static h3g b(Object obj, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(800730162);
        e18Var.a0(-148945892);
        boolean zF = e18Var.f(obj);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new h3g(obj);
            e18Var.k0(objN);
        }
        h3g h3gVar = (h3g) objN;
        h3gVar.b.setValue(b3g.a);
        e18Var.p(false);
        e18Var.p(false);
        return h3gVar;
    }

    public static iqb c(k3g k3gVar, iqb iqbVar, h3g h3gVar, ia0 ia0Var, int i) {
        eb0 eb0Var = oq5.c;
        if ((i & 4) != 0) {
            eb0Var = ez1.o;
        }
        g3g.a.getClass();
        l3g l3gVar = o3g.b;
        k3gVar.getClass();
        return kxk.p(iqbVar, new i3g(h3gVar, ia0Var.a(), lxe.J, k3gVar, f3g.b, l3gVar, eb0Var));
    }

    public final boolean a() {
        return ((Boolean) this.G.getValue()).booleanValue();
    }

    @Override // defpackage.mma
    public final cu9 d(cu9 cu9Var) {
        return this.E.d(cu9Var);
    }

    public final void e() {
        Collection<g2g> collectionValues = this.L.d().c.values();
        boolean z = false;
        for (g2g g2gVar : collectionValues) {
            z = z || (g2gVar.a() && g2gVar.d());
            g2gVar.e();
        }
        if (z != a()) {
            this.G.setValue(Boolean.valueOf(z));
            if (z) {
                return;
            }
            for (g2g g2gVar2 : collectionValues) {
                if (g2gVar2.c().size() > 1) {
                    List listC = g2gVar2.c();
                    int i = i2g.a;
                    int size = listC.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((h2g) listC.get(i2)).c().b()) {
                            break;
                        }
                    }
                }
                s3g s3gVar = g2gVar2.c;
                s3gVar.e = xlg.E;
                s3gVar.c = s3gVar.d.h();
                s3gVar.b.setValue(g4c.a);
            }
        }
    }

    @Override // defpackage.mma
    public final long f(cu9 cu9Var, cu9 cu9Var2) {
        return this.E.f(cu9Var, cu9Var2);
    }

    @Override // defpackage.mma
    public final cu9 j(b3d b3dVar) {
        return this.E.j(b3dVar);
    }
}
