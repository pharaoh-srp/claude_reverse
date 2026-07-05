package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q7a extends AbstractMap implements Serializable {
    public static final iec M = new iec(5);
    public final boolean F;
    public p7a G;
    public final p7a J;
    public m7a K;
    public vo0 L;
    public int H = 0;
    public int I = 0;
    public final Comparator E = M;

    public q7a(boolean z) {
        this.F = z;
        this.J = new p7a(z);
    }

    public final p7a a(Object obj, boolean z) {
        int iCompareTo;
        p7a p7aVar;
        p7a p7aVar2 = this.G;
        iec iecVar = M;
        Comparator comparator = this.E;
        if (p7aVar2 != null) {
            Comparable comparable = comparator == iecVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = p7aVar2.J;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return p7aVar2;
                }
                p7a p7aVar3 = iCompareTo < 0 ? p7aVar2.F : p7aVar2.G;
                if (p7aVar3 == null) {
                    break;
                }
                p7aVar2 = p7aVar3;
            }
        } else {
            iCompareTo = 0;
        }
        p7a p7aVar4 = p7aVar2;
        if (!z) {
            return null;
        }
        p7a p7aVar5 = this.J;
        if (p7aVar4 != null) {
            p7aVar = new p7a(this.F, p7aVar4, obj, p7aVar5, p7aVar5.I);
            if (iCompareTo < 0) {
                p7aVar4.F = p7aVar;
            } else {
                p7aVar4.G = p7aVar;
            }
            c(p7aVar4, true);
        } else {
            if (comparator == iecVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            p7aVar = new p7a(this.F, p7aVar4, obj, p7aVar5, p7aVar5.I);
            this.G = p7aVar;
        }
        this.H++;
        this.I++;
        return p7aVar;
    }

    public final void c(p7a p7aVar, boolean z) {
        while (p7aVar != null) {
            p7a p7aVar2 = p7aVar.F;
            p7a p7aVar3 = p7aVar.G;
            int i = p7aVar2 != null ? p7aVar2.M : 0;
            int i2 = p7aVar3 != null ? p7aVar3.M : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                p7a p7aVar4 = p7aVar3.F;
                p7a p7aVar5 = p7aVar3.G;
                int i4 = (p7aVar4 != null ? p7aVar4.M : 0) - (p7aVar5 != null ? p7aVar5.M : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    f(p7aVar);
                } else {
                    g(p7aVar3);
                    f(p7aVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                p7a p7aVar6 = p7aVar2.F;
                p7a p7aVar7 = p7aVar2.G;
                int i5 = (p7aVar6 != null ? p7aVar6.M : 0) - (p7aVar7 != null ? p7aVar7.M : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    g(p7aVar);
                } else {
                    f(p7aVar2);
                    g(p7aVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                p7aVar.M = i + 1;
                if (z) {
                    return;
                }
            } else {
                p7aVar.M = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            p7aVar = p7aVar.E;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.G = null;
        this.H = 0;
        this.I++;
        p7a p7aVar = this.J;
        p7aVar.I = p7aVar;
        p7aVar.H = p7aVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        p7a p7aVarA = null;
        if (obj != null) {
            try {
                p7aVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return p7aVarA != null;
    }

    public final void d(p7a p7aVar, boolean z) {
        p7a p7aVar2;
        p7a p7aVar3;
        int i;
        if (z) {
            p7a p7aVar4 = p7aVar.I;
            p7aVar4.H = p7aVar.H;
            p7aVar.H.I = p7aVar4;
        }
        p7a p7aVar5 = p7aVar.F;
        p7a p7aVar6 = p7aVar.G;
        p7a p7aVar7 = p7aVar.E;
        int i2 = 0;
        if (p7aVar5 == null || p7aVar6 == null) {
            if (p7aVar5 != null) {
                e(p7aVar, p7aVar5);
                p7aVar.F = null;
            } else if (p7aVar6 != null) {
                e(p7aVar, p7aVar6);
                p7aVar.G = null;
            } else {
                e(p7aVar, null);
            }
            c(p7aVar7, false);
            this.H--;
            this.I++;
            return;
        }
        if (p7aVar5.M > p7aVar6.M) {
            p7a p7aVar8 = p7aVar5.G;
            while (true) {
                p7a p7aVar9 = p7aVar8;
                p7aVar3 = p7aVar5;
                p7aVar5 = p7aVar9;
                if (p7aVar5 == null) {
                    break;
                } else {
                    p7aVar8 = p7aVar5.G;
                }
            }
        } else {
            p7a p7aVar10 = p7aVar6.F;
            while (true) {
                p7aVar2 = p7aVar6;
                p7aVar6 = p7aVar10;
                if (p7aVar6 == null) {
                    break;
                } else {
                    p7aVar10 = p7aVar6.F;
                }
            }
            p7aVar3 = p7aVar2;
        }
        d(p7aVar3, false);
        p7a p7aVar11 = p7aVar.F;
        if (p7aVar11 != null) {
            i = p7aVar11.M;
            p7aVar3.F = p7aVar11;
            p7aVar11.E = p7aVar3;
            p7aVar.F = null;
        } else {
            i = 0;
        }
        p7a p7aVar12 = p7aVar.G;
        if (p7aVar12 != null) {
            i2 = p7aVar12.M;
            p7aVar3.G = p7aVar12;
            p7aVar12.E = p7aVar3;
            p7aVar.G = null;
        }
        p7aVar3.M = Math.max(i, i2) + 1;
        e(p7aVar, p7aVar3);
    }

    public final void e(p7a p7aVar, p7a p7aVar2) {
        p7a p7aVar3 = p7aVar.E;
        p7aVar.E = null;
        if (p7aVar2 != null) {
            p7aVar2.E = p7aVar3;
        }
        if (p7aVar3 == null) {
            this.G = p7aVar2;
        } else if (p7aVar3.F == p7aVar) {
            p7aVar3.F = p7aVar2;
        } else {
            p7aVar3.G = p7aVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        m7a m7aVar = this.K;
        if (m7aVar != null) {
            return m7aVar;
        }
        m7a m7aVar2 = new m7a(this, 0);
        this.K = m7aVar2;
        return m7aVar2;
    }

    public final void f(p7a p7aVar) {
        p7a p7aVar2 = p7aVar.F;
        p7a p7aVar3 = p7aVar.G;
        p7a p7aVar4 = p7aVar3.F;
        p7a p7aVar5 = p7aVar3.G;
        p7aVar.G = p7aVar4;
        if (p7aVar4 != null) {
            p7aVar4.E = p7aVar;
        }
        e(p7aVar, p7aVar3);
        p7aVar3.F = p7aVar;
        p7aVar.E = p7aVar3;
        int iMax = Math.max(p7aVar2 != null ? p7aVar2.M : 0, p7aVar4 != null ? p7aVar4.M : 0) + 1;
        p7aVar.M = iMax;
        p7aVar3.M = Math.max(iMax, p7aVar5 != null ? p7aVar5.M : 0) + 1;
    }

    public final void g(p7a p7aVar) {
        p7a p7aVar2 = p7aVar.F;
        p7a p7aVar3 = p7aVar.G;
        p7a p7aVar4 = p7aVar2.F;
        p7a p7aVar5 = p7aVar2.G;
        p7aVar.F = p7aVar5;
        if (p7aVar5 != null) {
            p7aVar5.E = p7aVar;
        }
        e(p7aVar, p7aVar2);
        p7aVar2.G = p7aVar;
        p7aVar.E = p7aVar2;
        int iMax = Math.max(p7aVar3 != null ? p7aVar3.M : 0, p7aVar5 != null ? p7aVar5.M : 0) + 1;
        p7aVar.M = iMax;
        p7aVar2.M = Math.max(iMax, p7aVar4 != null ? p7aVar4.M : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        p7a p7aVarA;
        if (obj != null) {
            try {
                p7aVarA = a(obj, false);
            } catch (ClassCastException unused) {
                p7aVarA = null;
            }
        } else {
            p7aVarA = null;
        }
        if (p7aVarA != null) {
            return p7aVarA.L;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        vo0 vo0Var = this.L;
        if (vo0Var != null) {
            return vo0Var;
        }
        vo0 vo0Var2 = new vo0(1, this);
        this.L = vo0Var2;
        return vo0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            mr9.h("key == null");
            return null;
        }
        if (obj2 == null && !this.F) {
            mr9.h("value == null");
            return null;
        }
        p7a p7aVarA = a(obj, true);
        Object obj3 = p7aVarA.L;
        p7aVarA.L = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        p7a p7aVarA;
        if (obj != null) {
            try {
                p7aVarA = a(obj, false);
            } catch (ClassCastException unused) {
                p7aVarA = null;
            }
        } else {
            p7aVarA = null;
        }
        if (p7aVarA != null) {
            d(p7aVarA, true);
        }
        if (p7aVarA != null) {
            return p7aVarA.L;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.H;
    }
}
