package com.anthropic.claude.bell;

import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.bga;
import defpackage.c1i;
import defpackage.cc;
import defpackage.ehb;
import defpackage.elb;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.ll1;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vq9;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0005\u0007\b\t\n\u000bR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/bell/BellOverlayDestination;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "Closed", "Settings", "ViewAllSources", "ToolApproval", "com/anthropic/claude/bell/e", "Lcom/anthropic/claude/bell/BellOverlayDestination$Closed;", "Lcom/anthropic/claude/bell/BellOverlayDestination$Settings;", "Lcom/anthropic/claude/bell/BellOverlayDestination$ToolApproval;", "Lcom/anthropic/claude/bell/BellOverlayDestination$ViewAllSources;", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface BellOverlayDestination extends bga {
    public static final e Companion = e.a;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/bell/BellOverlayDestination$Closed;", "Lcom/anthropic/claude/bell/BellOverlayDestination;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Closed implements BellOverlayDestination, EmptyDestination {
        public static final int $stable = 0;
        public static final Closed INSTANCE = new Closed();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ll1(6));

        private Closed() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.bell.BellOverlayDestination.Closed", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Closed);
        }

        @Override // com.anthropic.claude.bell.BellOverlayDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -1457200977;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Closed";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/BellOverlayDestination$Settings;", "Lcom/anthropic/claude/bell/BellOverlayDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Settings implements BellOverlayDestination {
        public static final int $stable = 0;
        public static final Settings INSTANCE = new Settings();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ll1(7));

        private Settings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.bell.BellOverlayDestination.Settings", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Settings);
        }

        @Override // com.anthropic.claude.bell.BellOverlayDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 131004070;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Settings";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J0\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/bell/BellOverlayDestination$ViewAllSources;", "Lcom/anthropic/claude/bell/BellOverlayDestination;", "", "Lcom/anthropic/claude/tool/model/KnowledgeSource;", "citations", "otherSources", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/BellOverlayDestination$ViewAllSources;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/bell/BellOverlayDestination$ViewAllSources;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCitations", "getOtherSources", "Companion", "com/anthropic/claude/bell/h", "com/anthropic/claude/bell/i", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ViewAllSources implements BellOverlayDestination {
        private static final kw9[] $childSerializers;
        public static final int $stable = 0;
        public static final i Companion = new i();
        private final List<KnowledgeSource> citations;
        private final List<KnowledgeSource> otherSources;

        static {
            ll1 ll1Var = new ll1(8);
            w1a w1aVar = w1a.F;
            $childSerializers = new kw9[]{yb5.w(w1aVar, ll1Var), yb5.w(w1aVar, new ll1(9))};
        }

        public /* synthetic */ ViewAllSources(int i, List list, List list2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, h.a.getDescriptor());
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
        public static /* synthetic */ ViewAllSources copy$default(ViewAllSources viewAllSources, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = viewAllSources.citations;
            }
            if ((i & 2) != 0) {
                list2 = viewAllSources.otherSources;
            }
            return viewAllSources.copy(list, list2);
        }

        public static final /* synthetic */ void write$Self$bell(ViewAllSources self, vd4 output, SerialDescriptor serialDesc) {
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

        public final ViewAllSources copy(List<KnowledgeSource> citations, List<KnowledgeSource> otherSources) {
            citations.getClass();
            otherSources.getClass();
            return new ViewAllSources(citations, otherSources);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewAllSources)) {
                return false;
            }
            ViewAllSources viewAllSources = (ViewAllSources) other;
            return x44.r(this.citations, viewAllSources.citations) && x44.r(this.otherSources, viewAllSources.otherSources);
        }

        @Override // com.anthropic.claude.bell.BellOverlayDestination, defpackage.bga
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
            return "ViewAllSources(citations=" + this.citations + ", otherSources=" + this.otherSources + ")";
        }

        public ViewAllSources(List<KnowledgeSource> list, List<KnowledgeSource> list2) {
            list.getClass();
            list2.getClass();
            this.citations = list;
            this.otherSources = list2;
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJF\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b4\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b5\u0010\u001c¨\u00069"}, d2 = {"Lcom/anthropic/claude/bell/BellOverlayDestination$ToolApproval;", "Lcom/anthropic/claude/bell/BellOverlayDestination;", "", "toolName", "toolInput", "Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;", "toolPreviewInfo", "Lcom/anthropic/claude/types/strings/ToolUseId;", "toolUseId", "Lcom/anthropic/claude/types/strings/MessageId;", "messageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/BellOverlayDestination$ToolApproval;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;", "component4-ERU6ZeY", "component4", "component5-saiyK68", "component5", "copy-UhX9cm4", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/bell/BellOverlayDestination$ToolApproval;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolName", "getToolInput", "Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;", "getToolPreviewInfo", "getToolUseId-ERU6ZeY", "getMessageId-saiyK68", "Companion", "com/anthropic/claude/bell/f", "com/anthropic/claude/bell/g", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ToolApproval implements BellOverlayDestination {
        public static final int $stable = 0;
        public static final g Companion = new g();
        private final String messageId;
        private final String toolInput;
        private final String toolName;
        private final MobileAppToolPreviewInfo toolPreviewInfo;
        private final String toolUseId;

        private /* synthetic */ ToolApproval(int i, String str, String str2, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, String str3, String str4, vnf vnfVar) {
            if (31 != (i & 31)) {
                gvj.f(i, 31, f.a.getDescriptor());
                throw null;
            }
            this.toolName = str;
            this.toolInput = str2;
            this.toolPreviewInfo = mobileAppToolPreviewInfo;
            this.toolUseId = str3;
            this.messageId = str4;
        }

        /* JADX INFO: renamed from: copy-UhX9cm4$default, reason: not valid java name */
        public static /* synthetic */ ToolApproval m551copyUhX9cm4$default(ToolApproval toolApproval, String str, String str2, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolApproval.toolName;
            }
            if ((i & 2) != 0) {
                str2 = toolApproval.toolInput;
            }
            if ((i & 4) != 0) {
                mobileAppToolPreviewInfo = toolApproval.toolPreviewInfo;
            }
            if ((i & 8) != 0) {
                str3 = toolApproval.toolUseId;
            }
            if ((i & 16) != 0) {
                str4 = toolApproval.messageId;
            }
            String str5 = str4;
            MobileAppToolPreviewInfo mobileAppToolPreviewInfo2 = mobileAppToolPreviewInfo;
            return toolApproval.m554copyUhX9cm4(str, str2, mobileAppToolPreviewInfo2, str3, str5);
        }

        public static final /* synthetic */ void write$Self$bell(ToolApproval self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.toolName);
            output.B(serialDesc, 1, srg.a, self.toolInput);
            output.r(serialDesc, 2, elb.a, self.toolPreviewInfo);
            output.r(serialDesc, 3, c1i.a, ToolUseId.m1157boximpl(self.toolUseId));
            ehb ehbVar = ehb.a;
            String str = self.messageId;
            output.B(serialDesc, 4, ehbVar, str != null ? MessageId.m1051boximpl(str) : null);
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

        /* JADX INFO: renamed from: copy-UhX9cm4, reason: not valid java name */
        public final ToolApproval m554copyUhX9cm4(String toolName, String toolInput, MobileAppToolPreviewInfo toolPreviewInfo, String toolUseId, String messageId) {
            toolName.getClass();
            toolPreviewInfo.getClass();
            toolUseId.getClass();
            return new ToolApproval(toolName, toolInput, toolPreviewInfo, toolUseId, messageId, null);
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
                boolean r1 = r5 instanceof com.anthropic.claude.bell.BellOverlayDestination.ToolApproval
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.anthropic.claude.bell.BellOverlayDestination$ToolApproval r5 = (com.anthropic.claude.bell.BellOverlayDestination.ToolApproval) r5
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
                java.lang.String r4 = r4.messageId
                java.lang.String r5 = r5.messageId
                if (r4 != 0) goto L44
                if (r5 != 0) goto L42
                r4 = r0
                goto L4b
            L42:
                r4 = r2
                goto L4b
            L44:
                if (r5 != 0) goto L47
                goto L42
            L47:
                boolean r4 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r4, r5)
            L4b:
                if (r4 != 0) goto L4e
                return r2
            L4e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.bell.BellOverlayDestination.ToolApproval.equals(java.lang.Object):boolean");
        }

        @Override // com.anthropic.claude.bell.BellOverlayDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getMessageId-saiyK68, reason: not valid java name */
        public final String m555getMessageIdsaiyK68() {
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
        public final String m556getToolUseIdERU6ZeY() {
            return this.toolUseId;
        }

        public int hashCode() {
            int iHashCode = this.toolName.hashCode() * 31;
            String str = this.toolInput;
            int iM1161hashCodeimpl = (ToolUseId.m1161hashCodeimpl(this.toolUseId) + ((this.toolPreviewInfo.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
            String str2 = this.messageId;
            return iM1161hashCodeimpl + (str2 != null ? MessageId.m1055hashCodeimpl(str2) : 0);
        }

        public String toString() {
            String str = this.toolName;
            String str2 = this.toolInput;
            MobileAppToolPreviewInfo mobileAppToolPreviewInfo = this.toolPreviewInfo;
            String strM1162toStringimpl = ToolUseId.m1162toStringimpl(this.toolUseId);
            String str3 = this.messageId;
            String strM1056toStringimpl = str3 == null ? "null" : MessageId.m1056toStringimpl(str3);
            StringBuilder sbR = kgh.r("ToolApproval(toolName=", str, ", toolInput=", str2, ", toolPreviewInfo=");
            sbR.append(mobileAppToolPreviewInfo);
            sbR.append(", toolUseId=");
            sbR.append(strM1162toStringimpl);
            sbR.append(", messageId=");
            return ij0.m(sbR, strM1056toStringimpl, ")");
        }

        public /* synthetic */ ToolApproval(String str, String str2, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, String str3, String str4, mq5 mq5Var) {
            this(str, str2, mobileAppToolPreviewInfo, str3, str4);
        }

        public /* synthetic */ ToolApproval(int i, String str, String str2, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, String str3, String str4, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, mobileAppToolPreviewInfo, str3, str4, vnfVar);
        }

        private ToolApproval(String str, String str2, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, String str3, String str4) {
            str.getClass();
            mobileAppToolPreviewInfo.getClass();
            str3.getClass();
            this.toolName = str;
            this.toolInput = str2;
            this.toolPreviewInfo = mobileAppToolPreviewInfo;
            this.toolUseId = str3;
            this.messageId = str4;
        }
    }
}
