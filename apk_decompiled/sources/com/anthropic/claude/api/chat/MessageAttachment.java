package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.FileId;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.meb;
import defpackage.mq5;
import defpackage.oeb;
import defpackage.oi7;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001aJD\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u001eJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b/\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b0\u0010\u001a¨\u00064"}, d2 = {"Lcom/anthropic/claude/api/chat/MessageAttachment;", "", "Lcom/anthropic/claude/types/strings/FileId;", "id", "", "file_name", "", "file_size", "file_type", "extracted_content", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/MessageAttachment;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-4Lkzfcw", "()Ljava/lang/String;", "component1", "component2", "component3", "()I", "component4", "component5", "copy-UFEJJWE", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/MessageAttachment;", "copy", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId-4Lkzfcw", "getFile_name", "I", "getFile_size", "getFile_type", "getExtracted_content", "Companion", "meb", "oeb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageAttachment {
    public static final int $stable = 0;
    public static final oeb Companion = new oeb();
    private final String extracted_content;
    private final String file_name;
    private final int file_size;
    private final String file_type;
    private final String id;

    private /* synthetic */ MessageAttachment(int i, String str, String str2, int i2, String str3, String str4, vnf vnfVar) {
        if (14 != (i & 14)) {
            gvj.f(i, 14, meb.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.file_name = str2;
        this.file_size = i2;
        this.file_type = str3;
        if ((i & 16) == 0) {
            this.extracted_content = "";
        } else {
            this.extracted_content = str4;
        }
    }

    /* JADX INFO: renamed from: copy-UFEJJWE$default, reason: not valid java name */
    public static /* synthetic */ MessageAttachment m229copyUFEJJWE$default(MessageAttachment messageAttachment, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = messageAttachment.id;
        }
        if ((i2 & 2) != 0) {
            str2 = messageAttachment.file_name;
        }
        if ((i2 & 4) != 0) {
            i = messageAttachment.file_size;
        }
        if ((i2 & 8) != 0) {
            str3 = messageAttachment.file_type;
        }
        if ((i2 & 16) != 0) {
            str4 = messageAttachment.extracted_content;
        }
        String str5 = str4;
        int i3 = i;
        return messageAttachment.m231copyUFEJJWE(str, str2, i3, str3, str5);
    }

    public static final /* synthetic */ void write$Self$api(MessageAttachment self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.id != null) {
            oi7 oi7Var = oi7.a;
            String str = self.id;
            output.B(serialDesc, 0, oi7Var, str != null ? FileId.m1014boximpl(str) : null);
        }
        output.q(serialDesc, 1, self.file_name);
        output.l(2, self.file_size, serialDesc);
        output.q(serialDesc, 3, self.file_type);
        if (!output.E(serialDesc) && x44.r(self.extracted_content, "")) {
            return;
        }
        output.q(serialDesc, 4, self.extracted_content);
    }

    /* JADX INFO: renamed from: component1-4Lkzfcw, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFile_name() {
        return this.file_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFile_size() {
        return this.file_size;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFile_type() {
        return this.file_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtracted_content() {
        return this.extracted_content;
    }

    /* JADX INFO: renamed from: copy-UFEJJWE, reason: not valid java name */
    public final MessageAttachment m231copyUFEJJWE(String id, String file_name, int file_size, String file_type, String extracted_content) {
        file_name.getClass();
        file_type.getClass();
        extracted_content.getClass();
        return new MessageAttachment(id, file_name, file_size, file_type, extracted_content, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.chat.MessageAttachment
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.chat.MessageAttachment r5 = (com.anthropic.claude.api.chat.MessageAttachment) r5
            java.lang.String r1 = r4.id
            java.lang.String r3 = r5.id
            if (r1 != 0) goto L18
            if (r3 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r3 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.anthropic.claude.types.strings.FileId.m1017equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.file_name
            java.lang.String r3 = r5.file_name
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            int r1 = r4.file_size
            int r3 = r5.file_size
            if (r1 == r3) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.file_type
            java.lang.String r3 = r5.file_type
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.String r4 = r4.extracted_content
            java.lang.String r5 = r5.extracted_content
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L4a
            return r2
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.MessageAttachment.equals(java.lang.Object):boolean");
    }

    public final String getExtracted_content() {
        return this.extracted_content;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final int getFile_size() {
        return this.file_size;
    }

    public final String getFile_type() {
        return this.file_type;
    }

    /* JADX INFO: renamed from: getId-4Lkzfcw, reason: not valid java name */
    public final String m232getId4Lkzfcw() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        return this.extracted_content.hashCode() + kgh.l(vb7.c(this.file_size, kgh.l((str == null ? 0 : FileId.m1018hashCodeimpl(str)) * 31, 31, this.file_name), 31), 31, this.file_type);
    }

    public String toString() {
        String str = this.id;
        String strM1019toStringimpl = str == null ? "null" : FileId.m1019toStringimpl(str);
        String str2 = this.file_name;
        int i = this.file_size;
        String str3 = this.file_type;
        String str4 = this.extracted_content;
        StringBuilder sbR = kgh.r("MessageAttachment(id=", strM1019toStringimpl, ", file_name=", str2, ", file_size=");
        sbR.append(i);
        sbR.append(", file_type=");
        sbR.append(str3);
        sbR.append(", extracted_content=");
        return ij0.m(sbR, str4, ")");
    }

    private MessageAttachment(String str, String str2, int i, String str3, String str4) {
        grc.B(str2, str3, str4);
        this.id = str;
        this.file_name = str2;
        this.file_size = i;
        this.file_type = str3;
        this.extracted_content = str4;
    }

    public /* synthetic */ MessageAttachment(String str, String str2, int i, String str3, String str4, mq5 mq5Var) {
        this(str, str2, i, str3, str4);
    }

    public /* synthetic */ MessageAttachment(int i, String str, String str2, int i2, String str3, String str4, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, i2, str3, str4, vnfVar);
    }

    public /* synthetic */ MessageAttachment(String str, String str2, int i, String str3, String str4, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? null : str, str2, i, str3, (i2 & 16) != 0 ? "" : str4, null);
    }
}
