package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class feb implements gd5 {
    public static final we4 F = new we4(new i12(new rl7(22), dyb.F), new i12(new rl7(23), dyb.G));
    public final ArrayList E = new ArrayList();

    @Override // defpackage.gd5
    public final long a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.E;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((hd5) arrayList.get(i)).b;
            long j3 = ((hd5) arrayList.get(i)).d;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.gd5
    public final boolean b(hd5 hd5Var, long j) {
        long j2 = hd5Var.b;
        fd9.E(j2 != -9223372036854775807L);
        fd9.E(hd5Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < hd5Var.d;
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((hd5) arrayList.get(size)).b) {
                arrayList.add(size + 1, hd5Var);
                return z;
            }
        }
        arrayList.add(0, hd5Var);
        return z;
    }

    @Override // defpackage.gd5
    public final void clear() {
        this.E.clear();
    }

    @Override // defpackage.gd5
    public final nz8 d(long j) {
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            if (j >= ((hd5) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    hd5 hd5Var = (hd5) arrayList.get(i);
                    if (j >= hd5Var.b && j < hd5Var.d) {
                        arrayList2.add(hd5Var);
                    }
                    if (j < hd5Var.b) {
                        break;
                    }
                }
                vde vdeVarW = nz8.w(F, arrayList2);
                hz8 hz8VarO = nz8.o();
                for (int i2 = 0; i2 < vdeVarW.H; i2++) {
                    hz8VarO.c(((hd5) vdeVarW.get(i2)).a);
                }
                return hz8VarO.g();
            }
        }
        iz8 iz8Var = nz8.F;
        return vde.I;
    }

    @Override // defpackage.gd5
    public final long e(long j) {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((hd5) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((hd5) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((hd5) arrayList.get(i)).b;
            long j3 = ((hd5) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // defpackage.gd5
    public final void f(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((hd5) arrayList.get(i)).b;
            if (j > j2 && j > ((hd5) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
