package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l90 implements o5b {
    public final ja0 a;
    public boolean b;

    public l90(ja0 ja0Var) {
        this.a = ja0Var;
    }

    @Override // defpackage.o5b
    public final int a(xa9 xa9Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iO = ((h5b) list.get(0)).o(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iO2 = ((h5b) list.get(i2)).o(i);
                if (iO2 > iO) {
                    iO = iO2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iO;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            c3d c3dVarU = ((h5b) list.get(i)).u(j);
            iMax = Math.max(iMax, c3dVarU.E);
            iMax2 = Math.max(iMax2, c3dVarU.F);
            arrayList.add(c3dVarU);
        }
        boolean zN0 = q5bVar.n0();
        ja0 ja0Var = this.a;
        if (zN0) {
            this.b = true;
            ja0Var.b.setValue(new g79((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            ja0Var.b.setValue(new g79((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return q5bVar.U(iMax, iMax2, nm6.E, new e0(7, arrayList));
    }

    @Override // defpackage.o5b
    public final int c(xa9 xa9Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iL = ((h5b) list.get(0)).l(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iL2 = ((h5b) list.get(i2)).l(i);
                if (iL2 > iL) {
                    iL = iL2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iL;
    }

    @Override // defpackage.o5b
    public final int d(xa9 xa9Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA = ((h5b) list.get(0)).a(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iA2 = ((h5b) list.get(i2)).a(i);
                if (iA2 > iA) {
                    iA = iA2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iA;
    }

    @Override // defpackage.o5b
    public final int e(xa9 xa9Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iQ = ((h5b) list.get(0)).Q(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iQ2 = ((h5b) list.get(i2)).Q(i);
                if (iQ2 > iQ) {
                    iQ = iQ2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iQ;
    }
}
