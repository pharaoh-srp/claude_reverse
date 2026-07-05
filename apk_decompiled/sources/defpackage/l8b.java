package defpackage;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class l8b implements f8b, ug6 {
    public final n8b a;
    public final /* synthetic */ o8b b;

    public l8b(o8b o8bVar, n8b n8bVar) {
        this.b = o8bVar;
        this.a = n8bVar;
    }

    @Override // defpackage.f8b
    public final void A(int i, z7b z7bVar, final uba ubaVar, final l7b l7bVar, final int i2) {
        final Pair pairA = a(i, z7bVar);
        if (pairA != null) {
            ((k1h) this.b.j).d(new Runnable() { // from class: j8b
                @Override // java.lang.Runnable
                public final void run() {
                    hp5 hp5Var = (hp5) this.E.b.i;
                    Pair pair = pairA;
                    hp5Var.A(((Integer) pair.first).intValue(), (z7b) pair.second, ubaVar, l7bVar, i2);
                }
            });
        }
    }

    public final Pair a(int i, z7b z7bVar) {
        z7b z7bVarA;
        n8b n8bVar = this.a;
        z7b z7bVar2 = null;
        if (z7bVar != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= n8bVar.c.size()) {
                    z7bVarA = null;
                    break;
                }
                if (((z7b) n8bVar.c.get(i2)).d == z7bVar.d) {
                    Object obj = z7bVar.a;
                    Object obj2 = n8bVar.b;
                    int i3 = l7d.k;
                    z7bVarA = z7bVar.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (z7bVarA == null) {
                return null;
            }
            z7bVar2 = z7bVarA;
        }
        return Pair.create(Integer.valueOf(i + n8bVar.d), z7bVar2);
    }

    @Override // defpackage.f8b
    public final void c(int i, z7b z7bVar, l7b l7bVar) {
        Pair pairA = a(i, z7bVar);
        if (pairA != null) {
            ((k1h) this.b.j).d(new f60(this, pairA, l7bVar, 8));
        }
    }

    @Override // defpackage.f8b
    public final void g(int i, z7b z7bVar, uba ubaVar, l7b l7bVar) {
        Pair pairA = a(i, z7bVar);
        if (pairA != null) {
            ((k1h) this.b.j).d(new i8b(this, pairA, ubaVar, l7bVar, 0));
        }
    }

    @Override // defpackage.f8b
    public final void j(int i, z7b z7bVar, uba ubaVar, l7b l7bVar) {
        Pair pairA = a(i, z7bVar);
        if (pairA != null) {
            ((k1h) this.b.j).d(new i8b(this, pairA, ubaVar, l7bVar, 1));
        }
    }

    @Override // defpackage.f8b
    public final void k(int i, z7b z7bVar, final uba ubaVar, final l7b l7bVar, final IOException iOException, final boolean z) {
        final Pair pairA = a(i, z7bVar);
        if (pairA != null) {
            ((k1h) this.b.j).d(new Runnable() { // from class: k8b
                @Override // java.lang.Runnable
                public final void run() {
                    hp5 hp5Var = (hp5) this.E.b.i;
                    Pair pair = pairA;
                    hp5Var.k(((Integer) pair.first).intValue(), (z7b) pair.second, ubaVar, l7bVar, iOException, z);
                }
            });
        }
    }
}
