package com.anthropic.claude.bell.api;

import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.strings.FileId;
import defpackage.e79;
import defpackage.ebh;
import defpackage.ew0;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.meb;
import defpackage.mq5;
import defpackage.oi7;
import defpackage.onf;
import defpackage.qg9;
import defpackage.srg;
import defpackage.uo0;
import defpackage.uo7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.y4j;
import defpackage.yb5;
import defpackage.znf;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage;", "", "Companion", "ManualInputEnd", "Interrupt", "PlaybackComplete", "PauseEndpointing", "UnpauseEndpointing", "AttachmentFlowStart", "AttachmentFlowEnd", "VoiceSelect", "ToolsRegister", "ClientMetrics", "com/anthropic/claude/bell/api/i", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowStart;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$Interrupt;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$ManualInputEnd;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$PlaybackComplete;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$UnpauseEndpointing;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect;", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface BellApiClientMessage {
    public static final i Companion = i.a;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowStart;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "attachment_flow_start", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AttachmentFlowStart implements BellApiClientMessage {
        public static final int $stable = 0;
        public static final AttachmentFlowStart INSTANCE = new AttachmentFlowStart();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ew0(12));

        private AttachmentFlowStart() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("attachment_flow_start", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AttachmentFlowStart);
        }

        public int hashCode() {
            return -1956049594;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "AttachmentFlowStart";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$Interrupt;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "interrupt", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Interrupt implements BellApiClientMessage {
        public static final int $stable = 0;
        public static final Interrupt INSTANCE = new Interrupt();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ew0(13));

        private Interrupt() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("interrupt", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Interrupt);
        }

        public int hashCode() {
            return -398347272;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Interrupt";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$ManualInputEnd;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "manual_input_end", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ManualInputEnd implements BellApiClientMessage {
        public static final int $stable = 0;
        public static final ManualInputEnd INSTANCE = new ManualInputEnd();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ew0(14));

        private ManualInputEnd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("manual_input_end", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ManualInputEnd);
        }

        public int hashCode() {
            return -959380958;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ManualInputEnd";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$PlaybackComplete;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "playback_complete", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PlaybackComplete implements BellApiClientMessage {
        public static final int $stable = 0;
        public static final PlaybackComplete INSTANCE = new PlaybackComplete();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ew0(15));

        private PlaybackComplete() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("playback_complete", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PlaybackComplete);
        }

        public int hashCode() {
            return 1148983615;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "PlaybackComplete";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$UnpauseEndpointing;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "unpause_endpointing", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class UnpauseEndpointing implements BellApiClientMessage {
        public static final int $stable = 0;
        public static final UnpauseEndpointing INSTANCE = new UnpauseEndpointing();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ew0(17));

        private UnpauseEndpointing() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("unpause_endpointing", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof UnpauseEndpointing);
        }

        public int hashCode() {
            return 2124550395;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "UnpauseEndpointing";
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0003%&'B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd$Data;", "data", "<init>", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd$Data;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd$Data;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd$Data;", "copy", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd$Data;)Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd$Data;", "getData", "Companion", "Data", "com/anthropic/claude/bell/api/a", "com/anthropic/claude/bell/api/b", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AttachmentFlowEnd implements BellApiClientMessage {
        public static final int $stable = 0;
        public static final b Companion = new b();
        private final Data data;

        public /* synthetic */ AttachmentFlowEnd(int i, Data data, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.data = null;
            } else {
                this.data = data;
            }
        }

        public static /* synthetic */ AttachmentFlowEnd copy$default(AttachmentFlowEnd attachmentFlowEnd, Data data, int i, Object obj) {
            if ((i & 1) != 0) {
                data = attachmentFlowEnd.data;
            }
            return attachmentFlowEnd.copy(data);
        }

        public static final /* synthetic */ void write$Self$bell(AttachmentFlowEnd self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && self.data == null) {
                return;
            }
            output.B(serialDesc, 0, c.a, self.data);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final AttachmentFlowEnd copy(Data data) {
            return new AttachmentFlowEnd(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AttachmentFlowEnd) && x44.r(this.data, ((AttachmentFlowEnd) other).data);
        }

        public final Data getData() {
            return this.data;
        }

        public int hashCode() {
            Data data = this.data;
            if (data == null) {
                return 0;
            }
            return data.hashCode();
        }

        public String toString() {
            return "AttachmentFlowEnd(data=" + this.data + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AttachmentFlowEnd() {
            this((Data) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public AttachmentFlowEnd(Data data) {
            this.data = data;
        }

        public /* synthetic */ AttachmentFlowEnd(Data data, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : data);
        }

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J4\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd$Data;", "", "", "Lcom/anthropic/claude/types/strings/FileId;", "files", "Lcom/anthropic/claude/api/chat/MessageAttachment;", "attachments", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd$Data;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/bell/api/BellApiClientMessage$AttachmentFlowEnd$Data;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFiles", "getAttachments", "Companion", "com/anthropic/claude/bell/api/c", "com/anthropic/claude/bell/api/d", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Data {
            private static final kw9[] $childSerializers;
            public static final int $stable = 0;
            public static final d Companion = new d();
            private final List<MessageAttachment> attachments;
            private final List<FileId> files;

            static {
                ew0 ew0Var = new ew0(10);
                w1a w1aVar = w1a.F;
                $childSerializers = new kw9[]{yb5.w(w1aVar, ew0Var), yb5.w(w1aVar, new ew0(11))};
            }

            public /* synthetic */ Data(int i, List list, List list2, vnf vnfVar) {
                if ((i & 1) == 0) {
                    this.files = null;
                } else {
                    this.files = list;
                }
                if ((i & 2) == 0) {
                    this.attachments = null;
                } else {
                    this.attachments = list2;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new uo0(oi7.a, 0);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
                return new uo0(meb.a, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Data copy$default(Data data, List list, List list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = data.files;
                }
                if ((i & 2) != 0) {
                    list2 = data.attachments;
                }
                return data.copy(list, list2);
            }

            public static final /* synthetic */ void write$Self$bell(Data self, vd4 output, SerialDescriptor serialDesc) {
                kw9[] kw9VarArr = $childSerializers;
                if (output.E(serialDesc) || self.files != null) {
                    output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.files);
                }
                if (!output.E(serialDesc) && self.attachments == null) {
                    return;
                }
                output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.attachments);
            }

            public final List<FileId> component1() {
                return this.files;
            }

            public final List<MessageAttachment> component2() {
                return this.attachments;
            }

            public final Data copy(List<FileId> files, List<MessageAttachment> attachments) {
                return new Data(files, attachments);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return x44.r(this.files, data.files) && x44.r(this.attachments, data.attachments);
            }

            public final List<MessageAttachment> getAttachments() {
                return this.attachments;
            }

            public final List<FileId> getFiles() {
                return this.files;
            }

            public int hashCode() {
                List<FileId> list = this.files;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                List<MessageAttachment> list2 = this.attachments;
                return iHashCode + (list2 != null ? list2.hashCode() : 0);
            }

            public String toString() {
                return "Data(files=" + this.files + ", attachments=" + this.attachments + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Data() {
                this((List) null, (List) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
            }

            public Data(List<FileId> list, List<MessageAttachment> list2) {
                this.files = list;
                this.attachments = list2;
            }

            public /* synthetic */ Data(List list, List list2, int i, mq5 mq5Var) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
            }
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0003%&'B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing$Data;", "data", "<init>", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing$Data;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing$Data;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing$Data;", "copy", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing$Data;)Lcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing$Data;", "getData", "Companion", "Data", "com/anthropic/claude/bell/api/k", "com/anthropic/claude/bell/api/l", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PauseEndpointing implements BellApiClientMessage {
        public static final int $stable = 0;
        public static final l Companion = new l();
        private final Data data;

        public /* synthetic */ PauseEndpointing(int i, Data data, vnf vnfVar) {
            int i2 = 1;
            if ((i & 1) == 0) {
                this.data = new Data(0L, i2, (mq5) null);
            } else {
                this.data = data;
            }
        }

        public static /* synthetic */ PauseEndpointing copy$default(PauseEndpointing pauseEndpointing, Data data, int i, Object obj) {
            if ((i & 1) != 0) {
                data = pauseEndpointing.data;
            }
            return pauseEndpointing.copy(data);
        }

        public static final /* synthetic */ void write$Self$bell(PauseEndpointing self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc)) {
                if (x44.r(self.data, new Data(0L, 1, (mq5) null))) {
                    return;
                }
            }
            output.B(serialDesc, 0, m.a, self.data);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final PauseEndpointing copy(Data data) {
            return new PauseEndpointing(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PauseEndpointing) && x44.r(this.data, ((PauseEndpointing) other).data);
        }

        public final Data getData() {
            return this.data;
        }

        public int hashCode() {
            Data data = this.data;
            if (data == null) {
                return 0;
            }
            return data.hashCode();
        }

        public String toString() {
            return "PauseEndpointing(data=" + this.data + ")";
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing$Data;", "", "", "timeout_ms", "<init>", "(J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing$Data;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "copy", "(J)Lcom/anthropic/claude/bell/api/BellApiClientMessage$PauseEndpointing$Data;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimeout_ms", "Companion", "com/anthropic/claude/bell/api/m", "com/anthropic/claude/bell/api/n", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Data {
            public static final int $stable = 0;
            public static final n Companion = new n();
            private final long timeout_ms;

            public /* synthetic */ Data(int i, long j, vnf vnfVar) {
                if ((i & 1) == 0) {
                    this.timeout_ms = 60000L;
                } else {
                    this.timeout_ms = j;
                }
            }

            public static /* synthetic */ Data copy$default(Data data, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = data.timeout_ms;
                }
                return data.copy(j);
            }

            public static final /* synthetic */ void write$Self$bell(Data self, vd4 output, SerialDescriptor serialDesc) {
                if (!output.E(serialDesc) && self.timeout_ms == 60000) {
                    return;
                }
                output.D(serialDesc, 0, self.timeout_ms);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final long getTimeout_ms() {
                return this.timeout_ms;
            }

            public final Data copy(long timeout_ms) {
                return new Data(timeout_ms);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Data) && this.timeout_ms == ((Data) other).timeout_ms;
            }

            public final long getTimeout_ms() {
                return this.timeout_ms;
            }

            public int hashCode() {
                return Long.hashCode(this.timeout_ms);
            }

            public String toString() {
                return grc.q(this.timeout_ms, "Data(timeout_ms=", ")");
            }

            public Data() {
                this(0L, 1, (mq5) null);
            }

            public Data(long j) {
                this.timeout_ms = j;
            }

            public /* synthetic */ Data(long j, int i, mq5 mq5Var) {
                this((i & 1) != 0 ? 60000L : j);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PauseEndpointing() {
            this((Data) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public PauseEndpointing(Data data) {
            this.data = data;
        }

        public /* synthetic */ PauseEndpointing(Data data, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? new Data(0L, 1, (mq5) null) : data);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0003%&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister$Data;", "data", "<init>", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister$Data;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister$Data;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister$Data;", "copy", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister$Data;)Lcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister$Data;", "getData", "Companion", "Data", "com/anthropic/claude/bell/api/o", "com/anthropic/claude/bell/api/p", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ToolsRegister implements BellApiClientMessage {
        public static final int $stable = 8;
        public static final p Companion = new p();
        private final Data data;

        public /* synthetic */ ToolsRegister(int i, Data data, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.data = data;
            } else {
                gvj.f(i, 1, o.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ToolsRegister copy$default(ToolsRegister toolsRegister, Data data, int i, Object obj) {
            if ((i & 1) != 0) {
                data = toolsRegister.data;
            }
            return toolsRegister.copy(data);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final ToolsRegister copy(Data data) {
            data.getClass();
            return new ToolsRegister(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToolsRegister) && x44.r(this.data, ((ToolsRegister) other).data);
        }

        public final Data getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ToolsRegister(data=" + this.data + ")";
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister$Data;", "", "", "Lcom/anthropic/claude/api/chat/tool/Tool;", "tools", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister$Data;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/bell/api/BellApiClientMessage$ToolsRegister$Data;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTools", "Companion", "com/anthropic/claude/bell/api/q", "com/anthropic/claude/bell/api/r", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Data {
            public static final int $stable = 8;
            private final List<Tool> tools;
            public static final r Companion = new r();
            private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ew0(16))};

            public /* synthetic */ Data(int i, List list, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.tools = list;
                } else {
                    gvj.f(i, 1, q.a.getDescriptor());
                    throw null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new uo0(com.anthropic.claude.api.chat.tool.e.c, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Data copy$default(Data data, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = data.tools;
                }
                return data.copy(list);
            }

            public final List<Tool> component1() {
                return this.tools;
            }

            public final Data copy(List<? extends Tool> tools) {
                tools.getClass();
                return new Data(tools);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Data) && x44.r(this.tools, ((Data) other).tools);
            }

            public final List<Tool> getTools() {
                return this.tools;
            }

            public int hashCode() {
                return this.tools.hashCode();
            }

            public String toString() {
                return ebh.n("Data(tools=", ")", this.tools);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Data(List<? extends Tool> list) {
                list.getClass();
                this.tools = list;
            }
        }

        public ToolsRegister(Data data) {
            data.getClass();
            this.data = data;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0003%&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics$Data;", "data", "<init>", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics$Data;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics$Data;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics$Data;", "copy", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics$Data;)Lcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics$Data;", "getData", "Companion", "Data", "com/anthropic/claude/bell/api/e", "com/anthropic/claude/bell/api/f", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ClientMetrics implements BellApiClientMessage {
        public static final int $stable = 0;
        public static final f Companion = new f();
        private final Data data;

        public /* synthetic */ ClientMetrics(int i, Data data, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.data = data;
            } else {
                gvj.f(i, 1, e.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ClientMetrics copy$default(ClientMetrics clientMetrics, Data data, int i, Object obj) {
            if ((i & 1) != 0) {
                data = clientMetrics.data;
            }
            return clientMetrics.copy(data);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final ClientMetrics copy(Data data) {
            data.getClass();
            return new ClientMetrics(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClientMetrics) && x44.r(this.data, ((ClientMetrics) other).data);
        }

        public final Data getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ClientMetrics(data=" + this.data + ")";
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics$Data;", "", "", "client_perceived_latency_ms", "", "buffer_underrun_count", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics$Data;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;)Lcom/anthropic/claude/bell/api/BellApiClientMessage$ClientMetrics$Data;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getClient_perceived_latency_ms", "Ljava/lang/Integer;", "getBuffer_underrun_count", "Companion", "com/anthropic/claude/bell/api/g", "com/anthropic/claude/bell/api/h", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Data {
            public static final int $stable = 0;
            public static final h Companion = new h();
            private final Integer buffer_underrun_count;
            private final Long client_perceived_latency_ms;

            public /* synthetic */ Data(int i, Long l, Integer num, vnf vnfVar) {
                if ((i & 1) == 0) {
                    this.client_perceived_latency_ms = null;
                } else {
                    this.client_perceived_latency_ms = l;
                }
                if ((i & 2) == 0) {
                    this.buffer_underrun_count = null;
                } else {
                    this.buffer_underrun_count = num;
                }
            }

            public static /* synthetic */ Data copy$default(Data data, Long l, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    l = data.client_perceived_latency_ms;
                }
                if ((i & 2) != 0) {
                    num = data.buffer_underrun_count;
                }
                return data.copy(l, num);
            }

            public static final /* synthetic */ void write$Self$bell(Data self, vd4 output, SerialDescriptor serialDesc) {
                if (output.E(serialDesc) || self.client_perceived_latency_ms != null) {
                    output.B(serialDesc, 0, xka.a, self.client_perceived_latency_ms);
                }
                if (!output.E(serialDesc) && self.buffer_underrun_count == null) {
                    return;
                }
                output.B(serialDesc, 1, e79.a, self.buffer_underrun_count);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Long getClient_perceived_latency_ms() {
                return this.client_perceived_latency_ms;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Integer getBuffer_underrun_count() {
                return this.buffer_underrun_count;
            }

            public final Data copy(Long client_perceived_latency_ms, Integer buffer_underrun_count) {
                return new Data(client_perceived_latency_ms, buffer_underrun_count);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return x44.r(this.client_perceived_latency_ms, data.client_perceived_latency_ms) && x44.r(this.buffer_underrun_count, data.buffer_underrun_count);
            }

            public final Integer getBuffer_underrun_count() {
                return this.buffer_underrun_count;
            }

            public final Long getClient_perceived_latency_ms() {
                return this.client_perceived_latency_ms;
            }

            public int hashCode() {
                Long l = this.client_perceived_latency_ms;
                int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
                Integer num = this.buffer_underrun_count;
                return iHashCode + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "Data(client_perceived_latency_ms=" + this.client_perceived_latency_ms + ", buffer_underrun_count=" + this.buffer_underrun_count + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Data() {
                this((Long) null, (Integer) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
            }

            public Data(Long l, Integer num) {
                this.client_perceived_latency_ms = l;
                this.buffer_underrun_count = num;
            }

            public /* synthetic */ Data(Long l, Integer num, int i, mq5 mq5Var) {
                this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : num);
            }
        }

        public ClientMetrics(Data data) {
            data.getClass();
            this.data = data;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0003%&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage;", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect$Data;", "data", "<init>", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect$Data;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect$Data;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect$Data;", "copy", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect$Data;)Lcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect$Data;", "getData", "Companion", "Data", "com/anthropic/claude/bell/api/s", "com/anthropic/claude/bell/api/t", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class VoiceSelect implements BellApiClientMessage {
        public static final int $stable = 0;
        public static final t Companion = new t();
        private final Data data;

        public /* synthetic */ VoiceSelect(int i, Data data, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.data = data;
            } else {
                gvj.f(i, 1, s.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ VoiceSelect copy$default(VoiceSelect voiceSelect, Data data, int i, Object obj) {
            if ((i & 1) != 0) {
                data = voiceSelect.data;
            }
            return voiceSelect.copy(data);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final VoiceSelect copy(Data data) {
            data.getClass();
            return new VoiceSelect(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VoiceSelect) && x44.r(this.data, ((VoiceSelect) other).data);
        }

        public final Data getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "VoiceSelect(data=" + this.data + ")";
        }

        public VoiceSelect(Data data) {
            data.getClass();
            this.data = data;
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010\u0019¨\u00060"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect$Data;", "", "Lcom/anthropic/claude/bell/api/VoiceSelection;", "voice", "", "speed", "", "language", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect$Data;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-f4dkSdM", "()Ljava/lang/String;", "component1", "component2", "()Ljava/lang/Float;", "component3", "copy-vTOPmTA", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lcom/anthropic/claude/bell/api/BellApiClientMessage$VoiceSelect$Data;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVoice-f4dkSdM", "Ljava/lang/Float;", "getSpeed", "getLanguage", "Companion", "com/anthropic/claude/bell/api/u", "com/anthropic/claude/bell/api/v", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Data {
            public static final int $stable = 0;
            public static final v Companion = new v();
            private final String language;
            private final Float speed;
            private final String voice;

            private /* synthetic */ Data(int i, String str, Float f, String str2, vnf vnfVar) {
                if ((i & 1) == 0) {
                    this.voice = null;
                } else {
                    this.voice = str;
                }
                if ((i & 2) == 0) {
                    this.speed = null;
                } else {
                    this.speed = f;
                }
                if ((i & 4) == 0) {
                    this.language = null;
                } else {
                    this.language = str2;
                }
            }

            /* JADX INFO: renamed from: copy-vTOPmTA$default, reason: not valid java name */
            public static /* synthetic */ Data m565copyvTOPmTA$default(Data data, String str, Float f, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = data.voice;
                }
                if ((i & 2) != 0) {
                    f = data.speed;
                }
                if ((i & 4) != 0) {
                    str2 = data.language;
                }
                return data.m567copyvTOPmTA(str, f, str2);
            }

            public static final /* synthetic */ void write$Self$bell(Data self, vd4 output, SerialDescriptor serialDesc) {
                if (output.E(serialDesc) || self.voice != null) {
                    y4j y4jVar = y4j.a;
                    String str = self.voice;
                    output.B(serialDesc, 0, y4jVar, str != null ? VoiceSelection.m573boximpl(str) : null);
                }
                if (output.E(serialDesc) || self.speed != null) {
                    output.B(serialDesc, 1, uo7.a, self.speed);
                }
                if (!output.E(serialDesc) && self.language == null) {
                    return;
                }
                output.B(serialDesc, 2, srg.a, self.language);
            }

            /* JADX INFO: renamed from: component1-f4dkSdM, reason: not valid java name and from getter */
            public final String getVoice() {
                return this.voice;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Float getSpeed() {
                return this.speed;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getLanguage() {
                return this.language;
            }

            /* JADX INFO: renamed from: copy-vTOPmTA, reason: not valid java name */
            public final Data m567copyvTOPmTA(String voice, Float speed, String language) {
                return new Data(voice, speed, language, null);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
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
                    boolean r1 = r5 instanceof com.anthropic.claude.bell.api.BellApiClientMessage.VoiceSelect.Data
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    com.anthropic.claude.bell.api.BellApiClientMessage$VoiceSelect$Data r5 = (com.anthropic.claude.bell.api.BellApiClientMessage.VoiceSelect.Data) r5
                    java.lang.String r1 = r4.voice
                    java.lang.String r3 = r5.voice
                    if (r1 != 0) goto L18
                    if (r3 != 0) goto L16
                    r1 = r0
                    goto L1f
                L16:
                    r1 = r2
                    goto L1f
                L18:
                    if (r3 != 0) goto L1b
                    goto L16
                L1b:
                    boolean r1 = com.anthropic.claude.bell.api.VoiceSelection.m576equalsimpl0(r1, r3)
                L1f:
                    if (r1 != 0) goto L22
                    return r2
                L22:
                    java.lang.Float r1 = r4.speed
                    java.lang.Float r3 = r5.speed
                    boolean r1 = defpackage.x44.r(r1, r3)
                    if (r1 != 0) goto L2d
                    return r2
                L2d:
                    java.lang.String r4 = r4.language
                    java.lang.String r5 = r5.language
                    boolean r4 = defpackage.x44.r(r4, r5)
                    if (r4 != 0) goto L38
                    return r2
                L38:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.bell.api.BellApiClientMessage.VoiceSelect.Data.equals(java.lang.Object):boolean");
            }

            public final String getLanguage() {
                return this.language;
            }

            public final Float getSpeed() {
                return this.speed;
            }

            /* JADX INFO: renamed from: getVoice-f4dkSdM, reason: not valid java name */
            public final String m568getVoicef4dkSdM() {
                return this.voice;
            }

            public int hashCode() {
                String str = this.voice;
                int iM577hashCodeimpl = (str == null ? 0 : VoiceSelection.m577hashCodeimpl(str)) * 31;
                Float f = this.speed;
                int iHashCode = (iM577hashCodeimpl + (f == null ? 0 : f.hashCode())) * 31;
                String str2 = this.language;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                String str = this.voice;
                String strM578toStringimpl = str == null ? "null" : VoiceSelection.m578toStringimpl(str);
                Float f = this.speed;
                String str2 = this.language;
                StringBuilder sb = new StringBuilder("Data(voice=");
                sb.append(strM578toStringimpl);
                sb.append(", speed=");
                sb.append(f);
                sb.append(", language=");
                return ij0.m(sb, str2, ")");
            }

            public /* synthetic */ Data(String str, Float f, String str2, mq5 mq5Var) {
                this(str, f, str2);
            }

            public /* synthetic */ Data(int i, String str, Float f, String str2, vnf vnfVar, mq5 mq5Var) {
                this(i, str, f, str2, vnfVar);
            }

            private Data(String str, Float f, String str2) {
                this.voice = str;
                this.speed = f;
                this.language = str2;
            }

            public /* synthetic */ Data(String str, Float f, String str2, int i, mq5 mq5Var) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : str2, null);
            }
        }
    }
}
