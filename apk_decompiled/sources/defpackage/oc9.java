package defpackage;

import com.arkivanov.decompose.router.items.Items;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class oc9 {
    public final <C> KSerializer serializer(final KSerializer kSerializer) {
        kSerializer.getClass();
        return new w28() { // from class: mc9
            private final SerialDescriptor descriptor;

            {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.decompose.router.items.Items", this, 2);
                pluginGeneratedSerialDescriptor.j("items", true);
                pluginGeneratedSerialDescriptor.j("activeItems", true);
                this.descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.w28
            public final KSerializer[] childSerializers() {
                KSerializer kSerializer2 = kSerializer;
                uo0 uo0Var = new uo0(kSerializer2, 0);
                nc9[] nc9VarArrValues = nc9.values();
                nc9VarArrValues.getClass();
                return new KSerializer[]{uo0Var, new f7a(kSerializer2, new lq6("com.arkivanov.decompose.router.items.Items.ActiveLifecycleState", (Enum[]) nc9VarArrValues))};
            }

            @Override // defpackage.s06
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                ud4 ud4VarC = decoder.c(serialDescriptor);
                vnf vnfVar = null;
                boolean z = true;
                int i = 0;
                List list = null;
                Map map = null;
                while (z) {
                    int iX = ud4VarC.x(serialDescriptor);
                    if (iX != -1) {
                        KSerializer kSerializer2 = kSerializer;
                        if (iX == 0) {
                            list = (List) ud4VarC.l(serialDescriptor, 0, new uo0(kSerializer2, 0), list);
                            i |= 1;
                        } else {
                            if (iX != 1) {
                                sz6.e(iX);
                                return null;
                            }
                            nc9[] nc9VarArrValues = nc9.values();
                            nc9VarArrValues.getClass();
                            map = (Map) ud4VarC.l(serialDescriptor, 1, new f7a(kSerializer2, new lq6("com.arkivanov.decompose.router.items.Items.ActiveLifecycleState", (Enum[]) nc9VarArrValues)), map);
                            i |= 2;
                        }
                    } else {
                        z = false;
                    }
                }
                ud4VarC.b(serialDescriptor);
                return new Items(i, list, map, vnfVar);
            }

            @Override // defpackage.znf, defpackage.s06
            public final SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // defpackage.znf
            public final void serialize(Encoder encoder, Object obj) {
                Items items = (Items) obj;
                encoder.getClass();
                items.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                vd4 vd4VarC = encoder.c(serialDescriptor);
                Items.write$Self$decompose_release(items, vd4VarC, serialDescriptor, kSerializer);
                vd4VarC.b(serialDescriptor);
            }

            @Override // defpackage.w28
            public final KSerializer[] typeParametersSerializers() {
                return new KSerializer[]{kSerializer};
            }
        };
    }
}
