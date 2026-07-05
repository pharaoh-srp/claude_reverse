package defpackage;

import com.anthropic.router.panes.Panes;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class tqc {
    public final <MainC, DetailsC, ExtraC> KSerializer serializer(final KSerializer kSerializer, final KSerializer kSerializer2, final KSerializer kSerializer3) {
        kSerializer.getClass();
        kSerializer2.getClass();
        kSerializer3.getClass();
        return new w28() { // from class: sqc
            private final SerialDescriptor descriptor;

            {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.router.panes.Panes", this, 4);
                pluginGeneratedSerialDescriptor.j("main", false);
                pluginGeneratedSerialDescriptor.j("details", true);
                pluginGeneratedSerialDescriptor.j("extra", true);
                pluginGeneratedSerialDescriptor.j("mode", true);
                this.descriptor = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.w28
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{new uo0(kSerializer, 0), new uo0(kSerializer2, 0), new uo0(kSerializer3, 0), Panes.$childSerializers[3].getValue()};
            }

            @Override // defpackage.s06
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                ud4 ud4VarC = decoder.c(serialDescriptor);
                kw9[] kw9VarArr = Panes.$childSerializers;
                boolean z = true;
                int i = 0;
                List list = null;
                List list2 = null;
                List list3 = null;
                ye3 ye3Var = null;
                while (z) {
                    int iX = ud4VarC.x(serialDescriptor);
                    if (iX == -1) {
                        z = false;
                    } else if (iX == 0) {
                        list = (List) ud4VarC.l(serialDescriptor, 0, new uo0(kSerializer, 0), list);
                        i |= 1;
                    } else if (iX == 1) {
                        list2 = (List) ud4VarC.l(serialDescriptor, 1, new uo0(kSerializer2, 0), list2);
                        i |= 2;
                    } else if (iX == 2) {
                        list3 = (List) ud4VarC.l(serialDescriptor, 2, new uo0(kSerializer3, 0), list3);
                        i |= 4;
                    } else {
                        if (iX != 3) {
                            sz6.e(iX);
                            return null;
                        }
                        ye3Var = (ye3) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), ye3Var);
                        i |= 8;
                    }
                }
                ud4VarC.b(serialDescriptor);
                return new Panes(i, list, list2, list3, ye3Var, (vnf) null);
            }

            @Override // defpackage.znf, defpackage.s06
            public final SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // defpackage.znf
            public final void serialize(Encoder encoder, Object obj) {
                Panes panes = (Panes) obj;
                encoder.getClass();
                panes.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                vd4 vd4VarC = encoder.c(serialDescriptor);
                Panes.write$Self$Claude_router(panes, vd4VarC, serialDescriptor, kSerializer, kSerializer2, kSerializer3);
                vd4VarC.b(serialDescriptor);
            }

            @Override // defpackage.w28
            public final KSerializer[] typeParametersSerializers() {
                return new KSerializer[]{kSerializer, kSerializer2, kSerializer3};
            }
        };
    }
}
