package com.anthropic.claude.api.wiggle;

import com.anthropic.claude.types.strings.FileId;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.oi7;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wcd;
import defpackage.x44;
import defpackage.xcd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/wiggle/PrepareUploadResult;", "", "Lcom/anthropic/claude/types/strings/FileId;", "file_uuid", "", "filesystem_id", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/wiggle/PrepareUploadResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-ExWXDbg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy-GPt968s", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/wiggle/PrepareUploadResult;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFile_uuid-ExWXDbg", "getFilesystem_id", "getPath", "Companion", "wcd", "xcd", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PrepareUploadResult {
    public static final int $stable = 0;
    public static final xcd Companion = new xcd();
    private final String file_uuid;
    private final String filesystem_id;
    private final String path;

    private /* synthetic */ PrepareUploadResult(int i, String str, String str2, String str3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, wcd.a.getDescriptor());
            throw null;
        }
        this.file_uuid = str;
        this.filesystem_id = str2;
        this.path = str3;
    }

    /* JADX INFO: renamed from: copy-GPt968s$default, reason: not valid java name */
    public static /* synthetic */ PrepareUploadResult m457copyGPt968s$default(PrepareUploadResult prepareUploadResult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prepareUploadResult.file_uuid;
        }
        if ((i & 2) != 0) {
            str2 = prepareUploadResult.filesystem_id;
        }
        if ((i & 4) != 0) {
            str3 = prepareUploadResult.path;
        }
        return prepareUploadResult.m459copyGPt968s(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$api(PrepareUploadResult self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, oi7.a, FileId.m1014boximpl(self.file_uuid));
        output.q(serialDesc, 1, self.filesystem_id);
        output.q(serialDesc, 2, self.path);
    }

    /* JADX INFO: renamed from: component1-ExWXDbg, reason: not valid java name and from getter */
    public final String getFile_uuid() {
        return this.file_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilesystem_id() {
        return this.filesystem_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: copy-GPt968s, reason: not valid java name */
    public final PrepareUploadResult m459copyGPt968s(String file_uuid, String filesystem_id, String path) {
        file_uuid.getClass();
        filesystem_id.getClass();
        path.getClass();
        return new PrepareUploadResult(file_uuid, filesystem_id, path, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrepareUploadResult)) {
            return false;
        }
        PrepareUploadResult prepareUploadResult = (PrepareUploadResult) other;
        return FileId.m1017equalsimpl0(this.file_uuid, prepareUploadResult.file_uuid) && x44.r(this.filesystem_id, prepareUploadResult.filesystem_id) && x44.r(this.path, prepareUploadResult.path);
    }

    /* JADX INFO: renamed from: getFile_uuid-ExWXDbg, reason: not valid java name */
    public final String m460getFile_uuidExWXDbg() {
        return this.file_uuid;
    }

    public final String getFilesystem_id() {
        return this.filesystem_id;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.path.hashCode() + kgh.l(FileId.m1018hashCodeimpl(this.file_uuid) * 31, 31, this.filesystem_id);
    }

    public String toString() {
        String strM1019toStringimpl = FileId.m1019toStringimpl(this.file_uuid);
        String str = this.filesystem_id;
        return ij0.m(kgh.r("PrepareUploadResult(file_uuid=", strM1019toStringimpl, ", filesystem_id=", str, ", path="), this.path, ")");
    }

    private PrepareUploadResult(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.file_uuid = str;
        this.filesystem_id = str2;
        this.path = str3;
    }

    public /* synthetic */ PrepareUploadResult(String str, String str2, String str3, mq5 mq5Var) {
        this(str, str2, str3);
    }

    public /* synthetic */ PrepareUploadResult(int i, String str, String str2, String str3, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, vnfVar);
    }
}
