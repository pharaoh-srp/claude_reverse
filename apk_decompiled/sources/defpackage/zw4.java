package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class zw4 implements bx4 {
    public final String a;
    public final String b;

    public zw4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.bx4
    public final int a() {
        return R.string.conway_tool_calendar_write_title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw4)) {
            return false;
        }
        zw4 zw4Var = (zw4) obj;
        return this.a.equals(zw4Var.a) && this.b.equals(zw4Var.b);
    }

    @Override // defpackage.bx4
    public final ud0 getIcon() {
        ud0 ud0Var = ud0.d;
        return ud0.z;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("CalendarWrite(title=", this.a, ", start=", this.b, ")");
    }
}
