package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dc1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final fc1 f;
    public final gc1 g;
    public final List h;
    public final Long i;
    public final Long j;

    public /* synthetic */ dc1(String str, String str2, String str3, String str4, Long l, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : "local_workflow", (i & 8) != 0 ? str : str3, (i & 16) != 0 ? null : str4, fc1.F, null, lm6.E, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : l, null);
    }

    public static dc1 a(dc1 dc1Var, String str, String str2, String str3, String str4, fc1 fc1Var, gc1 gc1Var, List list, Long l, Long l2, int i) {
        String str5 = str;
        String str6 = dc1Var.a;
        if ((i & 2) != 0) {
            str5 = dc1Var.b;
        }
        if ((i & 4) != 0) {
            str2 = dc1Var.c;
        }
        if ((i & 8) != 0) {
            str3 = dc1Var.d;
        }
        if ((i & 16) != 0) {
            str4 = dc1Var.e;
        }
        if ((i & 32) != 0) {
            fc1Var = dc1Var.f;
        }
        if ((i & 64) != 0) {
            gc1Var = dc1Var.g;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            list = dc1Var.h;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            l = dc1Var.i;
        }
        if ((i & 512) != 0) {
            l2 = dc1Var.j;
        }
        Long l3 = l2;
        str6.getClass();
        str3.getClass();
        fc1Var.getClass();
        list.getClass();
        Long l4 = l;
        List list2 = list;
        gc1 gc1Var2 = gc1Var;
        fc1 fc1Var2 = fc1Var;
        String str7 = str4;
        String str8 = str3;
        return new dc1(str6, str5, str2, str8, str7, fc1Var2, gc1Var2, list2, l4, l3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc1)) {
            return false;
        }
        dc1 dc1Var = (dc1) obj;
        return x44.r(this.a, dc1Var.a) && x44.r(this.b, dc1Var.b) && x44.r(this.c, dc1Var.c) && x44.r(this.d, dc1Var.d) && x44.r(this.e, dc1Var.e) && this.f == dc1Var.f && x44.r(this.g, dc1Var.g) && x44.r(this.h, dc1Var.h) && x44.r(this.i, dc1Var.i) && x44.r(this.j, dc1Var.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iL = kgh.l((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iL + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        gc1 gc1Var = this.g;
        int iM = kgh.m((iHashCode3 + (gc1Var == null ? 0 : gc1Var.hashCode())) * 31, 31, this.h);
        Long l = this.i;
        int iHashCode4 = (iM + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.j;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("BackgroundTask(taskId=", this.a, ", toolUseId=", this.b, ", taskType=");
        kgh.u(sbR, this.c, ", description=", this.d, ", name=");
        sbR.append(this.e);
        sbR.append(", status=");
        sbR.append(this.f);
        sbR.append(", usage=");
        sbR.append(this.g);
        sbR.append(", workflowProgress=");
        sbR.append(this.h);
        sbR.append(", startedAtMillis=");
        sbR.append(this.i);
        sbR.append(", completedAtMillis=");
        sbR.append(this.j);
        sbR.append(")");
        return sbR.toString();
    }

    public dc1(String str, String str2, String str3, String str4, String str5, fc1 fc1Var, gc1 gc1Var, List list, Long l, Long l2) {
        str.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = fc1Var;
        this.g = gc1Var;
        this.h = list;
        this.i = l;
        this.j = l2;
    }
}
