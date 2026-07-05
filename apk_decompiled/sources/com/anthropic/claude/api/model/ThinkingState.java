package com.anthropic.claude.api.model;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import defpackage.emh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nlh;
import defpackage.onf;
import defpackage.qg9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.zlh;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/model/ThinkingState;", "", "Companion", "EffortAndMode", "Effort", "Mode", "Unknown", "com/anthropic/claude/api/model/g", "Lcom/anthropic/claude/api/model/ThinkingState$Effort;", "Lcom/anthropic/claude/api/model/ThinkingState$EffortAndMode;", "Lcom/anthropic/claude/api/model/ThinkingState$Mode;", "Lcom/anthropic/claude/api/model/ThinkingState$Unknown;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface ThinkingState {
    public static final g Companion = g.a;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/api/model/ThinkingState$Unknown;", "Lcom/anthropic/claude/api/model/ThinkingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "api", "Landroidx/compose/runtime/Immutable;", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "unknown"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Unknown implements ThinkingState {
        public static final int $stable = 0;
        public static final Unknown INSTANCE = new Unknown();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new nlh(10));

        private Unknown() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("unknown", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return 1372970051;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Unknown";
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/model/ThinkingState$Effort;", "Lcom/anthropic/claude/api/model/ThinkingState;", "Lcom/anthropic/claude/types/strings/ThinkingEffort;", "effort", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ThinkingState$Effort;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-RIwV3po", "()Ljava/lang/String;", "component1", "copy-wFsEwDk", "(Ljava/lang/String;)Lcom/anthropic/claude/api/model/ThinkingState$Effort;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEffort-RIwV3po", "Companion", "com/anthropic/claude/api/model/h", "com/anthropic/claude/api/model/i", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Effort implements ThinkingState {
        public static final int $stable = 0;
        public static final i Companion = new i();
        private final String effort;

        private /* synthetic */ Effort(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.effort = str;
            } else {
                gvj.f(i, 1, h.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-wFsEwDk$default, reason: not valid java name */
        public static /* synthetic */ Effort m387copywFsEwDk$default(Effort effort, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = effort.effort;
            }
            return effort.m389copywFsEwDk(str);
        }

        /* JADX INFO: renamed from: component1-RIwV3po, reason: not valid java name and from getter */
        public final String getEffort() {
            return this.effort;
        }

        /* JADX INFO: renamed from: copy-wFsEwDk, reason: not valid java name */
        public final Effort m389copywFsEwDk(String effort) {
            effort.getClass();
            return new Effort(effort, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Effort) && ThinkingEffort.m1138equalsimpl0(this.effort, ((Effort) other).effort);
        }

        /* JADX INFO: renamed from: getEffort-RIwV3po, reason: not valid java name */
        public final String m390getEffortRIwV3po() {
            return this.effort;
        }

        public int hashCode() {
            return ThinkingEffort.m1139hashCodeimpl(this.effort);
        }

        public String toString() {
            return ij0.j("Effort(effort=", ThinkingEffort.m1140toStringimpl(this.effort), ")");
        }

        public /* synthetic */ Effort(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ Effort(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private Effort(String str) {
            str.getClass();
            this.effort = str;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/model/ThinkingState$Mode;", "Lcom/anthropic/claude/api/model/ThinkingState;", "Lcom/anthropic/claude/types/strings/ThinkingMode;", "mode", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ThinkingState$Mode;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-gcx3iIA", "()Ljava/lang/String;", "component1", "copy-HA_chyo", "(Ljava/lang/String;)Lcom/anthropic/claude/api/model/ThinkingState$Mode;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMode-gcx3iIA", "Companion", "com/anthropic/claude/api/model/m", "com/anthropic/claude/api/model/n", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Mode implements ThinkingState {
        public static final int $stable = 0;
        public static final n Companion = new n();
        private final String mode;

        private /* synthetic */ Mode(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.mode = str;
            } else {
                gvj.f(i, 1, m.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-HA_chyo$default, reason: not valid java name */
        public static /* synthetic */ Mode m397copyHA_chyo$default(Mode mode, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mode.mode;
            }
            return mode.m399copyHA_chyo(str);
        }

        /* JADX INFO: renamed from: component1-gcx3iIA, reason: not valid java name and from getter */
        public final String getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: copy-HA_chyo, reason: not valid java name */
        public final Mode m399copyHA_chyo(String mode) {
            mode.getClass();
            return new Mode(mode, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Mode) && ThinkingMode.m1145equalsimpl0(this.mode, ((Mode) other).mode);
        }

        /* JADX INFO: renamed from: getMode-gcx3iIA, reason: not valid java name */
        public final String m400getModegcx3iIA() {
            return this.mode;
        }

        public int hashCode() {
            return ThinkingMode.m1146hashCodeimpl(this.mode);
        }

        public String toString() {
            return ij0.j("Mode(mode=", ThinkingMode.m1148toStringimpl(this.mode), ")");
        }

        public /* synthetic */ Mode(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ Mode(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private Mode(String str) {
            str.getClass();
            this.mode = str;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010\u0017¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/model/ThinkingState$EffortAndMode;", "Lcom/anthropic/claude/api/model/ThinkingState;", "Lcom/anthropic/claude/types/strings/ThinkingEffort;", "effort", "Lcom/anthropic/claude/types/strings/ThinkingMode;", "mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ThinkingState$EffortAndMode;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-RIwV3po", "()Ljava/lang/String;", "component1", "component2-gcx3iIA", "component2", "copy-sbirvwA", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/model/ThinkingState$EffortAndMode;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEffort-RIwV3po", "getMode-gcx3iIA", "Companion", "com/anthropic/claude/api/model/k", "com/anthropic/claude/api/model/l", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class EffortAndMode implements ThinkingState {
        public static final int $stable = 0;
        public static final l Companion = new l();
        private final String effort;
        private final String mode;

        private /* synthetic */ EffortAndMode(int i, String str, String str2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, k.a.getDescriptor());
                throw null;
            }
            this.effort = str;
            this.mode = str2;
        }

        /* JADX INFO: renamed from: copy-sbirvwA$default, reason: not valid java name */
        public static /* synthetic */ EffortAndMode m391copysbirvwA$default(EffortAndMode effortAndMode, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = effortAndMode.effort;
            }
            if ((i & 2) != 0) {
                str2 = effortAndMode.mode;
            }
            return effortAndMode.m394copysbirvwA(str, str2);
        }

        public static final /* synthetic */ void write$Self$api(EffortAndMode self, vd4 output, SerialDescriptor serialDesc) {
            output.r(serialDesc, 0, zlh.a, ThinkingEffort.m1135boximpl(self.effort));
            output.r(serialDesc, 1, emh.a, ThinkingMode.m1142boximpl(self.mode));
        }

        /* JADX INFO: renamed from: component1-RIwV3po, reason: not valid java name and from getter */
        public final String getEffort() {
            return this.effort;
        }

        /* JADX INFO: renamed from: component2-gcx3iIA, reason: not valid java name and from getter */
        public final String getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: copy-sbirvwA, reason: not valid java name */
        public final EffortAndMode m394copysbirvwA(String effort, String mode) {
            effort.getClass();
            mode.getClass();
            return new EffortAndMode(effort, mode, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EffortAndMode)) {
                return false;
            }
            EffortAndMode effortAndMode = (EffortAndMode) other;
            return ThinkingEffort.m1138equalsimpl0(this.effort, effortAndMode.effort) && ThinkingMode.m1145equalsimpl0(this.mode, effortAndMode.mode);
        }

        /* JADX INFO: renamed from: getEffort-RIwV3po, reason: not valid java name */
        public final String m395getEffortRIwV3po() {
            return this.effort;
        }

        /* JADX INFO: renamed from: getMode-gcx3iIA, reason: not valid java name */
        public final String m396getModegcx3iIA() {
            return this.mode;
        }

        public int hashCode() {
            return ThinkingMode.m1146hashCodeimpl(this.mode) + (ThinkingEffort.m1139hashCodeimpl(this.effort) * 31);
        }

        public String toString() {
            return ij0.l("EffortAndMode(effort=", ThinkingEffort.m1140toStringimpl(this.effort), ", mode=", ThinkingMode.m1148toStringimpl(this.mode), ")");
        }

        public /* synthetic */ EffortAndMode(String str, String str2, mq5 mq5Var) {
            this(str, str2);
        }

        public /* synthetic */ EffortAndMode(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, vnfVar);
        }

        private EffortAndMode(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.effort = str;
            this.mode = str2;
        }
    }
}
