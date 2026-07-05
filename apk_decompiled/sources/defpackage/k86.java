package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k86 implements c29 {
    public final Number a;

    public k86(Float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k86) && x44.r(this.a, ((k86) obj).a);
    }

    public final int hashCode() {
        Number number = this.a;
        if (number == null) {
            return 0;
        }
        return number.hashCode();
    }

    public final String toString() {
        return "DisplayInfo(screenBrightness=" + this.a + ")";
    }
}
