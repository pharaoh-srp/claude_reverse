package com.anthropic.claude.bell.api;

import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.strings.MessageId;
import defpackage.b2e;
import defpackage.e79;
import defpackage.eh9;
import defpackage.ehb;
import defpackage.ew0;
import defpackage.f7a;
import defpackage.gid;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.onf;
import defpackage.qg9;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0012\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u000e\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "", "Companion", "SessionServerInitialized", "TranscriptionStart", "TranscriptEmpty", "UserInputEnd", "PlaybackStart", "PlaybackEnd", "ServerInterrupt", "MessageComplete", "MessageCompleteData", "TranscriptInterim", "TTSWord", "MessageSse", "MessageSseEvent", "Error", "BellError", "SessionServerConfig", "Unknown", "com/anthropic/claude/bell/api/h0", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$Error;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageComplete;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSse;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$PlaybackEnd;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$PlaybackStart;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$ServerInterrupt;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$SessionServerConfig;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$SessionServerInitialized;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$TTSWord;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$TranscriptEmpty;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$TranscriptInterim;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$TranscriptionStart;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$Unknown;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$UserInputEnd;", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface BellApiServerMessage {
    public static final h0 Companion = h0.a;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$PlaybackEnd;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "playback_end", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PlaybackEnd implements BellApiServerMessage {
        public static final int $stable = 0;
        public static final PlaybackEnd INSTANCE = new PlaybackEnd();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ew0(21));

        private PlaybackEnd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("playback_end", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PlaybackEnd);
        }

        public int hashCode() {
            return 1633982109;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "PlaybackEnd";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$ServerInterrupt;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "server_interrupt", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ServerInterrupt implements BellApiServerMessage {
        public static final int $stable = 0;
        public static final ServerInterrupt INSTANCE = new ServerInterrupt();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ew0(22));

        private ServerInterrupt() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("server_interrupt", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ServerInterrupt);
        }

        public int hashCode() {
            return -1039058499;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ServerInterrupt";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$SessionServerInitialized;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "session_server_initialized", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SessionServerInitialized implements BellApiServerMessage {
        public static final int $stable = 0;
        public static final SessionServerInitialized INSTANCE = new SessionServerInitialized();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ew0(24));

        private SessionServerInitialized() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("session_server_initialized", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SessionServerInitialized);
        }

        public int hashCode() {
            return -1227170594;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SessionServerInitialized";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$TranscriptEmpty;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "transcript_empty", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class TranscriptEmpty implements BellApiServerMessage {
        public static final int $stable = 0;
        public static final TranscriptEmpty INSTANCE = new TranscriptEmpty();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ew0(25));

        private TranscriptEmpty() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("transcript_empty", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TranscriptEmpty);
        }

        public int hashCode() {
            return 1328979604;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "TranscriptEmpty";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$TranscriptionStart;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "transcription_start", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class TranscriptionStart implements BellApiServerMessage {
        public static final int $stable = 0;
        public static final TranscriptionStart INSTANCE = new TranscriptionStart();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ew0(26));

        private TranscriptionStart() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("transcription_start", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TranscriptionStart);
        }

        public int hashCode() {
            return 626731635;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "TranscriptionStart";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$Unknown;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "unknown", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Unknown implements BellApiServerMessage {
        public static final int $stable = 0;
        public static final Unknown INSTANCE = new Unknown();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ew0(27));

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
            return 1117649063;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Unknown";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$UserInputEnd;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bell", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "user_input_end", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class UserInputEnd implements BellApiServerMessage {
        public static final int $stable = 0;
        public static final UserInputEnd INSTANCE = new UserInputEnd();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new ew0(28));

        private UserInputEnd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("user_input_end", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof UserInputEnd);
        }

        public int hashCode() {
            return 1756522335;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "UserInputEnd";
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$Error;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError;", "data", "<init>", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/bell/api/BellApiServerMessage$BellError;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$Error;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError;", "copy", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError;)Lcom/anthropic/claude/bell/api/BellApiServerMessage$Error;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError;", "getData", "Companion", "com/anthropic/claude/bell/api/i0", "com/anthropic/claude/bell/api/j0", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Error implements BellApiServerMessage {
        public static final int $stable = 8;
        private final BellError data;
        public static final j0 Companion = new j0();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ew0(19))};

        public /* synthetic */ Error(int i, BellError bellError, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.data = null;
            } else {
                this.data = bellError;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return BellError.Companion.serializer();
        }

        public static /* synthetic */ Error copy$default(Error error, BellError bellError, int i, Object obj) {
            if ((i & 1) != 0) {
                bellError = error.data;
            }
            return error.copy(bellError);
        }

        public static final /* synthetic */ void write$Self$bell(Error self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            if (!output.E(serialDesc) && self.data == null) {
                return;
            }
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.data);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BellError getData() {
            return this.data;
        }

        public final Error copy(BellError data) {
            return new Error(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && x44.r(this.data, ((Error) other).data);
        }

        public final BellError getData() {
            return this.data;
        }

        public int hashCode() {
            BellError bellError = this.data;
            if (bellError == null) {
                return 0;
            }
            return bellError.hashCode();
        }

        public String toString() {
            return "Error(data=" + this.data + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this((BellError) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public Error(BellError bellError) {
            this.data = bellError;
        }

        public /* synthetic */ Error(BellError bellError, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : bellError);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006&"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$PlaybackStart;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "", "server_vad_to_tts_start_ms", "<init>", "(Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$PlaybackStart;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/anthropic/claude/bell/api/BellApiServerMessage$PlaybackStart;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getServer_vad_to_tts_start_ms", "Companion", "com/anthropic/claude/bell/api/s0", "com/anthropic/claude/bell/api/t0", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PlaybackStart implements BellApiServerMessage {
        public static final int $stable = 0;
        public static final t0 Companion = new t0();
        private final Integer server_vad_to_tts_start_ms;

        public /* synthetic */ PlaybackStart(int i, Integer num, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.server_vad_to_tts_start_ms = null;
            } else {
                this.server_vad_to_tts_start_ms = num;
            }
        }

        public static /* synthetic */ PlaybackStart copy$default(PlaybackStart playbackStart, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = playbackStart.server_vad_to_tts_start_ms;
            }
            return playbackStart.copy(num);
        }

        public static final /* synthetic */ void write$Self$bell(PlaybackStart self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && self.server_vad_to_tts_start_ms == null) {
                return;
            }
            output.B(serialDesc, 0, e79.a, self.server_vad_to_tts_start_ms);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getServer_vad_to_tts_start_ms() {
            return this.server_vad_to_tts_start_ms;
        }

        public final PlaybackStart copy(Integer server_vad_to_tts_start_ms) {
            return new PlaybackStart(server_vad_to_tts_start_ms);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PlaybackStart) && x44.r(this.server_vad_to_tts_start_ms, ((PlaybackStart) other).server_vad_to_tts_start_ms);
        }

        public final Integer getServer_vad_to_tts_start_ms() {
            return this.server_vad_to_tts_start_ms;
        }

        public int hashCode() {
            Integer num = this.server_vad_to_tts_start_ms;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "PlaybackStart(server_vad_to_tts_start_ms=" + this.server_vad_to_tts_start_ms + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PlaybackStart() {
            this((Integer) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public PlaybackStart(Integer num) {
            this.server_vad_to_tts_start_ms = num;
        }

        public /* synthetic */ PlaybackStart(Integer num, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : num);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0017¨\u0006("}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$SessionServerConfig;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "", "", "Lkotlinx/serialization/json/JsonElement;", "data", "<init>", "(Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$SessionServerConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/anthropic/claude/bell/api/BellApiServerMessage$SessionServerConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getData", "Companion", "com/anthropic/claude/bell/api/u0", "com/anthropic/claude/bell/api/v0", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SessionServerConfig implements BellApiServerMessage {
        public static final int $stable = 8;
        private final Map<String, JsonElement> data;
        public static final v0 Companion = new v0();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ew0(23))};

        public /* synthetic */ SessionServerConfig(int i, Map map, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.data = nm6.E;
            } else {
                this.data = map;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new f7a(srg.a, eh9.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SessionServerConfig copy$default(SessionServerConfig sessionServerConfig, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = sessionServerConfig.data;
            }
            return sessionServerConfig.copy(map);
        }

        public static final /* synthetic */ void write$Self$bell(SessionServerConfig self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            if (!output.E(serialDesc) && x44.r(self.data, nm6.E)) {
                return;
            }
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.data);
        }

        public final Map<String, JsonElement> component1() {
            return this.data;
        }

        public final SessionServerConfig copy(Map<String, ? extends JsonElement> data) {
            data.getClass();
            return new SessionServerConfig(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SessionServerConfig) && x44.r(this.data, ((SessionServerConfig) other).data);
        }

        public final Map<String, JsonElement> getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "SessionServerConfig(data=" + this.data + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SessionServerConfig() {
            this((Map) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SessionServerConfig(Map<String, ? extends JsonElement> map) {
            map.getClass();
            this.data = map;
        }

        public /* synthetic */ SessionServerConfig(Map map, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? nm6.E : map);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageComplete;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageCompleteData;", "data", "<init>", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageCompleteData;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/bell/api/BellApiServerMessage$MessageCompleteData;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageComplete;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageCompleteData;", "copy", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageCompleteData;)Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageComplete;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageCompleteData;", "getData", "Companion", "com/anthropic/claude/bell/api/k0", "com/anthropic/claude/bell/api/l0", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MessageComplete implements BellApiServerMessage {
        public static final int $stable = 8;
        public static final l0 Companion = new l0();
        private final MessageCompleteData data;

        public /* synthetic */ MessageComplete(int i, MessageCompleteData messageCompleteData, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.data = messageCompleteData;
            } else {
                gvj.f(i, 1, k0.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ MessageComplete copy$default(MessageComplete messageComplete, MessageCompleteData messageCompleteData, int i, Object obj) {
            if ((i & 1) != 0) {
                messageCompleteData = messageComplete.data;
            }
            return messageComplete.copy(messageCompleteData);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageCompleteData getData() {
            return this.data;
        }

        public final MessageComplete copy(MessageCompleteData data) {
            data.getClass();
            return new MessageComplete(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MessageComplete) && x44.r(this.data, ((MessageComplete) other).data);
        }

        public final MessageCompleteData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "MessageComplete(data=" + this.data + ")";
        }

        public MessageComplete(MessageCompleteData messageCompleteData) {
            messageCompleteData.getClass();
            this.data = messageCompleteData;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSse;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSseEvent;", "event", "<init>", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSseEvent;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSseEvent;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSseEvent;", "copy", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSseEvent;)Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSseEvent;", "getEvent", "Companion", "com/anthropic/claude/bell/api/o0", "com/anthropic/claude/bell/api/p0", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MessageSse implements BellApiServerMessage {
        public static final int $stable = 0;
        public static final p0 Companion = new p0();
        private final MessageSseEvent event;

        public /* synthetic */ MessageSse(int i, MessageSseEvent messageSseEvent, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.event = messageSseEvent;
            } else {
                gvj.f(i, 1, o0.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ MessageSse copy$default(MessageSse messageSse, MessageSseEvent messageSseEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                messageSseEvent = messageSse.event;
            }
            return messageSse.copy(messageSseEvent);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageSseEvent getEvent() {
            return this.event;
        }

        public final MessageSse copy(MessageSseEvent event) {
            event.getClass();
            return new MessageSse(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MessageSse) && x44.r(this.event, ((MessageSse) other).event);
        }

        public final MessageSseEvent getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "MessageSse(event=" + this.event + ")";
        }

        public MessageSse(MessageSseEvent messageSseEvent) {
            messageSseEvent.getClass();
            this.event = messageSseEvent;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$TranscriptInterim;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$TranscriptInterim;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/bell/api/BellApiServerMessage$TranscriptInterim;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Companion", "com/anthropic/claude/bell/api/y0", "com/anthropic/claude/bell/api/z0", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class TranscriptInterim implements BellApiServerMessage {
        public static final int $stable = 0;
        public static final z0 Companion = new z0();
        private final String text;

        public /* synthetic */ TranscriptInterim(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.text = str;
            } else {
                gvj.f(i, 1, y0.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ TranscriptInterim copy$default(TranscriptInterim transcriptInterim, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transcriptInterim.text;
            }
            return transcriptInterim.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final TranscriptInterim copy(String text) {
            text.getClass();
            return new TranscriptInterim(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TranscriptInterim) && x44.r(this.text, ((TranscriptInterim) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return ij0.j("TranscriptInterim(text=", this.text, ")");
        }

        public TranscriptInterim(String str) {
            str.getClass();
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \b2\u00020\u0001:\u0003\t\n\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0002\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError;", "", "", "getError_code", "()Ljava/lang/String;", "error_code", "getDisplay_message", "display_message", "Companion", "Temporary", "Fatal", "com/anthropic/claude/bell/api/c0", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError$Fatal;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError$Temporary;", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    @qg9(discriminator = "type")
    public interface BellError {
        public static final c0 Companion = c0.a;

        String getDisplay_message();

        String getError_code();

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError$Fatal;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError;", "", "error_code", "display_message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError$Fatal;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError$Fatal;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError_code", "getDisplay_message", "Companion", "com/anthropic/claude/bell/api/d0", "com/anthropic/claude/bell/api/e0", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Fatal implements BellError {
            public static final int $stable = 0;
            public static final e0 Companion = new e0();
            private final String display_message;
            private final String error_code;

            public /* synthetic */ Fatal(int i, String str, String str2, vnf vnfVar) {
                if (3 != (i & 3)) {
                    gvj.f(i, 3, d0.a.getDescriptor());
                    throw null;
                }
                this.error_code = str;
                this.display_message = str2;
            }

            public static /* synthetic */ Fatal copy$default(Fatal fatal, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fatal.error_code;
                }
                if ((i & 2) != 0) {
                    str2 = fatal.display_message;
                }
                return fatal.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self$bell(Fatal self, vd4 output, SerialDescriptor serialDesc) {
                output.q(serialDesc, 0, self.getError_code());
                output.q(serialDesc, 1, self.getDisplay_message());
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getError_code() {
                return this.error_code;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getDisplay_message() {
                return this.display_message;
            }

            public final Fatal copy(String error_code, String display_message) {
                error_code.getClass();
                display_message.getClass();
                return new Fatal(error_code, display_message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Fatal)) {
                    return false;
                }
                Fatal fatal = (Fatal) other;
                return x44.r(this.error_code, fatal.error_code) && x44.r(this.display_message, fatal.display_message);
            }

            @Override // com.anthropic.claude.bell.api.BellApiServerMessage.BellError
            public String getDisplay_message() {
                return this.display_message;
            }

            @Override // com.anthropic.claude.bell.api.BellApiServerMessage.BellError
            public String getError_code() {
                return this.error_code;
            }

            public int hashCode() {
                return this.display_message.hashCode() + (this.error_code.hashCode() * 31);
            }

            public String toString() {
                return ij0.l("Fatal(error_code=", this.error_code, ", display_message=", this.display_message, ")");
            }

            public Fatal(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.error_code = str;
                this.display_message = str2;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError$Temporary;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError;", "", "error_code", "display_message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError$Temporary;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/bell/api/BellApiServerMessage$BellError$Temporary;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError_code", "getDisplay_message", "Companion", "com/anthropic/claude/bell/api/f0", "com/anthropic/claude/bell/api/g0", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Temporary implements BellError {
            public static final int $stable = 0;
            public static final g0 Companion = new g0();
            private final String display_message;
            private final String error_code;

            public /* synthetic */ Temporary(int i, String str, String str2, vnf vnfVar) {
                if (3 != (i & 3)) {
                    gvj.f(i, 3, f0.a.getDescriptor());
                    throw null;
                }
                this.error_code = str;
                this.display_message = str2;
            }

            public static /* synthetic */ Temporary copy$default(Temporary temporary, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = temporary.error_code;
                }
                if ((i & 2) != 0) {
                    str2 = temporary.display_message;
                }
                return temporary.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self$bell(Temporary self, vd4 output, SerialDescriptor serialDesc) {
                output.q(serialDesc, 0, self.getError_code());
                output.q(serialDesc, 1, self.getDisplay_message());
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getError_code() {
                return this.error_code;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getDisplay_message() {
                return this.display_message;
            }

            public final Temporary copy(String error_code, String display_message) {
                error_code.getClass();
                display_message.getClass();
                return new Temporary(error_code, display_message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Temporary)) {
                    return false;
                }
                Temporary temporary = (Temporary) other;
                return x44.r(this.error_code, temporary.error_code) && x44.r(this.display_message, temporary.display_message);
            }

            @Override // com.anthropic.claude.bell.api.BellApiServerMessage.BellError
            public String getDisplay_message() {
                return this.display_message;
            }

            @Override // com.anthropic.claude.bell.api.BellApiServerMessage.BellError
            public String getError_code() {
                return this.error_code;
            }

            public int hashCode() {
                return this.display_message.hashCode() + (this.error_code.hashCode() * 31);
            }

            public String toString() {
                return ij0.l("Temporary(error_code=", this.error_code, ", display_message=", this.display_message, ")");
            }

            public Temporary(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.error_code = str;
                this.display_message = str2;
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSseEvent;", "", "", "type", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSseEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageSseEvent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getData", "getData$annotations", "()V", "Companion", "com/anthropic/claude/bell/api/q0", "com/anthropic/claude/bell/api/r0", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MessageSseEvent {
        public static final int $stable = 0;
        public static final r0 Companion = new r0();
        private final String data;
        private final String type;

        public /* synthetic */ MessageSseEvent(int i, String str, String str2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, q0.a.getDescriptor());
                throw null;
            }
            this.type = str;
            this.data = str2;
        }

        public static /* synthetic */ MessageSseEvent copy$default(MessageSseEvent messageSseEvent, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageSseEvent.type;
            }
            if ((i & 2) != 0) {
                str2 = messageSseEvent.data;
            }
            return messageSseEvent.copy(str, str2);
        }

        @onf(with = b2e.class)
        public static /* synthetic */ void getData$annotations() {
        }

        public static final /* synthetic */ void write$Self$bell(MessageSseEvent self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.type);
            output.B(serialDesc, 1, b2e.a, self.data);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getData() {
            return this.data;
        }

        public final MessageSseEvent copy(String type, String data) {
            type.getClass();
            return new MessageSseEvent(type, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageSseEvent)) {
                return false;
            }
            MessageSseEvent messageSseEvent = (MessageSseEvent) other;
            return x44.r(this.type, messageSseEvent.type) && x44.r(this.data, messageSseEvent.data);
        }

        public final String getData() {
            return this.data;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.data;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return ij0.l("MessageSseEvent(type=", this.type, ", data=", this.data, ")");
        }

        public MessageSseEvent(String str, String str2) {
            str.getClass();
            this.type = str;
            this.data = str2;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageCompleteData;", "", "Lcom/anthropic/claude/types/strings/MessageId;", "message_uuid", "", "sender", "", "Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageCompleteData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-PStrttk", "()Ljava/lang/String;", "component1", "component2", "component3", "()Ljava/util/List;", "copy--u6Mals", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/bell/api/BellApiServerMessage$MessageCompleteData;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage_uuid-PStrttk", "getSender", "Ljava/util/List;", "getContent", "Companion", "com/anthropic/claude/bell/api/m0", "com/anthropic/claude/bell/api/n0", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MessageCompleteData {
        public static final int $stable = 8;
        private final List<ContentBlock> content;
        private final String message_uuid;
        private final String sender;
        public static final n0 Companion = new n0();
        private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new ew0(20))};

        private /* synthetic */ MessageCompleteData(int i, String str, String str2, List list, vnf vnfVar) {
            if (7 != (i & 7)) {
                gvj.f(i, 7, m0.a.getDescriptor());
                throw null;
            }
            this.message_uuid = str;
            this.sender = str2;
            this.content = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new uo0(ContentBlock.Companion.serializer(), 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy--u6Mals$default, reason: not valid java name */
        public static /* synthetic */ MessageCompleteData m569copyu6Mals$default(MessageCompleteData messageCompleteData, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageCompleteData.message_uuid;
            }
            if ((i & 2) != 0) {
                str2 = messageCompleteData.sender;
            }
            if ((i & 4) != 0) {
                list = messageCompleteData.content;
            }
            return messageCompleteData.m571copyu6Mals(str, str2, list);
        }

        public static final /* synthetic */ void write$Self$bell(MessageCompleteData self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.r(serialDesc, 0, ehb.a, MessageId.m1051boximpl(self.message_uuid));
            output.q(serialDesc, 1, self.sender);
            output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.content);
        }

        /* JADX INFO: renamed from: component1-PStrttk, reason: not valid java name and from getter */
        public final String getMessage_uuid() {
            return this.message_uuid;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSender() {
            return this.sender;
        }

        public final List<ContentBlock> component3() {
            return this.content;
        }

        /* JADX INFO: renamed from: copy--u6Mals, reason: not valid java name */
        public final MessageCompleteData m571copyu6Mals(String message_uuid, String sender, List<? extends ContentBlock> content) {
            message_uuid.getClass();
            sender.getClass();
            content.getClass();
            return new MessageCompleteData(message_uuid, sender, content, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageCompleteData)) {
                return false;
            }
            MessageCompleteData messageCompleteData = (MessageCompleteData) other;
            return MessageId.m1054equalsimpl0(this.message_uuid, messageCompleteData.message_uuid) && x44.r(this.sender, messageCompleteData.sender) && x44.r(this.content, messageCompleteData.content);
        }

        public final List<ContentBlock> getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: getMessage_uuid-PStrttk, reason: not valid java name */
        public final String m572getMessage_uuidPStrttk() {
            return this.message_uuid;
        }

        public final String getSender() {
            return this.sender;
        }

        public int hashCode() {
            return this.content.hashCode() + kgh.l(MessageId.m1055hashCodeimpl(this.message_uuid) * 31, 31, this.sender);
        }

        public String toString() {
            String strM1056toStringimpl = MessageId.m1056toStringimpl(this.message_uuid);
            String str = this.sender;
            return gid.q(kgh.r("MessageCompleteData(message_uuid=", strM1056toStringimpl, ", sender=", str, ", content="), this.content, ")");
        }

        public /* synthetic */ MessageCompleteData(String str, String str2, List list, mq5 mq5Var) {
            this(str, str2, list);
        }

        public /* synthetic */ MessageCompleteData(int i, String str, String str2, List list, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, list, vnfVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private MessageCompleteData(String str, String str2, List<? extends ContentBlock> list) {
            str.getClass();
            str2.getClass();
            list.getClass();
            this.message_uuid = str;
            this.sender = str2;
            this.content = list;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiServerMessage$TTSWord;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "", "text", "", "pts_ms", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage$TTSWord;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/anthropic/claude/bell/api/BellApiServerMessage$TTSWord;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/lang/Integer;", "getPts_ms", "Companion", "com/anthropic/claude/bell/api/w0", "com/anthropic/claude/bell/api/x0", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class TTSWord implements BellApiServerMessage {
        public static final int $stable = 0;
        public static final x0 Companion = new x0();
        private final Integer pts_ms;
        private final String text;

        public /* synthetic */ TTSWord(int i, String str, Integer num, vnf vnfVar) {
            if (1 != (i & 1)) {
                gvj.f(i, 1, w0.a.getDescriptor());
                throw null;
            }
            this.text = str;
            if ((i & 2) == 0) {
                this.pts_ms = null;
            } else {
                this.pts_ms = num;
            }
        }

        public static /* synthetic */ TTSWord copy$default(TTSWord tTSWord, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tTSWord.text;
            }
            if ((i & 2) != 0) {
                num = tTSWord.pts_ms;
            }
            return tTSWord.copy(str, num);
        }

        public static final /* synthetic */ void write$Self$bell(TTSWord self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.text);
            if (!output.E(serialDesc) && self.pts_ms == null) {
                return;
            }
            output.B(serialDesc, 1, e79.a, self.pts_ms);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getPts_ms() {
            return this.pts_ms;
        }

        public final TTSWord copy(String text, Integer pts_ms) {
            text.getClass();
            return new TTSWord(text, pts_ms);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TTSWord)) {
                return false;
            }
            TTSWord tTSWord = (TTSWord) other;
            return x44.r(this.text, tTSWord.text) && x44.r(this.pts_ms, tTSWord.pts_ms);
        }

        public final Integer getPts_ms() {
            return this.pts_ms;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            Integer num = this.pts_ms;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "TTSWord(text=" + this.text + ", pts_ms=" + this.pts_ms + ")";
        }

        public TTSWord(String str, Integer num) {
            str.getClass();
            this.text = str;
            this.pts_ms = num;
        }

        public /* synthetic */ TTSWord(String str, Integer num, int i, mq5 mq5Var) {
            this(str, (i & 2) != 0 ? null : num);
        }
    }
}
