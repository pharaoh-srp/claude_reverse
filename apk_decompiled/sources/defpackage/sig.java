package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class sig implements Iterator {
    public String F;
    public final CharSequence G;
    public final ki2 H;
    public final boolean I;
    public final /* synthetic */ xzd L;
    public int E = 2;
    public int J = 0;
    public int K = Integer.MAX_VALUE;

    public sig(xzd xzdVar, m11 m11Var, CharSequence charSequence) {
        this.L = xzdVar;
        this.H = (ki2) m11Var.F;
        this.I = m11Var.E;
        this.G = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int length;
        String string;
        CharSequence charSequence;
        ki2 ki2Var;
        fd9.M(this.E != 4);
        int iF = sq6.F(this.E);
        if (iF == 0) {
            return true;
        }
        if (iF != 2) {
            this.E = 4;
            int i = this.J;
            while (true) {
                length = this.J;
                if (length == -1) {
                    this.E = 3;
                    string = null;
                    break;
                }
                li2 li2Var = (li2) this.L.F;
                charSequence = this.G;
                int length2 = charSequence.length();
                fd9.J(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (li2Var.a(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = charSequence.length();
                    this.J = -1;
                } else {
                    this.J = length + 1;
                }
                int i2 = this.J;
                if (i2 == i) {
                    int i3 = i2 + 1;
                    this.J = i3;
                    if (i3 > charSequence.length()) {
                        this.J = -1;
                    }
                } else {
                    while (true) {
                        ki2Var = this.H;
                        if (i >= length || !ki2Var.a(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (length > i && ki2Var.a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                    if (!this.I || i != length) {
                        break;
                    }
                    i = this.J;
                }
            }
            int i4 = this.K;
            if (i4 == 1) {
                length = charSequence.length();
                this.J = -1;
                while (length > i && ki2Var.a(charSequence.charAt(length - 1))) {
                    length--;
                }
            } else {
                this.K = i4 - 1;
            }
            string = charSequence.subSequence(i, length).toString();
            this.F = string;
            if (this.E != 3) {
                this.E = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        this.E = 2;
        String str = this.F;
        this.F = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
