package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ud7 {
    public final Integer a;
    public final String b;
    public final String c;

    public ud7(String str, Integer num, String str2) {
        this.a = num;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud7)) {
            return false;
        }
        ud7 ud7Var = (ud7) obj;
        return x44.r(this.a, ud7Var.a) && this.b.equals(ud7Var.b) && x44.r(this.c, ud7Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iL = kgh.l((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return iL + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtraUsageUiModel(percent=");
        sb.append(this.a);
        sb.append(", usedFormatted=");
        sb.append(this.b);
        sb.append(", limitFormatted=");
        return ij0.m(sb, this.c, ")");
    }
}
