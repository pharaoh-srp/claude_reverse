package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class jqj implements grj, lsj, Iterable {
    public final TreeMap E;
    public final TreeMap F;

    public jqj(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                u(i, (lsj) list.get(i));
            }
        }
    }

    @Override // defpackage.lsj
    public final Double a() {
        TreeMap treeMap = this.E;
        return treeMap.size() == 1 ? p(0).a() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // defpackage.grj
    public final lsj b(String str) {
        lsj lsjVar;
        return "length".equals(str) ? new yqj(Double.valueOf(r())) : (!e(str) || (lsjVar = (lsj) this.F.get(str)) == null) ? lsj.v : lsjVar;
    }

    @Override // defpackage.grj
    public final boolean e(String str) {
        return "length".equals(str) || this.F.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jqj)) {
            return false;
        }
        jqj jqjVar = (jqj) obj;
        if (r() != jqjVar.r()) {
            return false;
        }
        TreeMap treeMap = this.E;
        if (treeMap.isEmpty()) {
            return jqjVar.E.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!p(iIntValue).equals(jqjVar.p(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.lsj
    public final Iterator g() {
        return new dqj(this.E.keySet().iterator(), this.F.keySet().iterator());
    }

    @Override // defpackage.lsj
    public final String h() {
        return s(",");
    }

    public final int hashCode() {
        return this.E.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new wsj(2, this);
    }

    @Override // defpackage.lsj
    public final Boolean k() {
        return Boolean.TRUE;
    }

    @Override // defpackage.lsj
    public final lsj l() {
        jqj jqjVar = new jqj();
        for (Map.Entry entry : this.E.entrySet()) {
            boolean z = entry.getValue() instanceof grj;
            TreeMap treeMap = jqjVar.E;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (lsj) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((lsj) entry.getValue()).l());
            }
        }
        return jqjVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0399, code lost:
    
        if (defpackage.vok.s(r26, r28, (defpackage.osj) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).r() != r()) goto L239;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3 A[PHI: r24
      0x00e3: PHI (r24v7 byte) = 
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v0 byte)
      (r24v4 byte)
      (r24v0 byte)
     binds: [B:49:0x00e0, B:117:0x019c, B:113:0x0190, B:109:0x0184, B:105:0x017a, B:101:0x0170, B:97:0x0163, B:93:0x0159, B:89:0x014f, B:85:0x0145, B:81:0x013a, B:77:0x012f, B:73:0x0124, B:69:0x0119, B:65:0x010e, B:61:0x0103, B:57:0x00f8, B:120:0x01a1, B:53:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5 A[PHI: r6 r24
      0x00e5: PHI (r6v22 java.lang.String) = (r6v2 java.lang.String), (r6v3 java.lang.String), (r6v23 java.lang.String) binds: [B:126:0x01bb, B:122:0x01ab, B:50:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r24v6 byte) = (r24v0 byte), (r24v0 byte), (r24v7 byte) binds: [B:126:0x01bb, B:122:0x01ab, B:50:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015f  */
    @Override // defpackage.lsj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lsj m(java.lang.String r27, defpackage.c61 r28, java.util.ArrayList r29) {
        /*
            Method dump skipped, instruction units count: 2308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqj.m(java.lang.String, c61, java.util.ArrayList):lsj");
    }

    @Override // defpackage.grj
    public final void o(String str, lsj lsjVar) {
        TreeMap treeMap = this.F;
        if (lsjVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, lsjVar);
        }
    }

    public final lsj p(int i) {
        lsj lsjVar;
        if (i < r()) {
            return (!v(i) || (lsjVar = (lsj) this.E.get(Integer.valueOf(i))) == null) ? lsj.v : lsjVar;
        }
        xh6.j("Attempting to get element outside of current array");
        return null;
    }

    public final void q(lsj lsjVar) {
        u(r(), lsjVar);
    }

    public final int r() {
        TreeMap treeMap = this.E;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final String s(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.E.isEmpty()) {
            for (int i = 0; i < r(); i++) {
                lsj lsjVarP = p(i);
                sb.append(str);
                if (!(lsjVarP instanceof ltj) && !(lsjVarP instanceof csj)) {
                    sb.append(lsjVarP.h());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void t(int i) {
        TreeMap treeMap = this.E;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            if (treeMap.containsKey(Integer.valueOf(i2)) || i2 < 0) {
                return;
            }
            treeMap.put(Integer.valueOf(i2), lsj.v);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            lsj lsjVar = (lsj) treeMap.get(Integer.valueOf(i));
            if (lsjVar != null) {
                treeMap.put(Integer.valueOf(i - 1), lsjVar);
                treeMap.remove(Integer.valueOf(i));
            }
        }
    }

    public final String toString() {
        return s(",");
    }

    public final void u(int i, lsj lsjVar) {
        if (i > 32468) {
            sz6.j("Array too large");
            return;
        }
        if (i < 0) {
            xh6.j(grc.p(i, "Out of bounds index: "));
            return;
        }
        TreeMap treeMap = this.E;
        if (lsjVar == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), lsjVar);
        }
    }

    public final boolean v(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.E;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        xh6.j(grc.p(i, "Out of bounds index: "));
        return false;
    }

    public final Iterator w() {
        return this.E.keySet().iterator();
    }

    public final ArrayList y() {
        ArrayList arrayList = new ArrayList(r());
        for (int i = 0; i < r(); i++) {
            arrayList.add(p(i));
        }
        return arrayList;
    }

    public jqj() {
        this.E = new TreeMap();
        this.F = new TreeMap();
    }

    public jqj(lsj... lsjVarArr) {
        this(Arrays.asList(lsjVarArr));
    }
}
