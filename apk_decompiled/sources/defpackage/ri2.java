package defpackage;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ri2 implements CharacterIterator {
    public final CharSequence E;
    public final int F;
    public int G = 0;

    public ri2(int i, CharSequence charSequence) {
        this.E = charSequence;
        this.F = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.G;
        if (i == this.F) {
            return (char) 65535;
        }
        return this.E.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.G = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.F;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.G;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.F;
        if (i == 0) {
            this.G = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.G = i2;
        return this.E.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.G + 1;
        this.G = i;
        int i2 = this.F;
        if (i < i2) {
            return this.E.charAt(i);
        }
        this.G = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.G;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.G = i2;
        return this.E.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.F || i < 0) {
            sz6.p("invalid position");
            return (char) 0;
        }
        this.G = i;
        return current();
    }
}
