package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class m31 implements Iterator {
    public final /* synthetic */ int E;
    public int F;
    public int G;
    public final /* synthetic */ Iterable H;

    public m31(wik wikVar) {
        this.E = 8;
        this.H = wikVar;
        this.F = 0;
        this.G = wikVar.g();
    }

    public byte a() {
        int i = this.E;
        Iterable iterable = this.H;
        switch (i) {
            case 4:
                int i2 = this.F;
                if (i2 >= this.G) {
                    pmf.d();
                } else {
                    this.F = i2 + 1;
                }
                break;
            case 5:
                int i3 = this.F;
                if (i3 >= this.G) {
                    pmf.d();
                } else {
                    this.F = i3 + 1;
                }
                break;
            default:
                try {
                    byte[] bArr = ((oba) iterable).F;
                    int i4 = this.F;
                    this.F = i4 + 1;
                } catch (ArrayIndexOutOfBoundsException e) {
                    pmf.h(e.getMessage());
                    return (byte) 0;
                }
                break;
        }
        return (byte) 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.E) {
            case 0:
                n31 n31Var = (n31) this.H;
                if (n31Var.E != this.F) {
                    throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
                }
                while (true) {
                    int i = this.G;
                    if (i < n31Var.E && n31.s(n31Var.F[i])) {
                        this.G++;
                    }
                }
                return this.G < n31Var.E;
            case 1:
                return this.F < this.G;
            case 2:
                return this.F < this.G;
            case 3:
                return this.F < this.G;
            case 4:
                return this.F < this.G;
            case 5:
                return this.F < this.G;
            case 6:
                return this.F < this.G;
            case 7:
                return this.F < this.G;
            case 8:
                return this.F < this.G;
            default:
                return this.F < this.G;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte bG;
        int i = this.E;
        Iterable iterable = this.H;
        switch (i) {
            case 0:
                n31 n31Var = (n31) iterable;
                int i2 = n31Var.E;
                if (i2 != this.F) {
                    throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
                }
                int i3 = this.G;
                if (i3 >= i2) {
                    pmf.d();
                    return null;
                }
                l31 l31Var = new l31(n31Var.F[i3], (String) n31Var.G[this.G], n31Var);
                this.G++;
                return l31Var;
            case 1:
                int i4 = this.F;
                if (i4 < this.G) {
                    this.F = i4 + 1;
                    return Byte.valueOf(((e22) iterable).h(i4));
                }
                pmf.d();
                return null;
            case 2:
                int i5 = this.F;
                if (i5 < this.G) {
                    this.F = i5 + 1;
                    return Byte.valueOf(((f22) iterable).h(i5));
                }
                pmf.d();
                return null;
            case 3:
                int i6 = this.F;
                if (i6 < this.G) {
                    this.F = i6 + 1;
                    return Byte.valueOf(((g22) iterable).l(i6));
                }
                pmf.d();
                return null;
            case 4:
                return Byte.valueOf(a());
            case 5:
                return Byte.valueOf(a());
            case 6:
                return Byte.valueOf(a());
            case 7:
                int i7 = this.F;
                if (i7 < this.G) {
                    this.F = i7 + 1;
                    return Byte.valueOf(((w9k) iterable).b(i7));
                }
                pmf.d();
                return null;
            case 8:
                int i8 = this.F;
                if (i8 < this.G) {
                    this.F = i8 + 1;
                    return Byte.valueOf(((wik) iterable).b(i8));
                }
                pmf.d();
                return null;
            default:
                int i9 = this.F;
                if (i9 < this.G) {
                    this.F = i9 + 1;
                    bG = ((suk) iterable).g(i9);
                } else {
                    pmf.d();
                    bG = 0;
                }
                return Byte.valueOf(bG);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                n31 n31Var = (n31) this.H;
                int i = this.G - 1;
                this.G = i;
                n31Var.u(i);
                this.F--;
                return;
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                throw new UnsupportedOperationException();
            case 8:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public m31(w9k w9kVar) {
        this.E = 7;
        this.H = w9kVar;
        this.F = 0;
        this.G = w9kVar.g();
    }

    public m31(suk sukVar) {
        this.E = 9;
        this.H = sukVar;
        this.F = 0;
        this.G = sukVar.h();
    }

    public m31(e22 e22Var) {
        this.E = 1;
        this.H = e22Var;
        this.F = 0;
        this.G = e22Var.size();
    }

    public m31(f22 f22Var) {
        this.E = 2;
        this.H = f22Var;
        this.F = 0;
        this.G = f22Var.size();
    }

    public m31(i22 i22Var) {
        this.E = 5;
        this.H = i22Var;
        this.F = 0;
        this.G = i22Var.size();
    }

    public m31(g22 g22Var) {
        this.E = 3;
        this.H = g22Var;
        this.F = 0;
        this.G = g22Var.size();
    }

    public m31(h22 h22Var) {
        this.E = 4;
        this.H = h22Var;
        this.F = 0;
        this.G = h22Var.size();
    }

    public m31(oba obaVar) {
        this.E = 6;
        this.H = obaVar;
        this.F = 0;
        this.G = obaVar.F.length;
    }

    public m31(n31 n31Var) {
        this.E = 0;
        this.H = n31Var;
        this.F = n31Var.E;
        this.G = 0;
    }
}
