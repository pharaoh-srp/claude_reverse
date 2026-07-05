package defpackage;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalTime;

/* JADX INFO: loaded from: classes3.dex */
public final class m09 implements oph, l25 {
    public Integer a;
    public Integer b;
    public qw c;
    public Integer d;
    public Integer e;
    public Integer f;

    public m09(Integer num, Integer num2, qw qwVar, Integer num3, Integer num4, Integer num5) {
        this.a = num;
        this.b = num2;
        this.c = qwVar;
        this.d = num3;
        this.e = num4;
        this.f = num5;
    }

    @Override // defpackage.l25
    public final Object a() {
        return new m09(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.oph
    public final qw c() {
        return this.c;
    }

    @Override // defpackage.oph
    public final void d(Integer num) {
        this.b = num;
    }

    @Override // defpackage.oph
    public final void e(Integer num) {
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m09)) {
            return false;
        }
        m09 m09Var = (m09) obj;
        return x44.r(this.a, m09Var.a) && x44.r(this.b, m09Var.b) && this.c == m09Var.c && x44.r(this.d, m09Var.d) && x44.r(this.e, m09Var.e) && x44.r(this.f, m09Var.f);
    }

    public final LocalTime f() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.a;
        Integer num2 = this.b;
        qw qwVar = qw.E;
        Integer numValueOf = null;
        if (num != null) {
            iIntValue = num.intValue();
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                mr9.q(grc.o(iIntValue, iIntValue2, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is "));
                return null;
            }
            qw qwVar2 = this.c;
            if (qwVar2 != null) {
                if ((qwVar2 == qwVar) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + qwVar2).toString());
                }
            }
        } else {
            if (num2 != null) {
                int iIntValue3 = num2.intValue();
                qw qwVar3 = this.c;
                if (qwVar3 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (qwVar3 != qwVar ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new DateTimeFormatException("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num3 = this.d;
        kjj.a("minute", num3);
        int iIntValue4 = num3.intValue();
        Integer num4 = this.e;
        int iIntValue5 = num4 != null ? num4.intValue() : 0;
        Integer num5 = this.f;
        return new LocalTime(iIntValue, iIntValue4, iIntValue5, num5 != null ? num5.intValue() : 0);
    }

    @Override // defpackage.oph
    public final Integer g() {
        return this.d;
    }

    @Override // defpackage.oph
    public final void h(Integer num) {
        this.d = num;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        qw qwVar = this.c;
        int iHashCode = ((qwVar != null ? qwVar.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // defpackage.oph
    public final Integer l() {
        return this.f;
    }

    @Override // defpackage.oph
    public final Integer m() {
        return this.b;
    }

    @Override // defpackage.oph
    public final void p(qw qwVar) {
        this.c = qwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Integer r1 = r4.a
            java.lang.String r2 = "??"
            if (r1 != 0) goto Lc
            r1 = r2
        Lc:
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            java.lang.Integer r3 = r4.d
            if (r3 != 0) goto L19
            r3 = r2
        L19:
            r0.append(r3)
            r0.append(r1)
            java.lang.Integer r1 = r4.e
            if (r1 != 0) goto L24
            goto L25
        L24:
            r2 = r1
        L25:
            r0.append(r2)
            r1 = 46
            r0.append(r1)
            java.lang.Integer r4 = r4.f
            if (r4 == 0) goto L45
            int r4 = r4.intValue()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            int r1 = 9 - r1
            java.lang.String r4 = defpackage.bsg.O0(r1, r4)
            if (r4 != 0) goto L47
        L45:
            java.lang.String r4 = "???"
        L47:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m09.toString():java.lang.String");
    }

    @Override // defpackage.oph
    public final void u(Integer num) {
        this.a = num;
    }

    @Override // defpackage.oph
    public final Integer v() {
        return this.a;
    }

    @Override // defpackage.oph
    public final Integer w() {
        return this.e;
    }

    @Override // defpackage.oph
    public final void x(Integer num) {
        this.e = num;
    }

    public /* synthetic */ m09() {
        this(null, null, null, null, null, null);
    }
}
