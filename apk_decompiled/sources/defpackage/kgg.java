package defpackage;

import defpackage.kw9;
import defpackage.s06;
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

/* JADX INFO: loaded from: classes2.dex */
public final class kgg {
    public final <T> KSerializer serializer(final KSerializer kSerializer) {
        kSerializer.getClass();
        return new w28() { // from class: androidx.savedstate.serialization.serializers.b
            private final SerialDescriptor descriptor;

            {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                pluginGeneratedSerialDescriptor.j("keys", false);
                pluginGeneratedSerialDescriptor.j("values", false);
                this.descriptor = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.w28
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{SparseArraySerializer$SparseArraySurrogate.$childSerializers[0].getValue(), new uo0(kSerializer, 0)};
            }

            @Override // defpackage.s06
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                ud4 ud4VarC = decoder.c(serialDescriptor);
                kw9[] kw9VarArr = SparseArraySerializer$SparseArraySurrogate.$childSerializers;
                vnf vnfVar = null;
                boolean z = true;
                int i = 0;
                List list = null;
                List list2 = null;
                while (z) {
                    int iX = ud4VarC.x(serialDescriptor);
                    if (iX == -1) {
                        z = false;
                    } else if (iX == 0) {
                        list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                        i |= 1;
                    } else {
                        if (iX != 1) {
                            sz6.e(iX);
                            return null;
                        }
                        list2 = (List) ud4VarC.l(serialDescriptor, 1, new uo0(kSerializer, 0), list2);
                        i |= 2;
                    }
                }
                ud4VarC.b(serialDescriptor);
                return new SparseArraySerializer$SparseArraySurrogate(i, list, list2, vnfVar);
            }

            @Override // defpackage.znf, defpackage.s06
            public final SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // defpackage.znf
            public final void serialize(Encoder encoder, Object obj) {
                SparseArraySerializer$SparseArraySurrogate sparseArraySerializer$SparseArraySurrogate = (SparseArraySerializer$SparseArraySurrogate) obj;
                encoder.getClass();
                sparseArraySerializer$SparseArraySurrogate.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                vd4 vd4VarC = encoder.c(serialDescriptor);
                SparseArraySerializer$SparseArraySurrogate.write$Self$savedstate(sparseArraySerializer$SparseArraySurrogate, vd4VarC, serialDescriptor, kSerializer);
                vd4VarC.b(serialDescriptor);
            }

            @Override // defpackage.w28
            public final KSerializer[] typeParametersSerializers() {
                return new KSerializer[]{kSerializer};
            }
        };
    }
}
