package com.anthropic.claude.sessions.types;

import com.anthropic.claude.types.strings.CodeAgentId;
import com.anthropic.claude.types.strings.SessionGroupingId;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nq3;
import defpackage.onf;
import defpackage.opf;
import defpackage.q85;
import defpackage.r85;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.xrf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010\u001dJV\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b6\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b7\u0010\u001d¨\u0006;"}, d2 = {"Lcom/anthropic/claude/sessions/types/CreateSessionV2Params;", "", "", "title", "environment_id", "self_hosted_runner_pool_id", "Lcom/anthropic/claude/sessions/types/SessionConfigV2;", "config", "Lcom/anthropic/claude/types/strings/CodeAgentId;", "agent_id", "Lcom/anthropic/claude/types/strings/SessionGroupingId;", "session_grouping_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionConfigV2;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionConfigV2;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/CreateSessionV2Params;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/sessions/types/SessionConfigV2;", "component5-kU3PmtI", "component5", "component6-n6q-b3o", "component6", "copy-7coZcqg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SessionConfigV2;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/CreateSessionV2Params;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getEnvironment_id", "getSelf_hosted_runner_pool_id", "Lcom/anthropic/claude/sessions/types/SessionConfigV2;", "getConfig", "getAgent_id-kU3PmtI", "getSession_grouping_id-n6q-b3o", "Companion", "q85", "r85", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateSessionV2Params {
    public static final r85 Companion = new r85();
    private final String agent_id;
    private final SessionConfigV2 config;
    private final String environment_id;
    private final String self_hosted_runner_pool_id;
    private final String session_grouping_id;
    private final String title;

    private /* synthetic */ CreateSessionV2Params(int i, String str, String str2, String str3, SessionConfigV2 sessionConfigV2, String str4, String str5, vnf vnfVar) {
        if (8 != (i & 8)) {
            gvj.f(i, 8, q85.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.environment_id = null;
        } else {
            this.environment_id = str2;
        }
        if ((i & 4) == 0) {
            this.self_hosted_runner_pool_id = null;
        } else {
            this.self_hosted_runner_pool_id = str3;
        }
        this.config = sessionConfigV2;
        if ((i & 16) == 0) {
            this.agent_id = null;
        } else {
            this.agent_id = str4;
        }
        if ((i & 32) == 0) {
            this.session_grouping_id = null;
        } else {
            this.session_grouping_id = str5;
        }
    }

    /* JADX INFO: renamed from: copy-7coZcqg$default, reason: not valid java name */
    public static /* synthetic */ CreateSessionV2Params m845copy7coZcqg$default(CreateSessionV2Params createSessionV2Params, String str, String str2, String str3, SessionConfigV2 sessionConfigV2, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createSessionV2Params.title;
        }
        if ((i & 2) != 0) {
            str2 = createSessionV2Params.environment_id;
        }
        if ((i & 4) != 0) {
            str3 = createSessionV2Params.self_hosted_runner_pool_id;
        }
        if ((i & 8) != 0) {
            sessionConfigV2 = createSessionV2Params.config;
        }
        if ((i & 16) != 0) {
            str4 = createSessionV2Params.agent_id;
        }
        if ((i & 32) != 0) {
            str5 = createSessionV2Params.session_grouping_id;
        }
        String str6 = str4;
        String str7 = str5;
        return createSessionV2Params.m848copy7coZcqg(str, str2, str3, sessionConfigV2, str6, str7);
    }

    public static final /* synthetic */ void write$Self$sessions(CreateSessionV2Params self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 0, srg.a, self.title);
        }
        if (output.E(serialDesc) || self.environment_id != null) {
            output.B(serialDesc, 1, srg.a, self.environment_id);
        }
        if (output.E(serialDesc) || self.self_hosted_runner_pool_id != null) {
            output.B(serialDesc, 2, srg.a, self.self_hosted_runner_pool_id);
        }
        output.r(serialDesc, 3, opf.a, self.config);
        if (output.E(serialDesc) || self.agent_id != null) {
            nq3 nq3Var = nq3.a;
            String str = self.agent_id;
            output.B(serialDesc, 4, nq3Var, str != null ? CodeAgentId.m992boximpl(str) : null);
        }
        if (!output.E(serialDesc) && self.session_grouping_id == null) {
            return;
        }
        xrf xrfVar = xrf.a;
        String str2 = self.session_grouping_id;
        output.B(serialDesc, 5, xrfVar, str2 != null ? SessionGroupingId.m1107boximpl(str2) : null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEnvironment_id() {
        return this.environment_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSelf_hosted_runner_pool_id() {
        return this.self_hosted_runner_pool_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SessionConfigV2 getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component5-kU3PmtI, reason: not valid java name and from getter */
    public final String getAgent_id() {
        return this.agent_id;
    }

    /* JADX INFO: renamed from: component6-n6q-b3o, reason: not valid java name and from getter */
    public final String getSession_grouping_id() {
        return this.session_grouping_id;
    }

    /* JADX INFO: renamed from: copy-7coZcqg, reason: not valid java name */
    public final CreateSessionV2Params m848copy7coZcqg(String title, String environment_id, String self_hosted_runner_pool_id, SessionConfigV2 config, String agent_id, String session_grouping_id) {
        config.getClass();
        return new CreateSessionV2Params(title, environment_id, self_hosted_runner_pool_id, config, agent_id, session_grouping_id, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.sessions.types.CreateSessionV2Params
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.sessions.types.CreateSessionV2Params r5 = (com.anthropic.claude.sessions.types.CreateSessionV2Params) r5
            java.lang.String r1 = r4.title
            java.lang.String r3 = r5.title
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.environment_id
            java.lang.String r3 = r5.environment_id
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.self_hosted_runner_pool_id
            java.lang.String r3 = r5.self_hosted_runner_pool_id
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            com.anthropic.claude.sessions.types.SessionConfigV2 r1 = r4.config
            com.anthropic.claude.sessions.types.SessionConfigV2 r3 = r5.config
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.agent_id
            java.lang.String r3 = r5.agent_id
            if (r1 != 0) goto L44
            if (r3 != 0) goto L42
            r1 = r0
            goto L4b
        L42:
            r1 = r2
            goto L4b
        L44:
            if (r3 != 0) goto L47
            goto L42
        L47:
            boolean r1 = com.anthropic.claude.types.strings.CodeAgentId.m995equalsimpl0(r1, r3)
        L4b:
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r4 = r4.session_grouping_id
            java.lang.String r5 = r5.session_grouping_id
            if (r4 != 0) goto L5a
            if (r5 != 0) goto L58
            r4 = r0
            goto L61
        L58:
            r4 = r2
            goto L61
        L5a:
            if (r5 != 0) goto L5d
            goto L58
        L5d:
            boolean r4 = com.anthropic.claude.types.strings.SessionGroupingId.m1110equalsimpl0(r4, r5)
        L61:
            if (r4 != 0) goto L64
            return r2
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.types.CreateSessionV2Params.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getAgent_id-kU3PmtI, reason: not valid java name */
    public final String m849getAgent_idkU3PmtI() {
        return this.agent_id;
    }

    public final SessionConfigV2 getConfig() {
        return this.config;
    }

    public final String getEnvironment_id() {
        return this.environment_id;
    }

    public final String getSelf_hosted_runner_pool_id() {
        return this.self_hosted_runner_pool_id;
    }

    /* JADX INFO: renamed from: getSession_grouping_id-n6q-b3o, reason: not valid java name */
    public final String m850getSession_grouping_idn6qb3o() {
        return this.session_grouping_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.environment_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.self_hosted_runner_pool_id;
        int iHashCode3 = (this.config.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.agent_id;
        int iM996hashCodeimpl = (iHashCode3 + (str4 == null ? 0 : CodeAgentId.m996hashCodeimpl(str4))) * 31;
        String str5 = this.session_grouping_id;
        return iM996hashCodeimpl + (str5 != null ? SessionGroupingId.m1111hashCodeimpl(str5) : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.environment_id;
        String str3 = this.self_hosted_runner_pool_id;
        SessionConfigV2 sessionConfigV2 = this.config;
        String str4 = this.agent_id;
        String strM997toStringimpl = str4 == null ? "null" : CodeAgentId.m997toStringimpl(str4);
        String str5 = this.session_grouping_id;
        String strM1112toStringimpl = str5 != null ? SessionGroupingId.m1112toStringimpl(str5) : "null";
        StringBuilder sbR = kgh.r("CreateSessionV2Params(title=", str, ", environment_id=", str2, ", self_hosted_runner_pool_id=");
        sbR.append(str3);
        sbR.append(", config=");
        sbR.append(sessionConfigV2);
        sbR.append(", agent_id=");
        return vb7.t(sbR, strM997toStringimpl, ", session_grouping_id=", strM1112toStringimpl, ")");
    }

    public /* synthetic */ CreateSessionV2Params(String str, String str2, String str3, SessionConfigV2 sessionConfigV2, String str4, String str5, mq5 mq5Var) {
        this(str, str2, str3, sessionConfigV2, str4, str5);
    }

    public /* synthetic */ CreateSessionV2Params(int i, String str, String str2, String str3, SessionConfigV2 sessionConfigV2, String str4, String str5, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, sessionConfigV2, str4, str5, vnfVar);
    }

    private CreateSessionV2Params(String str, String str2, String str3, SessionConfigV2 sessionConfigV2, String str4, String str5) {
        sessionConfigV2.getClass();
        this.title = str;
        this.environment_id = str2;
        this.self_hosted_runner_pool_id = str3;
        this.config = sessionConfigV2;
        this.agent_id = str4;
        this.session_grouping_id = str5;
    }

    public /* synthetic */ CreateSessionV2Params(String str, String str2, String str3, SessionConfigV2 sessionConfigV2, String str4, String str5, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, sessionConfigV2, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, null);
    }
}
