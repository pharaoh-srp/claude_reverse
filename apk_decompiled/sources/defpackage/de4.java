package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class de4 implements anf {
    public final vde E;
    public long F;

    public de4(List list, List list2) {
        hz8 hz8VarO = nz8.o();
        fd9.E(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            hz8VarO.b(new ce4((anf) list.get(i), (List) list2.get(i)));
        }
        this.E = hz8VarO.g();
        this.F = -9223372036854775807L;
    }

    @Override // defpackage.anf
    public final boolean b() {
        int i = 0;
        while (true) {
            vde vdeVar = this.E;
            if (i >= vdeVar.H) {
                return false;
            }
            if (((ce4) vdeVar.get(i)).E.b()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.anf
    public final long d() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            vde vdeVar = this.E;
            if (i >= vdeVar.H) {
                break;
            }
            long jD = ((ce4) vdeVar.get(i)).E.d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.anf
    public final boolean o(oca ocaVar) {
        boolean zO;
        boolean z = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zO = false;
            while (true) {
                vde vdeVar = this.E;
                if (i >= vdeVar.H) {
                    break;
                }
                long jD2 = ((ce4) vdeVar.get(i)).E.d();
                boolean z2 = jD2 != Long.MIN_VALUE && jD2 <= ocaVar.a;
                if (jD2 == jD || z2) {
                    zO |= ((ce4) vdeVar.get(i)).E.o(ocaVar);
                }
                i++;
            }
            z |= zO;
        } while (zO);
        return z;
    }

    @Override // defpackage.anf
    public final long p() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            vde vdeVar = this.E;
            if (i >= vdeVar.H) {
                break;
            }
            ce4 ce4Var = (ce4) vdeVar.get(i);
            long jP = ce4Var.E.p();
            nz8 nz8Var = ce4Var.F;
            if ((nz8Var.contains(1) || nz8Var.contains(2) || nz8Var.contains(4)) && jP != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jP);
            }
            if (jP != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jP);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.F = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.F;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // defpackage.anf
    public final void r(long j) {
        int i = 0;
        while (true) {
            vde vdeVar = this.E;
            if (i >= vdeVar.H) {
                return;
            }
            ((ce4) vdeVar.get(i)).r(j);
            i++;
        }
    }
}
