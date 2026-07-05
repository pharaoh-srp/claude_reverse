package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ol2 {
    public final vl2 a;
    public final vl2 b;
    public final nl2 c;
    public final Long d;
    public final String e;
    public final List f;

    public ol2(vl2 vl2Var, vl2 vl2Var2, nl2 nl2Var, Long l, String str, List list) {
        this.a = vl2Var;
        this.b = vl2Var2;
        this.c = nl2Var;
        this.d = l;
        this.e = str;
        this.f = list;
    }

    public static ol2 a(ol2 ol2Var, vl2 vl2Var, Long l, String str, List list, int i) {
        if ((i & 1) != 0) {
            vl2Var = ol2Var.a;
        }
        vl2 vl2Var2 = vl2Var;
        vl2 vl2Var3 = ol2Var.b;
        nl2 nl2Var = ol2Var.c;
        if ((i & 8) != 0) {
            l = ol2Var.d;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            str = ol2Var.e;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            list = ol2Var.f;
        }
        List list2 = list;
        ol2Var.getClass();
        vl2Var2.getClass();
        vl2Var3.getClass();
        nl2Var.getClass();
        list2.getClass();
        return new ol2(vl2Var2, vl2Var3, nl2Var, l2, str2, list2);
    }

    public final String b() {
        return this.e;
    }

    public final vl2 c() {
        return this.a;
    }

    public final nl2 d() {
        return this.c;
    }

    public final Long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol2)) {
            return false;
        }
        ol2 ol2Var = (ol2) obj;
        return x44.r(this.a, ol2Var.a) && x44.r(this.b, ol2Var.b) && x44.r(this.c, ol2Var.c) && x44.r(this.d, ol2Var.d) && x44.r(this.e, ol2Var.e) && x44.r(this.f, ol2Var.f);
    }

    public final vl2 f() {
        return this.b;
    }

    public final List g() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Long l = this.d;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CompletionResponseState(attempt=" + this.a + ", jankWindow=" + this.b + ", context=" + this.c + ", firstTokenTime=" + this.d + ", assistantMessageUuid=" + this.e + ", latestContentBlocks=" + this.f + ")";
    }

    public /* synthetic */ ol2(vl2 vl2Var, nl2 nl2Var) {
        this(vl2Var, vl2Var, nl2Var, null, null, lm6.E);
    }
}
