package com.anthropic.claude.api.common;

import com.anthropic.claude.api.common.CloudflareWaitingRoomResponse;
import defpackage.d4c;
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

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements w28 {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.common.CloudflareWaitingRoomResponse", aVar, 1);
        pluginGeneratedSerialDescriptor.j("cfWaitingRoom", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(b.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        CloudflareWaitingRoomResponse.WaitingRoom waitingRoom = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                waitingRoom = (CloudflareWaitingRoomResponse.WaitingRoom) ud4VarC.m(serialDescriptor, 0, b.a, waitingRoom);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CloudflareWaitingRoomResponse(i, waitingRoom, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CloudflareWaitingRoomResponse cloudflareWaitingRoomResponse = (CloudflareWaitingRoomResponse) obj;
        encoder.getClass();
        cloudflareWaitingRoomResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CloudflareWaitingRoomResponse.write$Self$api(cloudflareWaitingRoomResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
