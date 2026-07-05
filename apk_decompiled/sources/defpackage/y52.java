package defpackage;

import com.anthropic.claude.app.appstart.CachedData;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class y52 {
    public final <T> KSerializer serializer(final KSerializer kSerializer) {
        kSerializer.getClass();
        return new w28() { // from class: x52
            private final SerialDescriptor descriptor;

            {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.appstart.CachedData", this, 2);
                pluginGeneratedSerialDescriptor.j("response", false);
                pluginGeneratedSerialDescriptor.j("cachedAtMillis", false);
                this.descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.w28
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{kSerializer, xka.a};
            }

            @Override // defpackage.s06
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                ud4 ud4VarC = decoder.c(serialDescriptor);
                int i = 0;
                Object objL = null;
                long j = 0;
                boolean z = true;
                while (z) {
                    int iX = ud4VarC.x(serialDescriptor);
                    if (iX == -1) {
                        z = false;
                    } else if (iX == 0) {
                        objL = ud4VarC.l(serialDescriptor, 0, kSerializer, objL);
                        i |= 1;
                    } else {
                        if (iX != 1) {
                            sz6.e(iX);
                            return null;
                        }
                        j = ud4VarC.j(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                ud4VarC.b(serialDescriptor);
                return new CachedData(i, objL, j, null);
            }

            @Override // defpackage.znf, defpackage.s06
            public final SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // defpackage.znf
            public final void serialize(Encoder encoder, Object obj) {
                CachedData cachedData = (CachedData) obj;
                encoder.getClass();
                cachedData.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                vd4 vd4VarC = encoder.c(serialDescriptor);
                CachedData.write$Self$app_start(cachedData, vd4VarC, serialDescriptor, kSerializer);
                vd4VarC.b(serialDescriptor);
            }

            @Override // defpackage.w28
            public final KSerializer[] typeParametersSerializers() {
                return new KSerializer[]{kSerializer};
            }
        };
    }
}
