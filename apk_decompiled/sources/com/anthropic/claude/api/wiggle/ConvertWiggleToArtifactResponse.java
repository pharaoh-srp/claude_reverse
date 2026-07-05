package com.anthropic.claude.api.wiggle;

import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.PublishedArtifactId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.ir0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.swd;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.yq4;
import defpackage.zq4;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J0\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010\u0019¨\u0006/"}, d2 = {"Lcom/anthropic/claude/api/wiggle/ConvertWiggleToArtifactResponse;", "", "", "artifact_uuid", "Lcom/anthropic/claude/types/strings/ArtifactId;", "artifact_version_uuid", "Lcom/anthropic/claude/types/strings/PublishedArtifactId;", "published_artifact_uuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/wiggle/ConvertWiggleToArtifactResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2-QssJVS4", "component2", "component3-vF4hnP0", "component3", "copy-aXAAIpk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/wiggle/ConvertWiggleToArtifactResponse;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArtifact_uuid", "getArtifact_version_uuid-QssJVS4", "getPublished_artifact_uuid-vF4hnP0", "Companion", "yq4", "zq4", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConvertWiggleToArtifactResponse {
    public static final int $stable = 0;
    public static final zq4 Companion = new zq4();
    private final String artifact_uuid;
    private final String artifact_version_uuid;
    private final String published_artifact_uuid;

    private /* synthetic */ ConvertWiggleToArtifactResponse(int i, String str, String str2, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, yq4.a.getDescriptor());
            throw null;
        }
        this.artifact_uuid = str;
        this.artifact_version_uuid = str2;
        if ((i & 4) == 0) {
            this.published_artifact_uuid = null;
        } else {
            this.published_artifact_uuid = str3;
        }
    }

    /* JADX INFO: renamed from: copy-aXAAIpk$default, reason: not valid java name */
    public static /* synthetic */ ConvertWiggleToArtifactResponse m451copyaXAAIpk$default(ConvertWiggleToArtifactResponse convertWiggleToArtifactResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = convertWiggleToArtifactResponse.artifact_uuid;
        }
        if ((i & 2) != 0) {
            str2 = convertWiggleToArtifactResponse.artifact_version_uuid;
        }
        if ((i & 4) != 0) {
            str3 = convertWiggleToArtifactResponse.published_artifact_uuid;
        }
        return convertWiggleToArtifactResponse.m454copyaXAAIpk(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$api(ConvertWiggleToArtifactResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.artifact_uuid);
        output.r(serialDesc, 1, ir0.a, ArtifactId.m957boximpl(self.artifact_version_uuid));
        if (!output.E(serialDesc) && self.published_artifact_uuid == null) {
            return;
        }
        swd swdVar = swd.a;
        String str = self.published_artifact_uuid;
        output.B(serialDesc, 2, swdVar, str != null ? PublishedArtifactId.m1086boximpl(str) : null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getArtifact_uuid() {
        return this.artifact_uuid;
    }

    /* JADX INFO: renamed from: component2-QssJVS4, reason: not valid java name and from getter */
    public final String getArtifact_version_uuid() {
        return this.artifact_version_uuid;
    }

    /* JADX INFO: renamed from: component3-vF4hnP0, reason: not valid java name and from getter */
    public final String getPublished_artifact_uuid() {
        return this.published_artifact_uuid;
    }

    /* JADX INFO: renamed from: copy-aXAAIpk, reason: not valid java name */
    public final ConvertWiggleToArtifactResponse m454copyaXAAIpk(String artifact_uuid, String artifact_version_uuid, String published_artifact_uuid) {
        artifact_uuid.getClass();
        artifact_version_uuid.getClass();
        return new ConvertWiggleToArtifactResponse(artifact_uuid, artifact_version_uuid, published_artifact_uuid, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactResponse
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactResponse r5 = (com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactResponse) r5
            java.lang.String r1 = r4.artifact_uuid
            java.lang.String r3 = r5.artifact_uuid
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.artifact_version_uuid
            java.lang.String r3 = r5.artifact_version_uuid
            boolean r1 = com.anthropic.claude.types.strings.ArtifactId.m960equalsimpl0(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r4 = r4.published_artifact_uuid
            java.lang.String r5 = r5.published_artifact_uuid
            if (r4 != 0) goto L2e
            if (r5 != 0) goto L2c
            r4 = r0
            goto L35
        L2c:
            r4 = r2
            goto L35
        L2e:
            if (r5 != 0) goto L31
            goto L2c
        L31:
            boolean r4 = com.anthropic.claude.types.strings.PublishedArtifactId.m1089equalsimpl0(r4, r5)
        L35:
            if (r4 != 0) goto L38
            return r2
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactResponse.equals(java.lang.Object):boolean");
    }

    public final String getArtifact_uuid() {
        return this.artifact_uuid;
    }

    /* JADX INFO: renamed from: getArtifact_version_uuid-QssJVS4, reason: not valid java name */
    public final String m455getArtifact_version_uuidQssJVS4() {
        return this.artifact_version_uuid;
    }

    /* JADX INFO: renamed from: getPublished_artifact_uuid-vF4hnP0, reason: not valid java name */
    public final String m456getPublished_artifact_uuidvF4hnP0() {
        return this.published_artifact_uuid;
    }

    public int hashCode() {
        int iM961hashCodeimpl = (ArtifactId.m961hashCodeimpl(this.artifact_version_uuid) + (this.artifact_uuid.hashCode() * 31)) * 31;
        String str = this.published_artifact_uuid;
        return iM961hashCodeimpl + (str == null ? 0 : PublishedArtifactId.m1090hashCodeimpl(str));
    }

    public String toString() {
        String str = this.artifact_uuid;
        String strM962toStringimpl = ArtifactId.m962toStringimpl(this.artifact_version_uuid);
        String str2 = this.published_artifact_uuid;
        return ij0.m(kgh.r("ConvertWiggleToArtifactResponse(artifact_uuid=", str, ", artifact_version_uuid=", strM962toStringimpl, ", published_artifact_uuid="), str2 == null ? "null" : PublishedArtifactId.m1091toStringimpl(str2), ")");
    }

    public /* synthetic */ ConvertWiggleToArtifactResponse(String str, String str2, String str3, mq5 mq5Var) {
        this(str, str2, str3);
    }

    public /* synthetic */ ConvertWiggleToArtifactResponse(int i, String str, String str2, String str3, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, vnfVar);
    }

    private ConvertWiggleToArtifactResponse(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.artifact_uuid = str;
        this.artifact_version_uuid = str2;
        this.published_artifact_uuid = str3;
    }

    public /* synthetic */ ConvertWiggleToArtifactResponse(String str, String str2, String str3, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, null);
    }
}
