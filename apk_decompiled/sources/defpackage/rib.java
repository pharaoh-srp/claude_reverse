package defpackage;

import com.anthropic.claude.api.chat.RefusalStopDetails;
import com.anthropic.claude.api.chat.citation.Citation;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.api.chat.messages.BellNoteBlock;
import com.anthropic.claude.api.chat.messages.BellNoteDelta;
import com.anthropic.claude.api.chat.messages.CitationEndDelta;
import com.anthropic.claude.api.chat.messages.CitationStartDelta;
import com.anthropic.claude.api.chat.messages.CompactionStatus;
import com.anthropic.claude.api.chat.messages.CompactionStatusEvent;
import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.api.chat.messages.ContentBlockDelta;
import com.anthropic.claude.api.chat.messages.ContentBlockDeltaEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockRetractEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockStartEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockStopEvent;
import com.anthropic.claude.api.chat.messages.ConversationReadyEvent;
import com.anthropic.claude.api.chat.messages.FlagBlock;
import com.anthropic.claude.api.chat.messages.FlagDelta;
import com.anthropic.claude.api.chat.messages.InputJsonDelta;
import com.anthropic.claude.api.chat.messages.McpAuthRequiredEvent;
import com.anthropic.claude.api.chat.messages.MessageDelta;
import com.anthropic.claude.api.chat.messages.MessageDeltaEvent;
import com.anthropic.claude.api.chat.messages.MessageFlag;
import com.anthropic.claude.api.chat.messages.MessageLimitEvent;
import com.anthropic.claude.api.chat.messages.MessageStartEvent;
import com.anthropic.claude.api.chat.messages.MessageStopEvent;
import com.anthropic.claude.api.chat.messages.ModelUpdateEvent;
import com.anthropic.claude.api.chat.messages.StreamEvent;
import com.anthropic.claude.api.chat.messages.TextBlock;
import com.anthropic.claude.api.chat.messages.TextDelta;
import com.anthropic.claude.api.chat.messages.ThinkingBlock;
import com.anthropic.claude.api.chat.messages.ThinkingDelta;
import com.anthropic.claude.api.chat.messages.ThinkingSummaryDelta;
import com.anthropic.claude.api.chat.messages.ToolResultBlock;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.api.chat.messages.ToolUseBlockUpdateDelta;
import com.anthropic.claude.api.chat.messages.UnknownContentBlock;
import com.anthropic.claude.api.chat.messages.UnknownStreamEvent;
import com.anthropic.claude.api.chat.messages.VoiceNoteBlock;
import com.anthropic.claude.api.chat.messages.VoiceNoteDelta;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolResultContent;
import com.anthropic.claude.api.chat.tool.ToolUseInput;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.api.mcp.McpToolApprovalOption;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.tool.model.Tool;
import com.anthropic.claude.tool.model.f;
import com.anthropic.claude.types.strings.MessageId;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.t4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class rib {
    public final bg9 a;
    public final cj3 b;
    public String e;
    public String f;
    public String g;
    public CompactionStatus k;
    public ApiHelpline l;
    public iwc m;
    public RefusalStopDetails n;
    public int o;
    public Integer p;
    public k3 c = bbg.F;
    public RateLimit d = RateLimit.WithinLimit.INSTANCE;
    public final StringBuilder h = new StringBuilder();
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashSet j = new LinkedHashSet();

    public rib(bg9 bg9Var, cj3 cj3Var) {
        this.a = bg9Var;
        this.b = cj3Var;
    }

    public final int a(int i) {
        Integer num = this.p;
        if (num == null) {
            return i;
        }
        return this.o + (i - num.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v0, types: [rz7] */
    public final im2 b(StreamEvent streamEvent, bz7 bz7Var, rz7 rz7Var, pz7 pz7Var, pz7 pz7Var2, zy7 zy7Var) {
        kog stop;
        String str;
        streamEvent.getClass();
        pz7Var.getClass();
        pz7Var2.getClass();
        boolean z = streamEvent instanceof MessageStartEvent;
        LinkedHashMap linkedHashMap = this.i;
        StringBuilder sb = this.h;
        LinkedHashSet linkedHashSet = this.j;
        if (z) {
            if (!this.c.isEmpty()) {
                this.o = this.c.size();
                this.p = null;
                linkedHashSet.clear();
                fsg.Y(sb);
                linkedHashMap.clear();
            }
            MessageStartEvent messageStartEvent = (MessageStartEvent) streamEvent;
            this.e = messageStartEvent.getMessage().m293getUuidsaiyK68();
            String strM292getParent_uuidsaiyK68 = messageStartEvent.getMessage().m292getParent_uuidsaiyK68();
            this.f = strM292getParent_uuidsaiyK68;
            return new im2(this.c, this.e, strM292getParent_uuidsaiyK68, this.d, (String) null, w44.t1(linkedHashSet), this.k, this.l, this.m, (ModelUpdateEvent) null, this.n, 1072);
        }
        if (streamEvent instanceof MessageDeltaEvent) {
            MessageDelta delta = ((MessageDeltaEvent) streamEvent).getDelta();
            if (delta != null && (stop = delta.getStop()) != null) {
                if (stop.equals(yng.a)) {
                    str = "end_turn";
                } else if (stop.equals(aog.a)) {
                    str = "max_tokens";
                } else if (stop instanceof fog) {
                    str = "stop_sequence";
                } else if (stop.equals(gog.a)) {
                    str = "tool_use";
                } else if (stop.equals(hog.a)) {
                    str = "tool_use_limit";
                } else if (stop.equals(cog.a)) {
                    str = "pause_turn";
                } else if (stop.equals(wng.a)) {
                    str = "compaction";
                } else if (stop instanceof eog) {
                    str = "refusal";
                } else if (stop.equals(dog.a)) {
                    str = "prompt_injection_risk";
                } else if (stop.equals(xng.a)) {
                    str = "conversation_length_limit";
                } else if (stop.equals(bog.a)) {
                    str = "model_context_window_exceeded";
                } else if (stop.equals(jog.a)) {
                    str = "user_canceled";
                } else if (stop.equals(zng.a)) {
                    str = "error";
                } else {
                    if (!(stop instanceof iog)) {
                        wg6.i();
                        return null;
                    }
                    str = ((iog) stop).a;
                }
                this.g = str;
                if (stop instanceof eog) {
                    this.n = ((eog) stop).a;
                    return null;
                }
            }
        } else {
            if (streamEvent instanceof MessageLimitEvent) {
                RateLimit message_limit = ((MessageLimitEvent) streamEvent).getMessage_limit();
                this.d = message_limit;
                return new im2(this.c, this.e, this.f, message_limit, (String) null, w44.t1(linkedHashSet), this.k, this.l, this.m, (ModelUpdateEvent) null, this.n, 1072);
            }
            if (streamEvent instanceof MessageStopEvent) {
                return new im2(this.c, this.e, this.f, this.d, this.g, w44.t1(linkedHashSet), this.k, this.l, this.m, (ModelUpdateEvent) null, this.n, FreeTypeConstants.FT_LOAD_NO_RECURSE);
            }
            boolean z2 = streamEvent instanceof ContentBlockStartEvent;
            int i = 5;
            ozf ozfVar = ozf.F;
            if (z2) {
                this.m = null;
                if (this.o > 0 && this.p == null) {
                    ContentBlockStartEvent contentBlockStartEvent = (ContentBlockStartEvent) streamEvent;
                    this.p = Integer.valueOf(contentBlockStartEvent.getIndex());
                    int index = this.o - contentBlockStartEvent.getIndex();
                    List list = xah.a;
                    int index2 = contentBlockStartEvent.getIndex();
                    int i2 = this.o;
                    String str2 = index >= 0 ? "+" : "";
                    StringBuilder sbV = vb7.v("SSE compaction index remap: server ", " -> client ", index2, i2, " (drift ");
                    sbV.append(str2);
                    sbV.append(index);
                    sbV.append(")");
                    xah.e(6, sbV.toString(), null, null);
                }
                ContentBlockStartEvent contentBlockStartEvent2 = (ContentBlockStartEvent) streamEvent;
                int iA = a(contentBlockStartEvent2.getIndex());
                if (iA != this.c.size()) {
                    t4.p(new et5("content_block_start_index_mismatch", new SilentException(vb7.q("Mismatch content block start event index (", ") and content blocks size (", iA, this.c.size(), ")")), ozfVar, i));
                }
                this.c = this.c.a(contentBlockStartEvent2.getContent_block());
                linkedHashSet.add(Integer.valueOf(iA));
                return new im2(this.c, this.e, this.f, this.d, (String) null, w44.t1(linkedHashSet), this.k, this.l, this.m, (ModelUpdateEvent) null, this.n, 1072);
            }
            if (streamEvent instanceof ContentBlockDeltaEvent) {
                ContentBlockDeltaEvent contentBlockDeltaEvent = (ContentBlockDeltaEvent) streamEvent;
                ContentBlockDelta delta2 = contentBlockDeltaEvent.getDelta();
                int iA2 = a(contentBlockDeltaEvent.getIndex());
                boolean z3 = delta2 instanceof FlagDelta;
                if (z3) {
                    FlagDelta flagDelta = (FlagDelta) delta2;
                    if (flagDelta.getHelpline() != null) {
                        this.l = flagDelta.getHelpline();
                    }
                }
                if (iA2 < 0 || iA2 >= this.c.size()) {
                    t4.p(new et5("content_block_delta_invalid_index", new SilentException(grc.o(iA2, this.c.size(), "Received content block delta with invalid index: ", " for content blocks size: ")), ozfVar, i));
                    return null;
                }
                ContentBlock contentBlock = (ContentBlock) this.c.get(iA2);
                boolean z4 = contentBlock instanceof TextBlock;
                Set<MessageFlag> set = um6.E;
                if (z4) {
                    if (delta2 instanceof TextDelta) {
                        TextBlock textBlock = (TextBlock) contentBlock;
                        c(iA2, TextBlock.copy$default(textBlock, null, null, kgh.o(textBlock.getText(), ((TextDelta) delta2).getText()), null, null, 27, null));
                    } else if (delta2 instanceof CitationStartDelta) {
                        CitationStartDelta citationStartDelta = (CitationStartDelta) delta2;
                        String uuid = citationStartDelta.getCitation().getUuid();
                        if (uuid != null) {
                            linkedHashMap.put(uuid, Citation.copy$default(citationStartDelta.getCitation(), null, null, null, null, Integer.valueOf(((TextBlock) contentBlock).getText().length()), null, null, null, null, 495, null));
                        }
                    } else if (delta2 instanceof CitationEndDelta) {
                        Citation citation = (Citation) linkedHashMap.remove(((CitationEndDelta) delta2).getCitation_uuid());
                        if (citation != null) {
                            TextBlock textBlock2 = (TextBlock) contentBlock;
                            Citation citationCopy$default = Citation.copy$default(citation, null, null, null, null, null, Integer.valueOf(textBlock2.getText().length()), null, null, null, 479, null);
                            List<Citation> citations = textBlock2.getCitations();
                            Object objB1 = citations != null ? w44.b1(citations, citationCopy$default) : null;
                            if (objB1 == null) {
                                objB1 = x44.W(citationCopy$default);
                            }
                            c(iA2, TextBlock.copy$default(textBlock2, null, null, null, objB1, null, 23, null));
                        }
                    } else if (z3) {
                        TextBlock textBlock3 = (TextBlock) contentBlock;
                        Set<MessageFlag> flags = textBlock3.getFlags();
                        if (flags != null) {
                            set = flags;
                        }
                        c(iA2, TextBlock.copy$default(textBlock3, null, null, null, null, dxf.q0(set, ((FlagDelta) delta2).getFlag()), 15, null));
                    } else {
                        urk.b(new SilentException(ij0.j("Unsupported content block delta type (", mqk.d(delta2), ") for text block")), "unsupported_delta_text_block");
                    }
                } else if (contentBlock instanceof ToolUseBlock) {
                    if (delta2 instanceof InputJsonDelta) {
                        sb.append(((InputJsonDelta) delta2).getPartial_json());
                        ToolUseBlock toolUseBlock = (ToolUseBlock) contentBlock;
                        c(iA2, toolUseBlock.copy((16367 & 1) != 0 ? toolUseBlock.start_timestamp : null, (16367 & 2) != 0 ? toolUseBlock.stop_timestamp : null, (16367 & 4) != 0 ? toolUseBlock.name : null, (16367 & 8) != 0 ? toolUseBlock.id : null, (16367 & 16) != 0 ? toolUseBlock.input : new ToolUseInput(sb.toString()), (16367 & 32) != 0 ? toolUseBlock.message : null, (16367 & 64) != 0 ? toolUseBlock.display_content : null, (16367 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? toolUseBlock.integration_name : null, (16367 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? toolUseBlock.integration_icon_url : null, (16367 & 512) != 0 ? toolUseBlock.icon_name : null, (16367 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? toolUseBlock.approval_key : null, (16367 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? toolUseBlock.approval_options : null, (16367 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? toolUseBlock.is_mcp_app : null, (16367 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? toolUseBlock.flags : null));
                    } else if (delta2 instanceof ToolUseBlockUpdateDelta) {
                        ToolUseBlock toolUseBlock2 = (ToolUseBlock) contentBlock;
                        ToolUseBlockUpdateDelta toolUseBlockUpdateDelta = (ToolUseBlockUpdateDelta) delta2;
                        String message = toolUseBlockUpdateDelta.getMessage();
                        if (message == null) {
                            message = toolUseBlock2.getMessage();
                        }
                        String str3 = message;
                        ToolDisplayContent display_content = toolUseBlockUpdateDelta.getDisplay_content();
                        if (display_content == null) {
                            display_content = toolUseBlock2.getDisplay_content();
                        }
                        ToolDisplayContent toolDisplayContent = display_content;
                        String integration_name = toolUseBlockUpdateDelta.getIntegration_name();
                        if (integration_name == null) {
                            integration_name = toolUseBlock2.getIntegration_name();
                        }
                        String str4 = integration_name;
                        String integration_icon_url = toolUseBlockUpdateDelta.getIntegration_icon_url();
                        if (integration_icon_url == null) {
                            integration_icon_url = toolUseBlock2.getIntegration_icon_url();
                        }
                        String str5 = integration_icon_url;
                        String icon_name = toolUseBlockUpdateDelta.getIcon_name();
                        if (icon_name == null) {
                            icon_name = toolUseBlock2.getIcon_name();
                        }
                        String str6 = icon_name;
                        String approval_key = toolUseBlockUpdateDelta.getApproval_key();
                        if (approval_key == null) {
                            approval_key = toolUseBlock2.getApproval_key();
                        }
                        String str7 = approval_key;
                        List<McpToolApprovalOption> approval_options = toolUseBlockUpdateDelta.getApproval_options();
                        if (approval_options == null) {
                            approval_options = toolUseBlock2.getApproval_options();
                        }
                        c(iA2, toolUseBlock2.copy((16367 & 1) != 0 ? toolUseBlock2.start_timestamp : null, (16367 & 2) != 0 ? toolUseBlock2.stop_timestamp : null, (16367 & 4) != 0 ? toolUseBlock2.name : null, (16367 & 8) != 0 ? toolUseBlock2.id : null, (16367 & 16) != 0 ? toolUseBlock2.input : null, (16367 & 32) != 0 ? toolUseBlock2.message : str3, (16367 & 64) != 0 ? toolUseBlock2.display_content : toolDisplayContent, (16367 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? toolUseBlock2.integration_name : str4, (16367 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? toolUseBlock2.integration_icon_url : str5, (16367 & 512) != 0 ? toolUseBlock2.icon_name : str6, (16367 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? toolUseBlock2.approval_key : str7, (16367 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? toolUseBlock2.approval_options : approval_options, (16367 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? toolUseBlock2.is_mcp_app : null, (16367 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? toolUseBlock2.flags : null));
                    } else if (z3) {
                        ToolUseBlock toolUseBlock3 = (ToolUseBlock) contentBlock;
                        Set<MessageFlag> flags2 = toolUseBlock3.getFlags();
                        if (flags2 != null) {
                            set = flags2;
                        }
                        c(iA2, toolUseBlock3.copy((16367 & 1) != 0 ? toolUseBlock3.start_timestamp : null, (16367 & 2) != 0 ? toolUseBlock3.stop_timestamp : null, (16367 & 4) != 0 ? toolUseBlock3.name : null, (16367 & 8) != 0 ? toolUseBlock3.id : null, (16367 & 16) != 0 ? toolUseBlock3.input : null, (16367 & 32) != 0 ? toolUseBlock3.message : null, (16367 & 64) != 0 ? toolUseBlock3.display_content : null, (16367 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? toolUseBlock3.integration_name : null, (16367 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? toolUseBlock3.integration_icon_url : null, (16367 & 512) != 0 ? toolUseBlock3.icon_name : null, (16367 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? toolUseBlock3.approval_key : null, (16367 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? toolUseBlock3.approval_options : null, (16367 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? toolUseBlock3.is_mcp_app : null, (16367 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? toolUseBlock3.flags : dxf.q0(set, ((FlagDelta) delta2).getFlag())));
                    } else {
                        urk.b(new SilentException(ij0.j("Unsupported content block delta type (", mqk.d(delta2), ") for tool use block")), "unsupported_delta_tool_use_block");
                    }
                } else if (contentBlock instanceof ToolResultBlock) {
                    if (delta2 instanceof InputJsonDelta) {
                        sb.append(((InputJsonDelta) delta2).getPartial_json());
                    } else if (z3) {
                        ToolResultBlock toolResultBlock = (ToolResultBlock) contentBlock;
                        Set<MessageFlag> flags3 = toolResultBlock.getFlags();
                        if (flags3 != null) {
                            set = flags3;
                        }
                        c(iA2, toolResultBlock.copy((8191 & 1) != 0 ? toolResultBlock.start_timestamp : null, (8191 & 2) != 0 ? toolResultBlock.stop_timestamp : null, (8191 & 4) != 0 ? toolResultBlock.name : null, (8191 & 8) != 0 ? toolResultBlock.tool_use_id : null, (8191 & 16) != 0 ? toolResultBlock.content : null, (8191 & 32) != 0 ? toolResultBlock.is_error : false, (8191 & 64) != 0 ? toolResultBlock.message : null, (8191 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? toolResultBlock.display_content : null, (8191 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? toolResultBlock.integration_name : null, (8191 & 512) != 0 ? toolResultBlock.integration_icon_url : null, (8191 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? toolResultBlock.icon_name : null, (8191 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? toolResultBlock.structured_content : null, (8191 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? toolResultBlock.meta : null, (8191 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? toolResultBlock.flags : dxf.q0(set, ((FlagDelta) delta2).getFlag())));
                    } else {
                        urk.b(new SilentException(ij0.j("Unsupported content block delta type (", mqk.d(delta2), ") for tool result block")), "unsupported_delta_tool_result_block");
                    }
                } else if (contentBlock instanceof ThinkingBlock) {
                    if (delta2 instanceof ThinkingDelta) {
                        ThinkingBlock thinkingBlock = (ThinkingBlock) contentBlock;
                        c(iA2, ThinkingBlock.copy$default(thinkingBlock, null, null, kgh.o(thinkingBlock.getThinking(), ((ThinkingDelta) delta2).getThinking()), null, null, 27, null));
                    } else if (delta2 instanceof ThinkingSummaryDelta) {
                        ThinkingBlock thinkingBlock2 = (ThinkingBlock) contentBlock;
                        c(iA2, ThinkingBlock.copy$default(thinkingBlock2, null, null, null, w44.b1(thinkingBlock2.getSummaries(), ((ThinkingSummaryDelta) delta2).getSummary()), null, 23, null));
                    } else if (z3) {
                        ThinkingBlock thinkingBlock3 = (ThinkingBlock) contentBlock;
                        Set<MessageFlag> flags4 = thinkingBlock3.getFlags();
                        if (flags4 != null) {
                            set = flags4;
                        }
                        c(iA2, ThinkingBlock.copy$default(thinkingBlock3, null, null, null, null, dxf.q0(set, ((FlagDelta) delta2).getFlag()), 15, null));
                    } else {
                        urk.b(new SilentException(ij0.j("Content block delta type (", mqk.d(delta2), ") not equal to thinking block type.")), "unsupported_delta_thinking_block");
                    }
                } else if (contentBlock instanceof VoiceNoteBlock) {
                    if (delta2 instanceof VoiceNoteDelta) {
                        VoiceNoteBlock voiceNoteBlock = (VoiceNoteBlock) contentBlock;
                        String text = voiceNoteBlock.getText();
                        c(iA2, VoiceNoteBlock.copy$default(voiceNoteBlock, null, null, kgh.o(text != null ? text : "", ((VoiceNoteDelta) delta2).getPartial_text()), voiceNoteBlock.getTitle(), null, 19, null));
                    } else if (z3) {
                        VoiceNoteBlock voiceNoteBlock2 = (VoiceNoteBlock) contentBlock;
                        Set<MessageFlag> flags5 = voiceNoteBlock2.getFlags();
                        if (flags5 != null) {
                            set = flags5;
                        }
                        c(iA2, VoiceNoteBlock.copy$default(voiceNoteBlock2, null, null, null, null, dxf.q0(set, ((FlagDelta) delta2).getFlag()), 15, null));
                    } else {
                        urk.b(new SilentException(ij0.j("Content block delta type (", mqk.d(delta2), ") not equal to voice note block type.")), "unsupported_delta_voice_note_block");
                    }
                } else if (contentBlock instanceof BellNoteBlock) {
                    if (delta2 instanceof BellNoteDelta) {
                        BellNoteBlock bellNoteBlock = (BellNoteBlock) contentBlock;
                        String text2 = bellNoteBlock.getText();
                        c(iA2, BellNoteBlock.copy$default(bellNoteBlock, null, null, kgh.o(text2 != null ? text2 : "", ((BellNoteDelta) delta2).getPartial_text()), bellNoteBlock.getTitle(), null, 19, null));
                    } else if (z3) {
                        BellNoteBlock bellNoteBlock2 = (BellNoteBlock) contentBlock;
                        Set<MessageFlag> flags6 = bellNoteBlock2.getFlags();
                        if (flags6 != null) {
                            set = flags6;
                        }
                        c(iA2, BellNoteBlock.copy$default(bellNoteBlock2, null, null, null, null, dxf.q0(set, ((FlagDelta) delta2).getFlag()), 15, null));
                    } else {
                        urk.b(new SilentException(ij0.j("Content block delta type (", mqk.d(delta2), ") not equal to bell note block type.")), "unsupported_delta_bell_note_block");
                    }
                } else if (contentBlock instanceof FlagBlock) {
                    urk.b(new SilentException("FlagBlock received unexpected delta. Delta type: ".concat(mqk.d(delta2))), "flag_block_unexpected_delta");
                } else {
                    if (!(contentBlock instanceof UnknownContentBlock)) {
                        wg6.i();
                        return null;
                    }
                    urk.b(new SilentException("Target content block is unknown. Delta type: ".concat(mqk.d(delta2))), "unknown_content_block_delta");
                }
                return new im2(this.c, this.e, this.f, this.d, (String) null, w44.t1(linkedHashSet), this.k, this.l, this.m, (ModelUpdateEvent) null, this.n, 1072);
            }
            if (streamEvent instanceof ContentBlockStopEvent) {
                ContentBlockStopEvent contentBlockStopEvent = (ContentBlockStopEvent) streamEvent;
                linkedHashSet.remove(Integer.valueOf(a(contentBlockStopEvent.getIndex())));
                ContentBlock contentBlock2 = (ContentBlock) w44.V0(this.c);
                if (contentBlock2 == null) {
                    t4.p(new et5("content_block_stop_no_current", new SilentException("Receiving content block stop when there is no current block."), ozf.E, i));
                    return null;
                }
                if (!(contentBlock2 instanceof TextBlock)) {
                    boolean z5 = contentBlock2 instanceof ToolUseBlock;
                    bg9 bg9Var = this.a;
                    if (z5) {
                        String string = sb.toString();
                        String str8 = this.e;
                        pz7Var.invoke(contentBlock2, str8 != null ? MessageId.m1051boximpl(str8) : null);
                        ToolUseBlock toolUseBlock4 = (ToolUseBlock) contentBlock2;
                        List<McpToolApprovalOption> approval_options2 = toolUseBlock4.getApproval_options();
                        if (approval_options2 == null || approval_options2.isEmpty()) {
                            if (((Boolean) bz7Var.invoke(toolUseBlock4.getName())).booleanValue()) {
                                rz7Var.invoke(contentBlock2, string, new im2(this.c, this.e, this.f, this.d, (String) null, w44.t1(linkedHashSet), (CompactionStatus) null, this.l, (iwc) null, (ModelUpdateEvent) null, (RefusalStopDetails) null, 3760));
                            } else {
                                f fVar = Tool.Companion;
                                String name = toolUseBlock4.getName();
                                fVar.getClass();
                                Tool toolA = f.a(name);
                                if (!(toolA instanceof Tool.Artifacts) && !(toolA instanceof Tool.Compass) && !(toolA instanceof Tool.DriveSearch) && !(toolA instanceof Tool.WebSearch) && !(toolA instanceof Tool.Analysis) && !(toolA instanceof Tool.Unknown)) {
                                    wg6.i();
                                    return null;
                                }
                            }
                        }
                        try {
                            ToolUseBlock toolUseBlock5 = (ToolUseBlock) contentBlock2;
                            c(x44.M(this.c), toolUseBlock5.copy((16367 & 1) != 0 ? toolUseBlock5.start_timestamp : null, (16367 & 2) != 0 ? toolUseBlock5.stop_timestamp : null, (16367 & 4) != 0 ? toolUseBlock5.name : null, (16367 & 8) != 0 ? toolUseBlock5.id : null, (16367 & 16) != 0 ? toolUseBlock5.input : (ToolUseInput) bg9Var.b(string, ToolUseInput.Companion.serializer()), (16367 & 32) != 0 ? toolUseBlock5.message : null, (16367 & 64) != 0 ? toolUseBlock5.display_content : null, (16367 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? toolUseBlock5.integration_name : null, (16367 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? toolUseBlock5.integration_icon_url : null, (16367 & 512) != 0 ? toolUseBlock5.icon_name : null, (16367 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? toolUseBlock5.approval_key : null, (16367 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? toolUseBlock5.approval_options : null, (16367 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? toolUseBlock5.is_mcp_app : null, (16367 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? toolUseBlock5.flags : null));
                        } catch (Exception e) {
                            List list2 = xah.a;
                            xah.f(e, "Failed to parse tool use input JSON", null, null, 28);
                        }
                        sb.setLength(0);
                        return new im2(this.c, this.e, this.f, this.d, (String) null, w44.t1(linkedHashSet), this.k, this.l, this.m, (ModelUpdateEvent) null, this.n, 1072);
                    }
                    if (contentBlock2 instanceof ToolResultBlock) {
                        String str9 = this.e;
                        pz7Var2.invoke(contentBlock2, str9 != null ? MessageId.m1051boximpl(str9) : null);
                        if (sb.length() > 0) {
                            ToolResultBlock toolResultBlock2 = (ToolResultBlock) contentBlock2;
                            c(x44.M(this.c), toolResultBlock2.copy((8191 & 1) != 0 ? toolResultBlock2.start_timestamp : null, (8191 & 2) != 0 ? toolResultBlock2.stop_timestamp : null, (8191 & 4) != 0 ? toolResultBlock2.name : null, (8191 & 8) != 0 ? toolResultBlock2.tool_use_id : null, (8191 & 16) != 0 ? toolResultBlock2.content : (List) bg9Var.b(sb.toString(), new uo0(ToolResultContent.Companion.serializer(), 0)), (8191 & 32) != 0 ? toolResultBlock2.is_error : false, (8191 & 64) != 0 ? toolResultBlock2.message : null, (8191 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? toolResultBlock2.display_content : null, (8191 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? toolResultBlock2.integration_name : null, (8191 & 512) != 0 ? toolResultBlock2.integration_icon_url : null, (8191 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? toolResultBlock2.icon_name : null, (8191 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? toolResultBlock2.structured_content : null, (8191 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? toolResultBlock2.meta : null, (8191 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? toolResultBlock2.flags : null));
                        }
                        sb.setLength(0);
                        return new im2(this.c, this.e, this.f, this.d, (String) null, w44.t1(linkedHashSet), this.k, this.l, this.m, (ModelUpdateEvent) null, this.n, 1072);
                    }
                    if (contentBlock2 instanceof ThinkingBlock) {
                        c(x44.M(this.c), ThinkingBlock.copy$default((ThinkingBlock) contentBlock2, null, contentBlockStopEvent.getStop_timestamp(), null, null, null, 29, null));
                        return null;
                    }
                    if (!(contentBlock2 instanceof BellNoteBlock) && !(contentBlock2 instanceof VoiceNoteBlock) && !(contentBlock2 instanceof FlagBlock) && !(contentBlock2 instanceof UnknownContentBlock)) {
                        wg6.i();
                        return null;
                    }
                }
            } else if (!(streamEvent instanceof ConversationReadyEvent)) {
                if (streamEvent instanceof McpAuthRequiredEvent) {
                    McpAuthRequiredEvent mcpAuthRequiredEvent = (McpAuthRequiredEvent) streamEvent;
                    this.m = new iwc(mcpAuthRequiredEvent.m298getServer_idowoRr7k(), mcpAuthRequiredEvent.m299getTool_use_idERU6ZeY());
                    return new im2(this.c, this.e, this.f, this.d, (String) null, w44.t1(linkedHashSet), this.k, this.l, this.m, (ModelUpdateEvent) null, this.n, 1072);
                }
                if (streamEvent instanceof CompactionStatusEvent) {
                    CompactionStatusEvent compactionStatusEvent = (CompactionStatusEvent) streamEvent;
                    this.k = new CompactionStatus(compactionStatusEvent.getStatus(), compactionStatusEvent.getMessage());
                    return new im2(this.c, this.e, this.f, this.d, (String) null, w44.t1(linkedHashSet), this.k, this.l, this.m, (ModelUpdateEvent) null, this.n, 1072);
                }
                if (streamEvent instanceof ContentBlockRetractEvent) {
                    Integer from_index = ((ContentBlockRetractEvent) streamEvent).getFrom_index();
                    if (from_index != null) {
                        int iE0 = wd6.e0(a(from_index.intValue()), 0, this.c.size());
                        k3 k3Var = this.c;
                        k3Var.getClass();
                        this.c = csg.S(new kz8(k3Var, 0, iE0));
                        if (b54.x0(linkedHashSet, new sm5(iE0, 1))) {
                            fsg.Y(sb);
                            linkedHashMap.clear();
                        }
                    }
                    return new im2(this.c, this.e, this.f, this.d, (String) null, w44.t1(linkedHashSet), this.k, this.l, this.m, (ModelUpdateEvent) null, this.n, 1072);
                }
                if (streamEvent instanceof ModelUpdateEvent) {
                    return new im2(this.c, this.e, this.f, this.d, (String) null, w44.t1(linkedHashSet), this.k, this.l, this.m, (ModelUpdateEvent) streamEvent, this.n, 48);
                }
                if (!(streamEvent instanceof UnknownStreamEvent)) {
                    wg6.i();
                    return null;
                }
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfa.ERROR, "MessageSseParser", "Unexpected SSE Event Type");
                        }
                    }
                }
            } else if (zy7Var != null) {
                zy7Var.a();
                return null;
            }
        }
        return null;
    }

    public final void c(int i, ContentBlock contentBlock) {
        this.c = this.c.e(i, contentBlock);
    }
}
