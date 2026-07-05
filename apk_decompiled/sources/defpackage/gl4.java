package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gl4 implements c6c {
    public final String a;

    public gl4(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.kw7
    public final af4 a() {
        this.a.getClass();
        return new af4();
    }

    @Override // defpackage.kw7
    public final auc b() {
        List listV;
        String strSubstring;
        String strSubstring2 = this.a;
        int length = strSubstring2.length();
        lm6 lm6Var = lm6.E;
        if (length == 0) {
            listV = lm6Var;
        } else {
            d8a d8aVarE = x44.E();
            String strSubstring3 = "";
            if (otj.k(strSubstring2.charAt(0))) {
                int length2 = strSubstring2.length();
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        strSubstring = strSubstring2;
                        break;
                    }
                    if (!otj.k(strSubstring2.charAt(i))) {
                        strSubstring = strSubstring2.substring(0, i);
                        break;
                    }
                    i++;
                }
                d8aVarE.add(new bac(x44.W(new hl4(strSubstring))));
                int length3 = strSubstring2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        strSubstring2 = "";
                        break;
                    }
                    if (!otj.k(strSubstring2.charAt(i2))) {
                        strSubstring2 = strSubstring2.substring(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (strSubstring2.length() > 0) {
                if (otj.k(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    int length4 = strSubstring2.length();
                    while (true) {
                        length4--;
                        if (-1 >= length4) {
                            break;
                        }
                        if (!otj.k(strSubstring2.charAt(length4))) {
                            strSubstring3 = strSubstring2.substring(0, length4 + 1);
                            break;
                        }
                    }
                    d8aVarE.add(new h4d(strSubstring3));
                    int length5 = strSubstring2.length() - 1;
                    while (true) {
                        if (-1 >= length5) {
                            break;
                        }
                        if (!otj.k(strSubstring2.charAt(length5))) {
                            strSubstring2 = strSubstring2.substring(length5 + 1);
                            break;
                        }
                        length5--;
                    }
                    d8aVarE.add(new bac(x44.W(new hl4(strSubstring2))));
                } else {
                    d8aVarE.add(new h4d(strSubstring2));
                }
            }
            listV = x44.v(d8aVarE);
        }
        return new auc(listV, lm6Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gl4) {
            return x44.r(this.a, ((gl4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vb7.s(new StringBuilder("ConstantFormatStructure("), this.a, ')');
    }
}
