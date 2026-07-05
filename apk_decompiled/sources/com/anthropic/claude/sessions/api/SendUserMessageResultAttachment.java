package com.anthropic.claude.sessions.api;

import defpackage.amf;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000223B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJF\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b\u0007\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b/\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b0\u0010\u001b¨\u00064"}, d2 = {"Lcom/anthropic/claude/sessions/api/SendUserMessageResultAttachment;", "", "", "path", "", "size", "", "isImage", "media_type", "file_uuid", "<init>", "(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JZLjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/api/SendUserMessageResultAttachment;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Z", "component4", "component5", "copy", "(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/api/SendUserMessageResultAttachment;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "J", "getSize", "Z", "getMedia_type", "getFile_uuid", "Companion", "com/anthropic/claude/sessions/api/f", "amf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
final /* data */ class SendUserMessageResultAttachment {
    public static final amf Companion = new amf();
    private final String file_uuid;
    private final boolean isImage;
    private final String media_type;
    private final String path;
    private final long size;

    public /* synthetic */ SendUserMessageResultAttachment(int i, String str, long j, boolean z, String str2, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, f.a.getDescriptor());
            throw null;
        }
        this.path = str;
        this.size = j;
        if ((i & 4) == 0) {
            this.isImage = false;
        } else {
            this.isImage = z;
        }
        if ((i & 8) == 0) {
            this.media_type = null;
        } else {
            this.media_type = str2;
        }
        if ((i & 16) == 0) {
            this.file_uuid = null;
        } else {
            this.file_uuid = str3;
        }
    }

    public static /* synthetic */ SendUserMessageResultAttachment copy$default(SendUserMessageResultAttachment sendUserMessageResultAttachment, String str, long j, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendUserMessageResultAttachment.path;
        }
        if ((i & 2) != 0) {
            j = sendUserMessageResultAttachment.size;
        }
        if ((i & 4) != 0) {
            z = sendUserMessageResultAttachment.isImage;
        }
        if ((i & 8) != 0) {
            str2 = sendUserMessageResultAttachment.media_type;
        }
        if ((i & 16) != 0) {
            str3 = sendUserMessageResultAttachment.file_uuid;
        }
        String str4 = str3;
        boolean z2 = z;
        return sendUserMessageResultAttachment.copy(str, j, z2, str2, str4);
    }

    public static final /* synthetic */ void write$Self$sessions(SendUserMessageResultAttachment self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.path);
        output.D(serialDesc, 1, self.size);
        if (output.E(serialDesc) || self.isImage) {
            output.p(serialDesc, 2, self.isImage);
        }
        if (output.E(serialDesc) || self.media_type != null) {
            output.B(serialDesc, 3, srg.a, self.media_type);
        }
        if (!output.E(serialDesc) && self.file_uuid == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.file_uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsImage() {
        return this.isImage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMedia_type() {
        return this.media_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFile_uuid() {
        return this.file_uuid;
    }

    public final SendUserMessageResultAttachment copy(String path, long size, boolean isImage, String media_type, String file_uuid) {
        path.getClass();
        return new SendUserMessageResultAttachment(path, size, isImage, media_type, file_uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendUserMessageResultAttachment)) {
            return false;
        }
        SendUserMessageResultAttachment sendUserMessageResultAttachment = (SendUserMessageResultAttachment) other;
        return x44.r(this.path, sendUserMessageResultAttachment.path) && this.size == sendUserMessageResultAttachment.size && this.isImage == sendUserMessageResultAttachment.isImage && x44.r(this.media_type, sendUserMessageResultAttachment.media_type) && x44.r(this.file_uuid, sendUserMessageResultAttachment.file_uuid);
    }

    public final String getFile_uuid() {
        return this.file_uuid;
    }

    public final String getMedia_type() {
        return this.media_type;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        int iP = fsh.p(vb7.e(this.path.hashCode() * 31, 31, this.size), 31, this.isImage);
        String str = this.media_type;
        int iHashCode = (iP + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.file_uuid;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isImage() {
        return this.isImage;
    }

    public String toString() {
        String str = this.path;
        long j = this.size;
        boolean z = this.isImage;
        String str2 = this.media_type;
        String str3 = this.file_uuid;
        StringBuilder sbW = vb7.w("SendUserMessageResultAttachment(path=", str, ", size=", j);
        sbW.append(", isImage=");
        sbW.append(z);
        sbW.append(", media_type=");
        sbW.append(str2);
        return kgh.q(sbW, ", file_uuid=", str3, ")");
    }

    public SendUserMessageResultAttachment(String str, long j, boolean z, String str2, String str3) {
        str.getClass();
        this.path = str;
        this.size = j;
        this.isImage = z;
        this.media_type = str2;
        this.file_uuid = str3;
    }

    public /* synthetic */ SendUserMessageResultAttachment(String str, long j, boolean z, String str2, String str3, int i, mq5 mq5Var) {
        this(str, j, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
