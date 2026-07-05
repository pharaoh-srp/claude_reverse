package com.anthropic.claude.api.wiggle;

import defpackage.ebh;
import defpackage.f7a;
import defpackage.fr4;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sq6;
import defpackage.srg;
import defpackage.u65;
import defpackage.v65;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zt1;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010!¨\u00065"}, d2 = {"Lcom/anthropic/claude/api/wiggle/CreateFileParams;", "", "", "filesystem_id", "path", "media_type", "", "", "metadata", "overwrite_existing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/wiggle/CreateFileParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)Lcom/anthropic/claude/api/wiggle/CreateFileParams;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFilesystem_id", "getPath", "getMedia_type", "Ljava/util/Map;", "getMetadata", "Z", "getOverwrite_existing", "Companion", "u65", "v65", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateFileParams {
    public static final int $stable = 0;
    private final String filesystem_id;
    private final String media_type;
    private final Map<String, Boolean> metadata;
    private final boolean overwrite_existing;
    private final String path;
    public static final v65 Companion = new v65();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new fr4(28)), null};

    public CreateFileParams(int i, String str, String str2, String str3, Map map, boolean z, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, u65.a.getDescriptor());
            throw null;
        }
        this.filesystem_id = str;
        this.path = str2;
        this.media_type = str3;
        if ((i & 8) == 0) {
            Map<String, Boolean> mapSingletonMap = Collections.singletonMap("wiggle_upload", Boolean.TRUE);
            mapSingletonMap.getClass();
            this.metadata = mapSingletonMap;
        } else {
            this.metadata = map;
        }
        if ((i & 16) == 0) {
            this.overwrite_existing = true;
        } else {
            this.overwrite_existing = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f7a(srg.a, zt1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateFileParams copy$default(CreateFileParams createFileParams, String str, String str2, String str3, Map map, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createFileParams.filesystem_id;
        }
        if ((i & 2) != 0) {
            str2 = createFileParams.path;
        }
        if ((i & 4) != 0) {
            str3 = createFileParams.media_type;
        }
        if ((i & 8) != 0) {
            map = createFileParams.metadata;
        }
        if ((i & 16) != 0) {
            z = createFileParams.overwrite_existing;
        }
        boolean z2 = z;
        String str4 = str3;
        return createFileParams.copy(str, str2, str4, map, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self$api(com.anthropic.claude.api.wiggle.CreateFileParams r5, defpackage.vd4 r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            kw9[] r0 = com.anthropic.claude.api.wiggle.CreateFileParams.$childSerializers
            r1 = 0
            java.lang.String r2 = r5.filesystem_id
            r6.q(r7, r1, r2)
            java.lang.String r1 = r5.path
            r2 = 1
            r6.q(r7, r2, r1)
            r1 = 2
            java.lang.String r3 = r5.media_type
            r6.q(r7, r1, r3)
            boolean r1 = r6.E(r7)
            if (r1 == 0) goto L1b
            goto L2e
        L1b:
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r5.metadata
            java.lang.String r3 = "wiggle_upload"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.util.Map r3 = java.util.Collections.singletonMap(r3, r4)
            r3.getClass()
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L3c
        L2e:
            r1 = 3
            r0 = r0[r1]
            java.lang.Object r0 = r0.getValue()
            znf r0 = (defpackage.znf) r0
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r5.metadata
            r6.r(r7, r1, r0, r3)
        L3c:
            boolean r0 = r6.E(r7)
            if (r0 == 0) goto L43
            goto L47
        L43:
            boolean r0 = r5.overwrite_existing
            if (r0 == r2) goto L4d
        L47:
            boolean r5 = r5.overwrite_existing
            r0 = 4
            r6.p(r7, r0, r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.wiggle.CreateFileParams.write$Self$api(com.anthropic.claude.api.wiggle.CreateFileParams, vd4, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFilesystem_id() {
        return this.filesystem_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMedia_type() {
        return this.media_type;
    }

    public final Map<String, Boolean> component4() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getOverwrite_existing() {
        return this.overwrite_existing;
    }

    public final CreateFileParams copy(String filesystem_id, String path, String media_type, Map<String, Boolean> metadata, boolean overwrite_existing) {
        filesystem_id.getClass();
        path.getClass();
        media_type.getClass();
        metadata.getClass();
        return new CreateFileParams(filesystem_id, path, media_type, metadata, overwrite_existing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateFileParams)) {
            return false;
        }
        CreateFileParams createFileParams = (CreateFileParams) other;
        return x44.r(this.filesystem_id, createFileParams.filesystem_id) && x44.r(this.path, createFileParams.path) && x44.r(this.media_type, createFileParams.media_type) && x44.r(this.metadata, createFileParams.metadata) && this.overwrite_existing == createFileParams.overwrite_existing;
    }

    public final String getFilesystem_id() {
        return this.filesystem_id;
    }

    public final String getMedia_type() {
        return this.media_type;
    }

    public final Map<String, Boolean> getMetadata() {
        return this.metadata;
    }

    public final boolean getOverwrite_existing() {
        return this.overwrite_existing;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return Boolean.hashCode(this.overwrite_existing) + ebh.g(kgh.l(kgh.l(this.filesystem_id.hashCode() * 31, 31, this.path), 31, this.media_type), 31, this.metadata);
    }

    public String toString() {
        String str = this.filesystem_id;
        String str2 = this.path;
        String str3 = this.media_type;
        Map<String, Boolean> map = this.metadata;
        boolean z = this.overwrite_existing;
        StringBuilder sbR = kgh.r("CreateFileParams(filesystem_id=", str, ", path=", str2, ", media_type=");
        sbR.append(str3);
        sbR.append(", metadata=");
        sbR.append(map);
        sbR.append(", overwrite_existing=");
        return sq6.v(")", sbR, z);
    }

    public CreateFileParams(String str, String str2, String str3, Map<String, Boolean> map, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        this.filesystem_id = str;
        this.path = str2;
        this.media_type = str3;
        this.metadata = map;
        this.overwrite_existing = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreateFileParams(String str, String str2, String str3, Map map, boolean z, int i, mq5 mq5Var) {
        if ((i & 8) != 0) {
            map = Collections.singletonMap("wiggle_upload", Boolean.TRUE);
            map.getClass();
        }
        this(str, str2, str3, map, (i & 16) != 0 ? true : z);
    }
}
