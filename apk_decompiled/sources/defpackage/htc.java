package defpackage;

import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import com.anthropic.claude.tool.model.Tool;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class htc implements mtc, vf8, qf8, uf8 {
    public final ParsedContentBlockId a;
    public final Tool b;
    public final String c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final u0h g;

    public htc(ParsedContentBlockId parsedContentBlockId, Tool tool, String str, List list, boolean z, boolean z2) {
        parsedContentBlockId.getClass();
        tool.getClass();
        this.a = parsedContentBlockId;
        this.b = tool;
        this.c = str;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = new u0h(new pza(8, this));
    }

    public static htc a(htc htcVar, List list, boolean z, int i) {
        ParsedContentBlockId parsedContentBlockId = htcVar.a;
        Tool tool = htcVar.b;
        String str = htcVar.c;
        if ((i & 8) != 0) {
            list = htcVar.d;
        }
        List list2 = list;
        boolean z2 = (i & 16) != 0 ? htcVar.e : true;
        if ((i & 32) != 0) {
            z = htcVar.f;
        }
        htcVar.getClass();
        parsedContentBlockId.getClass();
        tool.getClass();
        list2.getClass();
        return new htc(parsedContentBlockId, tool, str, list2, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htc)) {
            return false;
        }
        htc htcVar = (htc) obj;
        return x44.r(this.a, htcVar.a) && x44.r(this.b, htcVar.b) && x44.r(this.c, htcVar.c) && this.d.equals(htcVar.d) && this.e == htcVar.e && this.f == htcVar.f;
    }

    @Override // defpackage.mtc
    public final String getBody() {
        return (String) this.g.getValue();
    }

    @Override // defpackage.vf8
    public final ParsedContentBlockId getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(this.f) + fsh.p(kgh.m((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    @Override // defpackage.mtc, defpackage.qf8
    /* JADX INFO: renamed from: isComplete */
    public final boolean getIsComplete() {
        return this.e;
    }

    @Override // defpackage.uf8
    public final boolean isError() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchToolInvocation(id=");
        sb.append(this.a);
        sb.append(", tool=");
        sb.append(this.b);
        sb.append(", query=");
        qy1.p(this.c, ", results=", ", isComplete=", sb, this.d);
        sb.append(this.e);
        sb.append(", isError=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
