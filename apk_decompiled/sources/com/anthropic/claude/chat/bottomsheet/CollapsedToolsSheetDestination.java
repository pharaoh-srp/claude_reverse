package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.tool.model.KnowledgeSource;
import defpackage.bga;
import defpackage.cc;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vq9;
import defpackage.w1a;
import defpackage.wt3;
import defpackage.x44;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0006\u0007\b\t\n\u000b\fR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "Dismissed", "Summary", "ToolContent", "Thinking", "Sources", "com/anthropic/claude/chat/bottomsheet/b1", "Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$Dismissed;", "Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$Sources;", "Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$Summary;", "Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$Thinking;", "Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$ToolContent;", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface CollapsedToolsSheetDestination extends bga {
    public static final b1 Companion = b1.a;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$Dismissed;", "Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Dismissed implements CollapsedToolsSheetDestination, EmptyDestination {
        public static final int $stable = 0;
        public static final Dismissed INSTANCE = new Dismissed();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new wt3(24));

        private Dismissed() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination.Dismissed", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Dismissed);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -2072294019;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Dismissed";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$Summary;", "Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Summary implements CollapsedToolsSheetDestination {
        public static final int $stable = 0;
        public static final Summary INSTANCE = new Summary();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new wt3(26));

        private Summary() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination.Summary", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Summary);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1192547706;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Summary";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Chat;
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$Thinking;", "Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination;", "Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "blockId", "<init>", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/chat/parse/ParsedContentBlockId;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$Thinking;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "copy", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;)Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$Thinking;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "getBlockId", "Companion", "com/anthropic/claude/chat/bottomsheet/e1", "com/anthropic/claude/chat/bottomsheet/f1", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Thinking implements CollapsedToolsSheetDestination {
        public static final int $stable = 0;
        public static final f1 Companion = new f1();
        private final ParsedContentBlockId blockId;

        public /* synthetic */ Thinking(int i, ParsedContentBlockId parsedContentBlockId, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.blockId = parsedContentBlockId;
            } else {
                gvj.f(i, 1, e1.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Thinking copy$default(Thinking thinking, ParsedContentBlockId parsedContentBlockId, int i, Object obj) {
            if ((i & 1) != 0) {
                parsedContentBlockId = thinking.blockId;
            }
            return thinking.copy(parsedContentBlockId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ParsedContentBlockId getBlockId() {
            return this.blockId;
        }

        public final Thinking copy(ParsedContentBlockId blockId) {
            blockId.getClass();
            return new Thinking(blockId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Thinking) && x44.r(this.blockId, ((Thinking) other).blockId);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination, defpackage.bga
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
            return "Thinking(blockId=" + this.blockId + ")";
        }

        public Thinking(ParsedContentBlockId parsedContentBlockId) {
            parsedContentBlockId.getClass();
            this.blockId = parsedContentBlockId;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$ToolContent;", "Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination;", "Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "blockId", "<init>", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/chat/parse/ParsedContentBlockId;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$ToolContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "copy", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;)Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$ToolContent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "getBlockId", "Companion", "com/anthropic/claude/chat/bottomsheet/g1", "com/anthropic/claude/chat/bottomsheet/h1", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ToolContent implements CollapsedToolsSheetDestination {
        public static final int $stable = 0;
        public static final h1 Companion = new h1();
        private final ParsedContentBlockId blockId;

        public /* synthetic */ ToolContent(int i, ParsedContentBlockId parsedContentBlockId, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.blockId = parsedContentBlockId;
            } else {
                gvj.f(i, 1, g1.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ToolContent copy$default(ToolContent toolContent, ParsedContentBlockId parsedContentBlockId, int i, Object obj) {
            if ((i & 1) != 0) {
                parsedContentBlockId = toolContent.blockId;
            }
            return toolContent.copy(parsedContentBlockId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ParsedContentBlockId getBlockId() {
            return this.blockId;
        }

        public final ToolContent copy(ParsedContentBlockId blockId) {
            blockId.getClass();
            return new ToolContent(blockId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToolContent) && x44.r(this.blockId, ((ToolContent) other).blockId);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination, defpackage.bga
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
            return "ToolContent(blockId=" + this.blockId + ")";
        }

        public ToolContent(ParsedContentBlockId parsedContentBlockId) {
            parsedContentBlockId.getClass();
            this.blockId = parsedContentBlockId;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$Sources;", "Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination;", "", "title", "", "Lcom/anthropic/claude/tool/model/KnowledgeSource;", "sources", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$Sources;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/chat/bottomsheet/CollapsedToolsSheetDestination$Sources;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getSources", "Companion", "com/anthropic/claude/chat/bottomsheet/c1", "com/anthropic/claude/chat/bottomsheet/d1", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Sources implements CollapsedToolsSheetDestination {
        public static final int $stable = 8;
        private final List<KnowledgeSource> sources;
        private final String title;
        public static final d1 Companion = new d1();
        private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new wt3(25))};

        public /* synthetic */ Sources(int i, String str, List list, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, c1.a.getDescriptor());
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
        public static /* synthetic */ Sources copy$default(Sources sources, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sources.title;
            }
            if ((i & 2) != 0) {
                list = sources.sources;
            }
            return sources.copy(str, list);
        }

        public static final /* synthetic */ void write$Self$chat(Sources self, vd4 output, SerialDescriptor serialDesc) {
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

        public final Sources copy(String title, List<KnowledgeSource> sources) {
            title.getClass();
            sources.getClass();
            return new Sources(title, sources);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sources)) {
                return false;
            }
            Sources sources = (Sources) other;
            return x44.r(this.title, sources.title) && x44.r(this.sources, sources.sources);
        }

        @Override // com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination, defpackage.bga
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
            return y6a.o("Sources(title=", this.title, ", sources=", this.sources, ")");
        }

        public Sources(String str, List<KnowledgeSource> list) {
            str.getClass();
            list.getClass();
            this.title = str;
            this.sources = list;
        }
    }
}
