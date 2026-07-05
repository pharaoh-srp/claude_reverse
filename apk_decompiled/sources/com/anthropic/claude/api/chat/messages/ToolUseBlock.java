package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolUseInput;
import com.anthropic.claude.api.mcp.McpToolApprovalOption;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.dhb;
import defpackage.f1i;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nlh;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w0i;
import defpackage.w1a;
import defpackage.x0i;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`aBÛ\u0001\u0012\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eB³\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J'\u0010$\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010(J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b/\u0010(J\u0012\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b0\u0010(J\u0012\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b1\u0010(J\u0012\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b2\u0010(J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b7\u00108Jê\u0001\u00109\u001a\u00020\u00002\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b;\u0010(J\u0010\u0010<\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020\u00182\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AJ'\u0010J\u001a\u00020G2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0001¢\u0006\u0004\bH\u0010IR1\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u0010%R1\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bM\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bO\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bP\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\bR\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\bS\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010T\u001a\u0004\bU\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\bV\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bW\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\bX\u0010(R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\bY\u0010(R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010Z\u001a\u0004\b[\u00104R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\\\u001a\u0004\b\u0019\u00106R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010]\u001a\u0004\b^\u00108¨\u0006b"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/ToolUseBlock;", "Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "start_timestamp", "stop_timestamp", "", "name", "id", "Lcom/anthropic/claude/api/chat/tool/ToolUseInput;", "input", "message", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "display_content", "integration_name", "integration_icon_url", "icon_name", "approval_key", "", "Lcom/anthropic/claude/api/mcp/McpToolApprovalOption;", "approval_options", "", "is_mcp_app", "", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "flags", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolUseInput;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Set;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolUseInput;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Set;Lvnf;)V", "component1", "()Ljava/util/Date;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/anthropic/claude/api/chat/tool/ToolUseInput;", "component6", "component7", "()Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "component8", "component9", "component10", "component11", "component12", "()Ljava/util/List;", "component13", "()Ljava/lang/Boolean;", "component14", "()Ljava/util/Set;", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolUseInput;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Set;)Lcom/anthropic/claude/api/chat/messages/ToolUseBlock;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/ToolUseBlock;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/Date;", "getStart_timestamp", "getStop_timestamp", "Ljava/lang/String;", "getName", "getId", "Lcom/anthropic/claude/api/chat/tool/ToolUseInput;", "getInput", "getMessage", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "getDisplay_content", "getIntegration_name", "getIntegration_icon_url", "getIcon_name", "getApproval_key", "Ljava/util/List;", "getApproval_options", "Ljava/lang/Boolean;", "Ljava/util/Set;", "getFlags", "Companion", "w0i", "x0i", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ToolUseBlock implements ContentBlock {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final x0i Companion = new x0i();
    private final String approval_key;
    private final List<McpToolApprovalOption> approval_options;
    private final ToolDisplayContent display_content;
    private final Set<MessageFlag> flags;
    private final String icon_name;
    private final String id;
    private final ToolUseInput input;
    private final String integration_icon_url;
    private final String integration_name;
    private final Boolean is_mcp_app;
    private final String message;
    private final String name;
    private final Date start_timestamp;
    private final Date stop_timestamp;

    static {
        nlh nlhVar = new nlh(21);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, null, yb5.w(w1aVar, nlhVar), null, null, null, null, yb5.w(w1aVar, new nlh(22)), null, yb5.w(w1aVar, new nlh(23))};
    }

    public /* synthetic */ ToolUseBlock(int i, Date date, Date date2, String str, String str2, ToolUseInput toolUseInput, String str3, ToolDisplayContent toolDisplayContent, String str4, String str5, String str6, String str7, List list, Boolean bool, Set set, vnf vnfVar) {
        if (28 != (i & 28)) {
            gvj.f(i, 28, w0i.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.start_timestamp = null;
        } else {
            this.start_timestamp = date;
        }
        if ((i & 2) == 0) {
            this.stop_timestamp = null;
        } else {
            this.stop_timestamp = date2;
        }
        this.name = str;
        this.id = str2;
        this.input = toolUseInput;
        if ((i & 32) == 0) {
            this.message = null;
        } else {
            this.message = str3;
        }
        if ((i & 64) == 0) {
            this.display_content = null;
        } else {
            this.display_content = toolDisplayContent;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.integration_name = null;
        } else {
            this.integration_name = str4;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.integration_icon_url = null;
        } else {
            this.integration_icon_url = str5;
        }
        if ((i & 512) == 0) {
            this.icon_name = null;
        } else {
            this.icon_name = str6;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.approval_key = null;
        } else {
            this.approval_key = str7;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.approval_options = null;
        } else {
            this.approval_options = list;
        }
        this.is_mcp_app = (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? Boolean.FALSE : bool;
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.flags = null;
        } else {
            this.flags = set;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new uo0(dhb.a, 1);
    }

    public static final /* synthetic */ void write$Self$api(ToolUseBlock self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.getStart_timestamp() != null) {
            output.B(serialDesc, 0, bc9.a, self.getStart_timestamp());
        }
        if (output.E(serialDesc) || self.getStop_timestamp() != null) {
            output.B(serialDesc, 1, bc9.a, self.getStop_timestamp());
        }
        output.q(serialDesc, 2, self.name);
        srg srgVar = srg.a;
        output.B(serialDesc, 3, srgVar, self.id);
        output.r(serialDesc, 4, f1i.a, self.input);
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 5, srgVar, self.message);
        }
        if (output.E(serialDesc) || self.display_content != null) {
            output.B(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.display_content);
        }
        if (output.E(serialDesc) || self.integration_name != null) {
            output.B(serialDesc, 7, srgVar, self.integration_name);
        }
        if (output.E(serialDesc) || self.integration_icon_url != null) {
            output.B(serialDesc, 8, srgVar, self.integration_icon_url);
        }
        if (output.E(serialDesc) || self.icon_name != null) {
            output.B(serialDesc, 9, srgVar, self.icon_name);
        }
        if (output.E(serialDesc) || self.approval_key != null) {
            output.B(serialDesc, 10, srgVar, self.approval_key);
        }
        if (output.E(serialDesc) || self.approval_options != null) {
            output.B(serialDesc, 11, (znf) kw9VarArr[11].getValue(), self.approval_options);
        }
        if (output.E(serialDesc) || !x44.r(self.is_mcp_app, Boolean.FALSE)) {
            output.B(serialDesc, 12, zt1.a, self.is_mcp_app);
        }
        if (!output.E(serialDesc) && self.getFlags() == null) {
            return;
        }
        output.B(serialDesc, 13, (znf) kw9VarArr[13].getValue(), self.getFlags());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getStart_timestamp() {
        return this.start_timestamp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIcon_name() {
        return this.icon_name;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getApproval_key() {
        return this.approval_key;
    }

    public final List<McpToolApprovalOption> component12() {
        return this.approval_options;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getIs_mcp_app() {
        return this.is_mcp_app;
    }

    public final Set<MessageFlag> component14() {
        return this.flags;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getStop_timestamp() {
        return this.stop_timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ToolUseInput getInput() {
        return this.input;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ToolDisplayContent getDisplay_content() {
        return this.display_content;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIntegration_name() {
        return this.integration_name;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIntegration_icon_url() {
        return this.integration_icon_url;
    }

    public final ToolUseBlock copy(Date start_timestamp, Date stop_timestamp, String name, String id, ToolUseInput input, String message, ToolDisplayContent display_content, String integration_name, String integration_icon_url, String icon_name, String approval_key, List<? extends McpToolApprovalOption> approval_options, Boolean is_mcp_app, Set<? extends MessageFlag> flags) {
        name.getClass();
        input.getClass();
        return new ToolUseBlock(start_timestamp, stop_timestamp, name, id, input, message, display_content, integration_name, integration_icon_url, icon_name, approval_key, approval_options, is_mcp_app, flags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolUseBlock)) {
            return false;
        }
        ToolUseBlock toolUseBlock = (ToolUseBlock) other;
        return x44.r(this.start_timestamp, toolUseBlock.start_timestamp) && x44.r(this.stop_timestamp, toolUseBlock.stop_timestamp) && x44.r(this.name, toolUseBlock.name) && x44.r(this.id, toolUseBlock.id) && x44.r(this.input, toolUseBlock.input) && x44.r(this.message, toolUseBlock.message) && x44.r(this.display_content, toolUseBlock.display_content) && x44.r(this.integration_name, toolUseBlock.integration_name) && x44.r(this.integration_icon_url, toolUseBlock.integration_icon_url) && x44.r(this.icon_name, toolUseBlock.icon_name) && x44.r(this.approval_key, toolUseBlock.approval_key) && x44.r(this.approval_options, toolUseBlock.approval_options) && x44.r(this.is_mcp_app, toolUseBlock.is_mcp_app) && x44.r(this.flags, toolUseBlock.flags);
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

    @Override // com.anthropic.claude.api.chat.messages.ContentBlock
    public Set<MessageFlag> getFlags() {
        return this.flags;
    }

    public final String getIcon_name() {
        return this.icon_name;
    }

    public final String getId() {
        return this.id;
    }

    public final ToolUseInput getInput() {
        return this.input;
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

    public final String getName() {
        return this.name;
    }

    @Override // com.anthropic.claude.api.chat.messages.ContentBlock
    public Date getStart_timestamp() {
        return this.start_timestamp;
    }

    @Override // com.anthropic.claude.api.chat.messages.ContentBlock
    public Date getStop_timestamp() {
        return this.stop_timestamp;
    }

    public int hashCode() {
        Date date = this.start_timestamp;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.stop_timestamp;
        int iL = kgh.l((iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31, 31, this.name);
        String str = this.id;
        int iHashCode2 = (this.input.hashCode() + ((iL + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.message;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ToolDisplayContent toolDisplayContent = this.display_content;
        int iHashCode4 = (iHashCode3 + (toolDisplayContent == null ? 0 : toolDisplayContent.hashCode())) * 31;
        String str3 = this.integration_name;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.integration_icon_url;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon_name;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.approval_key;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<McpToolApprovalOption> list = this.approval_options;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.is_mcp_app;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Set<MessageFlag> set = this.flags;
        return iHashCode10 + (set != null ? set.hashCode() : 0);
    }

    public final Boolean is_mcp_app() {
        return this.is_mcp_app;
    }

    public String toString() {
        Date date = this.start_timestamp;
        Date date2 = this.stop_timestamp;
        String str = this.name;
        String str2 = this.id;
        ToolUseInput toolUseInput = this.input;
        String str3 = this.message;
        ToolDisplayContent toolDisplayContent = this.display_content;
        String str4 = this.integration_name;
        String str5 = this.integration_icon_url;
        String str6 = this.icon_name;
        String str7 = this.approval_key;
        List<McpToolApprovalOption> list = this.approval_options;
        Boolean bool = this.is_mcp_app;
        Set<MessageFlag> set = this.flags;
        StringBuilder sb = new StringBuilder("ToolUseBlock(start_timestamp=");
        sb.append(date);
        sb.append(", stop_timestamp=");
        sb.append(date2);
        sb.append(", name=");
        kgh.u(sb, str, ", id=", str2, ", input=");
        sb.append(toolUseInput);
        sb.append(", message=");
        sb.append(str3);
        sb.append(", display_content=");
        sb.append(toolDisplayContent);
        sb.append(", integration_name=");
        sb.append(str4);
        sb.append(", integration_icon_url=");
        kgh.u(sb, str5, ", icon_name=", str6, ", approval_key=");
        qy1.p(str7, ", approval_options=", ", is_mcp_app=", sb, list);
        sb.append(bool);
        sb.append(", flags=");
        sb.append(set);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToolUseBlock(Date date, Date date2, String str, String str2, ToolUseInput toolUseInput, String str3, ToolDisplayContent toolDisplayContent, String str4, String str5, String str6, String str7, List<? extends McpToolApprovalOption> list, Boolean bool, Set<? extends MessageFlag> set) {
        str.getClass();
        toolUseInput.getClass();
        this.start_timestamp = date;
        this.stop_timestamp = date2;
        this.name = str;
        this.id = str2;
        this.input = toolUseInput;
        this.message = str3;
        this.display_content = toolDisplayContent;
        this.integration_name = str4;
        this.integration_icon_url = str5;
        this.icon_name = str6;
        this.approval_key = str7;
        this.approval_options = list;
        this.is_mcp_app = bool;
        this.flags = set;
    }

    public /* synthetic */ ToolUseBlock(Date date, Date date2, String str, String str2, ToolUseInput toolUseInput, String str3, ToolDisplayContent toolDisplayContent, String str4, String str5, String str6, String str7, List list, Boolean bool, Set set, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : date, (i & 2) != 0 ? null : date2, str, str2, toolUseInput, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : toolDisplayContent, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str4, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : str7, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : list, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? Boolean.FALSE : bool, (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : set);
    }
}
