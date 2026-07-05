package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class qi2 implements hq3, Iterable, mm9 {
    public final char E;
    public final char F;
    public final int G;

    static {
        new qi2((char) 1, (char) 0);
    }

    public qi2(char c, char c2) {
        this.E = c;
        this.F = (char) iv1.x(c, c2, 1);
        this.G = 1;
    }

    @Override // defpackage.hq3
    public final Comparable e() {
        return Character.valueOf(this.E);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qi2)) {
            return false;
        }
        char c = this.E;
        char c2 = this.F;
        if (c > c2) {
            qi2 qi2Var = (qi2) obj;
            if (qi2Var.E > qi2Var.F) {
                return true;
            }
        }
        qi2 qi2Var2 = (qi2) obj;
        return c == qi2Var2.E && c2 == qi2Var2.F;
    }

    @Override // defpackage.hq3
    public final Comparable g() {
        return Character.valueOf(this.F);
    }

    public final boolean h(char c) {
        return this.E <= c && c <= this.F;
    }

    public final int hashCode() {
        char c = this.E;
        char c2 = this.F;
        if (c > c2) {
            return -1;
        }
        return (c * 31) + c2;
    }

    @Override // defpackage.hq3
    public final boolean isEmpty() {
        return this.E > this.F;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new pi2(this.E, this.F, this.G);
    }

    public final String toString() {
        return this.E + ".." + this.F;
    }

    public qi2() {
        this('a', 'z');
    }
}
