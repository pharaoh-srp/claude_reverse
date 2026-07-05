package com.arkivanov.essenty.statekeeper;

import defpackage.eve;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import java.util.Map;
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
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.essenty.statekeeper.DefaultStateKeeperDispatcher.SavedState", aVar, 1);
        pluginGeneratedSerialDescriptor.j("map", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{DefaultStateKeeperDispatcher$SavedState.$childSerializers[0]};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        KSerializer[] kSerializerArr = DefaultStateKeeperDispatcher$SavedState.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                map = (Map) ud4VarC.l(serialDescriptor, 0, kSerializerArr[0], map);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new DefaultStateKeeperDispatcher$SavedState(i, map, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DefaultStateKeeperDispatcher$SavedState defaultStateKeeperDispatcher$SavedState = (DefaultStateKeeperDispatcher$SavedState) obj;
        encoder.getClass();
        defaultStateKeeperDispatcher$SavedState.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, DefaultStateKeeperDispatcher$SavedState.$childSerializers[0], defaultStateKeeperDispatcher$SavedState.map);
        vd4VarC.b(serialDescriptor);
    }

    @Override // defpackage.w28
    public final KSerializer[] typeParametersSerializers() {
        return eve.g;
    }
}
