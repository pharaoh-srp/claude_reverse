package com.anthropic.claude.stt.repo.api;

import defpackage.afe;
import defpackage.fof;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.jce;
import defpackage.kce;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.odf;
import defpackage.onf;
import defpackage.pl9;
import defpackage.qg9;
import defpackage.s06;
import defpackage.u9e;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.w3c;
import defpackage.wze;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zcd;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/anthropic/claude/stt/repo/api/STTApiMessage;", "", "<init>", "()V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/anthropic/claude/stt/repo/api/STTApiMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Unknown", "TranscriptText", "TranscriptInterim", "wze", "Lcom/anthropic/claude/stt/repo/api/STTApiMessage$TranscriptInterim;", "Lcom/anthropic/claude/stt/repo/api/STTApiMessage$TranscriptText;", "Lcom/anthropic/claude/stt/repo/api/STTApiMessage$Unknown;", "Claude.stt:repo"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public abstract class STTApiMessage {
    private static final kw9 $cachedSerializer$delegate;
    public static final int $stable = 8;
    public static final wze Companion = new wze();
    private static final fof serializersModule;

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/stt/repo/api/STTApiMessage$Unknown;", "Lcom/anthropic/claude/stt/repo/api/STTApiMessage;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "Claude.stt:repo", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Unknown extends STTApiMessage {
        public static final int $stable = 0;
        public static final Unknown INSTANCE = new Unknown();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new afe(22));

        private Unknown() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.stt.repo.api.STTApiMessage.Unknown", INSTANCE, new Annotation[]{new e()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return -1126218136;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Unknown";
        }
    }

    static {
        kotlinx.serialization.modules.a aVar = new kotlinx.serialization.modules.a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(STTApiMessage.class));
        w3cVar.e(kceVar.b(TranscriptText.class), TranscriptText.Companion.serializer());
        w3cVar.e(kceVar.b(TranscriptInterim.class), TranscriptInterim.Companion.serializer());
        w3cVar.b(new u9e(10));
        w3cVar.a(aVar);
        serializersModule = aVar.b();
        $cachedSerializer$delegate = yb5.w(w1a.F, new zcd(22));
    }

    public /* synthetic */ STTApiMessage(mq5 mq5Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.stt.repo.api.STTApiMessage", kceVar.b(STTApiMessage.class), new pl9[]{kceVar.b(TranscriptInterim.class), kceVar.b(TranscriptText.class), kceVar.b(Unknown.class)}, new KSerializer[]{a.a, c.a, new lq6("com.anthropic.claude.stt.repo.api.STTApiMessage.Unknown", Unknown.INSTANCE, new Annotation[]{new e()})}, new Annotation[]{new e()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s06 serializersModule$lambda$0$0$0(String str) {
        return Unknown.INSTANCE.serializer();
    }

    public static final /* synthetic */ void write$Self(STTApiMessage self, vd4 output, SerialDescriptor serialDesc) {
    }

    private STTApiMessage() {
    }

    public /* synthetic */ STTApiMessage(int i, vnf vnfVar) {
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/stt/repo/api/STTApiMessage$TranscriptInterim;", "Lcom/anthropic/claude/stt/repo/api/STTApiMessage;", "", "data", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_stt_repo", "(Lcom/anthropic/claude/stt/repo/api/STTApiMessage$TranscriptInterim;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/stt/repo/api/STTApiMessage$TranscriptInterim;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getData", "Companion", "com/anthropic/claude/stt/repo/api/a", "com/anthropic/claude/stt/repo/api/b", "Claude.stt:repo"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class TranscriptInterim extends STTApiMessage {
        public static final int $stable = 0;
        public static final b Companion = new b();
        private final String data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TranscriptInterim(int i, String str, vnf vnfVar) {
            super(i, vnfVar);
            if (1 != (i & 1)) {
                gvj.f(i, 1, a.a.getDescriptor());
                throw null;
            }
            this.data = str;
        }

        public static /* synthetic */ TranscriptInterim copy$default(TranscriptInterim transcriptInterim, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transcriptInterim.data;
            }
            return transcriptInterim.copy(str);
        }

        public static final /* synthetic */ void write$Self$Claude_stt_repo(TranscriptInterim self, vd4 output, SerialDescriptor serialDesc) {
            STTApiMessage.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.data);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getData() {
            return this.data;
        }

        public final TranscriptInterim copy(String data) {
            data.getClass();
            return new TranscriptInterim(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TranscriptInterim) && x44.r(this.data, ((TranscriptInterim) other).data);
        }

        public final String getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return ij0.j("TranscriptInterim(data=", this.data, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TranscriptInterim(String str) {
            super(null);
            str.getClass();
            this.data = str;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/stt/repo/api/STTApiMessage$TranscriptText;", "Lcom/anthropic/claude/stt/repo/api/STTApiMessage;", "", "data", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_stt_repo", "(Lcom/anthropic/claude/stt/repo/api/STTApiMessage$TranscriptText;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/stt/repo/api/STTApiMessage$TranscriptText;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getData", "Companion", "com/anthropic/claude/stt/repo/api/c", "com/anthropic/claude/stt/repo/api/d", "Claude.stt:repo"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class TranscriptText extends STTApiMessage {
        public static final int $stable = 0;
        public static final d Companion = new d();
        private final String data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TranscriptText(int i, String str, vnf vnfVar) {
            super(i, vnfVar);
            if (1 != (i & 1)) {
                gvj.f(i, 1, c.a.getDescriptor());
                throw null;
            }
            this.data = str;
        }

        public static /* synthetic */ TranscriptText copy$default(TranscriptText transcriptText, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transcriptText.data;
            }
            return transcriptText.copy(str);
        }

        public static final /* synthetic */ void write$Self$Claude_stt_repo(TranscriptText self, vd4 output, SerialDescriptor serialDesc) {
            STTApiMessage.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.data);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getData() {
            return this.data;
        }

        public final TranscriptText copy(String data) {
            data.getClass();
            return new TranscriptText(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TranscriptText) && x44.r(this.data, ((TranscriptText) other).data);
        }

        public final String getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return ij0.j("TranscriptText(data=", this.data, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TranscriptText(String str) {
            super(null);
            str.getClass();
            this.data = str;
        }
    }
}
