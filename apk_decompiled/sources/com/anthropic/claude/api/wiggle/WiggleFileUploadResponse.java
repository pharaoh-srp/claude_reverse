package com.anthropic.claude.api.wiggle;

import com.anthropic.claude.types.strings.FileId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.oi7;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xaj;
import defpackage.xka;
import defpackage.yaj;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JD\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b0\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00066"}, d2 = {"Lcom/anthropic/claude/api/wiggle/WiggleFileUploadResponse;", "", "", "path", "Lcom/anthropic/claude/types/strings/FileId;", "file_uuid", "file_name", "sanitized_name", "", "size_bytes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/wiggle/WiggleFileUploadResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2-ExWXDbg", "component2", "component3", "component4", "component5", "()Ljava/lang/Long;", "copy-ben-w4E", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/anthropic/claude/api/wiggle/WiggleFileUploadResponse;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getFile_uuid-ExWXDbg", "getFile_name", "getSanitized_name", "Ljava/lang/Long;", "getSize_bytes", "Companion", "xaj", "yaj", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class WiggleFileUploadResponse {
    public static final int $stable = 0;
    public static final yaj Companion = new yaj();
    private final String file_name;
    private final String file_uuid;
    private final String path;
    private final String sanitized_name;
    private final Long size_bytes;

    private /* synthetic */ WiggleFileUploadResponse(int i, String str, String str2, String str3, String str4, Long l, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, xaj.a.getDescriptor());
            throw null;
        }
        this.path = str;
        this.file_uuid = str2;
        this.file_name = str3;
        this.sanitized_name = str4;
        if ((i & 16) == 0) {
            this.size_bytes = null;
        } else {
            this.size_bytes = l;
        }
    }

    /* JADX INFO: renamed from: copy-ben-w4E$default, reason: not valid java name */
    public static /* synthetic */ WiggleFileUploadResponse m461copybenw4E$default(WiggleFileUploadResponse wiggleFileUploadResponse, String str, String str2, String str3, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wiggleFileUploadResponse.path;
        }
        if ((i & 2) != 0) {
            str2 = wiggleFileUploadResponse.file_uuid;
        }
        if ((i & 4) != 0) {
            str3 = wiggleFileUploadResponse.file_name;
        }
        if ((i & 8) != 0) {
            str4 = wiggleFileUploadResponse.sanitized_name;
        }
        if ((i & 16) != 0) {
            l = wiggleFileUploadResponse.size_bytes;
        }
        Long l2 = l;
        String str5 = str3;
        return wiggleFileUploadResponse.m463copybenw4E(str, str2, str5, str4, l2);
    }

    public static final /* synthetic */ void write$Self$api(WiggleFileUploadResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.path);
        output.r(serialDesc, 1, oi7.a, FileId.m1014boximpl(self.file_uuid));
        output.q(serialDesc, 2, self.file_name);
        output.q(serialDesc, 3, self.sanitized_name);
        if (!output.E(serialDesc) && self.size_bytes == null) {
            return;
        }
        output.B(serialDesc, 4, xka.a, self.size_bytes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2-ExWXDbg, reason: not valid java name and from getter */
    public final String getFile_uuid() {
        return this.file_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFile_name() {
        return this.file_name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSanitized_name() {
        return this.sanitized_name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getSize_bytes() {
        return this.size_bytes;
    }

    /* JADX INFO: renamed from: copy-ben-w4E, reason: not valid java name */
    public final WiggleFileUploadResponse m463copybenw4E(String path, String file_uuid, String file_name, String sanitized_name, Long size_bytes) {
        path.getClass();
        file_uuid.getClass();
        file_name.getClass();
        sanitized_name.getClass();
        return new WiggleFileUploadResponse(path, file_uuid, file_name, sanitized_name, size_bytes, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiggleFileUploadResponse)) {
            return false;
        }
        WiggleFileUploadResponse wiggleFileUploadResponse = (WiggleFileUploadResponse) other;
        return x44.r(this.path, wiggleFileUploadResponse.path) && FileId.m1017equalsimpl0(this.file_uuid, wiggleFileUploadResponse.file_uuid) && x44.r(this.file_name, wiggleFileUploadResponse.file_name) && x44.r(this.sanitized_name, wiggleFileUploadResponse.sanitized_name) && x44.r(this.size_bytes, wiggleFileUploadResponse.size_bytes);
    }

    public final String getFile_name() {
        return this.file_name;
    }

    /* JADX INFO: renamed from: getFile_uuid-ExWXDbg, reason: not valid java name */
    public final String m464getFile_uuidExWXDbg() {
        return this.file_uuid;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSanitized_name() {
        return this.sanitized_name;
    }

    public final Long getSize_bytes() {
        return this.size_bytes;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l((FileId.m1018hashCodeimpl(this.file_uuid) + (this.path.hashCode() * 31)) * 31, 31, this.file_name), 31, this.sanitized_name);
        Long l = this.size_bytes;
        return iL + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        String str = this.path;
        String strM1019toStringimpl = FileId.m1019toStringimpl(this.file_uuid);
        String str2 = this.file_name;
        String str3 = this.sanitized_name;
        Long l = this.size_bytes;
        StringBuilder sbR = kgh.r("WiggleFileUploadResponse(path=", str, ", file_uuid=", strM1019toStringimpl, ", file_name=");
        kgh.u(sbR, str2, ", sanitized_name=", str3, ", size_bytes=");
        sbR.append(l);
        sbR.append(")");
        return sbR.toString();
    }

    private WiggleFileUploadResponse(String str, String str2, String str3, String str4, Long l) {
        ij0.z(str, str2, str3, str4);
        this.path = str;
        this.file_uuid = str2;
        this.file_name = str3;
        this.sanitized_name = str4;
        this.size_bytes = l;
    }

    public /* synthetic */ WiggleFileUploadResponse(String str, String str2, String str3, String str4, Long l, mq5 mq5Var) {
        this(str, str2, str3, str4, l);
    }

    public /* synthetic */ WiggleFileUploadResponse(int i, String str, String str2, String str3, String str4, Long l, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, l, vnfVar);
    }

    public /* synthetic */ WiggleFileUploadResponse(String str, String str2, String str3, String str4, Long l, int i, mq5 mq5Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : l, null);
    }
}
