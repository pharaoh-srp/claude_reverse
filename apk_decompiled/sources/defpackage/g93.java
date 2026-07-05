package defpackage;

import com.anthropic.claude.configs.flags.StreamSmoothingConfig;
import com.anthropic.claude.types.strings.MessageId;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class g93 {
    public final fj0 A;
    public final boolean B;
    public final Map C;
    public final boolean D;
    public final List a;
    public final boolean b;
    public final List c;
    public final ole d;
    public final StreamSmoothingConfig e;
    public final String f;
    public final boolean g;
    public final b13 h;
    public final boolean i;
    public final tv7 j;
    public final String k;
    public final Map l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final Map w;
    public final zza x;
    public final boolean y;
    public final Set z;

    public g93(List list, boolean z, List list2, ole oleVar, StreamSmoothingConfig streamSmoothingConfig, String str, boolean z2, b13 b13Var, boolean z3, tv7 tv7Var, String str2, Map map, boolean z4, boolean z5, boolean z6, String str3, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, Map map2, zza zzaVar, boolean z13, Set set, fj0 fj0Var, boolean z14, Map map3, boolean z15) {
        list.getClass();
        list2.getClass();
        oleVar.getClass();
        b13Var.getClass();
        tv7Var.getClass();
        map.getClass();
        map2.getClass();
        set.getClass();
        map3.getClass();
        this.a = list;
        this.b = z;
        this.c = list2;
        this.d = oleVar;
        this.e = streamSmoothingConfig;
        this.f = str;
        this.g = z2;
        this.h = b13Var;
        this.i = z3;
        this.j = tv7Var;
        this.k = str2;
        this.l = map;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = str3;
        this.q = z7;
        this.r = z8;
        this.s = z9;
        this.t = z10;
        this.u = z11;
        this.v = z12;
        this.w = map2;
        this.x = zzaVar;
        this.y = z13;
        this.z = set;
        this.A = fj0Var;
        this.B = z14;
        this.C = map3;
        this.D = z15;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g93.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + kgh.m(fsh.p(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        StreamSmoothingConfig streamSmoothingConfig = this.e;
        int iHashCode2 = (iHashCode + (streamSmoothingConfig == null ? 0 : streamSmoothingConfig.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (this.j.hashCode() + fsh.p((this.h.hashCode() + fsh.p((iHashCode2 + (str == null ? 0 : MessageId.m1055hashCodeimpl(str))) * 31, 31, this.g)) * 31, 31, this.i)) * 31;
        String str2 = this.k;
        int iP = fsh.p(fsh.p(fsh.p(ebh.g((iHashCode3 + (str2 == null ? 0 : MessageId.m1055hashCodeimpl(str2))) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        String str3 = this.p;
        int iG = ebh.g(fsh.p(fsh.p(fsh.p(fsh.p(fsh.p(fsh.p((iP + (str3 == null ? 0 : MessageId.m1055hashCodeimpl(str3))) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
        zza zzaVar = this.x;
        int iHashCode4 = (this.z.hashCode() + fsh.p((iG + (zzaVar == null ? 0 : zzaVar.hashCode())) * 31, 31, this.y)) * 31;
        fj0 fj0Var = this.A;
        return Boolean.hashCode(this.D) + ebh.g(fsh.p((iHashCode4 + (fj0Var != null ? fj0Var.hashCode() : 0)) * 31, 31, this.B), 31, this.C);
    }

    public final String toString() {
        String str = this.f;
        String strM1056toStringimpl = str == null ? "null" : MessageId.m1056toStringimpl(str);
        String str2 = this.k;
        String strM1056toStringimpl2 = str2 == null ? "null" : MessageId.m1056toStringimpl(str2);
        String str3 = this.p;
        String strM1056toStringimpl3 = str3 != null ? MessageId.m1056toStringimpl(str3) : "null";
        StringBuilder sb = new StringBuilder("ChatScreenMessageListState(messages=");
        sb.append(this.a);
        sb.append(", hasMessages=");
        sb.append(this.b);
        sb.append(", canceledResearchTaskIds=");
        sb.append(this.c);
        sb.append(", researchFlags=");
        sb.append(this.d);
        sb.append(", streamSmoothingConfig=");
        sb.append(this.e);
        sb.append(", lastAssistantMessageId=");
        sb.append(strM1056toStringimpl);
        sb.append(", showPartialResponseError=");
        sb.append(this.g);
        sb.append(", responseState=");
        sb.append(this.h);
        sb.append(", isResearching=");
        sb.append(this.i);
        sb.append(", chatFooterState=");
        sb.append(this.j);
        sb.append(", editMessageParentId=");
        sb.append(strM1056toStringimpl2);
        sb.append(", artifactEditBadges=");
        sb.append(this.l);
        sb.append(", isShareButtonEnabled=");
        ij0.A(sb, this.m, ", isFeedbackButtonEnabled=", this.n, ", isRetryButtonEnabled=");
        sb.append(this.o);
        sb.append(", narratingMessageId=");
        sb.append(strM1056toStringimpl3);
        sb.append(", isNarrationPaused=");
        ij0.A(sb, this.q, ", isNarrateButtonEnabled=", this.r, ", isGhostModeEnabled=");
        ij0.A(sb, this.s, ", isRaven=", this.t, ", showCompletionNotificationUpsell=");
        ij0.A(sb, this.u, ", isMemoryFeatureEnabled=", this.v, ", mcpAppFetchStateByBlockId=");
        sb.append(this.w);
        sb.append(", mcpAuthRequiredCardState=");
        sb.append(this.x);
        sb.append(", mcpServersReady=");
        sb.append(this.y);
        sb.append(", chromelessMcpServerNames=");
        sb.append(this.z);
        sb.append(", mcpAppWebViewCache=");
        sb.append(this.A);
        sb.append(", mcpAppsCollapsed=");
        sb.append(this.B);
        sb.append(", voiceSpokenCharacterIndices=");
        sb.append(this.C);
        sb.append(", showChatFooter=");
        sb.append(this.D);
        sb.append(")");
        return sb.toString();
    }
}
