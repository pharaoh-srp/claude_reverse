package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import defpackage.ghb;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.zt1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements w28 {
    public static final r a;
    private static final SerialDescriptor descriptor;

    static {
        r rVar = new r();
        a = rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination.PreviewImage", rVar, 4);
        pluginGeneratedSerialDescriptor.j("image", false);
        pluginGeneratedSerialDescriptor.j("allowDownload", true);
        pluginGeneratedSerialDescriptor.j("showBackButton", true);
        pluginGeneratedSerialDescriptor.j("showFilename", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{ghb.a, zt1Var, zt1Var, zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        MessageImageAsset messageImageAsset = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                messageImageAsset = (MessageImageAsset) ud4VarC.l(serialDescriptor, 0, ghb.a, messageImageAsset);
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                zU2 = ud4VarC.u(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                zU3 = ud4VarC.u(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatScreenModalBottomSheetDestination.PreviewImage(i, messageImageAsset, zU, zU2, zU3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatScreenModalBottomSheetDestination.PreviewImage previewImage = (ChatScreenModalBottomSheetDestination.PreviewImage) obj;
        encoder.getClass();
        previewImage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatScreenModalBottomSheetDestination.PreviewImage.write$Self$chat(previewImage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
