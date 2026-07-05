package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.mcp.McpToolApprovalOption;
import defpackage.gid;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nlh;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.z0i;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&Jj\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u001eR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010&¨\u0006>"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/ToolUseBlockUpdateDelta;", "Lcom/anthropic/claude/api/chat/messages/ContentBlockDelta;", "", "message", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "display_content", "integration_name", "integration_icon_url", "icon_name", "approval_key", "", "Lcom/anthropic/claude/api/mcp/McpToolApprovalOption;", "approval_options", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/ToolUseBlockUpdateDelta;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/api/chat/messages/ToolUseBlockUpdateDelta;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "getDisplay_content", "getIntegration_name", "getIntegration_icon_url", "getIcon_name", "getApproval_key", "Ljava/util/List;", "getApproval_options", "Companion", "y0i", "z0i", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ToolUseBlockUpdateDelta implements ContentBlockDelta {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final z0i Companion = new z0i();
    private final String approval_key;
    private final List<McpToolApprovalOption> approval_options;
    private final ToolDisplayContent display_content;
    private final String icon_name;
    private final String integration_icon_url;
    private final String integration_name;
    private final String message;

    static {
        nlh nlhVar = new nlh(24);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, nlhVar), null, null, null, null, yb5.w(w1aVar, new nlh(25))};
    }

    public /* synthetic */ ToolUseBlockUpdateDelta(int i, String str, ToolDisplayContent toolDisplayContent, String str2, String str3, String str4, String str5, List list, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i & 2) == 0) {
            this.display_content = null;
        } else {
            this.display_content = toolDisplayContent;
        }
        if ((i & 4) == 0) {
            this.integration_name = null;
        } else {
            this.integration_name = str2;
        }
        if ((i & 8) == 0) {
            this.integration_icon_url = null;
        } else {
            this.integration_icon_url = str3;
        }
        if ((i & 16) == 0) {
            this.icon_name = null;
        } else {
            this.icon_name = str4;
        }
        if ((i & 32) == 0) {
            this.approval_key = null;
        } else {
            this.approval_key = str5;
        }
        if ((i & 64) == 0) {
            this.approval_options = null;
        } else {
            this.approval_options = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ToolDisplayContent.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(McpToolApprovalOption.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToolUseBlockUpdateDelta copy$default(ToolUseBlockUpdateDelta toolUseBlockUpdateDelta, String str, ToolDisplayContent toolDisplayContent, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolUseBlockUpdateDelta.message;
        }
        if ((i & 2) != 0) {
            toolDisplayContent = toolUseBlockUpdateDelta.display_content;
        }
        if ((i & 4) != 0) {
            str2 = toolUseBlockUpdateDelta.integration_name;
        }
        if ((i & 8) != 0) {
            str3 = toolUseBlockUpdateDelta.integration_icon_url;
        }
        if ((i & 16) != 0) {
            str4 = toolUseBlockUpdateDelta.icon_name;
        }
        if ((i & 32) != 0) {
            str5 = toolUseBlockUpdateDelta.approval_key;
        }
        if ((i & 64) != 0) {
            list = toolUseBlockUpdateDelta.approval_options;
        }
        String str6 = str5;
        List list2 = list;
        String str7 = str4;
        String str8 = str2;
        return toolUseBlockUpdateDelta.copy(str, toolDisplayContent, str8, str3, str7, str6, list2);
    }

    public static final /* synthetic */ void write$Self$api(ToolUseBlockUpdateDelta self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 0, srg.a, self.message);
        }
        if (output.E(serialDesc) || self.display_content != null) {
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.display_content);
        }
        if (output.E(serialDesc) || self.integration_name != null) {
            output.B(serialDesc, 2, srg.a, self.integration_name);
        }
        if (output.E(serialDesc) || self.integration_icon_url != null) {
            output.B(serialDesc, 3, srg.a, self.integration_icon_url);
        }
        if (output.E(serialDesc) || self.icon_name != null) {
            output.B(serialDesc, 4, srg.a, self.icon_name);
        }
        if (output.E(serialDesc) || self.approval_key != null) {
            output.B(serialDesc, 5, srg.a, self.approval_key);
        }
        if (!output.E(serialDesc) && self.approval_options == null) {
            return;
        }
        output.B(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.approval_options);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ToolDisplayContent getDisplay_content() {
        return this.display_content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIntegration_name() {
        return this.integration_name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIntegration_icon_url() {
        return this.integration_icon_url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon_name() {
        return this.icon_name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getApproval_key() {
        return this.approval_key;
    }

    public final List<McpToolApprovalOption> component7() {
        return this.approval_options;
    }

    public final ToolUseBlockUpdateDelta copy(String message, ToolDisplayContent display_content, String integration_name, String integration_icon_url, String icon_name, String approval_key, List<? extends McpToolApprovalOption> approval_options) {
        return new ToolUseBlockUpdateDelta(message, display_content, integration_name, integration_icon_url, icon_name, approval_key, approval_options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolUseBlockUpdateDelta)) {
            return false;
        }
        ToolUseBlockUpdateDelta toolUseBlockUpdateDelta = (ToolUseBlockUpdateDelta) other;
        return x44.r(this.message, toolUseBlockUpdateDelta.message) && x44.r(this.display_content, toolUseBlockUpdateDelta.display_content) && x44.r(this.integration_name, toolUseBlockUpdateDelta.integration_name) && x44.r(this.integration_icon_url, toolUseBlockUpdateDelta.integration_icon_url) && x44.r(this.icon_name, toolUseBlockUpdateDelta.icon_name) && x44.r(this.approval_key, toolUseBlockUpdateDelta.approval_key) && x44.r(this.approval_options, toolUseBlockUpdateDelta.approval_options);
    }

    public final String getApproval_key() {
        return this.approval_key;
    }

    public final List<McpToolApprovalOption> getApproval_options() {
        return this.approval_options;
    }

    public final ToolDisplayContent getDisplay_content() {
        return this.display_content;
    }

    public final String getIcon_name() {
        return this.icon_name;
    }

    public final String getIntegration_icon_url() {
        return this.integration_icon_url;
    }

    public final String getIntegration_name() {
        return this.integration_name;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ToolDisplayContent toolDisplayContent = this.display_content;
        int iHashCode2 = (iHashCode + (toolDisplayContent == null ? 0 : toolDisplayContent.hashCode())) * 31;
        String str2 = this.integration_name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.integration_icon_url;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon_name;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.approval_key;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<McpToolApprovalOption> list = this.approval_options;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.message;
        ToolDisplayContent toolDisplayContent = this.display_content;
        String str2 = this.integration_name;
        String str3 = this.integration_icon_url;
        String str4 = this.icon_name;
        String str5 = this.approval_key;
        List<McpToolApprovalOption> list = this.approval_options;
        StringBuilder sb = new StringBuilder("ToolUseBlockUpdateDelta(message=");
        sb.append(str);
        sb.append(", display_content=");
        sb.append(toolDisplayContent);
        sb.append(", integration_name=");
        kgh.u(sb, str2, ", integration_icon_url=", str3, ", icon_name=");
        kgh.u(sb, str4, ", approval_key=", str5, ", approval_options=");
        return gid.q(sb, list, ")");
    }

    public ToolUseBlockUpdateDelta() {
        this((String) null, (ToolDisplayContent) null, (String) null, (String) null, (String) null, (String) null, (List) null, 127, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToolUseBlockUpdateDelta(String str, ToolDisplayContent toolDisplayContent, String str2, String str3, String str4, String str5, List<? extends McpToolApprovalOption> list) {
        this.message = str;
        this.display_content = toolDisplayContent;
        this.integration_name = str2;
        this.integration_icon_url = str3;
        this.icon_name = str4;
        this.approval_key = str5;
        this.approval_options = list;
    }

    public /* synthetic */ ToolUseBlockUpdateDelta(String str, ToolDisplayContent toolDisplayContent, String str2, String str3, String str4, String str5, List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : toolDisplayContent, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : list);
    }
}
