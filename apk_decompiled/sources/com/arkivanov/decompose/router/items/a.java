package com.arkivanov.decompose.router.items;

import com.arkivanov.essenty.statekeeper.SerializableContainer;
import defpackage.eve;
import defpackage.rnf;
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
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.decompose.router.items.ItemsController.SavedState", aVar, 2);
        pluginGeneratedSerialDescriptor.j("navState", false);
        pluginGeneratedSerialDescriptor.j("childState", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{rnf.a, ItemsController$SavedState.$childSerializers[1]};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        KSerializer[] kSerializerArr = ItemsController$SavedState.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        SerializableContainer serializableContainer = null;
        Map map = null;
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
                map = (Map) ud4VarC.l(serialDescriptor, 1, kSerializerArr[1], map);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ItemsController$SavedState(i, serializableContainer, map, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ItemsController$SavedState itemsController$SavedState = (ItemsController$SavedState) obj;
        encoder.getClass();
        itemsController$SavedState.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ItemsController$SavedState.write$Self$decompose_release(itemsController$SavedState, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }

    @Override // defpackage.w28
    public final KSerializer[] typeParametersSerializers() {
        return eve.g;
    }
}
