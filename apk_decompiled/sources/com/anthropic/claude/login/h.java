package com.anthropic.claude.login;

import com.anthropic.claude.login.OverlayScreens;
import defpackage.koa;
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
public final /* synthetic */ class h implements w28 {
    public static final h a;
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.login.OverlayScreens.MagicLinkVerify", hVar, 1);
        pluginGeneratedSerialDescriptor.j("intentData", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{koa.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        MagicLinkIntentData magicLinkIntentData = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                magicLinkIntentData = (MagicLinkIntentData) ud4VarC.l(serialDescriptor, 0, koa.a, magicLinkIntentData);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new OverlayScreens.MagicLinkVerify(i, magicLinkIntentData, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        OverlayScreens.MagicLinkVerify magicLinkVerify = (OverlayScreens.MagicLinkVerify) obj;
        encoder.getClass();
        magicLinkVerify.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, koa.a, magicLinkVerify.intentData);
        vd4VarC.b(serialDescriptor);
    }
}
