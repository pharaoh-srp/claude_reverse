package com.anthropic.claude.wear;

import com.anthropic.claude.wear.PhoneWearableListenerService;
import defpackage.d4c;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.uo7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements w28 {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.wear.PhoneWearableListenerService.AuthSyncCredentials", aVar, 5);
        pluginGeneratedSerialDescriptor.j("sessionKey", false);
        pluginGeneratedSerialDescriptor.j("orgId", false);
        pluginGeneratedSerialDescriptor.j("baseUrl", false);
        pluginGeneratedSerialDescriptor.j("voiceSelection", true);
        pluginGeneratedSerialDescriptor.j("playbackSpeed", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, d4c.S(srgVar), uo7.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String str = null;
        float fD = 0.0f;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                strV3 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                fD = ud4VarC.D(serialDescriptor, 4);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PhoneWearableListenerService.AuthSyncCredentials(i, strV, strV2, strV3, str, fD, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PhoneWearableListenerService.AuthSyncCredentials authSyncCredentials = (PhoneWearableListenerService.AuthSyncCredentials) obj;
        encoder.getClass();
        authSyncCredentials.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PhoneWearableListenerService.AuthSyncCredentials.write$Self$app(authSyncCredentials, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
