package com.anthropic.claude.api.chat;

import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.types.strings.FileId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ehb;
import defpackage.emh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.meb;
import defpackage.mge;
import defpackage.mq5;
import defpackage.ms6;
import defpackage.o49;
import defpackage.oi7;
import defpackage.onf;
import defpackage.pk2;
import defpackage.pm2;
import defpackage.qm2;
import defpackage.qy1;
import defpackage.s0i;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x55;
import defpackage.yb5;
import defpackage.zlh;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0002]^B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cBµ\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0012\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b.\u0010#J\u0012\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b2\u0010'J\u0012\u00104\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b3\u0010#J\u0012\u00106\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b5\u0010#Jº\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010#J\u0010\u0010;\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@J'\u0010I\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0001¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010J\u001a\u0004\bL\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bM\u0010#R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010N\u001a\u0004\bO\u0010'R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bP\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bR\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\bT\u0010,R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\bU\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bV\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010W\u001a\u0004\bX\u00101R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010N\u001a\u0004\bY\u0010'R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\bZ\u0010#R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010J\u001a\u0004\b[\u0010#¨\u0006_"}, d2 = {"Lcom/anthropic/claude/api/chat/ChatCompletionRequest;", "", "", "prompt", "timezone", "model", "", "Lcom/anthropic/claude/api/chat/MessageAttachment;", "attachments", "Lcom/anthropic/claude/types/strings/FileId;", "files", "Lcom/anthropic/claude/api/chat/RenderingMode;", "rendering_mode", "Lcom/anthropic/claude/api/chat/InputMode;", "input_mode", "Lcom/anthropic/claude/api/chat/tool/Tool;", "tools", "Lcom/anthropic/claude/types/strings/MessageId;", "parent_message_uuid", "Lcom/anthropic/claude/api/chat/CreateChatRequest;", "create_conversation_params", "Lcom/anthropic/claude/api/chat/ToolState;", "tool_states", "Lcom/anthropic/claude/types/strings/ThinkingEffort;", "effort", "Lcom/anthropic/claude/types/strings/ThinkingMode;", "thinking_mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/anthropic/claude/api/chat/RenderingMode;Lcom/anthropic/claude/api/chat/InputMode;Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/api/chat/CreateChatRequest;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/anthropic/claude/api/chat/RenderingMode;Lcom/anthropic/claude/api/chat/InputMode;Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/api/chat/CreateChatRequest;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/anthropic/claude/api/chat/RenderingMode;", "component7", "()Lcom/anthropic/claude/api/chat/InputMode;", "component8", "component9-saiyK68", "component9", "component10", "()Lcom/anthropic/claude/api/chat/CreateChatRequest;", "component11", "component12-_couWBU", "component12", "component13-KLP3kNA", "component13", "copy-JvoKG44", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/anthropic/claude/api/chat/RenderingMode;Lcom/anthropic/claude/api/chat/InputMode;Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/api/chat/CreateChatRequest;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/ChatCompletionRequest;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/ChatCompletionRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getPrompt", "getTimezone", "getModel", "Ljava/util/List;", "getAttachments", "getFiles", "Lcom/anthropic/claude/api/chat/RenderingMode;", "getRendering_mode", "Lcom/anthropic/claude/api/chat/InputMode;", "getInput_mode", "getTools", "getParent_message_uuid-saiyK68", "Lcom/anthropic/claude/api/chat/CreateChatRequest;", "getCreate_conversation_params", "getTool_states", "getEffort-_couWBU", "getThinking_mode-KLP3kNA", "Companion", "pm2", "qm2", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatCompletionRequest {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final qm2 Companion = new qm2();
    private final List<MessageAttachment> attachments;
    private final CreateChatRequest create_conversation_params;
    private final String effort;
    private final List<FileId> files;
    private final InputMode input_mode;
    private final String model;
    private final String parent_message_uuid;
    private final String prompt;
    private final RenderingMode rendering_mode;
    private final String thinking_mode;
    private final String timezone;
    private final List<ToolState> tool_states;
    private final List<Tool> tools;

    static {
        pk2 pk2Var = new pk2(2);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, pk2Var), yb5.w(w1aVar, new pk2(3)), null, null, yb5.w(w1aVar, new pk2(4)), null, null, yb5.w(w1aVar, new pk2(5)), null, null};
    }

    private /* synthetic */ ChatCompletionRequest(int i, String str, String str2, String str3, List list, List list2, RenderingMode renderingMode, InputMode inputMode, List list3, String str4, CreateChatRequest createChatRequest, List list4, String str5, String str6, vnf vnfVar) {
        if (195 != (i & 195)) {
            gvj.f(i, 195, pm2.a.getDescriptor());
            throw null;
        }
        this.prompt = str;
        this.timezone = str2;
        if ((i & 4) == 0) {
            this.model = null;
        } else {
            this.model = str3;
        }
        if ((i & 8) == 0) {
            this.attachments = null;
        } else {
            this.attachments = list;
        }
        if ((i & 16) == 0) {
            this.files = null;
        } else {
            this.files = list2;
        }
        if ((i & 32) == 0) {
            this.rendering_mode = RenderingMode.MESSAGES;
        } else {
            this.rendering_mode = renderingMode;
        }
        this.input_mode = inputMode;
        this.tools = list3;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.parent_message_uuid = null;
        } else {
            this.parent_message_uuid = str4;
        }
        if ((i & 512) == 0) {
            this.create_conversation_params = null;
        } else {
            this.create_conversation_params = createChatRequest;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.tool_states = null;
        } else {
            this.tool_states = list4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.effort = null;
        } else {
            this.effort = str5;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.thinking_mode = null;
        } else {
            this.thinking_mode = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(meb.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(oi7.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new uo0(com.anthropic.claude.api.chat.tool.e.c, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new uo0(s0i.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-JvoKG44$default, reason: not valid java name */
    public static /* synthetic */ ChatCompletionRequest m159copyJvoKG44$default(ChatCompletionRequest chatCompletionRequest, String str, String str2, String str3, List list, List list2, RenderingMode renderingMode, InputMode inputMode, List list3, String str4, CreateChatRequest createChatRequest, List list4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatCompletionRequest.prompt;
        }
        return chatCompletionRequest.m163copyJvoKG44(str, (i & 2) != 0 ? chatCompletionRequest.timezone : str2, (i & 4) != 0 ? chatCompletionRequest.model : str3, (i & 8) != 0 ? chatCompletionRequest.attachments : list, (i & 16) != 0 ? chatCompletionRequest.files : list2, (i & 32) != 0 ? chatCompletionRequest.rendering_mode : renderingMode, (i & 64) != 0 ? chatCompletionRequest.input_mode : inputMode, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? chatCompletionRequest.tools : list3, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? chatCompletionRequest.parent_message_uuid : str4, (i & 512) != 0 ? chatCompletionRequest.create_conversation_params : createChatRequest, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? chatCompletionRequest.tool_states : list4, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? chatCompletionRequest.effort : str5, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? chatCompletionRequest.thinking_mode : str6);
    }

    public static final /* synthetic */ void write$Self$api(ChatCompletionRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.prompt);
        output.q(serialDesc, 1, self.timezone);
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 2, srg.a, self.model);
        }
        if (output.E(serialDesc) || self.attachments != null) {
            output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.attachments);
        }
        if (output.E(serialDesc) || self.files != null) {
            output.B(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.files);
        }
        if (output.E(serialDesc) || self.rendering_mode != RenderingMode.MESSAGES) {
            output.r(serialDesc, 5, mge.d, self.rendering_mode);
        }
        output.r(serialDesc, 6, o49.d, self.input_mode);
        output.r(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.tools);
        if (output.E(serialDesc) || self.parent_message_uuid != null) {
            ehb ehbVar = ehb.a;
            String str = self.parent_message_uuid;
            output.B(serialDesc, 8, ehbVar, str != null ? MessageId.m1051boximpl(str) : null);
        }
        if (output.E(serialDesc) || self.create_conversation_params != null) {
            output.B(serialDesc, 9, x55.a, self.create_conversation_params);
        }
        if (output.E(serialDesc) || self.tool_states != null) {
            output.B(serialDesc, 10, (znf) kw9VarArr[10].getValue(), self.tool_states);
        }
        if (output.E(serialDesc) || self.effort != null) {
            zlh zlhVar = zlh.a;
            String str2 = self.effort;
            output.B(serialDesc, 11, zlhVar, str2 != null ? ThinkingEffort.m1135boximpl(str2) : null);
        }
        if (!output.E(serialDesc) && self.thinking_mode == null) {
            return;
        }
        emh emhVar = emh.a;
        String str3 = self.thinking_mode;
        output.B(serialDesc, 12, emhVar, str3 != null ? ThinkingMode.m1142boximpl(str3) : null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CreateChatRequest getCreate_conversation_params() {
        return this.create_conversation_params;
    }

    public final List<ToolState> component11() {
        return this.tool_states;
    }

    /* JADX INFO: renamed from: component12-_couWBU, reason: not valid java name and from getter */
    public final String getEffort() {
        return this.effort;
    }

    /* JADX INFO: renamed from: component13-KLP3kNA, reason: not valid java name and from getter */
    public final String getThinking_mode() {
        return this.thinking_mode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public final List<MessageAttachment> component4() {
        return this.attachments;
    }

    public final List<FileId> component5() {
        return this.files;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RenderingMode getRendering_mode() {
        return this.rendering_mode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final InputMode getInput_mode() {
        return this.input_mode;
    }

    public final List<Tool> component8() {
        return this.tools;
    }

    /* JADX INFO: renamed from: component9-saiyK68, reason: not valid java name and from getter */
    public final String getParent_message_uuid() {
        return this.parent_message_uuid;
    }

    /* JADX INFO: renamed from: copy-JvoKG44, reason: not valid java name */
    public final ChatCompletionRequest m163copyJvoKG44(String prompt, String timezone, String model, List<MessageAttachment> attachments, List<FileId> files, RenderingMode rendering_mode, InputMode input_mode, List<? extends Tool> tools, String parent_message_uuid, CreateChatRequest create_conversation_params, List<ToolState> tool_states, String effort, String thinking_mode) {
        prompt.getClass();
        timezone.getClass();
        rendering_mode.getClass();
        input_mode.getClass();
        tools.getClass();
        return new ChatCompletionRequest(prompt, timezone, model, attachments, files, rendering_mode, input_mode, tools, parent_message_uuid, create_conversation_params, tool_states, effort, thinking_mode, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.chat.ChatCompletionRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.chat.ChatCompletionRequest r5 = (com.anthropic.claude.api.chat.ChatCompletionRequest) r5
            java.lang.String r1 = r4.prompt
            java.lang.String r3 = r5.prompt
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.timezone
            java.lang.String r3 = r5.timezone
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.model
            java.lang.String r3 = r5.model
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.util.List<com.anthropic.claude.api.chat.MessageAttachment> r1 = r4.attachments
            java.util.List<com.anthropic.claude.api.chat.MessageAttachment> r3 = r5.attachments
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.util.List<com.anthropic.claude.types.strings.FileId> r1 = r4.files
            java.util.List<com.anthropic.claude.types.strings.FileId> r3 = r5.files
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            com.anthropic.claude.api.chat.RenderingMode r1 = r4.rendering_mode
            com.anthropic.claude.api.chat.RenderingMode r3 = r5.rendering_mode
            if (r1 == r3) goto L4a
            return r2
        L4a:
            com.anthropic.claude.api.chat.InputMode r1 = r4.input_mode
            com.anthropic.claude.api.chat.InputMode r3 = r5.input_mode
            if (r1 == r3) goto L51
            return r2
        L51:
            java.util.List<com.anthropic.claude.api.chat.tool.Tool> r1 = r4.tools
            java.util.List<com.anthropic.claude.api.chat.tool.Tool> r3 = r5.tools
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            java.lang.String r1 = r4.parent_message_uuid
            java.lang.String r3 = r5.parent_message_uuid
            if (r1 != 0) goto L68
            if (r3 != 0) goto L66
            r1 = r0
            goto L6f
        L66:
            r1 = r2
            goto L6f
        L68:
            if (r3 != 0) goto L6b
            goto L66
        L6b:
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r1, r3)
        L6f:
            if (r1 != 0) goto L72
            return r2
        L72:
            com.anthropic.claude.api.chat.CreateChatRequest r1 = r4.create_conversation_params
            com.anthropic.claude.api.chat.CreateChatRequest r3 = r5.create_conversation_params
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L7d
            return r2
        L7d:
            java.util.List<com.anthropic.claude.api.chat.ToolState> r1 = r4.tool_states
            java.util.List<com.anthropic.claude.api.chat.ToolState> r3 = r5.tool_states
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L88
            return r2
        L88:
            java.lang.String r1 = r4.effort
            java.lang.String r3 = r5.effort
            if (r1 != 0) goto L94
            if (r3 != 0) goto L92
            r1 = r0
            goto L9b
        L92:
            r1 = r2
            goto L9b
        L94:
            if (r3 != 0) goto L97
            goto L92
        L97:
            boolean r1 = com.anthropic.claude.types.strings.ThinkingEffort.m1138equalsimpl0(r1, r3)
        L9b:
            if (r1 != 0) goto L9e
            return r2
        L9e:
            java.lang.String r4 = r4.thinking_mode
            java.lang.String r5 = r5.thinking_mode
            if (r4 != 0) goto Laa
            if (r5 != 0) goto La8
            r4 = r0
            goto Lb1
        La8:
            r4 = r2
            goto Lb1
        Laa:
            if (r5 != 0) goto Lad
            goto La8
        Lad:
            boolean r4 = com.anthropic.claude.types.strings.ThinkingMode.m1145equalsimpl0(r4, r5)
        Lb1:
            if (r4 != 0) goto Lb4
            return r2
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.ChatCompletionRequest.equals(java.lang.Object):boolean");
    }

    public final List<MessageAttachment> getAttachments() {
        return this.attachments;
    }

    public final CreateChatRequest getCreate_conversation_params() {
        return this.create_conversation_params;
    }

    /* JADX INFO: renamed from: getEffort-_couWBU, reason: not valid java name */
    public final String m164getEffort_couWBU() {
        return this.effort;
    }

    public final List<FileId> getFiles() {
        return this.files;
    }

    public final InputMode getInput_mode() {
        return this.input_mode;
    }

    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: getParent_message_uuid-saiyK68, reason: not valid java name */
    public final String m165getParent_message_uuidsaiyK68() {
        return this.parent_message_uuid;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final RenderingMode getRendering_mode() {
        return this.rendering_mode;
    }

    /* JADX INFO: renamed from: getThinking_mode-KLP3kNA, reason: not valid java name */
    public final String m166getThinking_modeKLP3kNA() {
        return this.thinking_mode;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final List<ToolState> getTool_states() {
        return this.tool_states;
    }

    public final List<Tool> getTools() {
        return this.tools;
    }

    public int hashCode() {
        int iL = kgh.l(this.prompt.hashCode() * 31, 31, this.timezone);
        String str = this.model;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        List<MessageAttachment> list = this.attachments;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<FileId> list2 = this.files;
        int iM = kgh.m((this.input_mode.hashCode() + ((this.rendering_mode.hashCode() + ((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31)) * 31, 31, this.tools);
        String str2 = this.parent_message_uuid;
        int iM1055hashCodeimpl = (iM + (str2 == null ? 0 : MessageId.m1055hashCodeimpl(str2))) * 31;
        CreateChatRequest createChatRequest = this.create_conversation_params;
        int iHashCode3 = (iM1055hashCodeimpl + (createChatRequest == null ? 0 : createChatRequest.hashCode())) * 31;
        List<ToolState> list3 = this.tool_states;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.effort;
        int iM1139hashCodeimpl = (iHashCode4 + (str3 == null ? 0 : ThinkingEffort.m1139hashCodeimpl(str3))) * 31;
        String str4 = this.thinking_mode;
        return iM1139hashCodeimpl + (str4 != null ? ThinkingMode.m1146hashCodeimpl(str4) : 0);
    }

    public String toString() {
        String str = this.prompt;
        String str2 = this.timezone;
        String str3 = this.model;
        List<MessageAttachment> list = this.attachments;
        List<FileId> list2 = this.files;
        RenderingMode renderingMode = this.rendering_mode;
        InputMode inputMode = this.input_mode;
        List<Tool> list3 = this.tools;
        String str4 = this.parent_message_uuid;
        String strM1056toStringimpl = str4 == null ? "null" : MessageId.m1056toStringimpl(str4);
        CreateChatRequest createChatRequest = this.create_conversation_params;
        List<ToolState> list4 = this.tool_states;
        String str5 = this.effort;
        String strM1140toStringimpl = str5 == null ? "null" : ThinkingEffort.m1140toStringimpl(str5);
        String str6 = this.thinking_mode;
        String strM1148toStringimpl = str6 != null ? ThinkingMode.m1148toStringimpl(str6) : "null";
        StringBuilder sbR = kgh.r("ChatCompletionRequest(prompt=", str, ", timezone=", str2, ", model=");
        qy1.p(str3, ", attachments=", ", files=", sbR, list);
        sbR.append(list2);
        sbR.append(", rendering_mode=");
        sbR.append(renderingMode);
        sbR.append(", input_mode=");
        sbR.append(inputMode);
        sbR.append(", tools=");
        sbR.append(list3);
        sbR.append(", parent_message_uuid=");
        sbR.append(strM1056toStringimpl);
        sbR.append(", create_conversation_params=");
        sbR.append(createChatRequest);
        sbR.append(", tool_states=");
        ms6.x(", effort=", strM1140toStringimpl, ", thinking_mode=", sbR, list4);
        return ij0.m(sbR, strM1148toStringimpl, ")");
    }

    public /* synthetic */ ChatCompletionRequest(String str, String str2, String str3, List list, List list2, RenderingMode renderingMode, InputMode inputMode, List list3, String str4, CreateChatRequest createChatRequest, List list4, String str5, String str6, mq5 mq5Var) {
        this(str, str2, str3, list, list2, renderingMode, inputMode, list3, str4, createChatRequest, list4, str5, str6);
    }

    public /* synthetic */ ChatCompletionRequest(int i, String str, String str2, String str3, List list, List list2, RenderingMode renderingMode, InputMode inputMode, List list3, String str4, CreateChatRequest createChatRequest, List list4, String str5, String str6, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, list, list2, renderingMode, inputMode, list3, str4, createChatRequest, list4, str5, str6, vnfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ChatCompletionRequest(String str, String str2, String str3, List<MessageAttachment> list, List<FileId> list2, RenderingMode renderingMode, InputMode inputMode, List<? extends Tool> list3, String str4, CreateChatRequest createChatRequest, List<ToolState> list4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        renderingMode.getClass();
        inputMode.getClass();
        list3.getClass();
        this.prompt = str;
        this.timezone = str2;
        this.model = str3;
        this.attachments = list;
        this.files = list2;
        this.rendering_mode = renderingMode;
        this.input_mode = inputMode;
        this.tools = list3;
        this.parent_message_uuid = str4;
        this.create_conversation_params = createChatRequest;
        this.tool_states = list4;
        this.effort = str5;
        this.thinking_mode = str6;
    }

    public /* synthetic */ ChatCompletionRequest(String str, String str2, String str3, List list, List list2, RenderingMode renderingMode, InputMode inputMode, List list3, String str4, CreateChatRequest createChatRequest, List list4, String str5, String str6, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? RenderingMode.MESSAGES : renderingMode, inputMode, list3, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str4, (i & 512) != 0 ? null : createChatRequest, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : list4, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : str5, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : str6, null);
    }
}
