package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p09 implements l25 {
    public Boolean a;
    public Integer b;
    public Integer c;
    public Integer d;

    public p09(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.a = bool;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.l25
    public final Object a() {
        return new p09(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p09)) {
            return false;
        }
        p09 p09Var = (p09) obj;
        return x44.r(this.a, p09Var.a) && x44.r(this.b, p09Var.b) && x44.r(this.c, p09Var.c) && x44.r(this.d, p09Var.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.b;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.c;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Boolean bool = this.a;
        sb.append(bool != null ? bool.booleanValue() ? "-" : "+" : " ");
        Object obj = this.b;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.d;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }
}
