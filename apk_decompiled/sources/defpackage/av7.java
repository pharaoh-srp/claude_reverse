package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class av7 implements yu7 {
    public final int a;

    public av7(int i) {
        this.a = i;
    }

    @Override // defpackage.yu7
    public final float a() {
        return this.a;
    }

    @Override // defpackage.yu7
    public final String b() {
        return "wght";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof av7) && this.a == ((av7) obj).a;
    }

    public final int hashCode() {
        return 113071012 + this.a;
    }

    public final String toString() {
        return vb7.r(new StringBuilder("FontVariation.Setting(axisName='wght', value="), this.a, ')');
    }
}
