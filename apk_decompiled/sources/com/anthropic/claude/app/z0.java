package com.anthropic.claude.app;

import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.app.ClaudeAppOverlay;
import defpackage.jw8;
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
public final /* synthetic */ class z0 implements w28 {
    public static final z0 a;
    private static final SerialDescriptor descriptor;

    static {
        z0 z0Var = new z0();
        a = z0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.ClaudeAppOverlay.ImageGalleryFullScreen", z0Var, 1);
        pluginGeneratedSerialDescriptor.j("initialSelectedId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{jw8.a};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = true;
        int i = 0;
        String strM310unboximpl = null;
        while (objArr2 != false) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                objArr2 = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                ImageGalleryItemId imageGalleryItemId = (ImageGalleryItemId) ud4VarC.l(serialDescriptor, 0, jw8.a, strM310unboximpl != null ? ImageGalleryItemId.m304boximpl(strM310unboximpl) : null);
                strM310unboximpl = imageGalleryItemId != null ? imageGalleryItemId.m310unboximpl() : null;
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAppOverlay.ImageGalleryFullScreen(i, strM310unboximpl, vnfVar, objArr == true ? 1 : 0);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAppOverlay.ImageGalleryFullScreen imageGalleryFullScreen = (ClaudeAppOverlay.ImageGalleryFullScreen) obj;
        encoder.getClass();
        imageGalleryFullScreen.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, jw8.a, ImageGalleryItemId.m304boximpl(imageGalleryFullScreen.initialSelectedId));
        vd4VarC.b(serialDescriptor);
    }
}
