package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.orf;
import defpackage.prf;
import defpackage.sq6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b\u0006\u0010\u001b¨\u0006+"}, d2 = {"Lcom/anthropic/claude/sessions/types/SessionFileAttachment;", "", "", "file_uuid", "file_name", "", "is_image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SessionFileAttachment;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/sessions/types/SessionFileAttachment;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFile_uuid", "getFile_name", "Z", "Companion", "orf", "prf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SessionFileAttachment {
    public static final prf Companion = new prf();
    private final String file_name;
    private final String file_uuid;
    private final boolean is_image;

    public /* synthetic */ SessionFileAttachment(int i, String str, String str2, boolean z, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, orf.a.getDescriptor());
            throw null;
        }
        this.file_uuid = str;
        this.file_name = str2;
        if ((i & 4) == 0) {
            this.is_image = false;
        } else {
            this.is_image = z;
        }
    }

    public static /* synthetic */ SessionFileAttachment copy$default(SessionFileAttachment sessionFileAttachment, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionFileAttachment.file_uuid;
        }
        if ((i & 2) != 0) {
            str2 = sessionFileAttachment.file_name;
        }
        if ((i & 4) != 0) {
            z = sessionFileAttachment.is_image;
        }
        return sessionFileAttachment.copy(str, str2, z);
    }

    public static final /* synthetic */ void write$Self$sessions(SessionFileAttachment self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.file_uuid);
        output.q(serialDesc, 1, self.file_name);
        if (output.E(serialDesc) || self.is_image) {
            output.p(serialDesc, 2, self.is_image);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFile_uuid() {
        return this.file_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFile_name() {
        return this.file_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIs_image() {
        return this.is_image;
    }

    public final SessionFileAttachment copy(String file_uuid, String file_name, boolean is_image) {
        file_uuid.getClass();
        file_name.getClass();
        return new SessionFileAttachment(file_uuid, file_name, is_image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionFileAttachment)) {
            return false;
        }
        SessionFileAttachment sessionFileAttachment = (SessionFileAttachment) other;
        return x44.r(this.file_uuid, sessionFileAttachment.file_uuid) && x44.r(this.file_name, sessionFileAttachment.file_name) && this.is_image == sessionFileAttachment.is_image;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final String getFile_uuid() {
        return this.file_uuid;
    }

    public int hashCode() {
        return Boolean.hashCode(this.is_image) + kgh.l(this.file_uuid.hashCode() * 31, 31, this.file_name);
    }

    public final boolean is_image() {
        return this.is_image;
    }

    public String toString() {
        String str = this.file_uuid;
        String str2 = this.file_name;
        return sq6.v(")", kgh.r("SessionFileAttachment(file_uuid=", str, ", file_name=", str2, ", is_image="), this.is_image);
    }

    public SessionFileAttachment(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.file_uuid = str;
        this.file_name = str2;
        this.is_image = z;
    }

    public /* synthetic */ SessionFileAttachment(String str, String str2, boolean z, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
