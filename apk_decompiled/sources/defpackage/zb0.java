package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zb0 implements CharSequence {
    public static final /* synthetic */ int I = 0;
    public final List E;
    public final String F;
    public final ArrayList G;
    public final ArrayList H;

    static {
        y5f y5fVar = c6f.a;
    }

    public zb0(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.E = list;
        this.F = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                yb0 yb0Var = (yb0) list.get(i);
                Object obj = yb0Var.a;
                if (obj instanceof egg) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(yb0Var);
                } else if (obj instanceof jrc) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(yb0Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.G = arrayList;
        this.H = arrayList2;
        List listI1 = arrayList2 != null ? w44.i1(arrayList2, new mt7(9)) : null;
        List list2 = listI1;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i2 = ((yb0) w44.L0(listI1)).c;
        wub wubVar = u69.a;
        wub wubVar2 = new wub(1);
        wubVar2.a(i2);
        int size2 = listI1.size();
        for (int i3 = 1; i3 < size2; i3++) {
            yb0 yb0Var2 = (yb0) listI1.get(i3);
            while (true) {
                if (wubVar2.b != 0) {
                    int iD = wubVar2.d();
                    int i4 = yb0Var2.b;
                    int i5 = yb0Var2.c;
                    if (i4 >= iD) {
                        wubVar2.f(wubVar2.b - 1);
                    } else if (i5 > iD) {
                        c39.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + iD);
                    }
                }
            }
            wubVar2.a(yb0Var2.c);
        }
    }

    public final List a(int i) {
        List list = this.E;
        if (list == null) {
            return lm6.E;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            yb0 yb0Var = (yb0) obj;
            if ((yb0Var.a instanceof o6a) && ac0.b(0, i, yb0Var.b, yb0Var.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List b(int i, int i2, String str) {
        List list = this.E;
        if (list == null) {
            return lm6.E;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            yb0 yb0Var = (yb0) list.get(i3);
            if ((yb0Var.a instanceof erg) && x44.r(str, yb0Var.d) && ac0.b(i, i2, yb0Var.b, yb0Var.c)) {
                arrayList.add(yhk.i(yb0Var));
            }
        }
        return arrayList;
    }

    public final boolean c(int i) {
        List list = this.E;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                yb0 yb0Var = (yb0) list.get(i2);
                if ((yb0Var.a instanceof o6a) && ac0.b(0, i, yb0Var.b, yb0Var.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.F.charAt(i);
    }

    public final zb0 d(bz7 bz7Var) {
        xb0 xb0Var = new xb0(this);
        ArrayList arrayList = xb0Var.G;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yb0 yb0Var = (yb0) bz7Var.invoke(((wb0) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new wb0(yb0Var.b, yb0Var.c, yb0Var.a, yb0Var.d));
        }
        return xb0Var.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zb0 subSequence(int r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 > r11) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.c39.a(r1)
        L26:
            java.lang.String r1 = r9.F
            if (r10 != 0) goto L31
            int r4 = r1.length()
            if (r11 != r4) goto L31
            return r9
        L31:
            java.lang.String r1 = r1.substring(r10, r11)
            zb0 r4 = defpackage.ac0.a
            if (r10 > r11) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r10)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r11)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.c39.a(r2)
        L54:
            java.util.List r9 = r9.E
            if (r9 != 0) goto L59
            goto L9c
        L59:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r9.size()
            r2.<init>(r3)
            r3 = r9
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
        L69:
            if (r0 >= r3) goto L96
            java.lang.Object r4 = r9.get(r0)
            yb0 r4 = (defpackage.yb0) r4
            int r5 = r4.b
            int r6 = r4.c
            boolean r5 = defpackage.ac0.b(r10, r11, r5, r6)
            if (r5 == 0) goto L93
            yb0 r5 = new yb0
            java.lang.Object r7 = r4.a
            int r8 = r4.b
            int r8 = java.lang.Math.max(r10, r8)
            int r8 = r8 - r10
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r10
            java.lang.String r4 = r4.d
            r5.<init>(r8, r6, r7, r4)
            r2.add(r5)
        L93:
            int r0 = r0 + 1
            goto L69
        L96:
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L9d
        L9c:
            r2 = 0
        L9d:
            zb0 r9 = new zb0
            r9.<init>(r2, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb0.subSequence(int, int):zb0");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb0)) {
            return false;
        }
        zb0 zb0Var = (zb0) obj;
        return x44.r(this.F, zb0Var.F) && x44.r(this.E, zb0Var.E);
    }

    public final int hashCode() {
        int iHashCode = this.F.hashCode() * 31;
        List list = this.E;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.F.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.F;
    }

    public /* synthetic */ zb0(String str, ArrayList arrayList) {
        this(arrayList, lm6.E, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zb0(List list, List list2, String str) {
        zb0 zb0Var = ac0.a;
        if (list.isEmpty() && list2.isEmpty()) {
            list = null;
        } else if (!list2.isEmpty()) {
            if (list.isEmpty()) {
                list = list2;
            } else {
                ArrayList arrayList = new ArrayList(list2.size() + list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add((yb0) list.get(i));
                }
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList.add((yb0) list2.get(i2));
                }
                list = arrayList;
            }
        }
        this(list, str);
    }

    public /* synthetic */ zb0(String str) {
        this(str, lm6.E);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zb0(String str, List list) {
        List list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
