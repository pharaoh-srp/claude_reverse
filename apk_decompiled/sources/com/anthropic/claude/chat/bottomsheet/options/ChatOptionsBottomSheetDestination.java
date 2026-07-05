package com.anthropic.claude.chat.bottomsheet.options;

import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.types.strings.McpServerId;
import com.anthropic.claude.types.strings.McpToolKey;
import defpackage.bga;
import defpackage.cc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.lz5;
import defpackage.m4b;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p3b;
import defpackage.rc1;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u000e\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\r\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "Closed", "AddToChat", "SelectProject", "SelectStyle", "Connectors", "ConnectorDirectory", "ConnectorDirectoryDetail", "AddFromMcpServer", "McpPromptTemplate", "McpServerTools", "McpToolPermission", "McpSetAllToolsPermission", "SelectToolAccess", "com/anthropic/claude/chat/bottomsheet/options/c", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$AddFromMcpServer;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$AddToChat;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$Closed;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$ConnectorDirectory;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$ConnectorDirectoryDetail;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$Connectors;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpPromptTemplate;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpServerTools;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpSetAllToolsPermission;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpToolPermission;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$SelectProject;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$SelectStyle;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$SelectToolAccess;", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface ChatOptionsBottomSheetDestination extends bga {
    public static final c Companion = c.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$AddToChat;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AddToChat implements ChatOptionsBottomSheetDestination {
        public static final int $stable = 0;
        public static final AddToChat INSTANCE = new AddToChat();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rc1(20));

        private AddToChat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination.AddToChat", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AddToChat);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1833309287;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "AddToChat";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$Closed;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Closed implements ChatOptionsBottomSheetDestination, EmptyDestination {
        public static final int $stable = 0;
        public static final Closed INSTANCE = new Closed();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rc1(21));

        private Closed() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination.Closed", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Closed);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -2138860967;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Closed";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$ConnectorDirectory;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ConnectorDirectory implements ChatOptionsBottomSheetDestination {
        public static final int $stable = 0;
        public static final ConnectorDirectory INSTANCE = new ConnectorDirectory();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rc1(22));

        private ConnectorDirectory() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination.ConnectorDirectory", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ConnectorDirectory);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -330004979;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ConnectorDirectory";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$Connectors;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Connectors implements ChatOptionsBottomSheetDestination {
        public static final int $stable = 0;
        public static final Connectors INSTANCE = new Connectors();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rc1(23));

        private Connectors() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination.Connectors", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Connectors);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -505018317;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Connectors";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$SelectProject;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SelectProject implements ChatOptionsBottomSheetDestination {
        public static final int $stable = 0;
        public static final SelectProject INSTANCE = new SelectProject();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rc1(24));

        private SelectProject() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination.SelectProject", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SelectProject);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1022506224;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SelectProject";
        }
    }

    @lz5
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\u0002\b\u0013Ê\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$SelectStyle;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlin/Deprecated;", "message", "Response styles removed — tombstone for saved-state restore only", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SelectStyle implements ChatOptionsBottomSheetDestination, EmptyDestination {
        public static final int $stable = 0;
        public static final SelectStyle INSTANCE = new SelectStyle();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rc1(25));

        private SelectStyle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination.SelectStyle", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SelectStyle);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 3903816;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SelectStyle";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$SelectToolAccess;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SelectToolAccess implements ChatOptionsBottomSheetDestination {
        public static final int $stable = 0;
        public static final SelectToolAccess INSTANCE = new SelectToolAccess();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rc1(26));

        private SelectToolAccess() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination.SelectToolAccess", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SelectToolAccess);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -1634817051;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SelectToolAccess";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Chat;
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$AddFromMcpServer;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/McpServerId;", "serverId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$AddFromMcpServer;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "copy-tfiJZf4", "(Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$AddFromMcpServer;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServerId-owoRr7k", "Companion", "com/anthropic/claude/chat/bottomsheet/options/a", "com/anthropic/claude/chat/bottomsheet/options/b", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AddFromMcpServer implements ChatOptionsBottomSheetDestination {
        public static final int $stable = 0;
        public static final b Companion = new b();
        private final String serverId;

        private /* synthetic */ AddFromMcpServer(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.serverId = str;
            } else {
                gvj.f(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-tfiJZf4$default, reason: not valid java name */
        public static /* synthetic */ AddFromMcpServer m630copytfiJZf4$default(AddFromMcpServer addFromMcpServer, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addFromMcpServer.serverId;
            }
            return addFromMcpServer.m632copytfiJZf4(str);
        }

        /* JADX INFO: renamed from: component1-owoRr7k, reason: not valid java name and from getter */
        public final String getServerId() {
            return this.serverId;
        }

        /* JADX INFO: renamed from: copy-tfiJZf4, reason: not valid java name */
        public final AddFromMcpServer m632copytfiJZf4(String serverId) {
            serverId.getClass();
            return new AddFromMcpServer(serverId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddFromMcpServer) && McpServerId.m1032equalsimpl0(this.serverId, ((AddFromMcpServer) other).serverId);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getServerId-owoRr7k, reason: not valid java name */
        public final String m633getServerIdowoRr7k() {
            return this.serverId;
        }

        public int hashCode() {
            return McpServerId.m1033hashCodeimpl(this.serverId);
        }

        public String toString() {
            return ij0.j("AddFromMcpServer(serverId=", McpServerId.m1034toStringimpl(this.serverId), ")");
        }

        public /* synthetic */ AddFromMcpServer(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ AddFromMcpServer(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private AddFromMcpServer(String str) {
            str.getClass();
            this.serverId = str;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$ConnectorDirectoryDetail;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "Lcom/anthropic/claude/api/mcp/DirectoryServer;", "server", "<init>", "(Lcom/anthropic/claude/api/mcp/DirectoryServer;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/mcp/DirectoryServer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$ConnectorDirectoryDetail;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/mcp/DirectoryServer;", "copy", "(Lcom/anthropic/claude/api/mcp/DirectoryServer;)Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$ConnectorDirectoryDetail;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/mcp/DirectoryServer;", "getServer", "Companion", "com/anthropic/claude/chat/bottomsheet/options/d", "com/anthropic/claude/chat/bottomsheet/options/e", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ConnectorDirectoryDetail implements ChatOptionsBottomSheetDestination {
        public static final int $stable = 0;
        public static final e Companion = new e();
        private final DirectoryServer server;

        public /* synthetic */ ConnectorDirectoryDetail(int i, DirectoryServer directoryServer, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.server = directoryServer;
            } else {
                gvj.f(i, 1, d.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ConnectorDirectoryDetail copy$default(ConnectorDirectoryDetail connectorDirectoryDetail, DirectoryServer directoryServer, int i, Object obj) {
            if ((i & 1) != 0) {
                directoryServer = connectorDirectoryDetail.server;
            }
            return connectorDirectoryDetail.copy(directoryServer);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DirectoryServer getServer() {
            return this.server;
        }

        public final ConnectorDirectoryDetail copy(DirectoryServer server) {
            server.getClass();
            return new ConnectorDirectoryDetail(server);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConnectorDirectoryDetail) && x44.r(this.server, ((ConnectorDirectoryDetail) other).server);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final DirectoryServer getServer() {
            return this.server;
        }

        public int hashCode() {
            return this.server.hashCode();
        }

        public String toString() {
            return "ConnectorDirectoryDetail(server=" + this.server + ")";
        }

        public ConnectorDirectoryDetail(DirectoryServer directoryServer) {
            directoryServer.getClass();
            this.server = directoryServer;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpServerTools;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/McpServerId;", "serverId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpServerTools;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "copy-tfiJZf4", "(Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpServerTools;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServerId-owoRr7k", "Companion", "com/anthropic/claude/chat/bottomsheet/options/h", "com/anthropic/claude/chat/bottomsheet/options/i", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class McpServerTools implements ChatOptionsBottomSheetDestination {
        public static final int $stable = 0;
        public static final i Companion = new i();
        private final String serverId;

        private /* synthetic */ McpServerTools(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.serverId = str;
            } else {
                gvj.f(i, 1, h.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-tfiJZf4$default, reason: not valid java name */
        public static /* synthetic */ McpServerTools m638copytfiJZf4$default(McpServerTools mcpServerTools, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mcpServerTools.serverId;
            }
            return mcpServerTools.m640copytfiJZf4(str);
        }

        /* JADX INFO: renamed from: component1-owoRr7k, reason: not valid java name and from getter */
        public final String getServerId() {
            return this.serverId;
        }

        /* JADX INFO: renamed from: copy-tfiJZf4, reason: not valid java name */
        public final McpServerTools m640copytfiJZf4(String serverId) {
            serverId.getClass();
            return new McpServerTools(serverId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof McpServerTools) && McpServerId.m1032equalsimpl0(this.serverId, ((McpServerTools) other).serverId);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getServerId-owoRr7k, reason: not valid java name */
        public final String m641getServerIdowoRr7k() {
            return this.serverId;
        }

        public int hashCode() {
            return McpServerId.m1033hashCodeimpl(this.serverId);
        }

        public String toString() {
            return ij0.j("McpServerTools(serverId=", McpServerId.m1034toStringimpl(this.serverId), ")");
        }

        public /* synthetic */ McpServerTools(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ McpServerTools(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private McpServerTools(String str) {
            str.getClass();
            this.serverId = str;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpSetAllToolsPermission;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/McpServerId;", "serverId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpSetAllToolsPermission;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "copy-tfiJZf4", "(Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpSetAllToolsPermission;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServerId-owoRr7k", "Companion", "com/anthropic/claude/chat/bottomsheet/options/j", "com/anthropic/claude/chat/bottomsheet/options/k", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class McpSetAllToolsPermission implements ChatOptionsBottomSheetDestination {
        public static final int $stable = 0;
        public static final k Companion = new k();
        private final String serverId;

        private /* synthetic */ McpSetAllToolsPermission(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.serverId = str;
            } else {
                gvj.f(i, 1, j.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-tfiJZf4$default, reason: not valid java name */
        public static /* synthetic */ McpSetAllToolsPermission m642copytfiJZf4$default(McpSetAllToolsPermission mcpSetAllToolsPermission, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mcpSetAllToolsPermission.serverId;
            }
            return mcpSetAllToolsPermission.m644copytfiJZf4(str);
        }

        /* JADX INFO: renamed from: component1-owoRr7k, reason: not valid java name and from getter */
        public final String getServerId() {
            return this.serverId;
        }

        /* JADX INFO: renamed from: copy-tfiJZf4, reason: not valid java name */
        public final McpSetAllToolsPermission m644copytfiJZf4(String serverId) {
            serverId.getClass();
            return new McpSetAllToolsPermission(serverId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof McpSetAllToolsPermission) && McpServerId.m1032equalsimpl0(this.serverId, ((McpSetAllToolsPermission) other).serverId);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getServerId-owoRr7k, reason: not valid java name */
        public final String m645getServerIdowoRr7k() {
            return this.serverId;
        }

        public int hashCode() {
            return McpServerId.m1033hashCodeimpl(this.serverId);
        }

        public String toString() {
            return ij0.j("McpSetAllToolsPermission(serverId=", McpServerId.m1034toStringimpl(this.serverId), ")");
        }

        public /* synthetic */ McpSetAllToolsPermission(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ McpSetAllToolsPermission(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private McpSetAllToolsPermission(String str) {
            str.getClass();
            this.serverId = str;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpPromptTemplate;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/McpServerId;", "serverId", "", "promptName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpPromptTemplate;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "component2", "copy-l3aBY8c", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpPromptTemplate;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServerId-owoRr7k", "getPromptName", "Companion", "com/anthropic/claude/chat/bottomsheet/options/f", "com/anthropic/claude/chat/bottomsheet/options/g", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class McpPromptTemplate implements ChatOptionsBottomSheetDestination {
        public static final int $stable = 0;
        public static final g Companion = new g();
        private final String promptName;
        private final String serverId;

        private /* synthetic */ McpPromptTemplate(int i, String str, String str2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, f.a.getDescriptor());
                throw null;
            }
            this.serverId = str;
            this.promptName = str2;
        }

        /* JADX INFO: renamed from: copy-l3aBY8c$default, reason: not valid java name */
        public static /* synthetic */ McpPromptTemplate m634copyl3aBY8c$default(McpPromptTemplate mcpPromptTemplate, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mcpPromptTemplate.serverId;
            }
            if ((i & 2) != 0) {
                str2 = mcpPromptTemplate.promptName;
            }
            return mcpPromptTemplate.m636copyl3aBY8c(str, str2);
        }

        public static final /* synthetic */ void write$Self$chat(McpPromptTemplate self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, p3b.a, McpServerId.m1029boximpl(self.serverId));
            output.q(serialDesc, 1, self.promptName);
        }

        /* JADX INFO: renamed from: component1-owoRr7k, reason: not valid java name and from getter */
        public final String getServerId() {
            return this.serverId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPromptName() {
            return this.promptName;
        }

        /* JADX INFO: renamed from: copy-l3aBY8c, reason: not valid java name */
        public final McpPromptTemplate m636copyl3aBY8c(String serverId, String promptName) {
            serverId.getClass();
            promptName.getClass();
            return new McpPromptTemplate(serverId, promptName, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof McpPromptTemplate)) {
                return false;
            }
            McpPromptTemplate mcpPromptTemplate = (McpPromptTemplate) other;
            return McpServerId.m1032equalsimpl0(this.serverId, mcpPromptTemplate.serverId) && x44.r(this.promptName, mcpPromptTemplate.promptName);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getPromptName() {
            return this.promptName;
        }

        /* JADX INFO: renamed from: getServerId-owoRr7k, reason: not valid java name */
        public final String m637getServerIdowoRr7k() {
            return this.serverId;
        }

        public int hashCode() {
            return this.promptName.hashCode() + (McpServerId.m1033hashCodeimpl(this.serverId) * 31);
        }

        public String toString() {
            return ij0.l("McpPromptTemplate(serverId=", McpServerId.m1034toStringimpl(this.serverId), ", promptName=", this.promptName, ")");
        }

        public /* synthetic */ McpPromptTemplate(String str, String str2, mq5 mq5Var) {
            this(str, str2);
        }

        public /* synthetic */ McpPromptTemplate(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, vnfVar);
        }

        private McpPromptTemplate(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.serverId = str;
            this.promptName = str2;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010\u0017¨\u0006-"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpToolPermission;", "Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/McpServerId;", "serverId", "Lcom/anthropic/claude/types/strings/McpToolKey;", "toolKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpToolPermission;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-owoRr7k", "()Ljava/lang/String;", "component1", "component2-2XhPmjI", "component2", "copy-PBZ9YLA", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/options/ChatOptionsBottomSheetDestination$McpToolPermission;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServerId-owoRr7k", "getToolKey-2XhPmjI", "Companion", "com/anthropic/claude/chat/bottomsheet/options/l", "com/anthropic/claude/chat/bottomsheet/options/m", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class McpToolPermission implements ChatOptionsBottomSheetDestination {
        public static final int $stable = 0;
        public static final m Companion = new m();
        private final String serverId;
        private final String toolKey;

        private /* synthetic */ McpToolPermission(int i, String str, String str2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, l.a.getDescriptor());
                throw null;
            }
            this.serverId = str;
            this.toolKey = str2;
        }

        /* JADX INFO: renamed from: copy-PBZ9YLA$default, reason: not valid java name */
        public static /* synthetic */ McpToolPermission m646copyPBZ9YLA$default(McpToolPermission mcpToolPermission, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mcpToolPermission.serverId;
            }
            if ((i & 2) != 0) {
                str2 = mcpToolPermission.toolKey;
            }
            return mcpToolPermission.m649copyPBZ9YLA(str, str2);
        }

        public static final /* synthetic */ void write$Self$chat(McpToolPermission self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, p3b.a, McpServerId.m1029boximpl(self.serverId));
            output.r(serialDesc, 1, m4b.a, McpToolKey.m1043boximpl(self.toolKey));
        }

        /* JADX INFO: renamed from: component1-owoRr7k, reason: not valid java name and from getter */
        public final String getServerId() {
            return this.serverId;
        }

        /* JADX INFO: renamed from: component2-2XhPmjI, reason: not valid java name and from getter */
        public final String getToolKey() {
            return this.toolKey;
        }

        /* JADX INFO: renamed from: copy-PBZ9YLA, reason: not valid java name */
        public final McpToolPermission m649copyPBZ9YLA(String serverId, String toolKey) {
            serverId.getClass();
            toolKey.getClass();
            return new McpToolPermission(serverId, toolKey, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof McpToolPermission)) {
                return false;
            }
            McpToolPermission mcpToolPermission = (McpToolPermission) other;
            return McpServerId.m1032equalsimpl0(this.serverId, mcpToolPermission.serverId) && McpToolKey.m1046equalsimpl0(this.toolKey, mcpToolPermission.toolKey);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getServerId-owoRr7k, reason: not valid java name */
        public final String m650getServerIdowoRr7k() {
            return this.serverId;
        }

        /* JADX INFO: renamed from: getToolKey-2XhPmjI, reason: not valid java name */
        public final String m651getToolKey2XhPmjI() {
            return this.toolKey;
        }

        public int hashCode() {
            return McpToolKey.m1048hashCodeimpl(this.toolKey) + (McpServerId.m1033hashCodeimpl(this.serverId) * 31);
        }

        public String toString() {
            return ij0.l("McpToolPermission(serverId=", McpServerId.m1034toStringimpl(this.serverId), ", toolKey=", McpToolKey.m1049toStringimpl(this.toolKey), ")");
        }

        public /* synthetic */ McpToolPermission(String str, String str2, mq5 mq5Var) {
            this(str, str2);
        }

        public /* synthetic */ McpToolPermission(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, vnfVar);
        }

        private McpToolPermission(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.serverId = str;
            this.toolKey = str2;
        }
    }
}
