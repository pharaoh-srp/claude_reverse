package com.anthropic.claude.artifact.details;

import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.PublishedArtifactId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sq6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0004\u0007\b\t\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams;", "", "", "getUuidValue", "()Ljava/lang/String;", "uuidValue", "Companion", "SharedArtifactFullScreenParams", "PublishedArtifactFullScreenParams", "LoadedArtifactFullScreenParams", "com/anthropic/claude/artifact/details/a", "Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams$LoadedArtifactFullScreenParams;", "Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams$PublishedArtifactFullScreenParams;", "Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams$SharedArtifactFullScreenParams;", "artifact"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface ArtifactFullScreenParams {
    public static final a Companion = a.a;

    String getUuidValue();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0014\u0010&\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0015¨\u0006*"}, d2 = {"Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams$PublishedArtifactFullScreenParams;", "Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams;", "Lcom/anthropic/claude/types/strings/PublishedArtifactId;", "uuid", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$artifact", "(Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams$PublishedArtifactFullScreenParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-2-azyQ4", "()Ljava/lang/String;", "component1", "copy-ogoBLEc", "(Ljava/lang/String;)Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams$PublishedArtifactFullScreenParams;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid-2-azyQ4", "getUuidValue", "uuidValue", "Companion", "com/anthropic/claude/artifact/details/d", "com/anthropic/claude/artifact/details/e", "artifact"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class PublishedArtifactFullScreenParams implements ArtifactFullScreenParams {
        public static final int $stable = 0;
        public static final e Companion = new e();
        private final String uuid;

        private /* synthetic */ PublishedArtifactFullScreenParams(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.uuid = str;
            } else {
                gvj.f(i, 1, d.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-ogoBLEc$default, reason: not valid java name */
        public static /* synthetic */ PublishedArtifactFullScreenParams m519copyogoBLEc$default(PublishedArtifactFullScreenParams publishedArtifactFullScreenParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = publishedArtifactFullScreenParams.uuid;
            }
            return publishedArtifactFullScreenParams.m521copyogoBLEc(str);
        }

        /* JADX INFO: renamed from: component1-2-azyQ4, reason: not valid java name and from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* JADX INFO: renamed from: copy-ogoBLEc, reason: not valid java name */
        public final PublishedArtifactFullScreenParams m521copyogoBLEc(String uuid) {
            uuid.getClass();
            return new PublishedArtifactFullScreenParams(uuid, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PublishedArtifactFullScreenParams) && PublishedArtifactId.m1089equalsimpl0(this.uuid, ((PublishedArtifactFullScreenParams) other).uuid);
        }

        /* JADX INFO: renamed from: getUuid-2-azyQ4, reason: not valid java name */
        public final String m522getUuid2azyQ4() {
            return this.uuid;
        }

        @Override // com.anthropic.claude.artifact.details.ArtifactFullScreenParams
        public String getUuidValue() {
            return this.uuid;
        }

        public int hashCode() {
            return PublishedArtifactId.m1090hashCodeimpl(this.uuid);
        }

        public String toString() {
            return ij0.j("PublishedArtifactFullScreenParams(uuid=", PublishedArtifactId.m1091toStringimpl(this.uuid), ")");
        }

        public /* synthetic */ PublishedArtifactFullScreenParams(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ PublishedArtifactFullScreenParams(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private PublishedArtifactFullScreenParams(String str) {
            str.getClass();
            this.uuid = str;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0014\u0010&\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0015¨\u0006*"}, d2 = {"Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams$SharedArtifactFullScreenParams;", "Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams;", "Lcom/anthropic/claude/types/strings/ArtifactId;", "uuid", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$artifact", "(Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams$SharedArtifactFullScreenParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-QssJVS4", "()Ljava/lang/String;", "component1", "copy-86G_YiM", "(Ljava/lang/String;)Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams$SharedArtifactFullScreenParams;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid-QssJVS4", "getUuidValue", "uuidValue", "Companion", "com/anthropic/claude/artifact/details/f", "com/anthropic/claude/artifact/details/g", "artifact"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SharedArtifactFullScreenParams implements ArtifactFullScreenParams {
        public static final int $stable = 0;
        public static final g Companion = new g();
        private final String uuid;

        private /* synthetic */ SharedArtifactFullScreenParams(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.uuid = str;
            } else {
                gvj.f(i, 1, f.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-86G_YiM$default, reason: not valid java name */
        public static /* synthetic */ SharedArtifactFullScreenParams m523copy86G_YiM$default(SharedArtifactFullScreenParams sharedArtifactFullScreenParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sharedArtifactFullScreenParams.uuid;
            }
            return sharedArtifactFullScreenParams.m525copy86G_YiM(str);
        }

        /* JADX INFO: renamed from: component1-QssJVS4, reason: not valid java name and from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* JADX INFO: renamed from: copy-86G_YiM, reason: not valid java name */
        public final SharedArtifactFullScreenParams m525copy86G_YiM(String uuid) {
            uuid.getClass();
            return new SharedArtifactFullScreenParams(uuid, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SharedArtifactFullScreenParams) && ArtifactId.m960equalsimpl0(this.uuid, ((SharedArtifactFullScreenParams) other).uuid);
        }

        /* JADX INFO: renamed from: getUuid-QssJVS4, reason: not valid java name */
        public final String m526getUuidQssJVS4() {
            return this.uuid;
        }

        @Override // com.anthropic.claude.artifact.details.ArtifactFullScreenParams
        public String getUuidValue() {
            return this.uuid;
        }

        public int hashCode() {
            return ArtifactId.m961hashCodeimpl(this.uuid);
        }

        public String toString() {
            return ij0.j("SharedArtifactFullScreenParams(uuid=", ArtifactId.m962toStringimpl(this.uuid), ")");
        }

        public /* synthetic */ SharedArtifactFullScreenParams(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ SharedArtifactFullScreenParams(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private SharedArtifactFullScreenParams(String str) {
            str.getClass();
            this.uuid = str;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u00062"}, d2 = {"Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams$LoadedArtifactFullScreenParams;", "Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams;", "", "artifactUuid", "Lcom/anthropic/claude/types/strings/ChatId;", "chatId", "", "clearCacheOnDismiss", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$artifact", "(Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams$LoadedArtifactFullScreenParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2-RjYBDck", "component2", "component3", "()Z", "copy-JVZcPeU", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/artifact/details/ArtifactFullScreenParams$LoadedArtifactFullScreenParams;", "copy", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArtifactUuid", "getChatId-RjYBDck", "Z", "getClearCacheOnDismiss", "getUuidValue", "uuidValue", "Companion", "com/anthropic/claude/artifact/details/b", "com/anthropic/claude/artifact/details/c", "artifact"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class LoadedArtifactFullScreenParams implements ArtifactFullScreenParams {
        public static final int $stable = 0;
        public static final c Companion = new c();
        private final String artifactUuid;
        private final String chatId;
        private final boolean clearCacheOnDismiss;

        private /* synthetic */ LoadedArtifactFullScreenParams(int i, String str, String str2, boolean z, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, b.a.getDescriptor());
                throw null;
            }
            this.artifactUuid = str;
            this.chatId = str2;
            if ((i & 4) == 0) {
                this.clearCacheOnDismiss = false;
            } else {
                this.clearCacheOnDismiss = z;
            }
        }

        /* JADX INFO: renamed from: copy-JVZcPeU$default, reason: not valid java name */
        public static /* synthetic */ LoadedArtifactFullScreenParams m515copyJVZcPeU$default(LoadedArtifactFullScreenParams loadedArtifactFullScreenParams, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadedArtifactFullScreenParams.artifactUuid;
            }
            if ((i & 2) != 0) {
                str2 = loadedArtifactFullScreenParams.chatId;
            }
            if ((i & 4) != 0) {
                z = loadedArtifactFullScreenParams.clearCacheOnDismiss;
            }
            return loadedArtifactFullScreenParams.m517copyJVZcPeU(str, str2, z);
        }

        public static final /* synthetic */ void write$Self$artifact(LoadedArtifactFullScreenParams self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.artifactUuid);
            output.r(serialDesc, 1, vs2.a, ChatId.m978boximpl(self.chatId));
            if (output.E(serialDesc) || self.clearCacheOnDismiss) {
                output.p(serialDesc, 2, self.clearCacheOnDismiss);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getArtifactUuid() {
            return this.artifactUuid;
        }

        /* JADX INFO: renamed from: component2-RjYBDck, reason: not valid java name and from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getClearCacheOnDismiss() {
            return this.clearCacheOnDismiss;
        }

        /* JADX INFO: renamed from: copy-JVZcPeU, reason: not valid java name */
        public final LoadedArtifactFullScreenParams m517copyJVZcPeU(String artifactUuid, String chatId, boolean clearCacheOnDismiss) {
            artifactUuid.getClass();
            chatId.getClass();
            return new LoadedArtifactFullScreenParams(artifactUuid, chatId, clearCacheOnDismiss, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadedArtifactFullScreenParams)) {
                return false;
            }
            LoadedArtifactFullScreenParams loadedArtifactFullScreenParams = (LoadedArtifactFullScreenParams) other;
            return x44.r(this.artifactUuid, loadedArtifactFullScreenParams.artifactUuid) && ChatId.m981equalsimpl0(this.chatId, loadedArtifactFullScreenParams.chatId) && this.clearCacheOnDismiss == loadedArtifactFullScreenParams.clearCacheOnDismiss;
        }

        public final String getArtifactUuid() {
            return this.artifactUuid;
        }

        /* JADX INFO: renamed from: getChatId-RjYBDck, reason: not valid java name */
        public final String m518getChatIdRjYBDck() {
            return this.chatId;
        }

        public final boolean getClearCacheOnDismiss() {
            return this.clearCacheOnDismiss;
        }

        @Override // com.anthropic.claude.artifact.details.ArtifactFullScreenParams
        public String getUuidValue() {
            return this.artifactUuid;
        }

        public int hashCode() {
            return Boolean.hashCode(this.clearCacheOnDismiss) + ((ChatId.m982hashCodeimpl(this.chatId) + (this.artifactUuid.hashCode() * 31)) * 31);
        }

        public String toString() {
            String str = this.artifactUuid;
            String strM983toStringimpl = ChatId.m983toStringimpl(this.chatId);
            return sq6.v(")", kgh.r("LoadedArtifactFullScreenParams(artifactUuid=", str, ", chatId=", strM983toStringimpl, ", clearCacheOnDismiss="), this.clearCacheOnDismiss);
        }

        public /* synthetic */ LoadedArtifactFullScreenParams(String str, String str2, boolean z, mq5 mq5Var) {
            this(str, str2, z);
        }

        public /* synthetic */ LoadedArtifactFullScreenParams(int i, String str, String str2, boolean z, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, z, vnfVar);
        }

        private LoadedArtifactFullScreenParams(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.artifactUuid = str;
            this.chatId = str2;
            this.clearCacheOnDismiss = z;
        }

        public /* synthetic */ LoadedArtifactFullScreenParams(String str, String str2, boolean z, int i, mq5 mq5Var) {
            this(str, str2, (i & 4) != 0 ? false : z, null);
        }
    }
}
