package defpackage;

import com.anthropic.claude.api.chat.ChatFeedback;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.types.strings.MessageId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uhd implements whd {
    public final String a;
    public final int b;
    public final InputMode c;
    public final boolean d;
    public final List e;
    public final boolean f;
    public final ApiHelpline g;
    public final ChatFeedback h;
    public final String i;
    public final boolean j;
    public final Long k;
    public final u0h l;
    public final u0h m;

    public uhd(String str, int i, InputMode inputMode, boolean z, List list, boolean z2, ApiHelpline apiHelpline, ChatFeedback chatFeedback, String str2, boolean z3, Long l) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = i;
        this.c = inputMode;
        this.d = z;
        this.e = list;
        this.f = z2;
        this.g = apiHelpline;
        this.h = chatFeedback;
        this.i = str2;
        this.j = z3;
        this.k = l;
        final int i2 = 0;
        this.l = new u0h(new zy7(this) { // from class: thd
            public final /* synthetic */ uhd F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i3 = i2;
                uhd uhdVar = this.F;
                switch (i3) {
                    case 0:
                        List<mtc> list2 = uhdVar.e;
                        ArrayList arrayList = new ArrayList();
                        for (mtc mtcVar : list2) {
                            b54.t0(arrayList, mtcVar instanceof itc ? ((itc) mtcVar).d : mtcVar instanceof ParsedContentBlock$Thinking ? ((ParsedContentBlock$Thinking) mtcVar).getFlags() : mtcVar instanceof ParsedContentBlock$McpToolInvocation ? ((ParsedContentBlock$McpToolInvocation) mtcVar).getFlags() : mtcVar instanceof atc ? ((atc) mtcVar).d : um6.E);
                        }
                        return w44.t1(arrayList);
                    default:
                        List list3 = uhdVar.e;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list3) {
                            if (obj instanceof itc) {
                                arrayList2.add(obj);
                            }
                        }
                        return w44.S0(arrayList2, "\n\n", null, null, new f7d(6), 30);
                }
            }
        });
        final int i3 = 1;
        this.m = new u0h(new zy7(this) { // from class: thd
            public final /* synthetic */ uhd F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i32 = i3;
                uhd uhdVar = this.F;
                switch (i32) {
                    case 0:
                        List<mtc> list2 = uhdVar.e;
                        ArrayList arrayList = new ArrayList();
                        for (mtc mtcVar : list2) {
                            b54.t0(arrayList, mtcVar instanceof itc ? ((itc) mtcVar).d : mtcVar instanceof ParsedContentBlock$Thinking ? ((ParsedContentBlock$Thinking) mtcVar).getFlags() : mtcVar instanceof ParsedContentBlock$McpToolInvocation ? ((ParsedContentBlock$McpToolInvocation) mtcVar).getFlags() : mtcVar instanceof atc ? ((atc) mtcVar).d : um6.E);
                        }
                        return w44.t1(arrayList);
                    default:
                        List list3 = uhdVar.e;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list3) {
                            if (obj instanceof itc) {
                                arrayList2.add(obj);
                            }
                        }
                        return w44.S0(arrayList2, "\n\n", null, null, new f7d(6), 30);
                }
            }
        });
    }

    public static uhd g(uhd uhdVar, String str, ArrayList arrayList, ChatFeedback chatFeedback, String str2, Long l, int i) {
        if ((i & 1) != 0) {
            str = uhdVar.a;
        }
        String str3 = str;
        int i2 = uhdVar.b;
        InputMode inputMode = uhdVar.c;
        boolean z = (i & 8) != 0 ? uhdVar.d : false;
        List list = (i & 16) != 0 ? uhdVar.e : arrayList;
        boolean z2 = uhdVar.f;
        ApiHelpline apiHelpline = uhdVar.g;
        ChatFeedback chatFeedback2 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? uhdVar.h : chatFeedback;
        String str4 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? uhdVar.i : str2;
        boolean z3 = (i & 512) != 0 ? uhdVar.j : true;
        Long l2 = (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? uhdVar.k : l;
        uhdVar.getClass();
        str3.getClass();
        list.getClass();
        return new uhd(str3, i2, inputMode, z, list, z2, apiHelpline, chatFeedback2, str4, z3, l2);
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
        return (String) this.m.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhd)) {
            return false;
        }
        uhd uhdVar = (uhd) obj;
        return MessageId.m1054equalsimpl0(this.a, uhdVar.a) && this.b == uhdVar.b && this.c == uhdVar.c && this.d == uhdVar.d && x44.r(this.e, uhdVar.e) && this.f == uhdVar.f && x44.r(this.g, uhdVar.g) && x44.r(this.h, uhdVar.h) && x44.r(this.i, uhdVar.i) && this.j == uhdVar.j && x44.r(this.k, uhdVar.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f() {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhd.f():int");
    }

    @Override // defpackage.whd
    public final int getIndex() {
        return this.b;
    }

    public final ChatFeedback h() {
        return this.h;
    }

    public final int hashCode() {
        int iC = vb7.c(this.b, MessageId.m1055hashCodeimpl(this.a) * 31, 31);
        InputMode inputMode = this.c;
        int iP = fsh.p(kgh.m(fsh.p((iC + (inputMode == null ? 0 : inputMode.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        ApiHelpline apiHelpline = this.g;
        int iHashCode = (iP + (apiHelpline == null ? 0 : apiHelpline.hashCode())) * 31;
        ChatFeedback chatFeedback = this.h;
        int iHashCode2 = (iHashCode + (chatFeedback == null ? 0 : chatFeedback.hashCode())) * 31;
        String str = this.i;
        int iP2 = fsh.p((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.j);
        Long l = this.k;
        return iP2 + (l != null ? l.hashCode() : 0);
    }

    public final List i() {
        return this.e;
    }

    public final Long j() {
        return this.k;
    }

    public final boolean k() {
        return this.f;
    }

    public final String l() {
        return this.i;
    }

    public final boolean m() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sbP = ij0.p("Assistant(uuid=", MessageId.m1056toStringimpl(this.a), this.b, ", index=", ", inputMode=");
        sbP.append(this.c);
        sbP.append(", isTemporaryId=");
        sbP.append(this.d);
        sbP.append(", contentBlocks=");
        sbP.append(this.e);
        sbP.append(", hasFiles=");
        sbP.append(this.f);
        sbP.append(", helpline=");
        sbP.append(this.g);
        sbP.append(", chatFeedback=");
        sbP.append(this.h);
        sbP.append(", stopReason=");
        gid.t(sbP, this.i, ", isPartialResponse=", this.j, ", createdAt=");
        sbP.append(this.k);
        sbP.append(")");
        return sbP.toString();
    }

    public /* synthetic */ uhd(String str, int i, InputMode inputMode, boolean z, List list, boolean z2, ApiHelpline apiHelpline, ChatFeedback chatFeedback, String str2, int i2) {
        this(str, i, inputMode, z, list, z2, (i2 & 64) != 0 ? null : apiHelpline, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : chatFeedback, (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str2, false, null);
    }
}
