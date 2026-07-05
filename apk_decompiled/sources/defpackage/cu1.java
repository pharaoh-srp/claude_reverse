package defpackage;

import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.BootstrapResponse;
import com.anthropic.claude.api.account.GrowthBookSchema;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cu1 implements w28 {
    public static final cu1 a;
    private static final SerialDescriptor descriptor;

    static {
        cu1 cu1Var = new cu1();
        a = cu1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.BootstrapResponse", cu1Var, 2);
        pluginGeneratedSerialDescriptor.j("account", true);
        pluginGeneratedSerialDescriptor.j("growthbook", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(k7.a), d4c.S(sd8.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Account account = null;
        GrowthBookSchema growthBookSchema = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                account = (Account) ud4VarC.m(serialDescriptor, 0, k7.a, account);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                growthBookSchema = (GrowthBookSchema) ud4VarC.m(serialDescriptor, 1, sd8.a, growthBookSchema);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BootstrapResponse(i, account, growthBookSchema, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BootstrapResponse bootstrapResponse = (BootstrapResponse) obj;
        encoder.getClass();
        bootstrapResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BootstrapResponse.write$Self$api(bootstrapResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
