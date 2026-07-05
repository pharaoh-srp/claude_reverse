package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pla {
    public final String a;
    public final Number b;
    public final int c;
    public final long d;
    public final Long e;
    public final Number f;
    public final Number g;
    public final Number h;
    public final Boolean i;
    public final List j;

    public pla(String str, Number number, int i, long j, Long l, Number number2, Number number3, Number number4, Boolean bool, ArrayList arrayList) {
        this.a = str;
        this.b = number;
        this.c = i;
        this.d = j;
        this.e = l;
        this.f = number2;
        this.g = number3;
        this.h = number4;
        this.i = bool;
        this.j = arrayList;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        String str = this.a;
        if (str != null) {
            qh9Var.r("id", str);
        }
        Number number = this.b;
        if (number != null) {
            qh9Var.p(number, "start_time");
        }
        int i = this.c;
        if (i != 0) {
            qh9Var.o("entry_type", new vh9(y6a.e(i)));
        }
        qh9Var.p(Long.valueOf(this.d), "duration");
        Long l = this.e;
        if (l != null) {
            grc.A(l, qh9Var, "blocking_duration");
        }
        Number number2 = this.f;
        if (number2 != null) {
            qh9Var.p(number2, "render_start");
        }
        Number number3 = this.g;
        if (number3 != null) {
            qh9Var.p(number3, "style_and_layout_start");
        }
        Number number4 = this.h;
        if (number4 != null) {
            qh9Var.p(number4, "first_ui_event_timestamp");
        }
        Boolean bool = this.i;
        if (bool != null) {
            qh9Var.q("is_frozen_frame", bool);
        }
        List<vla> list = this.j;
        if (list != null) {
            ig9 ig9Var = new ig9(list.size());
            for (vla vlaVar : list) {
                vlaVar.getClass();
                qh9 qh9Var2 = new qh9();
                Long l2 = vlaVar.a;
                if (l2 != null) {
                    grc.A(l2, qh9Var2, "duration");
                }
                Long l3 = vlaVar.b;
                if (l3 != null) {
                    grc.A(l3, qh9Var2, "pause_duration");
                }
                Long l4 = vlaVar.c;
                if (l4 != null) {
                    grc.A(l4, qh9Var2, "forced_style_and_layout_duration");
                }
                Number number5 = vlaVar.d;
                if (number5 != null) {
                    qh9Var2.p(number5, "start_time");
                }
                Number number6 = vlaVar.e;
                if (number6 != null) {
                    qh9Var2.p(number6, "execution_start");
                }
                String str2 = vlaVar.f;
                if (str2 != null) {
                    qh9Var2.r("source_url", str2);
                }
                String str3 = vlaVar.g;
                if (str3 != null) {
                    qh9Var2.r("source_function_name", str3);
                }
                Long l5 = vlaVar.h;
                if (l5 != null) {
                    grc.A(l5, qh9Var2, "source_char_position");
                }
                String str4 = vlaVar.i;
                if (str4 != null) {
                    qh9Var2.r("invoker", str4);
                }
                int i2 = vlaVar.j;
                if (i2 != 0) {
                    qh9Var2.o("invoker_type", new vh9(y6a.g(i2)));
                }
                String str5 = vlaVar.k;
                if (str5 != null) {
                    qh9Var2.r("window_attribution", str5);
                }
                ig9Var.o(qh9Var2);
            }
            qh9Var.o("scripts", ig9Var);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pla)) {
            return false;
        }
        pla plaVar = (pla) obj;
        return x44.r(this.a, plaVar.a) && x44.r(this.b, plaVar.b) && this.c == plaVar.c && this.d == plaVar.d && x44.r(this.e, plaVar.e) && x44.r(this.f, plaVar.f) && x44.r(this.g, plaVar.g) && x44.r(this.h, plaVar.h) && x44.r(this.i, plaVar.i) && x44.r(this.j, plaVar.j);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Number number = this.b;
        int iHashCode2 = (iHashCode + (number == null ? 0 : number.hashCode())) * 31;
        int i = this.c;
        int iE = vb7.e((iHashCode2 + (i == 0 ? 0 : sq6.F(i))) * 31, 31, this.d);
        Long l = this.e;
        int iHashCode3 = (iE + (l == null ? 0 : l.hashCode())) * 31;
        Number number2 = this.f;
        int iHashCode4 = (iHashCode3 + (number2 == null ? 0 : number2.hashCode())) * 31;
        Number number3 = this.g;
        int iHashCode5 = (iHashCode4 + (number3 == null ? 0 : number3.hashCode())) * 31;
        Number number4 = this.h;
        int iHashCode6 = (iHashCode5 + (number4 == null ? 0 : number4.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.j;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongTask(id=");
        sb.append(this.a);
        sb.append(", startTime=");
        sb.append(this.b);
        sb.append(", entryType=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "LONG_ANIMATION_FRAME" : "LONG_TASK");
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", blockingDuration=");
        sb.append(this.e);
        sb.append(", renderStart=");
        sb.append(this.f);
        sb.append(", styleAndLayoutStart=");
        sb.append(this.g);
        sb.append(", firstUiEventTimestamp=");
        sb.append(this.h);
        sb.append(", isFrozenFrame=");
        sb.append(this.i);
        sb.append(", scripts=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
