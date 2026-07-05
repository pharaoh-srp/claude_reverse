package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import io.sentry.a1;
import io.sentry.t5;
import io.sentry.util.f;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g11 implements mm0, e99 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;

    public g11(int i, int i2) {
        this.E = i2;
        switch (i2) {
            case 4:
                int iB = b(i);
                this.G = new g11[iB];
                this.F = iB - 1;
                break;
            case 6:
                EnumMap enumMap = new EnumMap(brd.class);
                this.G = enumMap;
                this.F = i;
                enumMap.put(brd.E, new lk5(i));
                enumMap.put(brd.F, new w5j());
                break;
            case 9:
                this.F = i;
                break;
            case 13:
                this.G = new HashSet();
                this.F = i;
                break;
            default:
                int iB2 = b(i);
                this.G = new dpc[iB2];
                this.F = iB2 - 1;
                break;
        }
    }

    public static int b(int i) {
        if (i <= 0) {
            sz6.p("Cache capacity must be > 0");
            return 0;
        }
        if (i > 1073741824) {
            i = 1073741824;
        }
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return iNumberOfLeadingZeros + 1;
    }

    public static void k(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = x44.z(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    @Override // defpackage.e99
    public void a(char c) {
        m(this.F, 1);
        char[] cArr = (char[]) this.G;
        int i = this.F;
        this.F = i + 1;
        cArr[i] = c;
    }

    @Override // defpackage.mm0
    public void c(String str) {
        ((AtomicReference) this.G).set(str);
    }

    @Override // defpackage.mm0
    public int d() {
        return this.F;
    }

    @Override // defpackage.e99
    public void e(String str) {
        byte b;
        str.getClass();
        m(this.F, str.length() + 2);
        char[] cArr = (char[]) this.G;
        int i = this.F;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = jrg.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    m(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = jrg.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) this.G)[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str2 = jrg.a[cCharAt];
                            str2.getClass();
                            m(i4, str2.length());
                            str2.getChars(0, str2.length(), (char[]) this.G, i4);
                            int length3 = str2.length() + i4;
                            this.F = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = (char[]) this.G;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            this.F = i4;
                        }
                    }
                }
                m(i4, 1);
                ((char[]) this.G)[i4] = '\"';
                this.F = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        this.F = i3 + 1;
    }

    @Override // defpackage.mm0
    public String f() {
        Object obj = ((AtomicReference) this.G).get();
        obj.getClass();
        return (String) obj;
    }

    @Override // defpackage.e99
    public void g(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        m(this.F, length);
        str.getChars(0, str.length(), (char[]) this.G, this.F);
        this.F += length;
    }

    public void h() {
        int i = this.F;
        this.F = i + 1;
        if (i >= 10) {
            this.F = 0;
            Iterator it = ((LinkedHashMap) this.G).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    j5e j5eVar = (j5e) w44.N0(arrayList);
                    if ((j5eVar != null ? (wv8) j5eVar.b().get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((j5e) arrayList.get(i4)).b().get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.CharSequence r21, int r22, int r23, defpackage.pmf r24, defpackage.pmf r25, defpackage.pmf r26) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g11.i(java.lang.CharSequence, int, int, pmf, pmf, pmf):java.lang.Object");
    }

    public Object j(Object obj, yz7 yz7Var) {
        dpc[] dpcVarArr = (dpc[]) this.G;
        int i = this.F;
        if (obj == null) {
            return null;
        }
        int iHashCode = obj.hashCode();
        int i2 = iHashCode & i;
        int i3 = 1;
        while (true) {
            int i4 = iHashCode & i;
            dpc dpcVar = dpcVarArr[i4];
            if (dpcVar == null) {
                Object objApply = yz7Var.apply(obj);
                dpcVarArr[i4] = new dpc(obj, objApply);
                return objApply;
            }
            if (obj.equals(dpcVar.a)) {
                return dpcVar.b;
            }
            if (i3 == 3) {
                Object objApply2 = yz7Var.apply(obj);
                dpcVarArr[i2] = new dpc(obj, objApply2);
                return objApply2;
            }
            iHashCode = Integer.reverseBytes(iHashCode * (-1640532531)) * (-1640532531);
            i3++;
        }
    }

    public void l() throws Throwable {
        if (((AtomicBoolean) this.G).compareAndSet(true, false)) {
            mpk.B(this.F, "chatScreenNetworkApply");
        }
    }

    public void m(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.G;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.G = Arrays.copyOf(cArr, i3);
        }
    }

    public HashMap n(Map map, a1 a1Var) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), p(a1Var, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    public void o(oy7 oy7Var, int i, int i2) {
        ((yue) this.G).d(new zyg(oy7Var), i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    public Object p(a1 a1Var, Object obj) {
        Object objQ;
        HashSet hashSet = (HashSet) this.G;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return f.a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (!(obj instanceof URI) && !(obj instanceof InetAddress) && !(obj instanceof UUID) && !(obj instanceof Currency)) {
            if (obj instanceof Calendar) {
                return f.b((Calendar) obj);
            }
            if (obj.getClass().isEnum()) {
                return obj.toString();
            }
            if (hashSet.contains(obj)) {
                a1Var.h(t5.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            hashSet.add(obj);
            try {
                if (hashSet.size() > this.F) {
                    hashSet.remove(obj);
                    a1Var.h(t5.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                    return obj.toString();
                }
                try {
                    if (obj.getClass().isArray()) {
                        objQ = new ArrayList();
                        for (Object obj2 : (Object[]) obj) {
                            objQ.add(p(a1Var, obj2));
                        }
                    } else if (obj instanceof Collection) {
                        objQ = new ArrayList();
                        Iterator it = ((Collection) obj).iterator();
                        while (it.hasNext()) {
                            objQ.add(p(a1Var, it.next()));
                        }
                    } else if (obj instanceof Map) {
                        objQ = n((Map) obj, a1Var);
                    } else {
                        objQ = q(a1Var, obj);
                        if (objQ.isEmpty()) {
                            objQ = obj.toString();
                        }
                    }
                    hashSet.remove(obj);
                    return objQ;
                } catch (Exception e) {
                    a1Var.d(t5.INFO, "Not serializing object due to throwing sub-path.", e);
                    hashSet.remove(obj);
                    return null;
                }
            } catch (Throwable th) {
                hashSet.remove(obj);
                throw th;
            }
        }
        return obj.toString();
    }

    public HashMap q(a1 a1Var, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, p(a1Var, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    a1Var.h(t5.INFO, ij0.j("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    public void r(mab mabVar, wv8 wv8Var, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.G;
        Object arrayList = linkedHashMap.get(mabVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(mabVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        j5e j5eVar = new j5e(new WeakReference(wv8Var), map, j);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                j5e j5eVar2 = (j5e) arrayList2.get(i);
                if (j < j5eVar2.c()) {
                    i++;
                } else if (j5eVar2.b().get() == wv8Var) {
                    arrayList2.set(i, j5eVar);
                } else {
                    arrayList2.add(i, j5eVar);
                }
            }
        } else {
            arrayList2.add(j5eVar);
        }
        h();
    }

    public String toString() {
        switch (this.E) {
            case 5:
                return new String((char[]) this.G, 0, this.F);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.e99
    public void writeLong(long j) {
        g(String.valueOf(j));
    }

    public g11(String str, int i) {
        this.E = 1;
        this.F = i;
        this.G = new AtomicReference(str);
    }

    public g11(int i, boolean z, boolean z2) {
        this.E = i;
        switch (i) {
            case 5:
                break;
            case 8:
                this.G = new LinkedHashMap();
                break;
            case 10:
                int i2 = vf4.O1.t;
                this.F = i2;
                if (i2 != 1) {
                    ez8 ez8Var = new ez8();
                    vf4 vf4Var = vf4.O1;
                    ez8Var.E = true ^ vf4Var.w;
                    if (vf4Var.u) {
                    }
                    this.G = ez8Var;
                } else {
                    this.G = new yl4(14);
                }
                break;
            default:
                this.F = System.identityHashCode(this);
                this.G = new AtomicBoolean(false);
                break;
        }
    }

    public /* synthetic */ g11(Object obj, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = i;
    }

    public g11(int i, Object obj) {
        this.E = 3;
        this.F = i;
        this.G = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g11(yue yueVar, int i) {
        this(i, 9);
        this.E = 9;
        this.G = yueVar;
    }
}
