package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class bv5 extends e4i {
    public static final bv5 F = new bv5(new av5());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        ebh.w(1000, 1001, 1002, 1003, 1004);
        ebh.w(1005, 1006, 1007, 1008, 1009);
        ebh.w(1010, 1011, 1012, 1013, 1014);
        tpi.w(1015);
        tpi.w(1016);
        tpi.w(1017);
        tpi.w(1018);
    }

    public bv5(av5 av5Var) {
        super(av5Var);
        this.w = av5Var.w;
        this.x = av5Var.x;
        this.y = av5Var.y;
        this.z = av5Var.z;
        this.A = av5Var.A;
        this.B = av5Var.B;
        this.C = av5Var.C;
        this.D = av5Var.D;
        this.E = av5Var.E;
    }

    @Override // defpackage.e4i
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bv5.class == obj.getClass()) {
            bv5 bv5Var = (bv5) obj;
            if (super.equals(bv5Var) && this.w == bv5Var.w && this.x == bv5Var.x && this.y == bv5Var.y && this.z == bv5Var.z && this.A == bv5Var.A && this.B == bv5Var.B && this.C == bv5Var.C) {
                SparseBooleanArray sparseBooleanArray = bv5Var.E;
                SparseBooleanArray sparseBooleanArray2 = this.E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = bv5Var.D;
                            SparseArray sparseArray2 = this.D;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i2);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                w3i w3iVar = (w3i) entry.getKey();
                                                if (!map2.containsKey(w3iVar) || !Objects.equals(entry.getValue(), map2.get(w3iVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.e4i
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.w ? 1 : 0)) * 961) + (this.x ? 1 : 0)) * 961) + (this.y ? 1 : 0)) * 28629151) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 961) + (this.C ? 1 : 0)) * 31;
    }
}
