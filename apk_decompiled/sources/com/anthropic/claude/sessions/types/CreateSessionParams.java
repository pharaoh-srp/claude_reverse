package com.anthropic.claude.sessions.types;

import com.anthropic.claude.types.strings.CodeAgentId;
import com.anthropic.claude.types.strings.SessionGroupingId;
import defpackage.gvj;
import defpackage.h85;
import defpackage.i85;
import defpackage.ij0;
import defpackage.j85;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nq3;
import defpackage.onf;
import defpackage.srg;
import defpackage.tpf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xrf;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@B[\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010!Jf\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b<\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b=\u0010!¨\u0006A"}, d2 = {"Lcom/anthropic/claude/sessions/types/CreateSessionParams;", "", "", "", "events", "title", "environment_id", "self_hosted_runner_pool_id", "Lcom/anthropic/claude/sessions/types/SessionContext;", "session_context", "Lcom/anthropic/claude/types/strings/CodeAgentId;", "agent_id", "Lcom/anthropic/claude/types/strings/SessionGroupingId;", "session_grouping_id", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionContext;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionContext;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/CreateSessionParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/anthropic/claude/sessions/types/SessionContext;", "component6-kU3PmtI", "component6", "component7-n6q-b3o", "component7", "copy-2d5CWPM", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionContext;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/CreateSessionParams;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEvents", "Ljava/lang/String;", "getTitle", "getEnvironment_id", "getSelf_hosted_runner_pool_id", "Lcom/anthropic/claude/sessions/types/SessionContext;", "getSession_context", "getAgent_id-kU3PmtI", "getSession_grouping_id-n6q-b3o", "Companion", "i85", "j85", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateSessionParams {
    private final String agent_id;
    private final String environment_id;
    private final List<String> events;
    private final String self_hosted_runner_pool_id;
    private final SessionContext session_context;
    private final String session_grouping_id;
    private final String title;
    public static final j85 Companion = new j85();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new h85(0)), null, null, null, null, null, null};

    private /* synthetic */ CreateSessionParams(int i, List list, String str, String str2, String str3, SessionContext sessionContext, String str4, String str5, vnf vnfVar) {
        if (16 != (i & 16)) {
            gvj.f(i, 16, i85.a.getDescriptor());
            throw null;
        }
        this.events = (i & 1) == 0 ? lm6.E : list;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.environment_id = null;
        } else {
            this.environment_id = str2;
        }
        if ((i & 8) == 0) {
            this.self_hosted_runner_pool_id = null;
        } else {
            this.self_hosted_runner_pool_id = str3;
        }
        this.session_context = sessionContext;
        if ((i & 32) == 0) {
            this.agent_id = null;
        } else {
            this.agent_id = str4;
        }
        if ((i & 64) == 0) {
            this.session_grouping_id = null;
        } else {
            this.session_grouping_id = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-2d5CWPM$default, reason: not valid java name */
    public static /* synthetic */ CreateSessionParams m839copy2d5CWPM$default(CreateSessionParams createSessionParams, List list, String str, String str2, String str3, SessionContext sessionContext, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = createSessionParams.events;
        }
        if ((i & 2) != 0) {
            str = createSessionParams.title;
        }
        if ((i & 4) != 0) {
            str2 = createSessionParams.environment_id;
        }
        if ((i & 8) != 0) {
            str3 = createSessionParams.self_hosted_runner_pool_id;
        }
        if ((i & 16) != 0) {
            sessionContext = createSessionParams.session_context;
        }
        if ((i & 32) != 0) {
            str4 = createSessionParams.agent_id;
        }
        if ((i & 64) != 0) {
            str5 = createSessionParams.session_grouping_id;
        }
        String str6 = str4;
        String str7 = str5;
        SessionContext sessionContext2 = sessionContext;
        String str8 = str2;
        return createSessionParams.m842copy2d5CWPM(list, str, str8, str3, sessionContext2, str6, str7);
    }

    public static final /* synthetic */ void write$Self$sessions(CreateSessionParams self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || !x44.r(self.events, lm6.E)) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.events);
        }
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 1, srg.a, self.title);
        }
        if (output.E(serialDesc) || self.environment_id != null) {
            output.B(serialDesc, 2, srg.a, self.environment_id);
        }
        if (output.E(serialDesc) || self.self_hosted_runner_pool_id != null) {
            output.B(serialDesc, 3, srg.a, self.self_hosted_runner_pool_id);
        }
        output.r(serialDesc, 4, tpf.a, self.session_context);
        if (output.E(serialDesc) || self.agent_id != null) {
            nq3 nq3Var = nq3.a;
            String str = self.agent_id;
            output.B(serialDesc, 5, nq3Var, str != null ? CodeAgentId.m992boximpl(str) : null);
        }
        if (!output.E(serialDesc) && self.session_grouping_id == null) {
            return;
        }
        xrf xrfVar = xrf.a;
        String str2 = self.session_grouping_id;
        output.B(serialDesc, 6, xrfVar, str2 != null ? SessionGroupingId.m1107boximpl(str2) : null);
    }

    public final List<String> component1() {
        return this.events;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEnvironment_id() {
        return this.environment_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSelf_hosted_runner_pool_id() {
        return this.self_hosted_runner_pool_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SessionContext getSession_context() {
        return this.session_context;
    }

    /* JADX INFO: renamed from: component6-kU3PmtI, reason: not valid java name and from getter */
    public final String getAgent_id() {
        return this.agent_id;
    }

    /* JADX INFO: renamed from: component7-n6q-b3o, reason: not valid java name and from getter */
    public final String getSession_grouping_id() {
        return this.session_grouping_id;
    }

    /* JADX INFO: renamed from: copy-2d5CWPM, reason: not valid java name */
    public final CreateSessionParams m842copy2d5CWPM(List<String> events, String title, String environment_id, String self_hosted_runner_pool_id, SessionContext session_context, String agent_id, String session_grouping_id) {
        events.getClass();
        session_context.getClass();
        return new CreateSessionParams(events, title, environment_id, self_hosted_runner_pool_id, session_context, agent_id, session_grouping_id, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.anthropic.claude.sessions.types.CreateSessionParams
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.sessions.types.CreateSessionParams r5 = (com.anthropic.claude.sessions.types.CreateSessionParams) r5
            java.util.List<java.lang.String> r1 = r4.events
            java.util.List<java.lang.String> r3 = r5.events
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.title
            java.lang.String r3 = r5.title
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.environment_id
            java.lang.String r3 = r5.environment_id
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.self_hosted_runner_pool_id
            java.lang.String r3 = r5.self_hosted_runner_pool_id
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            com.anthropic.claude.sessions.types.SessionContext r1 = r4.session_context
            com.anthropic.claude.sessions.types.SessionContext r3 = r5.session_context
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.agent_id
            java.lang.String r3 = r5.agent_id
            if (r1 != 0) goto L4f
            if (r3 != 0) goto L4d
            r1 = r0
            goto L56
        L4d:
            r1 = r2
            goto L56
        L4f:
            if (r3 != 0) goto L52
            goto L4d
        L52:
            boolean r1 = com.anthropic.claude.types.strings.CodeAgentId.m995equalsimpl0(r1, r3)
        L56:
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r4 = r4.session_grouping_id
            java.lang.String r5 = r5.session_grouping_id
            if (r4 != 0) goto L65
            if (r5 != 0) goto L63
            r4 = r0
            goto L6c
        L63:
            r4 = r2
            goto L6c
        L65:
            if (r5 != 0) goto L68
            goto L63
        L68:
            boolean r4 = com.anthropic.claude.types.strings.SessionGroupingId.m1110equalsimpl0(r4, r5)
        L6c:
            if (r4 != 0) goto L6f
            return r2
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.types.CreateSessionParams.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getAgent_id-kU3PmtI, reason: not valid java name */
    public final String m843getAgent_idkU3PmtI() {
        return this.agent_id;
    }

    public final String getEnvironment_id() {
        return this.environment_id;
    }

    public final List<String> getEvents() {
        return this.events;
    }

    public final String getSelf_hosted_runner_pool_id() {
        return this.self_hosted_runner_pool_id;
    }

    public final SessionContext getSession_context() {
        return this.session_context;
    }

    /* JADX INFO: renamed from: getSession_grouping_id-n6q-b3o, reason: not valid java name */
    public final String m844getSession_grouping_idn6qb3o() {
        return this.session_grouping_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.events.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.environment_id;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.self_hosted_runner_pool_id;
        int iHashCode4 = (this.session_context.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.agent_id;
        int iM996hashCodeimpl = (iHashCode4 + (str4 == null ? 0 : CodeAgentId.m996hashCodeimpl(str4))) * 31;
        String str5 = this.session_grouping_id;
        return iM996hashCodeimpl + (str5 != null ? SessionGroupingId.m1111hashCodeimpl(str5) : 0);
    }

    public String toString() {
        List<String> list = this.events;
        String str = this.title;
        String str2 = this.environment_id;
        String str3 = this.self_hosted_runner_pool_id;
        SessionContext sessionContext = this.session_context;
        String str4 = this.agent_id;
        String strM997toStringimpl = str4 == null ? "null" : CodeAgentId.m997toStringimpl(str4);
        String str5 = this.session_grouping_id;
        String strM1112toStringimpl = str5 != null ? SessionGroupingId.m1112toStringimpl(str5) : "null";
        StringBuilder sb = new StringBuilder("CreateSessionParams(events=");
        sb.append(list);
        sb.append(", title=");
        sb.append(str);
        sb.append(", environment_id=");
        kgh.u(sb, str2, ", self_hosted_runner_pool_id=", str3, ", session_context=");
        sb.append(sessionContext);
        sb.append(", agent_id=");
        sb.append(strM997toStringimpl);
        sb.append(", session_grouping_id=");
        return ij0.m(sb, strM1112toStringimpl, ")");
    }

    public /* synthetic */ CreateSessionParams(List list, String str, String str2, String str3, SessionContext sessionContext, String str4, String str5, mq5 mq5Var) {
        this(list, str, str2, str3, sessionContext, str4, str5);
    }

    public /* synthetic */ CreateSessionParams(int i, List list, String str, String str2, String str3, SessionContext sessionContext, String str4, String str5, vnf vnfVar, mq5 mq5Var) {
        this(i, list, str, str2, str3, sessionContext, str4, str5, vnfVar);
    }

    private CreateSessionParams(List<String> list, String str, String str2, String str3, SessionContext sessionContext, String str4, String str5) {
        list.getClass();
        sessionContext.getClass();
        this.events = list;
        this.title = str;
        this.environment_id = str2;
        this.self_hosted_runner_pool_id = str3;
        this.session_context = sessionContext;
        this.agent_id = str4;
        this.session_grouping_id = str5;
    }

    public /* synthetic */ CreateSessionParams(List list, String str, String str2, String str3, SessionContext sessionContext, String str4, String str5, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, sessionContext, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, null);
    }
}
