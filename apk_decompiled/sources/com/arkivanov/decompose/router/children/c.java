package com.arkivanov.decompose.router.children;

import com.arkivanov.essenty.statekeeper.SerializableContainer;
import defpackage.eve;
import defpackage.rnf;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements w28 {
    public static final c a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.decompose.router.children.SavedState", cVar, 2);
        pluginGeneratedSerialDescriptor.j("navState", false);
        pluginGeneratedSerialDescriptor.j("childState", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{rnf.a, SavedState.$childSerializers[1]};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        KSerializer[] kSerializerArr = SavedState.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        SerializableContainer serializableContainer = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                serializableContainer = (SerializableContainer) ud4VarC.l(serialDescriptor, 0, rnf.a, serializableContainer);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 1, kSerializerArr[1], list);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SavedState(i, serializableContainer, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SavedState savedState = (SavedState) obj;
        encoder.getClass();
        savedState.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SavedState.write$Self$decompose_release(savedState, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }

    @Override // defpackage.w28
    public final KSerializer[] typeParametersSerializers() {
        return eve.g;
    }
}
