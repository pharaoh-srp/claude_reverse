package defpackage;

import defpackage.e79;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class unf {
    public final <C> KSerializer serializer(final KSerializer kSerializer) {
        kSerializer.getClass();
        return new w28() { // from class: com.arkivanov.decompose.router.pages.a
            private final SerialDescriptor descriptor;

            {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.decompose.router.pages.SerializablePages", this, 2);
                pluginGeneratedSerialDescriptor.j("items", false);
                pluginGeneratedSerialDescriptor.j("selectedIndex", false);
                this.descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.w28
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{new uo0(kSerializer, 0), e79.a};
            }

            @Override // defpackage.s06
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                ud4 ud4VarC = decoder.c(serialDescriptor);
                vnf vnfVar = null;
                boolean z = true;
                int i = 0;
                int iR = 0;
                List list = null;
                while (z) {
                    int iX = ud4VarC.x(serialDescriptor);
                    if (iX == -1) {
                        z = false;
                    } else if (iX == 0) {
                        list = (List) ud4VarC.l(serialDescriptor, 0, new uo0(kSerializer, 0), list);
                        i |= 1;
                    } else {
                        if (iX != 1) {
                            sz6.e(iX);
                            return null;
                        }
                        iR = ud4VarC.r(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                ud4VarC.b(serialDescriptor);
                return new SerializablePages(i, list, iR, vnfVar);
            }

            @Override // defpackage.znf, defpackage.s06
            public final SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // defpackage.znf
            public final void serialize(Encoder encoder, Object obj) {
                SerializablePages serializablePages = (SerializablePages) obj;
                encoder.getClass();
                serializablePages.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                vd4 vd4VarC = encoder.c(serialDescriptor);
                SerializablePages.write$Self$decompose_release(serializablePages, vd4VarC, serialDescriptor, kSerializer);
                vd4VarC.b(serialDescriptor);
            }

            @Override // defpackage.w28
            public final KSerializer[] typeParametersSerializers() {
                return new KSerializer[]{kSerializer};
            }
        };
    }
}
