package defpackage;

import com.anthropic.claude.api.account.AccountDeletableResponse;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x7 implements w28 {
    public static final x7 a;
    private static final SerialDescriptor descriptor;

    static {
        x7 x7Var = new x7();
        a = x7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.AccountDeletableResponse", x7Var, 2);
        pluginGeneratedSerialDescriptor.j("deletable", false);
        pluginGeneratedSerialDescriptor.j("reasons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zt1.a, d4c.S((KSerializer) AccountDeletableResponse.$childSerializers[1].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AccountDeletableResponse.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                zU = ud4VarC.u(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AccountDeletableResponse(i, zU, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AccountDeletableResponse accountDeletableResponse = (AccountDeletableResponse) obj;
        encoder.getClass();
        accountDeletableResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AccountDeletableResponse.write$Self$api(accountDeletableResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
