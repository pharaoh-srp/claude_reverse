package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.FileId;
import defpackage.bc9;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.oi7;
import defpackage.onf;
import defpackage.qeb;
import defpackage.reb;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@B\\\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001f\b\u0002\u0010\u000b\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011BW\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J'\u0010$\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)Ji\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001f\b\u0002\u0010\u000b\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b7\u0010!R.\u0010\u000b\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b:\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b;\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010)¨\u0006A"}, d2 = {"Lcom/anthropic/claude/api/chat/MessageBlobFile;", "Lcom/anthropic/claude/api/chat/MessageFile;", "Lcom/anthropic/claude/types/strings/FileId;", "file_uuid", "", "file_name", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "path", "sanitized_name", "", "size_bytes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/MessageBlobFile;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-ExWXDbg", "()Ljava/lang/String;", "component1", "component2", "component3", "()Ljava/util/Date;", "component4", "component5", "component6", "()Ljava/lang/Long;", "copy-sbUwcGQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/anthropic/claude/api/chat/MessageBlobFile;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFile_uuid-ExWXDbg", "getFile_name", "Ljava/util/Date;", "getCreated_at", "getPath", "getSanitized_name", "Ljava/lang/Long;", "getSize_bytes", "Companion", "qeb", "reb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageBlobFile implements MessageFile {
    public static final int $stable = 0;
    public static final reb Companion = new reb();
    private final Date created_at;
    private final String file_name;
    private final String file_uuid;
    private final String path;
    private final String sanitized_name;
    private final Long size_bytes;

    private /* synthetic */ MessageBlobFile(int i, String str, String str2, Date date, String str3, String str4, Long l, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, qeb.a.getDescriptor());
            throw null;
        }
        this.file_uuid = str;
        this.file_name = str2;
        if ((i & 4) == 0) {
            this.created_at = null;
        } else {
            this.created_at = date;
        }
        if ((i & 8) == 0) {
            this.path = null;
        } else {
            this.path = str3;
        }
        if ((i & 16) == 0) {
            this.sanitized_name = null;
        } else {
            this.sanitized_name = str4;
        }
        if ((i & 32) == 0) {
            this.size_bytes = null;
        } else {
            this.size_bytes = l;
        }
    }

    /* JADX INFO: renamed from: copy-sbUwcGQ$default, reason: not valid java name */
    public static /* synthetic */ MessageBlobFile m233copysbUwcGQ$default(MessageBlobFile messageBlobFile, String str, String str2, Date date, String str3, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageBlobFile.file_uuid;
        }
        if ((i & 2) != 0) {
            str2 = messageBlobFile.file_name;
        }
        if ((i & 4) != 0) {
            date = messageBlobFile.created_at;
        }
        if ((i & 8) != 0) {
            str3 = messageBlobFile.path;
        }
        if ((i & 16) != 0) {
            str4 = messageBlobFile.sanitized_name;
        }
        if ((i & 32) != 0) {
            l = messageBlobFile.size_bytes;
        }
        String str5 = str4;
        Long l2 = l;
        return messageBlobFile.m235copysbUwcGQ(str, str2, date, str3, str5, l2);
    }

    public static final /* synthetic */ void write$Self$api(MessageBlobFile self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, oi7.a, FileId.m1014boximpl(self.mo236getFile_uuidExWXDbg()));
        output.q(serialDesc, 1, self.file_name);
        if (output.E(serialDesc) || self.created_at != null) {
            output.B(serialDesc, 2, bc9.a, self.created_at);
        }
        if (output.E(serialDesc) || self.path != null) {
            output.B(serialDesc, 3, srg.a, self.path);
        }
        if (output.E(serialDesc) || self.sanitized_name != null) {
            output.B(serialDesc, 4, srg.a, self.sanitized_name);
        }
        if (!output.E(serialDesc) && self.size_bytes == null) {
            return;
        }
        output.B(serialDesc, 5, xka.a, self.size_bytes);
    }

    /* JADX INFO: renamed from: component1-ExWXDbg, reason: not valid java name and from getter */
    public final String getFile_uuid() {
        return this.file_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFile_name() {
        return this.file_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSanitized_name() {
        return this.sanitized_name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getSize_bytes() {
        return this.size_bytes;
    }

    /* JADX INFO: renamed from: copy-sbUwcGQ, reason: not valid java name */
    public final MessageBlobFile m235copysbUwcGQ(String file_uuid, String file_name, Date created_at, String path, String sanitized_name, Long size_bytes) {
        file_uuid.getClass();
        file_name.getClass();
        return new MessageBlobFile(file_uuid, file_name, created_at, path, sanitized_name, size_bytes, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageBlobFile)) {
            return false;
        }
        MessageBlobFile messageBlobFile = (MessageBlobFile) other;
        return FileId.m1017equalsimpl0(this.file_uuid, messageBlobFile.file_uuid) && x44.r(this.file_name, messageBlobFile.file_name) && x44.r(this.created_at, messageBlobFile.created_at) && x44.r(this.path, messageBlobFile.path) && x44.r(this.sanitized_name, messageBlobFile.sanitized_name) && x44.r(this.size_bytes, messageBlobFile.size_bytes);
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    @Override // com.anthropic.claude.api.chat.MessageFile
    /* JADX INFO: renamed from: getFile_uuid-ExWXDbg, reason: not valid java name */
    public String mo236getFile_uuidExWXDbg() {
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
        int iL = kgh.l(FileId.m1018hashCodeimpl(this.file_uuid) * 31, 31, this.file_name);
        Date date = this.created_at;
        int iHashCode = (iL + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.path;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sanitized_name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.size_bytes;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String strM1019toStringimpl = FileId.m1019toStringimpl(this.file_uuid);
        String str = this.file_name;
        Date date = this.created_at;
        String str2 = this.path;
        String str3 = this.sanitized_name;
        Long l = this.size_bytes;
        StringBuilder sbR = kgh.r("MessageBlobFile(file_uuid=", strM1019toStringimpl, ", file_name=", str, ", created_at=");
        sbR.append(date);
        sbR.append(", path=");
        sbR.append(str2);
        sbR.append(", sanitized_name=");
        sbR.append(str3);
        sbR.append(", size_bytes=");
        sbR.append(l);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ MessageBlobFile(String str, String str2, Date date, String str3, String str4, Long l, mq5 mq5Var) {
        this(str, str2, date, str3, str4, l);
    }

    public /* synthetic */ MessageBlobFile(int i, String str, String str2, Date date, String str3, String str4, Long l, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, date, str3, str4, l, vnfVar);
    }

    private MessageBlobFile(String str, String str2, Date date, String str3, String str4, Long l) {
        str.getClass();
        str2.getClass();
        this.file_uuid = str;
        this.file_name = str2;
        this.created_at = date;
        this.path = str3;
        this.sanitized_name = str4;
        this.size_bytes = l;
    }

    public /* synthetic */ MessageBlobFile(String str, String str2, Date date, String str3, String str4, Long l, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, null);
    }
}
