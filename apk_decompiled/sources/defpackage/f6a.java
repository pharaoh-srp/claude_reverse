package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f6a implements tu7 {
    public final float a;

    public f6a(float f) {
        this.a = f;
    }

    @Override // defpackage.tu7
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.tu7
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6a) && Float.compare(this.a, ((f6a) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ebh.o(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
