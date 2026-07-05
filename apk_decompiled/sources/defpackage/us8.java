package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class us8 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public us8(k99 k99Var, lj5 lj5Var, bz7 bz7Var, hi5 hi5Var, int i, zy7 zy7Var) {
        this.a = 1;
        k99Var.getClass();
        lj5Var.getClass();
        bz7Var.getClass();
        hi5Var.getClass();
        sq6.a(i);
        this.c = k99Var;
        this.d = bz7Var;
        this.e = hi5Var;
        this.b = i;
        this.f = zy7Var;
        cye cyeVarA = t78.a(k99Var);
        this.g = cyeVarA instanceof hf ? (hf) cyeVarA : null;
        lxe lxeVar = lxe.O;
        this.h = lxeVar;
        this.i = lxeVar;
    }

    public static ArrayList l(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iF0 = bsg.F0(str, '&', i, 4);
            if (iF0 == -1) {
                iF0 = str.length();
            }
            int iF02 = bsg.F0(str, '=', i, 4);
            if (iF02 == -1 || iF02 > iF0) {
                arrayList.add(str.substring(i, iF0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iF02));
                arrayList.add(str.substring(iF02 + 1, iF0));
            }
            i = iF0 + 1;
        }
        return arrayList;
    }

    public void a(String str) {
        str.getClass();
        i(0, str.length(), str, false, false);
    }

    public void b(String str, String str2) {
        str.getClass();
        if (((ArrayList) this.i) == null) {
            this.i = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) this.i;
        arrayList.getClass();
        arrayList.add(kxk.m(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false));
        ArrayList arrayList2 = (ArrayList) this.i;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? kxk.m(0, 0, 91, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false) : null);
    }

    public vs8 c() {
        ArrayList arrayList;
        String str = (String) this.c;
        if (str == null) {
            sz6.j("scheme == null");
            return null;
        }
        String strG = kxk.G((String) this.d, 0, 0, 7);
        String strG2 = kxk.G((String) this.e, 0, 0, 7);
        String str2 = (String) this.f;
        if (str2 == null) {
            sz6.j("host == null");
            return null;
        }
        int iD = d();
        ArrayList arrayList2 = (ArrayList) this.h;
        ArrayList arrayList3 = new ArrayList(x44.y(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(kxk.G((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(x44.y(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? kxk.G(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.g;
        return new vs8(str, strG, strG2, str2, iD, arrayList3, arrayList, str4 != null ? kxk.G(str4, 0, 0, 7) : null, toString());
    }

    public int d() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.c;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public void e(String str) {
        if (isg.q0(str, "/", false)) {
            j(0, str.length(), str);
        } else {
            mr9.q("unexpected encodedPath: ".concat(str));
        }
    }

    public void f(String str) {
        str.getClass();
        String strB = tkj.b(kxk.G(str, 0, 0, 7));
        if (strB != null) {
            this.f = strB;
        } else {
            sz6.p("unexpected host: ".concat(str));
        }
    }

    public void g(Exception exc) {
        k99 k99Var = (k99) this.c;
        ArrayList arrayListA0 = x44.a0(g99.E);
        if (exc != null) {
            arrayListA0.add(g99.G);
        }
        dch.I(k99Var.t(), 5, arrayListA0, tnh.U, exc, 48);
        hf hfVar = (hf) this.g;
        if (hfVar != null) {
            if (x44.r((bz7) this.h, lxe.O)) {
                dch.H(k99Var.t(), 4, g99.F, tnh.V, null, false, 56);
            }
            ((bz7) this.h).invoke(hfVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(defpackage.vs8 r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us8.h(vs8, java.lang.String):void");
    }

    public void i(int i, int i2, String str, boolean z, boolean z2) {
        ArrayList arrayList = (ArrayList) this.h;
        String strM = kxk.m(i, i2, 112, str, " \"<>^`{}|/\\?#", z2);
        if (strM.equals(".") || strM.equalsIgnoreCase("%2e")) {
            return;
        }
        if (strM.equals("..") || strM.equalsIgnoreCase("%2e.") || strM.equalsIgnoreCase(".%2e") || strM.equalsIgnoreCase("%2e%2e")) {
            if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                arrayList.add("");
                return;
            } else {
                arrayList.set(arrayList.size() - 1, "");
                return;
            }
        }
        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
            arrayList.set(arrayList.size() - 1, strM);
        } else {
            arrayList.add(strM);
        }
        if (z) {
            arrayList.add("");
        }
    }

    public void j(int i, int i2, String str) {
        ArrayList arrayList = (ArrayList) this.h;
        if (i == i2) {
            return;
        }
        char cCharAt = str.charAt(i);
        if (cCharAt == '/' || cCharAt == '\\') {
            arrayList.clear();
            arrayList.add("");
            i++;
        } else {
            arrayList.set(arrayList.size() - 1, "");
        }
        int i3 = i;
        while (i3 < i2) {
            int iC = zkj.c(i3, i2, str, "/\\");
            boolean z = iC < i2;
            us8 us8Var = this;
            String str2 = str;
            us8Var.i(i3, iC, str2, z, true);
            if (z) {
                i3 = iC + 1;
                this = us8Var;
            } else {
                this = us8Var;
                i3 = iC;
            }
            str = str2;
        }
    }

    public void k() {
        ((bz7) this.d).invoke(new r1g(4, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us8.toString():java.lang.String");
    }

    public us8() {
        this.a = 0;
        this.d = "";
        this.e = "";
        this.b = -1;
        this.h = x44.a0("");
    }
}
