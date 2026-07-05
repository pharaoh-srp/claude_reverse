package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.McpToolApprovalKey;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ResearchTaskId;
import com.anthropic.claude.types.strings.ToolUseId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bga;
import defpackage.c1i;
import defpackage.cc;
import defpackage.ebh;
import defpackage.ehb;
import defpackage.elb;
import defpackage.fsh;
import defpackage.ghb;
import defpackage.grc;
import defpackage.gvj;
import defpackage.h4b;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ntc;
import defpackage.onf;
import defpackage.ps2;
import defpackage.sq6;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vq9;
import defpackage.vs2;
import defpackage.w1a;
import defpackage.w53;
import defpackage.wy2;
import defpackage.x44;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u001a\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0019!\"#$%&'()*+,-./0123456789¨\u0006:À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "Closed", "SelectText", "PreviewImage", "PreviewLocalImage", "PreviewDocument", "PreviewBlob", "PreviewAttachment", "PreviewPdf", "PreviewLink", "Feedback", "VoiceFeedback", "VoiceSettings", "ViewSources", "ViewToolContent", "ViewCombinedSources", "ViewResearchDetails", "ViewAllChatArtifacts", "ViewAllWiggleArtifacts", "AgeAssurance", "Share", "ToolApproval", "LocalToolApproval", "ViewCollapsedTools", "SshHelplines", "ViewCode", "com/anthropic/claude/chat/bottomsheet/g", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$AgeAssurance;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$Closed;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$Feedback;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$LocalToolApproval;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewAttachment;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewBlob;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewDocument;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewImage;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewLink;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewLocalImage;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewPdf;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$SelectText;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$Share;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$SshHelplines;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ToolApproval;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewAllChatArtifacts;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewAllWiggleArtifacts;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewCode;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewCollapsedTools;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewCombinedSources;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewResearchDetails;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewSources;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewToolContent;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$VoiceFeedback;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$VoiceSettings;", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface ChatScreenModalBottomSheetDestination extends bga {
    public static final g Companion = g.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$AgeAssurance;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AgeAssurance implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final AgeAssurance INSTANCE = new AgeAssurance();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(11));

        private AgeAssurance() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.AgeAssurance", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AgeAssurance);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -2057292696;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "AgeAssurance";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$Closed;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Closed implements ChatScreenModalBottomSheetDestination, EmptyDestination {
        public static final int $stable = 0;
        public static final Closed INSTANCE = new Closed();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(12));

        private Closed() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.Closed", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Closed);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -450800538;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Closed";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewAllChatArtifacts;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewAllChatArtifacts implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final ViewAllChatArtifacts INSTANCE = new ViewAllChatArtifacts();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(13));

        private ViewAllChatArtifacts() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.ViewAllChatArtifacts", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ViewAllChatArtifacts);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -1579027833;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ViewAllChatArtifacts";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewAllWiggleArtifacts;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewAllWiggleArtifacts implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final ViewAllWiggleArtifacts INSTANCE = new ViewAllWiggleArtifacts();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(14));

        private ViewAllWiggleArtifacts() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.ViewAllWiggleArtifacts", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ViewAllWiggleArtifacts);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1972730772;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ViewAllWiggleArtifacts";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$VoiceSettings;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class VoiceSettings implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final VoiceSettings INSTANCE = new VoiceSettings();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new w53(15));

        private VoiceSettings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.VoiceSettings", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof VoiceSettings);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1483919163;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "VoiceSettings";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Chat;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewAttachment;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "", "localId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewAttachment;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewAttachment;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLocalId", "Companion", "com/anthropic/claude/chat/bottomsheet/l", "com/anthropic/claude/chat/bottomsheet/m", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PreviewAttachment implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final m Companion = new m();
        private final String localId;

        public /* synthetic */ PreviewAttachment(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.localId = str;
            } else {
                gvj.f(i, 1, l.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ PreviewAttachment copy$default(PreviewAttachment previewAttachment, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = previewAttachment.localId;
            }
            return previewAttachment.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLocalId() {
            return this.localId;
        }

        public final PreviewAttachment copy(String localId) {
            localId.getClass();
            return new PreviewAttachment(localId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreviewAttachment) && x44.r(this.localId, ((PreviewAttachment) other).localId);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getLocalId() {
            return this.localId;
        }

        public int hashCode() {
            return this.localId.hashCode();
        }

        public String toString() {
            return ij0.j("PreviewAttachment(localId=", this.localId, ")");
        }

        public PreviewAttachment(String str) {
            str.getClass();
            this.localId = str;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewBlob;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lcom/anthropic/claude/api/chat/MessageBlobFile;", "file", "<init>", "(Lcom/anthropic/claude/api/chat/MessageBlobFile;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/chat/MessageBlobFile;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewBlob;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/chat/MessageBlobFile;", "copy", "(Lcom/anthropic/claude/api/chat/MessageBlobFile;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewBlob;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/chat/MessageBlobFile;", "getFile", "Companion", "com/anthropic/claude/chat/bottomsheet/n", "com/anthropic/claude/chat/bottomsheet/o", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PreviewBlob implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final o Companion = new o();
        private final MessageBlobFile file;

        public /* synthetic */ PreviewBlob(int i, MessageBlobFile messageBlobFile, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.file = messageBlobFile;
            } else {
                gvj.f(i, 1, n.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ PreviewBlob copy$default(PreviewBlob previewBlob, MessageBlobFile messageBlobFile, int i, Object obj) {
            if ((i & 1) != 0) {
                messageBlobFile = previewBlob.file;
            }
            return previewBlob.copy(messageBlobFile);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageBlobFile getFile() {
            return this.file;
        }

        public final PreviewBlob copy(MessageBlobFile file) {
            file.getClass();
            return new PreviewBlob(file);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreviewBlob) && x44.r(this.file, ((PreviewBlob) other).file);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final MessageBlobFile getFile() {
            return this.file;
        }

        public int hashCode() {
            return this.file.hashCode();
        }

        public String toString() {
            return "PreviewBlob(file=" + this.file + ")";
        }

        public PreviewBlob(MessageBlobFile messageBlobFile) {
            messageBlobFile.getClass();
            this.file = messageBlobFile;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewDocument;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lcom/anthropic/claude/api/chat/MessageDocumentFile;", "file", "<init>", "(Lcom/anthropic/claude/api/chat/MessageDocumentFile;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/chat/MessageDocumentFile;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewDocument;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/chat/MessageDocumentFile;", "copy", "(Lcom/anthropic/claude/api/chat/MessageDocumentFile;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewDocument;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/chat/MessageDocumentFile;", "getFile", "Companion", "com/anthropic/claude/chat/bottomsheet/p", "com/anthropic/claude/chat/bottomsheet/q", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PreviewDocument implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final q Companion = new q();
        private final MessageDocumentFile file;

        public /* synthetic */ PreviewDocument(int i, MessageDocumentFile messageDocumentFile, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.file = messageDocumentFile;
            } else {
                gvj.f(i, 1, p.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ PreviewDocument copy$default(PreviewDocument previewDocument, MessageDocumentFile messageDocumentFile, int i, Object obj) {
            if ((i & 1) != 0) {
                messageDocumentFile = previewDocument.file;
            }
            return previewDocument.copy(messageDocumentFile);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageDocumentFile getFile() {
            return this.file;
        }

        public final PreviewDocument copy(MessageDocumentFile file) {
            file.getClass();
            return new PreviewDocument(file);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreviewDocument) && x44.r(this.file, ((PreviewDocument) other).file);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final MessageDocumentFile getFile() {
            return this.file;
        }

        public int hashCode() {
            return this.file.hashCode();
        }

        public String toString() {
            return "PreviewDocument(file=" + this.file + ")";
        }

        public PreviewDocument(MessageDocumentFile messageDocumentFile) {
            messageDocumentFile.getClass();
            this.file = messageDocumentFile;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$SelectText;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/MessageId;", "messageId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$SelectText;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-PStrttk", "()Ljava/lang/String;", "component1", "copy-67R_hGI", "(Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$SelectText;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageId-PStrttk", "Companion", "com/anthropic/claude/chat/bottomsheet/z", "com/anthropic/claude/chat/bottomsheet/a0", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SelectText implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final a0 Companion = new a0();
        private final String messageId;

        private /* synthetic */ SelectText(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.messageId = str;
            } else {
                gvj.f(i, 1, z.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-67R_hGI$default, reason: not valid java name */
        public static /* synthetic */ SelectText m608copy67R_hGI$default(SelectText selectText, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selectText.messageId;
            }
            return selectText.m610copy67R_hGI(str);
        }

        /* JADX INFO: renamed from: component1-PStrttk, reason: not valid java name and from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: copy-67R_hGI, reason: not valid java name */
        public final SelectText m610copy67R_hGI(String messageId) {
            messageId.getClass();
            return new SelectText(messageId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectText) && MessageId.m1054equalsimpl0(this.messageId, ((SelectText) other).messageId);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getMessageId-PStrttk, reason: not valid java name */
        public final String m611getMessageIdPStrttk() {
            return this.messageId;
        }

        public int hashCode() {
            return MessageId.m1055hashCodeimpl(this.messageId);
        }

        public String toString() {
            return ij0.j("SelectText(messageId=", MessageId.m1056toStringimpl(this.messageId), ")");
        }

        public /* synthetic */ SelectText(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ SelectText(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private SelectText(String str) {
            str.getClass();
            this.messageId = str;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewCollapsedTools;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "", "Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "blockIds", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewCollapsedTools;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewCollapsedTools;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBlockIds", "Companion", "com/anthropic/claude/chat/bottomsheet/j0", "com/anthropic/claude/chat/bottomsheet/k0", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewCollapsedTools implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 8;
        private final List<ParsedContentBlockId> blockIds;
        public static final k0 Companion = new k0();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new wy2(7))};

        public /* synthetic */ ViewCollapsedTools(int i, List list, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.blockIds = list;
            } else {
                gvj.f(i, 1, j0.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new uo0(ntc.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewCollapsedTools copy$default(ViewCollapsedTools viewCollapsedTools, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = viewCollapsedTools.blockIds;
            }
            return viewCollapsedTools.copy(list);
        }

        public final List<ParsedContentBlockId> component1() {
            return this.blockIds;
        }

        public final ViewCollapsedTools copy(List<ParsedContentBlockId> blockIds) {
            blockIds.getClass();
            return new ViewCollapsedTools(blockIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewCollapsedTools) && x44.r(this.blockIds, ((ViewCollapsedTools) other).blockIds);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final List<ParsedContentBlockId> getBlockIds() {
            return this.blockIds;
        }

        public int hashCode() {
            return this.blockIds.hashCode();
        }

        public String toString() {
            return ebh.n("ViewCollapsedTools(blockIds=", ")", this.blockIds);
        }

        public ViewCollapsedTools(List<ParsedContentBlockId> list) {
            list.getClass();
            this.blockIds = list;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewResearchDetails;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/ResearchTaskId;", "researchTaskId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewResearchDetails;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-2hggyQk", "()Ljava/lang/String;", "component1", "copy-N6p9nPE", "(Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewResearchDetails;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getResearchTaskId-2hggyQk", "Companion", "com/anthropic/claude/chat/bottomsheet/n0", "com/anthropic/claude/chat/bottomsheet/o0", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewResearchDetails implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final o0 Companion = new o0();
        private final String researchTaskId;

        private /* synthetic */ ViewResearchDetails(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.researchTaskId = str;
            } else {
                gvj.f(i, 1, n0.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-N6p9nPE$default, reason: not valid java name */
        public static /* synthetic */ ViewResearchDetails m626copyN6p9nPE$default(ViewResearchDetails viewResearchDetails, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewResearchDetails.researchTaskId;
            }
            return viewResearchDetails.m628copyN6p9nPE(str);
        }

        /* JADX INFO: renamed from: component1-2hggyQk, reason: not valid java name and from getter */
        public final String getResearchTaskId() {
            return this.researchTaskId;
        }

        /* JADX INFO: renamed from: copy-N6p9nPE, reason: not valid java name */
        public final ViewResearchDetails m628copyN6p9nPE(String researchTaskId) {
            researchTaskId.getClass();
            return new ViewResearchDetails(researchTaskId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewResearchDetails) && ResearchTaskId.m1103equalsimpl0(this.researchTaskId, ((ViewResearchDetails) other).researchTaskId);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getResearchTaskId-2hggyQk, reason: not valid java name */
        public final String m629getResearchTaskId2hggyQk() {
            return this.researchTaskId;
        }

        public int hashCode() {
            return ResearchTaskId.m1104hashCodeimpl(this.researchTaskId);
        }

        public String toString() {
            return ij0.j("ViewResearchDetails(researchTaskId=", ResearchTaskId.m1105toStringimpl(this.researchTaskId), ")");
        }

        public /* synthetic */ ViewResearchDetails(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ ViewResearchDetails(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private ViewResearchDetails(String str) {
            str.getClass();
            this.researchTaskId = str;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewToolContent;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "blockId", "<init>", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/chat/parse/ParsedContentBlockId;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewToolContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "copy", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewToolContent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "getBlockId", "Companion", "com/anthropic/claude/chat/bottomsheet/r0", "com/anthropic/claude/chat/bottomsheet/s0", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewToolContent implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final s0 Companion = new s0();
        private final ParsedContentBlockId blockId;

        public /* synthetic */ ViewToolContent(int i, ParsedContentBlockId parsedContentBlockId, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.blockId = parsedContentBlockId;
            } else {
                gvj.f(i, 1, r0.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ViewToolContent copy$default(ViewToolContent viewToolContent, ParsedContentBlockId parsedContentBlockId, int i, Object obj) {
            if ((i & 1) != 0) {
                parsedContentBlockId = viewToolContent.blockId;
            }
            return viewToolContent.copy(parsedContentBlockId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ParsedContentBlockId getBlockId() {
            return this.blockId;
        }

        public final ViewToolContent copy(ParsedContentBlockId blockId) {
            blockId.getClass();
            return new ViewToolContent(blockId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewToolContent) && x44.r(this.blockId, ((ViewToolContent) other).blockId);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final ParsedContentBlockId getBlockId() {
            return this.blockId;
        }

        public int hashCode() {
            return this.blockId.hashCode();
        }

        public String toString() {
            return "ViewToolContent(blockId=" + this.blockId + ")";
        }

        public ViewToolContent(ParsedContentBlockId parsedContentBlockId) {
            parsedContentBlockId.getClass();
            this.blockId = parsedContentBlockId;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$VoiceFeedback;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lcom/anthropic/claude/bell/VoiceSessionSummary;", "summary", "<init>", "(Lcom/anthropic/claude/bell/VoiceSessionSummary;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/bell/VoiceSessionSummary;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$VoiceFeedback;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/bell/VoiceSessionSummary;", "copy", "(Lcom/anthropic/claude/bell/VoiceSessionSummary;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$VoiceFeedback;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/bell/VoiceSessionSummary;", "getSummary", "Companion", "com/anthropic/claude/chat/bottomsheet/t0", "com/anthropic/claude/chat/bottomsheet/u0", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class VoiceFeedback implements ChatScreenModalBottomSheetDestination {
        private final VoiceSessionSummary summary;
        public static final u0 Companion = new u0();
        public static final int $stable = VoiceSessionSummary.$stable;

        public /* synthetic */ VoiceFeedback(int i, VoiceSessionSummary voiceSessionSummary, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.summary = voiceSessionSummary;
            } else {
                gvj.f(i, 1, t0.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ VoiceFeedback copy$default(VoiceFeedback voiceFeedback, VoiceSessionSummary voiceSessionSummary, int i, Object obj) {
            if ((i & 1) != 0) {
                voiceSessionSummary = voiceFeedback.summary;
            }
            return voiceFeedback.copy(voiceSessionSummary);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VoiceSessionSummary getSummary() {
            return this.summary;
        }

        public final VoiceFeedback copy(VoiceSessionSummary summary) {
            summary.getClass();
            return new VoiceFeedback(summary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VoiceFeedback) && x44.r(this.summary, ((VoiceFeedback) other).summary);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final VoiceSessionSummary getSummary() {
            return this.summary;
        }

        public int hashCode() {
            return this.summary.hashCode();
        }

        public String toString() {
            return "VoiceFeedback(summary=" + this.summary + ")";
        }

        public VoiceFeedback(VoiceSessionSummary voiceSessionSummary) {
            voiceSessionSummary.getClass();
            this.summary = voiceSessionSummary;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewLocalImage;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "", "uriString", "cacheKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewLocalImage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewLocalImage;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUriString", "getCacheKey", "Companion", "com/anthropic/claude/chat/bottomsheet/v", "com/anthropic/claude/chat/bottomsheet/w", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PreviewLocalImage implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final w Companion = new w();
        private final String cacheKey;
        private final String uriString;

        public /* synthetic */ PreviewLocalImage(int i, String str, String str2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, v.a.getDescriptor());
                throw null;
            }
            this.uriString = str;
            this.cacheKey = str2;
        }

        public static /* synthetic */ PreviewLocalImage copy$default(PreviewLocalImage previewLocalImage, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = previewLocalImage.uriString;
            }
            if ((i & 2) != 0) {
                str2 = previewLocalImage.cacheKey;
            }
            return previewLocalImage.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$chat(PreviewLocalImage self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.uriString);
            output.q(serialDesc, 1, self.cacheKey);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUriString() {
            return this.uriString;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCacheKey() {
            return this.cacheKey;
        }

        public final PreviewLocalImage copy(String uriString, String cacheKey) {
            uriString.getClass();
            cacheKey.getClass();
            return new PreviewLocalImage(uriString, cacheKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewLocalImage)) {
                return false;
            }
            PreviewLocalImage previewLocalImage = (PreviewLocalImage) other;
            return x44.r(this.uriString, previewLocalImage.uriString) && x44.r(this.cacheKey, previewLocalImage.cacheKey);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getCacheKey() {
            return this.cacheKey;
        }

        public final String getUriString() {
            return this.uriString;
        }

        public int hashCode() {
            return this.cacheKey.hashCode() + (this.uriString.hashCode() * 31);
        }

        public String toString() {
            return ij0.l("PreviewLocalImage(uriString=", this.uriString, ", cacheKey=", this.cacheKey, ")");
        }

        public PreviewLocalImage(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.uriString = str;
            this.cacheKey = str2;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$Share;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/ChatId;", "chatId", "", "messageCount", "<init>", "(Ljava/lang/String;ILmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ILvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$Share;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-RjYBDck", "()Ljava/lang/String;", "component1", "component2", "()I", "copy-JXrY7Xo", "(Ljava/lang/String;I)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$Share;", "copy", "", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChatId-RjYBDck", "I", "getMessageCount", "Companion", "com/anthropic/claude/chat/bottomsheet/b0", "com/anthropic/claude/chat/bottomsheet/c0", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Share implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final c0 Companion = new c0();
        private final String chatId;
        private final int messageCount;

        private /* synthetic */ Share(int i, String str, int i2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, b0.a.getDescriptor());
                throw null;
            }
            this.chatId = str;
            this.messageCount = i2;
        }

        /* JADX INFO: renamed from: copy-JXrY7Xo$default, reason: not valid java name */
        public static /* synthetic */ Share m612copyJXrY7Xo$default(Share share, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = share.chatId;
            }
            if ((i2 & 2) != 0) {
                i = share.messageCount;
            }
            return share.m614copyJXrY7Xo(str, i);
        }

        public static final /* synthetic */ void write$Self$chat(Share self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, vs2.a, ChatId.m978boximpl(self.chatId));
            output.l(1, self.messageCount, serialDesc);
        }

        /* JADX INFO: renamed from: component1-RjYBDck, reason: not valid java name and from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMessageCount() {
            return this.messageCount;
        }

        /* JADX INFO: renamed from: copy-JXrY7Xo, reason: not valid java name */
        public final Share m614copyJXrY7Xo(String chatId, int messageCount) {
            chatId.getClass();
            return new Share(chatId, messageCount, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Share)) {
                return false;
            }
            Share share = (Share) other;
            return ChatId.m981equalsimpl0(this.chatId, share.chatId) && this.messageCount == share.messageCount;
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getChatId-RjYBDck, reason: not valid java name */
        public final String m615getChatIdRjYBDck() {
            return this.chatId;
        }

        public final int getMessageCount() {
            return this.messageCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageCount) + (ChatId.m982hashCodeimpl(this.chatId) * 31);
        }

        public String toString() {
            return sq6.u("Share(chatId=", ChatId.m983toStringimpl(this.chatId), this.messageCount, ", messageCount=", ")");
        }

        public /* synthetic */ Share(String str, int i, mq5 mq5Var) {
            this(str, i);
        }

        public /* synthetic */ Share(int i, String str, int i2, vnf vnfVar, mq5 mq5Var) {
            this(i, str, i2, vnfVar);
        }

        private Share(String str, int i) {
            str.getClass();
            this.chatId = str;
            this.messageCount = i;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewCode;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "", "code", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewCode;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewCode;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getLanguage", "Companion", "com/anthropic/claude/chat/bottomsheet/h0", "com/anthropic/claude/chat/bottomsheet/i0", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewCode implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final i0 Companion = new i0();
        private final String code;
        private final String language;

        public /* synthetic */ ViewCode(int i, String str, String str2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, h0.a.getDescriptor());
                throw null;
            }
            this.code = str;
            this.language = str2;
        }

        public static /* synthetic */ ViewCode copy$default(ViewCode viewCode, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewCode.code;
            }
            if ((i & 2) != 0) {
                str2 = viewCode.language;
            }
            return viewCode.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$chat(ViewCode self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.code);
            output.B(serialDesc, 1, srg.a, self.language);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        public final ViewCode copy(String code, String language) {
            code.getClass();
            return new ViewCode(code, language);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewCode)) {
                return false;
            }
            ViewCode viewCode = (ViewCode) other;
            return x44.r(this.code, viewCode.code) && x44.r(this.language, viewCode.language);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getCode() {
            return this.code;
        }

        public final String getLanguage() {
            return this.language;
        }

        public int hashCode() {
            int iHashCode = this.code.hashCode() * 31;
            String str = this.language;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return ij0.l("ViewCode(code=", this.code, ", language=", this.language, ")");
        }

        public ViewCode(String str, String str2) {
            str.getClass();
            this.code = str;
            this.language = str2;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J0\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewCombinedSources;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "", "Lcom/anthropic/claude/tool/model/KnowledgeSource;", "citations", "otherSources", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewCombinedSources;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewCombinedSources;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCitations", "getOtherSources", "Companion", "com/anthropic/claude/chat/bottomsheet/l0", "com/anthropic/claude/chat/bottomsheet/m0", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewCombinedSources implements ChatScreenModalBottomSheetDestination {
        private static final kw9[] $childSerializers;
        public static final int $stable = 0;
        public static final m0 Companion = new m0();
        private final List<KnowledgeSource> citations;
        private final List<KnowledgeSource> otherSources;

        static {
            wy2 wy2Var = new wy2(8);
            w1a w1aVar = w1a.F;
            $childSerializers = new kw9[]{yb5.w(w1aVar, wy2Var), yb5.w(w1aVar, new wy2(9))};
        }

        public /* synthetic */ ViewCombinedSources(int i, List list, List list2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, l0.a.getDescriptor());
                throw null;
            }
            this.citations = list;
            this.otherSources = list2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new uo0(vq9.a, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new uo0(vq9.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewCombinedSources copy$default(ViewCombinedSources viewCombinedSources, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = viewCombinedSources.citations;
            }
            if ((i & 2) != 0) {
                list2 = viewCombinedSources.otherSources;
            }
            return viewCombinedSources.copy(list, list2);
        }

        public static final /* synthetic */ void write$Self$chat(ViewCombinedSources self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.citations);
            output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.otherSources);
        }

        public final List<KnowledgeSource> component1() {
            return this.citations;
        }

        public final List<KnowledgeSource> component2() {
            return this.otherSources;
        }

        public final ViewCombinedSources copy(List<KnowledgeSource> citations, List<KnowledgeSource> otherSources) {
            citations.getClass();
            otherSources.getClass();
            return new ViewCombinedSources(citations, otherSources);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewCombinedSources)) {
                return false;
            }
            ViewCombinedSources viewCombinedSources = (ViewCombinedSources) other;
            return x44.r(this.citations, viewCombinedSources.citations) && x44.r(this.otherSources, viewCombinedSources.otherSources);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final List<KnowledgeSource> getCitations() {
            return this.citations;
        }

        public final List<KnowledgeSource> getOtherSources() {
            return this.otherSources;
        }

        public int hashCode() {
            return this.otherSources.hashCode() + (this.citations.hashCode() * 31);
        }

        public String toString() {
            return "ViewCombinedSources(citations=" + this.citations + ", otherSources=" + this.otherSources + ")";
        }

        public ViewCombinedSources(List<KnowledgeSource> list, List<KnowledgeSource> list2) {
            list.getClass();
            list2.getClass();
            this.citations = list;
            this.otherSources = list2;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewSources;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "", "title", "", "Lcom/anthropic/claude/tool/model/KnowledgeSource;", "sources", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewSources;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ViewSources;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getSources", "Companion", "com/anthropic/claude/chat/bottomsheet/p0", "com/anthropic/claude/chat/bottomsheet/q0", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewSources implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 8;
        private final List<KnowledgeSource> sources;
        private final String title;
        public static final q0 Companion = new q0();
        private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new wy2(10))};

        public /* synthetic */ ViewSources(int i, String str, List list, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, p0.a.getDescriptor());
                throw null;
            }
            this.title = str;
            this.sources = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new uo0(vq9.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewSources copy$default(ViewSources viewSources, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewSources.title;
            }
            if ((i & 2) != 0) {
                list = viewSources.sources;
            }
            return viewSources.copy(str, list);
        }

        public static final /* synthetic */ void write$Self$chat(ViewSources self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.q(serialDesc, 0, self.title);
            output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.sources);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<KnowledgeSource> component2() {
            return this.sources;
        }

        public final ViewSources copy(String title, List<KnowledgeSource> sources) {
            title.getClass();
            sources.getClass();
            return new ViewSources(title, sources);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewSources)) {
                return false;
            }
            ViewSources viewSources = (ViewSources) other;
            return x44.r(this.title, viewSources.title) && x44.r(this.sources, viewSources.sources);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final List<KnowledgeSource> getSources() {
            return this.sources;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.sources.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            return y6a.o("ViewSources(title=", this.title, ", sources=", this.sources, ")");
        }

        public ViewSources(String str, List<KnowledgeSource> list) {
            str.getClass();
            list.getClass();
            this.title = str;
            this.sources = list;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewLink;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lcom/anthropic/claude/tool/model/KnowledgeSource;", "source", "", "url", "<init>", "(Lcom/anthropic/claude/tool/model/KnowledgeSource;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/model/KnowledgeSource;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewLink;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/model/KnowledgeSource;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/tool/model/KnowledgeSource;Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewLink;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/model/KnowledgeSource;", "getSource", "Ljava/lang/String;", "getUrl", "Companion", "com/anthropic/claude/chat/bottomsheet/t", "com/anthropic/claude/chat/bottomsheet/u", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PreviewLink implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final u Companion = new u();
        private final KnowledgeSource source;
        private final String url;

        public /* synthetic */ PreviewLink(int i, KnowledgeSource knowledgeSource, String str, vnf vnfVar) {
            if (1 != (i & 1)) {
                gvj.f(i, 1, t.a.getDescriptor());
                throw null;
            }
            this.source = knowledgeSource;
            if ((i & 2) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
        }

        public static /* synthetic */ PreviewLink copy$default(PreviewLink previewLink, KnowledgeSource knowledgeSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                knowledgeSource = previewLink.source;
            }
            if ((i & 2) != 0) {
                str = previewLink.url;
            }
            return previewLink.copy(knowledgeSource, str);
        }

        public static final /* synthetic */ void write$Self$chat(PreviewLink self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, vq9.a, self.source);
            if (!output.E(serialDesc) && self.url == null) {
                return;
            }
            output.B(serialDesc, 1, srg.a, self.url);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final KnowledgeSource getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final PreviewLink copy(KnowledgeSource source, String url) {
            source.getClass();
            return new PreviewLink(source, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewLink)) {
                return false;
            }
            PreviewLink previewLink = (PreviewLink) other;
            return x44.r(this.source, previewLink.source) && x44.r(this.url, previewLink.url);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final KnowledgeSource getSource() {
            return this.source;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.source.hashCode() * 31;
            String str = this.url;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PreviewLink(source=" + this.source + ", url=" + this.url + ")";
        }

        public PreviewLink(KnowledgeSource knowledgeSource, String str) {
            knowledgeSource.getClass();
            this.source = knowledgeSource;
            this.url = str;
        }

        public /* synthetic */ PreviewLink(KnowledgeSource knowledgeSource, String str, int i, mq5 mq5Var) {
            this(knowledgeSource, (i & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJR\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b1\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b2\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b3\u0010\u001b¨\u00067"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$SshHelplines;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/MessageId;", "messageId", "", "helplineId", "helplineName", "phoneNumber", "smsNumber", "webChatUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$SshHelplines;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-PStrttk", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy-eOBev2k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$SshHelplines;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageId-PStrttk", "getHelplineId", "getHelplineName", "getPhoneNumber", "getSmsNumber", "getWebChatUrl", "Companion", "com/anthropic/claude/chat/bottomsheet/d0", "com/anthropic/claude/chat/bottomsheet/e0", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SshHelplines implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final e0 Companion = new e0();
        private final String helplineId;
        private final String helplineName;
        private final String messageId;
        private final String phoneNumber;
        private final String smsNumber;
        private final String webChatUrl;

        private /* synthetic */ SshHelplines(int i, String str, String str2, String str3, String str4, String str5, String str6, vnf vnfVar) {
            if (63 != (i & 63)) {
                gvj.f(i, 63, d0.a.getDescriptor());
                throw null;
            }
            this.messageId = str;
            this.helplineId = str2;
            this.helplineName = str3;
            this.phoneNumber = str4;
            this.smsNumber = str5;
            this.webChatUrl = str6;
        }

        /* JADX INFO: renamed from: copy-eOBev2k$default, reason: not valid java name */
        public static /* synthetic */ SshHelplines m616copyeOBev2k$default(SshHelplines sshHelplines, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sshHelplines.messageId;
            }
            if ((i & 2) != 0) {
                str2 = sshHelplines.helplineId;
            }
            if ((i & 4) != 0) {
                str3 = sshHelplines.helplineName;
            }
            if ((i & 8) != 0) {
                str4 = sshHelplines.phoneNumber;
            }
            if ((i & 16) != 0) {
                str5 = sshHelplines.smsNumber;
            }
            if ((i & 32) != 0) {
                str6 = sshHelplines.webChatUrl;
            }
            String str7 = str5;
            String str8 = str6;
            return sshHelplines.m618copyeOBev2k(str, str2, str3, str4, str7, str8);
        }

        public static final /* synthetic */ void write$Self$chat(SshHelplines self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, ehb.a, MessageId.m1051boximpl(self.messageId));
            output.q(serialDesc, 1, self.helplineId);
            output.q(serialDesc, 2, self.helplineName);
            srg srgVar = srg.a;
            output.B(serialDesc, 3, srgVar, self.phoneNumber);
            output.B(serialDesc, 4, srgVar, self.smsNumber);
            output.B(serialDesc, 5, srgVar, self.webChatUrl);
        }

        /* JADX INFO: renamed from: component1-PStrttk, reason: not valid java name and from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getHelplineId() {
            return this.helplineId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getHelplineName() {
            return this.helplineName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSmsNumber() {
            return this.smsNumber;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getWebChatUrl() {
            return this.webChatUrl;
        }

        /* JADX INFO: renamed from: copy-eOBev2k, reason: not valid java name */
        public final SshHelplines m618copyeOBev2k(String messageId, String helplineId, String helplineName, String phoneNumber, String smsNumber, String webChatUrl) {
            messageId.getClass();
            helplineId.getClass();
            helplineName.getClass();
            return new SshHelplines(messageId, helplineId, helplineName, phoneNumber, smsNumber, webChatUrl, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SshHelplines)) {
                return false;
            }
            SshHelplines sshHelplines = (SshHelplines) other;
            return MessageId.m1054equalsimpl0(this.messageId, sshHelplines.messageId) && x44.r(this.helplineId, sshHelplines.helplineId) && x44.r(this.helplineName, sshHelplines.helplineName) && x44.r(this.phoneNumber, sshHelplines.phoneNumber) && x44.r(this.smsNumber, sshHelplines.smsNumber) && x44.r(this.webChatUrl, sshHelplines.webChatUrl);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getHelplineId() {
            return this.helplineId;
        }

        public final String getHelplineName() {
            return this.helplineName;
        }

        /* JADX INFO: renamed from: getMessageId-PStrttk, reason: not valid java name */
        public final String m619getMessageIdPStrttk() {
            return this.messageId;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final String getSmsNumber() {
            return this.smsNumber;
        }

        public final String getWebChatUrl() {
            return this.webChatUrl;
        }

        public int hashCode() {
            int iL = kgh.l(kgh.l(MessageId.m1055hashCodeimpl(this.messageId) * 31, 31, this.helplineId), 31, this.helplineName);
            String str = this.phoneNumber;
            int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.smsNumber;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.webChatUrl;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String strM1056toStringimpl = MessageId.m1056toStringimpl(this.messageId);
            String str = this.helplineId;
            String str2 = this.helplineName;
            String str3 = this.phoneNumber;
            String str4 = this.smsNumber;
            String str5 = this.webChatUrl;
            StringBuilder sbR = kgh.r("SshHelplines(messageId=", strM1056toStringimpl, ", helplineId=", str, ", helplineName=");
            kgh.u(sbR, str2, ", phoneNumber=", str3, ", smsNumber=");
            return vb7.t(sbR, str4, ", webChatUrl=", str5, ")");
        }

        private SshHelplines(String str, String str2, String str3, String str4, String str5, String str6) {
            grc.B(str, str2, str3);
            this.messageId = str;
            this.helplineId = str2;
            this.helplineName = str3;
            this.phoneNumber = str4;
            this.smsNumber = str5;
            this.webChatUrl = str6;
        }

        public /* synthetic */ SshHelplines(String str, String str2, String str3, String str4, String str5, String str6, mq5 mq5Var) {
            this(str, str2, str3, str4, str5, str6);
        }

        public /* synthetic */ SshHelplines(int i, String str, String str2, String str3, String str4, String str5, String str6, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, str3, str4, str5, str6, vnfVar);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010\u001aJ\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b\t\u0010!¨\u00066"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$Feedback;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lcom/anthropic/claude/types/strings/MessageId;", "messageId", "", "messageIndex", "Lcom/anthropic/claude/api/chat/ChatFeedbackType;", "feedbackType", "", "isFeedbackTypeChangeable", "<init>", "(Ljava/lang/String;ILcom/anthropic/claude/api/chat/ChatFeedbackType;ZLmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ILcom/anthropic/claude/api/chat/ChatFeedbackType;ZLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$Feedback;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-PStrttk", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "()Lcom/anthropic/claude/api/chat/ChatFeedbackType;", "component4", "()Z", "copy-wa1fhRE", "(Ljava/lang/String;ILcom/anthropic/claude/api/chat/ChatFeedbackType;Z)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$Feedback;", "copy", "", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageId-PStrttk", "I", "getMessageIndex", "Lcom/anthropic/claude/api/chat/ChatFeedbackType;", "getFeedbackType", "Z", "Companion", "com/anthropic/claude/chat/bottomsheet/h", "com/anthropic/claude/chat/bottomsheet/i", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Feedback implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final i Companion = new i();
        private final ChatFeedbackType feedbackType;
        private final boolean isFeedbackTypeChangeable;
        private final String messageId;
        private final int messageIndex;

        private /* synthetic */ Feedback(int i, String str, int i2, ChatFeedbackType chatFeedbackType, boolean z, vnf vnfVar) {
            if (7 != (i & 7)) {
                gvj.f(i, 7, h.a.getDescriptor());
                throw null;
            }
            this.messageId = str;
            this.messageIndex = i2;
            this.feedbackType = chatFeedbackType;
            if ((i & 8) == 0) {
                this.isFeedbackTypeChangeable = true;
            } else {
                this.isFeedbackTypeChangeable = z;
            }
        }

        /* JADX INFO: renamed from: copy-wa1fhRE$default, reason: not valid java name */
        public static /* synthetic */ Feedback m598copywa1fhRE$default(Feedback feedback, String str, int i, ChatFeedbackType chatFeedbackType, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = feedback.messageId;
            }
            if ((i2 & 2) != 0) {
                i = feedback.messageIndex;
            }
            if ((i2 & 4) != 0) {
                chatFeedbackType = feedback.feedbackType;
            }
            if ((i2 & 8) != 0) {
                z = feedback.isFeedbackTypeChangeable;
            }
            return feedback.m600copywa1fhRE(str, i, chatFeedbackType, z);
        }

        public static final /* synthetic */ void write$Self$chat(Feedback self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, ehb.a, MessageId.m1051boximpl(self.messageId));
            output.l(1, self.messageIndex, serialDesc);
            output.B(serialDesc, 2, ps2.d, self.feedbackType);
            if (!output.E(serialDesc) && self.isFeedbackTypeChangeable) {
                return;
            }
            output.p(serialDesc, 3, self.isFeedbackTypeChangeable);
        }

        /* JADX INFO: renamed from: component1-PStrttk, reason: not valid java name and from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMessageIndex() {
            return this.messageIndex;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ChatFeedbackType getFeedbackType() {
            return this.feedbackType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsFeedbackTypeChangeable() {
            return this.isFeedbackTypeChangeable;
        }

        /* JADX INFO: renamed from: copy-wa1fhRE, reason: not valid java name */
        public final Feedback m600copywa1fhRE(String messageId, int messageIndex, ChatFeedbackType feedbackType, boolean isFeedbackTypeChangeable) {
            messageId.getClass();
            return new Feedback(messageId, messageIndex, feedbackType, isFeedbackTypeChangeable, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Feedback)) {
                return false;
            }
            Feedback feedback = (Feedback) other;
            return MessageId.m1054equalsimpl0(this.messageId, feedback.messageId) && this.messageIndex == feedback.messageIndex && this.feedbackType == feedback.feedbackType && this.isFeedbackTypeChangeable == feedback.isFeedbackTypeChangeable;
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final ChatFeedbackType getFeedbackType() {
            return this.feedbackType;
        }

        /* JADX INFO: renamed from: getMessageId-PStrttk, reason: not valid java name */
        public final String m601getMessageIdPStrttk() {
            return this.messageId;
        }

        public final int getMessageIndex() {
            return this.messageIndex;
        }

        public int hashCode() {
            int iC = vb7.c(this.messageIndex, MessageId.m1055hashCodeimpl(this.messageId) * 31, 31);
            ChatFeedbackType chatFeedbackType = this.feedbackType;
            return Boolean.hashCode(this.isFeedbackTypeChangeable) + ((iC + (chatFeedbackType == null ? 0 : chatFeedbackType.hashCode())) * 31);
        }

        public final boolean isFeedbackTypeChangeable() {
            return this.isFeedbackTypeChangeable;
        }

        public String toString() {
            String strM1056toStringimpl = MessageId.m1056toStringimpl(this.messageId);
            int i = this.messageIndex;
            ChatFeedbackType chatFeedbackType = this.feedbackType;
            boolean z = this.isFeedbackTypeChangeable;
            StringBuilder sbP = ij0.p("Feedback(messageId=", strM1056toStringimpl, i, ", messageIndex=", ", feedbackType=");
            sbP.append(chatFeedbackType);
            sbP.append(", isFeedbackTypeChangeable=");
            sbP.append(z);
            sbP.append(")");
            return sbP.toString();
        }

        public /* synthetic */ Feedback(String str, int i, ChatFeedbackType chatFeedbackType, boolean z, mq5 mq5Var) {
            this(str, i, chatFeedbackType, z);
        }

        public /* synthetic */ Feedback(int i, String str, int i2, ChatFeedbackType chatFeedbackType, boolean z, vnf vnfVar, mq5 mq5Var) {
            this(i, str, i2, chatFeedbackType, z, vnfVar);
        }

        private Feedback(String str, int i, ChatFeedbackType chatFeedbackType, boolean z) {
            str.getClass();
            this.messageId = str;
            this.messageIndex = i;
            this.feedbackType = chatFeedbackType;
            this.isFeedbackTypeChangeable = z;
        }

        public /* synthetic */ Feedback(String str, int i, ChatFeedbackType chatFeedbackType, boolean z, int i2, mq5 mq5Var) {
            this(str, i, chatFeedbackType, (i2 & 8) != 0 ? true : z, null);
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JP\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b7\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b8\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010'¨\u0006>"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$LocalToolApproval;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "", "toolName", "toolInput", "Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;", "toolPreviewInfo", "Lcom/anthropic/claude/types/strings/ToolUseId;", "toolUseId", "Lcom/anthropic/claude/types/strings/MessageId;", "messageId", "", "fromVoice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;Ljava/lang/String;Ljava/lang/String;ZLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;Ljava/lang/String;Ljava/lang/String;ZLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$LocalToolApproval;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;", "component4-ERU6ZeY", "component4", "component5-saiyK68", "component5", "component6", "()Z", "copy-iiDLEYY", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$LocalToolApproval;", "copy", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolName", "getToolInput", "Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;", "getToolPreviewInfo", "getToolUseId-ERU6ZeY", "getMessageId-saiyK68", "Z", "getFromVoice", "Companion", "com/anthropic/claude/chat/bottomsheet/j", "com/anthropic/claude/chat/bottomsheet/k", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class LocalToolApproval implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final k Companion = new k();
        private final boolean fromVoice;
        private final String messageId;
        private final String toolInput;
        private final String toolName;
        private final MobileAppToolPreviewInfo toolPreviewInfo;
        private final String toolUseId;

        private /* synthetic */ LocalToolApproval(int i, String str, String str2, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, String str3, String str4, boolean z, vnf vnfVar) {
            if (31 != (i & 31)) {
                gvj.f(i, 31, j.a.getDescriptor());
                throw null;
            }
            this.toolName = str;
            this.toolInput = str2;
            this.toolPreviewInfo = mobileAppToolPreviewInfo;
            this.toolUseId = str3;
            this.messageId = str4;
            if ((i & 32) == 0) {
                this.fromVoice = false;
            } else {
                this.fromVoice = z;
            }
        }

        /* JADX INFO: renamed from: copy-iiDLEYY$default, reason: not valid java name */
        public static /* synthetic */ LocalToolApproval m602copyiiDLEYY$default(LocalToolApproval localToolApproval, String str, String str2, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, String str3, String str4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = localToolApproval.toolName;
            }
            if ((i & 2) != 0) {
                str2 = localToolApproval.toolInput;
            }
            if ((i & 4) != 0) {
                mobileAppToolPreviewInfo = localToolApproval.toolPreviewInfo;
            }
            if ((i & 8) != 0) {
                str3 = localToolApproval.toolUseId;
            }
            if ((i & 16) != 0) {
                str4 = localToolApproval.messageId;
            }
            if ((i & 32) != 0) {
                z = localToolApproval.fromVoice;
            }
            String str5 = str4;
            boolean z2 = z;
            return localToolApproval.m605copyiiDLEYY(str, str2, mobileAppToolPreviewInfo, str3, str5, z2);
        }

        public static final /* synthetic */ void write$Self$chat(LocalToolApproval self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.toolName);
            output.B(serialDesc, 1, srg.a, self.toolInput);
            output.r(serialDesc, 2, elb.a, self.toolPreviewInfo);
            output.r(serialDesc, 3, c1i.a, ToolUseId.m1157boximpl(self.toolUseId));
            ehb ehbVar = ehb.a;
            String str = self.messageId;
            output.B(serialDesc, 4, ehbVar, str != null ? MessageId.m1051boximpl(str) : null);
            if (output.E(serialDesc) || self.fromVoice) {
                output.p(serialDesc, 5, self.fromVoice);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getToolName() {
            return this.toolName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getToolInput() {
            return this.toolInput;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MobileAppToolPreviewInfo getToolPreviewInfo() {
            return this.toolPreviewInfo;
        }

        /* JADX INFO: renamed from: component4-ERU6ZeY, reason: not valid java name and from getter */
        public final String getToolUseId() {
            return this.toolUseId;
        }

        /* JADX INFO: renamed from: component5-saiyK68, reason: not valid java name and from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getFromVoice() {
            return this.fromVoice;
        }

        /* JADX INFO: renamed from: copy-iiDLEYY, reason: not valid java name */
        public final LocalToolApproval m605copyiiDLEYY(String toolName, String toolInput, MobileAppToolPreviewInfo toolPreviewInfo, String toolUseId, String messageId, boolean fromVoice) {
            toolName.getClass();
            toolPreviewInfo.getClass();
            toolUseId.getClass();
            return new LocalToolApproval(toolName, toolInput, toolPreviewInfo, toolUseId, messageId, fromVoice, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
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
                boolean r1 = r5 instanceof com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.LocalToolApproval
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination$LocalToolApproval r5 = (com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.LocalToolApproval) r5
                java.lang.String r1 = r4.toolName
                java.lang.String r3 = r5.toolName
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.toolInput
                java.lang.String r3 = r5.toolInput
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                com.anthropic.claude.tool.model.MobileAppToolPreviewInfo r1 = r4.toolPreviewInfo
                com.anthropic.claude.tool.model.MobileAppToolPreviewInfo r3 = r5.toolPreviewInfo
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.lang.String r1 = r4.toolUseId
                java.lang.String r3 = r5.toolUseId
                boolean r1 = com.anthropic.claude.types.strings.ToolUseId.m1160equalsimpl0(r1, r3)
                if (r1 != 0) goto L38
                return r2
            L38:
                java.lang.String r1 = r4.messageId
                java.lang.String r3 = r5.messageId
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
                boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r1, r3)
            L4b:
                if (r1 != 0) goto L4e
                return r2
            L4e:
                boolean r4 = r4.fromVoice
                boolean r5 = r5.fromVoice
                if (r4 == r5) goto L55
                return r2
            L55:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.LocalToolApproval.equals(java.lang.Object):boolean");
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final boolean getFromVoice() {
            return this.fromVoice;
        }

        /* JADX INFO: renamed from: getMessageId-saiyK68, reason: not valid java name */
        public final String m606getMessageIdsaiyK68() {
            return this.messageId;
        }

        public final String getToolInput() {
            return this.toolInput;
        }

        public final String getToolName() {
            return this.toolName;
        }

        public final MobileAppToolPreviewInfo getToolPreviewInfo() {
            return this.toolPreviewInfo;
        }

        /* JADX INFO: renamed from: getToolUseId-ERU6ZeY, reason: not valid java name */
        public final String m607getToolUseIdERU6ZeY() {
            return this.toolUseId;
        }

        public int hashCode() {
            int iHashCode = this.toolName.hashCode() * 31;
            String str = this.toolInput;
            int iM1161hashCodeimpl = (ToolUseId.m1161hashCodeimpl(this.toolUseId) + ((this.toolPreviewInfo.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
            String str2 = this.messageId;
            return Boolean.hashCode(this.fromVoice) + ((iM1161hashCodeimpl + (str2 != null ? MessageId.m1055hashCodeimpl(str2) : 0)) * 31);
        }

        public String toString() {
            String str = this.toolName;
            String str2 = this.toolInput;
            MobileAppToolPreviewInfo mobileAppToolPreviewInfo = this.toolPreviewInfo;
            String strM1162toStringimpl = ToolUseId.m1162toStringimpl(this.toolUseId);
            String str3 = this.messageId;
            String strM1056toStringimpl = str3 == null ? "null" : MessageId.m1056toStringimpl(str3);
            boolean z = this.fromVoice;
            StringBuilder sbR = kgh.r("LocalToolApproval(toolName=", str, ", toolInput=", str2, ", toolPreviewInfo=");
            sbR.append(mobileAppToolPreviewInfo);
            sbR.append(", toolUseId=");
            sbR.append(strM1162toStringimpl);
            sbR.append(", messageId=");
            sbR.append(strM1056toStringimpl);
            sbR.append(", fromVoice=");
            sbR.append(z);
            sbR.append(")");
            return sbR.toString();
        }

        public /* synthetic */ LocalToolApproval(String str, String str2, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, String str3, String str4, boolean z, mq5 mq5Var) {
            this(str, str2, mobileAppToolPreviewInfo, str3, str4, z);
        }

        public /* synthetic */ LocalToolApproval(int i, String str, String str2, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, String str3, String str4, boolean z, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, mobileAppToolPreviewInfo, str3, str4, z, vnfVar);
        }

        private LocalToolApproval(String str, String str2, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, String str3, String str4, boolean z) {
            str.getClass();
            mobileAppToolPreviewInfo.getClass();
            str3.getClass();
            this.toolName = str;
            this.toolInput = str2;
            this.toolPreviewInfo = mobileAppToolPreviewInfo;
            this.toolUseId = str3;
            this.messageId = str4;
            this.fromVoice = z;
        }

        public /* synthetic */ LocalToolApproval(String str, String str2, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, String str3, String str4, boolean z, int i, mq5 mq5Var) {
            this(str, str2, mobileAppToolPreviewInfo, str3, str4, (i & 32) != 0 ? false : z, null);
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BCBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bi\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"Jj\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b=\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b>\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010\"¨\u0006D"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ToolApproval;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "", "toolName", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "displayContent", "integrationIconUrl", "integrationName", "iconName", "Lcom/anthropic/claude/types/strings/ToolUseId;", "toolUseId", "Lcom/anthropic/claude/types/strings/McpToolApprovalKey;", "approvalKey", "", "hasAllowAlways", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLvnf;Lmq5;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "component3", "component4", "component5", "component6-ERU6ZeY", "component6", "component7-05SLPRs", "component7", "component8", "()Z", "copy-dYfYcMU", "(Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ToolApproval;", "copy", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$ToolApproval;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getToolName", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "getDisplayContent", "getIntegrationIconUrl", "getIntegrationName", "getIconName", "getToolUseId-ERU6ZeY", "getApprovalKey-05SLPRs", "Z", "getHasAllowAlways", "Companion", "com/anthropic/claude/chat/bottomsheet/f0", "com/anthropic/claude/chat/bottomsheet/g0", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ToolApproval implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        private final String approvalKey;
        private final ToolDisplayContent displayContent;
        private final boolean hasAllowAlways;
        private final String iconName;
        private final String integrationIconUrl;
        private final String integrationName;
        private final String toolName;
        private final String toolUseId;
        public static final g0 Companion = new g0();
        private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new wy2(6)), null, null, null, null, null, null};

        private /* synthetic */ ToolApproval(int i, String str, ToolDisplayContent toolDisplayContent, String str2, String str3, String str4, String str5, String str6, boolean z, vnf vnfVar) {
            if (239 != (i & 239)) {
                gvj.f(i, 239, f0.a.getDescriptor());
                throw null;
            }
            this.toolName = str;
            this.displayContent = toolDisplayContent;
            this.integrationIconUrl = str2;
            this.integrationName = str3;
            if ((i & 16) == 0) {
                this.iconName = null;
            } else {
                this.iconName = str4;
            }
            this.toolUseId = str5;
            this.approvalKey = str6;
            this.hasAllowAlways = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return ToolDisplayContent.Companion.serializer();
        }

        /* JADX INFO: renamed from: copy-dYfYcMU$default, reason: not valid java name */
        public static /* synthetic */ ToolApproval m620copydYfYcMU$default(ToolApproval toolApproval, String str, ToolDisplayContent toolDisplayContent, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolApproval.toolName;
            }
            if ((i & 2) != 0) {
                toolDisplayContent = toolApproval.displayContent;
            }
            if ((i & 4) != 0) {
                str2 = toolApproval.integrationIconUrl;
            }
            if ((i & 8) != 0) {
                str3 = toolApproval.integrationName;
            }
            if ((i & 16) != 0) {
                str4 = toolApproval.iconName;
            }
            if ((i & 32) != 0) {
                str5 = toolApproval.toolUseId;
            }
            if ((i & 64) != 0) {
                str6 = toolApproval.approvalKey;
            }
            if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
                z = toolApproval.hasAllowAlways;
            }
            String str7 = str6;
            boolean z2 = z;
            String str8 = str4;
            String str9 = str5;
            return toolApproval.m623copydYfYcMU(str, toolDisplayContent, str2, str3, str8, str9, str7, z2);
        }

        public static final /* synthetic */ void write$Self$chat(ToolApproval self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.q(serialDesc, 0, self.toolName);
            output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.displayContent);
            srg srgVar = srg.a;
            output.B(serialDesc, 2, srgVar, self.integrationIconUrl);
            output.B(serialDesc, 3, srgVar, self.integrationName);
            if (output.E(serialDesc) || self.iconName != null) {
                output.B(serialDesc, 4, srgVar, self.iconName);
            }
            output.r(serialDesc, 5, c1i.a, ToolUseId.m1157boximpl(self.toolUseId));
            h4b h4bVar = h4b.a;
            String str = self.approvalKey;
            output.B(serialDesc, 6, h4bVar, str != null ? McpToolApprovalKey.m1036boximpl(str) : null);
            output.p(serialDesc, 7, self.hasAllowAlways);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getToolName() {
            return this.toolName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ToolDisplayContent getDisplayContent() {
            return this.displayContent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getIntegrationIconUrl() {
            return this.integrationIconUrl;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getIntegrationName() {
            return this.integrationName;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getIconName() {
            return this.iconName;
        }

        /* JADX INFO: renamed from: component6-ERU6ZeY, reason: not valid java name and from getter */
        public final String getToolUseId() {
            return this.toolUseId;
        }

        /* JADX INFO: renamed from: component7-05SLPRs, reason: not valid java name and from getter */
        public final String getApprovalKey() {
            return this.approvalKey;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getHasAllowAlways() {
            return this.hasAllowAlways;
        }

        /* JADX INFO: renamed from: copy-dYfYcMU, reason: not valid java name */
        public final ToolApproval m623copydYfYcMU(String toolName, ToolDisplayContent displayContent, String integrationIconUrl, String integrationName, String iconName, String toolUseId, String approvalKey, boolean hasAllowAlways) {
            toolName.getClass();
            toolUseId.getClass();
            return new ToolApproval(toolName, displayContent, integrationIconUrl, integrationName, iconName, toolUseId, approvalKey, hasAllowAlways, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
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
                boolean r1 = r5 instanceof com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.ToolApproval
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination$ToolApproval r5 = (com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.ToolApproval) r5
                java.lang.String r1 = r4.toolName
                java.lang.String r3 = r5.toolName
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                com.anthropic.claude.api.chat.tool.ToolDisplayContent r1 = r4.displayContent
                com.anthropic.claude.api.chat.tool.ToolDisplayContent r3 = r5.displayContent
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r4.integrationIconUrl
                java.lang.String r3 = r5.integrationIconUrl
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.lang.String r1 = r4.integrationName
                java.lang.String r3 = r5.integrationName
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L38
                return r2
            L38:
                java.lang.String r1 = r4.iconName
                java.lang.String r3 = r5.iconName
                boolean r1 = defpackage.x44.r(r1, r3)
                if (r1 != 0) goto L43
                return r2
            L43:
                java.lang.String r1 = r4.toolUseId
                java.lang.String r3 = r5.toolUseId
                boolean r1 = com.anthropic.claude.types.strings.ToolUseId.m1160equalsimpl0(r1, r3)
                if (r1 != 0) goto L4e
                return r2
            L4e:
                java.lang.String r1 = r4.approvalKey
                java.lang.String r3 = r5.approvalKey
                if (r1 != 0) goto L5a
                if (r3 != 0) goto L58
                r1 = r0
                goto L61
            L58:
                r1 = r2
                goto L61
            L5a:
                if (r3 != 0) goto L5d
                goto L58
            L5d:
                boolean r1 = com.anthropic.claude.types.strings.McpToolApprovalKey.m1039equalsimpl0(r1, r3)
            L61:
                if (r1 != 0) goto L64
                return r2
            L64:
                boolean r4 = r4.hasAllowAlways
                boolean r5 = r5.hasAllowAlways
                if (r4 == r5) goto L6b
                return r2
            L6b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.ToolApproval.equals(java.lang.Object):boolean");
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getApprovalKey-05SLPRs, reason: not valid java name */
        public final String m624getApprovalKey05SLPRs() {
            return this.approvalKey;
        }

        public final ToolDisplayContent getDisplayContent() {
            return this.displayContent;
        }

        public final boolean getHasAllowAlways() {
            return this.hasAllowAlways;
        }

        public final String getIconName() {
            return this.iconName;
        }

        public final String getIntegrationIconUrl() {
            return this.integrationIconUrl;
        }

        public final String getIntegrationName() {
            return this.integrationName;
        }

        public final String getToolName() {
            return this.toolName;
        }

        /* JADX INFO: renamed from: getToolUseId-ERU6ZeY, reason: not valid java name */
        public final String m625getToolUseIdERU6ZeY() {
            return this.toolUseId;
        }

        public int hashCode() {
            int iHashCode = this.toolName.hashCode() * 31;
            ToolDisplayContent toolDisplayContent = this.displayContent;
            int iHashCode2 = (iHashCode + (toolDisplayContent == null ? 0 : toolDisplayContent.hashCode())) * 31;
            String str = this.integrationIconUrl;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.integrationName;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.iconName;
            int iM1161hashCodeimpl = (ToolUseId.m1161hashCodeimpl(this.toolUseId) + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
            String str4 = this.approvalKey;
            return Boolean.hashCode(this.hasAllowAlways) + ((iM1161hashCodeimpl + (str4 != null ? McpToolApprovalKey.m1040hashCodeimpl(str4) : 0)) * 31);
        }

        public String toString() {
            String str = this.toolName;
            ToolDisplayContent toolDisplayContent = this.displayContent;
            String str2 = this.integrationIconUrl;
            String str3 = this.integrationName;
            String str4 = this.iconName;
            String strM1162toStringimpl = ToolUseId.m1162toStringimpl(this.toolUseId);
            String str5 = this.approvalKey;
            String strM1041toStringimpl = str5 == null ? "null" : McpToolApprovalKey.m1041toStringimpl(str5);
            boolean z = this.hasAllowAlways;
            StringBuilder sb = new StringBuilder("ToolApproval(toolName=");
            sb.append(str);
            sb.append(", displayContent=");
            sb.append(toolDisplayContent);
            sb.append(", integrationIconUrl=");
            kgh.u(sb, str2, ", integrationName=", str3, ", iconName=");
            kgh.u(sb, str4, ", toolUseId=", strM1162toStringimpl, ", approvalKey=");
            sb.append(strM1041toStringimpl);
            sb.append(", hasAllowAlways=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ ToolApproval(String str, ToolDisplayContent toolDisplayContent, String str2, String str3, String str4, String str5, String str6, boolean z, mq5 mq5Var) {
            this(str, toolDisplayContent, str2, str3, str4, str5, str6, z);
        }

        public /* synthetic */ ToolApproval(int i, String str, ToolDisplayContent toolDisplayContent, String str2, String str3, String str4, String str5, String str6, boolean z, vnf vnfVar, mq5 mq5Var) {
            this(i, str, toolDisplayContent, str2, str3, str4, str5, str6, z, vnfVar);
        }

        private ToolApproval(String str, ToolDisplayContent toolDisplayContent, String str2, String str3, String str4, String str5, String str6, boolean z) {
            str.getClass();
            str5.getClass();
            this.toolName = str;
            this.displayContent = toolDisplayContent;
            this.integrationIconUrl = str2;
            this.integrationName = str3;
            this.iconName = str4;
            this.toolUseId = str5;
            this.approvalKey = str6;
            this.hasAllowAlways = z;
        }

        public /* synthetic */ ToolApproval(String str, ToolDisplayContent toolDisplayContent, String str2, String str3, String str4, String str5, String str6, boolean z, int i, mq5 mq5Var) {
            this(str, toolDisplayContent, str2, str3, (i & 16) != 0 ? null : str4, str5, str6, z, null);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b.\u0010\u001b¨\u00062"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewImage;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "Lcom/anthropic/claude/api/chat/MessageImageAsset;", "image", "", "allowDownload", "showBackButton", "showFilename", "<init>", "(Lcom/anthropic/claude/api/chat/MessageImageAsset;ZZZ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/chat/MessageImageAsset;ZZZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewImage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/chat/MessageImageAsset;", "component2", "()Z", "component3", "component4", "copy", "(Lcom/anthropic/claude/api/chat/MessageImageAsset;ZZZ)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewImage;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/chat/MessageImageAsset;", "getImage", "Z", "getAllowDownload", "getShowBackButton", "getShowFilename", "Companion", "com/anthropic/claude/chat/bottomsheet/r", "com/anthropic/claude/chat/bottomsheet/s", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PreviewImage implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final s Companion = new s();
        private final boolean allowDownload;
        private final MessageImageAsset image;
        private final boolean showBackButton;
        private final boolean showFilename;

        public /* synthetic */ PreviewImage(int i, MessageImageAsset messageImageAsset, boolean z, boolean z2, boolean z3, vnf vnfVar) {
            if (1 != (i & 1)) {
                gvj.f(i, 1, r.a.getDescriptor());
                throw null;
            }
            this.image = messageImageAsset;
            if ((i & 2) == 0) {
                this.allowDownload = false;
            } else {
                this.allowDownload = z;
            }
            if ((i & 4) == 0) {
                this.showBackButton = false;
            } else {
                this.showBackButton = z2;
            }
            if ((i & 8) == 0) {
                this.showFilename = false;
            } else {
                this.showFilename = z3;
            }
        }

        public static /* synthetic */ PreviewImage copy$default(PreviewImage previewImage, MessageImageAsset messageImageAsset, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                messageImageAsset = previewImage.image;
            }
            if ((i & 2) != 0) {
                z = previewImage.allowDownload;
            }
            if ((i & 4) != 0) {
                z2 = previewImage.showBackButton;
            }
            if ((i & 8) != 0) {
                z3 = previewImage.showFilename;
            }
            return previewImage.copy(messageImageAsset, z, z2, z3);
        }

        public static final /* synthetic */ void write$Self$chat(PreviewImage self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, ghb.a, self.image);
            if (output.E(serialDesc) || self.allowDownload) {
                output.p(serialDesc, 1, self.allowDownload);
            }
            if (output.E(serialDesc) || self.showBackButton) {
                output.p(serialDesc, 2, self.showBackButton);
            }
            if (output.E(serialDesc) || self.showFilename) {
                output.p(serialDesc, 3, self.showFilename);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageImageAsset getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getAllowDownload() {
            return this.allowDownload;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShowBackButton() {
            return this.showBackButton;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getShowFilename() {
            return this.showFilename;
        }

        public final PreviewImage copy(MessageImageAsset image, boolean allowDownload, boolean showBackButton, boolean showFilename) {
            image.getClass();
            return new PreviewImage(image, allowDownload, showBackButton, showFilename);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewImage)) {
                return false;
            }
            PreviewImage previewImage = (PreviewImage) other;
            return x44.r(this.image, previewImage.image) && this.allowDownload == previewImage.allowDownload && this.showBackButton == previewImage.showBackButton && this.showFilename == previewImage.showFilename;
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final boolean getAllowDownload() {
            return this.allowDownload;
        }

        public final MessageImageAsset getImage() {
            return this.image;
        }

        public final boolean getShowBackButton() {
            return this.showBackButton;
        }

        public final boolean getShowFilename() {
            return this.showFilename;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showFilename) + fsh.p(fsh.p(this.image.hashCode() * 31, 31, this.allowDownload), 31, this.showBackButton);
        }

        public String toString() {
            return "PreviewImage(image=" + this.image + ", allowDownload=" + this.allowDownload + ", showBackButton=" + this.showBackButton + ", showFilename=" + this.showFilename + ")";
        }

        public PreviewImage(MessageImageAsset messageImageAsset, boolean z, boolean z2, boolean z3) {
            messageImageAsset.getClass();
            this.image = messageImageAsset;
            this.allowDownload = z;
            this.showBackButton = z2;
            this.showFilename = z3;
        }

        public /* synthetic */ PreviewImage(MessageImageAsset messageImageAsset, boolean z, boolean z2, boolean z3, int i, mq5 mq5Var) {
            this(messageImageAsset, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u001c¨\u00060"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewPdf;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination;", "", "relativeUrl", "title", "", "allowDownload", "showBackButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewPdf;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenModalBottomSheetDestination$PreviewPdf;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRelativeUrl", "getTitle", "Z", "getAllowDownload", "getShowBackButton", "Companion", "com/anthropic/claude/chat/bottomsheet/x", "com/anthropic/claude/chat/bottomsheet/y", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PreviewPdf implements ChatScreenModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final y Companion = new y();
        private final boolean allowDownload;
        private final String relativeUrl;
        private final boolean showBackButton;
        private final String title;

        public /* synthetic */ PreviewPdf(int i, String str, String str2, boolean z, boolean z2, vnf vnfVar) {
            if (1 != (i & 1)) {
                gvj.f(i, 1, x.a.getDescriptor());
                throw null;
            }
            this.relativeUrl = str;
            if ((i & 2) == 0) {
                this.title = null;
            } else {
                this.title = str2;
            }
            if ((i & 4) == 0) {
                this.allowDownload = false;
            } else {
                this.allowDownload = z;
            }
            if ((i & 8) == 0) {
                this.showBackButton = false;
            } else {
                this.showBackButton = z2;
            }
        }

        public static /* synthetic */ PreviewPdf copy$default(PreviewPdf previewPdf, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = previewPdf.relativeUrl;
            }
            if ((i & 2) != 0) {
                str2 = previewPdf.title;
            }
            if ((i & 4) != 0) {
                z = previewPdf.allowDownload;
            }
            if ((i & 8) != 0) {
                z2 = previewPdf.showBackButton;
            }
            return previewPdf.copy(str, str2, z, z2);
        }

        public static final /* synthetic */ void write$Self$chat(PreviewPdf self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.relativeUrl);
            if (output.E(serialDesc) || self.title != null) {
                output.B(serialDesc, 1, srg.a, self.title);
            }
            if (output.E(serialDesc) || self.allowDownload) {
                output.p(serialDesc, 2, self.allowDownload);
            }
            if (output.E(serialDesc) || self.showBackButton) {
                output.p(serialDesc, 3, self.showBackButton);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRelativeUrl() {
            return this.relativeUrl;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getAllowDownload() {
            return this.allowDownload;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getShowBackButton() {
            return this.showBackButton;
        }

        public final PreviewPdf copy(String relativeUrl, String title, boolean allowDownload, boolean showBackButton) {
            relativeUrl.getClass();
            return new PreviewPdf(relativeUrl, title, allowDownload, showBackButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewPdf)) {
                return false;
            }
            PreviewPdf previewPdf = (PreviewPdf) other;
            return x44.r(this.relativeUrl, previewPdf.relativeUrl) && x44.r(this.title, previewPdf.title) && this.allowDownload == previewPdf.allowDownload && this.showBackButton == previewPdf.showBackButton;
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final boolean getAllowDownload() {
            return this.allowDownload;
        }

        public final String getRelativeUrl() {
            return this.relativeUrl;
        }

        public final boolean getShowBackButton() {
            return this.showBackButton;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.relativeUrl.hashCode() * 31;
            String str = this.title;
            return Boolean.hashCode(this.showBackButton) + fsh.p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.allowDownload);
        }

        public String toString() {
            String str = this.relativeUrl;
            String str2 = this.title;
            boolean z = this.allowDownload;
            boolean z2 = this.showBackButton;
            StringBuilder sbR = kgh.r("PreviewPdf(relativeUrl=", str, ", title=", str2, ", allowDownload=");
            sbR.append(z);
            sbR.append(", showBackButton=");
            sbR.append(z2);
            sbR.append(")");
            return sbR.toString();
        }

        public PreviewPdf(String str, String str2, boolean z, boolean z2) {
            str.getClass();
            this.relativeUrl = str;
            this.title = str2;
            this.allowDownload = z;
            this.showBackButton = z2;
        }

        public /* synthetic */ PreviewPdf(String str, String str2, boolean z, boolean z2, int i, mq5 mq5Var) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }
    }
}
