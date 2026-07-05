package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import defpackage.qeb;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements w28 {
    public static final n a;
    private static final SerialDescriptor descriptor;

    static {
        n nVar = new n();
        a = nVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.PreviewBlob", nVar, 1);
        pluginGeneratedSerialDescriptor.j("file", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qeb.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        MessageBlobFile messageBlobFile = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                messageBlobFile = (MessageBlobFile) ud4VarC.l(serialDescriptor, 0, qeb.a, messageBlobFile);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatScreenModalBottomSheetDestination.PreviewBlob(i, messageBlobFile, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatScreenModalBottomSheetDestination.PreviewBlob previewBlob = (ChatScreenModalBottomSheetDestination.PreviewBlob) obj;
        encoder.getClass();
        previewBlob.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, qeb.a, previewBlob.file);
        vd4VarC.b(serialDescriptor);
    }
}
