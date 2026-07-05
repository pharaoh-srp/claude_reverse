package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q09 implements ejj, l25 {
    public Integer a;
    public Integer b;

    public q09(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    @Override // defpackage.l25
    public final Object a() {
        return new q09(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q09)) {
            return false;
        }
        q09 q09Var = (q09) obj;
        return x44.r(this.a, q09Var.a) && x44.r(this.b, q09Var.b);
    }

    @Override // defpackage.ejj
    public final void f(Integer num) {
        this.b = num;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // defpackage.ejj
    public final Integer i() {
        return this.a;
    }

    @Override // defpackage.ejj
    public final void r(Integer num) {
        this.a = num;
    }

    @Override // defpackage.ejj
    public final Integer s() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append('-');
        Integer num = this.b;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }
}
