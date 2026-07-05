package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t6f {
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;

    public t6f(List list) {
        this.e = new xeg("", null);
        this.c = 0;
        this.d = list;
        this.a = 0;
        this.b = 0;
        if (list.isEmpty()) {
            return;
        }
        a(0, 0);
        xeg xegVar = (xeg) list.get(0);
        this.e = xegVar;
        this.c = xegVar.a.length();
    }

    public static t6f m(d80 d80Var) {
        return new t6f(d80Var.F);
    }

    public void a(int i, int i2) {
        List list = (List) this.d;
        if (i < 0 || i >= list.size()) {
            poc.j(list.size(), vb7.u("Line index ", i, " out of range, number of lines: "));
            return;
        }
        xeg xegVar = (xeg) list.get(i);
        if (i2 < 0 || i2 > xegVar.a.length()) {
            poc.j(xegVar.a.length(), vb7.u("Index ", i2, " out of range, line length: "));
        }
    }

    public int b(char c) {
        int i = 0;
        while (true) {
            char cN = n();
            if (cN == 0) {
                return -1;
            }
            if (cN == c) {
                return i;
            }
            i++;
            j();
        }
    }

    public int c(efe efeVar) {
        int i = 0;
        while (true) {
            char cN = n();
            if (cN == 0) {
                return -1;
            }
            if (((BitSet) efeVar.F).get(cN)) {
                return i;
            }
            i++;
            j();
        }
    }

    public void d() {
        int i = this.c;
        this.c = i == Integer.MIN_VALUE ? this.a : i + this.b;
        this.e = ((String) this.d) + this.c;
    }

    public d80 e(l42 l42Var, l42 l42Var2) {
        List list = (List) this.d;
        int i = l42Var.b;
        int i2 = l42Var.c;
        int i3 = l42Var2.b;
        int i4 = l42Var2.c;
        if (i == i3) {
            xeg xegVar = (xeg) list.get(i);
            CharSequence charSequenceSubSequence = xegVar.a.subSequence(i2, i4);
            cfg cfgVar = xegVar.b;
            xeg xegVar2 = new xeg(charSequenceSubSequence, cfgVar != null ? new cfg(cfgVar.a, cfgVar.b + i2, charSequenceSubSequence.length()) : null);
            d80 d80Var = new d80(5);
            d80Var.F.add(xegVar2);
            return d80Var;
        }
        d80 d80Var2 = new d80(5);
        ArrayList arrayList = d80Var2.F;
        xeg xegVar3 = (xeg) list.get(i);
        arrayList.add(xegVar3.c(i2, xegVar3.a.length()));
        while (true) {
            i++;
            if (i >= i3) {
                arrayList.add(((xeg) list.get(i3)).c(0, i4));
                return d80Var2;
            }
            arrayList.add((xeg) list.get(i));
        }
    }

    public boolean f() {
        return this.b < this.c || this.a < ((List) this.d).size() - 1;
    }

    public int g(efe efeVar) {
        int i = 0;
        while (((BitSet) efeVar.F).get(n())) {
            i++;
            j();
        }
        return i;
    }

    public int h(char c) {
        int i = 0;
        while (n() == c) {
            i++;
            j();
        }
        return i;
    }

    public void i() {
        if (this.c != Integer.MIN_VALUE) {
            return;
        }
        sz6.j("generateNewId() must be called before retrieving ids.");
    }

    public void j() {
        List list = (List) this.d;
        int i = this.b + 1;
        this.b = i;
        if (i > this.c) {
            int i2 = this.a + 1;
            this.a = i2;
            if (i2 < list.size()) {
                xeg xegVar = (xeg) list.get(this.a);
                this.e = xegVar;
                this.c = xegVar.a.length();
            } else {
                this.e = new xeg("", null);
                this.c = "".length();
            }
            this.b = 0;
        }
    }

    public boolean k(char c) {
        if (n() != c) {
            return false;
        }
        j();
        return true;
    }

    public boolean l(String str) {
        int i = this.b;
        if (i < this.c && str.length() + i <= this.c) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (((xeg) this.e).a.charAt(this.b + i2) == str.charAt(i2)) {
                }
            }
            this.b = str.length() + this.b;
            return true;
        }
        return false;
    }

    public char n() {
        int i = this.b;
        return i < this.c ? ((xeg) this.e).a.charAt(i) : this.a < ((List) this.d).size() + (-1) ? '\n' : (char) 0;
    }

    public int o() {
        int i = this.b;
        if (i >= this.c) {
            return this.a < ((List) this.d).size() + (-1) ? 10 : 0;
        }
        char cCharAt = ((xeg) this.e).a.charAt(i);
        if (Character.isHighSurrogate(cCharAt)) {
            int i2 = this.b;
            if (i2 + 1 < this.c) {
                char cCharAt2 = ((xeg) this.e).a.charAt(i2 + 1);
                if (Character.isLowSurrogate(cCharAt2)) {
                    return Character.toCodePoint(cCharAt, cCharAt2);
                }
            }
        }
        return cCharAt;
    }

    public int p() {
        int i = this.b;
        if (i <= 0) {
            return this.a > 0 ? 10 : 0;
        }
        int i2 = i - 1;
        char cCharAt = ((xeg) this.e).a.charAt(i2);
        if (Character.isLowSurrogate(cCharAt) && i2 > 0) {
            char cCharAt2 = ((xeg) this.e).a.charAt(i - 2);
            if (Character.isHighSurrogate(cCharAt2)) {
                return Character.toCodePoint(cCharAt2, cCharAt);
            }
        }
        return cCharAt;
    }

    public l42 q() {
        return new l42(this.a, this.b, 3);
    }

    public void r(l42 l42Var) {
        int i = l42Var.b;
        int i2 = l42Var.c;
        a(i, i2);
        int i3 = l42Var.b;
        this.a = i3;
        this.b = i2;
        xeg xegVar = (xeg) ((List) this.d).get(i3);
        this.e = xegVar;
        this.c = xegVar.a.length();
    }

    public int s() {
        int i = 0;
        while (true) {
            char cN = n();
            if (cN != ' ') {
                switch (cN) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i;
                }
            }
            i++;
            j();
        }
    }

    public t6f(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public t6f(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.d = str;
        this.a = i2;
        this.b = i3;
        this.c = Integer.MIN_VALUE;
        this.e = "";
    }
}
