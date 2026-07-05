package com.anthropic.claude.project.knowledge;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.core.logging.EmptyDestination;
import defpackage.bga;
import defpackage.cc;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mgd;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/project/knowledge/ProjectKnowledgePreviewDestination;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "Dismissed", "Preview", "com/anthropic/claude/project/knowledge/h", "Lcom/anthropic/claude/project/knowledge/ProjectKnowledgePreviewDestination$Dismissed;", "Lcom/anthropic/claude/project/knowledge/ProjectKnowledgePreviewDestination$Preview;", "project"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface ProjectKnowledgePreviewDestination extends bga {
    public static final h Companion = h.a;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/project/knowledge/ProjectKnowledgePreviewDestination$Dismissed;", "Lcom/anthropic/claude/project/knowledge/ProjectKnowledgePreviewDestination;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "project", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Dismissed implements ProjectKnowledgePreviewDestination, EmptyDestination {
        public static final int $stable = 0;
        public static final Dismissed INSTANCE = new Dismissed();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new mgd(24));

        private Dismissed() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination.Dismissed", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Dismissed);
        }

        @Override // com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -245563732;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Dismissed";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0003\u0004)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/project/knowledge/ProjectKnowledgePreviewDestination$Preview;", "Lcom/anthropic/claude/project/knowledge/ProjectKnowledgePreviewDestination;", "", "fileId", "Lcom/anthropic/claude/project/knowledge/k;", VerifyResponse.AuthenticationState.DISCRIMINATOR, "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/project/knowledge/k;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/project/knowledge/k;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$project", "(Lcom/anthropic/claude/project/knowledge/ProjectKnowledgePreviewDestination$Preview;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/project/knowledge/k;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/project/knowledge/k;)Lcom/anthropic/claude/project/knowledge/ProjectKnowledgePreviewDestination$Preview;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileId", "Lcom/anthropic/claude/project/knowledge/k;", "getKind", "Companion", "com/anthropic/claude/project/knowledge/i", "com/anthropic/claude/project/knowledge/j", "project"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Preview implements ProjectKnowledgePreviewDestination {
        public static final int $stable = 0;
        private final String fileId;
        private final k kind;
        public static final j Companion = new j();
        private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new mgd(25))};

        public /* synthetic */ Preview(int i, String str, k kVar, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, i.a.getDescriptor());
                throw null;
            }
            this.fileId = str;
            this.kind = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_() {
            k[] kVarArrValues = k.values();
            kVarArrValues.getClass();
            return new lq6("com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination.Preview.Kind", (Enum[]) kVarArrValues);
        }

        public static /* synthetic */ Preview copy$default(Preview preview, String str, k kVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preview.fileId;
            }
            if ((i & 2) != 0) {
                kVar = preview.kind;
            }
            return preview.copy(str, kVar);
        }

        public static final /* synthetic */ void write$Self$project(Preview self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.q(serialDesc, 0, self.fileId);
            output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.kind);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFileId() {
            return this.fileId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final k getKind() {
            return this.kind;
        }

        public final Preview copy(String fileId, k kind) {
            fileId.getClass();
            kind.getClass();
            return new Preview(fileId, kind);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Preview)) {
                return false;
            }
            Preview preview = (Preview) other;
            return x44.r(this.fileId, preview.fileId) && this.kind == preview.kind;
        }

        @Override // com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getFileId() {
            return this.fileId;
        }

        public final k getKind() {
            return this.kind;
        }

        public int hashCode() {
            return this.kind.hashCode() + (this.fileId.hashCode() * 31);
        }

        public String toString() {
            return "Preview(fileId=" + this.fileId + ", kind=" + this.kind + ")";
        }

        public Preview(String str, k kVar) {
            str.getClass();
            kVar.getClass();
            this.fileId = str;
            this.kind = kVar;
        }
    }
}
