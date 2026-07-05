package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qrk {
    public static final qrk c = new qrk(null, null, 100);
    public final EnumMap a;
    public final int b;

    public qrk(Boolean bool, Boolean bool2, int i) {
        EnumMap enumMap = new EnumMap(ork.class);
        this.a = enumMap;
        mrk mrkVar = mrk.DENIED;
        mrk mrkVar2 = mrk.GRANTED;
        mrk mrkVar3 = mrk.UNINITIALIZED;
        enumMap.put(ork.AD_STORAGE, bool == null ? mrkVar3 : bool.booleanValue() ? mrkVar2 : mrkVar);
        if (bool2 == null) {
            mrkVar = mrkVar3;
        } else if (bool2.booleanValue()) {
            mrkVar = mrkVar2;
        }
        enumMap.put(ork.ANALYTICS_STORAGE, mrkVar);
        this.b = i;
    }

    public static char a(mrk mrkVar) {
        if (mrkVar == null) {
            return '-';
        }
        int iOrdinal = mrkVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static String b(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static mrk c(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? mrk.UNINITIALIZED : mrk.GRANTED : mrk.DENIED : mrk.POLICY;
    }

    public static mrk d(String str) {
        mrk mrkVar = mrk.UNINITIALIZED;
        return str == null ? mrkVar : str.equals("granted") ? mrk.GRANTED : str.equals("denied") ? mrk.DENIED : mrkVar;
    }

    public static qrk e(int i, Bundle bundle) {
        if (bundle == null) {
            return new qrk(null, null, i);
        }
        EnumMap enumMap = new EnumMap(ork.class);
        for (ork orkVar : srk.STORAGE.E) {
            enumMap.put(orkVar, d(bundle.getString(orkVar.E)));
        }
        return new qrk(enumMap, i);
    }

    public static qrk f(int i, String str) {
        EnumMap enumMap = new EnumMap(ork.class);
        if (str == null) {
            str = "";
        }
        ork[] orkVarArr = srk.STORAGE.E;
        for (int i2 = 0; i2 < orkVarArr.length; i2++) {
            ork orkVar = orkVarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put(orkVar, c(str.charAt(i3)));
            } else {
                enumMap.put(orkVar, mrk.UNINITIALIZED);
            }
        }
        return new qrk(enumMap, i);
    }

    public static boolean h(int i, int i2) {
        if (i == -20 && i2 == -30) {
            return true;
        }
        return (i == -30 && i2 == -20) || i == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qrk) {
            qrk qrkVar = (qrk) obj;
            ork[] orkVarArr = srk.STORAGE.E;
            int length = orkVarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    ork orkVar = orkVarArr[i];
                    if (this.a.get(orkVar) != qrkVar.a.get(orkVar)) {
                        break;
                    }
                    i++;
                } else if (this.b == qrkVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qrk g(defpackage.qrk r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<ork> r1 = defpackage.ork.class
            r0.<init>(r1)
            srk r1 = defpackage.srk.STORAGE
            ork[] r1 = r1.E
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.a
            java.lang.Object r5 = r5.get(r4)
            mrk r5 = (defpackage.mrk) r5
            java.util.EnumMap r6 = r9.a
            java.lang.Object r6 = r6.get(r4)
            mrk r6 = (defpackage.mrk) r6
            if (r5 != 0) goto L24
            goto L33
        L24:
            if (r6 != 0) goto L27
            goto L43
        L27:
            mrk r7 = defpackage.mrk.UNINITIALIZED
            if (r5 != r7) goto L2c
            goto L33
        L2c:
            if (r6 != r7) goto L2f
            goto L43
        L2f:
            mrk r7 = defpackage.mrk.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L43
        L35:
            if (r6 != r7) goto L38
            goto L43
        L38:
            mrk r7 = defpackage.mrk.DENIED
            if (r5 == r7) goto L42
            if (r6 != r7) goto L3f
            goto L42
        L3f:
            mrk r5 = defpackage.mrk.GRANTED
            goto L43
        L42:
            r5 = r7
        L43:
            if (r5 == 0) goto L48
            r0.put(r4, r5)
        L48:
            int r3 = r3 + 1
            goto Ld
        L4b:
            qrk r8 = new qrk
            r9 = 100
            r8.<init>(r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrk.g(qrk):qrk");
    }

    public final int hashCode() {
        int iHashCode = this.b * 17;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((mrk) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(ork orkVar) {
        return ((mrk) this.a.get(orkVar)) != mrk.DENIED;
    }

    public final qrk j(qrk qrkVar) {
        EnumMap enumMap = new EnumMap(ork.class);
        for (ork orkVar : srk.STORAGE.E) {
            mrk mrkVar = (mrk) this.a.get(orkVar);
            if (mrkVar == mrk.UNINITIALIZED) {
                mrkVar = (mrk) qrkVar.a.get(orkVar);
            }
            if (mrkVar != null) {
                enumMap.put(orkVar, mrkVar);
            }
        }
        return new qrk(enumMap, this.b);
    }

    public final boolean k(qrk qrkVar, ork... orkVarArr) {
        for (ork orkVar : orkVarArr) {
            mrk mrkVar = (mrk) this.a.get(orkVar);
            mrk mrkVar2 = (mrk) qrkVar.a.get(orkVar);
            mrk mrkVar3 = mrk.DENIED;
            if (mrkVar == mrkVar3 && mrkVar2 != mrkVar3) {
                return true;
            }
        }
        return false;
    }

    public final Boolean l() {
        mrk mrkVar = (mrk) this.a.get(ork.AD_STORAGE);
        if (mrkVar == null) {
            return null;
        }
        int iOrdinal = mrkVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final Boolean m() {
        mrk mrkVar = (mrk) this.a.get(ork.ANALYTICS_STORAGE);
        if (mrkVar == null) {
            return null;
        }
        int iOrdinal = mrkVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String n() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            srk r1 = defpackage.srk.STORAGE
            ork[] r1 = r1.E
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L38
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.a
            java.lang.Object r4 = r5.get(r4)
            mrk r4 = (defpackage.mrk) r4
            r5 = 45
            if (r4 == 0) goto L32
            int r4 = r4.ordinal()
            if (r4 == 0) goto L32
            r6 = 1
            if (r4 == r6) goto L30
            r6 = 2
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L30
            goto L32
        L2d:
            r5 = 48
            goto L32
        L30:
            r5 = 49
        L32:
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L38:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrk.n():java.lang.String");
    }

    public final String o() {
        StringBuilder sb = new StringBuilder("G1");
        for (ork orkVar : srk.STORAGE.E) {
            sb.append(a((mrk) this.a.get(orkVar)));
        }
        return sb.toString();
    }

    public final boolean p() {
        return i(ork.ANALYTICS_STORAGE);
    }

    public final boolean q() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            if (((mrk) it.next()) != mrk.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(b(this.b));
        for (ork orkVar : srk.STORAGE.E) {
            sb.append(",");
            sb.append(orkVar.E);
            sb.append("=");
            mrk mrkVar = (mrk) this.a.get(orkVar);
            if (mrkVar == null) {
                mrkVar = mrk.UNINITIALIZED;
            }
            sb.append(mrkVar);
        }
        return sb.toString();
    }

    public qrk(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(ork.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
