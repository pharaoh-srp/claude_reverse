package defpackage;

import io.sentry.e0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class j7a extends AbstractMap implements Serializable {
    public static final g67 M = new g67(16);
    public h7a K;
    public h7a L;
    public int H = 0;
    public int I = 0;
    public final Comparator E = M;
    public final i7a G = new i7a();
    public i7a[] F = new i7a[16];
    public int J = 12;

    public final i7a a(Object obj, boolean z) {
        int iCompareTo;
        i7a i7aVar;
        boolean z2;
        i7a i7aVar2;
        i7a i7aVar3;
        i7a i7aVar4;
        i7a i7aVar5;
        i7a i7aVar6;
        i7a[] i7aVarArr = this.F;
        int iHashCode = obj.hashCode();
        int i = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i2 = ((i >>> 7) ^ i) ^ (i >>> 4);
        boolean z3 = true;
        int length = i2 & (i7aVarArr.length - 1);
        i7a i7aVar7 = i7aVarArr[length];
        g67 g67Var = M;
        i7a i7aVar8 = null;
        Comparator comparator = this.E;
        if (i7aVar7 != null) {
            Comparable comparable = comparator == g67Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = i7aVar7.J;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return i7aVar7;
                }
                i7a i7aVar9 = iCompareTo < 0 ? i7aVar7.F : i7aVar7.G;
                if (i7aVar9 == null) {
                    break;
                }
                i7aVar7 = i7aVar9;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        i7a i7aVar10 = this.G;
        if (i7aVar7 != null) {
            i7a i7aVar11 = i7aVar7;
            i7aVar = new i7a(i7aVar11, obj, i2, i7aVar10, i7aVar10.I);
            if (iCompareTo < 0) {
                i7aVar11.F = i7aVar;
            } else {
                i7aVar11.G = i7aVar;
            }
            c(i7aVar11, true);
        } else {
            if (comparator == g67Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            i7aVar = new i7a(i7aVar7, obj, i2, i7aVar10, i7aVar10.I);
            i7aVarArr[length] = i7aVar;
        }
        int i3 = this.H;
        this.H = i3 + 1;
        if (i3 > this.J) {
            i7a[] i7aVarArr2 = this.F;
            int length2 = i7aVarArr2.length;
            int i4 = length2 * 2;
            i7a[] i7aVarArr3 = new i7a[i4];
            dg3 dg3Var = new dg3(1);
            dg3 dg3Var2 = new dg3(1);
            int i5 = 0;
            while (i5 < length2) {
                i7a i7aVar12 = i7aVarArr2[i5];
                if (i7aVar12 == null) {
                    z2 = z3;
                    i7aVar3 = i7aVar8;
                } else {
                    i7a i7aVar13 = i7aVar8;
                    for (i7a i7aVar14 = i7aVar12; i7aVar14 != null; i7aVar14 = i7aVar14.F) {
                        i7aVar14.E = i7aVar13;
                        i7aVar13 = i7aVar14;
                    }
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i7aVar13 != null) {
                            z2 = z3;
                            i7a i7aVar15 = i7aVar13.E;
                            i7aVar13.E = i7aVar8;
                            i7a i7aVar16 = i7aVar13.G;
                            while (true) {
                                i7a i7aVar17 = i7aVar16;
                                i7aVar2 = i7aVar15;
                                i7aVar15 = i7aVar17;
                                if (i7aVar15 == null) {
                                    break;
                                }
                                i7aVar15.E = i7aVar2;
                                i7aVar16 = i7aVar15.F;
                            }
                        } else {
                            i7a i7aVar18 = i7aVar13;
                            i7aVar13 = i7aVar8;
                            i7aVar2 = i7aVar18;
                            z2 = z3;
                        }
                        if (i7aVar13 == null) {
                            break;
                        }
                        if ((i7aVar13.K & length2) == 0) {
                            i6++;
                        } else {
                            i7++;
                        }
                        i7aVar13 = i7aVar2;
                        z3 = z2;
                        i7aVar8 = null;
                    }
                    dg3Var.b = ((Integer.highestOneBit(i6) * 2) - 1) - i6;
                    dg3Var.d = 0;
                    dg3Var.c = 0;
                    i7a i7aVar19 = null;
                    dg3Var.e = null;
                    dg3Var2.b = ((Integer.highestOneBit(i7) * 2) - 1) - i7;
                    dg3Var2.d = 0;
                    dg3Var2.c = 0;
                    dg3Var2.e = null;
                    i7a i7aVar20 = null;
                    while (i7aVar12 != null) {
                        i7aVar12.E = i7aVar20;
                        i7a i7aVar21 = i7aVar12;
                        i7aVar12 = i7aVar12.F;
                        i7aVar20 = i7aVar21;
                    }
                    while (true) {
                        if (i7aVar20 != null) {
                            i7a i7aVar22 = i7aVar20.E;
                            i7aVar20.E = i7aVar19;
                            i7a i7aVar23 = i7aVar20.G;
                            while (true) {
                                i7aVar6 = i7aVar22;
                                i7aVar22 = i7aVar23;
                                if (i7aVar22 == null) {
                                    break;
                                }
                                i7aVar22.E = i7aVar6;
                                i7aVar23 = i7aVar22.F;
                            }
                            i7a i7aVar24 = i7aVar20;
                            i7aVar20 = i7aVar6;
                            i7aVar19 = i7aVar24;
                        }
                        if (i7aVar19 == null) {
                            break;
                        }
                        if ((i7aVar19.K & length2) == 0) {
                            dg3Var.a(i7aVar19);
                        } else {
                            dg3Var2.a(i7aVar19);
                        }
                        i7aVar19 = null;
                    }
                    if (i6 > 0) {
                        i7aVar4 = (i7a) dg3Var.e;
                        if (i7aVar4.E != null) {
                            e0.b();
                            return null;
                        }
                        i7aVar3 = null;
                    } else {
                        i7aVar3 = null;
                        i7aVar4 = null;
                    }
                    i7aVarArr3[i5] = i7aVar4;
                    int i8 = i5 + length2;
                    if (i7 > 0) {
                        i7aVar5 = (i7a) dg3Var2.e;
                        if (i7aVar5.E != null) {
                            e0.b();
                            return i7aVar3;
                        }
                    } else {
                        i7aVar5 = i7aVar3;
                    }
                    i7aVarArr3[i8] = i7aVar5;
                }
                i5++;
                z3 = z2;
                i7aVar8 = i7aVar3;
            }
            this.F = i7aVarArr3;
            this.J = (i4 / 4) + (i4 / 2);
        }
        this.I++;
        return i7aVar;
    }

    public final void c(i7a i7aVar, boolean z) {
        while (i7aVar != null) {
            i7a i7aVar2 = i7aVar.F;
            i7a i7aVar3 = i7aVar.G;
            int i = i7aVar2 != null ? i7aVar2.M : 0;
            int i2 = i7aVar3 != null ? i7aVar3.M : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                i7a i7aVar4 = i7aVar3.F;
                i7a i7aVar5 = i7aVar3.G;
                int i4 = (i7aVar4 != null ? i7aVar4.M : 0) - (i7aVar5 != null ? i7aVar5.M : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    g(i7aVar3);
                }
                f(i7aVar);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                i7a i7aVar6 = i7aVar2.F;
                i7a i7aVar7 = i7aVar2.G;
                int i5 = (i7aVar6 != null ? i7aVar6.M : 0) - (i7aVar7 != null ? i7aVar7.M : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    f(i7aVar2);
                }
                g(i7aVar);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                i7aVar.M = i + 1;
                if (z) {
                    return;
                }
            } else {
                i7aVar.M = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            i7aVar = i7aVar.E;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.F, (Object) null);
        this.H = 0;
        this.I++;
        i7a i7aVar = this.G;
        i7a i7aVar2 = i7aVar.H;
        while (i7aVar2 != i7aVar) {
            i7a i7aVar3 = i7aVar2.H;
            i7aVar2.I = null;
            i7aVar2.H = null;
            i7aVar2 = i7aVar3;
        }
        i7aVar.I = i7aVar;
        i7aVar.H = i7aVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        i7a i7aVarA = null;
        if (obj != null) {
            try {
                i7aVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return i7aVarA != null;
    }

    public final void d(i7a i7aVar, boolean z) {
        i7a i7aVar2;
        i7a i7aVar3;
        int i;
        if (z) {
            i7a i7aVar4 = i7aVar.I;
            i7aVar4.H = i7aVar.H;
            i7aVar.H.I = i7aVar4;
            i7aVar.I = null;
            i7aVar.H = null;
        }
        i7a i7aVar5 = i7aVar.F;
        i7a i7aVar6 = i7aVar.G;
        i7a i7aVar7 = i7aVar.E;
        int i2 = 0;
        if (i7aVar5 == null || i7aVar6 == null) {
            if (i7aVar5 != null) {
                e(i7aVar, i7aVar5);
                i7aVar.F = null;
            } else if (i7aVar6 != null) {
                e(i7aVar, i7aVar6);
                i7aVar.G = null;
            } else {
                e(i7aVar, null);
            }
            c(i7aVar7, false);
            this.H--;
            this.I++;
            return;
        }
        if (i7aVar5.M > i7aVar6.M) {
            i7a i7aVar8 = i7aVar5.G;
            while (true) {
                i7a i7aVar9 = i7aVar8;
                i7aVar3 = i7aVar5;
                i7aVar5 = i7aVar9;
                if (i7aVar5 == null) {
                    break;
                } else {
                    i7aVar8 = i7aVar5.G;
                }
            }
        } else {
            i7a i7aVar10 = i7aVar6.F;
            while (true) {
                i7aVar2 = i7aVar6;
                i7aVar6 = i7aVar10;
                if (i7aVar6 == null) {
                    break;
                } else {
                    i7aVar10 = i7aVar6.F;
                }
            }
            i7aVar3 = i7aVar2;
        }
        d(i7aVar3, false);
        i7a i7aVar11 = i7aVar.F;
        if (i7aVar11 != null) {
            i = i7aVar11.M;
            i7aVar3.F = i7aVar11;
            i7aVar11.E = i7aVar3;
            i7aVar.F = null;
        } else {
            i = 0;
        }
        i7a i7aVar12 = i7aVar.G;
        if (i7aVar12 != null) {
            i2 = i7aVar12.M;
            i7aVar3.G = i7aVar12;
            i7aVar12.E = i7aVar3;
            i7aVar.G = null;
        }
        i7aVar3.M = Math.max(i, i2) + 1;
        e(i7aVar, i7aVar3);
    }

    public final void e(i7a i7aVar, i7a i7aVar2) {
        i7a i7aVar3 = i7aVar.E;
        i7aVar.E = null;
        if (i7aVar2 != null) {
            i7aVar2.E = i7aVar3;
        }
        if (i7aVar3 == null) {
            int i = i7aVar.K;
            this.F[i & (r2.length - 1)] = i7aVar2;
        } else if (i7aVar3.F == i7aVar) {
            i7aVar3.F = i7aVar2;
        } else {
            i7aVar3.G = i7aVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        h7a h7aVar = this.K;
        if (h7aVar != null) {
            return h7aVar;
        }
        h7a h7aVar2 = new h7a(this, 0);
        this.K = h7aVar2;
        return h7aVar2;
    }

    public final void f(i7a i7aVar) {
        i7a i7aVar2 = i7aVar.F;
        i7a i7aVar3 = i7aVar.G;
        i7a i7aVar4 = i7aVar3.F;
        i7a i7aVar5 = i7aVar3.G;
        i7aVar.G = i7aVar4;
        if (i7aVar4 != null) {
            i7aVar4.E = i7aVar;
        }
        e(i7aVar, i7aVar3);
        i7aVar3.F = i7aVar;
        i7aVar.E = i7aVar3;
        int iMax = Math.max(i7aVar2 != null ? i7aVar2.M : 0, i7aVar4 != null ? i7aVar4.M : 0) + 1;
        i7aVar.M = iMax;
        i7aVar3.M = Math.max(iMax, i7aVar5 != null ? i7aVar5.M : 0) + 1;
    }

    public final void g(i7a i7aVar) {
        i7a i7aVar2 = i7aVar.F;
        i7a i7aVar3 = i7aVar.G;
        i7a i7aVar4 = i7aVar2.F;
        i7a i7aVar5 = i7aVar2.G;
        i7aVar.F = i7aVar5;
        if (i7aVar5 != null) {
            i7aVar5.E = i7aVar;
        }
        e(i7aVar, i7aVar2);
        i7aVar2.G = i7aVar;
        i7aVar.E = i7aVar2;
        int iMax = Math.max(i7aVar3 != null ? i7aVar3.M : 0, i7aVar5 != null ? i7aVar5.M : 0) + 1;
        i7aVar.M = iMax;
        i7aVar2.M = Math.max(iMax, i7aVar4 != null ? i7aVar4.M : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        i7a i7aVarA;
        if (obj != null) {
            try {
                i7aVarA = a(obj, false);
            } catch (ClassCastException unused) {
                i7aVarA = null;
            }
        } else {
            i7aVarA = null;
        }
        if (i7aVarA != null) {
            return i7aVarA.L;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        h7a h7aVar = this.L;
        if (h7aVar != null) {
            return h7aVar;
        }
        h7a h7aVar2 = new h7a(this, 1);
        this.L = h7aVar2;
        return h7aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            mr9.h("key == null");
            return null;
        }
        i7a i7aVarA = a(obj, true);
        Object obj3 = i7aVarA.L;
        i7aVarA.L = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i7a i7aVarA;
        if (obj != null) {
            try {
                i7aVarA = a(obj, false);
            } catch (ClassCastException unused) {
                i7aVarA = null;
            }
        } else {
            i7aVarA = null;
        }
        if (i7aVarA != null) {
            d(i7aVarA, true);
        }
        if (i7aVarA != null) {
            return i7aVarA.L;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.H;
    }
}
