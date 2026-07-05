package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.FileId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.ghb;
import defpackage.gvj;
import defpackage.ihb;
import defpackage.jhb;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.oi7;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HIBp\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u001f\b\u0002\u0010\u000e\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Bk\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010(J'\u0010*\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010$J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010$J\u0012\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/J\u007f\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u001f\b\u0002\u0010\u000e\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u0010$J\u0010\u00104\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b=\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b@\u0010(R.\u0010\u000e\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bC\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bD\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010/¨\u0006J"}, d2 = {"Lcom/anthropic/claude/api/chat/MessageImageFile;", "Lcom/anthropic/claude/api/chat/MessageFile;", "Lcom/anthropic/claude/types/strings/FileId;", "file_uuid", "", "file_name", "Lcom/anthropic/claude/api/chat/MessageImageAsset;", "thumbnail_asset", "preview_asset", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "path", "sanitized_name", "", "size_bytes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/MessageImageAsset;Lcom/anthropic/claude/api/chat/MessageImageAsset;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/MessageImageAsset;Lcom/anthropic/claude/api/chat/MessageImageAsset;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/MessageImageFile;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-ExWXDbg", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/anthropic/claude/api/chat/MessageImageAsset;", "component4", "component5", "()Ljava/util/Date;", "component6", "component7", "component8", "()Ljava/lang/Long;", "copy-PjSl_mY", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/MessageImageAsset;Lcom/anthropic/claude/api/chat/MessageImageAsset;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/anthropic/claude/api/chat/MessageImageFile;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFile_uuid-ExWXDbg", "getFile_name", "Lcom/anthropic/claude/api/chat/MessageImageAsset;", "getThumbnail_asset", "getPreview_asset", "Ljava/util/Date;", "getCreated_at", "getPath", "getSanitized_name", "Ljava/lang/Long;", "getSize_bytes", "Companion", "ihb", "jhb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageImageFile implements MessageFile {
    public static final int $stable = 0;
    public static final jhb Companion = new jhb();
    private final Date created_at;
    private final String file_name;
    private final String file_uuid;
    private final String path;
    private final MessageImageAsset preview_asset;
    private final String sanitized_name;
    private final Long size_bytes;
    private final MessageImageAsset thumbnail_asset;

    private /* synthetic */ MessageImageFile(int i, String str, String str2, MessageImageAsset messageImageAsset, MessageImageAsset messageImageAsset2, Date date, String str3, String str4, Long l, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, ihb.a.getDescriptor());
            throw null;
        }
        this.file_uuid = str;
        this.file_name = str2;
        this.thumbnail_asset = messageImageAsset;
        if ((i & 8) == 0) {
            this.preview_asset = null;
        } else {
            this.preview_asset = messageImageAsset2;
        }
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
    public static /* synthetic */ MessageImageFile m244copyPjSl_mY$default(MessageImageFile messageImageFile, String str, String str2, MessageImageAsset messageImageAsset, MessageImageAsset messageImageAsset2, Date date, String str3, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageImageFile.file_uuid;
        }
        if ((i & 2) != 0) {
            str2 = messageImageFile.file_name;
        }
        if ((i & 4) != 0) {
            messageImageAsset = messageImageFile.thumbnail_asset;
        }
        if ((i & 8) != 0) {
            messageImageAsset2 = messageImageFile.preview_asset;
        }
        if ((i & 16) != 0) {
            date = messageImageFile.created_at;
        }
        if ((i & 32) != 0) {
            str3 = messageImageFile.path;
        }
        if ((i & 64) != 0) {
            str4 = messageImageFile.sanitized_name;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            l = messageImageFile.size_bytes;
        }
        String str5 = str4;
        Long l2 = l;
        Date date2 = date;
        String str6 = str3;
        return messageImageFile.m246copyPjSl_mY(str, str2, messageImageAsset, messageImageAsset2, date2, str6, str5, l2);
    }

    public static final /* synthetic */ void write$Self$api(MessageImageFile self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, oi7.a, FileId.m1014boximpl(self.mo236getFile_uuidExWXDbg()));
        output.q(serialDesc, 1, self.file_name);
        ghb ghbVar = ghb.a;
        output.r(serialDesc, 2, ghbVar, self.thumbnail_asset);
        if (output.E(serialDesc) || self.preview_asset != null) {
            output.B(serialDesc, 3, ghbVar, self.preview_asset);
        }
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
    public final MessageImageAsset getPreview_asset() {
        return this.preview_asset;
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
    public final MessageImageFile m246copyPjSl_mY(String file_uuid, String file_name, MessageImageAsset thumbnail_asset, MessageImageAsset preview_asset, Date created_at, String path, String sanitized_name, Long size_bytes) {
        file_uuid.getClass();
        file_name.getClass();
        thumbnail_asset.getClass();
        return new MessageImageFile(file_uuid, file_name, thumbnail_asset, preview_asset, created_at, path, sanitized_name, size_bytes, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageImageFile)) {
            return false;
        }
        MessageImageFile messageImageFile = (MessageImageFile) other;
        return FileId.m1017equalsimpl0(this.file_uuid, messageImageFile.file_uuid) && x44.r(this.file_name, messageImageFile.file_name) && x44.r(this.thumbnail_asset, messageImageFile.thumbnail_asset) && x44.r(this.preview_asset, messageImageFile.preview_asset) && x44.r(this.created_at, messageImageFile.created_at) && x44.r(this.path, messageImageFile.path) && x44.r(this.sanitized_name, messageImageFile.sanitized_name) && x44.r(this.size_bytes, messageImageFile.size_bytes);
    }

    public final Date getCreated_at() {
        return this.created_at;
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

    public final MessageImageAsset getPreview_asset() {
        return this.preview_asset;
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
        int iHashCode = (this.thumbnail_asset.hashCode() + kgh.l(FileId.m1018hashCodeimpl(this.file_uuid) * 31, 31, this.file_name)) * 31;
        MessageImageAsset messageImageAsset = this.preview_asset;
        int iHashCode2 = (iHashCode + (messageImageAsset == null ? 0 : messageImageAsset.hashCode())) * 31;
        Date date = this.created_at;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.path;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sanitized_name;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.size_bytes;
        return iHashCode5 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String strM1019toStringimpl = FileId.m1019toStringimpl(this.file_uuid);
        String str = this.file_name;
        MessageImageAsset messageImageAsset = this.thumbnail_asset;
        MessageImageAsset messageImageAsset2 = this.preview_asset;
        Date date = this.created_at;
        String str2 = this.path;
        String str3 = this.sanitized_name;
        Long l = this.size_bytes;
        StringBuilder sbR = kgh.r("MessageImageFile(file_uuid=", strM1019toStringimpl, ", file_name=", str, ", thumbnail_asset=");
        sbR.append(messageImageAsset);
        sbR.append(", preview_asset=");
        sbR.append(messageImageAsset2);
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

    public /* synthetic */ MessageImageFile(String str, String str2, MessageImageAsset messageImageAsset, MessageImageAsset messageImageAsset2, Date date, String str3, String str4, Long l, mq5 mq5Var) {
        this(str, str2, messageImageAsset, messageImageAsset2, date, str3, str4, l);
    }

    public /* synthetic */ MessageImageFile(int i, String str, String str2, MessageImageAsset messageImageAsset, MessageImageAsset messageImageAsset2, Date date, String str3, String str4, Long l, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, messageImageAsset, messageImageAsset2, date, str3, str4, l, vnfVar);
    }

    private MessageImageFile(String str, String str2, MessageImageAsset messageImageAsset, MessageImageAsset messageImageAsset2, Date date, String str3, String str4, Long l) {
        str.getClass();
        str2.getClass();
        messageImageAsset.getClass();
        this.file_uuid = str;
        this.file_name = str2;
        this.thumbnail_asset = messageImageAsset;
        this.preview_asset = messageImageAsset2;
        this.created_at = date;
        this.path = str3;
        this.sanitized_name = str4;
        this.size_bytes = l;
    }

    public /* synthetic */ MessageImageFile(String str, String str2, MessageImageAsset messageImageAsset, MessageImageAsset messageImageAsset2, Date date, String str3, String str4, Long l, int i, mq5 mq5Var) {
        this(str, str2, messageImageAsset, (i & 8) != 0 ? null : messageImageAsset2, (i & 16) != 0 ? null : date, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : l, null);
    }
}
