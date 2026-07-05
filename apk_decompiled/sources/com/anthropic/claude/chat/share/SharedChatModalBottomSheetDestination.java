package com.anthropic.claude.chat.share;

import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.tool.model.KnowledgeSource;
import defpackage.bga;
import defpackage.cc;
import defpackage.ebh;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ntc;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vq9;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y1g;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import defpackage.ztf;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0006\u0007\b\t\n\u000b\fR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "Closed", "PreviewLink", "ViewSources", "ViewCombinedSources", "ViewCollapsedTools", "com/anthropic/claude/chat/share/a", "Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$Closed;", "Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$PreviewLink;", "Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$ViewCollapsedTools;", "Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$ViewCombinedSources;", "Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$ViewSources;", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface SharedChatModalBottomSheetDestination extends bga {
    public static final a Companion = a.a;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$Closed;", "Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "chat", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Closed implements SharedChatModalBottomSheetDestination, EmptyDestination {
        public static final int $stable = 0;
        public static final Closed INSTANCE = new Closed();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ztf(29));

        private Closed() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination.Closed", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Closed);
        }

        @Override // com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -856860300;
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

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$ViewCollapsedTools;", "Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination;", "", "Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "blockIds", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$ViewCollapsedTools;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$ViewCollapsedTools;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBlockIds", "Companion", "com/anthropic/claude/chat/share/d", "com/anthropic/claude/chat/share/e", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewCollapsedTools implements SharedChatModalBottomSheetDestination {
        public static final int $stable = 8;
        private final List<ParsedContentBlockId> blockIds;
        public static final e Companion = new e();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new y1g(0))};

        public /* synthetic */ ViewCollapsedTools(int i, List list, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.blockIds = list;
            } else {
                gvj.f(i, 1, d.a.getDescriptor());
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

        @Override // com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination, defpackage.bga
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

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J0\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$ViewCombinedSources;", "Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination;", "", "Lcom/anthropic/claude/tool/model/KnowledgeSource;", "citations", "otherSources", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$ViewCombinedSources;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$ViewCombinedSources;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCitations", "getOtherSources", "Companion", "com/anthropic/claude/chat/share/f", "com/anthropic/claude/chat/share/g", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewCombinedSources implements SharedChatModalBottomSheetDestination {
        private static final kw9[] $childSerializers;
        public static final int $stable = 0;
        public static final g Companion = new g();
        private final List<KnowledgeSource> citations;
        private final List<KnowledgeSource> otherSources;

        static {
            y1g y1gVar = new y1g(1);
            w1a w1aVar = w1a.F;
            $childSerializers = new kw9[]{yb5.w(w1aVar, y1gVar), yb5.w(w1aVar, new y1g(2))};
        }

        public /* synthetic */ ViewCombinedSources(int i, List list, List list2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, f.a.getDescriptor());
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

        @Override // com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination, defpackage.bga
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

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$ViewSources;", "Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination;", "", "title", "", "Lcom/anthropic/claude/tool/model/KnowledgeSource;", "sources", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$ViewSources;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$ViewSources;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getSources", "Companion", "com/anthropic/claude/chat/share/h", "com/anthropic/claude/chat/share/i", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewSources implements SharedChatModalBottomSheetDestination {
        public static final int $stable = 8;
        private final List<KnowledgeSource> sources;
        private final String title;
        public static final i Companion = new i();
        private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new y1g(3))};

        public /* synthetic */ ViewSources(int i, String str, List list, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, h.a.getDescriptor());
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

        @Override // com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination, defpackage.bga
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

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$PreviewLink;", "Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination;", "Lcom/anthropic/claude/tool/model/KnowledgeSource;", "source", "", "url", "<init>", "(Lcom/anthropic/claude/tool/model/KnowledgeSource;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/model/KnowledgeSource;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$PreviewLink;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/model/KnowledgeSource;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/tool/model/KnowledgeSource;Ljava/lang/String;)Lcom/anthropic/claude/chat/share/SharedChatModalBottomSheetDestination$PreviewLink;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/model/KnowledgeSource;", "getSource", "Ljava/lang/String;", "getUrl", "Companion", "com/anthropic/claude/chat/share/b", "com/anthropic/claude/chat/share/c", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PreviewLink implements SharedChatModalBottomSheetDestination {
        public static final int $stable = 0;
        public static final c Companion = new c();
        private final KnowledgeSource source;
        private final String url;

        public /* synthetic */ PreviewLink(int i, KnowledgeSource knowledgeSource, String str, vnf vnfVar) {
            if (1 != (i & 1)) {
                gvj.f(i, 1, b.a.getDescriptor());
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

        @Override // com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination, defpackage.bga
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
}
