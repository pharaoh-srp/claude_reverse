package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.FileId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.oi7;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wib;
import defpackage.x44;
import defpackage.xib;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J&\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/chat/MessageUnknownFile;", "Lcom/anthropic/claude/api/chat/MessageFile;", "Lcom/anthropic/claude/types/strings/FileId;", "file_uuid", "", "file_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/MessageUnknownFile;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-ExWXDbg", "()Ljava/lang/String;", "component1", "component2", "copy-i3pgdKE", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/MessageUnknownFile;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFile_uuid-ExWXDbg", "getFile_name", "Companion", "wib", "xib", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageUnknownFile implements MessageFile {
    public static final int $stable = 0;
    public static final xib Companion = new xib();
    private final String file_name;
    private final String file_uuid;

    private /* synthetic */ MessageUnknownFile(int i, String str, String str2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, wib.a.getDescriptor());
            throw null;
        }
        this.file_uuid = str;
        if ((i & 2) == 0) {
            this.file_name = null;
        } else {
            this.file_name = str2;
        }
    }

    /* JADX INFO: renamed from: copy-i3pgdKE$default, reason: not valid java name */
    public static /* synthetic */ MessageUnknownFile m247copyi3pgdKE$default(MessageUnknownFile messageUnknownFile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageUnknownFile.file_uuid;
        }
        if ((i & 2) != 0) {
            str2 = messageUnknownFile.file_name;
        }
        return messageUnknownFile.m249copyi3pgdKE(str, str2);
    }

    public static final /* synthetic */ void write$Self$api(MessageUnknownFile self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, oi7.a, FileId.m1014boximpl(self.mo236getFile_uuidExWXDbg()));
        if (!output.E(serialDesc) && self.file_name == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.file_name);
    }

    /* JADX INFO: renamed from: component1-ExWXDbg, reason: not valid java name and from getter */
    public final String getFile_uuid() {
        return this.file_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFile_name() {
        return this.file_name;
    }

    /* JADX INFO: renamed from: copy-i3pgdKE, reason: not valid java name */
    public final MessageUnknownFile m249copyi3pgdKE(String file_uuid, String file_name) {
        file_uuid.getClass();
        return new MessageUnknownFile(file_uuid, file_name, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageUnknownFile)) {
            return false;
        }
        MessageUnknownFile messageUnknownFile = (MessageUnknownFile) other;
        return FileId.m1017equalsimpl0(this.file_uuid, messageUnknownFile.file_uuid) && x44.r(this.file_name, messageUnknownFile.file_name);
    }

    public final String getFile_name() {
        return this.file_name;
    }

    @Override // com.anthropic.claude.api.chat.MessageFile
    /* JADX INFO: renamed from: getFile_uuid-ExWXDbg */
    public String mo236getFile_uuidExWXDbg() {
        return this.file_uuid;
    }

    public int hashCode() {
        int iM1018hashCodeimpl = FileId.m1018hashCodeimpl(this.file_uuid) * 31;
        String str = this.file_name;
        return iM1018hashCodeimpl + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return ij0.l("MessageUnknownFile(file_uuid=", FileId.m1019toStringimpl(this.file_uuid), ", file_name=", this.file_name, ")");
    }

    public /* synthetic */ MessageUnknownFile(String str, String str2, mq5 mq5Var) {
        this(str, str2);
    }

    public /* synthetic */ MessageUnknownFile(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, vnfVar);
    }

    private MessageUnknownFile(String str, String str2) {
        str.getClass();
        this.file_uuid = str;
        this.file_name = str2;
    }

    public /* synthetic */ MessageUnknownFile(String str, String str2, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, null);
    }
}
