package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class tn8 {
    public final <T> KSerializer serializer(final KSerializer kSerializer) {
        kSerializer.getClass();
        return new w28() { // from class: com.arkivanov.essenty.statekeeper.c
            private final SerialDescriptor descriptor;

            {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.essenty.statekeeper.Holder", this, 1);
                pluginGeneratedSerialDescriptor.j(ExperienceToggle.DEFAULT_PARAM_KEY, false);
                this.descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.w28
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{kSerializer};
            }

            @Override // defpackage.s06
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                ud4 ud4VarC = decoder.c(serialDescriptor);
                vnf vnfVar = null;
                boolean z = true;
                int i = 0;
                Object objL = null;
                while (z) {
                    int iX = ud4VarC.x(serialDescriptor);
                    if (iX == -1) {
                        z = false;
                    } else {
                        if (iX != 0) {
                            sz6.e(iX);
                            return null;
                        }
                        objL = ud4VarC.l(serialDescriptor, 0, kSerializer, objL);
                        i = 1;
                    }
                }
                ud4VarC.b(serialDescriptor);
                return new Holder(i, objL, vnfVar);
            }

            @Override // defpackage.znf, defpackage.s06
            public final SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // defpackage.znf
            public final void serialize(Encoder encoder, Object obj) {
                Holder holder = (Holder) obj;
                encoder.getClass();
                holder.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                vd4 vd4VarC = encoder.c(serialDescriptor);
                vd4VarC.r(serialDescriptor, 0, kSerializer, holder.value);
                vd4VarC.b(serialDescriptor);
            }

            @Override // defpackage.w28
            public final KSerializer[] typeParametersSerializers() {
                return new KSerializer[]{kSerializer};
            }
        };
    }
}
