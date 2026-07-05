package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.nio.charset.CharacterCodingException;

/* JADX INFO: loaded from: classes.dex */
public class w3e extends y1 {
    public final n78 f;
    public final char[] g;
    public int h;
    public final mo0 i;

    public w3e(n78 n78Var, char[] cArr, rg9 rg9Var) throws CharacterCodingException {
        super(rg9Var);
        this.f = n78Var;
        this.g = cArr;
        this.h = FreeTypeConstants.FT_LOAD_PEDANTIC;
        this.i = new mo0(cArr);
        C(0);
    }

    public final void C(int i) throws CharacterCodingException {
        mo0 mo0Var = this.i;
        char[] cArr = mo0Var.E;
        if (i != 0) {
            int i2 = this.b;
            System.arraycopy(cArr, i2, cArr, 0, (i2 + i) - i2);
        }
        int i3 = mo0Var.F;
        while (true) {
            if (i == i3) {
                break;
            }
            n78 n78Var = this.f;
            n78Var.getClass();
            int iA = ((cj2) n78Var.F).a(cArr, i, i3 - i);
            if (iA == -1) {
                mo0Var.F = Math.min(mo0Var.E.length, i);
                this.h = -1;
                break;
            }
            i += iA;
        }
        this.b = 0;
    }

    public final void D() {
        gi2 gi2Var = gi2.c;
        gi2Var.getClass();
        char[] cArr = this.g;
        cArr.getClass();
        if (cArr.length == 16384) {
            gi2Var.b(cArr);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }

    @Override // defpackage.y1
    public final void b(int i, int i2) {
        this.e.append(this.i.E, i, i2 - i);
    }

    @Override // defpackage.y1
    public boolean c() throws CharacterCodingException {
        n();
        int i = this.b;
        while (true) {
            int iX = x(i);
            if (iX == -1) {
                this.b = iX;
                return false;
            }
            char c = this.i.E[iX];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.b = iX;
                return y1.t(c);
            }
            i = iX + 1;
        }
    }

    @Override // defpackage.y1
    public final String e() throws CharacterCodingException {
        h('\"');
        int i = this.b;
        mo0 mo0Var = this.i;
        int i2 = mo0Var.F;
        char[] cArr = mo0Var.E;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int iX = x(i);
            int i4 = this.b;
            if (iX != -1) {
                return k(i4, iX, mo0Var);
            }
            int i5 = i4 > 0 ? i4 - 1 : i4;
            y1.q(this, ij0.j("Expected quotation mark '\"', but had '", (i4 == mo0Var.F || i5 < 0) ? "EOF" : String.valueOf(mo0Var.E[i5]), "' instead"), i5, null, 4);
            throw null;
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return k(this.b, i6, mo0Var);
            }
        }
        this.b = i3 + 1;
        return isg.c0(cArr, i, Math.min(i3, mo0Var.F));
    }

    @Override // defpackage.y1
    public byte f() throws CharacterCodingException {
        n();
        int i = this.b;
        while (true) {
            int iX = x(i);
            if (iX == -1) {
                this.b = iX;
                return (byte) 10;
            }
            int i2 = iX + 1;
            byte bT = oq5.t(this.i.E[iX]);
            if (bT != 3) {
                this.b = i2;
                return bT;
            }
            i = i2;
        }
    }

    @Override // defpackage.y1
    public void h(char c) throws CharacterCodingException {
        n();
        int i = this.b;
        while (true) {
            int iX = x(i);
            if (iX == -1) {
                this.b = iX;
                B(c);
                throw null;
            }
            int i2 = iX + 1;
            char c2 = this.i.E[iX];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.b = i2;
                if (c2 == c) {
                    return;
                }
                B(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.y1
    public final void n() throws CharacterCodingException {
        int i = this.i.F - this.b;
        if (i > this.h) {
            return;
        }
        C(i);
    }

    @Override // defpackage.y1
    public final CharSequence s() {
        return this.i;
    }

    @Override // defpackage.y1
    public final String u(String str, boolean z) {
        str.getClass();
        return null;
    }

    @Override // defpackage.y1
    public final int x(int i) throws CharacterCodingException {
        mo0 mo0Var = this.i;
        if (i < mo0Var.F) {
            return i;
        }
        this.b = i;
        n();
        return (this.b != 0 || mo0Var.length() == 0) ? -1 : 0;
    }

    @Override // defpackage.y1
    public int y() throws CharacterCodingException {
        int iX;
        char c;
        int i = this.b;
        while (true) {
            iX = x(i);
            if (iX == -1 || !((c = this.i.E[iX]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = iX + 1;
        }
        this.b = iX;
        return iX;
    }

    @Override // defpackage.y1
    public final String z(int i, int i2) {
        mo0 mo0Var = this.i;
        return isg.c0(mo0Var.E, i, Math.min(i2, mo0Var.F));
    }
}
