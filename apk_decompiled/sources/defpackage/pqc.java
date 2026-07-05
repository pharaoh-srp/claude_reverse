package defpackage;

import com.arkivanov.decompose.router.panels.Panels;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class pqc {
    public final <MC, DC, EC> KSerializer serializer(final KSerializer kSerializer, final KSerializer kSerializer2, final KSerializer kSerializer3) {
        kSerializer.getClass();
        kSerializer2.getClass();
        kSerializer3.getClass();
        return new w28() { // from class: oqc
            private final SerialDescriptor descriptor;

            {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.decompose.router.panels.Panels", this, 4);
                pluginGeneratedSerialDescriptor.j("main", false);
                pluginGeneratedSerialDescriptor.j("details", true);
                pluginGeneratedSerialDescriptor.j("extra", true);
                pluginGeneratedSerialDescriptor.j("mode", true);
                this.descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.w28
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{kSerializer, d4c.S(kSerializer2), d4c.S(kSerializer3), Panels.$childSerializers[3]};
            }

            @Override // defpackage.s06
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                ud4 ud4VarC = decoder.c(serialDescriptor);
                KSerializer[] kSerializerArr = Panels.$childSerializers;
                boolean z = true;
                int i = 0;
                Object objL = null;
                Object objM = null;
                Object objM2 = null;
                se3 se3Var = null;
                while (z) {
                    int iX = ud4VarC.x(serialDescriptor);
                    if (iX == -1) {
                        z = false;
                    } else if (iX == 0) {
                        objL = ud4VarC.l(serialDescriptor, 0, kSerializer, objL);
                        i |= 1;
                    } else if (iX == 1) {
                        objM = ud4VarC.m(serialDescriptor, 1, kSerializer2, objM);
                        i |= 2;
                    } else if (iX == 2) {
                        objM2 = ud4VarC.m(serialDescriptor, 2, kSerializer3, objM2);
                        i |= 4;
                    } else {
                        if (iX != 3) {
                            sz6.e(iX);
                            return null;
                        }
                        se3Var = (se3) ud4VarC.l(serialDescriptor, 3, kSerializerArr[3], se3Var);
                        i |= 8;
                    }
                }
                ud4VarC.b(serialDescriptor);
                return new Panels(i, objL, objM, objM2, se3Var, (vnf) null);
            }

            @Override // defpackage.znf, defpackage.s06
            public final SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // defpackage.znf
            public final void serialize(Encoder encoder, Object obj) {
                Panels panels = (Panels) obj;
                encoder.getClass();
                panels.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                vd4 vd4VarC = encoder.c(serialDescriptor);
                Panels.write$Self$decompose_release(panels, vd4VarC, serialDescriptor, kSerializer, kSerializer2, kSerializer3);
                vd4VarC.b(serialDescriptor);
            }

            @Override // defpackage.w28
            public final KSerializer[] typeParametersSerializers() {
                return new KSerializer[]{kSerializer, kSerializer2, kSerializer3};
            }
        };
    }
}
