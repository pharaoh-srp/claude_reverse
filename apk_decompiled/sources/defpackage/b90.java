package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b90 implements o5b {
    public final i90 a;

    public b90(i90 i90Var) {
        this.a = i90Var;
    }

    @Override // defpackage.o5b
    public final int a(xa9 xa9Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((h5b) list.get(0)).o(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((h5b) list.get(i2)).o(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        c3d c3dVar;
        int i;
        c3d c3dVar2;
        int i2;
        int i3;
        int size = list.size();
        c3d[] c3dVarArr = new c3d[size];
        List list2 = list;
        int size2 = list2.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            c3dVar = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            h5b h5bVar = (h5b) list.get(i4);
            Object objZ = h5bVar.z();
            d90 d90Var = objZ instanceof d90 ? (d90) objZ : null;
            if (d90Var != null && ((Boolean) d90Var.E.getValue()).booleanValue()) {
                c3d c3dVarU = h5bVar.u(j);
                long j3 = (((long) c3dVarU.F) & 4294967295L) | (((long) c3dVarU.E) << 32);
                c3dVarArr[i4] = c3dVarU;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            h5b h5bVar2 = (h5b) list.get(i5);
            if (c3dVarArr[i5] == null) {
                c3dVarArr[i5] = h5bVar2.u(j);
            }
        }
        if (q5bVar.n0()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                c3dVar2 = null;
            } else {
                c3dVar2 = c3dVarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = c3dVar2 != null ? c3dVar2.E : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            c3d c3dVar3 = c3dVarArr[i8];
                            int i9 = c3dVar3 != null ? c3dVar3.E : 0;
                            if (i7 < i9) {
                                c3dVar2 = c3dVar3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
            i2 = c3dVar2 != null ? c3dVar2.E : 0;
        }
        if (q5bVar.n0()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                c3dVar = c3dVarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = c3dVar != null ? c3dVar.F : 0;
                    if (1 <= i10) {
                        while (true) {
                            c3d c3dVar4 = c3dVarArr[i];
                            int i12 = c3dVar4 != null ? c3dVar4.F : 0;
                            if (i11 < i12) {
                                c3dVar = c3dVar4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = c3dVar != null ? c3dVar.F : 0;
        }
        if (!q5bVar.n0()) {
            this.a.c.setValue(new g79((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return q5bVar.U(i2, i3, nm6.E, new a90(c3dVarArr, this, i2, i3));
    }

    @Override // defpackage.o5b
    public final int c(xa9 xa9Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((h5b) list.get(0)).l(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((h5b) list.get(i2)).l(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.o5b
    public final int d(xa9 xa9Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((h5b) list.get(0)).a(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((h5b) list.get(i2)).a(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.o5b
    public final int e(xa9 xa9Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((h5b) list.get(0)).Q(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((h5b) list.get(i2)).Q(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
