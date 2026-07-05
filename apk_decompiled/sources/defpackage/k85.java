package defpackage;

import com.anthropic.claude.code.remote.stores.SessionTarget;
import com.anthropic.claude.types.strings.CodeAgentId;
import com.anthropic.claude.types.strings.ModelId;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k85 {
    public final SessionTarget a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public k85(SessionTarget sessionTarget, List list, String str, String str2, String str3, String str4, String str5, int i) {
        str3 = (i & 16) != 0 ? null : str3;
        str4 = (i & 32) != 0 ? null : str4;
        str5 = (i & 64) != 0 ? null : str5;
        this.a = sessionTarget;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.e;
    }

    public final SessionTarget e() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L5
            goto L72
        L5:
            boolean r1 = r5 instanceof defpackage.k85
            r2 = 0
            if (r1 != 0) goto Lc
            goto L71
        Lc:
            k85 r5 = (defpackage.k85) r5
            com.anthropic.claude.code.remote.stores.SessionTarget r1 = r4.a
            com.anthropic.claude.code.remote.stores.SessionTarget r3 = r5.a
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L1a
            goto L71
        L1a:
            java.util.List r1 = r4.b
            java.util.List r3 = r5.b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L25
            goto L71
        L25:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L30
            goto L71
        L30:
            java.lang.String r1 = r5.d
            java.lang.String r3 = r4.d
            if (r3 != 0) goto L3c
            if (r1 != 0) goto L3a
            r1 = r0
            goto L43
        L3a:
            r1 = r2
            goto L43
        L3c:
            if (r1 != 0) goto L3f
            goto L3a
        L3f:
            boolean r1 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r3, r1)
        L43:
            if (r1 != 0) goto L46
            goto L71
        L46:
            java.lang.String r1 = r4.e
            java.lang.String r3 = r5.e
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L51
            goto L71
        L51:
            java.lang.String r1 = r4.f
            java.lang.String r3 = r5.f
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L5c
            goto L71
        L5c:
            java.lang.String r5 = r5.g
            java.lang.String r4 = r4.g
            if (r4 != 0) goto L68
            if (r5 != 0) goto L66
            r4 = r0
            goto L6f
        L66:
            r4 = r2
            goto L6f
        L68:
            if (r5 != 0) goto L6b
            goto L66
        L6b:
            boolean r4 = com.anthropic.claude.types.strings.CodeAgentId.m995equalsimpl0(r4, r5)
        L6f:
            if (r4 != 0) goto L72
        L71:
            return r2
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k85.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        SessionTarget sessionTarget = this.a;
        int iL = kgh.l(kgh.m((sessionTarget == null ? 0 : sessionTarget.hashCode()) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iM1062hashCodeimpl = (iL + (str == null ? 0 : ModelId.m1062hashCodeimpl(str))) * 31;
        String str2 = this.e;
        int iHashCode = (iM1062hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode2 + (str4 != null ? CodeAgentId.m996hashCodeimpl(str4) : 0);
    }

    public final String toString() {
        String str = this.d;
        String strM1063toStringimpl = str == null ? "null" : ModelId.m1063toStringimpl(str);
        String str2 = this.g;
        String strM997toStringimpl = str2 != null ? CodeAgentId.m997toStringimpl(str2) : "null";
        StringBuilder sb = new StringBuilder("CreateSessionRequest(target=");
        sb.append(this.a);
        sb.append(", repos=");
        sb.append(this.b);
        sb.append(", firstMessageText=");
        kgh.u(sb, this.c, ", modelId=", strM1063toStringimpl, ", starterRepoUrl=");
        kgh.u(sb, this.e, ", starterAppendSystemPrompt=", this.f, ", agentId=");
        return ij0.m(sb, strM997toStringimpl, ")");
    }
}
