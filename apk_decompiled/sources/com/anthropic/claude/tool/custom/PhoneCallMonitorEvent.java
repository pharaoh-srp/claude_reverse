package com.anthropic.claude.tool.custom;

import defpackage.blc;
import defpackage.f1d;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent;", "", "Companion", "UserTranscript", "AgentResponse", "AgentResponseCorrection", "Meta", "CallEndedProcessing", "Unknown", "f1d", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$CallEndedProcessing;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$Meta;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$Unknown;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript;", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = n.class)
public interface PhoneCallMonitorEvent {
    public static final f1d Companion = f1d.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$CallEndedProcessing;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "tool", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class CallEndedProcessing implements PhoneCallMonitorEvent {
        public static final int $stable = 0;
        public static final CallEndedProcessing INSTANCE = new CallEndedProcessing();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new blc(12));

        private CallEndedProcessing() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.tool.custom.PhoneCallMonitorEvent.CallEndedProcessing", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CallEndedProcessing);
        }

        public int hashCode() {
            return -620204091;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "CallEndedProcessing";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$Meta;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "tool", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Meta implements PhoneCallMonitorEvent {
        public static final int $stable = 0;
        public static final Meta INSTANCE = new Meta();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new blc(13));

        private Meta() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.tool.custom.PhoneCallMonitorEvent.Meta", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Meta);
        }

        public int hashCode() {
            return -751994833;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Meta";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$Unknown;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "tool", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Unknown implements PhoneCallMonitorEvent {
        public static final int $stable = 0;
        public static final Unknown INSTANCE = new Unknown();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new blc(14));

        private Unknown() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.tool.custom.PhoneCallMonitorEvent.Unknown", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return -1368710688;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Unknown";
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003'()B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006*"}, d2 = {"Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse$Payload;", "event", "<init>", "(Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse$Payload;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse$Payload;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse$Payload;", "copy", "(Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse$Payload;)Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse$Payload;", "getEvent", "getEvent$annotations", "()V", "Companion", "Payload", "com/anthropic/claude/tool/custom/b", "com/anthropic/claude/tool/custom/c", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AgentResponse implements PhoneCallMonitorEvent {
        public static final int $stable = 0;
        public static final c Companion = new c();
        private final Payload event;

        public /* synthetic */ AgentResponse(int i, Payload payload, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.event = payload;
            } else {
                gvj.f(i, 1, b.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ AgentResponse copy$default(AgentResponse agentResponse, Payload payload, int i, Object obj) {
            if ((i & 1) != 0) {
                payload = agentResponse.event;
            }
            return agentResponse.copy(payload);
        }

        public static /* synthetic */ void getEvent$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Payload getEvent() {
            return this.event;
        }

        public final AgentResponse copy(Payload event) {
            event.getClass();
            return new AgentResponse(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AgentResponse) && x44.r(this.event, ((AgentResponse) other).event);
        }

        public final Payload getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "AgentResponse(event=" + this.event + ")";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse$Payload;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse$Payload;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponse$Payload;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "Companion", "com/anthropic/claude/tool/custom/d", "com/anthropic/claude/tool/custom/e", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Payload {
            public static final int $stable = 0;
            public static final e Companion = new e();
            private final String text;

            public /* synthetic */ Payload(int i, String str, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.text = str;
                } else {
                    gvj.f(i, 1, d.a.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ Payload copy$default(Payload payload, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = payload.text;
                }
                return payload.copy(str);
            }

            public static /* synthetic */ void getText$annotations() {
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Payload copy(String text) {
                text.getClass();
                return new Payload(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Payload) && x44.r(this.text, ((Payload) other).text);
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return ij0.j("Payload(text=", this.text, ")");
            }

            public Payload(String str) {
                str.getClass();
                this.text = str;
            }
        }

        public AgentResponse(Payload payload) {
            payload.getClass();
            this.event = payload;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0003)*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015R\u0011\u0010'\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b&\u0010\u001a¨\u0006,"}, d2 = {"Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection$Payload;", "event", "<init>", "(Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection$Payload;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection$Payload;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection$Payload;", "copy", "(Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection$Payload;)Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection$Payload;", "getEvent", "getEvent$annotations", "()V", "getCorrected", "corrected", "Companion", "Payload", "com/anthropic/claude/tool/custom/f", "com/anthropic/claude/tool/custom/g", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AgentResponseCorrection implements PhoneCallMonitorEvent {
        public static final int $stable = 0;
        public static final g Companion = new g();
        private final Payload event;

        public /* synthetic */ AgentResponseCorrection(int i, Payload payload, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.event = payload;
            } else {
                gvj.f(i, 1, f.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ AgentResponseCorrection copy$default(AgentResponseCorrection agentResponseCorrection, Payload payload, int i, Object obj) {
            if ((i & 1) != 0) {
                payload = agentResponseCorrection.event;
            }
            return agentResponseCorrection.copy(payload);
        }

        public static /* synthetic */ void getEvent$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Payload getEvent() {
            return this.event;
        }

        public final AgentResponseCorrection copy(Payload event) {
            event.getClass();
            return new AgentResponseCorrection(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AgentResponseCorrection) && x44.r(this.event, ((AgentResponseCorrection) other).event);
        }

        public final String getCorrected() {
            return this.event.getCorrected();
        }

        public final Payload getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "AgentResponseCorrection(event=" + this.event + ")";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection$Payload;", "", "", "corrected", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection$Payload;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$AgentResponseCorrection$Payload;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCorrected", "getCorrected$annotations", "()V", "Companion", "com/anthropic/claude/tool/custom/h", "com/anthropic/claude/tool/custom/i", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Payload {
            public static final int $stable = 0;
            public static final i Companion = new i();
            private final String corrected;

            public /* synthetic */ Payload(int i, String str, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.corrected = str;
                } else {
                    gvj.f(i, 1, h.a.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ Payload copy$default(Payload payload, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = payload.corrected;
                }
                return payload.copy(str);
            }

            public static /* synthetic */ void getCorrected$annotations() {
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCorrected() {
                return this.corrected;
            }

            public final Payload copy(String corrected) {
                corrected.getClass();
                return new Payload(corrected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Payload) && x44.r(this.corrected, ((Payload) other).corrected);
            }

            public final String getCorrected() {
                return this.corrected;
            }

            public int hashCode() {
                return this.corrected.hashCode();
            }

            public String toString() {
                return ij0.j("Payload(corrected=", this.corrected, ")");
            }

            public Payload(String str) {
                str.getClass();
                this.corrected = str;
            }
        }

        public AgentResponseCorrection(Payload payload) {
            payload.getClass();
            this.event = payload;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003'()B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015¨\u0006*"}, d2 = {"Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent;", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript$Payload;", "event", "<init>", "(Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript$Payload;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript$Payload;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript$Payload;", "copy", "(Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript$Payload;)Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript$Payload;", "getEvent", "getEvent$annotations", "()V", "Companion", "Payload", "com/anthropic/claude/tool/custom/j", "com/anthropic/claude/tool/custom/k", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class UserTranscript implements PhoneCallMonitorEvent {
        public static final int $stable = 0;
        public static final k Companion = new k();
        private final Payload event;

        public /* synthetic */ UserTranscript(int i, Payload payload, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.event = payload;
            } else {
                gvj.f(i, 1, j.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ UserTranscript copy$default(UserTranscript userTranscript, Payload payload, int i, Object obj) {
            if ((i & 1) != 0) {
                payload = userTranscript.event;
            }
            return userTranscript.copy(payload);
        }

        public static /* synthetic */ void getEvent$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Payload getEvent() {
            return this.event;
        }

        public final UserTranscript copy(Payload event) {
            event.getClass();
            return new UserTranscript(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserTranscript) && x44.r(this.event, ((UserTranscript) other).event);
        }

        public final Payload getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "UserTranscript(event=" + this.event + ")";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript$Payload;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript$Payload;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/tool/custom/PhoneCallMonitorEvent$UserTranscript$Payload;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "Companion", "com/anthropic/claude/tool/custom/l", "com/anthropic/claude/tool/custom/m", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Payload {
            public static final int $stable = 0;
            public static final m Companion = new m();
            private final String text;

            public /* synthetic */ Payload(int i, String str, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.text = str;
                } else {
                    gvj.f(i, 1, l.a.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ Payload copy$default(Payload payload, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = payload.text;
                }
                return payload.copy(str);
            }

            public static /* synthetic */ void getText$annotations() {
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Payload copy(String text) {
                text.getClass();
                return new Payload(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Payload) && x44.r(this.text, ((Payload) other).text);
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return ij0.j("Payload(text=", this.text, ")");
            }

            public Payload(String str) {
                str.getClass();
                this.text = str;
            }
        }

        public UserTranscript(Payload payload) {
            payload.getClass();
            this.event = payload;
        }
    }
}
