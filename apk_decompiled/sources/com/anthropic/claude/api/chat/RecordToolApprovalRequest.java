package com.anthropic.claude.api.chat;

import com.anthropic.claude.api.mcp.McpToolApprovalOption;
import com.anthropic.claude.types.strings.McpToolApprovalKey;
import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.c1i;
import defpackage.c9e;
import defpackage.d9e;
import defpackage.f7a;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.h4b;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.rod;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'JT\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b\u0005\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b4\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010%R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010'¨\u0006<"}, d2 = {"Lcom/anthropic/claude/api/chat/RecordToolApprovalRequest;", "", "Lcom/anthropic/claude/types/strings/ToolUseId;", "tool_use_id", "", "is_approved", "Lcom/anthropic/claude/types/strings/McpToolApprovalKey;", "approval_key", "Lcom/anthropic/claude/api/mcp/McpToolApprovalOption;", "approval_option", "", "", "params", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/anthropic/claude/api/mcp/McpToolApprovalOption;Ljava/util/Map;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Lcom/anthropic/claude/api/mcp/McpToolApprovalOption;Ljava/util/Map;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/RecordToolApprovalRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-ERU6ZeY", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3-05SLPRs", "component3", "component4", "()Lcom/anthropic/claude/api/mcp/McpToolApprovalOption;", "component5", "()Ljava/util/Map;", "copy-ToWb2n0", "(Ljava/lang/String;ZLjava/lang/String;Lcom/anthropic/claude/api/mcp/McpToolApprovalOption;Ljava/util/Map;)Lcom/anthropic/claude/api/chat/RecordToolApprovalRequest;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_use_id-ERU6ZeY", "Z", "getApproval_key-05SLPRs", "Lcom/anthropic/claude/api/mcp/McpToolApprovalOption;", "getApproval_option", "Ljava/util/Map;", "getParams", "Companion", "c9e", "d9e", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RecordToolApprovalRequest {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final d9e Companion = new d9e();
    private final String approval_key;
    private final McpToolApprovalOption approval_option;
    private final boolean is_approved;
    private final Map<String, String> params;
    private final String tool_use_id;

    static {
        rod rodVar = new rod(24);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, rodVar), yb5.w(w1aVar, new rod(25))};
    }

    private /* synthetic */ RecordToolApprovalRequest(int i, String str, boolean z, String str2, McpToolApprovalOption mcpToolApprovalOption, Map map, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, c9e.a.getDescriptor());
            throw null;
        }
        this.tool_use_id = str;
        this.is_approved = z;
        if ((i & 4) == 0) {
            this.approval_key = null;
        } else {
            this.approval_key = str2;
        }
        if ((i & 8) == 0) {
            this.approval_option = null;
        } else {
            this.approval_option = mcpToolApprovalOption;
        }
        if ((i & 16) == 0) {
            this.params = null;
        } else {
            this.params = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return McpToolApprovalOption.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        srg srgVar = srg.a;
        return new f7a(srgVar, srgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-ToWb2n0$default, reason: not valid java name */
    public static /* synthetic */ RecordToolApprovalRequest m262copyToWb2n0$default(RecordToolApprovalRequest recordToolApprovalRequest, String str, boolean z, String str2, McpToolApprovalOption mcpToolApprovalOption, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recordToolApprovalRequest.tool_use_id;
        }
        if ((i & 2) != 0) {
            z = recordToolApprovalRequest.is_approved;
        }
        if ((i & 4) != 0) {
            str2 = recordToolApprovalRequest.approval_key;
        }
        if ((i & 8) != 0) {
            mcpToolApprovalOption = recordToolApprovalRequest.approval_option;
        }
        if ((i & 16) != 0) {
            map = recordToolApprovalRequest.params;
        }
        Map map2 = map;
        String str3 = str2;
        return recordToolApprovalRequest.m265copyToWb2n0(str, z, str3, mcpToolApprovalOption, map2);
    }

    public static final /* synthetic */ void write$Self$api(RecordToolApprovalRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, c1i.a, ToolUseId.m1157boximpl(self.tool_use_id));
        output.p(serialDesc, 1, self.is_approved);
        if (output.E(serialDesc) || self.approval_key != null) {
            h4b h4bVar = h4b.a;
            String str = self.approval_key;
            output.B(serialDesc, 2, h4bVar, str != null ? McpToolApprovalKey.m1036boximpl(str) : null);
        }
        if (output.E(serialDesc) || self.approval_option != null) {
            output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.approval_option);
        }
        if (!output.E(serialDesc) && self.params == null) {
            return;
        }
        output.B(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.params);
    }

    /* JADX INFO: renamed from: component1-ERU6ZeY, reason: not valid java name and from getter */
    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIs_approved() {
        return this.is_approved;
    }

    /* JADX INFO: renamed from: component3-05SLPRs, reason: not valid java name and from getter */
    public final String getApproval_key() {
        return this.approval_key;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final McpToolApprovalOption getApproval_option() {
        return this.approval_option;
    }

    public final Map<String, String> component5() {
        return this.params;
    }

    /* JADX INFO: renamed from: copy-ToWb2n0, reason: not valid java name */
    public final RecordToolApprovalRequest m265copyToWb2n0(String tool_use_id, boolean is_approved, String approval_key, McpToolApprovalOption approval_option, Map<String, String> params) {
        tool_use_id.getClass();
        return new RecordToolApprovalRequest(tool_use_id, is_approved, approval_key, approval_option, params, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.chat.RecordToolApprovalRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.chat.RecordToolApprovalRequest r5 = (com.anthropic.claude.api.chat.RecordToolApprovalRequest) r5
            java.lang.String r1 = r4.tool_use_id
            java.lang.String r3 = r5.tool_use_id
            boolean r1 = com.anthropic.claude.types.strings.ToolUseId.m1160equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            boolean r1 = r4.is_approved
            boolean r3 = r5.is_approved
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.approval_key
            java.lang.String r3 = r5.approval_key
            if (r1 != 0) goto L2a
            if (r3 != 0) goto L28
            r1 = r0
            goto L31
        L28:
            r1 = r2
            goto L31
        L2a:
            if (r3 != 0) goto L2d
            goto L28
        L2d:
            boolean r1 = com.anthropic.claude.types.strings.McpToolApprovalKey.m1039equalsimpl0(r1, r3)
        L31:
            if (r1 != 0) goto L34
            return r2
        L34:
            com.anthropic.claude.api.mcp.McpToolApprovalOption r1 = r4.approval_option
            com.anthropic.claude.api.mcp.McpToolApprovalOption r3 = r5.approval_option
            if (r1 == r3) goto L3b
            return r2
        L3b:
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.params
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.params
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L46
            return r2
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.RecordToolApprovalRequest.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getApproval_key-05SLPRs, reason: not valid java name */
    public final String m266getApproval_key05SLPRs() {
        return this.approval_key;
    }

    public final McpToolApprovalOption getApproval_option() {
        return this.approval_option;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    /* JADX INFO: renamed from: getTool_use_id-ERU6ZeY, reason: not valid java name */
    public final String m267getTool_use_idERU6ZeY() {
        return this.tool_use_id;
    }

    public int hashCode() {
        int iP = fsh.p(ToolUseId.m1161hashCodeimpl(this.tool_use_id) * 31, 31, this.is_approved);
        String str = this.approval_key;
        int iM1040hashCodeimpl = (iP + (str == null ? 0 : McpToolApprovalKey.m1040hashCodeimpl(str))) * 31;
        McpToolApprovalOption mcpToolApprovalOption = this.approval_option;
        int iHashCode = (iM1040hashCodeimpl + (mcpToolApprovalOption == null ? 0 : mcpToolApprovalOption.hashCode())) * 31;
        Map<String, String> map = this.params;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final boolean is_approved() {
        return this.is_approved;
    }

    public String toString() {
        String strM1162toStringimpl = ToolUseId.m1162toStringimpl(this.tool_use_id);
        boolean z = this.is_approved;
        String str = this.approval_key;
        String strM1041toStringimpl = str == null ? "null" : McpToolApprovalKey.m1041toStringimpl(str);
        McpToolApprovalOption mcpToolApprovalOption = this.approval_option;
        Map<String, String> map = this.params;
        StringBuilder sb = new StringBuilder("RecordToolApprovalRequest(tool_use_id=");
        sb.append(strM1162toStringimpl);
        sb.append(", is_approved=");
        sb.append(z);
        sb.append(", approval_key=");
        sb.append(strM1041toStringimpl);
        sb.append(", approval_option=");
        sb.append(mcpToolApprovalOption);
        sb.append(", params=");
        return qy1.i(sb, map, ")");
    }

    public /* synthetic */ RecordToolApprovalRequest(String str, boolean z, String str2, McpToolApprovalOption mcpToolApprovalOption, Map map, mq5 mq5Var) {
        this(str, z, str2, mcpToolApprovalOption, map);
    }

    public /* synthetic */ RecordToolApprovalRequest(int i, String str, boolean z, String str2, McpToolApprovalOption mcpToolApprovalOption, Map map, vnf vnfVar, mq5 mq5Var) {
        this(i, str, z, str2, mcpToolApprovalOption, map, vnfVar);
    }

    private RecordToolApprovalRequest(String str, boolean z, String str2, McpToolApprovalOption mcpToolApprovalOption, Map<String, String> map) {
        str.getClass();
        this.tool_use_id = str;
        this.is_approved = z;
        this.approval_key = str2;
        this.approval_option = mcpToolApprovalOption;
        this.params = map;
    }

    public /* synthetic */ RecordToolApprovalRequest(String str, boolean z, String str2, McpToolApprovalOption mcpToolApprovalOption, Map map, int i, mq5 mq5Var) {
        this(str, z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : mcpToolApprovalOption, (i & 16) != 0 ? null : map, null);
    }
}
