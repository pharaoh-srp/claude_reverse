package defpackage;

import java.time.Instant;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class l67 {
    public static final Set e = mp0.Z0(new Integer[]{10, 36, 0});
    public static final Set f = mp0.Z0(new Integer[]{38, 39, 44, 54, 0});
    public static final Map g;
    public final Instant a;
    public final Instant b;
    public final int c;
    public final int d;

    static {
        Set setZ0 = mp0.Z0(new Integer[]{1, 2, 3, 4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 25, 26, 28, 27, 29, 30, 31, 32, 33, 34, 35, 36, 37, 41, 42, 43, 48, 49, 50, 51, 63, 65});
        Set setZ02 = mp0.Z0(new Integer[]{55, 56, 58, 57, 59, 61});
        cpc cpcVar = new cpc(8, sf5.f0(7));
        cpc cpcVar2 = new cpc(9, sf5.f0(8));
        cpc cpcVar3 = new cpc(13, setZ0);
        cpc cpcVar4 = new cpc(25, sf5.f0(21));
        cpc cpcVar5 = new cpc(26, mp0.Z0(new Integer[]{67, 8, 40, 24}));
        cpc cpcVar6 = new cpc(34, setZ0);
        cpc cpcVar7 = new cpc(37, mp0.Z0(new Integer[]{64, 66}));
        cpc cpcVar8 = new cpc(48, sf5.f0(40));
        cpc cpcVar9 = new cpc(54, sf5.f0(45));
        cpc cpcVar10 = new cpc(56, mp0.Z0(new Integer[]{46, 64}));
        cpc cpcVar11 = new cpc(57, sf5.f0(47));
        cpc cpcVar12 = new cpc(70, setZ0);
        cpc cpcVar13 = new cpc(68, sf5.f0(52));
        cpc cpcVar14 = new cpc(69, sf5.f0(53));
        pwf pwfVar = new pwf();
        pwfVar.add(60);
        Set set = setZ02;
        pwfVar.addAll(set);
        cpc cpcVar15 = new cpc(73, sf5.k(pwfVar));
        pwf pwfVar2 = new pwf();
        pwfVar2.add(62);
        pwfVar2.addAll(set);
        g = sta.h0(cpcVar, cpcVar2, cpcVar3, cpcVar4, cpcVar5, cpcVar6, cpcVar7, cpcVar8, cpcVar9, cpcVar10, cpcVar11, cpcVar12, cpcVar13, cpcVar14, cpcVar15, new cpc(74, sf5.k(pwfVar2)), new cpc(79, sf5.f0(64)), new cpc(82, sf5.f0(66)), new cpc(81, setZ0), new cpc(83, sf5.f0(67)));
    }

    public l67(Instant instant, Instant instant2, int i, int i2) {
        this.a = instant;
        this.b = instant2;
        this.c = i;
        this.d = i2;
        if (!instant.isBefore(instant2)) {
            sz6.p("startTime must be before endTime.");
            throw null;
        }
        if (i2 >= 0) {
            return;
        }
        sz6.p("repetitions can not be negative.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l67)) {
            return false;
        }
        l67 l67Var = (l67) obj;
        return this.a.equals(l67Var.a) && this.b.equals(l67Var.b) && this.c == l67Var.c && this.d == l67Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + vb7.c(this.c, ebh.i(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExerciseSegment(startTime=");
        sb.append(this.a);
        sb.append(", endTime=");
        sb.append(this.b);
        sb.append(", segmentType=");
        sb.append(this.c);
        sb.append(", repetitions=");
        return vb7.r(sb, this.d, ')');
    }
}
