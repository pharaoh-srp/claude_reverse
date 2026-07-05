package defpackage;

import com.anthropic.claude.api.model.Badge;
import com.anthropic.claude.api.model.ThinkingOption;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class gmh {
    public final <ID> KSerializer serializer(final KSerializer kSerializer) {
        kSerializer.getClass();
        return new w28() { // from class: fmh
            private final SerialDescriptor descriptor;

            {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.model.ThinkingOption", this, 5);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("name", false);
                pluginGeneratedSerialDescriptor.j("description", true);
                pluginGeneratedSerialDescriptor.j("recommended", true);
                pluginGeneratedSerialDescriptor.j("badge", true);
                this.descriptor = pluginGeneratedSerialDescriptor;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.w28
            public final KSerializer[] childSerializers() {
                kw9[] kw9VarArr = ThinkingOption.$childSerializers;
                return new KSerializer[]{kSerializer, kw9VarArr[1].getValue(), d4c.S((KSerializer) kw9VarArr[2].getValue()), zt1.a, d4c.S(oc1.a)};
            }

            @Override // defpackage.s06
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                ud4 ud4VarC = decoder.c(serialDescriptor);
                kw9[] kw9VarArr = ThinkingOption.$childSerializers;
                boolean z = true;
                int i = 0;
                boolean zU = false;
                Object objL = null;
                _ServerLocalizedString _serverlocalizedstring = null;
                _ServerLocalizedString _serverlocalizedstring2 = null;
                Badge badge = null;
                while (z) {
                    int iX = ud4VarC.x(serialDescriptor);
                    if (iX == -1) {
                        z = false;
                    } else if (iX == 0) {
                        objL = ud4VarC.l(serialDescriptor, 0, kSerializer, objL);
                        i |= 1;
                    } else if (iX == 1) {
                        _serverlocalizedstring = (_ServerLocalizedString) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), _serverlocalizedstring);
                        i |= 2;
                    } else if (iX == 2) {
                        _serverlocalizedstring2 = (_ServerLocalizedString) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), _serverlocalizedstring2);
                        i |= 4;
                    } else if (iX == 3) {
                        zU = ud4VarC.u(serialDescriptor, 3);
                        i |= 8;
                    } else {
                        if (iX != 4) {
                            sz6.e(iX);
                            return null;
                        }
                        badge = (Badge) ud4VarC.m(serialDescriptor, 4, oc1.a, badge);
                        i |= 16;
                    }
                }
                ud4VarC.b(serialDescriptor);
                return new ThinkingOption(i, objL, _serverlocalizedstring, _serverlocalizedstring2, zU, badge, (vnf) null);
            }

            @Override // defpackage.znf, defpackage.s06
            public final SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // defpackage.znf
            public final void serialize(Encoder encoder, Object obj) {
                ThinkingOption thinkingOption = (ThinkingOption) obj;
                encoder.getClass();
                thinkingOption.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                vd4 vd4VarC = encoder.c(serialDescriptor);
                ThinkingOption.write$Self$api(thinkingOption, vd4VarC, serialDescriptor, kSerializer);
                vd4VarC.b(serialDescriptor);
            }

            @Override // defpackage.w28
            public final KSerializer[] typeParametersSerializers() {
                return new KSerializer[]{kSerializer};
            }
        };
    }
}
