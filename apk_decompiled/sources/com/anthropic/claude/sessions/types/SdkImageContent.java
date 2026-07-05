package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.hbf;
import defpackage.hy8;
import defpackage.ibf;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkImageContent;", "Lcom/anthropic/claude/sessions/types/SdkMessageContent;", "", "type", "Lcom/anthropic/claude/sessions/types/ImageSource;", "source", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ImageSource;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/sessions/types/ImageSource;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkImageContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Lcom/anthropic/claude/sessions/types/ImageSource;", "getSource", "()Lcom/anthropic/claude/sessions/types/ImageSource;", "Companion", "hbf", "ibf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkImageContent implements SdkMessageContent {
    public static final ibf Companion = new ibf();
    private final ImageSource source;
    private final String type;

    public /* synthetic */ SdkImageContent(int i, String str, ImageSource imageSource, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, hbf.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.source = imageSource;
    }

    public static final /* synthetic */ void write$Self$sessions(SdkImageContent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getType());
        output.r(serialDesc, 1, hy8.a, self.source);
    }

    public final ImageSource getSource() {
        return this.source;
    }

    @Override // com.anthropic.claude.sessions.types.SdkMessageContent
    public String getType() {
        return this.type;
    }

    public SdkImageContent(String str, ImageSource imageSource) {
        str.getClass();
        imageSource.getClass();
        this.type = str;
        this.source = imageSource;
    }
}
