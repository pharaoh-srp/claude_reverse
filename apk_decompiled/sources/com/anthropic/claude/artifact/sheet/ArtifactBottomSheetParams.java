package com.anthropic.claude.artifact.sheet;

import com.anthropic.claude.artifact.model.WiggleArtifactIdentifier;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import defpackage.b5;
import defpackage.fq0;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.jce;
import defpackage.kaj;
import defpackage.kce;
import defpackage.kr0;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.odf;
import defpackage.onf;
import defpackage.pl9;
import defpackage.sq6;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001b\u001c\u001dB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0001\u0002\u001e\u001f¨\u0006 "}, d2 = {"Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams;", "", "<init>", "()V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getIdentifier", "()Ljava/lang/Object;", "identifier", "", "isShareEnabled", "()Z", "getVersionIndex", "()I", "versionIndex", "Companion", "InMessageArtifact", "WiggleFileArtifact", "fq0", "Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams$InMessageArtifact;", "Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams$WiggleFileArtifact;", "artifact"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public abstract class ArtifactBottomSheetParams {
    public static final int $stable = 0;
    public static final fq0 Companion = new fq0();
    private static final kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new b5(26));

    public /* synthetic */ ArtifactBottomSheetParams(mq5 mq5Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams", kceVar.b(ArtifactBottomSheetParams.class), new pl9[]{kceVar.b(InMessageArtifact.class), kceVar.b(WiggleFileArtifact.class)}, new KSerializer[]{b.a, d.a}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(ArtifactBottomSheetParams self, vd4 output, SerialDescriptor serialDesc) {
    }

    public abstract Object getIdentifier();

    public abstract int getVersionIndex();

    public abstract boolean isShareEnabled();

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b\u0005\u0010\u001aR\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010!¨\u0006."}, d2 = {"Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams$WiggleFileArtifact;", "Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams;", "Lcom/anthropic/claude/artifact/model/WiggleArtifactIdentifier;", "identifier", "", "isShareEnabled", "<init>", "(Lcom/anthropic/claude/artifact/model/WiggleArtifactIdentifier;Z)V", "", "seen0", "versionIndex", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/artifact/model/WiggleArtifactIdentifier;ZILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$artifact", "(Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams$WiggleFileArtifact;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/artifact/model/WiggleArtifactIdentifier;", "component2", "()Z", "copy", "(Lcom/anthropic/claude/artifact/model/WiggleArtifactIdentifier;Z)Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams$WiggleFileArtifact;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/artifact/model/WiggleArtifactIdentifier;", "getIdentifier", "Z", "I", "getVersionIndex", "Companion", "com/anthropic/claude/artifact/sheet/d", "com/anthropic/claude/artifact/sheet/e", "artifact"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class WiggleFileArtifact extends ArtifactBottomSheetParams {
        public static final int $stable = 0;
        public static final e Companion = new e();
        private final WiggleArtifactIdentifier identifier;
        private final boolean isShareEnabled;
        private final int versionIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WiggleFileArtifact(int i, WiggleArtifactIdentifier wiggleArtifactIdentifier, boolean z, int i2, vnf vnfVar) {
            super(i, vnfVar);
            if (1 != (i & 1)) {
                gvj.f(i, 1, d.a.getDescriptor());
                throw null;
            }
            this.identifier = wiggleArtifactIdentifier;
            if ((i & 2) == 0) {
                this.isShareEnabled = true;
            } else {
                this.isShareEnabled = z;
            }
            if ((i & 4) == 0) {
                this.versionIndex = 0;
            } else {
                this.versionIndex = i2;
            }
        }

        public static /* synthetic */ WiggleFileArtifact copy$default(WiggleFileArtifact wiggleFileArtifact, WiggleArtifactIdentifier wiggleArtifactIdentifier, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                wiggleArtifactIdentifier = wiggleFileArtifact.identifier;
            }
            if ((i & 2) != 0) {
                z = wiggleFileArtifact.isShareEnabled;
            }
            return wiggleFileArtifact.copy(wiggleArtifactIdentifier, z);
        }

        public static final /* synthetic */ void write$Self$artifact(WiggleFileArtifact self, vd4 output, SerialDescriptor serialDesc) {
            ArtifactBottomSheetParams.write$Self(self, output, serialDesc);
            output.r(serialDesc, 0, kaj.a, self.getIdentifier());
            if (output.E(serialDesc) || !self.isShareEnabled()) {
                output.p(serialDesc, 1, self.isShareEnabled());
            }
            if (!output.E(serialDesc) && self.getVersionIndex() == 0) {
                return;
            }
            output.l(2, self.getVersionIndex(), serialDesc);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final WiggleArtifactIdentifier getIdentifier() {
            return this.identifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsShareEnabled() {
            return this.isShareEnabled;
        }

        public final WiggleFileArtifact copy(WiggleArtifactIdentifier identifier, boolean isShareEnabled) {
            identifier.getClass();
            return new WiggleFileArtifact(identifier, isShareEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WiggleFileArtifact)) {
                return false;
            }
            WiggleFileArtifact wiggleFileArtifact = (WiggleFileArtifact) other;
            return x44.r(this.identifier, wiggleFileArtifact.identifier) && this.isShareEnabled == wiggleFileArtifact.isShareEnabled;
        }

        @Override // com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams
        public int getVersionIndex() {
            return this.versionIndex;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isShareEnabled) + (this.identifier.hashCode() * 31);
        }

        @Override // com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams
        public boolean isShareEnabled() {
            return this.isShareEnabled;
        }

        public String toString() {
            return "WiggleFileArtifact(identifier=" + this.identifier + ", isShareEnabled=" + this.isShareEnabled + ")";
        }

        @Override // com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams
        public WiggleArtifactIdentifier getIdentifier() {
            return this.identifier;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WiggleFileArtifact(WiggleArtifactIdentifier wiggleArtifactIdentifier, boolean z) {
            super(null);
            wiggleArtifactIdentifier.getClass();
            this.identifier = wiggleArtifactIdentifier;
            this.isShareEnabled = z;
        }

        public /* synthetic */ WiggleFileArtifact(WiggleArtifactIdentifier wiggleArtifactIdentifier, boolean z, int i, mq5 mq5Var) {
            this(wiggleArtifactIdentifier, (i & 2) != 0 ? true : z);
        }
    }

    private ArtifactBottomSheetParams() {
    }

    public /* synthetic */ ArtifactBottomSheetParams(int i, vnf vnfVar) {
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b\u0007\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams$InMessageArtifact;", "Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams;", "Lcom/anthropic/claude/types/strings/ArtifactIdentifier;", "identifier", "", "versionIndex", "", "isShareEnabled", "<init>", "(Ljava/lang/String;IZLmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;IZLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$artifact", "(Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams$InMessageArtifact;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-eX_QYXY", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "()Z", "copy-SwawSm0", "(Ljava/lang/String;IZ)Lcom/anthropic/claude/artifact/sheet/ArtifactBottomSheetParams$InMessageArtifact;", "copy", "", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier-eX_QYXY", "I", "getVersionIndex", "Z", "Companion", "com/anthropic/claude/artifact/sheet/b", "com/anthropic/claude/artifact/sheet/c", "artifact"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class InMessageArtifact extends ArtifactBottomSheetParams {
        public static final int $stable = 0;
        public static final c Companion = new c();
        private final String identifier;
        private final boolean isShareEnabled;
        private final int versionIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private /* synthetic */ InMessageArtifact(int i, String str, int i2, boolean z, vnf vnfVar) {
            super(i, vnfVar);
            if (3 != (i & 3)) {
                gvj.f(i, 3, b.a.getDescriptor());
                throw null;
            }
            this.identifier = str;
            this.versionIndex = i2;
            if ((i & 4) == 0) {
                this.isShareEnabled = true;
            } else {
                this.isShareEnabled = z;
            }
        }

        /* JADX INFO: renamed from: copy-SwawSm0$default, reason: not valid java name */
        public static /* synthetic */ InMessageArtifact m543copySwawSm0$default(InMessageArtifact inMessageArtifact, String str, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = inMessageArtifact.identifier;
            }
            if ((i2 & 2) != 0) {
                i = inMessageArtifact.versionIndex;
            }
            if ((i2 & 4) != 0) {
                z = inMessageArtifact.isShareEnabled;
            }
            return inMessageArtifact.m545copySwawSm0(str, i, z);
        }

        public static final /* synthetic */ void write$Self$artifact(InMessageArtifact self, vd4 output, SerialDescriptor serialDesc) {
            ArtifactBottomSheetParams.write$Self(self, output, serialDesc);
            output.r(serialDesc, 0, kr0.a, ArtifactIdentifier.m964boximpl(self.m546getIdentifiereX_QYXY()));
            output.l(1, self.getVersionIndex(), serialDesc);
            if (!output.E(serialDesc) && self.isShareEnabled()) {
                return;
            }
            output.p(serialDesc, 2, self.isShareEnabled());
        }

        /* JADX INFO: renamed from: component1-eX_QYXY, reason: not valid java name and from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getVersionIndex() {
            return this.versionIndex;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsShareEnabled() {
            return this.isShareEnabled;
        }

        /* JADX INFO: renamed from: copy-SwawSm0, reason: not valid java name */
        public final InMessageArtifact m545copySwawSm0(String identifier, int versionIndex, boolean isShareEnabled) {
            identifier.getClass();
            return new InMessageArtifact(identifier, versionIndex, isShareEnabled, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InMessageArtifact)) {
                return false;
            }
            InMessageArtifact inMessageArtifact = (InMessageArtifact) other;
            return ArtifactIdentifier.m967equalsimpl0(this.identifier, inMessageArtifact.identifier) && this.versionIndex == inMessageArtifact.versionIndex && this.isShareEnabled == inMessageArtifact.isShareEnabled;
        }

        @Override // com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams
        public /* bridge */ /* synthetic */ Object getIdentifier() {
            return ArtifactIdentifier.m964boximpl(m546getIdentifiereX_QYXY());
        }

        /* JADX INFO: renamed from: getIdentifier-eX_QYXY, reason: not valid java name */
        public String m546getIdentifiereX_QYXY() {
            return this.identifier;
        }

        @Override // com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams
        public int getVersionIndex() {
            return this.versionIndex;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isShareEnabled) + vb7.c(this.versionIndex, ArtifactIdentifier.m968hashCodeimpl(this.identifier) * 31, 31);
        }

        @Override // com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams
        public boolean isShareEnabled() {
            return this.isShareEnabled;
        }

        public String toString() {
            String strM969toStringimpl = ArtifactIdentifier.m969toStringimpl(this.identifier);
            int i = this.versionIndex;
            return sq6.v(")", ij0.p("InMessageArtifact(identifier=", strM969toStringimpl, i, ", versionIndex=", ", isShareEnabled="), this.isShareEnabled);
        }

        public /* synthetic */ InMessageArtifact(String str, int i, boolean z, mq5 mq5Var) {
            this(str, i, z);
        }

        public /* synthetic */ InMessageArtifact(int i, String str, int i2, boolean z, vnf vnfVar, mq5 mq5Var) {
            this(i, str, i2, z, vnfVar);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private InMessageArtifact(String str, int i, boolean z) {
            super(null);
            str.getClass();
            this.identifier = str;
            this.versionIndex = i;
            this.isShareEnabled = z;
        }

        public /* synthetic */ InMessageArtifact(String str, int i, boolean z, int i2, mq5 mq5Var) {
            this(str, i, (i2 & 4) != 0 ? true : z, null);
        }
    }
}
