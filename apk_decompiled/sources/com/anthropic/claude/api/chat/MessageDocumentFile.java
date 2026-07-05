package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.FileId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.ghb;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.oi7;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wfb;
import defpackage.x44;
import defpackage.xka;
import defpackage.yfb;
import defpackage.zfb;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLBl\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001f\b\u0002\u0010\u000f\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bk\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0012\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b0\u00101J}\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001f\b\u0002\u0010\u000f\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u0010%J\u0010\u00106\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b?\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010+R.\u0010\u000f\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bF\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\bG\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u00101¨\u0006M"}, d2 = {"Lcom/anthropic/claude/api/chat/MessageDocumentFile;", "Lcom/anthropic/claude/api/chat/MessageFile;", "Lcom/anthropic/claude/types/strings/FileId;", "file_uuid", "", "file_name", "Lcom/anthropic/claude/api/chat/MessageImageAsset;", "thumbnail_asset", "Lcom/anthropic/claude/api/chat/MessageDocumentAsset;", "document_asset", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "path", "sanitized_name", "", "size_bytes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/MessageImageAsset;Lcom/anthropic/claude/api/chat/MessageDocumentAsset;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/MessageImageAsset;Lcom/anthropic/claude/api/chat/MessageDocumentAsset;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/MessageDocumentFile;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-ExWXDbg", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/anthropic/claude/api/chat/MessageImageAsset;", "component4", "()Lcom/anthropic/claude/api/chat/MessageDocumentAsset;", "component5", "()Ljava/util/Date;", "component6", "component7", "component8", "()Ljava/lang/Long;", "copy-PjSl_mY", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/MessageImageAsset;Lcom/anthropic/claude/api/chat/MessageDocumentAsset;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/anthropic/claude/api/chat/MessageDocumentFile;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFile_uuid-ExWXDbg", "getFile_name", "Lcom/anthropic/claude/api/chat/MessageImageAsset;", "getThumbnail_asset", "Lcom/anthropic/claude/api/chat/MessageDocumentAsset;", "getDocument_asset", "Ljava/util/Date;", "getCreated_at", "getPath", "getSanitized_name", "Ljava/lang/Long;", "getSize_bytes", "Companion", "yfb", "zfb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageDocumentFile implements MessageFile {
    public static final int $stable = 0;
    public static final zfb Companion = new zfb();
    private final Date created_at;
    private final MessageDocumentAsset document_asset;
    private final String file_name;
    private final String file_uuid;
    private final String path;
    private final String sanitized_name;
    private final Long size_bytes;
    private final MessageImageAsset thumbnail_asset;

    private /* synthetic */ MessageDocumentFile(int i, String str, String str2, MessageImageAsset messageImageAsset, MessageDocumentAsset messageDocumentAsset, Date date, String str3, String str4, Long l, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, yfb.a.getDescriptor());
            throw null;
        }
        this.file_uuid = str;
        this.file_name = str2;
        this.thumbnail_asset = messageImageAsset;
        this.document_asset = messageDocumentAsset;
        if ((i & 16) == 0) {
            this.created_at = null;
        } else {
            this.created_at = date;
        }
        if ((i & 32) == 0) {
            this.path = null;
        } else {
            this.path = str3;
        }
        if ((i & 64) == 0) {
            this.sanitized_name = null;
        } else {
            this.sanitized_name = str4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.size_bytes = null;
        } else {
            this.size_bytes = l;
        }
    }

    /* JADX INFO: renamed from: copy-PjSl_mY$default, reason: not valid java name */
    public static /* synthetic */ MessageDocumentFile m237copyPjSl_mY$default(MessageDocumentFile messageDocumentFile, String str, String str2, MessageImageAsset messageImageAsset, MessageDocumentAsset messageDocumentAsset, Date date, String str3, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageDocumentFile.file_uuid;
        }
        if ((i & 2) != 0) {
            str2 = messageDocumentFile.file_name;
        }
        if ((i & 4) != 0) {
            messageImageAsset = messageDocumentFile.thumbnail_asset;
        }
        if ((i & 8) != 0) {
            messageDocumentAsset = messageDocumentFile.document_asset;
        }
        if ((i & 16) != 0) {
            date = messageDocumentFile.created_at;
        }
        if ((i & 32) != 0) {
            str3 = messageDocumentFile.path;
        }
        if ((i & 64) != 0) {
            str4 = messageDocumentFile.sanitized_name;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            l = messageDocumentFile.size_bytes;
        }
        String str5 = str4;
        Long l2 = l;
        Date date2 = date;
        String str6 = str3;
        return messageDocumentFile.m239copyPjSl_mY(str, str2, messageImageAsset, messageDocumentAsset, date2, str6, str5, l2);
    }

    public static final /* synthetic */ void write$Self$api(MessageDocumentFile self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, oi7.a, FileId.m1014boximpl(self.mo236getFile_uuidExWXDbg()));
        output.q(serialDesc, 1, self.file_name);
        output.r(serialDesc, 2, ghb.a, self.thumbnail_asset);
        output.r(serialDesc, 3, wfb.a, self.document_asset);
        if (output.E(serialDesc) || self.created_at != null) {
            output.B(serialDesc, 4, bc9.a, self.created_at);
        }
        if (output.E(serialDesc) || self.path != null) {
            output.B(serialDesc, 5, srg.a, self.path);
        }
        if (output.E(serialDesc) || self.sanitized_name != null) {
            output.B(serialDesc, 6, srg.a, self.sanitized_name);
        }
        if (!output.E(serialDesc) && self.size_bytes == null) {
            return;
        }
        output.B(serialDesc, 7, xka.a, self.size_bytes);
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
    public final MessageImageAsset getThumbnail_asset() {
        return this.thumbnail_asset;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MessageDocumentAsset getDocument_asset() {
        return this.document_asset;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSanitized_name() {
        return this.sanitized_name;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getSize_bytes() {
        return this.size_bytes;
    }

    /* JADX INFO: renamed from: copy-PjSl_mY, reason: not valid java name */
    public final MessageDocumentFile m239copyPjSl_mY(String file_uuid, String file_name, MessageImageAsset thumbnail_asset, MessageDocumentAsset document_asset, Date created_at, String path, String sanitized_name, Long size_bytes) {
        file_uuid.getClass();
        file_name.getClass();
        thumbnail_asset.getClass();
        document_asset.getClass();
        return new MessageDocumentFile(file_uuid, file_name, thumbnail_asset, document_asset, created_at, path, sanitized_name, size_bytes, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageDocumentFile)) {
            return false;
        }
        MessageDocumentFile messageDocumentFile = (MessageDocumentFile) other;
        return FileId.m1017equalsimpl0(this.file_uuid, messageDocumentFile.file_uuid) && x44.r(this.file_name, messageDocumentFile.file_name) && x44.r(this.thumbnail_asset, messageDocumentFile.thumbnail_asset) && x44.r(this.document_asset, messageDocumentFile.document_asset) && x44.r(this.created_at, messageDocumentFile.created_at) && x44.r(this.path, messageDocumentFile.path) && x44.r(this.sanitized_name, messageDocumentFile.sanitized_name) && x44.r(this.size_bytes, messageDocumentFile.size_bytes);
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final MessageDocumentAsset getDocument_asset() {
        return this.document_asset;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    @Override // com.anthropic.claude.api.chat.MessageFile
    /* JADX INFO: renamed from: getFile_uuid-ExWXDbg */
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

    public final MessageImageAsset getThumbnail_asset() {
        return this.thumbnail_asset;
    }

    public int hashCode() {
        int iHashCode = (this.document_asset.hashCode() + ((this.thumbnail_asset.hashCode() + kgh.l(FileId.m1018hashCodeimpl(this.file_uuid) * 31, 31, this.file_name)) * 31)) * 31;
        Date date = this.created_at;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.path;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sanitized_name;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.size_bytes;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String strM1019toStringimpl = FileId.m1019toStringimpl(this.file_uuid);
        String str = this.file_name;
        MessageImageAsset messageImageAsset = this.thumbnail_asset;
        MessageDocumentAsset messageDocumentAsset = this.document_asset;
        Date date = this.created_at;
        String str2 = this.path;
        String str3 = this.sanitized_name;
        Long l = this.size_bytes;
        StringBuilder sbR = kgh.r("MessageDocumentFile(file_uuid=", strM1019toStringimpl, ", file_name=", str, ", thumbnail_asset=");
        sbR.append(messageImageAsset);
        sbR.append(", document_asset=");
        sbR.append(messageDocumentAsset);
        sbR.append(", created_at=");
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

    public /* synthetic */ MessageDocumentFile(String str, String str2, MessageImageAsset messageImageAsset, MessageDocumentAsset messageDocumentAsset, Date date, String str3, String str4, Long l, mq5 mq5Var) {
        this(str, str2, messageImageAsset, messageDocumentAsset, date, str3, str4, l);
    }

    public /* synthetic */ MessageDocumentFile(int i, String str, String str2, MessageImageAsset messageImageAsset, MessageDocumentAsset messageDocumentAsset, Date date, String str3, String str4, Long l, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, messageImageAsset, messageDocumentAsset, date, str3, str4, l, vnfVar);
    }

    private MessageDocumentFile(String str, String str2, MessageImageAsset messageImageAsset, MessageDocumentAsset messageDocumentAsset, Date date, String str3, String str4, Long l) {
        str.getClass();
        str2.getClass();
        messageImageAsset.getClass();
        messageDocumentAsset.getClass();
        this.file_uuid = str;
        this.file_name = str2;
        this.thumbnail_asset = messageImageAsset;
        this.document_asset = messageDocumentAsset;
        this.created_at = date;
        this.path = str3;
        this.sanitized_name = str4;
        this.size_bytes = l;
    }

    public /* synthetic */ MessageDocumentFile(String str, String str2, MessageImageAsset messageImageAsset, MessageDocumentAsset messageDocumentAsset, Date date, String str3, String str4, Long l, int i, mq5 mq5Var) {
        this(str, str2, messageImageAsset, messageDocumentAsset, (i & 16) != 0 ? null : date, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : l, null);
    }
}
