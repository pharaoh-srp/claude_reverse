package defpackage;

import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.types.strings.MessageId;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vhd implements whd, mv2 {
    public final String a;
    public final int b;
    public final InputMode c;
    public final boolean d;
    public final String e;
    public final List f;
    public final List g;
    public final Long h;
    public final String i;

    public vhd(String str, int i, InputMode inputMode, boolean z, String str2, List list, List list2, Long l) {
        str.getClass();
        str2.getClass();
        list2.getClass();
        this.a = str;
        this.b = i;
        this.c = inputMode;
        this.d = z;
        this.e = str2;
        this.f = list;
        this.g = list2;
        this.h = l;
        this.i = str2;
    }

    public static vhd f(vhd vhdVar, String str) {
        int i = vhdVar.b;
        InputMode inputMode = vhdVar.c;
        String str2 = vhdVar.e;
        List list = vhdVar.f;
        List list2 = vhdVar.g;
        Long l = vhdVar.h;
        str.getClass();
        str2.getClass();
        list2.getClass();
        return new vhd(str, i, inputMode, false, str2, list, list2, l);
    }

    @Override // defpackage.whd
    public final InputMode a() {
        return this.c;
    }

    @Override // defpackage.whd
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.whd
    public final String c() {
        return this.a;
    }

    @Override // defpackage.whd
    public final String e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhd)) {
            return false;
        }
        vhd vhdVar = (vhd) obj;
        return MessageId.m1054equalsimpl0(this.a, vhdVar.a) && this.b == vhdVar.b && this.c == vhdVar.c && this.d == vhdVar.d && x44.r(this.e, vhdVar.e) && x44.r(this.f, vhdVar.f) && x44.r(this.g, vhdVar.g) && x44.r(this.h, vhdVar.h);
    }

    @Override // defpackage.mv2
    public final List getAttachments() {
        return this.g;
    }

    @Override // defpackage.mv2
    public final List getFiles() {
        return this.f;
    }

    @Override // defpackage.whd
    public final int getIndex() {
        return this.b;
    }

    @Override // defpackage.mv2
    public final String getText() {
        return this.e;
    }

    public final int hashCode() {
        int iC = vb7.c(this.b, MessageId.m1055hashCodeimpl(this.a) * 31, 31);
        InputMode inputMode = this.c;
        int iL = kgh.l(fsh.p((iC + (inputMode == null ? 0 : inputMode.hashCode())) * 31, 31, this.d), 31, this.e);
        List list = this.f;
        int iM = kgh.m((iL + (list == null ? 0 : list.hashCode())) * 31, 31, this.g);
        Long l = this.h;
        return iM + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = ij0.p("Human(uuid=", MessageId.m1056toStringimpl(this.a), this.b, ", index=", ", inputMode=");
        sbP.append(this.c);
        sbP.append(", isTemporaryId=");
        sbP.append(this.d);
        sbP.append(", text=");
        qy1.p(this.e, ", files=", ", attachments=", sbP, this.f);
        sbP.append(this.g);
        sbP.append(", createdAt=");
        sbP.append(this.h);
        sbP.append(")");
        return sbP.toString();
    }

    public /* synthetic */ vhd(String str, int i, InputMode inputMode, String str2, List list, List list2) {
        this(str, i, inputMode, true, str2, list, list2, null);
    }
}
