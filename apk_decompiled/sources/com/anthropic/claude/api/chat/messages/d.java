package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.api.chat.messages.MessageDelta;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements KSerializer {
    public static final d a = new d();
    public static final SerialDescriptor b = MessageDelta.Wire.Companion.serializer().getDescriptor();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
    @Override // defpackage.s06
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r3) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.messages.d.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        ((MessageDelta) obj).getClass();
        throw new UnsupportedOperationException("MessageDelta is decode-only");
    }
}
