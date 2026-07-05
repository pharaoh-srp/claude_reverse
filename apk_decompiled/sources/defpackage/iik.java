package defpackage;

import com.anthropic.claude.api.project.ProjectFilter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iik {
    public static final ta4 a = new ta4(1576931780, false, new db4(18));
    public static final ta4 b = new ta4(-1127220645, false, new db4(22));
    public static final ta4 c = new ta4(-1223608764, false, new db4(23));
    public static final ta4 d = new ta4(-1568524509, false, new db4(24));
    public static final ta4 e = new ta4(-179792647, false, new db4(25));
    public static final ta4 f = new ta4(-1913440254, false, new db4(26));
    public static final ta4 g = new ta4(-648056963, false, new db4(27));
    public static final ta4 h = new ta4(1387462579, false, new db4(19));
    public static final ta4 i = new ta4(-532254838, false, new gb4(22));
    public static final ta4 j = new ta4(2079003696, false, new db4(20));
    public static final ta4 k = new ta4(-2008715088, false, new gb4(23));
    public static final ta4 l = new ta4(-1687892377, false, new db4(21));
    public static final ta4 m = new ta4(-1332907396, false, new gb4(24));

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        if (r15 == r6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
    
        r1.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cd -> B:41:0x00cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e4 -> B:45:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.d0h r12, defpackage.zy7 r13, defpackage.pz7 r14, defpackage.vd1 r15) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iik.a(d0h, zy7, pz7, vd1):java.lang.Object");
    }

    public static et6 b(qh9 qh9Var) {
        String strM;
        try {
            bh9 bh9VarS = qh9Var.s("domain");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM3 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("type");
            int i2 = 0;
            if (bh9VarS3 != null && (strM = bh9VarS3.m()) != null) {
                int[] iArrH = sq6.H(14);
                int length = iArrH.length;
                while (i2 < length) {
                    int i3 = iArrH[i2];
                    if (ms6.h(i3).equals(strM)) {
                        i2 = i3;
                    } else {
                        i2++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new et6(strM2, strM3, i2);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Provider", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Provider", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Provider", e4);
            return null;
        }
    }

    public static hxi c(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("test_id").m();
            String strM2 = qh9Var.s("result_id").m();
            bh9 bh9VarS = qh9Var.s("injected");
            Boolean boolValueOf = bh9VarS != null ? Boolean.valueOf(bh9VarS.a()) : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), hxi.e)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            strM.getClass();
            strM2.getClass();
            return new hxi(strM, strM2, boolValueOf, linkedHashMap);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Synthetics", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Synthetics", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Synthetics", e4);
            return null;
        }
    }

    public static final ProjectFilter d(gnd gndVar) {
        gndVar.getClass();
        int iOrdinal = gndVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return ProjectFilter.IS_CREATOR;
            }
            if (iOrdinal == 2) {
                return ProjectFilter.IS_SHARED_WITH_ORG;
            }
            if (iOrdinal == 3) {
                return ProjectFilter.IS_SHARED_WITH_ME;
            }
            if (iOrdinal != 4) {
                wg6.i();
                return null;
            }
        }
        return null;
    }

    public static final boolean e(gnd gndVar) {
        gndVar.getClass();
        return gndVar == gnd.I;
    }

    public static void f() {
        lka lkaVar = lka.d;
    }

    public static String g(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder sbX = sq6.x("<", str2, " threw ");
                    sbX.append(e2.getClass().getName());
                    sbX.append(">");
                    string = sbX.toString();
                }
            }
            objArr[i3] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i4 = 0;
        while (i2 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i4)) != -1) {
            sb.append((CharSequence) strValueOf, i4, iIndexOf);
            sb.append(objArr[i2]);
            i4 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) strValueOf, i4, strValueOf.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final kmd h(gnd gndVar) {
        gndVar.getClass();
        int iOrdinal = gndVar.ordinal();
        if (iOrdinal == 0) {
            return kmd.I;
        }
        if (iOrdinal == 1) {
            return kmd.E;
        }
        if (iOrdinal == 2) {
            return kmd.F;
        }
        if (iOrdinal == 3) {
            return kmd.G;
        }
        if (iOrdinal == 4) {
            return kmd.K;
        }
        wg6.i();
        return null;
    }

    public static final Object i(mkf mkfVar, Object obj) {
        Object objR = mkfVar.r(obj);
        if (!(objR instanceof zh2)) {
            return iei.a;
        }
        return ((ai2) gb9.V(im6.E, new pb2(mkfVar, obj, null, 4))).a;
    }

    public static iqb j(iqb iqbVar, gkj gkjVar, boolean z, pz7 pz7Var, int i2) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        pgg pggVar = pgg.T;
        if ((i2 & 32) != 0) {
            pz7Var = new bkj(gkjVar, null);
        }
        pz7 pz7Var2 = pz7Var;
        iqbVar.getClass();
        gkjVar.getClass();
        pz7Var2.getClass();
        return iqbVar.B(new hkj(gkjVar, z2, d9f.E, pggVar, pz7Var2));
    }
}
