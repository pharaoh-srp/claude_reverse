package defpackage;

import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import com.anthropic.claude.types.strings.ToolUseId;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class ftc implements mtc, qxh {
    public final ParsedContentBlockId a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final Integer f;
    public final String g;
    public final dlb h;
    public final vwh i;
    public final String j;
    public final d54 k;
    public final String l;

    public ftc(ParsedContentBlockId parsedContentBlockId, String str, String str2, boolean z, boolean z2, Integer num, String str3, dlb dlbVar, vwh vwhVar, String str4, d54 d54Var) {
        parsedContentBlockId.getClass();
        str.getClass();
        str3.getClass();
        this.a = parsedContentBlockId;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = num;
        this.g = str3;
        this.h = dlbVar;
        this.i = vwhVar;
        this.j = str4;
        this.k = d54Var;
        this.l = "";
    }

    public static ftc a(ftc ftcVar, String str, boolean z, dlb dlbVar, int i) {
        ParsedContentBlockId parsedContentBlockId = ftcVar.a;
        String str2 = ftcVar.b;
        if ((i & 4) != 0) {
            str = ftcVar.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            z = ftcVar.d;
        }
        boolean z2 = z;
        boolean z3 = (i & 16) != 0 ? ftcVar.e : true;
        Integer num = ftcVar.f;
        String str4 = ftcVar.g;
        dlb dlbVar2 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? ftcVar.h : dlbVar;
        vwh vwhVar = ftcVar.i;
        String str5 = ftcVar.j;
        d54 d54Var = ftcVar.k;
        ftcVar.getClass();
        parsedContentBlockId.getClass();
        str2.getClass();
        str4.getClass();
        vwhVar.getClass();
        return new ftc(parsedContentBlockId, str2, str3, z2, z3, num, str4, dlbVar2, vwhVar, str5, d54Var);
    }

    public final vwh b() {
        return this.i;
    }

    public final dlb c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftc)) {
            return false;
        }
        ftc ftcVar = (ftc) obj;
        return x44.r(this.a, ftcVar.a) && x44.r(this.b, ftcVar.b) && x44.r(this.c, ftcVar.c) && this.d == ftcVar.d && this.e == ftcVar.e && x44.r(this.f, ftcVar.f) && ToolUseId.m1160equalsimpl0(this.g, ftcVar.g) && x44.r(this.h, ftcVar.h) && x44.r(this.i, ftcVar.i) && x44.r(this.j, ftcVar.j) && x44.r(this.k, ftcVar.k);
    }

    @Override // defpackage.mtc
    public final String getBody() {
        return this.l;
    }

    @Override // defpackage.qxh
    public final boolean getCanBeCollapsed() {
        vwh vwhVar = this.i;
        return (vwhVar instanceof uwh) && ((uwh) vwhVar).a;
    }

    @Override // defpackage.qxh
    public final String getIconName() {
        return null;
    }

    @Override // defpackage.vf8
    public final ParsedContentBlockId getId() {
        return this.a;
    }

    @Override // defpackage.qxh
    public final String getIntegrationIconUrl() {
        return null;
    }

    @Override // defpackage.qxh
    public final String getIntegrationName() {
        return null;
    }

    @Override // defpackage.qxh
    public final String getMessageSubText() {
        return this.j;
    }

    @Override // defpackage.qxh
    public final String getMessageText() {
        return this.c;
    }

    @Override // defpackage.qxh
    public final Integer getToolIconResId() {
        return this.f;
    }

    @Override // defpackage.qxh
    /* JADX INFO: renamed from: getToolIconTint-QN2ZGVo */
    public final d54 mo681getToolIconTintQN2ZGVo() {
        return this.k;
    }

    @Override // defpackage.qxh
    public final String getToolName() {
        return this.b;
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iP = fsh.p(fsh.p((iL + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        Integer num = this.f;
        int iM1161hashCodeimpl = (ToolUseId.m1161hashCodeimpl(this.g) + ((iP + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        dlb dlbVar = this.h;
        int iHashCode = (this.i.hashCode() + ((iM1161hashCodeimpl + (dlbVar == null ? 0 : dlbVar.hashCode())) * 31)) * 31;
        String str2 = this.j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        d54 d54Var = this.k;
        return iHashCode2 + (d54Var != null ? Long.hashCode(d54Var.a) : 0);
    }

    @Override // defpackage.mtc, defpackage.qf8
    /* JADX INFO: renamed from: isComplete */
    public final boolean getIsComplete() {
        return this.e;
    }

    @Override // defpackage.uf8
    public final boolean isError() {
        return this.d;
    }

    public final String toString() {
        String strM1162toStringimpl = ToolUseId.m1162toStringimpl(this.g);
        StringBuilder sb = new StringBuilder("MobileAppUseToolInvocation(id=");
        sb.append(this.a);
        sb.append(", toolName=");
        sb.append(this.b);
        sb.append(", messageText=");
        gid.t(sb, this.c, ", isError=", this.d, ", isComplete=");
        sb.append(this.e);
        sb.append(", toolIconResId=");
        sb.append(this.f);
        sb.append(", toolUseId=");
        sb.append(strM1162toStringimpl);
        sb.append(", toolPayload=");
        sb.append(this.h);
        sb.append(", toolDisplayProperties=");
        sb.append(this.i);
        sb.append(", messageSubText=");
        sb.append(this.j);
        sb.append(", toolIconTint=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ftc(ParsedContentBlockId parsedContentBlockId, String str, String str2, boolean z, Integer num, String str3, dlb dlbVar, vwh vwhVar, String str4, d54 d54Var) {
        this(parsedContentBlockId, str, str2, false, z, num, str3, dlbVar, vwhVar, str4, d54Var);
    }
}
