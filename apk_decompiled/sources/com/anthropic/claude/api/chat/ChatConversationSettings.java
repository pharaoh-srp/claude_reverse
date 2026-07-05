package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.McpToolKey;
import com.anthropic.claude.types.strings.ResearchMode;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings.ToolSearchMode;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.emh;
import defpackage.f7a;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.m4b;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qzh;
import defpackage.rc1;
import defpackage.rle;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.zlh;
import defpackage.zm2;
import defpackage.znf;
import defpackage.zt1;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MNB\u008b\u0001\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0094\u0001\u0010.\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u0010 J\u0010\u00101\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bC\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bF\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bG\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bH\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bI\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bJ\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bK\u0010\u001d¨\u0006O"}, d2 = {"Lcom/anthropic/claude/api/chat/ChatConversationSettings;", "", "", "Lcom/anthropic/claude/types/strings/McpToolKey;", "", "enabled_mcp_tools", "enabled_web_search", "enabled_monkeys_in_a_barrel", "Lcom/anthropic/claude/types/strings/ResearchMode;", "compass_mode", "Lcom/anthropic/claude/types/strings/ThinkingMode;", "paprika_mode", "Lcom/anthropic/claude/types/strings/ToolSearchMode;", "tool_search_mode", "thinking_mode", "Lcom/anthropic/claude/types/strings/ThinkingEffort;", "effort_level", "preview_feature_uses_artifacts", "enabled_turmeric", "<init>", "(Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lvnf;Lmq5;)V", "component1", "()Ljava/util/Map;", "component2", "()Ljava/lang/Boolean;", "component3", "component4-vlYN4T0", "()Ljava/lang/String;", "component4", "component5-KLP3kNA", "component5", "component6-OP4DWQA", "component6", "component7-KLP3kNA", "component7", "component8-_couWBU", "component8", "component9", "component10", "copy-2-p3SJ4", "(Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/chat/ChatConversationSettings;", "copy", "", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/ChatConversationSettings;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/Map;", "getEnabled_mcp_tools", "Ljava/lang/Boolean;", "getEnabled_web_search", "getEnabled_monkeys_in_a_barrel", "Ljava/lang/String;", "getCompass_mode-vlYN4T0", "getPaprika_mode-KLP3kNA", "getTool_search_mode-OP4DWQA", "getThinking_mode-KLP3kNA", "getEffort_level-_couWBU", "getPreview_feature_uses_artifacts", "getEnabled_turmeric", "Companion", "ym2", "zm2", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatConversationSettings {
    public static final int $stable = 0;
    private final String compass_mode;
    private final String effort_level;
    private final Map<McpToolKey, Boolean> enabled_mcp_tools;
    private final Boolean enabled_monkeys_in_a_barrel;
    private final Boolean enabled_turmeric;
    private final Boolean enabled_web_search;
    private final String paprika_mode;
    private final Boolean preview_feature_uses_artifacts;
    private final String thinking_mode;
    private final String tool_search_mode;
    public static final zm2 Companion = new zm2();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new rc1(12)), null, null, null, null, null, null, null, null, null};

    private /* synthetic */ ChatConversationSettings(int i, Map map, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, Boolean bool3, Boolean bool4, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.enabled_mcp_tools = null;
        } else {
            this.enabled_mcp_tools = map;
        }
        if ((i & 2) == 0) {
            this.enabled_web_search = null;
        } else {
            this.enabled_web_search = bool;
        }
        if ((i & 4) == 0) {
            this.enabled_monkeys_in_a_barrel = null;
        } else {
            this.enabled_monkeys_in_a_barrel = bool2;
        }
        if ((i & 8) == 0) {
            this.compass_mode = null;
        } else {
            this.compass_mode = str;
        }
        if ((i & 16) == 0) {
            this.paprika_mode = null;
        } else {
            this.paprika_mode = str2;
        }
        if ((i & 32) == 0) {
            this.tool_search_mode = null;
        } else {
            this.tool_search_mode = str3;
        }
        if ((i & 64) == 0) {
            this.thinking_mode = null;
        } else {
            this.thinking_mode = str4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.effort_level = null;
        } else {
            this.effort_level = str5;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.preview_feature_uses_artifacts = null;
        } else {
            this.preview_feature_uses_artifacts = bool3;
        }
        if ((i & 512) == 0) {
            this.enabled_turmeric = null;
        } else {
            this.enabled_turmeric = bool4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f7a(m4b.a, zt1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-2-p3SJ4$default, reason: not valid java name */
    public static /* synthetic */ ChatConversationSettings m177copy2p3SJ4$default(ChatConversationSettings chatConversationSettings, Map map, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            map = chatConversationSettings.enabled_mcp_tools;
        }
        if ((i & 2) != 0) {
            bool = chatConversationSettings.enabled_web_search;
        }
        if ((i & 4) != 0) {
            bool2 = chatConversationSettings.enabled_monkeys_in_a_barrel;
        }
        if ((i & 8) != 0) {
            str = chatConversationSettings.compass_mode;
        }
        if ((i & 16) != 0) {
            str2 = chatConversationSettings.paprika_mode;
        }
        if ((i & 32) != 0) {
            str3 = chatConversationSettings.tool_search_mode;
        }
        if ((i & 64) != 0) {
            str4 = chatConversationSettings.thinking_mode;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str5 = chatConversationSettings.effort_level;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            bool3 = chatConversationSettings.preview_feature_uses_artifacts;
        }
        if ((i & 512) != 0) {
            bool4 = chatConversationSettings.enabled_turmeric;
        }
        Boolean bool5 = bool3;
        Boolean bool6 = bool4;
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        return chatConversationSettings.m183copy2p3SJ4(map, bool, bool2, str, str8, str9, str6, str7, bool5, bool6);
    }

    public static final /* synthetic */ void write$Self$api(ChatConversationSettings self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.enabled_mcp_tools != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.enabled_mcp_tools);
        }
        if (output.E(serialDesc) || self.enabled_web_search != null) {
            output.B(serialDesc, 1, zt1.a, self.enabled_web_search);
        }
        if (output.E(serialDesc) || self.enabled_monkeys_in_a_barrel != null) {
            output.B(serialDesc, 2, zt1.a, self.enabled_monkeys_in_a_barrel);
        }
        if (output.E(serialDesc) || self.compass_mode != null) {
            rle rleVar = rle.a;
            String str = self.compass_mode;
            output.B(serialDesc, 3, rleVar, str != null ? ResearchMode.m1093boximpl(str) : null);
        }
        if (output.E(serialDesc) || self.paprika_mode != null) {
            emh emhVar = emh.a;
            String str2 = self.paprika_mode;
            output.B(serialDesc, 4, emhVar, str2 != null ? ThinkingMode.m1142boximpl(str2) : null);
        }
        if (output.E(serialDesc) || self.tool_search_mode != null) {
            qzh qzhVar = qzh.a;
            String str3 = self.tool_search_mode;
            output.B(serialDesc, 5, qzhVar, str3 != null ? ToolSearchMode.m1150boximpl(str3) : null);
        }
        if (output.E(serialDesc) || self.thinking_mode != null) {
            emh emhVar2 = emh.a;
            String str4 = self.thinking_mode;
            output.B(serialDesc, 6, emhVar2, str4 != null ? ThinkingMode.m1142boximpl(str4) : null);
        }
        if (output.E(serialDesc) || self.effort_level != null) {
            zlh zlhVar = zlh.a;
            String str5 = self.effort_level;
            output.B(serialDesc, 7, zlhVar, str5 != null ? ThinkingEffort.m1135boximpl(str5) : null);
        }
        if (output.E(serialDesc) || self.preview_feature_uses_artifacts != null) {
            output.B(serialDesc, 8, zt1.a, self.preview_feature_uses_artifacts);
        }
        if (!output.E(serialDesc) && self.enabled_turmeric == null) {
            return;
        }
        output.B(serialDesc, 9, zt1.a, self.enabled_turmeric);
    }

    public final Map<McpToolKey, Boolean> component1() {
        return this.enabled_mcp_tools;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getEnabled_turmeric() {
        return this.enabled_turmeric;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEnabled_web_search() {
        return this.enabled_web_search;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getEnabled_monkeys_in_a_barrel() {
        return this.enabled_monkeys_in_a_barrel;
    }

    /* JADX INFO: renamed from: component4-vlYN4T0, reason: not valid java name and from getter */
    public final String getCompass_mode() {
        return this.compass_mode;
    }

    /* JADX INFO: renamed from: component5-KLP3kNA, reason: not valid java name and from getter */
    public final String getPaprika_mode() {
        return this.paprika_mode;
    }

    /* JADX INFO: renamed from: component6-OP4DWQA, reason: not valid java name and from getter */
    public final String getTool_search_mode() {
        return this.tool_search_mode;
    }

    /* JADX INFO: renamed from: component7-KLP3kNA, reason: not valid java name and from getter */
    public final String getThinking_mode() {
        return this.thinking_mode;
    }

    /* JADX INFO: renamed from: component8-_couWBU, reason: not valid java name and from getter */
    public final String getEffort_level() {
        return this.effort_level;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getPreview_feature_uses_artifacts() {
        return this.preview_feature_uses_artifacts;
    }

    /* JADX INFO: renamed from: copy-2-p3SJ4, reason: not valid java name */
    public final ChatConversationSettings m183copy2p3SJ4(Map<McpToolKey, Boolean> enabled_mcp_tools, Boolean enabled_web_search, Boolean enabled_monkeys_in_a_barrel, String compass_mode, String paprika_mode, String tool_search_mode, String thinking_mode, String effort_level, Boolean preview_feature_uses_artifacts, Boolean enabled_turmeric) {
        return new ChatConversationSettings(enabled_mcp_tools, enabled_web_search, enabled_monkeys_in_a_barrel, compass_mode, paprika_mode, tool_search_mode, thinking_mode, effort_level, preview_feature_uses_artifacts, enabled_turmeric, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008f  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.chat.ChatConversationSettings
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.chat.ChatConversationSettings r5 = (com.anthropic.claude.api.chat.ChatConversationSettings) r5
            java.util.Map<com.anthropic.claude.types.strings.McpToolKey, java.lang.Boolean> r1 = r4.enabled_mcp_tools
            java.util.Map<com.anthropic.claude.types.strings.McpToolKey, java.lang.Boolean> r3 = r5.enabled_mcp_tools
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Boolean r1 = r4.enabled_web_search
            java.lang.Boolean r3 = r5.enabled_web_search
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Boolean r1 = r4.enabled_monkeys_in_a_barrel
            java.lang.Boolean r3 = r5.enabled_monkeys_in_a_barrel
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.compass_mode
            java.lang.String r3 = r5.compass_mode
            if (r1 != 0) goto L39
            if (r3 != 0) goto L37
            r1 = r0
            goto L40
        L37:
            r1 = r2
            goto L40
        L39:
            if (r3 != 0) goto L3c
            goto L37
        L3c:
            boolean r1 = com.anthropic.claude.types.strings.ResearchMode.m1096equalsimpl0(r1, r3)
        L40:
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.paprika_mode
            java.lang.String r3 = r5.paprika_mode
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
            boolean r1 = com.anthropic.claude.types.strings.ThinkingMode.m1145equalsimpl0(r1, r3)
        L56:
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r1 = r4.tool_search_mode
            java.lang.String r3 = r5.tool_search_mode
            if (r1 != 0) goto L65
            if (r3 != 0) goto L63
            r1 = r0
            goto L6c
        L63:
            r1 = r2
            goto L6c
        L65:
            if (r3 != 0) goto L68
            goto L63
        L68:
            boolean r1 = com.anthropic.claude.types.strings.ToolSearchMode.m1153equalsimpl0(r1, r3)
        L6c:
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.String r1 = r4.thinking_mode
            java.lang.String r3 = r5.thinking_mode
            if (r1 != 0) goto L7b
            if (r3 != 0) goto L79
            r1 = r0
            goto L82
        L79:
            r1 = r2
            goto L82
        L7b:
            if (r3 != 0) goto L7e
            goto L79
        L7e:
            boolean r1 = com.anthropic.claude.types.strings.ThinkingMode.m1145equalsimpl0(r1, r3)
        L82:
            if (r1 != 0) goto L85
            return r2
        L85:
            java.lang.String r1 = r4.effort_level
            java.lang.String r3 = r5.effort_level
            if (r1 != 0) goto L91
            if (r3 != 0) goto L8f
            r1 = r0
            goto L98
        L8f:
            r1 = r2
            goto L98
        L91:
            if (r3 != 0) goto L94
            goto L8f
        L94:
            boolean r1 = com.anthropic.claude.types.strings.ThinkingEffort.m1138equalsimpl0(r1, r3)
        L98:
            if (r1 != 0) goto L9b
            return r2
        L9b:
            java.lang.Boolean r1 = r4.preview_feature_uses_artifacts
            java.lang.Boolean r3 = r5.preview_feature_uses_artifacts
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto La6
            return r2
        La6:
            java.lang.Boolean r4 = r4.enabled_turmeric
            java.lang.Boolean r5 = r5.enabled_turmeric
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto Lb1
            return r2
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.ChatConversationSettings.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getCompass_mode-vlYN4T0, reason: not valid java name */
    public final String m184getCompass_modevlYN4T0() {
        return this.compass_mode;
    }

    /* JADX INFO: renamed from: getEffort_level-_couWBU, reason: not valid java name */
    public final String m185getEffort_level_couWBU() {
        return this.effort_level;
    }

    public final Map<McpToolKey, Boolean> getEnabled_mcp_tools() {
        return this.enabled_mcp_tools;
    }

    public final Boolean getEnabled_monkeys_in_a_barrel() {
        return this.enabled_monkeys_in_a_barrel;
    }

    public final Boolean getEnabled_turmeric() {
        return this.enabled_turmeric;
    }

    public final Boolean getEnabled_web_search() {
        return this.enabled_web_search;
    }

    /* JADX INFO: renamed from: getPaprika_mode-KLP3kNA, reason: not valid java name */
    public final String m186getPaprika_modeKLP3kNA() {
        return this.paprika_mode;
    }

    public final Boolean getPreview_feature_uses_artifacts() {
        return this.preview_feature_uses_artifacts;
    }

    /* JADX INFO: renamed from: getThinking_mode-KLP3kNA, reason: not valid java name */
    public final String m187getThinking_modeKLP3kNA() {
        return this.thinking_mode;
    }

    /* JADX INFO: renamed from: getTool_search_mode-OP4DWQA, reason: not valid java name */
    public final String m188getTool_search_modeOP4DWQA() {
        return this.tool_search_mode;
    }

    public int hashCode() {
        Map<McpToolKey, Boolean> map = this.enabled_mcp_tools;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Boolean bool = this.enabled_web_search;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enabled_monkeys_in_a_barrel;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.compass_mode;
        int iM1097hashCodeimpl = (iHashCode3 + (str == null ? 0 : ResearchMode.m1097hashCodeimpl(str))) * 31;
        String str2 = this.paprika_mode;
        int iM1146hashCodeimpl = (iM1097hashCodeimpl + (str2 == null ? 0 : ThinkingMode.m1146hashCodeimpl(str2))) * 31;
        String str3 = this.tool_search_mode;
        int iM1154hashCodeimpl = (iM1146hashCodeimpl + (str3 == null ? 0 : ToolSearchMode.m1154hashCodeimpl(str3))) * 31;
        String str4 = this.thinking_mode;
        int iM1146hashCodeimpl2 = (iM1154hashCodeimpl + (str4 == null ? 0 : ThinkingMode.m1146hashCodeimpl(str4))) * 31;
        String str5 = this.effort_level;
        int iM1139hashCodeimpl = (iM1146hashCodeimpl2 + (str5 == null ? 0 : ThinkingEffort.m1139hashCodeimpl(str5))) * 31;
        Boolean bool3 = this.preview_feature_uses_artifacts;
        int iHashCode4 = (iM1139hashCodeimpl + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.enabled_turmeric;
        return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        Map<McpToolKey, Boolean> map = this.enabled_mcp_tools;
        Boolean bool = this.enabled_web_search;
        Boolean bool2 = this.enabled_monkeys_in_a_barrel;
        String str = this.compass_mode;
        String strM1098toStringimpl = str == null ? "null" : ResearchMode.m1098toStringimpl(str);
        String str2 = this.paprika_mode;
        String strM1148toStringimpl = str2 == null ? "null" : ThinkingMode.m1148toStringimpl(str2);
        String str3 = this.tool_search_mode;
        String strM1155toStringimpl = str3 == null ? "null" : ToolSearchMode.m1155toStringimpl(str3);
        String str4 = this.thinking_mode;
        String strM1148toStringimpl2 = str4 == null ? "null" : ThinkingMode.m1148toStringimpl(str4);
        String str5 = this.effort_level;
        String strM1140toStringimpl = str5 != null ? ThinkingEffort.m1140toStringimpl(str5) : "null";
        Boolean bool3 = this.preview_feature_uses_artifacts;
        Boolean bool4 = this.enabled_turmeric;
        StringBuilder sb = new StringBuilder("ChatConversationSettings(enabled_mcp_tools=");
        sb.append(map);
        sb.append(", enabled_web_search=");
        sb.append(bool);
        sb.append(", enabled_monkeys_in_a_barrel=");
        sb.append(bool2);
        sb.append(", compass_mode=");
        sb.append(strM1098toStringimpl);
        sb.append(", paprika_mode=");
        kgh.u(sb, strM1148toStringimpl, ", tool_search_mode=", strM1155toStringimpl, ", thinking_mode=");
        kgh.u(sb, strM1148toStringimpl2, ", effort_level=", strM1140toStringimpl, ", preview_feature_uses_artifacts=");
        sb.append(bool3);
        sb.append(", enabled_turmeric=");
        sb.append(bool4);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ChatConversationSettings(Map map, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, Boolean bool3, Boolean bool4, mq5 mq5Var) {
        this(map, bool, bool2, str, str2, str3, str4, str5, bool3, bool4);
    }

    public /* synthetic */ ChatConversationSettings(int i, Map map, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, Boolean bool3, Boolean bool4, vnf vnfVar, mq5 mq5Var) {
        this(i, map, bool, bool2, str, str2, str3, str4, str5, bool3, bool4, vnfVar);
    }

    private ChatConversationSettings(Map<McpToolKey, Boolean> map, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, Boolean bool3, Boolean bool4) {
        this.enabled_mcp_tools = map;
        this.enabled_web_search = bool;
        this.enabled_monkeys_in_a_barrel = bool2;
        this.compass_mode = str;
        this.paprika_mode = str2;
        this.tool_search_mode = str3;
        this.thinking_mode = str4;
        this.effort_level = str5;
        this.preview_feature_uses_artifacts = bool3;
        this.enabled_turmeric = bool4;
    }

    public /* synthetic */ ChatConversationSettings(Map map, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, Boolean bool3, Boolean bool4, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str5, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : bool3, (i & 512) != 0 ? null : bool4, null);
    }
}
