package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams;
import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.bga;
import defpackage.cc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rc1;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wy2;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0004\u0007\b\t\nR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "Closed", "ViewArtifact", "ViewAnalysis", "com/anthropic/claude/chat/bottomsheet/a", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination$Closed;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination$ViewAnalysis;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination$ViewArtifact;", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface ChatScreenArtifactSheetDestination extends bga {
    public static final a Companion = a.a;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination$Closed;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Closed implements ChatScreenArtifactSheetDestination, EmptyDestination {
        public static final int $stable = 0;
        public static final Closed INSTANCE = new Closed();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rc1(27));

        private Closed() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination.Closed", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Closed);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1076504134;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Closed";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Chat;
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination$ViewAnalysis;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination;", "Lcom/anthropic/claude/types/strings/ToolUseId;", "toolUseId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination$ViewAnalysis;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-ERU6ZeY", "()Ljava/lang/String;", "component1", "copy-_tiOQdU", "(Ljava/lang/String;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination$ViewAnalysis;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolUseId-ERU6ZeY", "Companion", "com/anthropic/claude/chat/bottomsheet/b", "com/anthropic/claude/chat/bottomsheet/c", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewAnalysis implements ChatScreenArtifactSheetDestination {
        public static final int $stable = 0;
        public static final c Companion = new c();
        private final String toolUseId;

        private /* synthetic */ ViewAnalysis(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.toolUseId = str;
            } else {
                gvj.f(i, 1, b.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-_tiOQdU$default, reason: not valid java name */
        public static /* synthetic */ ViewAnalysis m594copy_tiOQdU$default(ViewAnalysis viewAnalysis, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewAnalysis.toolUseId;
            }
            return viewAnalysis.m596copy_tiOQdU(str);
        }

        /* JADX INFO: renamed from: component1-ERU6ZeY, reason: not valid java name and from getter */
        public final String getToolUseId() {
            return this.toolUseId;
        }

        /* JADX INFO: renamed from: copy-_tiOQdU, reason: not valid java name */
        public final ViewAnalysis m596copy_tiOQdU(String toolUseId) {
            toolUseId.getClass();
            return new ViewAnalysis(toolUseId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewAnalysis) && ToolUseId.m1160equalsimpl0(this.toolUseId, ((ViewAnalysis) other).toolUseId);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getToolUseId-ERU6ZeY, reason: not valid java name */
        public final String m597getToolUseIdERU6ZeY() {
            return this.toolUseId;
        }

        public int hashCode() {
            return ToolUseId.m1161hashCodeimpl(this.toolUseId);
        }

        public String toString() {
            return ij0.j("ViewAnalysis(toolUseId=", ToolUseId.m1162toStringimpl(this.toolUseId), ")");
        }

        public /* synthetic */ ViewAnalysis(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ ViewAnalysis(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private ViewAnalysis(String str) {
            str.getClass();
            this.toolUseId = str;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination$ViewArtifact;", "Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination;", "Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams;", "params", "<init>", "(Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination$ViewArtifact;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams;", "copy", "(Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams;)Lcom/anthropic/claude/chat/bottomsheet/ChatScreenArtifactSheetDestination$ViewArtifact;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams;", "getParams", "Companion", "com/anthropic/claude/chat/bottomsheet/d", "com/anthropic/claude/chat/bottomsheet/e", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewArtifact implements ChatScreenArtifactSheetDestination {
        public static final int $stable = 0;
        private final ArtifactBottomSheetParams params;
        public static final e Companion = new e();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new wy2(4))};

        public /* synthetic */ ViewArtifact(int i, ArtifactBottomSheetParams artifactBottomSheetParams, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.params = artifactBottomSheetParams;
            } else {
                gvj.f(i, 1, d.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return ArtifactBottomSheetParams.Companion.serializer();
        }

        public static /* synthetic */ ViewArtifact copy$default(ViewArtifact viewArtifact, ArtifactBottomSheetParams artifactBottomSheetParams, int i, Object obj) {
            if ((i & 1) != 0) {
                artifactBottomSheetParams = viewArtifact.params;
            }
            return viewArtifact.copy(artifactBottomSheetParams);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ArtifactBottomSheetParams getParams() {
            return this.params;
        }

        public final ViewArtifact copy(ArtifactBottomSheetParams params) {
            params.getClass();
            return new ViewArtifact(params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewArtifact) && x44.r(this.params, ((ViewArtifact) other).params);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final ArtifactBottomSheetParams getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        public String toString() {
            return "ViewArtifact(params=" + this.params + ")";
        }

        public ViewArtifact(ArtifactBottomSheetParams artifactBottomSheetParams) {
            artifactBottomSheetParams.getClass();
            this.params = artifactBottomSheetParams;
        }
    }
}
