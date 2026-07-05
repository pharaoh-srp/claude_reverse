package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c5c implements Cloneable {
    public static final List G = Collections.EMPTY_LIST;
    public yj6 E;
    public int F;

    public abstract String A();

    public abstract String B();

    public String C() {
        return A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [lrb] */
    /* JADX WARN: Type inference failed for: r4v3, types: [y5c] */
    /* JADX WARN: Type inference failed for: r4v4, types: [lrb, zfd] */
    public String D() {
        ?? lrbVar;
        StringBuilder sbB = xrg.b();
        gjk gjkVarM = gjk.m(sbB);
        o96 o96VarF = F();
        if (o96VarF == null) {
            o96VarF = new o96("", 0);
        }
        n96 n96Var = o96VarF.N;
        n96Var.getClass();
        int i = 7;
        if (n96Var.G) {
            lrbVar = new zfd(this, gjkVarM, n96Var, i);
            lrbVar.J = false;
            c5c c5cVar = this;
            while (true) {
                if (c5cVar != null) {
                    if ((c5cVar instanceof yj6) && ((yj6) c5cVar).H.b(64)) {
                        lrbVar.J = true;
                        break;
                    }
                    c5cVar = c5cVar.E;
                } else {
                    break;
                }
            }
        } else {
            lrbVar = new lrb(this, gjkVarM, n96Var, i);
        }
        lrbVar.j(this);
        return xrg.k(sbB);
    }

    public abstract void E(gjk gjkVar, n96 n96Var);

    public final o96 F() {
        while (this != null) {
            if (this instanceof o96) {
                return (o96) this;
            }
            this = this.E;
        }
        return null;
    }

    public abstract yj6 G();

    public final c5c I() {
        if (this.E == null || N() <= 0) {
            return null;
        }
        return (c5c) ((ArrayList) this.E.s()).get(this.F - 1);
    }

    public final void J() {
        yj6 yj6Var = this.E;
        if (yj6Var != null) {
            yj6Var.L(this);
        }
    }

    public void L(c5c c5cVar) {
        pqi.m(c5cVar.E == this);
        yj6 yj6Var = (yj6) this;
        if (yj6Var.I.E) {
            ((ArrayList) s()).remove(c5cVar.F);
        } else {
            ((ArrayList) s()).remove(c5cVar);
        }
        yj6Var.I.E = false;
        c5cVar.E = null;
    }

    public final void M(yj6 yj6Var) {
        pqi.p(yj6Var);
        if (this.E == null) {
            this.E = yj6Var.E;
        }
        pqi.p(this.E);
        yj6 yj6Var2 = this.E;
        yj6Var2.getClass();
        pqi.m(this.E == yj6Var2);
        if (this == yj6Var) {
            return;
        }
        yj6 yj6Var3 = yj6Var.E;
        if (yj6Var3 != null) {
            yj6Var3.L(yj6Var);
        }
        int iN = N();
        ((ArrayList) yj6Var2.s()).set(iN, yj6Var);
        yj6Var.E = yj6Var2;
        yj6Var.F = iN;
        this.E = null;
        yj6Var2.I.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int N() {
        xj6 xj6Var;
        yj6 yj6Var = this.E;
        if (yj6Var != null) {
            xj6 xj6Var2 = yj6Var.I;
            if (!xj6Var2.E) {
                int size = xj6Var2.size();
                int i = 0;
                while (true) {
                    xj6Var = yj6Var.I;
                    if (i >= size) {
                        break;
                    }
                    ((c5c) xj6Var.get(i)).F = i;
                    i++;
                }
                xj6Var.E = true;
            }
        }
        return this.F;
    }

    public String a(String str) {
        pqi.n(str);
        if (!v() || k().r(str) == -1) {
            return "";
        }
        String strL = l();
        String strM = k().m(str);
        Pattern pattern = xrg.d;
        String strReplaceAll = pattern.matcher(strL).replaceAll("");
        String strReplaceAll2 = pattern.matcher(strM).replaceAll("");
        try {
            try {
                return xrg.l(new URL(strReplaceAll), strReplaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strReplaceAll2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return xrg.c.matcher(strReplaceAll2).find() ? strReplaceAll2 : "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, c5c... c5cVarArr) {
        xj6 xj6Var;
        pqi.p(c5cVarArr);
        if (c5cVarArr.length == 0) {
            return;
        }
        List listS = s();
        yj6 yj6VarG = c5cVarArr[0].G();
        if (yj6VarG != null && yj6VarG.I.size() == c5cVarArr.length) {
            List listS2 = yj6VarG.s();
            int length = c5cVarArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    int size = yj6VarG.I.size();
                    int i3 = 0;
                    while (true) {
                        xj6Var = yj6VarG.I;
                        if (i3 >= size) {
                            break;
                        }
                        ((c5c) xj6Var.get(i3)).E = null;
                        i3++;
                    }
                    xj6Var.clear();
                    listS.addAll(i, Arrays.asList(c5cVarArr));
                    int length2 = c5cVarArr.length;
                    while (true) {
                        int i4 = length2 - 1;
                        if (length2 <= 0) {
                            ((yj6) this).I.E = false;
                            return;
                        } else {
                            c5cVarArr[i4].E = (yj6) this;
                            length2 = i4;
                        }
                    }
                } else if (c5cVarArr[i2] != ((ArrayList) listS2).get(i2)) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        for (c5c c5cVar : c5cVarArr) {
            if (c5cVar == null) {
                throw new ValidationException("Array must not contain any null objects");
            }
        }
        for (c5c c5cVar2 : c5cVarArr) {
            c5cVar2.getClass();
            yj6 yj6Var = c5cVar2.E;
            if (yj6Var != null) {
                yj6Var.L(c5cVar2);
            }
            c5cVar2.E = (yj6) this;
        }
        listS.addAll(i, Arrays.asList(c5cVarArr));
        ((yj6) this).I.E = false;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public String g(String str) {
        pqi.p(str);
        if (!v()) {
            return "";
        }
        String strM = k().m(str);
        return strM.length() > 0 ? strM : str.startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public void h(String str, String str2) {
        o96 o96VarF = F();
        wsc wscVar = o96VarF != null ? o96VarF.O.G : wsc.c;
        wscVar.getClass();
        String strTrim = str.trim();
        if (!wscVar.b) {
            strTrim = ouk.g(strTrim);
        }
        n31 n31VarK = k();
        int iR = n31VarK.r(strTrim);
        if (iR == -1) {
            n31VarK.b(strTrim, str2);
            return;
        }
        n31VarK.G[iR] = str2;
        if (n31VarK.F[iR].equals(strTrim)) {
            return;
        }
        n31VarK.F[iR] = strTrim;
    }

    public abstract n31 k();

    public abstract String l();

    public final c5c m(int i) {
        return (c5c) s().get(i);
    }

    public abstract int o();

    public final List p() {
        if (o() == 0) {
            return G;
        }
        List listS = s();
        ArrayList arrayList = new ArrayList(listS.size());
        arrayList.addAll(listS);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public c5c clone() {
        c5c c5cVarR = r(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(c5cVarR);
        while (!linkedList.isEmpty()) {
            c5c c5cVar = (c5c) linkedList.remove();
            int iO = c5cVar.o();
            for (int i = 0; i < iO; i++) {
                List listS = c5cVar.s();
                c5c c5cVarR2 = ((c5c) listS.get(i)).r(c5cVar);
                listS.set(i, c5cVarR2);
                linkedList.add(c5cVarR2);
            }
        }
        return c5cVarR;
    }

    public c5c r(c5c c5cVar) {
        o96 o96VarF;
        try {
            c5c c5cVar2 = (c5c) super.clone();
            c5cVar2.E = (yj6) c5cVar;
            c5cVar2.F = c5cVar == null ? 0 : N();
            if (c5cVar == null && !(this instanceof o96) && (o96VarF = F()) != null) {
                o96 o96VarO0 = o96VarF.j0();
                c5cVar2.E = o96VarO0;
                ((ArrayList) o96VarO0.s()).add(c5cVar2);
            }
            return c5cVar2;
        } catch (CloneNotSupportedException e) {
            xh6.h(e);
            return null;
        }
    }

    public abstract List s();

    public final c5c t() {
        if (o() == 0) {
            return null;
        }
        return (c5c) s().get(0);
    }

    public String toString() {
        return D();
    }

    public final boolean u(String str) {
        pqi.p(str);
        if (!v()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (k().r(strSubstring) != -1 && !a(strSubstring).isEmpty()) {
                return true;
            }
        }
        return k().r(str) != -1;
    }

    public abstract boolean v();

    public final boolean w(String str) {
        return C().equals(str);
    }

    public final yj6 y() {
        do {
            this = this.z();
            if (this == null) {
                return null;
            }
        } while (!(this instanceof yj6));
        return (yj6) this;
    }

    public final c5c z() {
        yj6 yj6Var = this.E;
        if (yj6Var == null) {
            return null;
        }
        List listS = yj6Var.s();
        int iN = N() + 1;
        ArrayList arrayList = (ArrayList) listS;
        if (arrayList.size() > iN) {
            return (c5c) arrayList.get(iN);
        }
        return null;
    }
}
