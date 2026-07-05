package com.anthropic.claude.chat.parse;

import com.anthropic.claude.api.chat.messages.MessageFlag;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.blc;
import defpackage.d54;
import defpackage.dhb;
import defpackage.dtc;
import defpackage.etc;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mtc;
import defpackage.onf;
import defpackage.qxh;
import defpackage.um6;
import defpackage.uo0;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0002ijB\u009b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B³\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u0018\u0010!J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b4\u00105J¨\u0001\u00107\u001a\u0002062\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b9\u0010%J\u0010\u0010:\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010>\u001a\u00020\u000e2\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b>\u0010?J'\u0010H\u001a\u00020E2\u0006\u0010@\u001a\u0002062\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0001¢\u0006\u0004\bF\u0010GR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010I\u001a\u0004\bJ\u0010#R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010K\u001a\u0004\bL\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bM\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bN\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bO\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bP\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bR\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\bS\u0010+R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010T\u001a\u0004\b\u000f\u0010.R\u001a\u0010\u0010\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010T\u001a\u0004\b\u0010\u0010.R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010U\u001a\u0004\bV\u00101R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010W\u001a\u0004\bX\u00103R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010Y\u001a\u0004\bZ\u00105R\u001a\u0010\u001c\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010K\u001a\u0004\b[\u0010%R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\\\u001a\u0004\b]\u0010^R\u0016\u0010a\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0016\u0010e\u001a\u0004\u0018\u00010b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010.¨\u0006k"}, d2 = {"com/anthropic/claude/chat/parse/ParsedContentBlock$McpToolInvocation", "Lmtc;", "Lqxh;", "Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "id", "", "toolName", "messageText", "iconName", "integrationName", "integrationIconUrl", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "inputDisplayContent", "outputDisplayContent", "", "isComplete", "isError", "", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "flags", "Lkotlinx/serialization/json/JsonObject;", "inputArgs", "Lcom/anthropic/claude/chat/parse/MemoryToolSummary;", "memorySummary", "<init>", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;ZZLjava/util/Set;Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/chat/parse/MemoryToolSummary;)V", "", "seen0", "body", "", "messageSubText", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/chat/parse/ParsedContentBlockId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;ZZLjava/util/Set;Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/chat/parse/MemoryToolSummary;Ljava/lang/String;Ljava/lang/Void;Lvnf;)V", "component1", "()Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "component8", "component9", "()Z", "component10", "component11", "()Ljava/util/Set;", "component12", "()Lkotlinx/serialization/json/JsonObject;", "component13", "()Lcom/anthropic/claude/chat/parse/MemoryToolSummary;", "Lcom/anthropic/claude/chat/parse/ParsedContentBlock$McpToolInvocation;", "copy", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;ZZLjava/util/Set;Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/chat/parse/MemoryToolSummary;)Lcom/anthropic/claude/chat/parse/ParsedContentBlock$McpToolInvocation;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_chat_parse", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlock$McpToolInvocation;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "getId", "Ljava/lang/String;", "getToolName", "getMessageText", "getIconName", "getIntegrationName", "getIntegrationIconUrl", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "getInputDisplayContent", "getOutputDisplayContent", "Z", "Ljava/util/Set;", "getFlags", "Lkotlinx/serialization/json/JsonObject;", "getInputArgs", "Lcom/anthropic/claude/chat/parse/MemoryToolSummary;", "getMemorySummary", "getBody", "Ljava/lang/Void;", "getMessageSubText", "()Ljava/lang/Void;", "getToolIconResId", "()Ljava/lang/Integer;", "toolIconResId", "Ld54;", "getToolIconTint-QN2ZGVo", "()Ld54;", "toolIconTint", "getCanBeCollapsed", "canBeCollapsed", "Companion", "dtc", "etc", "Claude.chat:parse"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ParsedContentBlock$McpToolInvocation implements mtc, qxh {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final etc Companion = new etc();
    private final String body;
    private final Set<MessageFlag> flags;
    private final String iconName;
    private final ParsedContentBlockId id;
    private final JsonObject inputArgs;
    private final ToolDisplayContent inputDisplayContent;
    private final String integrationIconUrl;
    private final String integrationName;
    private final boolean isComplete;
    private final boolean isError;
    private final MemoryToolSummary memorySummary;
    private final Void messageSubText;
    private final String messageText;
    private final ToolDisplayContent outputDisplayContent;
    private final String toolName;

    static {
        blc blcVar = new blc(4);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, null, yb5.w(w1aVar, blcVar), yb5.w(w1aVar, new blc(5)), null, null, yb5.w(w1aVar, new blc(6)), null, null, null, null};
    }

    public /* synthetic */ ParsedContentBlock$McpToolInvocation(int i, ParsedContentBlockId parsedContentBlockId, String str, String str2, String str3, String str4, String str5, ToolDisplayContent toolDisplayContent, ToolDisplayContent toolDisplayContent2, boolean z, boolean z2, Set set, JsonObject jsonObject, MemoryToolSummary memoryToolSummary, String str6, Void r19, vnf vnfVar) {
        String messageText;
        if (3 != (i & 3)) {
            gvj.f(i, 3, dtc.a.getDescriptor());
            throw null;
        }
        this.id = parsedContentBlockId;
        this.toolName = str;
        if ((i & 4) == 0) {
            this.messageText = null;
        } else {
            this.messageText = str2;
        }
        if ((i & 8) == 0) {
            this.iconName = null;
        } else {
            this.iconName = str3;
        }
        if ((i & 16) == 0) {
            this.integrationName = null;
        } else {
            this.integrationName = str4;
        }
        if ((i & 32) == 0) {
            this.integrationIconUrl = null;
        } else {
            this.integrationIconUrl = str5;
        }
        if ((i & 64) == 0) {
            this.inputDisplayContent = null;
        } else {
            this.inputDisplayContent = toolDisplayContent;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.outputDisplayContent = null;
        } else {
            this.outputDisplayContent = toolDisplayContent2;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.isComplete = false;
        } else {
            this.isComplete = z;
        }
        if ((i & 512) == 0) {
            this.isError = false;
        } else {
            this.isError = z2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.flags = um6.E;
        } else {
            this.flags = set;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.inputArgs = null;
        } else {
            this.inputArgs = jsonObject;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.memorySummary = null;
        } else {
            this.memorySummary = memoryToolSummary;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            messageText = getMessageText();
            if (messageText == null) {
                messageText = getToolName();
            }
        } else {
            messageText = str6;
        }
        this.body = messageText;
        if ((i & 16384) == 0) {
            this.messageSubText = null;
        } else {
            this.messageSubText = r19;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ToolDisplayContent.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ToolDisplayContent.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new uo0(dhb.a, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParsedContentBlock$McpToolInvocation copy$default(ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation, ParsedContentBlockId parsedContentBlockId, String str, String str2, String str3, String str4, String str5, ToolDisplayContent toolDisplayContent, ToolDisplayContent toolDisplayContent2, boolean z, boolean z2, Set set, JsonObject jsonObject, MemoryToolSummary memoryToolSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            parsedContentBlockId = parsedContentBlock$McpToolInvocation.id;
        }
        return parsedContentBlock$McpToolInvocation.copy(parsedContentBlockId, (i & 2) != 0 ? parsedContentBlock$McpToolInvocation.toolName : str, (i & 4) != 0 ? parsedContentBlock$McpToolInvocation.messageText : str2, (i & 8) != 0 ? parsedContentBlock$McpToolInvocation.iconName : str3, (i & 16) != 0 ? parsedContentBlock$McpToolInvocation.integrationName : str4, (i & 32) != 0 ? parsedContentBlock$McpToolInvocation.integrationIconUrl : str5, (i & 64) != 0 ? parsedContentBlock$McpToolInvocation.inputDisplayContent : toolDisplayContent, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? parsedContentBlock$McpToolInvocation.outputDisplayContent : toolDisplayContent2, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? parsedContentBlock$McpToolInvocation.isComplete : z, (i & 512) != 0 ? parsedContentBlock$McpToolInvocation.isError : z2, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? parsedContentBlock$McpToolInvocation.flags : set, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? parsedContentBlock$McpToolInvocation.inputArgs : jsonObject, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? parsedContentBlock$McpToolInvocation.memorySummary : memoryToolSummary);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$Claude_chat_parse(com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation r4, defpackage.vd4 r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation.write$Self$Claude_chat_parse(com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation, vd4, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ParsedContentBlockId getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public final Set<MessageFlag> component11() {
        return this.flags;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final JsonObject getInputArgs() {
        return this.inputArgs;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final MemoryToolSummary getMemorySummary() {
        return this.memorySummary;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToolName() {
        return this.toolName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessageText() {
        return this.messageText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIntegrationName() {
        return this.integrationName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIntegrationIconUrl() {
        return this.integrationIconUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ToolDisplayContent getInputDisplayContent() {
        return this.inputDisplayContent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ToolDisplayContent getOutputDisplayContent() {
        return this.outputDisplayContent;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    public final ParsedContentBlock$McpToolInvocation copy(ParsedContentBlockId id, String toolName, String messageText, String iconName, String integrationName, String integrationIconUrl, ToolDisplayContent inputDisplayContent, ToolDisplayContent outputDisplayContent, boolean isComplete, boolean isError, Set<? extends MessageFlag> flags, JsonObject inputArgs, MemoryToolSummary memorySummary) {
        id.getClass();
        toolName.getClass();
        flags.getClass();
        return new ParsedContentBlock$McpToolInvocation(id, toolName, messageText, iconName, integrationName, integrationIconUrl, inputDisplayContent, outputDisplayContent, isComplete, isError, flags, inputArgs, memorySummary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedContentBlock$McpToolInvocation)) {
            return false;
        }
        ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation = (ParsedContentBlock$McpToolInvocation) other;
        return x44.r(this.id, parsedContentBlock$McpToolInvocation.id) && x44.r(this.toolName, parsedContentBlock$McpToolInvocation.toolName) && x44.r(this.messageText, parsedContentBlock$McpToolInvocation.messageText) && x44.r(this.iconName, parsedContentBlock$McpToolInvocation.iconName) && x44.r(this.integrationName, parsedContentBlock$McpToolInvocation.integrationName) && x44.r(this.integrationIconUrl, parsedContentBlock$McpToolInvocation.integrationIconUrl) && x44.r(this.inputDisplayContent, parsedContentBlock$McpToolInvocation.inputDisplayContent) && x44.r(this.outputDisplayContent, parsedContentBlock$McpToolInvocation.outputDisplayContent) && this.isComplete == parsedContentBlock$McpToolInvocation.isComplete && this.isError == parsedContentBlock$McpToolInvocation.isError && x44.r(this.flags, parsedContentBlock$McpToolInvocation.flags) && x44.r(this.inputArgs, parsedContentBlock$McpToolInvocation.inputArgs) && x44.r(this.memorySummary, parsedContentBlock$McpToolInvocation.memorySummary);
    }

    @Override // defpackage.mtc
    public String getBody() {
        return this.body;
    }

    @Override // defpackage.qxh
    public boolean getCanBeCollapsed() {
        return true;
    }

    public final Set<MessageFlag> getFlags() {
        return this.flags;
    }

    @Override // defpackage.qxh
    public String getIconName() {
        return this.iconName;
    }

    @Override // defpackage.vf8
    public ParsedContentBlockId getId() {
        return this.id;
    }

    public final JsonObject getInputArgs() {
        return this.inputArgs;
    }

    public final ToolDisplayContent getInputDisplayContent() {
        return this.inputDisplayContent;
    }

    @Override // defpackage.qxh
    public String getIntegrationIconUrl() {
        return this.integrationIconUrl;
    }

    @Override // defpackage.qxh
    public String getIntegrationName() {
        return this.integrationName;
    }

    public final MemoryToolSummary getMemorySummary() {
        return this.memorySummary;
    }

    @Override // defpackage.qxh
    public /* bridge */ /* synthetic */ String getMessageSubText() {
        return (String) getMessageSubText();
    }

    @Override // defpackage.qxh
    public String getMessageText() {
        return this.messageText;
    }

    public final ToolDisplayContent getOutputDisplayContent() {
        return this.outputDisplayContent;
    }

    @Override // defpackage.qxh
    public Integer getToolIconResId() {
        return null;
    }

    @Override // defpackage.qxh
    /* JADX INFO: renamed from: getToolIconTint-QN2ZGVo, reason: not valid java name */
    public d54 mo681getToolIconTintQN2ZGVo() {
        return null;
    }

    @Override // defpackage.qxh
    public String getToolName() {
        return this.toolName;
    }

    @Override // defpackage.mtc
    public /* bridge */ boolean hasSources() {
        return super.hasSources();
    }

    public int hashCode() {
        int iL = kgh.l(this.id.hashCode() * 31, 31, this.toolName);
        String str = this.messageText;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.integrationName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.integrationIconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ToolDisplayContent toolDisplayContent = this.inputDisplayContent;
        int iHashCode5 = (iHashCode4 + (toolDisplayContent == null ? 0 : toolDisplayContent.hashCode())) * 31;
        ToolDisplayContent toolDisplayContent2 = this.outputDisplayContent;
        int iHashCode6 = (this.flags.hashCode() + fsh.p(fsh.p((iHashCode5 + (toolDisplayContent2 == null ? 0 : toolDisplayContent2.hashCode())) * 31, 31, this.isComplete), 31, this.isError)) * 31;
        JsonObject jsonObject = this.inputArgs;
        int iHashCode7 = (iHashCode6 + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        MemoryToolSummary memoryToolSummary = this.memorySummary;
        return iHashCode7 + (memoryToolSummary != null ? memoryToolSummary.hashCode() : 0);
    }

    @Override // defpackage.mtc, defpackage.qf8
    /* JADX INFO: renamed from: isComplete */
    public boolean getIsComplete() {
        return this.isComplete;
    }

    @Override // defpackage.uf8
    public boolean isError() {
        return this.isError;
    }

    public String toString() {
        ParsedContentBlockId parsedContentBlockId = this.id;
        String str = this.toolName;
        String str2 = this.messageText;
        String str3 = this.iconName;
        String str4 = this.integrationName;
        String str5 = this.integrationIconUrl;
        ToolDisplayContent toolDisplayContent = this.inputDisplayContent;
        ToolDisplayContent toolDisplayContent2 = this.outputDisplayContent;
        boolean z = this.isComplete;
        boolean z2 = this.isError;
        Set<MessageFlag> set = this.flags;
        JsonObject jsonObject = this.inputArgs;
        MemoryToolSummary memoryToolSummary = this.memorySummary;
        StringBuilder sb = new StringBuilder("McpToolInvocation(id=");
        sb.append(parsedContentBlockId);
        sb.append(", toolName=");
        sb.append(str);
        sb.append(", messageText=");
        kgh.u(sb, str2, ", iconName=", str3, ", integrationName=");
        kgh.u(sb, str4, ", integrationIconUrl=", str5, ", inputDisplayContent=");
        sb.append(toolDisplayContent);
        sb.append(", outputDisplayContent=");
        sb.append(toolDisplayContent2);
        sb.append(", isComplete=");
        ij0.A(sb, z, ", isError=", z2, ", flags=");
        sb.append(set);
        sb.append(", inputArgs=");
        sb.append(jsonObject);
        sb.append(", memorySummary=");
        sb.append(memoryToolSummary);
        sb.append(")");
        return sb.toString();
    }

    public Void getMessageSubText() {
        return this.messageSubText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParsedContentBlock$McpToolInvocation(ParsedContentBlockId parsedContentBlockId, String str, String str2, String str3, String str4, String str5, ToolDisplayContent toolDisplayContent, ToolDisplayContent toolDisplayContent2, boolean z, boolean z2, Set<? extends MessageFlag> set, JsonObject jsonObject, MemoryToolSummary memoryToolSummary) {
        parsedContentBlockId.getClass();
        str.getClass();
        set.getClass();
        this.id = parsedContentBlockId;
        this.toolName = str;
        this.messageText = str2;
        this.iconName = str3;
        this.integrationName = str4;
        this.integrationIconUrl = str5;
        this.inputDisplayContent = toolDisplayContent;
        this.outputDisplayContent = toolDisplayContent2;
        this.isComplete = z;
        this.isError = z2;
        this.flags = set;
        this.inputArgs = jsonObject;
        this.memorySummary = memoryToolSummary;
        String messageText = getMessageText();
        this.body = messageText == null ? getToolName() : messageText;
    }

    public /* synthetic */ ParsedContentBlock$McpToolInvocation(ParsedContentBlockId parsedContentBlockId, String str, String str2, String str3, String str4, String str5, ToolDisplayContent toolDisplayContent, ToolDisplayContent toolDisplayContent2, boolean z, boolean z2, Set set, JsonObject jsonObject, MemoryToolSummary memoryToolSummary, int i, mq5 mq5Var) {
        this(parsedContentBlockId, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : toolDisplayContent, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : toolDisplayContent2, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? um6.E : set, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : jsonObject, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : memoryToolSummary);
    }
}
